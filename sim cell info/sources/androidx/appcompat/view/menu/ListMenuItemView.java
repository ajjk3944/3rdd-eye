package androidx.appcompat.view.menu;

import a0.s;
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
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.w0;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: b, reason: collision with root package name */
    private g f514b;

    /* renamed from: c, reason: collision with root package name */
    private ImageView f515c;

    /* renamed from: d, reason: collision with root package name */
    private RadioButton f516d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f517e;

    /* renamed from: f, reason: collision with root package name */
    private CheckBox f518f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f519g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f520h;

    /* renamed from: i, reason: collision with root package name */
    private ImageView f521i;

    /* renamed from: j, reason: collision with root package name */
    private LinearLayout f522j;

    /* renamed from: k, reason: collision with root package name */
    private Drawable f523k;

    /* renamed from: l, reason: collision with root package name */
    private int f524l;

    /* renamed from: m, reason: collision with root package name */
    private Context f525m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f526n;

    /* renamed from: o, reason: collision with root package name */
    private Drawable f527o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f528p;

    /* renamed from: q, reason: collision with root package name */
    private int f529q;

    /* renamed from: r, reason: collision with root package name */
    private LayoutInflater f530r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f531s;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.a.C);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        w0 w0VarT = w0.t(getContext(), attributeSet, a.j.W1, i2, 0);
        this.f523k = w0VarT.f(a.j.Y1);
        this.f524l = w0VarT.m(a.j.X1, -1);
        this.f526n = w0VarT.a(a.j.Z1, false);
        this.f525m = context;
        this.f527o = w0VarT.f(a.j.a2);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, a.a.f25z, 0);
        this.f528p = typedArrayObtainStyledAttributes.hasValue(0);
        w0VarT.u();
        typedArrayObtainStyledAttributes.recycle();
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i2) {
        LinearLayout linearLayout = this.f522j;
        if (linearLayout != null) {
            linearLayout.addView(view, i2);
        } else {
            addView(view, i2);
        }
    }

    private void e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(a.g.f105h, (ViewGroup) this, false);
        this.f518f = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(a.g.f106i, (ViewGroup) this, false);
        this.f515c = imageView;
        b(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(a.g.f108k, (ViewGroup) this, false);
        this.f516d = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f530r == null) {
            this.f530r = LayoutInflater.from(getContext());
        }
        return this.f530r;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f520h;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f521i;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f521i.getLayoutParams();
        rect.top += this.f521i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void d(g gVar, int i2) {
        this.f514b = gVar;
        this.f529q = i2;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.i(this));
        setCheckable(gVar.isCheckable());
        h(gVar.A(), gVar.g());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f514b;
    }

    public void h(boolean z2, char c2) {
        int i2 = (z2 && this.f514b.A()) ? 0 : 8;
        if (i2 == 0) {
            this.f519g.setText(this.f514b.h());
        }
        if (this.f519g.getVisibility() != i2) {
            this.f519g.setVisibility(i2);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        s.R(this, this.f523k);
        TextView textView = (TextView) findViewById(a.f.M);
        this.f517e = textView;
        int i2 = this.f524l;
        if (i2 != -1) {
            textView.setTextAppearance(this.f525m, i2);
        }
        this.f519g = (TextView) findViewById(a.f.F);
        ImageView imageView = (ImageView) findViewById(a.f.I);
        this.f520h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f527o);
        }
        this.f521i = (ImageView) findViewById(a.f.f89r);
        this.f522j = (LinearLayout) findViewById(a.f.f83l);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        if (this.f515c != null && this.f526n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f515c.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z2) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z2 && this.f516d == null && this.f518f == null) {
            return;
        }
        if (this.f514b.m()) {
            if (this.f516d == null) {
                g();
            }
            compoundButton = this.f516d;
            compoundButton2 = this.f518f;
        } else {
            if (this.f518f == null) {
                e();
            }
            compoundButton = this.f518f;
            compoundButton2 = this.f516d;
        }
        if (z2) {
            compoundButton.setChecked(this.f514b.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f518f;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f516d;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if (this.f514b.m()) {
            if (this.f516d == null) {
                g();
            }
            compoundButton = this.f516d;
        } else {
            if (this.f518f == null) {
                e();
            }
            compoundButton = this.f518f;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f531s = z2;
        this.f526n = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.f521i;
        if (imageView != null) {
            imageView.setVisibility((this.f528p || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z2 = this.f514b.z() || this.f531s;
        if (z2 || this.f526n) {
            ImageView imageView = this.f515c;
            if (imageView == null && drawable == null && !this.f526n) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f526n) {
                this.f515c.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f515c;
            if (!z2) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f515c.getVisibility() != 0) {
                this.f515c.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i2;
        TextView textView;
        if (charSequence != null) {
            this.f517e.setText(charSequence);
            if (this.f517e.getVisibility() == 0) {
                return;
            }
            textView = this.f517e;
            i2 = 0;
        } else {
            i2 = 8;
            if (this.f517e.getVisibility() == 8) {
                return;
            } else {
                textView = this.f517e;
            }
        }
        textView.setVisibility(i2);
    }
}
