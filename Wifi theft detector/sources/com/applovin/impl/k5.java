package com.applovin.impl;

import android.app.Activity;
import android.text.TextUtils;
import com.applovin.impl.d6;
import java.util.List;

/* loaded from: classes.dex */
public class k5 extends i5 {

    /* renamed from: g, reason: collision with root package name */
    private final List f6324g;

    /* renamed from: h, reason: collision with root package name */
    private final Activity f6325h;

    public k5(List list, Activity activity, com.applovin.impl.sdk.k kVar) {
        super("TaskAutoInitAdapters", kVar, true);
        this.f6324g = list;
        this.f6325h = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(k3 k3Var) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.a(this.f6219b, "Auto-initing adapter: " + k3Var);
        }
        this.f6218a.S().a(k3Var, this.f6325h);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f6324g.size() > 0) {
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVar = this.f6220c;
                String str = this.f6219b;
                StringBuilder sb = new StringBuilder();
                sb.append("Auto-initing ");
                sb.append(this.f6324g.size());
                sb.append(" adapters");
                sb.append(this.f6218a.s0().c() ? " in test mode" : "");
                sb.append("...");
                oVar.a(str, sb.toString());
            }
            if (TextUtils.isEmpty(this.f6218a.V())) {
                this.f6218a.O0();
            } else if (!this.f6218a.G0()) {
                com.applovin.impl.sdk.o.h("AppLovinSdk", "Auto-initing adapters for non-MAX mediation provider: " + this.f6218a.V());
            }
            if (this.f6325h == null) {
                com.applovin.impl.sdk.o.h("AppLovinSdk", "\n**********\nAttempting to init 3rd-party SDKs without an Activity instance.\n**********\n");
            }
            for (final k3 k3Var : this.f6324g) {
                if (k3Var.s()) {
                    this.f6218a.q0().a(new Runnable() { // from class: com.applovin.impl.lb
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f6430a.a(k3Var);
                        }
                    }, d6.b.MEDIATION);
                } else {
                    this.f6218a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f6218a.O().a(this.f6219b, "Skipping eager auto-init for adapter " + k3Var);
                    }
                }
            }
        }
    }
}
