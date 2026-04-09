package t4;

import android.app.Activity;
import com.apm.insight.R;
import com.google.android.gms.internal.ads.C0758Ue;
import com.google.android.material.button.MaterialButton;
import com.lefan.signal.ad.FreeAdActivity;
import j2.C2550f;
import j2.C2551g;
import q2.C2834o;
import q5.i;
import q5.m;

/* renamed from: t4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2931b {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f23672a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f23673b;

    /* renamed from: c, reason: collision with root package name */
    public C0758Ue f23674c;

    /* renamed from: d, reason: collision with root package name */
    public long f23675d;

    /* renamed from: e, reason: collision with root package name */
    public C2834o f23676e;

    /* renamed from: f, reason: collision with root package name */
    public String f23677f;

    public C2931b(Activity activity) {
        this.f23672a = activity;
    }

    public final void a() {
        Activity activity = this.f23672a;
        if (activity.isDestroyed() || activity.isFinishing()) {
            return;
        }
        if (this.f23677f == null) {
            C2834o c2834o = this.f23676e;
            if (c2834o != null) {
                MaterialButton materialButton = (MaterialButton) c2834o.f23252b;
                materialButton.setText(((FreeAdActivity) c2834o.f23253c).getString(R.string.reward_ad_free_failed));
                materialButton.setEnabled(true);
                ((m) c2834o.f23254d).f23297a = 2;
                return;
            }
            return;
        }
        if (this.f23674c != null && System.currentTimeMillis() - this.f23675d < 10800000) {
            C2834o c2834o2 = this.f23676e;
            if (c2834o2 != null) {
                MaterialButton materialButton2 = (MaterialButton) c2834o2.f23252b;
                materialButton2.setText(((FreeAdActivity) c2834o2.f23253c).getString(R.string.reward_ad_free_loaded));
                materialButton2.setEnabled(true);
                ((m) c2834o2.f23254d).f23297a = 1;
                return;
            }
            return;
        }
        if (this.f23673b) {
            C2834o c2834o3 = this.f23676e;
            if (c2834o3 != null) {
                MaterialButton materialButton3 = (MaterialButton) c2834o3.f23252b;
                materialButton3.setText(((FreeAdActivity) c2834o3.f23253c).getString(R.string.string_loading));
                materialButton3.setEnabled(false);
                ((m) c2834o3.f23254d).f23297a = 0;
                return;
            }
            return;
        }
        this.f23673b = true;
        C2834o c2834o4 = this.f23676e;
        if (c2834o4 != null) {
            MaterialButton materialButton4 = (MaterialButton) c2834o4.f23252b;
            materialButton4.setText(((FreeAdActivity) c2834o4.f23253c).getString(R.string.string_loading));
            materialButton4.setEnabled(false);
            ((m) c2834o4.f23254d).f23297a = 0;
        }
        String str = this.f23677f;
        i.b(str);
        C0758Ue.a(activity, str, new C2551g(new C2550f(1)), new C2930a(this));
    }
}
