package ui;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.x1;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t extends x1 implements View.OnClickListener, View.OnLongClickListener {

    /* renamed from: c, reason: collision with root package name */
    public final TextView f35467c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f35468d;

    /* renamed from: e, reason: collision with root package name */
    public final View f35469e;

    /* renamed from: f, reason: collision with root package name */
    public final View f35470f;
    public final /* synthetic */ ig.e g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(ig.e eVar, View view) {
        super(view);
        this.g = eVar;
        View viewFindViewById = view.findViewById(R.id.head_container);
        this.f35470f = viewFindViewById;
        viewFindViewById.setOnClickListener(this);
        viewFindViewById.setOnLongClickListener(this);
        this.f35467c = (TextView) view.findViewById(R.id.tv_class);
        TextView textView = (TextView) view.findViewById(R.id.required);
        this.f35468d = textView;
        View view2 = (View) textView.getParent();
        this.f35469e = view2;
        view2.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        u uVar = (u) this.g.f25975k;
        if (view == this.f35469e) {
            StringBuilder sb2 = new StringBuilder();
            r5.c.r(uVar.f35472b0, R.string.appi_feature_required, sb2, ": ");
            sb2.append((Object) this.f35468d.getText());
            String string = sb2.toString();
            t7.m mVar = new t7.m(uVar.f35472b0);
            ((i.b) mVar.f34474c).f25233d = string;
            mVar.v(R.string.appi_feature_required_description);
            mVar.w(android.R.string.ok, null);
            ((z2.k) a.a.f3c.f189b).d(mVar.A());
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (view != this.f35470f) {
            return false;
        }
        Context context = ((u) this.g.f25975k).f35472b0;
        String string = this.f35467c.getText().toString();
        nk.k.e(context, "context");
        nk.k.e(string, "text");
        nh.a.c(context, "", string, false);
        return true;
    }
}
