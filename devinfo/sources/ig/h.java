package ig;

import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.card.DrmInfoCard;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25980a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DrmInfoCard f25981b;

    public /* synthetic */ h(DrmInfoCard drmInfoCard, int i4) {
        this.f25980a = i4;
        this.f25981b = drmInfoCard;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i4 = this.f25980a;
        DrmInfoCard drmInfoCard = this.f25981b;
        switch (i4) {
            case 0:
                int i10 = drmInfoCard.f21182a;
                List<Pair> listG = com.liuzh.deviceinfo.utilities.l.g();
                if (listG.isEmpty()) {
                    bi.d.b(new h(drmInfoCard, 1));
                    break;
                } else {
                    LayoutInflater layoutInflaterFrom = LayoutInflater.from(drmInfoCard.getContext());
                    LinearLayout linearLayout = (LinearLayout) DrmInfoCard.a(R.layout.card_overview_drm, layoutInflaterFrom, drmInfoCard);
                    if (linearLayout == null) {
                        bi.d.b(new h(drmInfoCard, 2));
                        break;
                    } else {
                        TextView textView = (TextView) DrmInfoCard.a(R.layout.kvcard_name, layoutInflaterFrom, linearLayout);
                        if (textView == null) {
                            bi.d.b(new h(drmInfoCard, 3));
                            break;
                        } else {
                            textView.setTextColor(i10);
                            int iC = a4.a.c(DeviceInfoApp.f21145f.getResources(), 4.0f);
                            textView.setPadding(textView.getPaddingLeft(), iC, textView.getPaddingRight(), iC);
                            textView.setText(R.string.drm);
                            linearLayout.addView(textView);
                            for (Pair pair : listG) {
                                View viewA = DrmInfoCard.a(R.layout.kvcard_item, layoutInflaterFrom, linearLayout);
                                if (viewA == null) {
                                    bi.d.b(new h(drmInfoCard, 4));
                                    break;
                                } else {
                                    ((TextView) viewA.findViewById(R.id.name)).setText((CharSequence) pair.first);
                                    TextView textView2 = (TextView) viewA.findViewById(R.id.value);
                                    textView2.setTextColor(i10);
                                    textView2.setText((CharSequence) pair.second);
                                    linearLayout.addView(viewA);
                                    ((ViewGroup.MarginLayoutParams) viewA.getLayoutParams()).topMargin = 0;
                                }
                            }
                            bi.d.b(new aj.d(23, drmInfoCard, linearLayout));
                            break;
                        }
                    }
                }
            case 1:
                int i11 = DrmInfoCard.f21181b;
                drmInfoCard.getClass();
                com.bumptech.glide.c.s(drmInfoCard);
                break;
            case 2:
                int i12 = DrmInfoCard.f21181b;
                drmInfoCard.getClass();
                com.bumptech.glide.c.s(drmInfoCard);
                break;
            case 3:
                int i13 = DrmInfoCard.f21181b;
                drmInfoCard.getClass();
                com.bumptech.glide.c.s(drmInfoCard);
                break;
            default:
                int i14 = DrmInfoCard.f21181b;
                drmInfoCard.getClass();
                com.bumptech.glide.c.s(drmInfoCard);
                break;
        }
    }
}
