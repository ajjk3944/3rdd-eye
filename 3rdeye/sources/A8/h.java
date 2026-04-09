package A8;

import J8.C0690e;
import J8.C0702q;
import android.app.Activity;
import android.app.Application;
import androidx.appcompat.app.AppCompatActivity;
import b9.C1992A;
import com.android.billingclient.api.ProxyBillingActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements p9.p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f124b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f125c;

    public /* synthetic */ h(Object obj, int i) {
        this.f124b = i;
        this.f125c = obj;
    }

    @Override // p9.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f124b) {
            case 0:
                Activity activity = (Activity) obj;
                Application.ActivityLifecycleCallbacks callbacks = (Application.ActivityLifecycleCallbacks) obj2;
                kotlin.jvm.internal.l.f(activity, "activity");
                kotlin.jvm.internal.l.f(callbacks, "callbacks");
                boolean zC = C0690e.c(activity);
                k kVar = (k) this.f125c;
                if (zC) {
                    boolean z10 = true;
                    if (activity instanceof AppCompatActivity) {
                        AppCompatActivity appCompatActivity = (AppCompatActivity) activity;
                        kVar.getClass();
                        kVar.g(appCompatActivity, new b(kVar, appCompatActivity, z10));
                    } else {
                        kVar.e(true, activity);
                        C0702q.a("Please use AppCompatActivity for ".concat(activity.getClass().getName()));
                    }
                }
                if (!(activity instanceof ProxyBillingActivity)) {
                    kVar.f135a.unregisterActivityLifecycleCallbacks(callbacks);
                }
                return C1992A.f18074a;
            default:
                CharSequence DelimitedRangesSequence = (CharSequence) obj;
                int iIntValue = ((Integer) obj2).intValue();
                kotlin.jvm.internal.l.f(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
                int iH0 = y9.q.h0(DelimitedRangesSequence, (char[]) this.f125c, iIntValue, false);
                if (iH0 < 0) {
                    return null;
                }
                return new b9.l(Integer.valueOf(iH0), 1);
        }
    }
}
