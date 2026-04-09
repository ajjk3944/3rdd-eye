package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class c00 extends m81 {
    @Override // defpackage.ho
    public final void a(ho hoVar) {
        jo joVar = this.h;
        if (joVar.c && !joVar.j) {
            joVar.d((int) ((((jo) joVar.l.get(0)).g * ((b00) this.b).q0) + 0.5f));
        }
    }

    @Override // defpackage.m81
    public final void d() {
        pi piVar = this.b;
        b00 b00Var = (b00) piVar;
        int i = b00Var.r0;
        int i2 = b00Var.s0;
        int i3 = b00Var.u0;
        jo joVar = this.h;
        if (i3 == 1) {
            if (i != -1) {
                joVar.l.add(piVar.T.d.h);
                this.b.T.d.h.k.add(joVar);
                joVar.f = i;
            } else if (i2 != -1) {
                joVar.l.add(piVar.T.d.i);
                this.b.T.d.i.k.add(joVar);
                joVar.f = -i2;
            } else {
                joVar.b = true;
                joVar.l.add(piVar.T.d.i);
                this.b.T.d.i.k.add(joVar);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            joVar.l.add(piVar.T.e.h);
            this.b.T.e.h.k.add(joVar);
            joVar.f = i;
        } else if (i2 != -1) {
            joVar.l.add(piVar.T.e.i);
            this.b.T.e.i.k.add(joVar);
            joVar.f = -i2;
        } else {
            joVar.b = true;
            joVar.l.add(piVar.T.e.i);
            this.b.T.e.i.k.add(joVar);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    @Override // defpackage.m81
    public final void e() {
        pi piVar = this.b;
        int i = ((b00) piVar).u0;
        jo joVar = this.h;
        if (i == 1) {
            piVar.Y = joVar.g;
        } else {
            piVar.Z = joVar.g;
        }
    }

    @Override // defpackage.m81
    public final void f() {
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
