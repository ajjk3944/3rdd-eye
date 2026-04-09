package yg;

/* renamed from: yg.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8668c extends AbstractC8666a {

    /* renamed from: a, reason: collision with root package name */
    protected final Dj.b f66766a;

    /* renamed from: b, reason: collision with root package name */
    protected Object f66767b;

    public AbstractC8668c(Dj.b bVar) {
        this.f66766a = bVar;
    }

    public void cancel() {
        set(4);
        this.f66767b = null;
    }

    @Override // Dg.g
    public final void clear() {
        lazySet(32);
        this.f66767b = null;
    }

    public final void d(Object obj) {
        int i10 = get();
        while (i10 != 8) {
            if ((i10 & (-3)) != 0) {
                return;
            }
            if (i10 == 2) {
                lazySet(3);
                Dj.b bVar = this.f66766a;
                bVar.h(obj);
                if (get() != 4) {
                    bVar.a();
                    return;
                }
                return;
            }
            this.f66767b = obj;
            if (compareAndSet(0, 1)) {
                return;
            }
            i10 = get();
            if (i10 == 4) {
                this.f66767b = null;
                return;
            }
        }
        this.f66767b = obj;
        lazySet(16);
        Dj.b bVar2 = this.f66766a;
        bVar2.h(null);
        if (get() != 4) {
            bVar2.a();
        }
    }

    @Override // Dg.g
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // Dg.g
    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        Object obj = this.f66767b;
        this.f66767b = null;
        return obj;
    }

    @Override // Dj.c
    public final void request(long j10) {
        Object obj;
        if (EnumC8672g.validate(j10)) {
            do {
                int i10 = get();
                if ((i10 & (-2)) != 0) {
                    return;
                }
                if (i10 == 1) {
                    if (!compareAndSet(1, 3) || (obj = this.f66767b) == null) {
                        return;
                    }
                    this.f66767b = null;
                    Dj.b bVar = this.f66766a;
                    bVar.h(obj);
                    if (get() != 4) {
                        bVar.a();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    @Override // Dg.c
    public final int requestFusion(int i10) {
        if ((i10 & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }
}
