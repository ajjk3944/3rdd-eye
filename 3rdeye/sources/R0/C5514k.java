package r0;

import androidx.constraintlayout.widget.ConstraintLayout;
import r0.C5508e;
import s0.C5543b;

/* compiled from: VirtualLayout.java */
/* renamed from: r0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5514k extends C5512i {

    /* renamed from: t0, reason: collision with root package name */
    public int f45660t0 = 0;

    /* renamed from: u0, reason: collision with root package name */
    public int f45661u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public int f45662v0 = 0;

    /* renamed from: w0, reason: collision with root package name */
    public int f45663w0 = 0;

    /* renamed from: x0, reason: collision with root package name */
    public int f45664x0 = 0;

    /* renamed from: y0, reason: collision with root package name */
    public int f45665y0 = 0;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f45666z0 = false;

    /* renamed from: A0, reason: collision with root package name */
    public int f45656A0 = 0;

    /* renamed from: B0, reason: collision with root package name */
    public int f45657B0 = 0;

    /* renamed from: C0, reason: collision with root package name */
    public final C5543b.a f45658C0 = new C5543b.a();

    /* renamed from: D0, reason: collision with root package name */
    public C5543b.InterfaceC0526b f45659D0 = null;

    @Override // r0.C5512i
    public final void S() {
        for (int i = 0; i < this.f45654s0; i++) {
            C5508e c5508e = this.f45653r0[i];
            if (c5508e != null) {
                c5508e.f45521G = true;
            }
        }
    }

    public final void U(C5508e c5508e, C5508e.b bVar, int i, C5508e.b bVar2, int i10) {
        C5543b.InterfaceC0526b interfaceC0526b;
        C5508e c5508e2;
        while (true) {
            interfaceC0526b = this.f45659D0;
            if (interfaceC0526b != null || (c5508e2 = this.f45536V) == null) {
                break;
            } else {
                this.f45659D0 = ((C5509f) c5508e2).f45600v0;
            }
        }
        C5543b.a aVar = this.f45658C0;
        aVar.f45901a = bVar;
        aVar.f45902b = bVar2;
        aVar.f45903c = i;
        aVar.f45904d = i10;
        ((ConstraintLayout.c) interfaceC0526b).b(c5508e, aVar);
        c5508e.O(aVar.f45905e);
        c5508e.L(aVar.f45906f);
        c5508e.f45519E = aVar.f45908h;
        c5508e.I(aVar.f45907g);
    }

    public void T(int i, int i10, int i11, int i12) {
    }
}
