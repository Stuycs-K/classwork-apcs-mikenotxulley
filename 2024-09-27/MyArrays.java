public static String AryToString (int[] nums) {
  String writeArr = "["
  for (int i = 0; i < nums.length; i++)
  { writeArr = writeArr + nums[i];
    if (i != nums.length -1) writeArr = writeArr + ", "; }
  return writeArr + "]";
}
