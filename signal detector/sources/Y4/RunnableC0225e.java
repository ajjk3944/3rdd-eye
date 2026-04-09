package Y4;

import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textfield.TextInputEditText;
import com.lefan.base.activity.SuggestActivity;
import com.lefan.signal.ui.wifi.PingActivity;
import h.AbstractActivityC2349g;
import java.io.Serializable;
import java.util.regex.Matcher;

/* renamed from: Y4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0225e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4457a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4458b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC2349g f4459c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Serializable f4460d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Serializable f4461e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4462f;

    public /* synthetic */ RunnableC0225e(SuggestActivity suggestActivity, q5.o oVar, q5.o oVar2, String str, TextInputEditText textInputEditText) {
        this.f4459c = suggestActivity;
        this.f4460d = oVar;
        this.f4461e = oVar2;
        this.f4458b = str;
        this.f4462f = textInputEditText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4457a) {
            case 0:
                PingActivity pingActivity = (PingActivity) this.f4459c;
                String str = (String) this.f4460d;
                String str2 = (String) this.f4461e;
                Matcher matcher = (Matcher) this.f4462f;
                AppCompatTextView appCompatTextView = pingActivity.f19352U;
                if (appCompatTextView == null) {
                    q5.i.g("sendNum");
                    throw null;
                }
                appCompatTextView.setText(this.f4458b + "/" + str);
                AppCompatTextView appCompatTextView2 = pingActivity.f19354W;
                if (appCompatTextView2 == null) {
                    q5.i.g("lossPerm");
                    throw null;
                }
                appCompatTextView2.setText(str2);
                if (matcher.find()) {
                    AppCompatTextView appCompatTextView3 = pingActivity.f19355X;
                    if (appCompatTextView3 == null) {
                        q5.i.g("avaText");
                        throw null;
                    }
                    appCompatTextView3.setText(matcher.group(matcher.groupCount() - 2));
                    AppCompatTextView appCompatTextView4 = pingActivity.f19353V;
                    if (appCompatTextView4 != null) {
                        appCompatTextView4.setText(matcher.group(matcher.groupCount()));
                        return;
                    } else {
                        q5.i.g("mdevNum");
                        throw null;
                    }
                }
                return;
            default:
                SuggestActivity.C((SuggestActivity) this.f4459c, (q5.o) this.f4460d, (q5.o) this.f4461e, this.f4458b, (TextInputEditText) this.f4462f);
                return;
        }
    }

    public /* synthetic */ RunnableC0225e(PingActivity pingActivity, String str, String str2, String str3, Matcher matcher) {
        this.f4459c = pingActivity;
        this.f4458b = str;
        this.f4460d = str2;
        this.f4461e = str3;
        this.f4462f = matcher;
    }
}
