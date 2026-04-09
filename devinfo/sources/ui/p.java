package ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.x1;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class p extends x1 implements View.OnClickListener, View.OnLongClickListener {

    /* renamed from: c, reason: collision with root package name */
    public final TextView f35445c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f35446d;

    /* renamed from: e, reason: collision with root package name */
    public final View f35447e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f35448f;
    public final View g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f35449h;

    /* renamed from: i, reason: collision with root package name */
    public final View f35450i;
    public final TextView j;

    /* renamed from: k, reason: collision with root package name */
    public final View f35451k;

    /* renamed from: l, reason: collision with root package name */
    public final View f35452l;

    /* renamed from: m, reason: collision with root package name */
    public final View f35453m;

    /* renamed from: n, reason: collision with root package name */
    public final ImageView f35454n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ig.e f35455o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ig.e eVar, View view) {
        super(view);
        this.f35455o = eVar;
        this.f35452l = view.findViewById(R.id.details_container);
        View viewFindViewById = view.findViewById(R.id.head_container);
        this.f35453m = viewFindViewById;
        this.f35454n = (ImageView) view.findViewById(R.id.arrow);
        viewFindViewById.setOnClickListener(this);
        viewFindViewById.setOnLongClickListener(this);
        this.f35446d = (TextView) view.findViewById(R.id.tv_permission);
        TextView textView = (TextView) view.findViewById(R.id.name);
        this.f35445c = textView;
        View view2 = (View) textView.getParent();
        this.f35447e = view2;
        view2.setOnClickListener(this);
        view2.setOnLongClickListener(this);
        TextView textView2 = (TextView) view.findViewById(R.id.description);
        this.j = textView2;
        View view3 = (View) textView2.getParent();
        this.f35451k = view3;
        view3.setOnClickListener(this);
        view3.setOnLongClickListener(this);
        TextView textView3 = (TextView) view.findViewById(R.id.group);
        this.f35448f = textView3;
        View view4 = (View) textView3.getParent();
        this.g = view4;
        view4.setOnClickListener(this);
        view4.setOnLongClickListener(this);
        TextView textView4 = (TextView) view.findViewById(R.id.protection_level);
        this.f35449h = textView4;
        View view5 = (View) textView4.getParent();
        this.f35450i = view5;
        view5.setOnClickListener(this);
        view5.setOnLongClickListener(this);
    }

    public final void a(int i4, String str) {
        t7.m mVar = new t7.m(((q) this.f35455o.f25975k).f35457b0);
        ((i.b) mVar.f34474c).f25233d = str;
        mVar.v(i4);
        mVar.w(android.R.string.ok, null);
        ((z2.k) a.a.f3c.f189b).d(mVar.A());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        q qVar = (q) this.f35455o.f25975k;
        int bindingAdapterPosition = getBindingAdapterPosition();
        if (bindingAdapterPosition < 0 || bindingAdapterPosition >= qVar.Z.f35465a.size()) {
            return;
        }
        r rVar = (r) qVar.Z.f35465a.get(bindingAdapterPosition);
        if (view == this.f35453m) {
            this.f35454n.animate().rotation(rVar.f35459a ? 0.0f : 180.0f).start();
            this.f35452l.setVisibility(rVar.f35459a ? 8 : 0);
            rVar.f35459a = !rVar.f35459a;
            return;
        }
        if (view == this.f35447e) {
            StringBuilder sb2 = new StringBuilder();
            r5.c.r(qVar.f35457b0, R.string.appi_name, sb2, ": ");
            sb2.append((Object) this.f35445c.getText());
            a(R.string.appi_def_permission_name_description, sb2.toString());
            return;
        }
        if (view == this.f35451k) {
            StringBuilder sb3 = new StringBuilder();
            r5.c.r(qVar.f35457b0, R.string.appi_description, sb3, ": ");
            sb3.append((Object) this.j.getText());
            a(R.string.appi_def_permission_desc_description, sb3.toString());
            return;
        }
        if (view == this.g) {
            StringBuilder sb4 = new StringBuilder();
            r5.c.r(qVar.f35457b0, R.string.appi_defined_permissions_group, sb4, ": ");
            sb4.append((Object) this.f35448f.getText());
            a(R.string.appi_def_permission_group_description, sb4.toString());
            return;
        }
        if (view == this.f35450i) {
            StringBuilder sb5 = new StringBuilder();
            r5.c.r(qVar.f35457b0, R.string.appi_protection_level, sb5, ": ");
            sb5.append((Object) this.f35449h.getText());
            a(R.string.appi_def_permission_protection_level_description, sb5.toString());
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        q qVar = (q) this.f35455o.f25975k;
        if (view == this.f35447e) {
            je.u.A(this.f35445c, qVar.f35457b0);
            return true;
        }
        if (view == this.f35453m) {
            je.u.A(this.f35446d, qVar.f35457b0);
            return true;
        }
        if (view == this.g) {
            je.u.A(this.f35448f, qVar.f35457b0);
            return true;
        }
        if (view == this.f35450i) {
            je.u.A(this.f35449h, qVar.f35457b0);
            return true;
        }
        if (view != this.f35451k) {
            return false;
        }
        je.u.A(this.j, qVar.f35457b0);
        return true;
    }
}
