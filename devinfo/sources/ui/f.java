package ui;

import android.R;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.x1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f extends x1 implements View.OnClickListener, View.OnLongClickListener {

    /* renamed from: c, reason: collision with root package name */
    public final View f35366c;

    /* renamed from: d, reason: collision with root package name */
    public final View f35367d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.android.gms.internal.consent_sdk.d f35368e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ig.e f35369f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ig.e eVar, com.google.android.gms.internal.consent_sdk.d dVar) {
        super((CardView) dVar.f19295a);
        this.f35369f = eVar;
        this.f35368e = dVar;
        LinearLayout linearLayout = (LinearLayout) dVar.f19299e;
        linearLayout.setOnClickListener(this);
        linearLayout.setOnLongClickListener(this);
        View view = (View) ((TextView) dVar.g).getParent();
        this.f35366c = view;
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        View view2 = (View) ((TextView) dVar.f19298d).getParent();
        this.f35367d = view2;
        view2.setOnClickListener(this);
        TextView textView = (TextView) dVar.f19301h;
        Drawable background = textView.getBackground();
        if (background != null) {
            Object obj = a.a.f3c.f189b;
            Drawable drawableM = wb.e.M(background, zh.i.c(this.itemView.getContext()));
            drawableM.setAlpha(153);
            textView.setBackground(drawableM);
        }
    }

    public final void a(int i4, String str) {
        t7.m mVar = new t7.m(((g) this.f35369f.f25975k).f35373b0);
        ((i.b) mVar.f34474c).f25233d = str;
        mVar.v(i4);
        mVar.w(R.string.ok, null);
        ((z2.k) a.a.f3c.f189b).d(mVar.A());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int bindingAdapterPosition = getBindingAdapterPosition();
        g gVar = (g) this.f35369f.f25975k;
        h hVar = (h) gVar.Z.f35388a.get(bindingAdapterPosition);
        com.google.android.gms.internal.consent_sdk.d dVar = this.f35368e;
        if (view == ((LinearLayout) dVar.f19299e)) {
            ((ImageView) dVar.f19296b).animate().rotation(hVar.f35384d ? 0.0f : 180.0f).start();
            ((LinearLayout) dVar.f19297c).setVisibility(hVar.f35384d ? 8 : 0);
            hVar.f35384d = !hVar.f35384d;
        } else {
            if (view == this.f35366c) {
                StringBuilder sb2 = new StringBuilder();
                r5.c.r(gVar.f35373b0, com.liuzh.deviceinfo.R.string.appi_receiver_permission, sb2, ": ");
                sb2.append((Object) ((TextView) dVar.g).getText());
                a(com.liuzh.deviceinfo.R.string.appi_receiver_permission_description, sb2.toString());
                return;
            }
            if (view == this.f35367d) {
                StringBuilder sb3 = new StringBuilder();
                r5.c.r(gVar.f35373b0, com.liuzh.deviceinfo.R.string.appi_receiver_exported, sb3, ": ");
                sb3.append((Object) ((TextView) dVar.f19298d).getText());
                a(com.liuzh.deviceinfo.R.string.appi_receiver_exported_description, sb3.toString());
            }
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        g gVar = (g) this.f35369f.f25975k;
        View view2 = this.f35366c;
        com.google.android.gms.internal.consent_sdk.d dVar = this.f35368e;
        if (view == view2) {
            je.u.A((TextView) dVar.g, gVar.f35373b0);
            return true;
        }
        if (view != ((LinearLayout) dVar.f19299e)) {
            return false;
        }
        je.u.A((TextView) dVar.f19302i, gVar.f35373b0);
        return true;
    }
}
