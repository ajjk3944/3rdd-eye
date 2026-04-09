package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import j$.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class x implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final Application f19555a;

    /* renamed from: b, reason: collision with root package name */
    public final v f19556b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f19557c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f19558d;

    /* renamed from: e, reason: collision with root package name */
    public final v0 f19559e;

    /* renamed from: f, reason: collision with root package name */
    public final a0.x0 f19560f;
    public final m g;

    /* renamed from: h, reason: collision with root package name */
    public final h f19561h;

    public x(Application application, v vVar, Handler handler, Executor executor, v0 v0Var, a0.x0 x0Var, m mVar, h hVar) {
        this.f19555a = application;
        this.f19556b = vVar;
        this.f19557c = handler;
        this.f19558d = executor;
        this.f19559e = v0Var;
        this.f19560f = x0Var;
        this.g = mVar;
        this.f19561h = hVar;
    }

    public final void a(String str) {
        Log.d("UserMessagingPlatform", "Receive consent action: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        String queryParameter = uri.getQueryParameter("action");
        String queryParameter2 = uri.getQueryParameter("args");
        k0[] k0VarArr = {this, this.f19560f};
        v0 v0Var = this.f19559e;
        v0Var.getClass();
        v0Var.f19542a.execute(new b4.o(queryParameter, queryParameter2, k0VarArr, false, 2));
    }

    @Override // com.google.android.gms.internal.consent_sdk.k0
    public final Executor b() {
        final Handler handler = this.f19557c;
        Objects.requireNonNull(handler);
        return new Executor() { // from class: com.google.android.gms.internal.consent_sdk.w
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r7.equals("non_personalized") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        if (r7.equals("CONSENT_SIGNAL_PERSONALIZED_ADS") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r7.equals("CONSENT_SIGNAL_SUFFICIENT") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        if (r7.equals("personalized") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        if (r7.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        r7 = 3;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cb  */
    @Override // com.google.android.gms.internal.consent_sdk.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(java.lang.String r7, org.json.JSONObject r8) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.x.c(java.lang.String, org.json.JSONObject):boolean");
    }
}
