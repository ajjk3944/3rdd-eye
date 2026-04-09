package com.google.android.gms.internal.consent_sdk;

import j$.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19440a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19441b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19442c;

    public /* synthetic */ n(int i4, Object obj, Object obj2) {
        this.f19440a = i4;
        this.f19441b = obj;
        this.f19442c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        switch (this.f19440a) {
            case 0:
                q qVar = (q) this.f19441b;
                m mVar = (m) this.f19442c;
                AtomicReference atomicReference = qVar.f19472d;
                Objects.requireNonNull(atomicReference);
                mVar.a(new e6(1, atomicReference), new q4(22));
                return;
            default:
                u uVar = (u) this.f19441b;
                String str = (String) this.f19442c;
                synchronized (l0.class) {
                    if (l0.f19407a == null) {
                        try {
                            uVar.evaluateJavascript("(function(){})()", null);
                            l0.f19407a = Boolean.TRUE;
                        } catch (IllegalStateException unused) {
                            l0.f19407a = Boolean.FALSE;
                        }
                        zBooleanValue = l0.f19407a.booleanValue();
                    } else {
                        zBooleanValue = l0.f19407a.booleanValue();
                    }
                }
                if (zBooleanValue) {
                    uVar.evaluateJavascript(str, null);
                    return;
                } else {
                    uVar.loadUrl("javascript:".concat(str));
                    return;
                }
        }
    }
}
