package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.webkit.WebView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class u extends WebView {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f19526d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Handler f19527a;

    /* renamed from: b, reason: collision with root package name */
    public final x f19528b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19529c;

    public u(v vVar, Handler handler, x xVar) {
        super(vVar);
        this.f19529c = false;
        this.f19527a = handler;
        this.f19528b = xVar;
    }

    public final void a(String str, String str2) {
        this.f19527a.post(new n(1, this, str + "(" + str2 + ");"));
    }
}
