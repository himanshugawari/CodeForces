# CodeForces PROBLEMSET JAVA IMPLEMENTATIONS

Java solutions for Codefores Problemset

Solutions

REDING USING BUFFEREDREADER
/_
int[] num;
String[] strNums = bi.readLine().split("\\s");
for(int i=0; i<strNums.length; i++) {
num[i] = Integer.parseInt(strNums[i]);
}
_/

/_
int[] array = Arrays.stream(reader.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
_/
