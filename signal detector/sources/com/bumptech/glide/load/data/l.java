package com.bumptech.glide.load.data;

import com.google.android.gms.internal.ads.C0752Tp;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class l implements e {

    /* renamed from: a, reason: collision with root package name */
    public final C0752Tp f6559a;

    public l(C0752Tp c0752Tp) {
        this.f6559a = c0752Tp;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.e
    public final f b(Object obj) {
        return new h((InputStream) obj, this.f6559a);
    }
}
