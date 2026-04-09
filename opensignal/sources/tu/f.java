package tu;

import bc.p;
import br.l;
import java.util.ArrayList;
import ou.a0;
import ou.c0;
import ou.u;
import su.i;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final i f23014a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f23015b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23016c;

    /* renamed from: d, reason: collision with root package name */
    public final p f23017d;

    /* renamed from: e, reason: collision with root package name */
    public final a0 f23018e;

    /* renamed from: f, reason: collision with root package name */
    public final int f23019f;

    /* renamed from: g, reason: collision with root package name */
    public final int f23020g;

    /* renamed from: h, reason: collision with root package name */
    public final int f23021h;

    /* renamed from: i, reason: collision with root package name */
    public int f23022i;

    public f(i iVar, ArrayList arrayList, int i10, p pVar, a0 a0Var, int i11, int i12, int i13) {
        l.e(a0Var, "request");
        this.f23014a = iVar;
        this.f23015b = arrayList;
        this.f23016c = i10;
        this.f23017d = pVar;
        this.f23018e = a0Var;
        this.f23019f = i11;
        this.f23020g = i12;
        this.f23021h = i13;
    }

    public static f a(f fVar, int i10, p pVar, a0 a0Var, int i11) {
        if ((i11 & 1) != 0) {
            i10 = fVar.f23016c;
        }
        int i12 = i10;
        if ((i11 & 2) != 0) {
            pVar = fVar.f23017d;
        }
        p pVar2 = pVar;
        if ((i11 & 4) != 0) {
            a0Var = fVar.f23018e;
        }
        a0 a0Var2 = a0Var;
        int i13 = fVar.f23019f;
        int i14 = fVar.f23020g;
        int i15 = fVar.f23021h;
        l.e(a0Var2, "request");
        return new f(fVar.f23014a, fVar.f23015b, i12, pVar2, a0Var2, i13, i14, i15);
    }

    public final c0 b(a0 a0Var) {
        l.e(a0Var, "request");
        ArrayList arrayList = this.f23015b;
        int size = arrayList.size();
        int i10 = this.f23016c;
        if (i10 >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.f23022i++;
        p pVar = this.f23017d;
        if (pVar != null) {
            if (!((su.e) pVar.f2639d).b(a0Var.f19860a)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i10 - 1) + " must retain the same host and port").toString());
            }
            if (this.f23022i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i10 - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i11 = i10 + 1;
        f fVarA = a(this, i11, null, a0Var, 58);
        u uVar = (u) arrayList.get(i10);
        c0 c0VarA = uVar.a(fVarA);
        if (c0VarA == null) {
            throw new NullPointerException("interceptor " + uVar + " returned null");
        }
        if (pVar != null && i11 < arrayList.size() && fVarA.f23022i != 1) {
            throw new IllegalStateException(("network interceptor " + uVar + " must call proceed() exactly once").toString());
        }
        if (c0VarA.B != null) {
            return c0VarA;
        }
        throw new IllegalStateException(("interceptor " + uVar + " returned a response with no body").toString());
    }
}
