package wh;

import Bh.InterfaceC2491a;
import Bh.InterfaceC2515z;
import java.io.IOException;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import th.k;

/* loaded from: classes4.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final e1 f65136a = new e1();

    /* renamed from: b, reason: collision with root package name */
    private static final kotlin.reflect.jvm.internal.impl.renderer.n f65137b = kotlin.reflect.jvm.internal.impl.renderer.n.f52068h;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f65138a;

        static {
            int[] iArr = new int[k.a.values().length];
            try {
                iArr[k.a.EXTENSION_RECEIVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.a.INSTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.a.VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f65138a = iArr;
        }
    }

    private e1() {
    }

    private final void c(StringBuilder sb2, Bh.b0 b0Var) {
        if (b0Var != null) {
            pi.S type = b0Var.getType();
            AbstractC6492s.h(type, "getType(...)");
            sb2.append(l(type));
            sb2.append(".");
        }
    }

    private final void d(StringBuilder sb2, InterfaceC2491a interfaceC2491a) {
        Bh.b0 b0VarI = j1.i(interfaceC2491a);
        Bh.b0 b0VarK0 = interfaceC2491a.k0();
        c(sb2, b0VarI);
        boolean z10 = (b0VarI == null || b0VarK0 == null) ? false : true;
        if (z10) {
            sb2.append("(");
        }
        c(sb2, b0VarK0);
        if (z10) {
            sb2.append(")");
        }
    }

    private final String e(InterfaceC2491a interfaceC2491a) {
        if (interfaceC2491a instanceof Bh.Y) {
            return k((Bh.Y) interfaceC2491a);
        }
        if (interfaceC2491a instanceof InterfaceC2515z) {
            return f((InterfaceC2515z) interfaceC2491a);
        }
        throw new IllegalStateException(("Illegal callable: " + interfaceC2491a).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence g(Bh.s0 s0Var) {
        e1 e1Var = f65136a;
        pi.S type = s0Var.getType();
        AbstractC6492s.h(type, "getType(...)");
        return e1Var.l(type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence i(Bh.s0 s0Var) {
        e1 e1Var = f65136a;
        pi.S type = s0Var.getType();
        AbstractC6492s.h(type, "getType(...)");
        return e1Var.l(type);
    }

    public final String f(InterfaceC2515z descriptor) throws IOException {
        AbstractC6492s.i(descriptor, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("fun ");
        e1 e1Var = f65136a;
        e1Var.d(sb2, descriptor);
        kotlin.reflect.jvm.internal.impl.renderer.n nVar = f65137b;
        Zh.f name = descriptor.getName();
        AbstractC6492s.h(name, "getName(...)");
        sb2.append(nVar.T(name, true));
        List listI = descriptor.i();
        AbstractC6492s.h(listI, "getValueParameters(...)");
        Zg.H.w0(listI, sb2, (112 & 2) != 0 ? ", " : ", ", (112 & 4) != 0 ? "" : "(", (112 & 8) == 0 ? ")" : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : c1.f65123a);
        sb2.append(": ");
        pi.S returnType = descriptor.getReturnType();
        AbstractC6492s.f(returnType);
        sb2.append(e1Var.l(returnType));
        String string = sb2.toString();
        AbstractC6492s.h(string, "toString(...)");
        return string;
    }

    public final String h(InterfaceC2515z invoke) throws IOException {
        AbstractC6492s.i(invoke, "invoke");
        StringBuilder sb2 = new StringBuilder();
        e1 e1Var = f65136a;
        e1Var.d(sb2, invoke);
        List listI = invoke.i();
        AbstractC6492s.h(listI, "getValueParameters(...)");
        Zg.H.w0(listI, sb2, (112 & 2) != 0 ? ", " : ", ", (112 & 4) != 0 ? "" : "(", (112 & 8) == 0 ? ")" : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : d1.f65133a);
        sb2.append(" -> ");
        pi.S returnType = invoke.getReturnType();
        AbstractC6492s.f(returnType);
        sb2.append(e1Var.l(returnType));
        String string = sb2.toString();
        AbstractC6492s.h(string, "toString(...)");
        return string;
    }

    public final String j(C8396y0 parameter) {
        AbstractC6492s.i(parameter, "parameter");
        StringBuilder sb2 = new StringBuilder();
        int i10 = a.f65138a[parameter.h().ordinal()];
        if (i10 == 1) {
            sb2.append("extension receiver parameter");
        } else if (i10 == 2) {
            sb2.append("instance parameter");
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            sb2.append("parameter #" + parameter.getIndex() + ' ' + parameter.getName());
        }
        sb2.append(" of ");
        sb2.append(f65136a.e(parameter.k().d0()));
        String string = sb2.toString();
        AbstractC6492s.h(string, "toString(...)");
        return string;
    }

    public final String k(Bh.Y descriptor) {
        AbstractC6492s.i(descriptor, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(descriptor.h0() ? "var " : "val ");
        e1 e1Var = f65136a;
        e1Var.d(sb2, descriptor);
        kotlin.reflect.jvm.internal.impl.renderer.n nVar = f65137b;
        Zh.f name = descriptor.getName();
        AbstractC6492s.h(name, "getName(...)");
        sb2.append(nVar.T(name, true));
        sb2.append(": ");
        pi.S type = descriptor.getType();
        AbstractC6492s.h(type, "getType(...)");
        sb2.append(e1Var.l(type));
        String string = sb2.toString();
        AbstractC6492s.h(string, "toString(...)");
        return string;
    }

    public final String l(pi.S type) {
        AbstractC6492s.i(type, "type");
        return f65137b.U(type);
    }
}
