package com.survicate.surveys.presentation.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import ar.a;
import bq.k;
import bq.m;
import bq.n;
import br.l;
import com.survicate.surveys.entities.colors.MicroColorControlOpacity;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import com.survicate.surveys.presentation.widget.MicroSubmitView;
import kotlin.Metadata;
import on.p;
import on.r;
import on.t;
import se.b;
import vc.e;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R*\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/survicate/surveys/presentation/widget/MicroSubmitView;", "Landroid/widget/FrameLayout;", "Lbq/n;", "state", "Llq/b0;", "setState", "(Lbq/n;)V", "Lkotlin/Function0;", "a", "Lar/a;", "getOnSubmitClick", "()Lar/a;", "setOnSubmitClick", "(Lar/a;)V", "onSubmitClick", "d", "getOnBackClick", "setOnBackClick", "onBackClick", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MicroSubmitView extends FrameLayout {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f6563y = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public a onSubmitClick;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public a onBackClick;

    /* renamed from: g, reason: collision with root package name */
    public final View f6566g;

    /* renamed from: r, reason: collision with root package name */
    public final MicroNavigationButtonBack f6567r;

    /* renamed from: x, reason: collision with root package name */
    public final Button f6568x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroSubmitView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.e(context, "context");
        View viewInflate = View.inflate(context, t.view_micro_submit, this);
        View viewFindViewById = viewInflate.findViewById(r.view_micro_submit_divider);
        l.d(viewFindViewById, "findViewById(...)");
        this.f6566g = viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(r.view_micro_submit_button_back);
        l.d(viewFindViewById2, "findViewById(...)");
        MicroNavigationButtonBack microNavigationButtonBack = (MicroNavigationButtonBack) viewFindViewById2;
        this.f6567r = microNavigationButtonBack;
        View viewFindViewById3 = viewInflate.findViewById(r.view_micro_submit_button_submit);
        l.d(viewFindViewById3, "findViewById(...)");
        Button button = (Button) viewFindViewById3;
        this.f6568x = button;
        final int i10 = 0;
        microNavigationButtonBack.setOnClickListener(new View.OnClickListener(this) { // from class: bq.d

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ MicroSubmitView f2863d;

            {
                this.f2863d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                MicroSubmitView microSubmitView = this.f2863d;
                switch (i11) {
                    case 0:
                        int i12 = MicroSubmitView.f6563y;
                        br.l.e(microSubmitView, "this$0");
                        ar.a aVar = microSubmitView.onBackClick;
                        if (aVar != null) {
                            aVar.c();
                            break;
                        }
                        break;
                    default:
                        int i13 = MicroSubmitView.f6563y;
                        br.l.e(microSubmitView, "this$0");
                        ar.a aVar2 = microSubmitView.onSubmitClick;
                        if (aVar2 != null) {
                            aVar2.c();
                            break;
                        }
                        break;
                }
            }
        });
        final int i11 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: bq.d

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ MicroSubmitView f2863d;

            {
                this.f2863d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                MicroSubmitView microSubmitView = this.f2863d;
                switch (i112) {
                    case 0:
                        int i12 = MicroSubmitView.f6563y;
                        br.l.e(microSubmitView, "this$0");
                        ar.a aVar = microSubmitView.onBackClick;
                        if (aVar != null) {
                            aVar.c();
                            break;
                        }
                        break;
                    default:
                        int i13 = MicroSubmitView.f6563y;
                        br.l.e(microSubmitView, "this$0");
                        ar.a aVar2 = microSubmitView.onSubmitClick;
                        if (aVar2 != null) {
                            aVar2.c();
                            break;
                        }
                        break;
                }
            }
        });
    }

    public final void a(View view, n nVar) {
        Resources resources = getResources();
        l.d(resources, "getResources(...)");
        int dimensionPixelSize = (!resources.getBoolean(on.n.isWideScreen) || nVar.a()) ? 0 : nVar instanceof bq.l ? getResources().getDimensionPixelSize(p.survicate_micro_button_navigation_tablet_width) : -2;
        float f10 = dimensionPixelSize == 0 ? 1.0f : 0.0f;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.width = dimensionPixelSize;
        layoutParams2.weight = f10;
        view.setLayoutParams(layoutParams2);
    }

    public final void b(MicroColorScheme microColorScheme) {
        l.e(microColorScheme, "colorScheme");
        this.f6566g.setBackgroundColor(b.z(microColorScheme.getQuestion(), MicroColorControlOpacity.Divider.getOpacityValue()));
        MicroNavigationButtonBack microNavigationButtonBack = this.f6567r;
        microNavigationButtonBack.getClass();
        microNavigationButtonBack.f6551a = microColorScheme;
        Context context = microNavigationButtonBack.getContext();
        l.d(context, "getContext(...)");
        int[][] iArr = {new int[]{R.attr.state_enabled}, new int[]{-16842910}};
        int[] iArr2 = {b.z(microColorScheme.getButton(), 1.0f), b.z(microColorScheme.getAnswer(), MicroColorControlOpacity.OutlinedButtonBorderDisabled.getOpacityValue())};
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(p.survicate_micro_border_width_default);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(context.getResources().getDimension(p.survicate_micro_button_radius));
        gradientDrawable.setStroke(dimensionPixelSize, new ColorStateList(iArr, iArr2));
        StateListDrawable stateListDrawableO = e.o(context, context.getResources().getDimension(p.survicate_micro_button_radius));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(0);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_focused}, stateListDrawableO);
        stateListDrawable.addState(new int[0], gradientDrawable2);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(p.survicate_micro_button_focus_offset);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, stateListDrawable});
        int i10 = -dimensionPixelSize2;
        layerDrawable.setLayerInset(1, i10, i10, i10, i10);
        microNavigationButtonBack.setBackground(layerDrawable);
        int[][] iArr3 = {new int[]{R.attr.state_enabled}, new int[]{-16842910}};
        int button = microColorScheme.getButton();
        int i11 = ((double) (((Color.red(button) * 299) + (Color.green(button) * 597)) + (Color.blue(button) * 114))) / ((double) 1000) > 130.0d ? -16777216 : -1;
        ColorStateList colorStateList = new ColorStateList(iArr3, new int[]{i11, b.z(i11, MicroColorControlOpacity.ButtonTextDisabled.getOpacityValue())});
        Button button2 = this.f6568x;
        button2.setTextColor(colorStateList);
        Context context2 = getContext();
        l.d(context2, "getContext(...)");
        int[][] iArr4 = {new int[]{R.attr.state_enabled}, new int[]{-16842910}};
        int[] iArr5 = {microColorScheme.getButton(), b.z(microColorScheme.getButton(), MicroColorControlOpacity.ButtonDisabled.getOpacityValue())};
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setShape(0);
        gradientDrawable3.setCornerRadius(context2.getResources().getDimension(p.survicate_micro_button_radius));
        gradientDrawable3.setColor(new ColorStateList(iArr4, iArr5));
        StateListDrawable stateListDrawableO2 = e.o(context2, context2.getResources().getDimension(p.survicate_micro_button_radius));
        GradientDrawable gradientDrawable4 = new GradientDrawable();
        gradientDrawable4.setColor(0);
        StateListDrawable stateListDrawable2 = new StateListDrawable();
        stateListDrawable2.addState(new int[]{R.attr.state_focused}, stateListDrawableO2);
        stateListDrawable2.addState(new int[0], gradientDrawable4);
        int dimensionPixelSize3 = context2.getResources().getDimensionPixelSize(p.survicate_micro_button_focus_offset);
        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{gradientDrawable3, stateListDrawable2});
        int i12 = -dimensionPixelSize3;
        layerDrawable2.setLayerInset(1, i12, i12, i12, i12);
        button2.setBackground(layerDrawable2);
    }

    public final a getOnBackClick() {
        return this.onBackClick;
    }

    public final a getOnSubmitClick() {
        return this.onSubmitClick;
    }

    public final void setOnBackClick(a aVar) {
        this.onBackClick = aVar;
    }

    public final void setOnSubmitClick(a aVar) {
        this.onSubmitClick = aVar;
    }

    public final void setState(n state) throws Resources.NotFoundException {
        l.e(state, "state");
        boolean zEquals = state.equals(k.f2878a);
        View view = this.f6566g;
        MicroNavigationButtonBack microNavigationButtonBack = this.f6567r;
        Button button = this.f6568x;
        if (zEquals) {
            view.setVisibility(8);
            microNavigationButtonBack.setVisibility(8);
            button.setVisibility(8);
        } else if (state instanceof m) {
            view.setVisibility(0);
            microNavigationButtonBack.setVisibility(8);
            button.setVisibility(0);
            m mVar = (m) state;
            button.setEnabled(mVar.f2884a);
            button.setText(mVar.f2885b);
        } else if (state instanceof bq.l) {
            view.setVisibility(0);
            microNavigationButtonBack.setVisibility(0);
            bq.l lVar = (bq.l) state;
            microNavigationButtonBack.setEnabled(lVar.f2879a);
            microNavigationButtonBack.setText(lVar.f2880b);
            button.setVisibility(0);
            button.setEnabled(lVar.f2881c);
            button.setText(lVar.f2882d);
        }
        a(microNavigationButtonBack, state);
        a(button, state);
        int dimensionPixelSize = state instanceof bq.l ? getResources().getDimensionPixelSize(p.survicate_micro_button_navigation_horizontal_padding) : getResources().getDimensionPixelSize(p.survicate_micro_button_horizontal_padding);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(p.survicate_micro_button_vertical_padding);
        button.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
    }
}
