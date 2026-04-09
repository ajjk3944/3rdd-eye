package Y4;

import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import com.lefan.signal.ui.wifi.PingActivity;
import com.lefan.signal.ui.wifi.TraceRouteActivity;
import d5.AbstractC2282j;
import java.util.ArrayList;

/* renamed from: Y4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0222b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4447a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f4448b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppCompatAutoCompleteTextView f4449c;

    public /* synthetic */ RunnableC0222b(ArrayList arrayList, AppCompatAutoCompleteTextView appCompatAutoCompleteTextView, int i) {
        this.f4447a = i;
        this.f4448b = arrayList;
        this.f4449c = appCompatAutoCompleteTextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4447a;
        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView = this.f4449c;
        ArrayList arrayList = this.f4448b;
        switch (i) {
            case 0:
                int i3 = PingActivity.b0;
                String str = (String) AbstractC2282j.U(arrayList);
                if (str == null || str.length() == 0) {
                    String language = F4.e.c(null).getLanguage();
                    q5.i.d(language, "getLanguage(...)");
                    str = y5.l.V(language, "zh", false) ? "www.baidu.com" : "www.google.com";
                }
                appCompatAutoCompleteTextView.setText(str);
                break;
            default:
                int i6 = TraceRouteActivity.f19379c0;
                String str2 = (String) AbstractC2282j.U(arrayList);
                if (str2 == null || str2.length() == 0) {
                    String language2 = F4.e.c(null).getLanguage();
                    q5.i.d(language2, "getLanguage(...)");
                    str2 = y5.l.V(language2, "zh", false) ? "www.baidu.com" : "www.google.com";
                }
                appCompatAutoCompleteTextView.setText(str2);
                break;
        }
    }
}
