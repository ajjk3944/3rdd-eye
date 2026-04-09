package com.zipoapps.premiumhelper.toto;

import A9.C0583j;
import J8.C0691f;
import J8.C0702q;
import android.content.Context;
import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.e;
import androidx.work.n;
import androidx.work.p;
import b2.C1842w;
import b9.C1992A;
import c9.C2097r;
import c9.C2101v;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import com.yandex.mobile.ads.impl.A3;
import com.zipoapps.premiumhelper.c;
import f5.InterfaceC4335a;
import f9.InterfaceC4347e;
import g2.AbstractC4381e;
import java.util.Collections;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.x;
import r8.d;
import va.a;
import w9.i;

/* compiled from: TotoRegisterWorker.kt */
/* loaded from: classes3.dex */
public final class TotoRegisterWorker extends CoroutineWorker {
    static final /* synthetic */ i<Object>[] $$delegatedProperties;
    public static final Companion Companion;
    private static final String TAG = "RegisterWorker";
    private final d log$delegate;
    private final c preferences;

    /* compiled from: TotoRegisterWorker.kt */
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public static /* synthetic */ void schedule$default(Companion companion, Context context, String str, int i, Object obj) throws Throwable {
            if ((i & 2) != 0) {
                str = "";
            }
            companion.schedule(context, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C1992A schedule$lambda$0(p pVar, AbstractC4381e it) {
            l.f(it, "it");
            it.c(TotoRegisterWorker.TAG, androidx.work.g.KEEP, Collections.singletonList(pVar));
            return C1992A.f18074a;
        }

        public final void schedule(Context context) throws Throwable {
            l.f(context, "context");
            schedule$default(this, context, null, 2, null);
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void schedule(Context context, String fcmToken) throws Throwable {
            l.f(context, "context");
            l.f(fcmToken, "fcmToken");
            b9.l[] lVarArr = {new b9.l("fcm_token", fcmToken)};
            e.a aVar = new e.a();
            b9.l lVar = lVarArr[0];
            aVar.a(lVar.f18084c, (String) lVar.f18083b);
            e eVar = new e(aVar.f16895a);
            e.i(eVar);
            n nVar = n.NOT_REQUIRED;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            n networkType = n.CONNECTED;
            l.f(networkType, "networkType");
            androidx.work.d dVar = new androidx.work.d(networkType, false, false, false, false, -1L, -1L, Build.VERSION.SDK_INT >= 24 ? C2097r.L0(linkedHashSet) : C2101v.f18583b);
            p.a aVar2 = new p.a(TotoRegisterWorker.class);
            C1842w c1842w = aVar2.f17047c;
            c1842w.f17146j = dVar;
            c1842w.f17142e = eVar;
            C0702q.c(AbstractC4381e.d(context), null, new C0691f(aVar2.a(), 2), 3);
        }
    }

    /* compiled from: TotoRegisterWorker.kt */
    @h9.e(c = "com.zipoapps.premiumhelper.toto.TotoRegisterWorker", f = "TotoRegisterWorker.kt", l = {54, 61}, m = "doWork")
    /* renamed from: com.zipoapps.premiumhelper.toto.TotoRegisterWorker$doWork$1, reason: invalid class name */
    public static final class AnonymousClass1 extends h9.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC4347e<? super AnonymousClass1> interfaceC4347e) {
            super(interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= RecyclerView.UNDEFINED_DURATION;
            return TotoRegisterWorker.this.doWork(this);
        }
    }

    static {
        q qVar = new q(TotoRegisterWorker.class, "log", "getLog()Lcom/zipoapps/premiumhelper/log/TimberLogger;", 0);
        x.f43661a.getClass();
        $$delegatedProperties = new i[]{qVar};
        Companion = new Companion(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotoRegisterWorker(Context context, WorkerParameters params) {
        super(context, params);
        l.f(context, "context");
        l.f(params, "params");
        this.log$delegate = new d(TAG);
        this.preferences = new c(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getFcmToken(InterfaceC4347e<? super String> interfaceC4347e) {
        FirebaseMessaging firebaseMessaging;
        Task<String> task;
        String strH = getInputData().h("fcm_token");
        if (strH != null && strH.length() != 0) {
            getLog().g("New FCM token: ".concat(strH), new Object[0]);
            return strH;
        }
        final C0583j c0583j = new C0583j(1, com.google.gson.internal.c.r(interfaceC4347e));
        c0583j.s();
        try {
            getLog().g("Requesting FCM token", new Object[0]);
            com.google.firebase.messaging.a aVar = FirebaseMessaging.f23255l;
            synchronized (FirebaseMessaging.class) {
                firebaseMessaging = FirebaseMessaging.getInstance(B4.e.c());
            }
            InterfaceC4335a interfaceC4335a = firebaseMessaging.f23259b;
            if (interfaceC4335a != null) {
                task = interfaceC4335a.b();
            } else {
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                firebaseMessaging.f23264g.execute(new A3(6, firebaseMessaging, taskCompletionSource));
                task = taskCompletionSource.getTask();
            }
            l.c(task.addOnCompleteListener(new OnCompleteListener() { // from class: com.zipoapps.premiumhelper.toto.TotoRegisterWorker$getFcmToken$2$1
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task<String> it) {
                    l.f(it, "it");
                    if (it.isSuccessful()) {
                        this.this$0.getLog().g("Got FCM token: " + ((Object) it.getResult()), new Object[0]);
                        if (c0583j.isActive()) {
                            c0583j.resumeWith(it.getResult());
                            return;
                        }
                        return;
                    }
                    Exception exception = it.getException();
                    if (exception != null) {
                        a.b bVar = va.a.f47104a;
                        bVar.o("PremiumHelper");
                        bVar.d(exception);
                        K4.e.a().b(exception);
                    }
                    if (c0583j.isActive()) {
                        c0583j.resumeWith(null);
                    }
                }
            }));
        } catch (Throwable th) {
            getLog().e(th, "Failed to retrieve FCM token", new Object[0]);
            if (c0583j.isActive()) {
                c0583j.resumeWith(null);
            }
        }
        Object objR = c0583j.r();
        g9.a aVar2 = g9.a.COROUTINE_SUSPENDED;
        return objR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r8.c getLog() {
        return this.log$delegate.a(this, $$delegatedProperties[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object doWork(f9.InterfaceC4347e<? super androidx.work.l.a> r7) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zipoapps.premiumhelper.toto.TotoRegisterWorker.doWork(f9.e):java.lang.Object");
    }
}
