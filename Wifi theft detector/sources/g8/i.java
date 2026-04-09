package g8;

/* loaded from: classes3.dex */
public abstract class i {
    public static String a(long j10) {
        String str = "";
        for (int i10 = 0; i10 < 4; i10++) {
            str = str + ((j10 >> (i10 * 8)) & 255) + ".";
        }
        return str.substring(0, str.length() - 1);
    }
}
