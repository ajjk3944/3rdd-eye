package R0;

import L0.AbstractC3175e;
import L0.C3174d;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;

/* renamed from: R0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3458k {

    /* renamed from: a, reason: collision with root package name */
    private Q f19483a = new Q(AbstractC3175e.i(), L0.S.f11103b.a(), (L0.S) null, (DefaultConstructorMarker) null);

    /* renamed from: b, reason: collision with root package name */
    private C3459l f19484b = new C3459l(this.f19483a.f(), this.f19483a.h(), null);

    /* renamed from: R0.k$a */
    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3456i f19485a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3458k f19486b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3456i interfaceC3456i, C3458k c3458k) {
            super(1);
            this.f19485a = interfaceC3456i;
            this.f19486b = c3458k;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(InterfaceC3456i interfaceC3456i) {
            return (this.f19485a == interfaceC3456i ? " > " : "   ") + this.f19486b.e(interfaceC3456i);
        }
    }

    private final String c(List list, InterfaceC3456i interfaceC3456i) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error while applying EditCommand batch to buffer (length=" + this.f19484b.h() + ", composition=" + this.f19484b.d() + ", selection=" + ((Object) L0.S.q(this.f19484b.i())) + "):");
        AbstractC6492s.h(sb2, "append(value)");
        sb2.append('\n');
        AbstractC6492s.h(sb2, "append('\\n')");
        Zg.H.w0(list, sb2, (112 & 2) != 0 ? ", " : "\n", (112 & 4) != 0 ? "" : null, (112 & 8) == 0 ? null : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : new a(interfaceC3456i, this));
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String e(InterfaceC3456i interfaceC3456i) {
        if (interfaceC3456i instanceof C3448a) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CommitTextCommand(text.length=");
            C3448a c3448a = (C3448a) interfaceC3456i;
            sb2.append(c3448a.c().length());
            sb2.append(", newCursorPosition=");
            sb2.append(c3448a.b());
            sb2.append(')');
            return sb2.toString();
        }
        if (interfaceC3456i instanceof O) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("SetComposingTextCommand(text.length=");
            O o10 = (O) interfaceC3456i;
            sb3.append(o10.c().length());
            sb3.append(", newCursorPosition=");
            sb3.append(o10.b());
            sb3.append(')');
            return sb3.toString();
        }
        if (!(interfaceC3456i instanceof N) && !(interfaceC3456i instanceof C3454g) && !(interfaceC3456i instanceof C3455h) && !(interfaceC3456i instanceof P) && !(interfaceC3456i instanceof C3461n) && !(interfaceC3456i instanceof C3453f)) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Unknown EditCommand: ");
            String strV = kotlin.jvm.internal.O.b(interfaceC3456i.getClass()).v();
            if (strV == null) {
                strV = "{anonymous EditCommand}";
            }
            sb4.append(strV);
            return sb4.toString();
        }
        return interfaceC3456i.toString();
    }

    public final Q b(List list) {
        InterfaceC3456i interfaceC3456i;
        Exception e10;
        try {
            int size = list.size();
            int i10 = 0;
            interfaceC3456i = null;
            while (i10 < size) {
                try {
                    InterfaceC3456i interfaceC3456i2 = (InterfaceC3456i) list.get(i10);
                    try {
                        interfaceC3456i2.a(this.f19484b);
                        i10++;
                        interfaceC3456i = interfaceC3456i2;
                    } catch (Exception e11) {
                        e10 = e11;
                        interfaceC3456i = interfaceC3456i2;
                        throw new RuntimeException(c(list, interfaceC3456i), e10);
                    }
                } catch (Exception e12) {
                    e10 = e12;
                }
            }
            C3174d c3174dS = this.f19484b.s();
            long jI = this.f19484b.i();
            L0.S sB = L0.S.b(jI);
            sB.r();
            L0.S s10 = L0.S.m(this.f19483a.h()) ? null : sB;
            Q q10 = new Q(c3174dS, s10 != null ? s10.r() : L0.T.b(L0.S.k(jI), L0.S.l(jI)), this.f19484b.d(), (DefaultConstructorMarker) null);
            this.f19483a = q10;
            return q10;
        } catch (Exception e13) {
            interfaceC3456i = null;
            e10 = e13;
        }
    }

    public final void d(Q q10, Z z10) {
        boolean zD = AbstractC6492s.d(q10.g(), this.f19484b.d());
        boolean z11 = true;
        boolean z12 = false;
        if (!AbstractC6492s.d(this.f19483a.f(), q10.f())) {
            this.f19484b = new C3459l(q10.f(), q10.h(), null);
        } else if (L0.S.g(this.f19483a.h(), q10.h())) {
            z11 = false;
        } else {
            this.f19484b.p(L0.S.l(q10.h()), L0.S.k(q10.h()));
            z12 = true;
            z11 = false;
        }
        if (q10.g() == null) {
            this.f19484b.a();
        } else if (!L0.S.h(q10.g().r())) {
            this.f19484b.n(L0.S.l(q10.g().r()), L0.S.k(q10.g().r()));
        }
        if (z11 || (!z12 && !zD)) {
            this.f19484b.a();
            q10 = Q.d(q10, null, 0L, null, 3, null);
        }
        Q q11 = this.f19483a;
        this.f19483a = q10;
        if (z10 != null) {
            z10.d(q11, q10);
        }
    }

    public final Q f() {
        return this.f19483a;
    }
}
