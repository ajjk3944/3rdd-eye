package g4;

import com.google.android.gms.internal.ads.AbstractC1135f5;
import java.io.IOException;
import o4.C2762a;
import o4.C2765d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final t f20245a;

    /* renamed from: b, reason: collision with root package name */
    public static final u f20246b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ x[] f20247c;

    static {
        t tVar = new t();
        f20245a = tVar;
        u uVar = new u();
        f20246b = uVar;
        f20247c = new x[]{tVar, uVar, new x() { // from class: g4.v
            public static Double b(String str, C2762a c2762a) throws C2765d, NumberFormatException {
                try {
                    Double dValueOf = Double.valueOf(str);
                    if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                        if (c2762a.f22701C != 1) {
                            throw new C2765d("JSON forbids NaN and infinities: " + dValueOf + "; at path " + c2762a.n(true));
                        }
                    }
                    return dValueOf;
                } catch (NumberFormatException e6) {
                    StringBuilder sbQ = AbstractC1135f5.q("Cannot parse ", str, "; at path ");
                    sbQ.append(c2762a.n(true));
                    throw new J0.c(sbQ.toString(), e6);
                }
            }

            @Override // g4.x
            public final Number a(C2762a c2762a) throws IOException {
                String strZ = c2762a.z();
                if (strZ.indexOf(46) >= 0) {
                    return b(strZ, c2762a);
                }
                try {
                    return Long.valueOf(Long.parseLong(strZ));
                } catch (NumberFormatException unused) {
                    return b(strZ, c2762a);
                }
            }
        }, new x() { // from class: g4.w
            @Override // g4.x
            public final Number a(C2762a c2762a) throws IOException {
                String strZ = c2762a.z();
                try {
                    return i4.i.i(strZ);
                } catch (NumberFormatException e6) {
                    StringBuilder sbQ = AbstractC1135f5.q("Cannot parse ", strZ, "; at path ");
                    sbQ.append(c2762a.n(true));
                    throw new J0.c(sbQ.toString(), e6);
                }
            }
        }};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f20247c.clone();
    }

    public abstract Number a(C2762a c2762a);
}
