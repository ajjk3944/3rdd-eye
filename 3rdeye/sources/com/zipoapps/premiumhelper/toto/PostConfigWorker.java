package com.zipoapps.premiumhelper.toto;

import J8.C0702q;
import android.content.Context;
import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.d;
import androidx.work.n;
import androidx.work.p;
import b9.C1992A;
import c9.C2097r;
import c9.C2101v;
import f9.InterfaceC4347e;
import g2.AbstractC4381e;
import h9.c;
import h9.e;
import java.util.Collections;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* compiled from: PostConfigWorker.kt */
/* loaded from: classes3.dex */
public final class PostConfigWorker extends CoroutineWorker {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "PostConfigWorker";

    /* compiled from: PostConfigWorker.kt */
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C1992A scheduleNow$lambda$0(p pVar, AbstractC4381e it) {
            l.f(it, "it");
            it.c(PostConfigWorker.TAG, androidx.work.g.REPLACE, Collections.singletonList(pVar));
            return C1992A.f18074a;
        }

        public final void scheduleNow(Context context) {
            l.f(context, "context");
            n nVar = n.NOT_REQUIRED;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            n networkType = n.CONNECTED;
            l.f(networkType, "networkType");
            d dVar = new d(networkType, false, false, false, false, -1L, -1L, Build.VERSION.SDK_INT >= 24 ? C2097r.L0(linkedHashSet) : C2101v.f18583b);
            p.a aVar = new p.a(PostConfigWorker.class);
            aVar.f17047c.f17146j = dVar;
            C0702q.c(AbstractC4381e.d(context), null, new a(aVar.a(), 0), 3);
        }

        private Companion() {
        }
    }

    /* compiled from: PostConfigWorker.kt */
    @e(c = "com.zipoapps.premiumhelper.toto.PostConfigWorker", f = "PostConfigWorker.kt", l = {41, 43}, m = "doWork")
    /* renamed from: com.zipoapps.premiumhelper.toto.PostConfigWorker$doWork$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC4347e<? super AnonymousClass1> interfaceC4347e) {
            super(interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= RecyclerView.UNDEFINED_DURATION;
            return PostConfigWorker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostConfigWorker(Context context, WorkerParameters params) {
        super(context, params);
        l.f(context, "context");
        l.f(params, "params");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (r6 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object doWork(f9.InterfaceC4347e<? super androidx.work.l.a> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.zipoapps.premiumhelper.toto.PostConfigWorker.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            com.zipoapps.premiumhelper.toto.PostConfigWorker$doWork$1 r0 = (com.zipoapps.premiumhelper.toto.PostConfigWorker.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.zipoapps.premiumhelper.toto.PostConfigWorker$doWork$1 r0 = new com.zipoapps.premiumhelper.toto.PostConfigWorker$doWork$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            b9.n.b(r6)
            goto L5f
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            b9.n.b(r6)
            goto L4b
        L36:
            b9.n.b(r6)
            com.zipoapps.premiumhelper.e$a r6 = com.zipoapps.premiumhelper.e.f37006D
            r6.getClass()
            com.zipoapps.premiumhelper.e r6 = com.zipoapps.premiumhelper.e.a.a()
            r0.label = r4
            java.lang.Object r6 = r6.o(r0)
            if (r6 != r1) goto L4b
            goto L5e
        L4b:
            com.zipoapps.premiumhelper.e$a r6 = com.zipoapps.premiumhelper.e.f37006D
            r6.getClass()
            com.zipoapps.premiumhelper.e r6 = com.zipoapps.premiumhelper.e.a.a()
            r0.label = r3
            com.zipoapps.premiumhelper.toto.TotoManager r6 = r6.f37033w
            java.lang.Object r6 = r6.postConfig(r0)
            if (r6 != r1) goto L5f
        L5e:
            return r1
        L5f:
            J8.E r6 = (J8.E) r6
            boolean r6 = r6 instanceof J8.E.b
            if (r6 == 0) goto L6b
            androidx.work.l$a$b r6 = new androidx.work.l$a$b
            r6.<init>()
            return r6
        L6b:
            androidx.work.l$a$c r6 = new androidx.work.l$a$c
            r6.<init>()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zipoapps.premiumhelper.toto.PostConfigWorker.doWork(f9.e):java.lang.Object");
    }
}
