package W;

import Zg.AbstractC3672d;
import java.util.List;
import nh.InterfaceC6944a;

/* loaded from: classes.dex */
public interface c extends List, b, InterfaceC6944a {

    private static final class a extends AbstractC3672d implements c {

        /* renamed from: b, reason: collision with root package name */
        private final c f23471b;

        /* renamed from: c, reason: collision with root package name */
        private final int f23472c;

        /* renamed from: d, reason: collision with root package name */
        private final int f23473d;

        /* renamed from: e, reason: collision with root package name */
        private int f23474e;

        public a(c cVar, int i10, int i11) {
            this.f23471b = cVar;
            this.f23472c = i10;
            this.f23473d = i11;
            a0.d.c(i10, i11, cVar.size());
            this.f23474e = i11 - i10;
        }

        @Override // Zg.AbstractC3672d, java.util.List
        public Object get(int i10) {
            a0.d.a(i10, this.f23474e);
            return this.f23471b.get(this.f23472c + i10);
        }

        @Override // Zg.AbstractC3670b
        public int j() {
            return this.f23474e;
        }

        @Override // Zg.AbstractC3672d, java.util.List
        public c subList(int i10, int i11) {
            a0.d.c(i10, i11, this.f23474e);
            c cVar = this.f23471b;
            int i12 = this.f23472c;
            return new a(cVar, i10 + i12, i12 + i11);
        }
    }

    @Override // java.util.List
    default c subList(int i10, int i11) {
        return new a(this, i10, i11);
    }
}
