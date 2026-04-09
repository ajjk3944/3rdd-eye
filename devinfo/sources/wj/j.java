package wj;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f36793a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f36794b;

    /* renamed from: c, reason: collision with root package name */
    public final ProgressBar f36795c;

    /* renamed from: d, reason: collision with root package name */
    public final View f36796d;

    /* renamed from: e, reason: collision with root package name */
    public final View f36797e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f36798f;

    public j(View view) {
        this.f36797e = view;
        this.f36793a = (TextView) view.findViewById(R.id.tv_title);
        this.f36794b = (TextView) view.findViewById(R.id.tv_right_text);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.progressBar);
        this.f36795c = progressBar;
        o7.d dVar = ii.a.f26002b;
        nk.k.b(dVar);
        dj.b.j(progressBar, (z2.k) dVar.f30421b);
        this.f36796d = view.findViewById(R.id.color_dot);
        this.f36798f = (ImageView) view.findViewById(R.id.icon);
    }
}
