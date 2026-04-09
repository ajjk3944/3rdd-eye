package Y0;

import l0.AbstractC6538n;
import l0.C6537m;
import org.snmp4j.mp.MPv3;

/* loaded from: classes.dex */
public interface d extends l {
    default long F0(float f10) {
        return e0(N0(f10));
    }

    default long K1(long j10) {
        return j10 != 9205357640488583168L ? AbstractC6538n.a(d1(k.h(j10)), d1(k.g(j10))) : C6537m.f52356b.a();
    }

    default float N0(float f10) {
        return h.j(f10 / getDensity());
    }

    default float N1(long j10) {
        if (x.g(v.g(j10), x.f24553b.b())) {
            return d1(n0(j10));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    default float d1(float f10) {
        return f10 * getDensity();
    }

    default long f0(long j10) {
        return j10 != 9205357640488583168L ? i.b(N0(C6537m.i(j10)), N0(C6537m.g(j10))) : k.f24532b.a();
    }

    float getDensity();

    default float x(int i10) {
        return h.j(i10 / getDensity());
    }

    default int x1(float f10) {
        float fD1 = d1(f10);
        return Float.isInfinite(fD1) ? MPv3.MAX_MESSAGE_ID : Math.round(fD1);
    }
}
