package T1;

import androidx.work.q;
import d2.C4268c;

/* compiled from: OperationImpl.java */
/* renamed from: T1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1598j implements androidx.work.q {

    /* renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.E<q.a> f12182c = new androidx.lifecycle.E<>();

    /* renamed from: d, reason: collision with root package name */
    public final C4268c<q.a.c> f12183d = new C4268c<>();

    public C1598j() {
        a(androidx.work.q.f17019b);
    }

    public final void a(q.a aVar) {
        this.f12182c.k(aVar);
        boolean z10 = aVar instanceof q.a.c;
        C4268c<q.a.c> c4268c = this.f12183d;
        if (z10) {
            c4268c.i((q.a.c) aVar);
        } else if (aVar instanceof q.a.C0272a) {
            c4268c.j(((q.a.C0272a) aVar).f17020a);
        }
    }
}
