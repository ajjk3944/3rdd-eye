package m1;

import n0.b2;
import n0.x0;

/* loaded from: classes.dex */
public final class c0 extends a0 {

    /* renamed from: b, reason: collision with root package name */
    public final b f16147b;

    /* renamed from: c, reason: collision with root package name */
    public String f16148c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16149d;

    /* renamed from: e, reason: collision with root package name */
    public final io.sentry.android.core.internal.util.g f16150e;

    /* renamed from: f, reason: collision with root package name */
    public br.n f16151f;

    /* renamed from: g, reason: collision with root package name */
    public final x0 f16152g;

    /* renamed from: h, reason: collision with root package name */
    public g1.m f16153h;

    /* renamed from: i, reason: collision with root package name */
    public final x0 f16154i;
    public long j;
    public float k;

    /* renamed from: l, reason: collision with root package name */
    public float f16155l;

    /* renamed from: m, reason: collision with root package name */
    public final b0 f16156m;

    public c0(b bVar) {
        this.f16147b = bVar;
        bVar.f16127i = new b0(this, 0);
        this.f16148c = "";
        this.f16149d = true;
        this.f16150e = new io.sentry.android.core.internal.util.g();
        this.f16151f = e.f16170r;
        this.f16152g = androidx.compose.runtime.c.f(null);
        this.f16154i = androidx.compose.runtime.c.f(new f1.e(0L));
        this.j = 9205357640488583168L;
        this.k = 1.0f;
        this.f16155l = 1.0f;
        this.f16156m = new b0(this, 1);
    }

    @Override // m1.a0
    public final void a(i1.d dVar) {
        e(dVar, 1.0f, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(i1.d r30, float r31, g1.m r32) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.c0.e(i1.d, float, g1.m):void");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Params: \tname: ");
        sb2.append(this.f16148c);
        sb2.append("\n\tviewportWidth: ");
        x0 x0Var = this.f16154i;
        sb2.append(Float.intBitsToFloat((int) (((f1.e) ((b2) x0Var).getValue()).f8416a >> 32)));
        sb2.append("\n\tviewportHeight: ");
        sb2.append(Float.intBitsToFloat((int) (((f1.e) ((b2) x0Var).getValue()).f8416a & 4294967295L)));
        sb2.append("\n");
        String string = sb2.toString();
        br.l.d(string, "toString(...)");
        return string;
    }
}
