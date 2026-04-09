package androidx.compose.foundation;

import E0.AbstractC2640s;
import E0.InterfaceC2632j;
import E0.r;
import Ii.AbstractC3063k;
import Ii.N;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import Yg.J;
import Yg.v;
import androidx.compose.ui.e;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.L;
import m0.C6733v0;
import mh.InterfaceC6839p;
import o0.InterfaceC7036c;
import o0.InterfaceC7039f;
import s.InterfaceC7836I;
import y.C8549d;
import y.C8550e;
import y.C8552g;
import y.C8553h;
import y.InterfaceC8555j;
import y.InterfaceC8556k;
import y.InterfaceC8560o;

/* loaded from: classes.dex */
final class g implements InterfaceC7836I {

    /* renamed from: a, reason: collision with root package name */
    public static final g f27841a = new g();

    private static final class a extends e.c implements r {

        /* renamed from: n, reason: collision with root package name */
        private final InterfaceC8556k f27842n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f27843o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f27844p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f27845q;

        /* renamed from: androidx.compose.foundation.g$a$a, reason: collision with other inner class name */
        static final class C1038a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f27846a;

            /* renamed from: androidx.compose.foundation.g$a$a$a, reason: collision with other inner class name */
            static final class C1039a implements InterfaceC3221h {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ L f27848a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ L f27849b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ L f27850c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ a f27851d;

                C1039a(L l10, L l11, L l12, a aVar) {
                    this.f27848a = l10;
                    this.f27849b = l11;
                    this.f27850c = l12;
                    this.f27851d = aVar;
                }

                @Override // Li.InterfaceC3221h
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object a(InterfaceC8555j interfaceC8555j, InterfaceC5380e interfaceC5380e) {
                    boolean z10 = true;
                    if (interfaceC8555j instanceof InterfaceC8560o.b) {
                        this.f27848a.f51687a++;
                    } else if (interfaceC8555j instanceof InterfaceC8560o.c) {
                        L l10 = this.f27848a;
                        l10.f51687a--;
                    } else if (interfaceC8555j instanceof InterfaceC8560o.a) {
                        L l11 = this.f27848a;
                        l11.f51687a--;
                    } else if (interfaceC8555j instanceof C8552g) {
                        this.f27849b.f51687a++;
                    } else if (interfaceC8555j instanceof C8553h) {
                        L l12 = this.f27849b;
                        l12.f51687a--;
                    } else if (interfaceC8555j instanceof C8549d) {
                        this.f27850c.f51687a++;
                    } else if (interfaceC8555j instanceof C8550e) {
                        L l13 = this.f27850c;
                        l13.f51687a--;
                    }
                    boolean z11 = false;
                    boolean z12 = this.f27848a.f51687a > 0;
                    boolean z13 = this.f27849b.f51687a > 0;
                    boolean z14 = this.f27850c.f51687a > 0;
                    if (this.f27851d.f27843o != z12) {
                        this.f27851d.f27843o = z12;
                        z11 = true;
                    }
                    if (this.f27851d.f27844p != z13) {
                        this.f27851d.f27844p = z13;
                        z11 = true;
                    }
                    if (this.f27851d.f27845q != z14) {
                        this.f27851d.f27845q = z14;
                    } else {
                        z10 = z11;
                    }
                    if (z10) {
                        AbstractC2640s.a(this.f27851d);
                    }
                    return J.f24997a;
                }
            }

            C1038a(InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return a.this.new C1038a(interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f27846a;
                if (i10 == 0) {
                    v.b(obj);
                    L l10 = new L();
                    L l11 = new L();
                    L l12 = new L();
                    InterfaceC3220g interfaceC3220gB = a.this.f27842n.b();
                    C1039a c1039a = new C1039a(l10, l11, l12, a.this);
                    this.f27846a = 1;
                    if (interfaceC3220gB.b(c1039a, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                }
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((C1038a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        public a(InterfaceC8556k interfaceC8556k) {
            this.f27842n = interfaceC8556k;
        }

        @Override // E0.r
        public void J(InterfaceC7036c interfaceC7036c) {
            interfaceC7036c.X1();
            if (this.f27843o) {
                InterfaceC7039f.u0(interfaceC7036c, C6733v0.k(C6733v0.f52951b.a(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, interfaceC7036c.c(), 0.0f, null, null, 0, 122, null);
            } else if (this.f27844p || this.f27845q) {
                InterfaceC7039f.u0(interfaceC7036c, C6733v0.k(C6733v0.f52951b.a(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, interfaceC7036c.c(), 0.0f, null, null, 0, 122, null);
            }
        }

        @Override // androidx.compose.ui.e.c
        public void n2() {
            AbstractC3063k.d(d2(), null, null, new C1038a(null), 3, null);
        }
    }

    private g() {
    }

    @Override // s.InterfaceC7836I
    public InterfaceC2632j a(InterfaceC8556k interfaceC8556k) {
        return new a(interfaceC8556k);
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return -1;
    }
}
