package Y4;

import android.view.View;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import com.apm.insight.R;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.lefan.signal.ui.wifi.PingActivity;
import com.lefan.signal.ui.wifi.TraceRouteActivity;
import d5.AbstractC2282j;
import java.util.ArrayList;

/* renamed from: Y4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0223c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4450a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4451b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4452c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4453d;

    public /* synthetic */ ViewOnClickListenerC0223c(Object obj, Object obj2, Object obj3, int i) {
        this.f4450a = i;
        this.f4451b = obj;
        this.f4453d = obj2;
        this.f4452c = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f4450a;
        Object obj = this.f4452c;
        Object obj2 = this.f4453d;
        Object obj3 = this.f4451b;
        switch (i) {
            case 0:
                PingActivity pingActivity = (PingActivity) obj2;
                AppCompatAutoCompleteTextView appCompatAutoCompleteTextView = (AppCompatAutoCompleteTextView) obj;
                int i3 = PingActivity.b0;
                if (!((ArrayList) obj3).isEmpty()) {
                    appCompatAutoCompleteTextView.showDropDown();
                    break;
                } else {
                    F4.d.b(pingActivity, pingActivity.getString(R.string.speedtest_no_data));
                    break;
                }
            case 1:
                TraceRouteActivity traceRouteActivity = (TraceRouteActivity) obj2;
                AppCompatAutoCompleteTextView appCompatAutoCompleteTextView2 = (AppCompatAutoCompleteTextView) obj;
                int i6 = TraceRouteActivity.f19379c0;
                if (!((ArrayList) obj3).isEmpty()) {
                    appCompatAutoCompleteTextView2.showDropDown();
                    break;
                } else {
                    F4.d.b(traceRouteActivity, traceRouteActivity.getString(R.string.speedtest_no_data));
                    break;
                }
            default:
                BaseViewHolder baseViewHolder = (BaseViewHolder) obj3;
                J4.c cVar = (J4.c) obj2;
                q5.i.e(baseViewHolder, "$viewHolder");
                q5.i.e(cVar, "this$0");
                q5.i.e((J4.a) obj, "$provider");
                int bindingAdapterPosition = baseViewHolder.getBindingAdapterPosition();
                if (bindingAdapterPosition != -1 && AbstractC2282j.V(bindingAdapterPosition, cVar.f4668b) != null) {
                    q5.i.d(view, "v");
                    break;
                }
                break;
        }
    }
}
