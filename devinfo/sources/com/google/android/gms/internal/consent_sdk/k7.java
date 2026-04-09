package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class k7 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19399a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19400b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19401c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f19402d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f19403e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f19404f;

    public /* synthetic */ k7(ec.j3 j3Var, Serializable serializable, String str, Object obj, Object obj2, int i4) {
        this.f19399a = i4;
        this.f19400b = serializable;
        this.f19401c = str;
        this.f19402d = obj;
        this.f19403e = obj2;
        this.f19404f = j3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        ec.j3 j3Var;
        ec.g0 g0Var;
        ec.l4 l4Var;
        ec.g0 g0Var2;
        switch (this.f19399a) {
            case 0:
                l7 l7Var = (l7) this.f19400b;
                Handler handler = l7Var.f19414b;
                e0 e0Var = l7Var.f19420i;
                Activity activity = (Activity) this.f19401c;
                ConsentRequestParameters consentRequestParameters = (ConsentRequestParameters) this.f19402d;
                ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener = (ConsentInformation.OnConsentInfoUpdateSuccessListener) this.f19403e;
                final ConsentInformation.OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener = (ConsentInformation.OnConsentInfoUpdateFailureListener) this.f19404f;
                try {
                    ConsentDebugSettings consentDebugSettings = consentRequestParameters.getConsentDebugSettings();
                    if (consentDebugSettings == null || !consentDebugSettings.isTestDevice()) {
                        Log.i("UserMessagingPlatform", "Use new ConsentDebugSettings.Builder().addTestDeviceHashedId(\"" + f0.a(l7Var.f19413a) + "\") to set this as a debug device.");
                    }
                    a aVarQ = l7Var.g.Q(l7Var.a(l7Var.f19418f.a(activity, consentRequestParameters)));
                    h hVar = l7Var.f19416d;
                    hVar.f19367b.edit().putInt("consent_status", aVarQ.f19251a).commit();
                    hVar.f19367b.edit().putString("privacy_options_requirement_status", aVarQ.f19252b.name()).commit();
                    l7Var.f19417e.f19471c.set(aVarQ.f19253c);
                    e0Var.a((Queue) e0Var.f19328f.get(), 8, 9, null);
                    l7Var.f19419h.f19542a.execute(new b4.o(l7Var, onConsentInfoUpdateSuccessListener, aVarQ, false, 3));
                    return;
                } catch (r1 e2) {
                    e0Var.a((Queue) e0Var.f19328f.get(), 8, 9, je.u.u("RequestConsentUpdate exception. Error: ", e2.getMessage(), ", cause: ", String.valueOf(e2.getCause())));
                    final int i4 = 0;
                    handler.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.c6
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i4) {
                                case 0:
                                    onConsentInfoUpdateFailureListener.onConsentInfoUpdateFailure(e2.a());
                                    break;
                                default:
                                    onConsentInfoUpdateFailureListener.onConsentInfoUpdateFailure(e2.a());
                                    break;
                            }
                        }
                    });
                    return;
                } catch (RuntimeException e10) {
                    e0Var.a((Queue) e0Var.f19328f.get(), 8, 9, "RequestConsentUpdate RuntimeException. ".concat(String.valueOf(e10.getMessage())));
                    final int i10 = 1;
                    final r1 r1Var = new r1(1, "Caught exception when trying to request consent info update: ".concat(String.valueOf(Log.getStackTraceString(e10))));
                    handler.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.c6
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    onConsentInfoUpdateFailureListener.onConsentInfoUpdateFailure(r1Var.a());
                                    break;
                                default:
                                    onConsentInfoUpdateFailureListener.onConsentInfoUpdateFailure(r1Var.a());
                                    break;
                            }
                        }
                    });
                    return;
                }
            case 1:
                ec.u1 u1Var = (ec.u1) this.f19400b;
                ec.n4 n4Var = (ec.n4) this.f19401c;
                Bundle bundle = (Bundle) this.f19402d;
                ec.i0 i0Var = (ec.i0) this.f19403e;
                String str = (String) this.f19404f;
                ec.g4 g4Var = u1Var.f23089a;
                g4Var.B();
                try {
                    i0Var.E3(g4Var.d0(bundle, n4Var));
                    return;
                } catch (RemoteException e11) {
                    g4Var.a().g.f(str, e11, "Failed to return trigger URIs for app");
                    return;
                }
            case 2:
                AtomicReference atomicReference2 = (AtomicReference) this.f19400b;
                synchronized (atomicReference2) {
                    try {
                        try {
                            j3Var = (ec.j3) this.f19404f;
                            g0Var = j3Var.f22819e;
                        } catch (RemoteException e12) {
                            ec.s0 s0Var = ((ec.o1) ((ec.j3) this.f19404f).f218b).f22954f;
                            ec.o1.m(s0Var);
                            s0Var.g.g("(legacy) Failed to get conditional properties; remote exception", null, (String) this.f19401c, e12);
                            ((AtomicReference) this.f19400b).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.f19400b;
                        }
                        if (g0Var == null) {
                            ec.s0 s0Var2 = ((ec.o1) j3Var.f218b).f22954f;
                            ec.o1.m(s0Var2);
                            s0Var2.g.g("(legacy) Failed to get conditional properties; not connected to service", null, (String) this.f19401c, (String) this.f19402d);
                            atomicReference2.set(Collections.EMPTY_LIST);
                            atomicReference2.notify();
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            atomicReference2.set(g0Var.k1((String) this.f19401c, (String) this.f19402d, (ec.n4) this.f19403e));
                        } else {
                            atomicReference2.set(g0Var.n1(null, (String) this.f19401c, (String) this.f19402d));
                        }
                        j3Var.O();
                        atomicReference = (AtomicReference) this.f19400b;
                        atomicReference.notify();
                        return;
                    } catch (Throwable th2) {
                        ((AtomicReference) this.f19400b).notify();
                        throw th2;
                    }
                }
            default:
                com.google.android.gms.internal.measurement.l0 l0Var = (com.google.android.gms.internal.measurement.l0) this.f19403e;
                String str2 = (String) this.f19401c;
                String str3 = (String) this.f19400b;
                ec.j3 j3Var2 = (ec.j3) this.f19404f;
                ArrayList arrayList = new ArrayList();
                try {
                    try {
                        g0Var2 = j3Var2.f22819e;
                    } catch (RemoteException e13) {
                        ec.s0 s0Var3 = ((ec.o1) j3Var2.f218b).f22954f;
                        ec.o1.m(s0Var3);
                        s0Var3.g.g("Failed to get conditional properties; remote exception", str3, str2, e13);
                    }
                    if (g0Var2 != null) {
                        arrayList = ec.l4.r0(g0Var2.k1(str3, str2, (ec.n4) this.f19402d));
                        j3Var2.O();
                        l4Var = ((ec.o1) j3Var2.f218b).f22956i;
                        ec.o1.k(l4Var);
                        l4Var.q0(l0Var, arrayList);
                        return;
                    }
                    ec.o1 o1Var = (ec.o1) j3Var2.f218b;
                    ec.s0 s0Var4 = o1Var.f22954f;
                    ec.o1.m(s0Var4);
                    s0Var4.g.f(str3, str2, "Failed to get conditional properties; not connected to service");
                    l4Var = o1Var.f22956i;
                    ec.o1.k(l4Var);
                    l4Var.q0(l0Var, arrayList);
                    return;
                } catch (Throwable th3) {
                    ec.l4 l4Var2 = ((ec.o1) j3Var2.f218b).f22956i;
                    ec.o1.k(l4Var2);
                    l4Var2.q0(l0Var, arrayList);
                    throw th3;
                }
        }
    }

    public /* synthetic */ k7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i4) {
        this.f19399a = i4;
        this.f19400b = obj;
        this.f19401c = obj2;
        this.f19402d = obj3;
        this.f19403e = obj4;
        this.f19404f = obj5;
    }
}
