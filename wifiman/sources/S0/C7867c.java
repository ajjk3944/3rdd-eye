package s0;

import Yg.J;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6494u;
import m0.AbstractC6688Y;
import m0.AbstractC6713l0;
import m0.C6733v0;
import m0.O0;
import m0.U0;
import m0.j1;
import mh.InterfaceC6835l;
import o0.InterfaceC7037d;
import o0.InterfaceC7039f;
import o0.InterfaceC7041h;

/* renamed from: s0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7867c extends k {

    /* renamed from: b, reason: collision with root package name */
    private float[] f60820b;

    /* renamed from: c, reason: collision with root package name */
    private final List f60821c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f60822d;

    /* renamed from: e, reason: collision with root package name */
    private long f60823e;

    /* renamed from: f, reason: collision with root package name */
    private List f60824f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f60825g;

    /* renamed from: h, reason: collision with root package name */
    private U0 f60826h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC6835l f60827i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC6835l f60828j;

    /* renamed from: k, reason: collision with root package name */
    private String f60829k;

    /* renamed from: l, reason: collision with root package name */
    private float f60830l;

    /* renamed from: m, reason: collision with root package name */
    private float f60831m;

    /* renamed from: n, reason: collision with root package name */
    private float f60832n;

    /* renamed from: o, reason: collision with root package name */
    private float f60833o;

    /* renamed from: p, reason: collision with root package name */
    private float f60834p;

    /* renamed from: q, reason: collision with root package name */
    private float f60835q;

    /* renamed from: r, reason: collision with root package name */
    private float f60836r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f60837s;

    /* renamed from: s0.c$a */
    static final class a extends AbstractC6494u implements InterfaceC6835l {
        a() {
            super(1);
        }

        public final void a(k kVar) {
            C7867c.this.n(kVar);
            InterfaceC6835l interfaceC6835lB = C7867c.this.b();
            if (interfaceC6835lB != null) {
                interfaceC6835lB.invoke(kVar);
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((k) obj);
            return J.f24997a;
        }
    }

    public C7867c() {
        super(null);
        this.f60821c = new ArrayList();
        this.f60822d = true;
        this.f60823e = C6733v0.f52951b.e();
        this.f60824f = n.d();
        this.f60825g = true;
        this.f60828j = new a();
        this.f60829k = "";
        this.f60833o = 1.0f;
        this.f60834p = 1.0f;
        this.f60837s = true;
    }

    private final boolean h() {
        return !this.f60824f.isEmpty();
    }

    private final void k() {
        this.f60822d = false;
        this.f60823e = C6733v0.f52951b.e();
    }

    private final void l(AbstractC6713l0 abstractC6713l0) {
        if (this.f60822d && abstractC6713l0 != null) {
            if (abstractC6713l0 instanceof j1) {
                m(((j1) abstractC6713l0).b());
            } else {
                k();
            }
        }
    }

    private final void m(long j10) {
        if (this.f60822d && j10 != 16) {
            long j11 = this.f60823e;
            if (j11 == 16) {
                this.f60823e = j10;
            } else {
                if (n.e(j11, j10)) {
                    return;
                }
                k();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(k kVar) {
        if (kVar instanceof C7870f) {
            C7870f c7870f = (C7870f) kVar;
            l(c7870f.e());
            l(c7870f.g());
        } else if (kVar instanceof C7867c) {
            C7867c c7867c = (C7867c) kVar;
            if (c7867c.f60822d && this.f60822d) {
                m(c7867c.f60823e);
            } else {
                k();
            }
        }
    }

    private final void x() {
        if (h()) {
            U0 u0A = this.f60826h;
            if (u0A == null) {
                u0A = AbstractC6688Y.a();
                this.f60826h = u0A;
            }
            j.c(this.f60824f, u0A);
        }
    }

    private final void y() {
        float[] fArrC = this.f60820b;
        if (fArrC == null) {
            fArrC = O0.c(null, 1, null);
            this.f60820b = fArrC;
        } else {
            O0.h(fArrC);
        }
        O0.q(fArrC, this.f60831m + this.f60835q, this.f60832n + this.f60836r, 0.0f, 4, null);
        O0.k(fArrC, this.f60830l);
        O0.l(fArrC, this.f60833o, this.f60834p, 1.0f);
        O0.q(fArrC, -this.f60831m, -this.f60832n, 0.0f, 4, null);
    }

    @Override // s0.k
    public void a(InterfaceC7039f interfaceC7039f) {
        if (this.f60837s) {
            y();
            this.f60837s = false;
        }
        if (this.f60825g) {
            x();
            this.f60825g = false;
        }
        InterfaceC7037d interfaceC7037dK1 = interfaceC7039f.k1();
        long jC = interfaceC7037dK1.c();
        interfaceC7037dK1.d().j();
        try {
            InterfaceC7041h interfaceC7041hE = interfaceC7037dK1.e();
            float[] fArr = this.f60820b;
            if (fArr != null) {
                interfaceC7041hE.a(O0.a(fArr).r());
            }
            U0 u02 = this.f60826h;
            if (h() && u02 != null) {
                InterfaceC7041h.e(interfaceC7041hE, u02, 0, 2, null);
            }
            List list = this.f60821c;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((k) list.get(i10)).a(interfaceC7039f);
            }
            interfaceC7037dK1.d().r();
            interfaceC7037dK1.f(jC);
        } catch (Throwable th2) {
            interfaceC7037dK1.d().r();
            interfaceC7037dK1.f(jC);
            throw th2;
        }
    }

    @Override // s0.k
    public InterfaceC6835l b() {
        return this.f60827i;
    }

    @Override // s0.k
    public void d(InterfaceC6835l interfaceC6835l) {
        this.f60827i = interfaceC6835l;
    }

    public final int f() {
        return this.f60821c.size();
    }

    public final long g() {
        return this.f60823e;
    }

    public final void i(int i10, k kVar) {
        if (i10 < f()) {
            this.f60821c.set(i10, kVar);
        } else {
            this.f60821c.add(kVar);
        }
        n(kVar);
        kVar.d(this.f60828j);
        c();
    }

    public final boolean j() {
        return this.f60822d;
    }

    public final void o(List list) {
        this.f60824f = list;
        this.f60825g = true;
        c();
    }

    public final void p(String str) {
        this.f60829k = str;
        c();
    }

    public final void q(float f10) {
        this.f60831m = f10;
        this.f60837s = true;
        c();
    }

    public final void r(float f10) {
        this.f60832n = f10;
        this.f60837s = true;
        c();
    }

    public final void s(float f10) {
        this.f60830l = f10;
        this.f60837s = true;
        c();
    }

    public final void t(float f10) {
        this.f60833o = f10;
        this.f60837s = true;
        c();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("VGroup: ");
        sb2.append(this.f60829k);
        List list = this.f60821c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            k kVar = (k) list.get(i10);
            sb2.append("\t");
            sb2.append(kVar.toString());
            sb2.append("\n");
        }
        return sb2.toString();
    }

    public final void u(float f10) {
        this.f60834p = f10;
        this.f60837s = true;
        c();
    }

    public final void v(float f10) {
        this.f60835q = f10;
        this.f60837s = true;
        c();
    }

    public final void w(float f10) {
        this.f60836r = f10;
        this.f60837s = true;
        c();
    }
}
