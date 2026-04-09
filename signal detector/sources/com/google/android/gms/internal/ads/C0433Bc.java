package com.google.android.gms.internal.ads;

import b4.C0355t;
import j$.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Bc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0433Bc implements InterfaceC0602Lb {

    /* renamed from: a, reason: collision with root package name */
    public final C1967uc f7368a;

    /* renamed from: b, reason: collision with root package name */
    public final C0657Of f7369b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0450Cc f7370c;

    public C0433Bc(C0450Cc c0450Cc, C1967uc c1967uc, C0657Of c0657Of) {
        Objects.requireNonNull(c0450Cc);
        this.f7370c = c0450Cc;
        this.f7368a = c1967uc;
        this.f7369b = c0657Of;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0602Lb
    public final void v(String str) {
        C1967uc c1967uc = this.f7368a;
        C0657Of c0657Of = this.f7369b;
        try {
            if (str == null) {
                c0657Of.c(new C0355t());
            } else {
                c0657Of.c(new C0355t(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th) {
            c1967uc.D();
            throw th;
        }
        c1967uc.D();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0602Lb
    public final void w(JSONObject jSONObject) {
        C1967uc c1967uc = this.f7368a;
        C0657Of c0657Of = this.f7369b;
        try {
            try {
                c0657Of.b(((InterfaceC2183yc) this.f7370c.f7624c).w(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e6) {
                c0657Of.c(e6);
            }
        } finally {
            c1967uc.D();
        }
    }
}
