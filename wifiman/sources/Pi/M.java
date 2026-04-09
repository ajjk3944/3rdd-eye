package pi;

import Bh.InterfaceC2498h;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class M extends E0 {

    /* renamed from: c, reason: collision with root package name */
    private final Bh.l0[] f58077c;

    /* renamed from: d, reason: collision with root package name */
    private final B0[] f58078d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f58079e;

    public /* synthetic */ M(Bh.l0[] l0VarArr, B0[] b0Arr, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(l0VarArr, b0Arr, (i10 & 4) != 0 ? false : z10);
    }

    @Override // pi.E0
    public boolean b() {
        return this.f58079e;
    }

    @Override // pi.E0
    public B0 e(S key) {
        AbstractC6492s.i(key, "key");
        InterfaceC2498h interfaceC2498hC = key.N0().c();
        Bh.l0 l0Var = interfaceC2498hC instanceof Bh.l0 ? (Bh.l0) interfaceC2498hC : null;
        if (l0Var == null) {
            return null;
        }
        int index = l0Var.getIndex();
        Bh.l0[] l0VarArr = this.f58077c;
        if (index >= l0VarArr.length || !AbstractC6492s.d(l0VarArr[index].k(), l0Var.k())) {
            return null;
        }
        return this.f58078d[index];
    }

    @Override // pi.E0
    public boolean f() {
        return this.f58078d.length == 0;
    }

    public final B0[] i() {
        return this.f58078d;
    }

    public final Bh.l0[] j() {
        return this.f58077c;
    }

    public M(Bh.l0[] parameters, B0[] arguments, boolean z10) {
        AbstractC6492s.i(parameters, "parameters");
        AbstractC6492s.i(arguments, "arguments");
        this.f58077c = parameters;
        this.f58078d = arguments;
        this.f58079e = z10;
        int length = parameters.length;
        int length2 = arguments.length;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public M(List parameters, List argumentsList) {
        this((Bh.l0[]) parameters.toArray(new Bh.l0[0]), (B0[]) argumentsList.toArray(new B0[0]), false, 4, null);
        AbstractC6492s.i(parameters, "parameters");
        AbstractC6492s.i(argumentsList, "argumentsList");
    }
}
