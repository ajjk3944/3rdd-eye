package F;

import L0.C3174d;

/* renamed from: F.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2730u {
    public static final void a(C3174d.a aVar, String str, String str2) {
        if (str2.length() <= 0) {
            throw new IllegalArgumentException("alternateText can't be an empty string.");
        }
        aVar.m("androidx.compose.foundation.text.inlineContent", str);
        aVar.i(str2);
        aVar.k();
    }

    public static /* synthetic */ void b(C3174d.a aVar, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = "�";
        }
        a(aVar, str, str2);
    }
}
