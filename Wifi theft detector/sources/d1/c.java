package d1;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c {

    /* renamed from: j, reason: collision with root package name */
    public static final ThreadLocal f20603j = new ThreadLocal();

    /* renamed from: e, reason: collision with root package name */
    public j f20608e;

    /* renamed from: i, reason: collision with root package name */
    public e f20612i;

    /* renamed from: a, reason: collision with root package name */
    public final r.k f20604a = new r.k();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f20605b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final b f20606c = new b();

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f20607d = new Runnable() { // from class: d1.b
        @Override // java.lang.Runnable
        public final void run() {
            this.f20602a.f20606c.a();
        }
    };

    /* renamed from: f, reason: collision with root package name */
    public long f20609f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f20610g = false;

    /* renamed from: h, reason: collision with root package name */
    public float f20611h = 1.0f;

    public class b {
        public b() {
        }

        public void a() {
            c.this.f20609f = SystemClock.uptimeMillis();
            c cVar = c.this;
            cVar.f(cVar.f20609f);
            if (c.this.f20605b.size() > 0) {
                c.this.f20608e.a(c.this.f20607d);
            }
        }
    }

    /* renamed from: d1.c$c, reason: collision with other inner class name */
    public interface InterfaceC0382c {
        boolean a(long j10);
    }

    public class d implements e {

        /* renamed from: a, reason: collision with root package name */
        public ValueAnimator.DurationScaleChangeListener f20614a;

        public d() {
        }

        @Override // d1.c.e
        public boolean a() {
            if (this.f20614a != null) {
                return true;
            }
            ValueAnimator.DurationScaleChangeListener durationScaleChangeListener = new ValueAnimator.DurationScaleChangeListener() { // from class: d1.f
                @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                public final void onChanged(float f10) {
                    c.this.f20611h = f10;
                }
            };
            this.f20614a = durationScaleChangeListener;
            return ValueAnimator.registerDurationScaleChangeListener(durationScaleChangeListener);
        }

        @Override // d1.c.e
        public boolean b() {
            boolean zUnregisterDurationScaleChangeListener = ValueAnimator.unregisterDurationScaleChangeListener(this.f20614a);
            this.f20614a = null;
            return zUnregisterDurationScaleChangeListener;
        }
    }

    public interface e {
        boolean a();

        boolean b();
    }

    public static final class f implements j {

        /* renamed from: a, reason: collision with root package name */
        public final Choreographer f20616a = Choreographer.getInstance();

        /* renamed from: b, reason: collision with root package name */
        public final Looper f20617b = Looper.myLooper();

        @Override // d1.j
        public void a(final Runnable runnable) {
            this.f20616a.postFrameCallback(new Choreographer.FrameCallback() { // from class: d1.g
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j10) {
                    runnable.run();
                }
            });
        }

        @Override // d1.j
        public boolean b() {
            return Thread.currentThread() == this.f20617b.getThread();
        }
    }

    public c(j jVar) {
        this.f20608e = jVar;
    }

    public static c h() {
        ThreadLocal threadLocal = f20603j;
        if (threadLocal.get() == null) {
            threadLocal.set(new c(new f()));
        }
        return (c) threadLocal.get();
    }

    public void d(InterfaceC0382c interfaceC0382c, long j10) {
        if (this.f20605b.size() == 0) {
            this.f20608e.a(this.f20607d);
            if (Build.VERSION.SDK_INT >= 33) {
                this.f20611h = ValueAnimator.getDurationScale();
                if (this.f20612i == null) {
                    this.f20612i = new d();
                }
                this.f20612i.a();
            }
        }
        if (!this.f20605b.contains(interfaceC0382c)) {
            this.f20605b.add(interfaceC0382c);
        }
        if (j10 > 0) {
            this.f20604a.put(interfaceC0382c, Long.valueOf(SystemClock.uptimeMillis() + j10));
        }
    }

    public final void e() {
        if (this.f20610g) {
            for (int size = this.f20605b.size() - 1; size >= 0; size--) {
                if (this.f20605b.get(size) == null) {
                    this.f20605b.remove(size);
                }
            }
            if (this.f20605b.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                this.f20612i.b();
            }
            this.f20610g = false;
        }
    }

    public void f(long j10) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i10 = 0; i10 < this.f20605b.size(); i10++) {
            InterfaceC0382c interfaceC0382c = (InterfaceC0382c) this.f20605b.get(i10);
            if (interfaceC0382c != null && i(interfaceC0382c, jUptimeMillis)) {
                interfaceC0382c.a(j10);
            }
        }
        e();
    }

    public float g() {
        return this.f20611h;
    }

    public final boolean i(InterfaceC0382c interfaceC0382c, long j10) {
        Long l10 = (Long) this.f20604a.get(interfaceC0382c);
        if (l10 == null) {
            return true;
        }
        if (l10.longValue() >= j10) {
            return false;
        }
        this.f20604a.remove(interfaceC0382c);
        return true;
    }

    public boolean j() {
        return this.f20608e.b();
    }

    public void k(InterfaceC0382c interfaceC0382c) {
        this.f20604a.remove(interfaceC0382c);
        int iIndexOf = this.f20605b.indexOf(interfaceC0382c);
        if (iIndexOf >= 0) {
            this.f20605b.set(iIndexOf, null);
            this.f20610g = true;
        }
    }
}
