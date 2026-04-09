package sk;

import android.view.View;
import android.widget.TextView;
import h7.n1;

/* loaded from: classes.dex */
public final class j extends n1 {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f22099u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f22100v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f22101w;

    public j(View view) {
        super(view);
        this.f22099u = (TextView) view.findViewById(qk.h.tvName);
        TextView textView = (TextView) view.findViewById(qk.h.tvDistance);
        this.f22100v = (TextView) view.findViewById(qk.h.tvCid);
        this.f22101w = (TextView) view.findViewById(qk.h.tvLac);
        if (textView != null) {
            textView.setVisibility(8);
        }
    }
}
