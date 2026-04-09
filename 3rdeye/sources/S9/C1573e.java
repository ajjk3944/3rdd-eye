package S9;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* compiled from: TreeJsonEncoder.kt */
/* renamed from: S9.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1573e extends P9.a {

    /* renamed from: a, reason: collision with root package name */
    public final T9.a f12080a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC1571c f12081b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f12082c;

    public C1573e(AbstractC1571c abstractC1571c, String str) {
        this.f12081b = abstractC1571c;
        this.f12082c = str;
        this.f12080a = abstractC1571c.f12072b.f11782b;
    }

    @Override // P9.a, P9.e
    public final void C(int i) {
        J(Long.toString(i & 4294967295L, 10));
    }

    @Override // P9.a, P9.e
    public final void D(long j4) {
        String str;
        if (j4 == 0) {
            str = CommonUrlParts.Values.FALSE_INTEGER;
        } else if (j4 > 0) {
            str = Long.toString(j4, 10);
        } else {
            char[] cArr = new char[64];
            long j10 = (j4 >>> 1) / 5;
            long j11 = 10;
            int i = 63;
            cArr[63] = Character.forDigit((int) (j4 - (j10 * j11)), 10);
            while (j10 > 0) {
                i--;
                cArr[i] = Character.forDigit((int) (j10 % j11), 10);
                j10 /= j11;
            }
            str = new String(cArr, i, 64 - i);
        }
        J(str);
    }

    public final void J(String s10) {
        kotlin.jvm.internal.l.f(s10, "s");
        this.f12081b.X(new R9.u(s10, false, null), this.f12082c);
    }

    @Override // P9.e
    public final I9.g a() {
        return this.f12080a;
    }

    @Override // P9.a, P9.e
    public final void h(short s10) {
        J(String.valueOf(s10 & 65535));
    }

    @Override // P9.a, P9.e
    public final void j(byte b10) {
        J(String.valueOf(b10 & 255));
    }
}
