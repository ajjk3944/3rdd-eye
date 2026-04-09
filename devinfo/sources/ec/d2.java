package ec;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f22680a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f22681b;

    /* renamed from: c, reason: collision with root package name */
    public final long f22682c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.t0 f22683d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f22684e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f22685f;
    public final String g;

    public d2(Context context, com.google.android.gms.internal.measurement.t0 t0Var, Long l10) {
        this.f22684e = true;
        pb.y.h(context);
        Context applicationContext = context.getApplicationContext();
        pb.y.h(applicationContext);
        this.f22680a = applicationContext;
        this.f22685f = l10;
        if (t0Var != null) {
            this.f22683d = t0Var;
            this.f22684e = t0Var.f19933c;
            this.f22682c = t0Var.f19932b;
            this.g = t0Var.f19935e;
            Bundle bundle = t0Var.f19934d;
            if (bundle != null) {
                this.f22681b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
