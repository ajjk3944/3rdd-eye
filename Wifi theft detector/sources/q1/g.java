package q1;

import androidx.room.RoomDatabase;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f24001a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final RoomDatabase f24002b;

    /* renamed from: c, reason: collision with root package name */
    public volatile u1.f f24003c;

    public g(RoomDatabase roomDatabase) {
        this.f24002b = roomDatabase;
    }

    public u1.f a() {
        b();
        return e(this.f24001a.compareAndSet(false, true));
    }

    public void b() {
        this.f24002b.a();
    }

    public final u1.f c() {
        return this.f24002b.d(d());
    }

    public abstract String d();

    public final u1.f e(boolean z10) {
        if (!z10) {
            return c();
        }
        if (this.f24003c == null) {
            this.f24003c = c();
        }
        return this.f24003c;
    }

    public void f(u1.f fVar) {
        if (fVar == this.f24003c) {
            this.f24001a.set(false);
        }
    }
}
