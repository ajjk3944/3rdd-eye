package ah;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.xz;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.monitor.CustomMonitorActivity;
import com.liuzh.deviceinfo.pro.account.AccountProActivity;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f389a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f390b;

    public /* synthetic */ i(int i4, Object obj) {
        this.f389a = i4;
        this.f390b = obj;
    }

    @Override // ah.n
    public final void i(boolean z3) {
        int i4 = this.f389a;
        Object obj = this.f390b;
        switch (i4) {
            case 0:
                i.e eVar = (i.e) obj;
                if (z3) {
                    DeviceInfoApp deviceInfoApp = fi.a.f24058a;
                    try {
                        eVar.dismiss();
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                return;
            case 1:
                int i10 = AccountProActivity.H;
                ((AccountProActivity) obj).D();
                return;
            default:
                CustomMonitorActivity customMonitorActivity = (CustomMonitorActivity) obj;
                xz xzVar = customMonitorActivity.B;
                if (xzVar == null) {
                    nk.k.k("viewBinding");
                    throw null;
                }
                ((LinearLayout) xzVar.f18589f).setVisibility(!z3 ? 0 : 8);
                xz xzVar2 = customMonitorActivity.B;
                if (xzVar2 == null) {
                    nk.k.k("viewBinding");
                    throw null;
                }
                RecyclerView recyclerView = (RecyclerView) xzVar2.g;
                ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = z3 ? 0 : customMonitorActivity.getResources().getDimensionPixelSize(R.dimen.content_padding);
                recyclerView.setLayoutParams(marginLayoutParams);
                return;
        }
    }
}
