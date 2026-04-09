package zd;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import o.o;

/* loaded from: classes.dex */
public final class j extends FrameLayout implements h {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f27360a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f27361d;

    /* renamed from: g, reason: collision with root package name */
    public boolean f27362g;

    /* renamed from: r, reason: collision with root package name */
    public o f27363r;

    /* renamed from: x, reason: collision with root package name */
    public ColorStateList f27364x;

    public j(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(ed.h.m3_navigation_menu_subheader, (ViewGroup) this, true);
        this.f27360a = (TextView) findViewById(ed.f.navigation_menu_subheader_label);
    }

    @Override // o.z
    public final void a(o oVar) {
        this.f27363r = oVar;
        oVar.setCheckable(false);
        this.f27360a.setText(oVar.f18642e);
        b();
    }

    public final void b() {
        o oVar = this.f27363r;
        if (oVar != null) {
            setVisibility((!oVar.isVisible() || (!this.f27361d && this.f27362g)) ? 8 : 0);
        }
    }

    @Override // o.z
    public o getItemData() {
        return this.f27363r;
    }

    @Override // zd.h
    public void setExpanded(boolean z10) {
        this.f27361d = z10;
        b();
    }

    @Override // zd.h
    public void setOnlyShowWhenExpanded(boolean z10) {
        this.f27362g = z10;
        b();
    }

    public void setTextAppearance(int i10) {
        TextView textView = this.f27360a;
        textView.setTextAppearance(i10);
        ColorStateList colorStateList = this.f27364x;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f27364x = colorStateList;
        if (colorStateList != null) {
            this.f27360a.setTextColor(colorStateList);
        }
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
    }

    public void setIcon(Drawable drawable) {
    }

    public void setTitle(CharSequence charSequence) {
    }
}
