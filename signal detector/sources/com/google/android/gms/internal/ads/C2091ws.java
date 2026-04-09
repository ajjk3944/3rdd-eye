package com.google.android.gms.internal.ads;

import android.os.Bundle;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.ws, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2091ws implements Ls {

    /* renamed from: a, reason: collision with root package name */
    public final String f17508a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17509b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17510c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17511d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17512e;

    public C2091ws(String str, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.f17508a = str;
        this.f17509b = z6;
        this.f17510c = z7;
        this.f17511d = z8;
        this.f17512e = z9;
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final void b(Object obj) {
        Bundle bundle = ((C0797Wj) obj).f12308a;
        String str = this.f17508a;
        if (!str.isEmpty()) {
            bundle.putString("inspector_extras", str);
        }
        boolean z6 = this.f17509b;
        bundle.putInt("test_mode", z6 ? 1 : 0);
        boolean z7 = this.f17510c;
        bundle.putInt("linked_device", z7 ? 1 : 0);
        if (z6 || z7) {
            E9 e9 = H9.va;
            C2841s c2841s = C2841s.f23267e;
            if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
                bundle.putInt("risd", !this.f17511d ? 1 : 0);
            }
            if (((Boolean) c2841s.f23270c.a(H9.za)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.f17512e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final void d(Object obj) {
        Bundle bundle = ((C0797Wj) obj).f12309b;
        String str = this.f17508a;
        if (!str.isEmpty()) {
            bundle.putString("inspector_extras", str);
        }
        boolean z6 = this.f17509b;
        bundle.putInt("test_mode", z6 ? 1 : 0);
        boolean z7 = this.f17510c;
        bundle.putInt("linked_device", z7 ? 1 : 0);
        if (z6 || z7) {
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.za)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.f17512e);
            }
        }
    }
}
