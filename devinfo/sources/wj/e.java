package wj;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.x1;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e extends x1 {

    /* renamed from: c, reason: collision with root package name */
    public final FrameLayout f36777c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(View view) {
        super(view);
        nk.k.e(view, "itemView");
        View viewFindViewById = view.findViewById(R.id.ad_container);
        nk.k.d(viewFindViewById, "findViewById(...)");
        this.f36777c = (FrameLayout) viewFindViewById;
    }
}
