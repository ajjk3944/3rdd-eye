package com.applovin.impl;

import C.C0624k;
import C.k0;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.util.Size;
import androidx.camera.view.PreviewView;
import b9.C1992A;
import com.applovin.impl.AbstractC2113d;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.a;
import com.yandex.mobile.ads.impl.bd1;
import com.yandex.mobile.ads.impl.dz0;
import com.yandex.mobile.ads.impl.ed;
import com.yandex.mobile.ads.impl.nr0;
import com.zipoapps.premiumhelper.e;
import com.zipoapps.premiumhelper.ui.rate.f;
import g0.AbstractC4357d;
import g0.C4355b;
import g0.C4364k;
import i8.C4461a;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import o0.b;
import org.json.JSONObject;
import s5.C5576b;
import v.C5652g;
import x4.AbstractC5767b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class A0 implements AbstractC2113d.b, dz0.a, nr0.a, b.c, k0.e, SuccessContinuation, Continuation, I.a, OnCompleteListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18774b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18775c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18776d;

    public /* synthetic */ A0(Object obj, Object obj2, Object obj3) {
        this.f18774b = obj;
        this.f18775c = obj2;
        this.f18776d = obj3;
    }

    @Override // com.applovin.impl.AbstractC2113d.b
    public void a(Activity activity) {
        d2 d2Var = (d2) this.f18775c;
        AbstractActivityC2136o.a((C2131m) this.f18774b, d2Var, (com.applovin.impl.sdk.k) this.f18776d, (MaxDebuggerAdUnitDetailActivity) activity);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x014c A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:4:0x001c, B:10:0x002b, B:11:0x0043, B:15:0x0048, B:16:0x004e, B:18:0x0054, B:19:0x0069, B:20:0x00ca, B:22:0x00d0, B:23:0x00e8, B:25:0x00fc, B:27:0x0100, B:28:0x010c, B:29:0x0122, B:31:0x0128, B:33:0x0136, B:35:0x013e, B:39:0x014c, B:41:0x0160, B:43:0x0178, B:44:0x0183, B:46:0x01a0, B:48:0x01a4, B:49:0x01ad, B:50:0x01ce, B:52:0x01d4, B:53:0x01e4, B:55:0x01fa, B:56:0x01ff, B:57:0x0207, B:60:0x020a, B:61:0x020f, B:63:0x0211, B:64:0x0229), top: B:68:0x001c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0176  */
    @Override // I.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public A4.a apply(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.A0.apply(java.lang.Object):A4.a");
    }

    @Override // C.k0.e
    public void f(C0624k c0624k) {
        AbstractC4357d abstractC4357d;
        PreviewView.a aVar = (PreviewView.a) this.f18774b;
        aVar.getClass();
        C.S.a("PreviewView", "Preview transformation info updated. " + c0624k);
        boolean z10 = ((androidx.camera.core.impl.J) this.f18775c).n().g() == 0;
        PreviewView previewView = PreviewView.this;
        Size size = ((C.k0) this.f18776d).f732b;
        androidx.camera.view.b bVar = previewView.f15161e;
        bVar.getClass();
        C.S.a("PreviewTransform", "Transformation info set: " + c0624k + " " + size + " " + z10);
        bVar.f15178b = c0624k.f724a;
        bVar.f15179c = c0624k.f725b;
        int i = c0624k.f726c;
        bVar.f15181e = i;
        bVar.f15177a = size;
        bVar.f15182f = z10;
        bVar.f15183g = c0624k.f727d;
        bVar.f15180d = c0624k.f728e;
        if (i == -1 || ((abstractC4357d = previewView.f15159c) != null && (abstractC4357d instanceof C4364k))) {
            previewView.f15162f = true;
        } else {
            previewView.f15162f = false;
        }
        previewView.a();
    }

    @Override // o0.b.c
    public Object i(b.a aVar) {
        ((androidx.camera.view.a) this.f18774b).getClass();
        C.r rVar = (C.r) this.f18775c;
        C4355b c4355b = new C4355b(aVar, rVar);
        ((ArrayList) this.f18776d).add(c4355b);
        ((androidx.camera.core.impl.I) rVar).f(E.u.y(), c4355b);
        return "waitForCaptureResult";
    }

    @Override // com.yandex.mobile.ads.impl.nr0.a
    public void invoke(Object obj) {
        ((ed) obj).getClass();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task response) {
        x4.f fVar = (x4.f) this.f18774b;
        Activity activity = (Activity) this.f18775c;
        kotlin.jvm.internal.l.f(response, "response");
        boolean zIsSuccessful = response.isSuccessful();
        f.a aVar = (f.a) this.f18776d;
        if (!zIsSuccessful) {
            aVar.a(f.c.NONE);
            return;
        }
        com.zipoapps.premiumhelper.e.f37006D.getClass();
        C4461a c4461a = e.a.a().f37021k;
        kotlin.jvm.internal.l.f(c4461a, "<this>");
        c4461a.u("First_rate_in_app_review_shown", new Bundle[0]);
        com.zipoapps.premiumhelper.e eVarA = e.a.a();
        C4461a.b type = C4461a.b.IN_APP_REVIEW;
        C4461a c4461a2 = eVarA.f37021k;
        c4461a2.getClass();
        kotlin.jvm.internal.l.f(type, "type");
        c4461a2.s("Rate_us_shown", G0.d.a(new b9.l("type", type.getValue())));
        AbstractC5767b abstractC5767b = (AbstractC5767b) response.getResult();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            Task<Void> taskA = fVar.a(activity, abstractC5767b);
            kotlin.jvm.internal.l.e(taskA, "launchReviewFlow(...)");
            taskA.addOnCompleteListener(new C5652g(jCurrentTimeMillis, aVar));
        } catch (ActivityNotFoundException e4) {
            va.a.f47104a.d(e4);
            aVar.a(f.c.NONE);
            C1992A c1992a = C1992A.f18074a;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        com.google.firebase.remoteconfig.internal.b bVar;
        r5.e eVar = (r5.e) this.f18774b;
        eVar.getClass();
        Task task2 = (Task) this.f18775c;
        if (!task2.isSuccessful() || task2.getResult() == null) {
            return Tasks.forResult(Boolean.FALSE);
        }
        com.google.firebase.remoteconfig.internal.b bVar2 = (com.google.firebase.remoteconfig.internal.b) task2.getResult();
        Task task3 = (Task) this.f18776d;
        if (task3.isSuccessful() && (bVar = (com.google.firebase.remoteconfig.internal.b) task3.getResult()) != null && bVar2.f23300c.equals(bVar.f23300c)) {
            return Tasks.forResult(Boolean.FALSE);
        }
        C5576b c5576b = eVar.f45693d;
        c5576b.getClass();
        com.vungle.ads.internal.executor.h hVar = new com.vungle.ads.internal.executor.h(2, c5576b, bVar2);
        Executor executor = c5576b.f46070a;
        return Tasks.call(executor, hVar).onSuccessTask(executor, new B.i(10, c5576b, bVar2)).continueWith(eVar.f45691b, new B.d(eVar, 24));
    }

    @Override // com.yandex.mobile.ads.impl.dz0.a
    public void a(JSONObject jSONObject) {
        bd1.a((bd1) this.f18774b, (CountDownLatch) this.f18775c, (ArrayList) this.f18776d, jSONObject);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        String strD;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f18774b;
        String str = (String) this.f18775c;
        a.C0348a c0348a = (a.C0348a) this.f18776d;
        String str2 = (String) obj;
        com.google.firebase.messaging.a aVarC = FirebaseMessaging.c(firebaseMessaging.f23260c);
        B4.e eVar = firebaseMessaging.f23258a;
        eVar.a();
        if ("[DEFAULT]".equals(eVar.f488b)) {
            strD = "";
        } else {
            strD = eVar.d();
        }
        String strA = firebaseMessaging.i.a();
        synchronized (aVarC) {
            String strA2 = a.C0348a.a(str2, strA, System.currentTimeMillis());
            if (strA2 != null) {
                SharedPreferences.Editor editorEdit = aVarC.f23272a.edit();
                editorEdit.putString(strD + "|T|" + str + "|*", strA2);
                editorEdit.commit();
            }
        }
        if (c0348a == null || !str2.equals(c0348a.f23274a)) {
            B4.e eVar2 = firebaseMessaging.f23258a;
            eVar2.a();
            if ("[DEFAULT]".equals(eVar2.f488b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb = new StringBuilder("Invoking onNewToken for app: ");
                    eVar2.a();
                    sb.append(eVar2.f488b);
                    Log.d("FirebaseMessaging", sb.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new n5.i(firebaseMessaging.f23260c).b(intent);
            }
        }
        return Tasks.forResult(str2);
    }
}
