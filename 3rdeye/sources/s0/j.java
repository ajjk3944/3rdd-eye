package s0;

import r0.C5508e;
import r0.C5511h;

/* compiled from: GuidelineReference.java */
/* loaded from: classes.dex */
public final class j extends p {
    @Override // s0.p, s0.d
    public final void a(d dVar) {
        f fVar = this.f45953h;
        if (fVar.f45922c && !fVar.f45928j) {
            fVar.d((int) ((((f) fVar.f45930l.get(0)).f45926g * ((C5511h) this.f45947b).f45646r0) + 0.5f));
        }
    }

    @Override // s0.p
    public final void d() {
        C5508e c5508e = this.f45947b;
        C5511h c5511h = (C5511h) c5508e;
        int i = c5511h.f45647s0;
        int i10 = c5511h.f45648t0;
        int i11 = c5511h.f45650v0;
        f fVar = this.f45953h;
        if (i11 == 1) {
            if (i != -1) {
                fVar.f45930l.add(c5508e.f45536V.f45547d.f45953h);
                this.f45947b.f45536V.f45547d.f45953h.f45929k.add(fVar);
                fVar.f45925f = i;
            } else if (i10 != -1) {
                fVar.f45930l.add(c5508e.f45536V.f45547d.i);
                this.f45947b.f45536V.f45547d.i.f45929k.add(fVar);
                fVar.f45925f = -i10;
            } else {
                fVar.f45921b = true;
                fVar.f45930l.add(c5508e.f45536V.f45547d.i);
                this.f45947b.f45536V.f45547d.i.f45929k.add(fVar);
            }
            m(this.f45947b.f45547d.f45953h);
            m(this.f45947b.f45547d.i);
            return;
        }
        if (i != -1) {
            fVar.f45930l.add(c5508e.f45536V.f45549e.f45953h);
            this.f45947b.f45536V.f45549e.f45953h.f45929k.add(fVar);
            fVar.f45925f = i;
        } else if (i10 != -1) {
            fVar.f45930l.add(c5508e.f45536V.f45549e.i);
            this.f45947b.f45536V.f45549e.i.f45929k.add(fVar);
            fVar.f45925f = -i10;
        } else {
            fVar.f45921b = true;
            fVar.f45930l.add(c5508e.f45536V.f45549e.i);
            this.f45947b.f45536V.f45549e.i.f45929k.add(fVar);
        }
        m(this.f45947b.f45549e.f45953h);
        m(this.f45947b.f45549e.i);
    }

    @Override // s0.p
    public final void e() {
        C5508e c5508e = this.f45947b;
        int i = ((C5511h) c5508e).f45650v0;
        f fVar = this.f45953h;
        if (i == 1) {
            c5508e.f45542a0 = fVar.f45926g;
        } else {
            c5508e.f45544b0 = fVar.f45926g;
        }
    }

    @Override // s0.p
    public final void f() {
        this.f45953h.c();
    }

    @Override // s0.p
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.f45953h;
        fVar2.f45929k.add(fVar);
        fVar.f45930l.add(fVar2);
    }
}
