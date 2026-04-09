package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class b62 extends e6 {
    public final Object c = new Object();
    public boolean d = false;
    public int e = 0;

    public final x52 w() {
        x52 x52Var = new x52(this);
        gi2.G("createNewReference: Trying to acquire lock");
        synchronized (this.c) {
            gi2.G("createNewReference: Lock acquired");
            t(new kf3(this, x52Var), new of3(this, x52Var));
            int i = this.e;
            if (i < 0) {
                throw new IllegalStateException();
            }
            this.e = i + 1;
        }
        gi2.G("createNewReference: Lock released");
        return x52Var;
    }

    public final void x() {
        gi2.G("releaseOneReference: Trying to acquire lock");
        synchronized (this.c) {
            gi2.G("releaseOneReference: Lock acquired");
            if (this.e <= 0) {
                throw new IllegalStateException();
            }
            gi2.G("Releasing 1 reference for JS Engine");
            this.e--;
            z();
        }
        gi2.G("releaseOneReference: Lock released");
    }

    public final void y() {
        gi2.G("markAsDestroyable: Trying to acquire lock");
        synchronized (this.c) {
            gi2.G("markAsDestroyable: Lock acquired");
            if (this.e < 0) {
                throw new IllegalStateException();
            }
            gi2.G("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.d = true;
            z();
        }
        gi2.G("markAsDestroyable: Lock released");
    }

    public final void z() {
        gi2.G("maybeDestroy: Trying to acquire lock");
        synchronized (this.c) {
            try {
                gi2.G("maybeDestroy: Lock acquired");
                int i = this.e;
                if (i < 0) {
                    throw new IllegalStateException();
                }
                if (this.d && i == 0) {
                    gi2.G("No reference is left (including root). Cleaning up engine.");
                    t(new ts0(), new sd2(0));
                } else {
                    gi2.G("There are still references to the engine. Not destroying.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        gi2.G("maybeDestroy: Lock released");
    }
}
