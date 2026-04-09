package ui;

import Bh.AbstractC2514y;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Bh.InterfaceC2503m;
import Bh.InterfaceC2515z;
import Bh.b0;
import Bh.k0;
import Bh.s0;
import Zg.AbstractC3689v;
import fi.AbstractC5833e;
import java.util.List;
import ji.C6344e;
import ji.InterfaceC6346g;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import pi.S;
import si.AbstractC7984d;
import ui.AbstractC8174A;
import ui.k;
import ui.v;

/* loaded from: classes4.dex */
public final class s extends AbstractC8176b {

    /* renamed from: a, reason: collision with root package name */
    public static final s f63108a = new s();

    /* renamed from: b, reason: collision with root package name */
    private static final List f63109b;

    static {
        Zh.f fVar = t.f63156k;
        k.b bVar = k.b.f63097b;
        h hVar = new h(fVar, new f[]{bVar, new AbstractC8174A.a(1)}, (InterfaceC6835l) null, 4, (DefaultConstructorMarker) null);
        h hVar2 = new h(t.f63157l, new f[]{bVar, new AbstractC8174A.a(2)}, p.f63105a);
        Zh.f fVar2 = t.f63138b;
        m mVar = m.f63099a;
        AbstractC8174A.a aVar = new AbstractC8174A.a(2);
        j jVar = j.f63093a;
        h hVar3 = new h(fVar2, new f[]{bVar, mVar, aVar, jVar}, (InterfaceC6835l) null, 4, (DefaultConstructorMarker) null);
        h hVar4 = new h(t.f63140c, new f[]{bVar, mVar, new AbstractC8174A.a(3), jVar}, (InterfaceC6835l) null, 4, (DefaultConstructorMarker) null);
        h hVar5 = new h(t.f63142d, new f[]{bVar, mVar, new AbstractC8174A.b(2), jVar}, (InterfaceC6835l) null, 4, (DefaultConstructorMarker) null);
        h hVar6 = new h(t.f63152i, new f[]{bVar}, (InterfaceC6835l) null, 4, (DefaultConstructorMarker) null);
        Zh.f fVar3 = t.f63150h;
        AbstractC8174A.d dVar = AbstractC8174A.d.f63072b;
        v.a aVar2 = v.a.f63176d;
        h hVar7 = new h(fVar3, new f[]{bVar, dVar, mVar, aVar2}, (InterfaceC6835l) null, 4, (DefaultConstructorMarker) null);
        Zh.f fVar4 = t.f63154j;
        AbstractC8174A.c cVar = AbstractC8174A.c.f63071b;
        f63109b = AbstractC3689v.o(hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, new h(fVar4, new f[]{bVar, cVar}, (InterfaceC6835l) null, 4, (DefaultConstructorMarker) null), new h(t.f63158m, new f[]{bVar, cVar}, (InterfaceC6835l) null, 4, (DefaultConstructorMarker) null), new h(t.f63159n, new f[]{bVar, cVar, aVar2}, (InterfaceC6835l) null, 4, (DefaultConstructorMarker) null), new h(t.f63118I, new f[]{bVar, dVar, mVar}, (InterfaceC6835l) null, 4, (DefaultConstructorMarker) null), new h(t.f63119J, new f[]{bVar, dVar, mVar}, (InterfaceC6835l) null, 4, (DefaultConstructorMarker) null), new h(t.f63144e, new f[]{k.a.f63096b}, q.f63106a), new h(t.f63148g, new f[]{bVar, v.b.f63177d, dVar, mVar}, (InterfaceC6835l) null, 4, (DefaultConstructorMarker) null), new h(t.f63135Z, new f[]{bVar, dVar, mVar}, (InterfaceC6835l) null, 4, (DefaultConstructorMarker) null), new h(t.f63134Y, new f[]{bVar, cVar}, (InterfaceC6835l) null, 4, (DefaultConstructorMarker) null), new h(AbstractC3689v.o(t.f63169x, t.f63170y), new f[]{bVar}, r.f63107a), new h(t.f63145e0, new f[]{bVar, v.c.f63178d, dVar, mVar}, (InterfaceC6835l) null, 4, (DefaultConstructorMarker) null), new h(t.f63161p, new f[]{bVar, cVar}, (InterfaceC6835l) null, 4, (DefaultConstructorMarker) null));
    }

