package rk;

import android.view.View;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class h implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public int f21630a = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f21631d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ TextView f21632g;

    public h(TextView textView, TextView textView2) {
        this.f21631d = textView;
        this.f21632g = textView2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f21630a;
        this.f21630a = i10 + 1;
        if (i10 == 11) {
            this.f21631d.setVisibility(0);
            this.f21632g.setVisibility(0);
        }
    }
}
