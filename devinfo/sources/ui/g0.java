package ui;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.x1;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g0 extends x1 implements View.OnClickListener, View.OnLongClickListener {

    /* renamed from: c, reason: collision with root package name */
    public final TextView f35375c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f35376d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f35377e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f35378f;
    public final View g;

    /* renamed from: h, reason: collision with root package name */
    public final View f35379h;

    /* renamed from: i, reason: collision with root package name */
    public final View f35380i;
    public final /* synthetic */ ig.e j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(ig.e eVar, View view) {
        super(view);
        this.j = eVar;
        view.findViewById(R.id.divider).setVisibility(8);
        View viewFindViewById = view.findViewById(R.id.head_container);
        this.f35379h = viewFindViewById;
        viewFindViewById.setOnClickListener(this);
        viewFindViewById.setOnLongClickListener(this);
        this.f35375c = (TextView) view.findViewById(R.id.tv_permission);
        TextView textView = (TextView) view.findViewById(R.id.status);
        this.f35376d = textView;
        View view2 = (View) textView.getParent();
        this.g = view2;
        view2.setOnClickListener(this);
        View viewFindViewById2 = view.findViewById(R.id.protection_level_container);
        this.f35380i = viewFindViewById2;
        viewFindViewById2.setOnClickListener(this);
        this.f35378f = (TextView) view.findViewById(R.id.protection_level);
        this.f35377e = (TextView) view.findViewById(R.id.description);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ig.e eVar = this.j;
        h0 h0Var = (h0) eVar.f25975k;
        if (view == this.g) {
            StringBuilder sb2 = new StringBuilder();
            r5.c.r(h0Var.f35386b0, R.string.appi_required_permission_status, sb2, ": ");
            sb2.append((Object) this.f35376d.getText());
            String string = sb2.toString();
            t7.m mVar = new t7.m(((h0) eVar.f25975k).f35386b0);
            ((i.b) mVar.f34474c).f25233d = string;
            mVar.v(R.string.appi_required_permission_granted_status_description);
            mVar.w(android.R.string.ok, null);
            mVar.x(R.string.appi_manage_permission, new eg.d(10, this));
            ((z2.k) a.a.f3c.f189b).d(mVar.A());
            return;
        }
        if (view == this.f35380i) {
            StringBuilder sb3 = new StringBuilder();
            r5.c.r(h0Var.f35386b0, R.string.appi_protection_level, sb3, ": ");
            sb3.append((Object) this.f35378f.getText());
            String string2 = sb3.toString();
            t7.m mVar2 = new t7.m(((h0) eVar.f25975k).f35386b0);
            ((i.b) mVar2.f34474c).f25233d = string2;
            mVar2.v(R.string.appi_def_permission_protection_level_description);
            mVar2.w(android.R.string.ok, null);
            ((z2.k) a.a.f3c.f189b).d(mVar2.A());
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (view != this.f35379h) {
            return false;
        }
        Context context = ((h0) this.j.f25975k).f35386b0;
        String string = this.f35375c.getText().toString();
        nk.k.e(context, "context");
        nk.k.e(string, "text");
        nh.a.c(context, "", string, false);
        return true;
    }
}
