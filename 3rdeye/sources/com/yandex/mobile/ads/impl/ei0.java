package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.aw0;
import com.yandex.mobile.ads.impl.yz0;

/* loaded from: classes3.dex */
public abstract class ei0 implements yz0.b {

    /* renamed from: b, reason: collision with root package name */
    public final String f26869b;

    public ei0(String str) {
        this.f26869b = str;
    }

    @Override // com.yandex.mobile.ads.impl.yz0.b
    public final /* synthetic */ dc0 a() {
        return N4.a(this);
    }

    @Override // com.yandex.mobile.ads.impl.yz0.b
    public final /* synthetic */ byte[] b() {
        return N4.c(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f26869b;
    }

    @Override // com.yandex.mobile.ads.impl.yz0.b
    public /* synthetic */ void a(aw0.a aVar) {
        N4.b(this, aVar);
    }
}
