package A8;

import J8.AbstractC0686a;
import J8.C0690e;
import J8.C0702q;
import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import com.zipoapps.premiumhelper.ui.rate.f;

/* compiled from: RelaunchCoordinator.kt */
/* loaded from: classes3.dex */
public final class n extends AbstractC0686a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f148b;

    /* compiled from: RelaunchCoordinator.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f149a;

        static {
            int[] iArr = new int[f.c.values().length];
            try {
                iArr[f.c.DIALOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.c.IN_APP_REVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.c.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f149a = iArr;
        }
    }

    public n(k kVar) {
        this.f148b = kVar;
    }

    @Override // J8.AbstractC0686a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.l.f(activity, "activity");
        if (C0690e.b(activity)) {
            return;
        }
        k kVar = this.f148b;
        kVar.f135a.unregisterActivityLifecycleCallbacks(this);
        A2.e eVar = new A2.e(2, activity, kVar);
        if (activity instanceof AppCompatActivity) {
            eVar.invoke(activity);
        } else {
            C0702q.a("Please use AppCompatActivity for ".concat(activity.getClass().getName()));
        }
    }
}
