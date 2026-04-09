package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Objects;

/* loaded from: classes.dex */
public final class x0 extends e1 {
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object D;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f5253x = 3;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f5254y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(h1 h1Var, Activity activity, h0 h0Var) {
        super(h1Var.f5053a, true);
        this.B = activity;
        this.D = h0Var;
        this.f5254y = h1Var;
    }

    @Override // com.google.android.gms.internal.measurement.e1
    public final void a() {
        Boolean boolValueOf;
        Bundle bundle;
        switch (this.f5253x) {
            case 0:
                try {
                    Context context = (Context) this.B;
                    cc.s.h(context);
                    String strA = zc.p1.a(context);
                    Resources resources = context.getResources();
                    if (TextUtils.isEmpty(strA)) {
                        strA = zc.p1.a(context);
                    }
                    int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", strA);
                    k0 k0VarAsInterface = null;
                    if (identifier == 0) {
                        boolValueOf = null;
                    } else {
                        try {
                            boolValueOf = Boolean.valueOf(resources.getBoolean(identifier));
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                    i1 i1Var = (i1) this.f5254y;
                    boolean z10 = boolValueOf == null || !boolValueOf.booleanValue();
                    i1Var.getClass();
                    try {
                        k0VarAsInterface = j0.asInterface(kc.e.c(context, z10 ? kc.e.f14274d : kc.e.f14273c, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    } catch (kc.a e4) {
                        i1Var.d(e4, true, false);
                    }
                    i1Var.f5072f = k0VarAsInterface;
                    if (i1Var.f5072f != null) {
                        int iA = kc.e.a(context, ModuleDescriptor.MODULE_ID);
                        zzdd zzddVar = new zzdd(133005L, Math.max(iA, r6), Boolean.TRUE.equals(boolValueOf) || kc.e.d(context, ModuleDescriptor.MODULE_ID, false) < iA, (Bundle) this.D, zc.p1.a(context));
                        k0 k0Var = i1Var.f5072f;
                        cc.s.h(k0Var);
                        k0Var.initialize(new jc.d(context), zzddVar, this.f4963a);
                        break;
                    } else {
                        io.sentry.android.core.e0.p("FA", "Failed to connect to measurement client.");
                        break;
                    }
                } catch (Exception e10) {
                    ((i1) this.f5254y).d(e10, true, false);
                    return;
                }
                break;
            case 1:
                k0 k0Var2 = ((i1) this.f5254y).f5072f;
                cc.s.h(k0Var2);
                k0Var2.getMaxUserProperties((String) this.B, (h0) this.D);
                break;
            case 2:
                Bundle bundle2 = (Bundle) this.D;
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
                k0 k0Var3 = ((h1) this.f5254y).f5053a.f5072f;
                cc.s.h(k0Var3);
                k0Var3.onActivityCreatedByScionActivityInfo(zzdf.d((Activity) this.B), bundle, this.f4964d);
                break;
            default:
                k0 k0Var4 = ((h1) this.f5254y).f5053a.f5072f;
                cc.s.h(k0Var4);
                k0Var4.onActivitySaveInstanceStateByScionActivityInfo(zzdf.d((Activity) this.B), (h0) this.D, this.f4964d);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.e1
    public void b() {
        switch (this.f5253x) {
            case 1:
                ((h0) this.D).C(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(h1 h1Var, Bundle bundle, Activity activity) {
        super(h1Var.f5053a, true);
        this.D = bundle;
        this.B = activity;
        this.f5254y = h1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(i1 i1Var, Context context, Bundle bundle) {
        super(i1Var, true);
        this.B = context;
        this.D = bundle;
        this.f5254y = i1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(i1 i1Var, String str, h0 h0Var) {
        super(i1Var, true);
        this.B = str;
        this.D = h0Var;
        Objects.requireNonNull(i1Var);
        this.f5254y = i1Var;
    }
}
