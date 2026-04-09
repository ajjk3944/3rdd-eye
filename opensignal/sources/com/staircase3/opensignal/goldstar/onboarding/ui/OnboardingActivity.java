package com.staircase3.opensignal.goldstar.onboarding.ui;

import am.f;
import android.os.Bundle;
import i.j;
import kotlin.Metadata;
import o4.a;
import o4.j0;
import qk.h;
import qk.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/staircase3/opensignal/goldstar/onboarding/ui/OnboardingActivity;", "Li/j;", "<init>", "()V", "openSignal_externalRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OnboardingActivity extends j {
    @Override // i.j, c.l, g3.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(i.activity_onboarding);
        if (isFinishing() || isDestroyed()) {
            return;
        }
        j0 j0VarO = o();
        j0VarO.getClass();
        a aVar = new a(j0VarO);
        aVar.i(h.onboarding_fragment_container, new f(), null);
        aVar.e();
    }
}
