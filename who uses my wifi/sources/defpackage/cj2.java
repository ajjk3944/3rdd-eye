package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class cj2 implements en2 {
    public final /* synthetic */ int f;
    public final Object g;

    public /* synthetic */ cj2(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.en2
    public final void h(Context context) throws n83 {
        switch (this.f) {
            case 0:
                try {
                    try {
                        ((u83) this.g).a.j();
                        break;
                    } catch (Throwable th) {
                        throw new n83(th);
                    }
                } catch (n83 unused) {
                    gi2.q0(5);
                    return;
                }
            default:
                ag2 ag2Var = (ag2) this.g;
                if (ag2Var != null) {
                    ag2Var.destroy();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.en2
    public final void l(Context context) throws n83 {
        switch (this.f) {
            case 0:
                try {
                    try {
                        ((u83) this.g).a.i();
                        break;
                    } catch (Throwable th) {
                        throw new n83(th);
                    }
                } catch (n83 unused) {
                    gi2.q0(5);
                    return;
                }
            default:
                ag2 ag2Var = (ag2) this.g;
                if (ag2Var != null) {
                    ag2Var.onPause();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.en2
    public final void p(Context context) {
        n83 n83Var;
        switch (this.f) {
            case 0:
                try {
                    try {
                        w62 w62Var = ((u83) this.g).a;
                        w62Var.n();
                        if (context != null) {
                            try {
                                w62Var.l0(new oi0(context));
                                return;
                            } finally {
                            }
                        }
                        return;
                    } finally {
                    }
                } catch (n83 unused) {
                    gi2.q0(5);
                    return;
                }
            default:
                ag2 ag2Var = (ag2) this.g;
                if (ag2Var != null) {
                    ag2Var.onResume();
                    return;
                }
                return;
        }
    }
}
