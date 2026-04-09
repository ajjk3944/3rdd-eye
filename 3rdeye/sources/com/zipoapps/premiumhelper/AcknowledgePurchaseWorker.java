package com.zipoapps.premiumhelper;

import J8.C0700o;
import J8.C0702q;
import android.content.Context;
import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.n;
import androidx.work.p;
import b9.C1992A;
import c9.C2097r;
import c9.C2101v;
import f9.InterfaceC4347e;
import g2.AbstractC4381e;
import h9.i;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.l;

/* compiled from: AcknowledgePurchaseWorker.kt */
/* loaded from: classes3.dex */
public final class AcknowledgePurchaseWorker extends CoroutineWorker {

    /* compiled from: AcknowledgePurchaseWorker.kt */
    public static final class a {
        public static Object a(d dVar, i iVar) {
            n nVar = n.NOT_REQUIRED;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            n networkType = n.CONNECTED;
            l.f(networkType, "networkType");
            androidx.work.d dVar2 = new androidx.work.d(networkType, false, false, false, false, -1L, -1L, Build.VERSION.SDK_INT >= 24 ? C2097r.L0(linkedHashSet) : C2101v.f18583b);
            p.a aVar = new p.a(AcknowledgePurchaseWorker.class);
            aVar.f17047c.f17146j = dVar2;
            Object objD = C0702q.d(AbstractC4381e.d(dVar), 5, 100L, C0700o.f2882b, new com.zipoapps.premiumhelper.toto.a(aVar.a(), 1), iVar);
            return objD == g9.a.COROUTINE_SUSPENDED ? objD : C1992A.f18074a;
        }
    }

    /* compiled from: AcknowledgePurchaseWorker.kt */
    @h9.e(c = "com.zipoapps.premiumhelper.AcknowledgePurchaseWorker", f = "AcknowledgePurchaseWorker.kt", l = {37}, m = "doWork")
    public static final class b extends h9.c {

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f36996l;

        /* renamed from: n, reason: collision with root package name */
        public int f36998n;

        public b(InterfaceC4347e<? super b> interfaceC4347e) {
            super(interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            this.f36996l = obj;
            this.f36998n |= RecyclerView.UNDEFINED_DURATION;
            return AcknowledgePurchaseWorker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcknowledgePurchaseWorker(Context context, WorkerParameters params) {
        super(context, params);
        l.f(context, "context");
        l.f(params, "params");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object doWork(f9.InterfaceC4347e<? super androidx.work.l.a> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.zipoapps.premiumhelper.AcknowledgePurchaseWorker.b
            if (r0 == 0) goto L13
            r0 = r5
            com.zipoapps.premiumhelper.AcknowledgePurchaseWorker$b r0 = (com.zipoapps.premiumhelper.AcknowledgePurchaseWorker.b) r0
            int r1 = r0.f36998n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36998n = r1
            goto L18
        L13:
            com.zipoapps.premiumhelper.AcknowledgePurchaseWorker$b r0 = new com.zipoapps.premiumhelper.AcknowledgePurchaseWorker$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f36996l
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f36998n
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            b9.n.b(r5)
            goto L48
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            b9.n.b(r5)
            com.zipoapps.premiumhelper.e$a r5 = com.zipoapps.premiumhelper.e.f37006D
            r5.getClass()
            com.zipoapps.premiumhelper.e r5 = com.zipoapps.premiumhelper.e.a.a()
            r0.f36998n = r3
            w9.i<java.lang.Object>[] r2 = k8.t.f43568n
            k8.t r5 = r5.f37027q
            java.lang.Object r5 = r5.g(r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            androidx.work.l$a$c r5 = new androidx.work.l$a$c
            r5.<init>()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zipoapps.premiumhelper.AcknowledgePurchaseWorker.doWork(f9.e):java.lang.Object");
    }
}
