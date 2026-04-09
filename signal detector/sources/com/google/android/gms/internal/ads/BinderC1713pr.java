package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C2841s;
import q2.C2852x0;

/* renamed from: com.google.android.gms.internal.ads.pr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1713pr extends B7 implements InterfaceC1968ud {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f16228e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final C0657Of f16229a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f16230b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16231c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16232d;

    public BinderC1713pr(String str, InterfaceC1860sd interfaceC1860sd, C0657Of c0657Of, long j6) throws JSONException {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
        JSONObject jSONObject = new JSONObject();
        this.f16230b = jSONObject;
        this.f16232d = false;
        this.f16229a = c0657Of;
        this.f16231c = j6;
        try {
            jSONObject.put("adapter_version", interfaceC1860sd.d().toString());
            jSONObject.put("sdk_version", interfaceC1860sd.e().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            String string = parcel.readString();
            C7.f(parcel);
            x(string);
        } else if (i == 2) {
            String string2 = parcel.readString();
            C7.f(parcel);
            K2(string2);
        } else {
            if (i != 3) {
                return false;
            }
            C2852x0 c2852x0 = (C2852x0) C7.b(parcel, C2852x0.CREATOR);
            C7.f(parcel);
            synchronized (this) {
                K3(2, c2852x0.f23274b);
            }
        }
        parcel2.writeNoException();
        return true;
    }

    public final synchronized void K2(String str) {
        K3(2, str);
    }

    public final synchronized void K3(int i, String str) {
        try {
            if (this.f16232d) {
                return;
            }
            try {
                JSONObject jSONObject = this.f16230b;
                jSONObject.put("signal_error", str);
                E9 e9 = H9.Y1;
                C2841s c2841s = C2841s.f23267e;
                if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
                    p2.j.f22785C.f22797k.getClass();
                    jSONObject.put("latency", SystemClock.elapsedRealtime() - this.f16231c);
                }
                if (((Boolean) c2841s.f23270c.a(H9.X1)).booleanValue()) {
                    jSONObject.put("signal_error_code", i);
                }
            } catch (JSONException unused) {
            }
            this.f16229a.b(this.f16230b);
            this.f16232d = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1968ud
    public final synchronized void x(String str) {
        if (this.f16232d) {
            return;
        }
        if (str == null) {
            K2("Adapter returned null signals");
            return;
        }
        try {
            JSONObject jSONObject = this.f16230b;
            jSONObject.put("signals", str);
            E9 e9 = H9.Y1;
            C2841s c2841s = C2841s.f23267e;
            if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
                p2.j.f22785C.f22797k.getClass();
                jSONObject.put("latency", SystemClock.elapsedRealtime() - this.f16231c);
            }
            if (((Boolean) c2841s.f23270c.a(H9.X1)).booleanValue()) {
                jSONObject.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.f16229a.b(this.f16230b);
        this.f16232d = true;
    }

    public final synchronized void z() {
        if (this.f16232d) {
            return;
        }
        try {
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.X1)).booleanValue()) {
                this.f16230b.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.f16229a.b(this.f16230b);
        this.f16232d = true;
    }
}
