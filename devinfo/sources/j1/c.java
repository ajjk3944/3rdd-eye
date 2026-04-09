package j1;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import i2.e0;
import n1.s;
import x.v;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c extends k implements p2.m, n1.f {

    /* renamed from: a, reason: collision with root package name */
    public final q f27041a;

    /* renamed from: b, reason: collision with root package name */
    public final p2.r f27042b;

    /* renamed from: c, reason: collision with root package name */
    public final j2.r f27043c;

    /* renamed from: d, reason: collision with root package name */
    public final q2.b f27044d;

    /* renamed from: e, reason: collision with root package name */
    public final String f27045e;

    /* renamed from: f, reason: collision with root package name */
    public final AutofillId f27046f;
    public final v g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f27047h;

    public c(q qVar, p2.r rVar, j2.r rVar2, q2.b bVar, String str) {
        this.f27041a = qVar;
        this.f27042b = rVar;
        this.f27043c = rVar2;
        this.f27044d = bVar;
        this.f27045e = str;
        new Rect();
        rVar2.setImportantForAutofill(1);
        q qVarF = nh.a.f(rVar2);
        AutofillId autofillId = qVarF != null ? (AutofillId) qVarF.f27058a : null;
        if (autofillId == null) {
            throw d.h.o("Required value was null.");
        }
        this.f27046f = autofillId;
        this.g = new v();
    }

    @Override // n1.f
    public final void a(s sVar, s sVar2) {
        e0 e0VarS;
        p2.l lVarX;
        e0 e0VarS2;
        p2.l lVarX2;
        if (sVar != null && (e0VarS2 = i2.k.s(sVar)) != null && (lVarX2 = e0VarS2.x()) != null) {
            x.e0 e0Var = lVarX2.f31095a;
            if (e0Var.b(p2.k.g) || e0Var.b(p2.k.f31077h)) {
                this.f27041a.i(this.f27043c, e0VarS2.f25628b);
            }
        }
        if (sVar2 == null || (e0VarS = i2.k.s(sVar2)) == null || (lVarX = e0VarS.x()) == null) {
            return;
        }
        x.e0 e0Var2 = lVarX.f31095a;
        if (e0Var2.b(p2.k.g) || e0Var2.b(p2.k.f31077h)) {
            int i4 = e0VarS.f25628b;
            this.f27044d.f32147a.p(i4, new b(this, i4));
        }
    }

    public final void b(SparseArray sparseArray) {
        p2.l lVarX;
        mk.c cVar;
        mk.c cVar2;
        int size = sparseArray.size();
        for (int i4 = 0; i4 < size; i4++) {
            int iKeyAt = sparseArray.keyAt(i4);
            AutofillValue autofillValueG = f4.b.g(sparseArray.get(iKeyAt));
            e0 e0Var = (e0) this.f27042b.f31111c.b(iKeyAt);
            if (e0Var != null && (lVarX = e0Var.x()) != null) {
                x.e0 e0Var2 = lVarX.f31095a;
                Object objG = e0Var2.g(p2.k.g);
                if (objG == null) {
                    objG = null;
                }
                p2.a aVar = (p2.a) objG;
                if (aVar != null && (cVar2 = (mk.c) aVar.f31037b) != null) {
                }
                Object objG2 = e0Var2.g(p2.k.f31077h);
                p2.a aVar2 = (p2.a) (objG2 != null ? objG2 : null);
                if (aVar2 != null && (cVar = (mk.c) aVar2.f31037b) != null) {
                }
            }
        }
    }
}
