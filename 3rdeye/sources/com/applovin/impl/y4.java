package com.applovin.impl;

import android.app.Activity;
import android.text.TextUtils;
import com.applovin.impl.r5;
import java.util.List;

/* loaded from: classes.dex */
public class y4 extends w4 {

    /* renamed from: g, reason: collision with root package name */
    private final List f21849g;

    /* renamed from: h, reason: collision with root package name */
    private final Activity f21850h;

    public y4(List list, Activity activity, com.applovin.impl.sdk.k kVar) {
        super("TaskAutoInitAdapters", kVar, true);
        this.f21849g = list;
        this.f21850h = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(a3 a3Var) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.a(this.f21693b, "Auto-initing adapter: " + a3Var);
        }
        this.f21692a.S().a(a3Var, this.f21850h);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f21849g.size() > 0) {
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVar = this.f21694c;
                String str = this.f21693b;
                StringBuilder sb = new StringBuilder("Auto-initing ");
                sb.append(this.f21849g.size());
                sb.append(" adapters");
                sb.append(this.f21692a.s0().c() ? " in test mode" : "");
                sb.append("...");
                oVar.a(str, sb.toString());
            }
            if (TextUtils.isEmpty(this.f21692a.V())) {
                this.f21692a.P0();
            } else if (!this.f21692a.G0()) {
                com.applovin.impl.sdk.o.h("AppLovinSdk", "Auto-initing adapters for non-MAX mediation provider: " + this.f21692a.V());
            }
            if (this.f21850h == null) {
                com.applovin.impl.sdk.o.h("AppLovinSdk", "\n**********\nAttempting to init 3rd-party SDKs without an Activity instance.\n**********\n");
            }
            for (a3 a3Var : this.f21849g) {
                if (a3Var.s()) {
                    this.f21692a.q0().a(new D(6, this, a3Var), r5.b.MEDIATION);
                } else {
                    this.f21692a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f21692a.O().a(this.f21693b, "Skipping eager auto-init for adapter " + a3Var);
                    }
                }
            }
        }
    }
}
