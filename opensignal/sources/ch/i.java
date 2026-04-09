package ch;

import android.content.Context;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3946a;

    /* renamed from: b, reason: collision with root package name */
    public String f3947b;

    /* renamed from: c, reason: collision with root package name */
    public long f3948c;

    /* renamed from: d, reason: collision with root package name */
    public int f3949d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3950e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3951f;

    /* renamed from: g, reason: collision with root package name */
    public long f3952g;

    /* renamed from: h, reason: collision with root package name */
    public final String f3953h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f3954i;

    public i(Context context, f fVar) {
        this.f3946a = context;
        String packageName = context.getPackageName();
        br.l.d(packageName, "getPackageName(...)");
        this.f3947b = packageName;
        this.f3948c = i3.g.p(context);
        this.f3949d = i3.g.u(context);
        this.f3950e = b() >= 29;
        this.f3951f = b() >= 31;
        b();
        this.f3952g = -1L;
        this.f3953h = lq.g.f15565x.toString();
        this.f3954i = fVar.b() ? Integer.valueOf(context.getApplicationInfo().minSdkVersion) : null;
    }

    public final long a() {
        if (this.f3948c == -1) {
            this.f3948c = i3.g.p(this.f3946a);
        }
        return this.f3948c;
    }

    public final int b() {
        if (this.f3949d == -1) {
            this.f3949d = i3.g.u(this.f3946a);
        }
        return this.f3949d;
    }
}
