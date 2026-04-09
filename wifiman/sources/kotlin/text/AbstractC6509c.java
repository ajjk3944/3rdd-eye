package kotlin.text;

/* renamed from: kotlin.text.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC6509c extends AbstractC6508b {
    public static final boolean f(char c10, char c11, boolean z10) {
        if (c10 == c11) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}
