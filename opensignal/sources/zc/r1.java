package zc;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdd;

/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f27124a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f27125b;

    /* renamed from: c, reason: collision with root package name */
    public final long f27126c;

    /* renamed from: d, reason: collision with root package name */
    public final zzdd f27127d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f27128e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f27129f;

    /* renamed from: g, reason: collision with root package name */
    public final String f27130g;

    public r1(Context context, zzdd zzddVar, Long l10) {
        this.f27128e = true;
        cc.s.h(context);
        Context applicationContext = context.getApplicationContext();
        cc.s.h(applicationContext);
        this.f27124a = applicationContext;
        this.f27129f = l10;
        if (zzddVar != null) {
            this.f27127d = zzddVar;
            this.f27128e = zzddVar.f5292g;
            this.f27126c = zzddVar.f5291d;
            this.f27130g = zzddVar.f5294x;
            Bundle bundle = zzddVar.f5293r;
            if (bundle != null) {
                this.f27125b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
