package s2;

import androidx.camera.core.impl.C0;
import com.singular.sdk.internal.SingularParamsBase;
import i2.C4448h;
import java.io.IOException;
import java.util.ArrayList;
import l2.C5276i;
import o2.C5411b;
import o2.C5415f;
import o2.InterfaceC5418i;
import t2.AbstractC5601b;
import u2.C5629h;
import v2.C5673a;

/* compiled from: AnimatablePathValueParser.java */
/* renamed from: s2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5555a {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC5601b.a f45969a = AbstractC5601b.a.a(SingularParamsBase.Constants.IDENTIFIER_KEYSPACE_KEY, "x", "y");

    public static C0 a(t2.c cVar, C4448h c4448h) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (cVar.F() == AbstractC5601b.EnumC0535b.BEGIN_ARRAY) {
            cVar.a();
            while (cVar.l()) {
                t2.c cVar2 = cVar;
                C4448h c4448h2 = c4448h;
                arrayList.add(new C5276i(c4448h2, s.b(cVar2, c4448h2, C5629h.c(), x.f46015a, cVar.F() == AbstractC5601b.EnumC0535b.BEGIN_OBJECT, false)));
                cVar = cVar2;
                c4448h = c4448h2;
            }
            cVar.d();
            t.b(arrayList);
        } else {
            arrayList.add(new C5673a(r.b(cVar, C5629h.c())));
        }
        return new C0(arrayList);
    }

    public static InterfaceC5418i b(t2.c cVar, C4448h c4448h) throws IOException {
        cVar.c();
        C0 c0A = null;
        C5411b c5411bB = null;
        boolean z10 = false;
        C5411b c5411bB2 = null;
        while (cVar.F() != AbstractC5601b.EnumC0535b.END_OBJECT) {
            int iK0 = cVar.k0(f45969a);
            if (iK0 == 0) {
                c0A = a(cVar, c4448h);
            } else if (iK0 != 1) {
                if (iK0 != 2) {
                    cVar.m0();
                    cVar.p0();
                } else if (cVar.F() == AbstractC5601b.EnumC0535b.STRING) {
                    cVar.p0();
                    z10 = true;
                } else {
                    c5411bB = C5558d.b(cVar, c4448h, true);
                }
            } else if (cVar.F() == AbstractC5601b.EnumC0535b.STRING) {
                cVar.p0();
                z10 = true;
            } else {
                c5411bB2 = C5558d.b(cVar, c4448h, true);
            }
        }
        cVar.e();
        if (z10) {
            c4448h.a("Lottie doesn't support expressions.");
        }
        return c0A != null ? c0A : new C5415f(c5411bB2, c5411bB);
    }
}
