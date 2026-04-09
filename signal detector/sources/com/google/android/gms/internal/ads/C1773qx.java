package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* renamed from: com.google.android.gms.internal.ads.qx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1773qx implements p5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f16426a;

    @Override // p5.a
    public final Object b() {
        Context context = this.f16426a;
        q5.i.e(context, "<this>");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/ad_quality_data.pb");
    }
}
