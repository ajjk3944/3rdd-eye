package Q9;

import N7.C1154e9;
import O9.d;
import z9.C5870a;
import z9.C5871b;
import z9.EnumC5872c;

/* compiled from: BuiltInSerializers.kt */
/* loaded from: classes3.dex */
public final class A implements M9.b<C5870a> {

    /* renamed from: a, reason: collision with root package name */
    public static final A f11385a = new A();

    /* renamed from: b, reason: collision with root package name */
    public static final C1556t0 f11386b = new C1556t0("kotlin.time.Duration", d.i.f10501a);

    @Override // M9.b
    public final Object deserialize(P9.d dVar) {
        int i = C5870a.f48496e;
        String value = dVar.l();
        kotlin.jvm.internal.l.f(value, "value");
        try {
            return new C5870a(k8.F.a(value));
        } catch (IllegalArgumentException e4) {
            throw new IllegalArgumentException(C1154e9.i("Invalid ISO duration string format: '", value, "'."), e4);
        }
    }

    @Override // M9.b
    public final O9.e getDescriptor() {
        return f11386b;
    }

    @Override // M9.b
    public final void serialize(P9.e eVar, Object obj) {
        long j4;
        long j10;
        int iG;
        long j11 = ((C5870a) obj).f48497b;
        int i = C5870a.f48496e;
        StringBuilder sb = new StringBuilder();
        if (j11 < 0) {
            sb.append('-');
        }
        sb.append("PT");
        boolean z10 = true;
        if (j11 < 0) {
            j4 = ((-(j11 >> 1)) << 1) + (((int) j11) & 1);
            int i10 = C5871b.f48498a;
        } else {
            j4 = j11;
        }
        long jG = C5870a.g(j4, EnumC5872c.HOURS);
        if (C5870a.d(j4)) {
            j10 = 0;
            iG = 0;
        } else {
            j10 = 0;
            iG = (int) (C5870a.g(j4, EnumC5872c.MINUTES) % 60);
        }
        int iG2 = C5870a.d(j4) ? 0 : (int) (C5870a.g(j4, EnumC5872c.SECONDS) % 60);
        int iC = C5870a.c(j4);
        if (C5870a.d(j11)) {
            jG = 9999999999999L;
        }
        boolean z11 = jG != j10;
        boolean z12 = (iG2 == 0 && iC == 0) ? false : true;
        if (iG == 0 && (!z12 || !z11)) {
            z10 = false;
        }
        if (z11) {
            sb.append(jG);
            sb.append('H');
        }
        if (z10) {
            sb.append(iG);
            sb.append('M');
        }
        if (z12 || (!z11 && !z10)) {
            C5870a.b(sb, iG2, iC, 9, "S", true);
        }
        eVar.G(sb.toString());
    }
}
