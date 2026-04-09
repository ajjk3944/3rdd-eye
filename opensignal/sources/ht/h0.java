package ht;

import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class h0 extends n0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10907c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10908d;

    public /* synthetic */ h0(int i10, Object obj) {
        this.f10907c = i10;
        this.f10908d = obj;
    }

    @Override // ht.s0
    public boolean a() {
        switch (this.f10907c) {
            case 1:
                return false;
            default:
                return super.a();
        }
    }

    @Override // ht.s0
    public boolean e() {
        switch (this.f10907c) {
            case 1:
                return ((Map) this.f10908d).isEmpty();
            default:
                return super.e();
        }
    }

    @Override // ht.n0
    public final p0 g(m0 m0Var) {
        switch (this.f10907c) {
            case 0:
                br.l.e(m0Var, "key");
                if (!((ArrayList) this.f10908d).contains(m0Var)) {
                    return null;
                }
                rr.i iVarP = m0Var.p();
                br.l.c(iVarP, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
                return a1.j((rr.r0) iVarP);
            default:
                br.l.e(m0Var, "key");
                return (p0) ((Map) this.f10908d).get(m0Var);
        }
    }
}
