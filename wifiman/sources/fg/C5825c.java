package fg;

import android.os.Handler;
import android.os.Message;
import gg.y;
import hg.InterfaceC6043c;
import java.util.concurrent.TimeUnit;

/* renamed from: fg.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C5825c extends y {

    /* renamed from: c, reason: collision with root package name */
    private final Handler f47343c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f47344d;

    /* renamed from: fg.c$a */
    private static final class a extends y.c {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f47345a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f47346b;

        /* renamed from: c, reason: collision with root package name */
        private volatile boolean f47347c;

        a(Handler handler, boolean z10) {
            this.f47345a = handler;
            this.f47346b = z10;
        }

        @Override // gg.y.c
        public InterfaceC6043c c(Runnable runnable, long j10, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            }
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            if (this.f47347c) {
                return InterfaceC6043c.n();
            }
            b bVar = new b(this.f47345a, Eg.a.x(runnable));
            Message messageObtain = Message.obtain(this.f47345a, bVar);
            messageObtain.obj = this;
            if (this.f47346b) {
                messageObtain.setAsynchronous(true);
            }
            this.f47345a.sendMessageDelayed(messageObtain, timeUnit.toMillis(j10));
            if (!this.f47347c) {
                return bVar;
            }
            this.f47345a.removeCallbacks(bVar);
            return InterfaceC6043c.n();
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f47347c = true;
            this.f47345a.removeCallbacksAndMessages(this);
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f47347c;
        }
    }

    /* renamed from: fg.c$b */
    private static final class b implements Runnable, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f47348a;

        /* renamed from: b, reason: collision with root package name */
        private final Runnable f47349b;

        /* renamed from: c, reason: collision with root package name */
        private volatile boolean f47350c;

        b(Handler handler, Runnable runnable) {
            this.f47348a = handler;
            this.f47349b = runnable;
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f47348a.removeCallbacks(this);
            this.f47350c = true;
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f47350c;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f47349b.run();
            } catch (Throwable th2) {
                Eg.a.v(th2);
            }
        }
    }

    C5825c(Handler handler, boolean z10) {
        this.f47343c = handler;
        this.f47344d = z10;
    }

    @Override // gg.y
    public y.c c() {
        return new a(this.f47343c, this.f47344d);
    }

    @Override // gg.y
    public InterfaceC6043c f(Runnable runnable, long j10, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        b bVar = new b(this.f47343c, Eg.a.x(runnable));
        Message messageObtain = Message.obtain(this.f47343c, bVar);
        if (this.f47344d) {
            messageObtain.setAsynchronous(true);
        }
        this.f47343c.sendMessageDelayed(messageObtain, timeUnit.toMillis(j10));
        return bVar;
    }
}
