package s;

import E0.A0;
import E0.B0;
import E0.InterfaceC2641t;
import androidx.compose.ui.e;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: s.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7830C extends e.c implements A0, InterfaceC2641t {

    /* renamed from: q, reason: collision with root package name */
    public static final a f60617q = new a(null);

    /* renamed from: r, reason: collision with root package name */
    public static final int f60618r = 8;

    /* renamed from: n, reason: collision with root package name */
    private boolean f60619n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f60620o;

    /* renamed from: p, reason: collision with root package name */
    private C0.r f60621p;

    /* renamed from: s.C$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final C7831D D2() {
        if (!k2()) {
            return null;
        }
        A0 a0A = B0.a(this, C7831D.f60622p);
        if (a0A instanceof C7831D) {
            return (C7831D) a0A;
        }
        return null;
    }

    private final void E2() {
        C7831D c7831dD2;
        C0.r rVar = this.f60621p;
        if (rVar != null) {
            AbstractC6492s.f(rVar);
            if (!rVar.M() || (c7831dD2 = D2()) == null) {
                return;
            }
            c7831dD2.D2(this.f60621p);
        }
    }

    @Override // E0.InterfaceC2641t
    public void B(C0.r rVar) {
        this.f60621p = rVar;
        if (this.f60619n) {
            if (rVar.M()) {
                E2();
                return;
            }
            C7831D c7831dD2 = D2();
            if (c7831dD2 != null) {
                c7831dD2.D2(null);
            }
        }
    }

    public final void F2(boolean z10) {
        if (z10 == this.f60619n) {
            return;
        }
        if (z10) {
            E2();
        } else {
            C7831D c7831dD2 = D2();
            if (c7831dD2 != null) {
                c7831dD2.D2(null);
            }
        }
        this.f60619n = z10;
    }

    @Override // E0.A0
    public Object W() {
        return f60617q;
    }

    @Override // androidx.compose.ui.e.c
    public boolean i2() {
        return this.f60620o;
    }
}