    private s() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f(InterfaceC2515z Checks) {
        AbstractC6492s.i(Checks, "$this$Checks");
        List listI = Checks.i();
        AbstractC6492s.h(listI, "getValueParameters(...)");
        s0 s0Var = (s0) AbstractC3689v.D0(listI);
        boolean z10 = false;
        if (s0Var != null && !AbstractC5833e.f(s0Var) && s0Var.j0() == null) {
            z10 = true;
        }
        if (z10) {
            return null;
        }
        return "last parameter should not have a default value or be a vararg";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[EDGE_INSN: B:26:0x0050->B:17:0x0050 BREAK  A[LOOP:0: B:8:0x002d->B:27:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String g(Bh.InterfaceC2515z r3) {
        /*
            java.lang.String r0 = "$this$Checks"
            kotlin.jvm.internal.AbstractC6492s.i(r3, r0)
            Bh.m r0 = r3.b()
            java.lang.String r1 = "getContainingDeclaration(...)"
            kotlin.jvm.internal.AbstractC6492s.h(r0, r1)
            boolean r0 = h(r0)
            if (r0 != 0) goto L50
            java.util.Collection r0 = r3.f()
            java.lang.String r2 = "getOverriddenDescriptors(...)"
            kotlin.jvm.internal.AbstractC6492s.h(r0, r2)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L29
            goto L47
        L29:
            java.util.Iterator r0 = r0.iterator()
        L2d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L47
            java.lang.Object r2 = r0.next()
            Bh.z r2 = (Bh.InterfaceC2515z) r2
            Bh.m r2 = r2.b()
            kotlin.jvm.internal.AbstractC6492s.h(r2, r1)
            boolean r2 = h(r2)
            if (r2 == 0) goto L2d
            goto L50
        L47:
            boolean r0 = Bh.AbstractC2508s.c(r3)
            if (r0 == 0) goto L4e
            goto L50
        L4e:
            r0 = 0
            goto L51
        L50:
            r0 = 1
        L51:
            if (r0 != 0) goto Lab
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "must override ''equals()'' in Any"
            r0.append(r2)
            Bh.m r2 = r3.b()
            kotlin.jvm.internal.AbstractC6492s.h(r2, r1)
            boolean r1 = bi.k.g(r2)
            if (r1 == 0) goto La1
            kotlin.reflect.jvm.internal.impl.renderer.n r1 = kotlin.reflect.jvm.internal.impl.renderer.n.f52070j
            Bh.m r3 = r3.b()
            java.lang.String r2 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            kotlin.jvm.internal.AbstractC6492s.g(r3, r2)
            Bh.e r3 = (Bh.InterfaceC2495e) r3
            pi.d0 r3 = r3.u()
            java.lang.String r2 = "getDefaultType(...)"
            kotlin.jvm.internal.AbstractC6492s.h(r3, r2)
            pi.S r3 = si.AbstractC7984d.D(r3)
            java.lang.String r3 = r1.U(r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = " or define ''equals(other: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = "): Boolean''"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.append(r3)
        La1:
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.AbstractC6492s.h(r3, r0)
            goto Lac
        Lab:
            r3 = 0
        Lac:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ui.s.g(Bh.z):java.lang.String");
    }

    private static final boolean h(InterfaceC2503m interfaceC2503m) {
        return (interfaceC2503m instanceof InterfaceC2495e) && kotlin.reflect.jvm.internal.impl.builtins.i.a0((InterfaceC2495e) interfaceC2503m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String i(InterfaceC2515z Checks) {
        boolean zW;
        AbstractC6492s.i(Checks, "$this$Checks");
        b0 b0VarD0 = Checks.d0();
        if (b0VarD0 == null) {
            b0VarD0 = Checks.k0();
        }
        s sVar = f63108a;
        boolean z10 = false;
        if (b0VarD0 != null) {
            S returnType = Checks.getReturnType();
            if (returnType != null) {
                S type = b0VarD0.getType();
                AbstractC6492s.h(type, "getType(...)");
                zW = AbstractC7984d.w(returnType, type);
            } else {
                zW = false;
            }
            if (zW || sVar.j(Checks, b0VarD0)) {
                z10 = true;
            }
        }
        if (z10) {
            return null;
        }
        return "receiver must be a supertype of the return type";
    }

    private final boolean j(InterfaceC2515z interfaceC2515z, b0 b0Var) {
        Zh.b bVarN;
        S returnType;
        InterfaceC6346g value = b0Var.getValue();
        AbstractC6492s.h(value, "getValue(...)");
        if (!(value instanceof C6344e)) {
            return false;
        }
        InterfaceC2495e interfaceC2495eT = ((C6344e) value).t();
        if (!interfaceC2495eT.L() || (bVarN = AbstractC5833e.n(interfaceC2495eT)) == null) {
            return false;
        }
        InterfaceC2498h interfaceC2498hC = AbstractC2514y.c(AbstractC5833e.s(interfaceC2495eT), bVarN);
        k0 k0Var = interfaceC2498hC instanceof k0 ? (k0) interfaceC2498hC : null;
        if (k0Var == null || (returnType = interfaceC2515z.getReturnType()) == null) {
            return false;
        }
        return AbstractC7984d.w(returnType, k0Var.U());
    }

    @Override // ui.AbstractC8176b
    public List b() {
        return f63109b;
    }
}
