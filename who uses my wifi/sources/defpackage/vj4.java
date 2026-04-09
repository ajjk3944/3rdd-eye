package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vj4 implements rj4 {
    public int f;
    public int g;
    public int h = 0;
    public qj4[] i = new qj4[100];

    @Override // defpackage.rj4, defpackage.eu2
    /* renamed from: a */
    public final synchronized qj4 mo18a() {
        qj4 qj4Var;
        try {
            int i = this.g + 1;
            this.g = i;
            int i2 = this.h;
            if (i2 > 0) {
                qj4[] qj4VarArr = this.i;
                int i3 = i2 - 1;
                this.h = i3;
                qj4Var = qj4VarArr[i3];
                if (qj4Var == null) {
                    throw null;
                }
                qj4VarArr[i3] = null;
            } else {
                qj4Var = new qj4(new byte[65536]);
                qj4[] qj4VarArr2 = this.i;
                int length = qj4VarArr2.length;
                if (i > length) {
                    this.i = (qj4[]) Arrays.copyOf(qj4VarArr2, length + length);
                    return qj4Var;
                }
            }
            return qj4Var;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.rj4
    public final synchronized void b(cj1 cj1Var) {
        while (cj1Var != null) {
            try {
                qj4[] qj4VarArr = this.i;
                int i = this.h;
                this.h = i + 1;
                qj4 qj4Var = (qj4) cj1Var.h;
                qj4Var.getClass();
                qj4VarArr[i] = qj4Var;
                this.g--;
                cj1Var = (cj1) cj1Var.i;
                if (cj1Var == null || ((qj4) cj1Var.h) == null) {
                    cj1Var = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    public final synchronized void c(int i) {
        int i2 = this.f;
        this.f = i;
        if (i < i2) {
            l();
        }
    }

    @Override // defpackage.rj4
    public final synchronized void d(qj4 qj4Var) {
        qj4[] qj4VarArr = this.i;
        int i = this.h;
        this.h = i + 1;
        qj4VarArr[i] = qj4Var;
        this.g--;
        notifyAll();
    }

    @Override // defpackage.rj4
    public final synchronized void l() {
        int i = this.f;
        String str = v23.a;
        int iMax = Math.max(0, ((i + 65535) / 65536) - this.g);
        int i2 = this.h;
        if (iMax >= i2) {
            return;
        }
        Arrays.fill(this.i, iMax, i2, (Object) null);
        this.h = iMax;
    }
}
