package o2;

import androidx.room.c;
import gg.EnumC5911a;
import gg.i;
import gg.j;
import gg.k;
import gg.n;
import gg.r;
import gg.y;
import hg.InterfaceC6043c;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kg.InterfaceC6464a;
import m2.q;

/* renamed from: o2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7061d {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f55251a = new Object();

    /* renamed from: o2.d$a */
    class a extends c.AbstractC1124c {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f55252b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String[] strArr, j jVar) {
            super(strArr);
            this.f55252b = jVar;
        }

        @Override // androidx.room.c.AbstractC1124c
        public void c(Set set) {
            if (this.f55252b.isCancelled()) {
                return;
            }
            this.f55252b.h(AbstractC7061d.f55251a);
        }
    }

    public static i d(q qVar, boolean z10, String[] strArr, Callable callable) {
        y yVarB = Gg.a.b(f(qVar, z10));
        final n nVarM = n.m(callable);
        return e(qVar, strArr).F1(yVarB).g2(yVarB).X0(yVarB).v0(new kg.n() { // from class: o2.a
            @Override // kg.n
            public final Object apply(Object obj) {
                return AbstractC7061d.i(nVarM, obj);
            }
        });
    }

    public static i e(final q qVar, final String... strArr) {
        return i.N(new k() { // from class: o2.b
            @Override // gg.k
            public final void a(j jVar) {
                AbstractC7061d.h(strArr, qVar, jVar);
            }
        }, EnumC5911a.LATEST);
    }

    private static Executor f(q qVar, boolean z10) {
        return z10 ? qVar.q() : qVar.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(q qVar, c.AbstractC1124c abstractC1124c) {
        qVar.l().n(abstractC1124c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(String[] strArr, final q qVar, j jVar) {
        final a aVar = new a(strArr, jVar);
        if (!jVar.isCancelled()) {
            qVar.l().c(aVar);
            jVar.g(InterfaceC6043c.p(new InterfaceC6464a() { // from class: o2.c
                @Override // kg.InterfaceC6464a
                public final void run() {
                    AbstractC7061d.g(qVar, aVar);
                }
            }));
        }
        if (jVar.isCancelled()) {
            return;
        }
        jVar.h(f55251a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ r i(n nVar, Object obj) {
        return nVar;
    }
}
