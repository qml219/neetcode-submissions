class Solution:
    def encode(self, strs: List[str]) -> str:
        if not strs:
            return ""
        size_list = []
        encoded_s = ""
        for s in strs:
            size_list.append(str(len(s)))
            encoded_s += s 
        encoded_size = ",".join(size_list)
        return f'{encoded_size},#{encoded_s}'

    def decode(self, s: str) -> List[str]:
        if not s:
            return []

        curr, size = 0, []

        while s[curr] != "#":
            curr_size = ""

            while s[curr] != ",":
                curr_size += s[curr]
                curr += 1
               
            size.append(int(curr_size))
            curr += 1

        curr += 1
        res = []
        for sz in size:
            res.append(s[curr:curr+sz])
            curr += sz
        return res
