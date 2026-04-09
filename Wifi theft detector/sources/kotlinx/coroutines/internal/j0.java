package kotlinx.coroutines.internal;

import kotlinx.coroutines.o2;

/* loaded from: classes4.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.coroutines.d f22541a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f22542b;

    /* renamed from: c, reason: collision with root package name */
    public final o2[] f22543c;

    /* renamed from: d, reason: collision with root package name */
    public int f22544d;

    public j0(kotlin.coroutines.d dVar, int i10) {
        this.f22541a = dVar;
        this.f22542b = new Object[i10];
        this.f22543c = new o2[i10];
    }

    public final void a(o2 o2Var, Object obj) {
        Object[] objArr = this.f22542b;
        int i10 = this.f22544d;
        objArr[i10] = obj;
        o2[] o2VarArr = this.f22543c;
        this.f22544d = i10 + 1;
        kotlin.jvm.internal.p.c(o2Var, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        o2VarArr[i10] = o2Var;
    }

    public final void b(kotlin.coroutines.d dVar) {
        int length = this.f22543c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            o2 o2Var = this.f22543c[length];
            kotlin.jvm.internal.p.b(o2Var);
            o2Var.j(dVar, this.f22542b[length]);
            if (i10 < 0) {
                return;
            } else {
                length = i10;
            }
        }
    }
}
