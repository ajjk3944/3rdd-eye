package C;

import B.InterfaceC2444h;
import Yg.J;
import Zg.AbstractC3689v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.List;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public abstract class q {

    public static final class a implements InterfaceC2444h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C f2042a;

        a(C c10) {
            this.f2042a = c10;
        }

        private final int h() {
            return this.f2042a.G() + this.f2042a.I();
        }

        @Override // B.InterfaceC2444h
        public int a() {
            return this.f2042a.F();
        }

        @Override // B.InterfaceC2444h
        public void b(w.v vVar, int i10, int i11) {
            this.f2042a.i0(i10, i11 / this.f2042a.H(), true);
        }

        @Override // B.InterfaceC2444h
        public int c() {
            return ((f) AbstractC3689v.B0(this.f2042a.C().h())).getIndex();
        }

        @Override // B.InterfaceC2444h
        public Object d(InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
            Object objB = w.y.b(this.f2042a, null, interfaceC6839p, interfaceC5380e, 1, null);
            return objB == AbstractC5467b.g() ? objB : J.f24997a;
        }

        @Override // B.InterfaceC2444h
        public int e() {
            return this.f2042a.z();
        }

        @Override // B.InterfaceC2444h
        public float f(int i10) {
            Object obj;
            List listH = this.f2042a.C().h();
            int size = listH.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    obj = null;
                    break;
                }
                obj = listH.get(i11);
                if (((f) obj).getIndex() == i10) {
                    break;
                }
                i11++;
            }
            return ((f) obj) == null ? ((i10 - this.f2042a.v()) * h()) - (this.f2042a.w() * this.f2042a.H()) : r3.b();
        }

        @Override // B.InterfaceC2444h
        public int g() {
            return this.f2042a.y();
        }
    }

    public static final InterfaceC2444h a(C c10) {
        return new a(c10);
    }
}
