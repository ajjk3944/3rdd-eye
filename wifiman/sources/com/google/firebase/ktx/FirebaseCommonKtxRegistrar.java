package com.google.firebase.ktx;

import F4.A;
import F4.g;
import F4.q;
import Ii.AbstractC3077r0;
import Ii.J;
import Yg.InterfaceC3661e;
import Zg.AbstractC3689v;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;

@InterfaceC3661e
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "LF4/c;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    public static final class a implements g {

        /* renamed from: a, reason: collision with root package name */
        public static final a f38907a = new a();

        @Override // F4.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final J a(F4.d dVar) {
            Object objF = dVar.f(A.a(E4.a.class, Executor.class));
            AbstractC6492s.h(objF, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC3077r0.a((Executor) objF);
        }
    }

    public static final class b implements g {

        /* renamed from: a, reason: collision with root package name */
        public static final b f38908a = new b();

        @Override // F4.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final J a(F4.d dVar) {
            Object objF = dVar.f(A.a(E4.c.class, Executor.class));
            AbstractC6492s.h(objF, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC3077r0.a((Executor) objF);
        }
    }

    public static final class c implements g {

        /* renamed from: a, reason: collision with root package name */
        public static final c f38909a = new c();

        @Override // F4.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final J a(F4.d dVar) {
            Object objF = dVar.f(A.a(E4.b.class, Executor.class));
            AbstractC6492s.h(objF, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC3077r0.a((Executor) objF);
        }
    }

    public static final class d implements g {

        /* renamed from: a, reason: collision with root package name */
        public static final d f38910a = new d();

        @Override // F4.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final J a(F4.d dVar) {
            Object objF = dVar.f(A.a(E4.d.class, Executor.class));
            AbstractC6492s.h(objF, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC3077r0.a((Executor) objF);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<F4.c> getComponents() {
        F4.c cVarC = F4.c.c(A.a(E4.a.class, J.class)).b(q.i(A.a(E4.a.class, Executor.class))).e(a.f38907a).c();
        AbstractC6492s.h(cVarC, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        F4.c cVarC2 = F4.c.c(A.a(E4.c.class, J.class)).b(q.i(A.a(E4.c.class, Executor.class))).e(b.f38908a).c();
        AbstractC6492s.h(cVarC2, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        F4.c cVarC3 = F4.c.c(A.a(E4.b.class, J.class)).b(q.i(A.a(E4.b.class, Executor.class))).e(c.f38909a).c();
        AbstractC6492s.h(cVarC3, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        F4.c cVarC4 = F4.c.c(A.a(E4.d.class, J.class)).b(q.i(A.a(E4.d.class, Executor.class))).e(d.f38910a).c();
        AbstractC6492s.h(cVarC4, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return AbstractC3689v.o(cVarC, cVarC2, cVarC3, cVarC4);
    }
}
