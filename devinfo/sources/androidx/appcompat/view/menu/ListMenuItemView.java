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
import com.liuzh.deviceinfo.R;
import h.a;
import i0.f;
import o.m;
import o.o;
import o.z;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements z, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    public o f680a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f681b;

    /* renamed from: c, reason: collision with root package name */
    public RadioButton f682c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f683d;

    /* renamed from: e, reason: collision with root package name */
    public CheckBox f684e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f685f;
    public ImageView g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f686h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f687i;
    public final Drawable j;

    /* renamed from: k, reason: collision with root package name */
    public final int f688k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f689l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f690m;

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f691n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f692o;

    /* renamed from: p, reason: collision with root package name */
    public LayoutInflater f693p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f694q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        f fVarJ = f.J(getContext(), attributeSet, a.f24791r, R.attr.listMenuViewStyle);
        this.j = fVarJ.A(5);
        TypedArray typedArray = (TypedArray) fVarJ.f25417c;
        this.f688k = typedArray.getResourceId(1, -1);
        this.f690m = typedArray.getBoolean(7, false);
        this.f689l = context;
        this.f691n = fVarJ.A(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f692o = typedArrayObtainStyledAttributes.hasValue(0);
        fVarJ.M();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f693p == null) {
            this.f693p = LayoutInflater.from(getContext());
        }
        return this.f693p;
    }

    private void setSubMenuArrowVisible(boolean z3) {
        ImageView imageView = this.g;
        if (imageView != null) {
            imageView.setVisibility(z3 ? 0 : 8);
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
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.a(o.o):void");
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f686h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f686h.getLayoutParams();
        rect.top = this.f686h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // o.z
    public o getItemData() {
        return this.f680a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f683d = textView;
        int i4 = this.f688k;
        if (i4 != -1) {
            textView.setTextAppearance(this.f689l, i4);
        }
        this.f685f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f691n);
        }
        this.f686h = (ImageView) findViewById(R.id.group_divider);
        this.f687i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i10) {
        if (this.f681b != null && this.f690m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f681b.getLayoutParams();
            int i11 = layoutParams.height;
            if (i11 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i11;
            }
        }
        super.onMeasure(i4, i10);
    }

    public void setCheckable(boolean z3) {
        CompoundButton compoundButton;
        View view;
        if (!z3 && this.f682c == null && this.f684e == null) {
            return;
        }
        if ((this.f680a.f30284x & 4) != 0) {
            if (this.f682c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f682c = radioButton;
                LinearLayout linearLayout = this.f687i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f682c;
            view = this.f684e;
        } else {
            if (this.f684e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f684e = checkBox;
                LinearLayout linearLayout2 = this.f687i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f684e;
            view = this.f682c;
        }
        if (z3) {
            compoundButton.setChecked(this.f680a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f684e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f682c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z3) {
        CompoundButton compoundButton;
        if ((this.f680a.f30284x & 4) != 0) {
            if (this.f682c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f682c = radioButton;
                LinearLayout linearLayout = this.f687i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f682c;
        } else {
            if (this.f684e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f684e = checkBox;
                LinearLayout linearLayout2 = this.f687i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f684e;
        }
        compoundButton.setChecked(z3);
    }

    public void setForceShowIcon(boolean z3) {
        this.f694q = z3;
        this.f690m = z3;
    }

    public void setGroupDividerEnabled(boolean z3) {
        ImageView imageView = this.f686h;
        if (imageView != null) {
            imageView.setVisibility((this.f692o || !z3) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        m mVar = this.f680a.f30274n;
        boolean z3 = this.f694q;
        if (z3 || this.f690m) {
            ImageView imageView = this.f681b;
            if (imageView == null && drawable == null && !this.f690m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f681b = imageView2;
                LinearLayout linearLayout = this.f687i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f690m) {
                this.f681b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f681b;
            if (!z3) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f681b.getVisibility() != 0) {
                this.f681b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f683d.getVisibility() != 8) {
                this.f683d.setVisibility(8);
            }
        } else {
            this.f683d.setText(charSequence);
            if (this.f683d.getVisibility() != 0) {
                this.f683d.setVisibility(0);
            }
        }
    }
}
