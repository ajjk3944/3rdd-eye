package ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.x1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c0 extends x1 implements View.OnClickListener {

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.internal.consent_sdk.a0 f35353c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ej.e f35354d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(ej.e eVar, com.google.android.gms.internal.consent_sdk.a0 a0Var) {
        super((CardView) a0Var.f19255b);
        this.f35354d = eVar;
        this.f35353c = a0Var;
        TextView textView = (TextView) a0Var.f19261i;
        Drawable background = textView.getBackground();
        if (background != null) {
            Object obj = a.a.f3c.f189b;
            Drawable drawableM = wb.e.M(background, zh.i.c(this.itemView.getContext()));
            drawableM.setAlpha(153);
            textView.setBackground(drawableM);
        }
        ((LinearLayout) a0Var.f19258e).setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        e0 e0Var = (e0) ((d0) this.f35354d.j).f35357c0.get(getBindingAdapterPosition());
        com.google.android.gms.internal.consent_sdk.a0 a0Var = this.f35353c;
        if (view == ((LinearLayout) a0Var.f19258e)) {
            ((ImageView) a0Var.f19256c).animate().rotation(e0Var.f35365f ? 0.0f : 180.0f).start();
            ((LinearLayout) a0Var.f19257d).setVisibility(e0Var.f35365f ? 8 : 0);
            e0Var.f35365f = !e0Var.f35365f;
        }
    }
}
