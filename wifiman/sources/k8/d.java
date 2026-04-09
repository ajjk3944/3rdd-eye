package K8;

import Fd.B;
import L8.j;
import Md.g;
import com.ubnt.usurvey.R;
import com.ubnt.usurvey.product.m;
import com.ubnt.usurvey.product.o;
import com.ui.wifiman.model.teleport.h;
import com.ui.wifiman.ui.teleport.z;
import java.net.URI;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import s9.InterfaceC7929a;
import s9.b;
import s9.c;
import xa.InterfaceC8439a;

/* loaded from: classes3.dex */
public interface d {

    public static final class a {
        public static z a(d dVar, B b10) {
            int i10 = b10 == null ? -1 : b.f10469a[b10.ordinal()];
            if (i10 == -1) {
                return z.LOADING;
            }
            if (i10 == 1) {
                return z.OFFLINE;
            }
            if (i10 == 2) {
                return z.ONLINE;
            }
            if (i10 == 3) {
                return z.UNSTABLE;
            }
            throw new NoWhenBranchMatchedException();
        }

        public static InterfaceC7929a b(d dVar, h receiver) {
            URI uriA;
            AbstractC6492s.i(receiver, "$receiver");
            InterfaceC8439a.d dVarN = receiver.n();
            m mVarB = dVarN != null ? o.b(dVarN, m.c.NORMAL) : null;
            if (mVarB != null) {
                if (mVarB instanceof m.a) {
                    return new c.a(((m.a) mVarB).a(), null, 2, null);
                }
                if (mVarB instanceof m.b) {
                    return new c.b(((m.b) mVarB).a(), new b.a(R.drawable.ic_ubiquiti_u_128, null, null, 6, null), null, null, 12, null);
                }
                throw new NoWhenBranchMatchedException();
            }
            if (receiver.p() == null || receiver.r() == null) {
                return new b.a(R.drawable.ic_ubiquiti_u_128, null, null, 6, null);
            }
            g.a aVar = g.f13109a;
            String strP = receiver.p();
            AbstractC6492s.f(strP);
            Integer numR = receiver.r();
            AbstractC6492s.f(numR);
            String strB = g.a.b(aVar, strP, numR.intValue(), null, 4, null);
            return (strB == null || (uriA = j.f11266a.a(strB)) == null) ? new b.a(R.drawable.ic_ubiquiti_u_128, null, null, 6, null) : new c.b(uriA, new b.a(R.drawable.ic_ubiquiti_u_128, null, null, 6, null), null, null, 12, null);
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10469a;

        static {
            int[] iArr = new int[B.values().length];
            try {
                iArr[B.UNREACHABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[B.REACHABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[B.UNSTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f10469a = iArr;
        }
    }
}
