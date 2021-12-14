class Leetcode58 {
    fun lengthOfLastWord(s: String): Int {
        var lst:List<String> = s.split(" ");

        lst = lst.filter { it != "" };

        return lst.get(lst.lastIndex).length;
    }
}