package s3;

import android.util.Log;

/* loaded from: classes.dex */
public abstract class Y {

    /* renamed from: a, reason: collision with root package name */
    private Object f61201a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f61202b = false;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC7888c f61203c;

    public Y(AbstractC7888c abstractC7888c, Object obj) {
        this.f61203c = abstractC7888c;
        this.f61201a = obj;
    }

    protected abstract void a(Object obj);

    protected abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.f61201a;
                if (this.f61202b) {
                    Log.w("GmsClient", "Callback proxy " + toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (obj != null) {
            a(obj);
        }
        synchronized (this) {
            this.f61202b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.f61201a = null;
        }
    }

    public final void e() {
        d();
        synchronized (this.f61203c.f61232r) {
            this.f61203c.f61232r.remove(this);
        }
    }
}
