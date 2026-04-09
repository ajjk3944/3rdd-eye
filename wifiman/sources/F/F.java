package F;

import Li.InterfaceC3221h;
import T.AbstractC3528f1;
import T.InterfaceC3545n0;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import o.C7007F;
import y.C8549d;
import y.C8550e;
import y.C8552g;
import y.C8553h;
import y.InterfaceC8555j;
import y.InterfaceC8556k;
import y.InterfaceC8560o;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    private final int f4861a = 1;

    /* renamed from: b, reason: collision with root package name */
    private final int f4862b = 2;

    /* renamed from: c, reason: collision with root package name */
    private final int f4863c = 4;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3545n0 f4864d = AbstractC3528f1.a(0);

    static final class a implements InterfaceC3221h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C7007F f4865a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ F f4866b;

        a(C7007F c7007f, F f10) {
            this.f4865a = c7007f;
            this.f4866b = f10;
        }

        @Override // Li.InterfaceC3221h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object a(InterfaceC8555j interfaceC8555j, InterfaceC5380e interfaceC5380e) {
            int i10;
            if (interfaceC8555j instanceof C8552g ? true : interfaceC8555j instanceof C8549d ? true : interfaceC8555j instanceof InterfaceC8560o.b) {
                this.f4865a.g(interfaceC8555j);
            } else if (interfaceC8555j instanceof C8553h) {
                this.f4865a.j(((C8553h) interfaceC8555j).a());
            } else if (interfaceC8555j instanceof C8550e) {
                this.f4865a.j(((C8550e) interfaceC8555j).a());
            } else if (interfaceC8555j instanceof InterfaceC8560o.c) {
                this.f4865a.j(((InterfaceC8560o.c) interfaceC8555j).a());
            } else if (interfaceC8555j instanceof InterfaceC8560o.a) {
                this.f4865a.j(((InterfaceC8560o.a) interfaceC8555j).a());
            }
            C7007F c7007f = this.f4865a;
            F f10 = this.f4866b;
            Object[] objArr = c7007f.f54910a;
            int i11 = c7007f.f54911b;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                InterfaceC8555j interfaceC8555j2 = (InterfaceC8555j) objArr[i13];
                if (interfaceC8555j2 instanceof C8552g) {
                    i10 = f10.f4862b;
                } else if (interfaceC8555j2 instanceof C8549d) {
                    i10 = f10.f4861a;
                } else if (interfaceC8555j2 instanceof InterfaceC8560o.b) {
                    i10 = f10.f4863c;
                }
                i12 |= i10;
            }
            this.f4866b.f4864d.l(i12);
            return Yg.J.f24997a;
        }
    }

    public final Object e(InterfaceC8556k interfaceC8556k, InterfaceC5380e interfaceC5380e) {
        Object objB = interfaceC8556k.b().b(new a(new C7007F(0, 1, null), this), interfaceC5380e);
        return objB == AbstractC5467b.g() ? objB : Yg.J.f24997a;
    }

    public final boolean f() {
        return (this.f4864d.e() & this.f4861a) != 0;
    }

    public final boolean g() {
        return (this.f4864d.e() & this.f4862b) != 0;
    }

    public final boolean h() {
        return (this.f4864d.e() & this.f4863c) != 0;
    }
}
