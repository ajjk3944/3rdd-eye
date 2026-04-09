package L8;

import L0.C3174d;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import android.content.Context;
import com.ui.wifiman.model.vendor.d;
import kotlin.jvm.internal.AbstractC6492s;
import mh.q;
import s9.d;
import vf.C8224d;

/* loaded from: classes3.dex */
public abstract class k {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11267a;

        static {
            int[] iArr = new int[d.EnumC1510d.values().length];
            try {
                iArr[d.EnumC1510d.UBIQUITI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f11267a = iArr;
        }
    }

    static final class b implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.vendor.d f11268a;

        b(com.ui.wifiman.model.vendor.d dVar) {
            this.f11268a = dVar;
        }

        public final CharSequence a(Context it, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(it, "it");
            interfaceC3540l.U(-1571118138);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1571118138, i10, -1, "com.ubnt.usurvey.ui.util.clickableText.<anonymous> (VendorExtensions.kt:12)");
            }
            C8224d c8224d = C8224d.f63596a;
            C3174d c3174d = new C3174d(((d.c) this.f11268a).getName(), null, null, 6, null);
            long jA = c8224d.a(interfaceC3540l, C8224d.f63597b);
            String strA = ((d.c) this.f11268a).a();
            AbstractC6492s.f(strA);
            C3174d c3174dB = c8224d.b(c3174d, jA, strA);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return c3174dB;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    public static final s9.d a(com.ui.wifiman.model.vendor.d dVar) {
        AbstractC6492s.i(dVar, "<this>");
        if (!(dVar instanceof d.c)) {
            return new d.c(dVar.getName());
        }
        d.c cVar = (d.c) dVar;
        if (a.f11267a[cVar.c().ordinal()] != 1) {
            return new d.c(cVar.getName());
        }
        return new d.a(cVar.getName() + cVar.a(), new b(dVar));
    }
}
