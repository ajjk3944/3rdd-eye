package I;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: I.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2950p {
    public static final CharSequence a(H.h hVar, InterfaceC2948o interfaceC2948o, S0 s02) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        while (i10 < hVar.length()) {
            int iB = AbstractC2946n.b(hVar, i10);
            int iA = interfaceC2948o.a(i11, iB);
            int iA2 = AbstractC2946n.a(iB);
            if (iA != iB) {
                s02.e(sb2.length(), sb2.length() + iA2, AbstractC2946n.a(iA));
                z10 = true;
            }
            F.O.a(sb2, iA);
            i10 += iA2;
            i11++;
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
        return z10 ? string : hVar;
    }
}
