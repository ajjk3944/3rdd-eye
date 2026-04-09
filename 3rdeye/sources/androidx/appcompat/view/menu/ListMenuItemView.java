package androidx.appcompat.view.menu;

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
import androidx.appcompat.view.menu.k;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import g.C4353a;
import o.X;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: b, reason: collision with root package name */
    public h f14359b;

    /* renamed from: c, reason: collision with root package name */
    public ImageView f14360c;

    /* renamed from: d, reason: collision with root package name */
    public RadioButton f14361d;

    /* renamed from: e, reason: collision with root package name */
    public TextView f14362e;

    /* renamed from: f, reason: collision with root package name */
    public CheckBox f14363f;

    /* renamed from: g, reason: collision with root package name */
    public TextView f14364g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f14365h;
    public ImageView i;

    /* renamed from: j, reason: collision with root package name */
    public LinearLayout f14366j;

    /* renamed from: k, reason: collision with root package name */
    public final Drawable f14367k;

    /* renamed from: l, reason: collision with root package name */
    public final int f14368l;

    /* renamed from: m, reason: collision with root package name */
    public final Context f14369m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f14370n;

    /* renamed from: o, reason: collision with root package name */
    public final Drawable f14371o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f14372p;

    /* renamed from: q, reason: collision with root package name */
    public LayoutInflater f14373q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f14374r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        X xE = X.e(getContext(), attributeSet, C4353a.f37892r, R.attr.listMenuViewStyle);
        this.f14367k = xE.b(5);
        TypedArray typedArray = xE.f44608b;
        this.f14368l = typedArray.getResourceId(1, -1);
        this.f14370n = typedArray.getBoolean(7, false);
        this.f14369m = context;
        this.f14371o = xE.b(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f14372p = typedArrayObtainStyledAttributes.hasValue(0);
        xE.f();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f14373q == null) {
            this.f14373q = LayoutInflater.from(getContext());
        }
        return this.f14373q;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f14365h;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.i;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.i.getLayoutParams();
        rect.top = this.i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.f14359b;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    @Override // androidx.appcompat.view.menu.k.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(androidx.appcompat.view.menu.h r11) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.i(androidx.appcompat.view.menu.h):void");
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f14367k);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f14362e = textView;
        int i = this.f14368l;
        if (i != -1) {
            textView.setTextAppearance(this.f14369m, i);
        }
        this.f14364g = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f14365h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f14371o);
        }
        this.i = (ImageView) findViewById(R.id.group_divider);
        this.f14366j = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        if (this.f14360c != null && this.f14370n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f14360c.getLayoutParams();
            int i11 = layoutParams.height;
            if (i11 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i11;
            }
        }
        super.onMeasure(i, i10);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.f14361d == null && this.f14363f == null) {
            return;
        }
        if ((this.f14359b.f14482x & 4) != 0) {
            if (this.f14361d == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f14361d = radioButton;
                LinearLayout linearLayout = this.f14366j;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f14361d;
            view = this.f14363f;
        } else {
            if (this.f14363f == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f14363f = checkBox;
                LinearLayout linearLayout2 = this.f14366j;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f14363f;
            view = this.f14361d;
        }
        if (z10) {
            compoundButton.setChecked(this.f14359b.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f14363f;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f14361d;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if ((this.f14359b.f14482x & 4) != 0) {
            if (this.f14361d == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f14361d = radioButton;
                LinearLayout linearLayout = this.f14366j;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f14361d;
        } else {
            if (this.f14363f == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f14363f = checkBox;
                LinearLayout linearLayout2 = this.f14366j;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f14363f;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f14374r = z10;
        this.f14370n = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.i;
        if (imageView != null) {
            imageView.setVisibility((this.f14372p || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f14359b.f14472n.getClass();
        boolean z10 = this.f14374r;
        if (z10 || this.f14370n) {
            ImageView imageView = this.f14360c;
            if (imageView == null && drawable == null && !this.f14370n) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f14360c = imageView2;
                LinearLayout linearLayout = this.f14366j;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f14370n) {
                this.f14360c.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f14360c;
            if (!z10) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f14360c.getVisibility() != 0) {
                this.f14360c.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f14362e.getVisibility() != 8) {
                this.f14362e.setVisibility(8);
            }
        } else {
            this.f14362e.setText(charSequence);
            if (this.f14362e.getVisibility() != 0) {
                this.f14362e.setVisibility(0);
            }
        }
    }
}
