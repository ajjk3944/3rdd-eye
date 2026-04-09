package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.phuongpn.whousemywifi.networkscanner.R;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class yk0 extends wo0 {
    public final ImageView u;
    public final TextView v;
    public final TextView w;
    public final TextView x;

    public yk0(View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.iv_icon);
        i30.l(viewFindViewById, "findViewById(...)");
        this.u = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.tv_ip);
        i30.l(viewFindViewById2, "findViewById(...)");
        this.v = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.tv_time);
        i30.l(viewFindViewById3, "findViewById(...)");
        this.w = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.tv_des);
        i30.l(viewFindViewById4, "findViewById(...)");
        this.x = (TextView) viewFindViewById4;
    }
}
