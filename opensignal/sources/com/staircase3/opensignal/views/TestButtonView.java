package com.staircase3.opensignal.views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import br.l;
import j3.k;
import kotlin.Metadata;
import qk.d;
import qk.e;
import qk.f;
import qk.g;
import qk.m;
import qk.n;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001R*\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0005\"\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/staircase3/opensignal/views/TestButtonView;", "Landroid/widget/FrameLayout;", "", "value", "x", "I", "getIcon", "()I", "setIcon", "(I)V", "icon", "", "y", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "setLabel", "(Ljava/lang/String;)V", "label", "buttonBackground", "setButtonBackground", "openSignal_externalRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TestButtonView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayout f6347a;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f6348d;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f6349g;

    /* renamed from: r, reason: collision with root package name */
    public final TextView f6350r;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public int icon;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public String label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TestButtonView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, 0);
        l.e(context, "context");
        this.icon = -1;
        this.label = "";
        ImageView imageView = new ImageView(context);
        this.f6348d = imageView;
        imageView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        View view = this.f6348d;
        if (view == null) {
            l.l("backgroundImageView");
            throw null;
        }
        addView(view);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        linearLayout.setWeightSum(10.0f);
        this.f6347a = linearLayout;
        addView(linearLayout);
        this.f6349g = new ImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(getResources().getDimensionPixelSize(e.start_test_button_icon_width), getResources().getDimensionPixelSize(e.start_test_button_icon_width));
        layoutParams.topMargin = context.getResources().getDimensionPixelSize(e.test_button_top_margin);
        layoutParams.weight = 4.0f;
        ImageView imageView2 = this.f6349g;
        if (imageView2 == null) {
            l.l("imageView");
            throw null;
        }
        imageView2.setLayoutParams(layoutParams);
        LinearLayout linearLayout2 = this.f6347a;
        if (linearLayout2 == null) {
            l.l("buttonContainerView");
            throw null;
        }
        ImageView imageView3 = this.f6349g;
        if (imageView3 == null) {
            l.l("imageView");
            throw null;
        }
        linearLayout2.addView(imageView3);
        View space = new Space(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(1, 0);
        layoutParams2.weight = 2.0f;
        space.setLayoutParams(layoutParams2);
        LinearLayout linearLayout3 = this.f6347a;
        if (linearLayout3 == null) {
            l.l("buttonContainerView");
            throw null;
        }
        linearLayout3.addView(space);
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.bottomMargin = context.getResources().getDimensionPixelSize(e.test_button_top_margin);
        layoutParams3.weight = 2.0f;
        textView.setLayoutParams(layoutParams3);
        textView.setGravity(1);
        textView.setTextAppearance(textView.getContext(), m.MaterialButtonStyle);
        textView.setTextSize(0, context.getResources().getDimension(e.test_button_label_text_size));
        textView.setLines(2);
        textView.setTextColor(context.getColor(d.white));
        try {
            textView.setTypeface(k.a(context, g.montserrat_medium_italic), 2);
        } catch (Resources.NotFoundException unused) {
        }
        this.f6350r = textView;
        LinearLayout linearLayout4 = this.f6347a;
        if (linearLayout4 == null) {
            l.l("buttonContainerView");
            throw null;
        }
        linearLayout4.addView(textView);
        int[] iArr = n.TestButtonView;
        l.d(iArr, "TestButtonView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(n.TestButtonView_test_button_label, -1);
        if (resourceId != -1) {
            String string = context.getResources().getString(resourceId);
            l.d(string, "getString(...)");
            setLabel(string);
        }
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(n.TestButtonView_test_button_icon, f.ic_speedtest_button);
        if (resourceId2 != -1) {
            setIcon(resourceId2);
        }
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(n.TestButtonView_test_button_background, -1);
        if (resourceId3 != -1) {
            setButtonBackground(resourceId3);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void setButtonBackground(int i10) {
        ImageView imageView = this.f6348d;
        if (imageView != null) {
            imageView.setImageResource(i10);
        } else {
            l.l("backgroundImageView");
            throw null;
        }
    }

    public final int getIcon() {
        return this.icon;
    }

    public final String getLabel() {
        return this.label;
    }

    public final void setIcon(int i10) {
        this.icon = i10;
        ImageView imageView = this.f6349g;
        if (imageView != null) {
            imageView.setImageResource(i10);
        } else {
            l.l("imageView");
            throw null;
        }
    }

    public final void setLabel(String str) {
        l.e(str, "value");
        this.label = str;
        TextView textView = this.f6350r;
        if (textView != null) {
            textView.setText(str);
        } else {
            l.l("labelView");
            throw null;
        }
    }
}
