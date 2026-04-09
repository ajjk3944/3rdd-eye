package M2;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f2810a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2811b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0165e f2812c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2813d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f2814e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC0165e f2815f;

    public s(AbstractC0165e abstractC0165e, int i, Bundle bundle) {
        this.f2815f = abstractC0165e;
        Boolean bool = Boolean.TRUE;
        this.f2812c = abstractC0165e;
        this.f2810a = bool;
        this.f2811b = false;
        this.f2813d = i;
        this.f2814e = bundle;
    }

    public abstract boolean a();

    public abstract void b(J2.b bVar);

    public final void c() {
        d();
        AbstractC0165e abstractC0165e = this.f2812c;
        synchronized (abstractC0165e.f2743l) {
            abstractC0165e.f2743l.remove(this);
        }
    }

    public final void d() {
        synchronized (this) {
            this.f2810a = null;
        }
    }
}
