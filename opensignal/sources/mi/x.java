package mi;

import com.google.android.gms.internal.measurement.y3;
import h9.r2;
import java.util.HashMap;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final r2 f16822a;

    public x(r2 r2Var) {
        this.f16822a = r2Var;
    }

    public final w a(int i10, long j) {
        Integer num;
        lq.l lVar;
        hr.d dVarT = vc.e.T(0, i10);
        fr.a aVar = fr.d.f9050a;
        br.l.e(dVarT, "<this>");
        try {
            int iG = y3.G(dVarT);
            r2 r2Var = this.f16822a;
            synchronized (((HashMap) r2Var.f10475y)) {
                num = (Integer) ((HashMap) r2Var.f10475y).get(Long.valueOf(j));
            }
            if (num == null) {
                ch.n.b("UdpConfigSelector", "Selecting a random udp config...");
                lVar = new lq.l(Integer.valueOf(iG), null);
            } else {
                ch.n.b("UdpConfigSelector", "Will use stored udp config...");
                lVar = new lq.l(num, this.f16822a.l0(j));
            }
            int iIntValue = ((Number) lVar.f15571a).intValue();
            String str = (String) lVar.f15572d;
            r2 r2Var2 = this.f16822a;
            synchronized (((HashMap) r2Var2.f10475y)) {
                ((HashMap) r2Var2.f10475y).put(Long.valueOf(j), Integer.valueOf(iIntValue));
            }
            return new w(iIntValue, str);
        } catch (IllegalArgumentException e4) {
            throw new NoSuchElementException(e4.getMessage());
        }
    }
}
