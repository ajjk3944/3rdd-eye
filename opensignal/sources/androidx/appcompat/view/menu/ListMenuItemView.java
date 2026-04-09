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
import h.a;
import h.f;
import h.g;
import h.j;
import io.sentry.k;
import o.m;
import o.o;
import o.z;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements z, AbsListView.SelectionBoundsAdjuster {
    public ImageView B;
    public ImageView D;
    public LinearLayout E;
    public final Drawable F;
    public final int G;
    public final Context H;
    public boolean I;
    public final Drawable J;
    public final boolean K;
    public LayoutInflater L;
    public boolean M;

    /* renamed from: a, reason: collision with root package name */
    public o f927a;

    /* renamed from: d, reason: collision with root package name */
    public ImageView f928d;

    /* renamed from: g, reason: collision with root package name */
    public RadioButton f929g;

    /* renamed from: r, reason: collision with root package name */
    public TextView f930r;

    /* renamed from: x, reason: collision with root package name */
    public CheckBox f931x;

    /* renamed from: y, reason: collision with root package name */
    public TextView f932y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i10 = a.listMenuViewStyle;
        k kVarH0 = k.h0(getContext(), attributeSet, j.MenuView, i10);
        this.F = kVarH0.U(j.MenuView_android_itemBackground);
        int i11 = j.MenuView_android_itemTextAppearance;
        TypedArray typedArray = (TypedArray) kVarH0.f12398g;
        this.G = typedArray.getResourceId(i11, -1);
        this.I = typedArray.getBoolean(j.MenuView_preserveIconSpacing, false);
        this.H = context;
        this.J = kVarH0.U(j.MenuView_subMenuArrow);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, a.dropDownListViewStyle, 0);
        this.K = typedArrayObtainStyledAttributes.hasValue(0);
        kVarH0.l0();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.L == null) {
            this.L = LayoutInflater.from(getContext());
        }
        return this.L;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.B;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    @Override // o.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(o.o r11) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.a(o.o):void");
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.D;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.D.getLayoutParams();
        rect.top = this.D.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // o.z
    public o getItemData() {
        return this.f927a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.F);
        TextView textView = (TextView) findViewById(f.title);
        this.f930r = textView;
        int i10 = this.G;
        if (i10 != -1) {
            textView.setTextAppearance(this.H, i10);
        }
        this.f932y = (TextView) findViewById(f.shortcut);
        ImageView imageView = (ImageView) findViewById(f.submenuarrow);
        this.B = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.J);
        }
        this.D = (ImageView) findViewById(f.group_divider);
        this.E = (LinearLayout) findViewById(f.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.f928d != null && this.I) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f928d.getLayoutParams();
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
        if (!z10 && this.f929g == null && this.f931x == null) {
            return;
        }
        if ((this.f927a.f18659x & 4) != 0) {
            if (this.f929g == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(g.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f929g = radioButton;
                LinearLayout linearLayout = this.E;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f929g;
            view = this.f931x;
        } else {
            if (this.f931x == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(g.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f931x = checkBox;
                LinearLayout linearLayout2 = this.E;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f931x;
            view = this.f929g;
        }
        if (z10) {
            compoundButton.setChecked(this.f927a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f931x;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f929g;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if ((this.f927a.f18659x & 4) != 0) {
            if (this.f929g == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(g.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f929g = radioButton;
                LinearLayout linearLayout = this.E;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f929g;
        } else {
            if (this.f931x == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(g.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f931x = checkBox;
                LinearLayout linearLayout2 = this.E;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f931x;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.M = z10;
        this.I = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.D;
        if (imageView != null) {
            imageView.setVisibility((this.K || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        m mVar = this.f927a.f18649n;
        boolean z10 = this.M;
        if (z10 || this.I) {
            ImageView imageView = this.f928d;
            if (imageView == null && drawable == null && !this.I) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(g.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f928d = imageView2;
                LinearLayout linearLayout = this.E;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.I) {
                this.f928d.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f928d;
            if (!z10) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f928d.getVisibility() != 0) {
                this.f928d.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f930r.getVisibility() != 8) {
                this.f930r.setVisibility(8);
            }
        } else {
            this.f930r.setText(charSequence);
            if (this.f930r.getVisibility() != 0) {
                this.f930r.setVisibility(0);
            }
        }
    }
}
