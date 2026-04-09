package o1;

import java.util.ArrayList;

/* renamed from: o1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7057m extends C7049e {

    /* renamed from: w0, reason: collision with root package name */
    public ArrayList f55245w0 = new ArrayList();

    public abstract void K0();

    public void L0(C7049e c7049e) {
        this.f55245w0.remove(c7049e);
        c7049e.w0(null);
    }

    public void M0() {
        this.f55245w0.clear();
    }

    @Override // o1.C7049e
    public void Y() {
        this.f55245w0.clear();
        super.Y();
    }

    public void a(C7049e c7049e) {
        this.f55245w0.add(c7049e);
        if (c7049e.G() != null) {
            ((AbstractC7057m) c7049e.G()).L0(c7049e);
        }
        c7049e.w0(this);
    }

    @Override // o1.C7049e
    public void a0(n1.c cVar) {
        super.a0(cVar);
        int size = this.f55245w0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C7049e) this.f55245w0.get(i10)).a0(cVar);
        }
    }
}
