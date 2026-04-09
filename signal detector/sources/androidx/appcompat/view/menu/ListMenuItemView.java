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
import com.apm.insight.R;
import g.AbstractC2327a;
import n.MenuC2677k;
import n.m;
import n.x;
import o.a1;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements x, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: C, reason: collision with root package name */
    public final boolean f4772C;

    /* renamed from: D, reason: collision with root package name */
    public LayoutInflater f4773D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f4774E;

    /* renamed from: a, reason: collision with root package name */
    public m f4775a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f4776b;

    /* renamed from: c, reason: collision with root package name */
    public RadioButton f4777c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f4778d;

    /* renamed from: e, reason: collision with root package name */
    public CheckBox f4779e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f4780f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f4781g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f4782h;
    public LinearLayout i;

    /* renamed from: j, reason: collision with root package name */
    public final Drawable f4783j;

    /* renamed from: k, reason: collision with root package name */
    public final int f4784k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f4785l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4786m;

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f4787n;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1 a1VarI = a1.i(getContext(), attributeSet, AbstractC2327a.f20131s, R.attr.listMenuViewStyle);
        this.f4783j = a1VarI.d(5);
        TypedArray typedArray = (TypedArray) a1VarI.f22480c;
        this.f4784k = typedArray.getResourceId(1, -1);
        this.f4786m = typedArray.getBoolean(7, false);
        this.f4785l = context;
        this.f4787n = a1VarI.d(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f4772C = typedArrayObtainStyledAttributes.hasValue(0);
        a1VarI.j();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f4773D == null) {
            this.f4773D = LayoutInflater.from(getContext());
        }
        return this.f4773D;
    }

    private void setSubMenuArrowVisible(boolean z6) {
        ImageView imageView = this.f4781g;
        if (imageView != null) {
            imageView.setVisibility(z6 ? 0 : 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    @Override // n.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(n.m r11) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.a(n.m):void");
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f4782h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f4782h.getLayoutParams();
        rect.top = this.f4782h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // n.x
    public m getItemData() {
        return this.f4775a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f4783j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f4778d = textView;
        int i = this.f4784k;
        if (i != -1) {
            textView.setTextAppearance(this.f4785l, i);
        }
        this.f4780f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f4781g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f4787n);
        }
        this.f4782h = (ImageView) findViewById(R.id.group_divider);
        this.i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i3) {
        if (this.f4776b != null && this.f4786m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f4776b.getLayoutParams();
            int i6 = layoutParams.height;
            if (i6 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i6;
            }
        }
        super.onMeasure(i, i3);
    }

    public void setCheckable(boolean z6) {
        CompoundButton compoundButton;
        View view;
        if (!z6 && this.f4777c == null && this.f4779e == null) {
            return;
        }
        if ((this.f4775a.f22101L & 4) != 0) {
            if (this.f4777c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f4777c = radioButton;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f4777c;
            view = this.f4779e;
        } else {
            if (this.f4779e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f4779e = checkBox;
                LinearLayout linearLayout2 = this.i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f4779e;
            view = this.f4777c;
        }
        if (z6) {
            compoundButton.setChecked(this.f4775a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f4779e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f4777c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z6) {
        CompoundButton compoundButton;
        if ((this.f4775a.f22101L & 4) != 0) {
            if (this.f4777c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f4777c = radioButton;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f4777c;
        } else {
            if (this.f4779e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f4779e = checkBox;
                LinearLayout linearLayout2 = this.i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f4779e;
        }
        compoundButton.setChecked(z6);
    }

    public void setForceShowIcon(boolean z6) {
        this.f4774E = z6;
        this.f4786m = z6;
    }

    public void setGroupDividerEnabled(boolean z6) {
        ImageView imageView = this.f4782h;
        if (imageView != null) {
            imageView.setVisibility((this.f4772C || !z6) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        MenuC2677k menuC2677k = this.f4775a.f22118n;
        boolean z6 = this.f4774E;
        if (z6 || this.f4786m) {
            ImageView imageView = this.f4776b;
            if (imageView == null && drawable == null && !this.f4786m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f4776b = imageView2;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f4786m) {
                this.f4776b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f4776b;
            if (!z6) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f4776b.getVisibility() != 0) {
                this.f4776b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f4778d.getVisibility() != 8) {
                this.f4778d.setVisibility(8);
            }
        } else {
            this.f4778d.setText(charSequence);
            if (this.f4778d.getVisibility() != 0) {
                this.f4778d.setVisibility(0);
            }
        }
    }
}
