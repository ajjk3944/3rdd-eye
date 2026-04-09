package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class cv2 implements jo2, rn2, wm2, dn2, fd1, ap2 {
    public final cx1 f;
    public boolean g = false;

    public cv2(cx1 cx1Var, m73 m73Var) {
        this.f = cx1Var;
        cx1Var.b(2);
        if (m73Var != null) {
            cx1Var.b(1101);
        }
    }

    @Override // defpackage.ap2
    public final void A0(gy1 gy1Var) {
        cx1 cx1Var = this.f;
        synchronized (cx1Var) {
            if (cx1Var.c) {
                try {
                    cx1Var.b.g(gy1Var);
                } catch (NullPointerException e) {
                    hg4.C.h.d("AdMobClearcutLogger.modify", e);
                }
            }
        }
        cx1Var.b(1104);
    }

    @Override // defpackage.jo2
    public final void B(h83 h83Var) {
        this.f.a(new ho2(h83Var));
    }

    @Override // defpackage.fd1
    public final synchronized void C() {
        if (this.g) {
            this.f.b(8);
        } else {
            this.f.b(7);
            this.g = true;
        }
    }

    @Override // defpackage.dn2
    public final synchronized void D0() {
        this.f.b(6);
    }

    @Override // defpackage.ap2
    public final void H(gy1 gy1Var) {
        cx1 cx1Var = this.f;
        synchronized (cx1Var) {
            if (cx1Var.c) {
                try {
                    cx1Var.b.g(gy1Var);
                } catch (NullPointerException e) {
                    hg4.C.h.d("AdMobClearcutLogger.modify", e);
                }
            }
        }
        cx1Var.b(1103);
    }

    @Override // defpackage.ap2
    public final void S(boolean z) {
        this.f.b(true != z ? 1106 : 1105);
    }

    @Override // defpackage.wm2
    public final void d0(nx2 nx2Var) {
        int i = nx2Var.f;
        cx1 cx1Var = this.f;
        switch (i) {
            case 1:
                cx1Var.b(101);
                break;
            case 2:
                cx1Var.b(102);
                break;
            case 3:
                cx1Var.b(5);
                break;
            case 4:
                cx1Var.b(103);
                break;
            case 5:
                cx1Var.b(104);
                break;
            case 6:
                cx1Var.b(105);
                break;
            case 7:
                cx1Var.b(106);
                break;
            default:
                cx1Var.b(4);
                break;
        }
    }

    @Override // defpackage.rn2
    public final void e() {
        this.f.b(3);
    }

    @Override // defpackage.ap2
    public final void g0(gy1 gy1Var) {
        cx1 cx1Var = this.f;
        synchronized (cx1Var) {
            if (cx1Var.c) {
                try {
                    cx1Var.b.g(gy1Var);
                } catch (NullPointerException e) {
                    hg4.C.h.d("AdMobClearcutLogger.modify", e);
                }
            }
        }
        cx1Var.b(1102);
    }

    @Override // defpackage.ap2
    public final void p() {
        this.f.b(1109);
    }

    @Override // defpackage.ap2
    public final void r0(boolean z) {
        this.f.b(true != z ? 1108 : 1107);
    }

    @Override // defpackage.jo2
    public final void G0(fa2 fa2Var) {
    }
}
