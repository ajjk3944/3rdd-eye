package ig;

import android.os.Build;
import android.text.TextUtils;
import android.widget.TextView;
import com.liuzh.deviceinfo.card.OverviewCard;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25985a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OverviewCard f25986b;

    public /* synthetic */ j(OverviewCard overviewCard, int i4) {
        this.f25985a = i4;
        this.f25986b = overviewCard;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f25985a;
        OverviewCard overviewCard = this.f25986b;
        switch (i4) {
            case 0:
                int i10 = OverviewCard.f21189e;
                String strM = ci.b.m();
                if (!TextUtils.isEmpty(strM)) {
                    bi.d.b(new aj.d(25, overviewCard, strM));
                    break;
                }
                break;
            case 1:
                int i11 = OverviewCard.f21189e;
                com.liuzh.deviceinfo.utilities.k kVarI = com.liuzh.deviceinfo.utilities.l.I();
                if (kVarI != null) {
                    bi.d.b(new aj.d(26, overviewCard, kVarI));
                    break;
                } else {
                    bi.d.b(new j(overviewCard, 2));
                    break;
                }
            default:
                int i12 = OverviewCard.f21189e;
                TextView textView = overviewCard.f21191b;
                int i13 = Build.VERSION.SDK_INT;
                textView.setText(com.liuzh.deviceinfo.utilities.d.b(i13));
                overviewCard.f21192c.setText(com.liuzh.deviceinfo.utilities.d.a(i13));
                break;
        }
    }
}
