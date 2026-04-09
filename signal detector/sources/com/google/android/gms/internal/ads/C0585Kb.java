package com.google.android.gms.internal.ads;

import b4.C0355t;
import j$.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Kb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0585Kb implements InterfaceC0602Lb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9487a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C0657Of f9488b;

    public C0585Kb(C0415Ab c0415Ab, C0657Of c0657Of) {
        this.f9488b = c0657Of;
        Objects.requireNonNull(c0415Ab);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0602Lb
    public final void v(String str) {
        switch (this.f9487a) {
            case 0:
                this.f9488b.c(new C0355t(str));
                break;
            default:
                C0657Of c0657Of = this.f9488b;
                try {
                    if (str == null) {
                        c0657Of.c(new C0355t());
                    } else {
                        c0657Of.c(new C0355t(str));
                    }
                    break;
                } catch (IllegalStateException unused) {
                    return;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0602Lb
    public final void w(JSONObject jSONObject) {
        switch (this.f9487a) {
            case 0:
                this.f9488b.b(jSONObject);
                break;
            default:
                C0657Of c0657Of = this.f9488b;
                try {
                    c0657Of.b(jSONObject);
                    break;
                } catch (IllegalStateException unused) {
                    return;
                } catch (JSONException e6) {
                    c0657Of.c(e6);
                }
        }
    }

    public C0585Kb(C0518Gc c0518Gc, C0657Of c0657Of) {
        this.f9488b = c0657Of;
    }
}
