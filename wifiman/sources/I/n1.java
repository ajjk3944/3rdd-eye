package I;

/* loaded from: classes.dex */
public abstract class n1 {
    public static final void a(CharSequence charSequence, char[] cArr, int i10, int i11, int i12) {
        if (charSequence instanceof H.h) {
            ((H.h) charSequence).i(cArr, i10, i11, i12);
            return;
        }
        while (i11 < i12) {
            cArr[i10] = charSequence.charAt(i11);
            i11++;
            i10++;
        }
    }
}
