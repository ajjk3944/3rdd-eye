package wj;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.x1;
import com.liuzh.deviceinfo.R;
import t6.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h extends x1 {

    /* renamed from: c, reason: collision with root package name */
    public final TextView f36782c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f36783d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f36784e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f36785f;
    public final TextView g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f36786h;

    /* renamed from: i, reason: collision with root package name */
    public final Context f36787i;

    public h(View view) {
        super(view);
        this.f36787i = view.getContext();
        if (i0.k()) {
            view.setFocusable(true);
        }
        this.f36782c = (TextView) view.findViewById(R.id.tv_total_apps);
        this.f36783d = (TextView) view.findViewById(R.id.tv_success_count);
        this.f36784e = (TextView) view.findViewById(R.id.tv_failed_count);
        this.f36785f = (TextView) view.findViewById(R.id.tv_sys_apps_count);
        this.g = (TextView) view.findViewById(R.id.tv_user_apps_count);
        this.f36786h = (TextView) view.findViewById(R.id.tv_total_size);
    }
}
