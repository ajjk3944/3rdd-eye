package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w0 extends g1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f20018e = 4;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f20019f;
    public final /* synthetic */ Object g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f20020h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(j1 j1Var, Activity activity, g0 g0Var) {
        super(j1Var.f19787a, true);
        this.g = activity;
        this.f20020h = g0Var;
        this.f20019f = j1Var;
    }

    @Override // com.google.android.gms.internal.measurement.g1
    public final void a() {
        Boolean boolValueOf;
        Bundle bundle;
        switch (this.f20018e) {
            case 0:
                j0 j0Var = ((k1) this.f20019f).f19799f;
                pb.y.h(j0Var);
                j0Var.setUserProperty(null, (String) this.g, new vb.b((String) this.f20020h), false, this.f19750a);
                break;
            case 1:
                try {
                    Context context = (Context) this.g;
                    pb.y.h(context);
                    String strA = ec.b2.a(context);
                    Resources resources = context.getResources();
                    if (TextUtils.isEmpty(strA)) {
                        strA = ec.b2.a(context);
                    }
                    int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", strA);
                    j0 j0VarAsInterface = null;
                    if (identifier == 0) {
                        boolValueOf = null;
                    } else {
                        try {
                            boolValueOf = Boolean.valueOf(resources.getBoolean(identifier));
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                    k1 k1Var = (k1) this.f20019f;
                    boolean z3 = boolValueOf == null || !boolValueOf.booleanValue();
                    k1Var.getClass();
                    try {
                        j0VarAsInterface = i0.asInterface(wb.d.c(context, z3 ? wb.d.f36581d : wb.d.f36580c, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    } catch (wb.a e2) {
                        k1Var.d(e2, true, false);
                    }
                    k1Var.f19799f = j0VarAsInterface;
                    if (k1Var.f19799f != null) {
                        int iA = wb.d.a(context, ModuleDescriptor.MODULE_ID);
                        t0 t0Var = new t0(133005L, Math.max(iA, r6), Boolean.TRUE.equals(boolValueOf) || wb.d.d(context, ModuleDescriptor.MODULE_ID, false) < iA, (Bundle) this.f20020h, ec.b2.a(context));
                        j0 j0Var2 = k1Var.f19799f;
                        pb.y.h(j0Var2);
                        j0Var2.initialize(new vb.b(context), t0Var, this.f19750a);
                        break;
                    } else {
                        Log.w("FA", "Failed to connect to measurement client.");
                        break;
                    }
                } catch (Exception e10) {
                    ((k1) this.f20019f).d(e10, true, false);
                    return;
                }
                break;
            case 2:
                j0 j0Var3 = ((k1) this.f20019f).f19799f;
                pb.y.h(j0Var3);
                j0Var3.getMaxUserProperties((String) this.g, (g0) this.f20020h);
                break;
            case 3:
                Bundle bundle2 = (Bundle) this.g;
                if (bundle2 != null) {
                    bundle = new Bundle();
                    if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = bundle2.get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                } else {
                    bundle = null;
                }
                j0 j0Var4 = ((j1) this.f20019f).f19787a.f19799f;
                pb.y.h(j0Var4);
                j0Var4.onActivityCreatedByScionActivityInfo(v0.a((Activity) this.f20020h), bundle, this.f19751b);
                break;
            default:
                j0 j0Var5 = ((j1) this.f20019f).f19787a.f19799f;
                pb.y.h(j0Var5);
                j0Var5.onActivitySaveInstanceStateByScionActivityInfo(v0.a((Activity) this.g), (g0) this.f20020h, this.f19751b);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.g1
    public void b() {
        switch (this.f20018e) {
            case 2:
                ((g0) this.f20020h).X2(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(j1 j1Var, Bundle bundle, Activity activity) {
        super(j1Var.f19787a, true);
        this.g = bundle;
        this.f20020h = activity;
        this.f20019f = j1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(k1 k1Var, Context context, Bundle bundle) {
        super(k1Var, true);
        this.g = context;
        this.f20020h = bundle;
        this.f20019f = k1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(k1 k1Var, String str, g0 g0Var) {
        super(k1Var, true);
        this.g = str;
        this.f20020h = g0Var;
        Objects.requireNonNull(k1Var);
        this.f20019f = k1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(k1 k1Var, String str, String str2) {
        super(k1Var, true);
        this.g = str;
        this.f20020h = str2;
        Objects.requireNonNull(k1Var);
        this.f20019f = k1Var;
    }
}
