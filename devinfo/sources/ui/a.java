package ui;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.x1;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a extends x1 implements View.OnClickListener, View.OnLongClickListener {

    /* renamed from: c, reason: collision with root package name */
    public final TextView f35329c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f35330d;

    /* renamed from: e, reason: collision with root package name */
    public final View f35331e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f35332f;
    public final View g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f35333h;

    /* renamed from: i, reason: collision with root package name */
    public final View f35334i;
    public final TextView j;

    /* renamed from: k, reason: collision with root package name */
    public final View f35335k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f35336l;

    /* renamed from: m, reason: collision with root package name */
    public final View f35337m;

    /* renamed from: n, reason: collision with root package name */
    public final TextView f35338n;

    /* renamed from: o, reason: collision with root package name */
    public final View f35339o;

    /* renamed from: p, reason: collision with root package name */
    public final View f35340p;

    /* renamed from: q, reason: collision with root package name */
    public final View f35341q;

    /* renamed from: r, reason: collision with root package name */
    public final View f35342r;

    /* renamed from: s, reason: collision with root package name */
    public final ImageView f35343s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ sh.m0 f35344t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(sh.m0 m0Var, View view) {
        super(view);
        this.f35344t = m0Var;
        this.f35341q = view.findViewById(R.id.details_container);
        View viewFindViewById = view.findViewById(R.id.head_container);
        this.f35342r = viewFindViewById;
        this.f35343s = (ImageView) view.findViewById(R.id.arrow);
        viewFindViewById.setOnClickListener(this);
        viewFindViewById.setOnLongClickListener(this);
        this.f35329c = (TextView) view.findViewById(R.id.activity_class);
        TextView textView = (TextView) view.findViewById(R.id.label);
        this.f35330d = textView;
        View view2 = (View) textView.getParent();
        this.f35331e = view2;
        view2.setOnClickListener(this);
        view2.setOnLongClickListener(this);
        TextView textView2 = (TextView) view.findViewById(R.id.permission);
        this.f35332f = textView2;
        View view3 = (View) textView2.getParent();
        this.g = view3;
        view3.setOnClickListener(this);
        view3.setOnLongClickListener(this);
        TextView textView3 = (TextView) view.findViewById(R.id.task_affinity);
        this.f35338n = textView3;
        View view4 = (View) textView3.getParent();
        this.f35339o = view4;
        view4.setOnClickListener(this);
        view4.setOnLongClickListener(this);
        TextView textView4 = (TextView) view.findViewById(R.id.soft_input_mode);
        this.f35333h = textView4;
        View view5 = (View) textView4.getParent();
        this.f35334i = view5;
        view5.setOnClickListener(this);
        view5.setOnLongClickListener(this);
        TextView textView5 = (TextView) view.findViewById(R.id.orientation);
        this.j = textView5;
        View view6 = (View) textView5.getParent();
        this.f35335k = view6;
        view6.setOnClickListener(this);
        view6.setOnLongClickListener(this);
        TextView textView6 = (TextView) view.findViewById(R.id.launch_mode);
        this.f35336l = textView6;
        View view7 = (View) textView6.getParent();
        this.f35337m = view7;
        view7.setOnClickListener(this);
        view7.setOnLongClickListener(this);
        View viewFindViewById2 = view.findViewById(R.id.launch);
        this.f35340p = viewFindViewById2;
        viewFindViewById2.setOnClickListener(this);
    }

    public final void a(int i4, String str) {
        t7.m mVar = new t7.m(((b) this.f35344t.f33736l).f35348b0);
        ((i.b) mVar.f34474c).f25233d = str;
        mVar.v(i4);
        mVar.w(android.R.string.ok, null);
        ((z2.k) a.a.f3c.f189b).d(mVar.A());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int adapterPosition = getAdapterPosition();
        b bVar = (b) this.f35344t.f33736l;
        c cVar = (c) bVar.Z.f35355a.get(adapterPosition);
        if (view == this.f35340p) {
            try {
                Intent intent = new Intent();
                intent.setComponent(cVar.f35352c);
                bVar.f35348b0.startActivity(intent);
                return;
            } catch (Exception unused) {
                Toast.makeText(bVar.f35348b0, R.string.appi_unable_to_start, 0).show();
                return;
            }
        }
        if (view == this.f35342r) {
            this.f35343s.animate().rotation(cVar.f35351b ? 0.0f : 180.0f).start();
            this.f35341q.setVisibility(cVar.f35351b ? 8 : 0);
            cVar.f35351b = !cVar.f35351b;
            return;
        }
        if (view == this.f35331e) {
            StringBuilder sb2 = new StringBuilder();
            r5.c.r(bVar.f35348b0, R.string.appi_label, sb2, ": ");
            sb2.append((Object) this.f35330d.getText());
            a(R.string.appi_activity_label_description, sb2.toString());
            return;
        }
        if (view == this.g) {
            StringBuilder sb3 = new StringBuilder();
            r5.c.r(bVar.f35348b0, R.string.appi_permission, sb3, ": ");
            sb3.append((Object) this.f35332f.getText());
            a(R.string.appi_activity_permission_description, sb3.toString());
            return;
        }
        if (view == this.f35339o) {
            StringBuilder sb4 = new StringBuilder();
            r5.c.r(bVar.f35348b0, R.string.appi_task_affinity, sb4, ": ");
            sb4.append((Object) this.f35338n.getText());
            a(R.string.appi_activity_task_affinity_description, sb4.toString());
            return;
        }
        if (view == this.f35334i) {
            StringBuilder sb5 = new StringBuilder();
            r5.c.r(bVar.f35348b0, R.string.appi_soft_input_mode, sb5, ": ");
            sb5.append((Object) this.f35333h.getText());
            a(R.string.appi_activity_soft_input_mode_description, sb5.toString());
            return;
        }
        if (view == this.f35335k) {
            StringBuilder sb6 = new StringBuilder();
            r5.c.r(bVar.f35348b0, R.string.appi_orientation, sb6, ": ");
            sb6.append((Object) this.j.getText());
            a(R.string.appi_activity_orientation_description, sb6.toString());
            return;
        }
        if (view == this.f35337m) {
            StringBuilder sb7 = new StringBuilder();
            r5.c.r(bVar.f35348b0, R.string.appi_launch_mode, sb7, ": ");
            sb7.append((Object) this.f35336l.getText());
            a(R.string.appi_activity_launch_mode_description, sb7.toString());
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        b bVar = (b) this.f35344t.f33736l;
        if (view == this.f35342r) {
            je.u.A(this.f35329c, bVar.f35348b0);
            return true;
        }
        if (view == this.f35331e) {
            je.u.A(this.f35330d, bVar.f35348b0);
            return true;
        }
        if (view == this.g) {
            je.u.A(this.f35332f, bVar.f35348b0);
            return true;
        }
        if (view == this.f35339o) {
            je.u.A(this.f35338n, bVar.f35348b0);
            return true;
        }
        if (view == this.f35334i) {
            je.u.A(this.f35333h, bVar.f35348b0);
            return true;
        }
        if (view == this.f35335k) {
            je.u.A(this.j, bVar.f35348b0);
            return true;
        }
        if (view != this.f35337m) {
            return false;
        }
        je.u.A(this.f35336l, bVar.f35348b0);
        return true;
    }
}
