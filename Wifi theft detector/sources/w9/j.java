package w9;

import kotlinx.coroutines.l0;

/* loaded from: classes4.dex */
public final class j extends g {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f24854c;

    public j(Runnable runnable, long j10, h hVar) {
        super(j10, hVar);
        this.f24854c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f24854c.run();
        } finally {
            this.f24852b.a();
        }
    }

    public String toString() {
        return "Task[" + l0.a(this.f24854c) + '@' + l0.b(this.f24854c) + ", " + this.f24851a + ", " + this.f24852b + ']';
    }
}
