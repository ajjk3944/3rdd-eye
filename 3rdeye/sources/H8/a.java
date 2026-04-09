package H8;

import J8.AbstractC0686a;
import android.app.Activity;
import android.os.Bundle;
import com.zipoapps.premiumhelper.ui.splash.PHSplashActivity;
import va.a;

/* compiled from: DestinationActivityForwarder.kt */
/* loaded from: classes3.dex */
public final class a extends AbstractC0686a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f2306b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l8.b f2307c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.zipoapps.premiumhelper.d f2308d;

    public a(b bVar, l8.b bVar2, com.zipoapps.premiumhelper.d dVar) {
        this.f2306b = bVar;
        this.f2307c = bVar2;
        this.f2308d = dVar;
    }

    @Override // J8.AbstractC0686a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.l.f(activity, "activity");
        boolean z10 = activity instanceof PHSplashActivity;
        b bVar = this.f2306b;
        if (z10) {
            PHSplashActivity pHSplashActivity = (PHSplashActivity) activity;
            if (pHSplashActivity.getIntent().hasExtra("dest_activity")) {
                a.b bVar2 = va.a.f47104a;
                bVar2.o("PremiumHelper");
                bVar2.a("Destination activity detected and saved to be delivered to MainActivity later on.", new Object[0]);
                bVar.f2309a = pHSplashActivity.getIntent().getStringExtra("dest_activity");
                return;
            }
        }
        if (activity.getClass().getName().equals(this.f2307c.f43910b.getMainActivityClass().getName())) {
            String str = bVar.f2309a;
            if (str != null) {
                a.b bVar3 = va.a.f47104a;
                bVar3.o("PremiumHelper");
                bVar3.a("Destination activity set to the MainActivity's intent and ready to be used.", new Object[0]);
                activity.getIntent().putExtra("dest_activity", str);
                bVar.f2309a = null;
            }
            this.f2308d.unregisterActivityLifecycleCallbacks(this);
        }
    }
}
