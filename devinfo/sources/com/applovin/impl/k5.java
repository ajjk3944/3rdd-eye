package com.applovin.impl;

import android.app.Activity;
import android.text.TextUtils;
import com.applovin.impl.d6;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class k5 extends i5 {
    private final List g;

    /* renamed from: h, reason: collision with root package name */
    private final Activity f4371h;

    public k5(List list, Activity activity, com.applovin.impl.sdk.k kVar) {
        super("TaskAutoInitAdapters", kVar, true);
        this.g = list;
        this.f4371h = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(k3 k3Var) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f4289c.a(this.f4288b, "Auto-initing adapter: " + k3Var);
        }
        this.f4287a.S().a(k3Var, this.f4371h);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.g.size() > 0) {
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVar = this.f4289c;
                String str = this.f4288b;
                StringBuilder sb2 = new StringBuilder("Auto-initing ");
                sb2.append(this.g.size());
                sb2.append(" adapters");
                sb2.append(this.f4287a.s0().c() ? " in test mode" : "");
                sb2.append("...");
                oVar.a(str, sb2.toString());
            }
            if (TextUtils.isEmpty(this.f4287a.V())) {
                this.f4287a.O0();
            } else if (!this.f4287a.G0()) {
                com.applovin.impl.sdk.o.h("AppLovinSdk", "Auto-initing adapters for non-MAX mediation provider: " + this.f4287a.V());
            }
            if (this.f4371h == null) {
                com.applovin.impl.sdk.o.h("AppLovinSdk", "\n**********\nAttempting to init 3rd-party SDKs without an Activity instance.\n**********\n");
            }
            for (k3 k3Var : this.g) {
                if (k3Var.s()) {
                    this.f4287a.q0().a(new w8(9, this, k3Var), d6.b.MEDIATION);
                } else {
                    this.f4287a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f4287a.O().a(this.f4288b, "Skipping eager auto-init for adapter " + k3Var);
                    }
                }
            }
        }
    }
}
