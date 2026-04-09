package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class r00 extends m81 {
    @Override // defpackage.ho
    public final void a(ho hoVar) {
        q9 q9Var = (q9) this.b;
        int i = q9Var.s0;
        jo joVar = this.h;
        ArrayList arrayList = joVar.l;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            int i5 = ((jo) obj).g;
            if (i3 == -1 || i5 < i3) {
                i3 = i5;
            }
            if (i2 < i5) {
                i2 = i5;
            }
        }
        if (i == 0 || i == 2) {
            joVar.d(i3 + q9Var.u0);
        } else {
            joVar.d(i2 + q9Var.u0);
        }
    }

    @Override // defpackage.m81
    public final void d() {
        pi piVar = this.b;
        if (piVar instanceof q9) {
            jo joVar = this.h;
            joVar.b = true;
            ArrayList arrayList = joVar.l;
            q9 q9Var = (q9) piVar;
            int i = q9Var.s0;
            boolean z = q9Var.t0;
            int i2 = 0;
            if (i == 0) {
                joVar.e = 4;
                while (i2 < q9Var.r0) {
                    pi piVar2 = q9Var.q0[i2];
                    if (z || piVar2.g0 != 8) {
                        jo joVar2 = piVar2.d.h;
                        joVar2.k.add(joVar);
                        arrayList.add(joVar2);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 1) {
                joVar.e = 5;
                while (i2 < q9Var.r0) {
                    pi piVar3 = q9Var.q0[i2];
                    if (z || piVar3.g0 != 8) {
                        jo joVar3 = piVar3.d.i;
                        joVar3.k.add(joVar);
                        arrayList.add(joVar3);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 2) {
                joVar.e = 6;
                while (i2 < q9Var.r0) {
                    pi piVar4 = q9Var.q0[i2];
                    if (z || piVar4.g0 != 8) {
                        jo joVar4 = piVar4.e.h;
                        joVar4.k.add(joVar);
                        arrayList.add(joVar4);
                    }
                    i2++;
                }
                m(this.b.e.h);
                m(this.b.e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            joVar.e = 7;
            while (i2 < q9Var.r0) {
                pi piVar5 = q9Var.q0[i2];
                if (z || piVar5.g0 != 8) {
                    jo joVar5 = piVar5.e.i;
                    joVar5.k.add(joVar);
                    arrayList.add(joVar5);
                }
                i2++;
            }
            m(this.b.e.h);
            m(this.b.e.i);
        }
    }

    @Override // defpackage.m81
    public final void e() {
        pi piVar = this.b;
        if (piVar instanceof q9) {
            int i = ((q9) piVar).s0;
            jo joVar = this.h;
            if (i == 0 || i == 1) {
                piVar.Y = joVar.g;
            } else {
                piVar.Z = joVar.g;
            }
        }
    }

    @Override // defpackage.m81
    public final void f() {
        this.c = null;
        this.h.c();
    }

    @Override // defpackage.m81
    public final boolean k() {
        return false;
    }

    public final void m(jo joVar) {
        jo joVar2 = this.h;
        joVar2.k.add(joVar);
        joVar.l.add(joVar2);
    }
}
