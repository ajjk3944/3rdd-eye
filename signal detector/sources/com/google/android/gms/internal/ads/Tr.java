package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class Tr implements Ls {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11487a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f11488b;

    public /* synthetic */ Tr(int i, ArrayList arrayList) {
        this.f11487a = i;
        this.f11488b = arrayList;
    }

    private final /* synthetic */ void a(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        switch (this.f11487a) {
            case 0:
                ((C0797Wj) obj).f12308a.putStringArrayList("ad_types", this.f11488b);
                break;
            default:
                AbstractC0582Jp.d0(((C0797Wj) obj).f12308a, "android_permissions", this.f11488b);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final /* synthetic */ void d(Object obj) {
        switch (this.f11487a) {
            case 0:
                ((C0797Wj) obj).f12309b.putStringArrayList("ad_types", this.f11488b);
                break;
        }
    }
}
