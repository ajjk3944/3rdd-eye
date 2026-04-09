package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.z0;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements i.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    public f f667a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f668b;

    /* renamed from: c, reason: collision with root package name */
    public RadioButton f669c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f670d;

    /* renamed from: e, reason: collision with root package name */
    public CheckBox f671e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f672f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f673g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f674h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f675i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f676j;

    /* renamed from: k, reason: collision with root package name */
    public int f677k;

    /* renamed from: l, reason: collision with root package name */
    public Context f678l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f679m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f680n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f681o;

    /* renamed from: p, reason: collision with root package name */
    public LayoutInflater f682p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f683q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.a.listMenuViewStyle);
    }

    private LayoutInflater getInflater() {
        if (this.f682p == null) {
            this.f682p = LayoutInflater.from(getContext());
        }
        return this.f682p;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f673g;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    public final void a(View view) {
        b(view, -1);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f674h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f674h.getLayoutParams();
        rect.top += this.f674h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final void b(View view, int i10) {
        LinearLayout linearLayout = this.f675i;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    @Override // androidx.appcompat.view.menu.i.a
    public void c(f fVar, int i10) {
        this.f667a = fVar;
        setVisibility(fVar.isVisible() ? 0 : 8);
        setTitle(fVar.i(this));
        setCheckable(fVar.isCheckable());
        h(fVar.A(), fVar.g());
        setIcon(fVar.getIcon());
        setEnabled(fVar.isEnabled());
        setSubMenuArrowVisible(fVar.hasSubMenu());
        setContentDescription(fVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.i.a
    public boolean d() {
        return false;
    }

    public final void e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(c.g.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f671e = checkBox;
        a(checkBox);
    }

    public final void f() {
        ImageView imageView = (ImageView) getInflater().inflate(c.g.abc_list_menu_item_icon, (ViewGroup) this, false);
        this.f668b = imageView;
        b(imageView, 0);
    }

    public final void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(c.g.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f669c = radioButton;
        a(radioButton);
    }

    @Override // androidx.appcompat.view.menu.i.a
    public f getItemData() {
        return this.f667a;
    }

    public void h(boolean z10, char c10) {
        int i10 = (z10 && this.f667a.A()) ? 0 : 8;
        if (i10 == 0) {
            this.f672f.setText(this.f667a.h());
        }
        if (this.f672f.getVisibility() != i10) {
            this.f672f.setVisibility(i10);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f676j);
        TextView textView = (TextView) findViewById(c.f.title);
        this.f670d = textView;
        int i10 = this.f677k;
        if (i10 != -1) {
            textView.setTextAppearance(this.f678l, i10);
        }
        this.f672f = (TextView) findViewById(c.f.shortcut);
        ImageView imageView = (ImageView) findViewById(c.f.submenuarrow);
        this.f673g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f680n);
        }
        this.f674h = (ImageView) findViewById(c.f.group_divider);
        this.f675i = (LinearLayout) findViewById(c.f.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f668b != null && this.f679m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f668b.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.f669c == null && this.f671e == null) {
            return;
        }
        if (this.f667a.m()) {
            if (this.f669c == null) {
                g();
            }
            compoundButton = this.f669c;
            view = this.f671e;
        } else {
            if (this.f671e == null) {
                e();
            }
            compoundButton = this.f671e;
            view = this.f669c;
        }
        if (z10) {
            compoundButton.setChecked(this.f667a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f671e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f669c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f667a.m()) {
            if (this.f669c == null) {
                g();
            }
            compoundButton = this.f669c;
        } else {
            if (this.f671e == null) {
                e();
            }
            compoundButton = this.f671e;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f683q = z10;
        this.f679m = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f674h;
        if (imageView != null) {
            imageView.setVisibility((this.f681o || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z10 = this.f667a.z() || this.f683q;
        if (z10 || this.f679m) {
            ImageView imageView = this.f668b;
            if (imageView == null && drawable == null && !this.f679m) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f679m) {
                this.f668b.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f668b;
            if (!z10) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f668b.getVisibility() != 0) {
                this.f668b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f670d.getVisibility() != 8) {
                this.f670d.setVisibility(8);
            }
        } else {
            this.f670d.setText(charSequence);
            if (this.f670d.getVisibility() != 0) {
                this.f670d.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        z0 z0VarV = z0.v(getContext(), attributeSet, c.j.MenuView, i10, 0);
        this.f676j = z0VarV.g(c.j.MenuView_android_itemBackground);
        this.f677k = z0VarV.n(c.j.MenuView_android_itemTextAppearance, -1);
        this.f679m = z0VarV.a(c.j.MenuView_preserveIconSpacing, false);
        this.f678l = context;
        this.f680n = z0VarV.g(c.j.MenuView_subMenuArrow);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, c.a.dropDownListViewStyle, 0);
        this.f681o = typedArrayObtainStyledAttributes.hasValue(0);
        z0VarV.x();
        typedArrayObtainStyledAttributes.recycle();
    }
}
