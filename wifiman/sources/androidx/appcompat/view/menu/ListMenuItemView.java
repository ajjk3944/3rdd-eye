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
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.b0;
import h.AbstractC5927a;
import h.AbstractC5932f;
import h.AbstractC5933g;
import h.AbstractC5936j;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    private g f26760a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f26761b;

    /* renamed from: c, reason: collision with root package name */
    private RadioButton f26762c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f26763d;

    /* renamed from: e, reason: collision with root package name */
    private CheckBox f26764e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f26765f;

    /* renamed from: g, reason: collision with root package name */
    private ImageView f26766g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f26767h;

    /* renamed from: i, reason: collision with root package name */
    private LinearLayout f26768i;

    /* renamed from: j, reason: collision with root package name */
    private Drawable f26769j;

    /* renamed from: k, reason: collision with root package name */
    private int f26770k;

    /* renamed from: l, reason: collision with root package name */
    private Context f26771l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f26772m;

    /* renamed from: n, reason: collision with root package name */
    private Drawable f26773n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f26774o;

    /* renamed from: p, reason: collision with root package name */
    private LayoutInflater f26775p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f26776q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5927a.f47929A);
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i10) {
        LinearLayout linearLayout = this.f26768i;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    private void c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(AbstractC5933g.f48061h, (ViewGroup) this, false);
        this.f26764e = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(AbstractC5933g.f48062i, (ViewGroup) this, false);
        this.f26761b = imageView;
        b(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(AbstractC5933g.f48064k, (ViewGroup) this, false);
        this.f26762c = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f26775p == null) {
            this.f26775p = LayoutInflater.from(getContext());
        }
        return this.f26775p;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f26766g;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f26767h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f26767h.getLayoutParams();
        rect.top += this.f26767h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void e(g gVar, int i10) {
        this.f26760a = gVar;
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
        return this.f26760a;
    }

    public void h(boolean z10, char c10) {
        int i10 = (z10 && this.f26760a.A()) ? 0 : 8;
        if (i10 == 0) {
            this.f26765f.setText(this.f26760a.h());
        }
        if (this.f26765f.getVisibility() != i10) {
            this.f26765f.setVisibility(i10);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f26769j);
        TextView textView = (TextView) findViewById(AbstractC5932f.f48024B);
        this.f26763d = textView;
        int i10 = this.f26770k;
        if (i10 != -1) {
            textView.setTextAppearance(this.f26771l, i10);
        }
        this.f26765f = (TextView) findViewById(AbstractC5932f.f48049v);
        ImageView imageView = (ImageView) findViewById(AbstractC5932f.f48052y);
        this.f26766g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f26773n);
        }
        this.f26767h = (ImageView) findViewById(AbstractC5932f.f48044q);
        this.f26768i = (LinearLayout) findViewById(AbstractC5932f.f48039l);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f26761b != null && this.f26772m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f26761b.getLayoutParams();
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
        if (!z10 && this.f26762c == null && this.f26764e == null) {
            return;
        }
        if (this.f26760a.m()) {
            if (this.f26762c == null) {
                g();
            }
            compoundButton = this.f26762c;
            view = this.f26764e;
        } else {
            if (this.f26764e == null) {
                c();
            }
            compoundButton = this.f26764e;
            view = this.f26762c;
        }
        if (z10) {
            compoundButton.setChecked(this.f26760a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f26764e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f26762c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f26760a.m()) {
            if (this.f26762c == null) {
                g();
            }
            compoundButton = this.f26762c;
        } else {
            if (this.f26764e == null) {
                c();
            }
            compoundButton = this.f26764e;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f26776q = z10;
        this.f26772m = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f26767h;
        if (imageView != null) {
            imageView.setVisibility((this.f26774o || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z10 = this.f26760a.z() || this.f26776q;
        if (z10 || this.f26772m) {
            ImageView imageView = this.f26761b;
            if (imageView == null && drawable == null && !this.f26772m) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f26772m) {
                this.f26761b.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f26761b;
            if (!z10) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f26761b.getVisibility() != 0) {
                this.f26761b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f26763d.getVisibility() != 8) {
                this.f26763d.setVisibility(8);
            }
        } else {
            this.f26763d.setText(charSequence);
            if (this.f26763d.getVisibility() != 0) {
                this.f26763d.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        b0 b0VarV = b0.v(getContext(), attributeSet, AbstractC5936j.f48163T1, i10, 0);
        this.f26769j = b0VarV.g(AbstractC5936j.f48171V1);
        this.f26770k = b0VarV.n(AbstractC5936j.f48167U1, -1);
        this.f26772m = b0VarV.a(AbstractC5936j.f48175W1, false);
        this.f26771l = context;
        this.f26773n = b0VarV.g(AbstractC5936j.f48179X1);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, AbstractC5927a.f47961x, 0);
        this.f26774o = typedArrayObtainStyledAttributes.hasValue(0);
        b0VarV.x();
        typedArrayObtainStyledAttributes.recycle();
    }
}
