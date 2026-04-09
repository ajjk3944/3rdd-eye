package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.us, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1983us implements Ls {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17184a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f17185b;

    public /* synthetic */ C1983us(Boolean bool, int i) {
        this.f17184a = i;
        this.f17185b = bool;
    }

    private final /* synthetic */ void a(Object obj) {
    }

    private final /* synthetic */ void c(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        switch (this.f17184a) {
            case 0:
                C0797Wj c0797Wj = (C0797Wj) obj;
                Boolean bool = this.f17185b;
                if (bool != null) {
                    c0797Wj.f12308a.putBoolean("hw_accel", bool.booleanValue());
                    break;
                }
                break;
            default:
                Bundle bundle = ((C0797Wj) obj).f12308a;
                Boolean bool2 = this.f17185b;
                if (bool2 != null) {
                    if (!bool2.booleanValue()) {
                        bundle.putInt("lft", 0);
                        break;
                    } else {
                        bundle.putInt("lft", 1);
                        break;
                    }
                } else {
                    bundle.putInt("lft", -1);
                    break;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final /* synthetic */ void d(Object obj) {
        int i = this.f17184a;
    }
}
