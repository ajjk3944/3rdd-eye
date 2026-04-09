package b8;

/* loaded from: classes3.dex */
public abstract class b {
    public static String a(String str) {
        String[] strArrSplit = str.split("[.]");
        String str2 = "";
        for (int length = strArrSplit.length - 1; length >= 0; length--) {
            str2 = length == 0 ? str2 + strArrSplit[length] : str2 + strArrSplit[length] + ".";
        }
        return str2;
    }
}
