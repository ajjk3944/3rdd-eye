package w;

import Ii.InterfaceC3069n;
import Yg.J;
import Yg.u;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import l0.C6533i;
import mh.InterfaceC6835l;
import sh.C7974i;
import w.C8245f;

/* renamed from: w.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8242c {

    /* renamed from: b, reason: collision with root package name */
    public static final int f63848b = V.b.f22937d;

    /* renamed from: a, reason: collision with root package name */
    private final V.b f63849a = new V.b(new C8245f.a[16], 0);

    /* renamed from: w.c$a */
    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C8245f.a f63851b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C8245f.a aVar) {
            super(1);
            this.f63851b = aVar;
        }

        public final void a(Throwable th2) {
            C8242c.this.f63849a.x(this.f63851b);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return J.f24997a;
        }
    }

    public final void b(Throwable th2) {
        V.b bVar = this.f63849a;
        int iO = bVar.o();
        InterfaceC3069n[] interfaceC3069nArr = new InterfaceC3069n[iO];
        for (int i10 = 0; i10 < iO; i10++) {
            interfaceC3069nArr[i10] = ((C8245f.a) bVar.m()[i10]).a();
        }
        for (int i11 = 0; i11 < iO; i11++) {
            interfaceC3069nArr[i11].cancel(th2);
        }
        if (!this.f63849a.s()) {
            throw new IllegalStateException("uncancelled requests present");
        }
    }

    public final boolean c(C8245f.a aVar) {
        C6533i c6533i = (C6533i) aVar.b().invoke();
        if (c6533i == null) {
            InterfaceC3069n interfaceC3069nA = aVar.a();
            u.a aVar2 = Yg.u.f25017b;
            interfaceC3069nA.resumeWith(Yg.u.c(J.f24997a));
            return false;
        }
        aVar.a().B(new a(aVar));
        C7974i c7974i = new C7974i(0, this.f63849a.o() - 1);
        int i10 = c7974i.i();
        int iJ = c7974i.j();
        if (i10 <= iJ) {
            while (true) {
                C6533i c6533i2 = (C6533i) ((C8245f.a) this.f63849a.m()[iJ]).b().invoke();
                if (c6533i2 != null) {
                    C6533i c6533iT = c6533i.t(c6533i2);
                    if (AbstractC6492s.d(c6533iT, c6533i)) {
                        this.f63849a.a(iJ + 1, aVar);
                        return true;
                    }
                    if (!AbstractC6492s.d(c6533iT, c6533i2)) {
                        CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                        int iO = this.f63849a.o() - 1;
                        if (iO <= iJ) {
                            while (true) {
                                ((C8245f.a) this.f63849a.m()[iJ]).a().cancel(cancellationException);
                                if (iO == iJ) {
                                    break;
                                }
                                iO++;
                            }
                        }
                    }
                }
                if (iJ == i10) {
                    break;
                }
                iJ--;
            }
        }
        this.f63849a.a(0, aVar);
        return true;
    }

    public final void d() {
        C7974i c7974i = new C7974i(0, this.f63849a.o() - 1);
        int i10 = c7974i.i();
        int iJ = c7974i.j();
        if (i10 <= iJ) {
            while (true) {
                ((C8245f.a) this.f63849a.m()[i10]).a().resumeWith(Yg.u.c(J.f24997a));
                if (i10 == iJ) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.f63849a.h();
    }
}
