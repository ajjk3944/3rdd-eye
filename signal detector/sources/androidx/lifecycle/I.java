package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes.dex */
public final class I implements InterfaceC0298u {
    public static final I i = new I();

    /* renamed from: a, reason: collision with root package name */
    public int f5186a;

    /* renamed from: b, reason: collision with root package name */
    public int f5187b;

    /* renamed from: e, reason: collision with root package name */
    public Handler f5190e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5188c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5189d = true;

    /* renamed from: f, reason: collision with root package name */
    public final C0300w f5191f = new C0300w(this);

    /* renamed from: g, reason: collision with root package name */
    public final A3.z f5192g = new A3.z(9, this);

    /* renamed from: h, reason: collision with root package name */
    public final A0.e f5193h = new A0.e(22, this);

    public final void a() {
        int i3 = this.f5187b + 1;
        this.f5187b = i3;
        if (i3 == 1) {
            if (this.f5188c) {
                this.f5191f.d(EnumC0291m.ON_RESUME);
                this.f5188c = false;
            } else {
                Handler handler = this.f5190e;
                q5.i.b(handler);
                handler.removeCallbacks(this.f5192g);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0298u
    public final C0300w j() {
        return this.f5191f;
    }
}
