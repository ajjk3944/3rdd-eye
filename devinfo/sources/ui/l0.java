package ui;

import android.R;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.x1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l0 extends x1 implements View.OnClickListener, View.OnLongClickListener {

    /* renamed from: c, reason: collision with root package name */
    public final View f35427c;

    /* renamed from: d, reason: collision with root package name */
    public final View f35428d;

    /* renamed from: e, reason: collision with root package name */
    public final View f35429e;

    /* renamed from: f, reason: collision with root package name */
    public final View f35430f;
    public final View g;

    /* renamed from: h, reason: collision with root package name */
    public final View f35431h;

    /* renamed from: i, reason: collision with root package name */
    public final vi.a f35432i;
    public final /* synthetic */ ig.e j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(ig.e eVar, vi.a aVar) {
        super(aVar.f36246a);
        this.j = eVar;
        this.f35432i = aVar;
        LinearLayout linearLayout = aVar.f36251f;
        linearLayout.setOnClickListener(this);
        linearLayout.setOnLongClickListener(this);
        View view = (View) aVar.f36253i.getParent();
        this.f35428d = view;
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        View view2 = (View) aVar.f36249d.getParent();
        this.f35431h = view2;
        view2.setOnClickListener(this);
        View view3 = (View) aVar.f36254k.getParent();
        this.f35429e = view3;
        view3.setOnClickListener(this);
        View view4 = (View) aVar.j.getParent();
        this.f35430f = view4;
        view4.setOnClickListener(this);
        View view5 = (View) aVar.g.getParent();
        this.g = view5;
        view5.setOnClickListener(this);
        View view6 = (View) aVar.f36250e.getParent();
        this.f35427c = view6;
        view6.setOnClickListener(this);
        TextView textView = aVar.f36255l;
        Drawable background = textView.getBackground();
        if (background != null) {
            Object obj = a.a.f3c.f189b;
            Drawable drawableM = wb.e.M(background, zh.i.c(this.itemView.getContext()));
            drawableM.setAlpha(153);
            textView.setBackground(drawableM);
        }
        if (Build.VERSION.SDK_INT < 24) {
            view6.setVisibility(8);
        }
    }

    public final void a(int i4, String str) {
        t7.m mVar = new t7.m(((m0) this.j.f25975k).f35437b0);
        ((i.b) mVar.f34474c).f25233d = str;
        mVar.v(i4);
        mVar.w(R.string.ok, null);
        ((z2.k) a.a.f3c.f189b).d(mVar.A());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        m0 m0Var = (m0) this.j.f25975k;
        int bindingAdapterPosition = getBindingAdapterPosition();
        if (bindingAdapterPosition < 0 || bindingAdapterPosition >= m0Var.Z.f35441a.size()) {
            return;
        }
        k0 k0Var = (k0) m0Var.Z.f35441a.get(bindingAdapterPosition);
        vi.a aVar = this.f35432i;
        if (view == aVar.f36251f) {
            aVar.f36247b.animate().rotation(k0Var.f35410b ? 0.0f : 180.0f).start();
            aVar.f36248c.setVisibility(k0Var.f35410b ? 8 : 0);
            k0Var.f35410b = !k0Var.f35410b;
            return;
        }
        if (view == this.f35427c) {
            StringBuilder sb2 = new StringBuilder();
            r5.c.r(m0Var.f35437b0, com.liuzh.deviceinfo.R.string.appi_external, sb2, ": ");
            sb2.append((Object) aVar.f36250e.getText());
            a(com.liuzh.deviceinfo.R.string.appi_service_external_service_description, sb2.toString());
            return;
        }
        if (view == this.f35428d) {
            StringBuilder sb3 = new StringBuilder();
            r5.c.r(m0Var.f35437b0, com.liuzh.deviceinfo.R.string.appi_permission, sb3, ": ");
            sb3.append((Object) aVar.f36253i.getText());
            a(com.liuzh.deviceinfo.R.string.appi_service_permission_description, sb3.toString());
            return;
        }
        if (view == this.f35431h) {
            StringBuilder sb4 = new StringBuilder();
            r5.c.r(m0Var.f35437b0, com.liuzh.deviceinfo.R.string.appi_exported, sb4, ": ");
            sb4.append((Object) aVar.f36249d.getText());
            a(com.liuzh.deviceinfo.R.string.appi_service_exported_description, sb4.toString());
            return;
        }
        if (view == this.f35429e) {
            StringBuilder sb5 = new StringBuilder();
            r5.c.r(m0Var.f35437b0, com.liuzh.deviceinfo.R.string.appi_service_stop_with_task, sb5, ": ");
            sb5.append((Object) aVar.f36254k.getText());
            a(com.liuzh.deviceinfo.R.string.appi_service_stop_with_task_description, sb5.toString());
            return;
        }
        if (view == this.f35430f) {
            StringBuilder sb6 = new StringBuilder();
            r5.c.r(m0Var.f35437b0, com.liuzh.deviceinfo.R.string.appi_service_single_user, sb6, ": ");
            sb6.append((Object) aVar.j.getText());
            a(com.liuzh.deviceinfo.R.string.appi_service_single_user_description, sb6.toString());
            return;
        }
        if (view == this.g) {
            StringBuilder sb7 = new StringBuilder();
            r5.c.r(m0Var.f35437b0, com.liuzh.deviceinfo.R.string.appi_service_isolated_process, sb7, ": ");
            sb7.append((Object) aVar.g.getText());
            a(com.liuzh.deviceinfo.R.string.appi_service_isolated_process_description, sb7.toString());
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        m0 m0Var = (m0) this.j.f25975k;
        View view2 = this.f35428d;
        vi.a aVar = this.f35432i;
        if (view == view2) {
            je.u.A(aVar.f36253i, m0Var.f35437b0);
            return true;
        }
        if (view != aVar.f36251f) {
            return false;
        }
        je.u.A(aVar.f36256m, m0Var.f35437b0);
        return true;
    }
}
