package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C4326d1;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.measurement.internal.o4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4922o4 {

    /* renamed from: a, reason: collision with root package name */
    final Context f36620a;

    /* renamed from: b, reason: collision with root package name */
    String f36621b;

    /* renamed from: c, reason: collision with root package name */
    String f36622c;

    /* renamed from: d, reason: collision with root package name */
    String f36623d;

    /* renamed from: e, reason: collision with root package name */
    Boolean f36624e;

    /* renamed from: f, reason: collision with root package name */
    long f36625f;

    /* renamed from: g, reason: collision with root package name */
    C4326d1 f36626g;

    /* renamed from: h, reason: collision with root package name */
    boolean f36627h;

    /* renamed from: i, reason: collision with root package name */
    Long f36628i;

    /* renamed from: j, reason: collision with root package name */
    String f36629j;

    public C4922o4(Context context, C4326d1 c4326d1, Long l10) {
        this.f36627h = true;
        AbstractC7901p.l(context);
        Context applicationContext = context.getApplicationContext();
        AbstractC7901p.l(applicationContext);
        this.f36620a = applicationContext;
        this.f36628i = l10;
        if (c4326d1 != null) {
            this.f36626g = c4326d1;
            this.f36621b = c4326d1.f35198f;
            this.f36622c = c4326d1.f35197e;
            this.f36623d = c4326d1.f35196d;
            this.f36627h = c4326d1.f35195c;
            this.f36625f = c4326d1.f35194b;
            this.f36629j = c4326d1.f35200h;
            Bundle bundle = c4326d1.f35199g;
            if (bundle != null) {
                this.f36624e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
