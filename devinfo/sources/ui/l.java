package ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.x1;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l extends x1 implements View.OnClickListener, View.OnLongClickListener {

    /* renamed from: c, reason: collision with root package name */
    public final TextView f35416c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f35417d;

    /* renamed from: e, reason: collision with root package name */
    public final View f35418e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f35419f;
    public final View g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f35420h;

    /* renamed from: i, reason: collision with root package name */
    public final View f35421i;
    public final TextView j;

    /* renamed from: k, reason: collision with root package name */
    public final View f35422k;

    /* renamed from: l, reason: collision with root package name */
    public final View f35423l;

    /* renamed from: m, reason: collision with root package name */
    public final View f35424m;

    /* renamed from: n, reason: collision with root package name */
    public final ImageView f35425n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ig.e f35426o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ig.e eVar, View view) {
        super(view);
        this.f35426o = eVar;
        this.f35423l = view.findViewById(R.id.details_container);
        View viewFindViewById = view.findViewById(R.id.head_container);
        this.f35424m = viewFindViewById;
        this.f35425n = (ImageView) view.findViewById(R.id.arrow);
        viewFindViewById.setOnClickListener(this);
        viewFindViewById.setOnLongClickListener(this);
        this.f35416c = (TextView) view.findViewById(R.id.tv_class);
        TextView textView = (TextView) view.findViewById(R.id.authority);
        this.f35417d = textView;
        View view2 = (View) textView.getParent();
        this.f35418e = view2;
        view2.setOnClickListener(this);
        view2.setOnLongClickListener(this);
        TextView textView2 = (TextView) view.findViewById(R.id.exported);
        this.j = textView2;
        View view3 = (View) textView2.getParent();
        this.f35422k = view3;
        view3.setOnClickListener(this);
        TextView textView3 = (TextView) view.findViewById(R.id.read_permission);
        this.f35419f = textView3;
        View view4 = (View) textView3.getParent();
        this.g = view4;
        view4.setOnClickListener(this);
        TextView textView4 = (TextView) view.findViewById(R.id.write_permission);
        this.f35420h = textView4;
        View view5 = (View) textView4.getParent();
        this.f35421i = view5;
        view5.setOnClickListener(this);
    }

    public final void a(int i4, String str) {
        t7.m mVar = new t7.m(((m) this.f35426o.f25975k).f35434b0);
        ((i.b) mVar.f34474c).f25233d = str;
        mVar.v(i4);
        mVar.w(android.R.string.ok, null);
        ((z2.k) a.a.f3c.f189b).d(mVar.A());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        m mVar = (m) this.f35426o.f25975k;
        int adapterPosition = getAdapterPosition();
        if (adapterPosition < 0 || adapterPosition >= mVar.Z.f35443a.size()) {
            return;
        }
        n nVar = (n) mVar.Z.f35443a.get(adapterPosition);
        if (view == this.f35424m) {
            this.f35425n.animate().rotation(nVar.f35440b ? 0.0f : 180.0f).start();
            this.f35423l.setVisibility(nVar.f35440b ? 8 : 0);
            nVar.f35440b = !nVar.f35440b;
            return;
        }
        if (view == this.f35418e) {
            StringBuilder sb2 = new StringBuilder();
            r5.c.r(mVar.f35434b0, R.string.appi_provider_authority, sb2, ": ");
            sb2.append((Object) this.f35417d.getText());
            a(R.string.appi_provider_authority_description, sb2.toString());
            return;
        }
        if (view == this.f35422k) {
            StringBuilder sb3 = new StringBuilder();
            r5.c.r(mVar.f35434b0, R.string.appi_provider_exported, sb3, ": ");
            sb3.append((Object) this.j.getText());
            a(R.string.appi_provider_exported_description, sb3.toString());
            return;
        }
        if (view == this.g) {
            StringBuilder sb4 = new StringBuilder();
            r5.c.r(mVar.f35434b0, R.string.appi_provider_read_permission, sb4, ": ");
            sb4.append((Object) this.f35419f.getText());
            a(R.string.appi_provider_read_permission_description, sb4.toString());
            return;
        }
        if (view == this.f35421i) {
            StringBuilder sb5 = new StringBuilder();
            r5.c.r(mVar.f35434b0, R.string.appi_provider_write_permission, sb5, ": ");
            sb5.append((Object) this.f35420h.getText());
            a(R.string.appi_provider_write_permission_description, sb5.toString());
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        m mVar = (m) this.f35426o.f25975k;
        if (view == this.f35418e) {
            je.u.A(this.f35417d, mVar.f35434b0);
            return true;
        }
        if (view == this.f35424m) {
            je.u.A(this.f35416c, mVar.f35434b0);
            return true;
        }
        if (view == this.g) {
            je.u.A(this.f35419f, mVar.f35434b0);
            return true;
        }
        if (view != this.f35421i) {
            return false;
        }
        je.u.A(this.f35420h, mVar.f35434b0);
        return true;
    }
}
