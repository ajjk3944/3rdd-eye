package com.survicate.surveys.presentation.widget;

import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import bq.o;
import br.l;
import com.google.android.material.datepicker.g;
import com.survicate.surveys.entities.colors.MicroColorControlOpacity;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import com.survicate.surveys.entities.survey.theme.ThemeSettings;
import com.survicate.surveys.infrastructure.network.image.SurvicateImageLoader;
import kotlin.Metadata;
import on.p;
import on.r;
import on.t;
import se.b;
import u3.i0;
import vc.e;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/survicate/surveys/presentation/widget/MicroSurveyHeader;", "Landroid/widget/FrameLayout;", "Lwo/b;", "listener", "Llq/b0;", "setOnCloseButtonListener", "(Lwo/b;)V", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MicroSurveyHeader extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f6574a;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f6575d;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f6576g;

    /* renamed from: r, reason: collision with root package name */
    public final ImageView f6577r;

    /* renamed from: x, reason: collision with root package name */
    public final MicroProgressBar f6578x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroSurveyHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.e(context, "context");
        View viewInflate = View.inflate(context, t.view_survicate_micro_card_header, this);
        View viewFindViewById = viewInflate.findViewById(r.view_survicate_micro_header);
        l.d(viewFindViewById, "findViewById(...)");
        this.f6574a = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(r.view_survicate_micro_card_header_image);
        l.d(viewFindViewById2, "findViewById(...)");
        this.f6575d = (ImageView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(r.view_survicate_micro_card_header_short_message);
        l.d(viewFindViewById3, "findViewById(...)");
        this.f6576g = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(r.view_survicate_micro_card_header_close_btn);
        l.d(viewFindViewById4, "findViewById(...)");
        this.f6577r = (ImageView) viewFindViewById4;
        View viewFindViewById5 = viewInflate.findViewById(r.view_survicate_micro_card_header_progress_bar);
        l.d(viewFindViewById5, "findViewById(...)");
        this.f6578x = (MicroProgressBar) viewFindViewById5;
    }

    public final void a(o oVar) {
        l.e(oVar, "data");
        SurvicateImageLoader survicateImageLoader = oVar.f2888b;
        i0.n(this.f6577r, new g(3));
        ThemeSettings themeSettings = oVar.f2887a;
        boolean zA = l.a(themeSettings.getPersonalization(), Boolean.TRUE);
        String avatarImage = themeSettings.getAvatarImage();
        boolean z10 = avatarImage != null && (tt.l.D0(avatarImage) ^ true);
        String shortTextMessage = themeSettings.getShortTextMessage();
        boolean z11 = shortTextMessage != null && (tt.l.D0(shortTextMessage) ^ true);
        String companyLogo = themeSettings.getCompanyLogo();
        boolean z12 = companyLogo != null && (tt.l.D0(companyLogo) ^ true);
        ImageView imageView = this.f6575d;
        if (zA && z12) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            l.c(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            layoutParams.width = -2;
            imageView.setLayoutParams(layoutParams);
            String companyLogo2 = themeSettings.getCompanyLogo();
            survicateImageLoader.loadCompanyLogo(null, imageView, companyLogo2);
            imageView.setVisibility((companyLogo2 == null || tt.l.D0(companyLogo2)) ? 8 : 0);
            c(true);
        } else if (zA && (z10 || z11)) {
            int dimension = (int) getResources().getDimension(p.survicate_micro_card_header_avatar_width);
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            l.c(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            layoutParams2.width = dimension;
            imageView.setLayoutParams(layoutParams2);
            String avatarImage2 = themeSettings.getAvatarImage();
            survicateImageLoader.loadAvatar(null, imageView, avatarImage2);
            imageView.setVisibility((avatarImage2 == null || tt.l.D0(avatarImage2)) ? 8 : 0);
            c(true);
            String shortTextMessage2 = themeSettings.getShortTextMessage();
            if (shortTextMessage2 == null) {
                shortTextMessage2 = "";
            }
            this.f6576g.setText(shortTextMessage2);
        } else {
            c(false);
        }
        int i10 = oVar.f2889c ? 0 : 8;
        MicroProgressBar microProgressBar = this.f6578x;
        microProgressBar.setVisibility(i10);
        microProgressBar.setProgressValue(oVar.f2890d);
    }

    public final void b(MicroColorScheme microColorScheme) {
        l.e(microColorScheme, "colorScheme");
        MicroProgressBar microProgressBar = this.f6578x;
        microProgressBar.a(microColorScheme);
        this.f6576g.setTextColor(microColorScheme.getQuestion());
        int iZ = b.z(microColorScheme.getQuestion(), MicroColorControlOpacity.CloseButton.getOpacityValue());
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        ImageView imageView = this.f6577r;
        imageView.setColorFilter(iZ, mode);
        Context context = getContext();
        l.d(context, "getContext(...)");
        StateListDrawable stateListDrawableO = e.o(context, context.getResources().getDimension(p.survicate_micro_close_button_focus_border_radius));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_focused}, stateListDrawableO);
        stateListDrawable.addState(new int[0], gradientDrawable);
        imageView.setBackground(stateListDrawable);
        microProgressBar.a(microColorScheme);
    }

    public final void c(boolean z10) {
        c3.p pVar = new c3.p();
        ConstraintLayout constraintLayout = this.f6574a;
        pVar.c(constraintLayout);
        MicroProgressBar microProgressBar = this.f6578x;
        if (z10) {
            int i10 = r.view_survicate_micro_header_barrier;
            pVar.b(microProgressBar.getId(), 4);
            pVar.d(microProgressBar.getId(), 6, constraintLayout.getId(), 6);
            pVar.d(microProgressBar.getId(), 3, i10, 4);
            pVar.d(microProgressBar.getId(), 7, constraintLayout.getId(), 7);
        } else {
            pVar.b(microProgressBar.getId(), 3);
            pVar.d(microProgressBar.getId(), 6, constraintLayout.getId(), 6);
            int id2 = microProgressBar.getId();
            ImageView imageView = this.f6577r;
            pVar.d(id2, 4, imageView.getId(), 4);
            pVar.d(microProgressBar.getId(), 7, imageView.getId(), 6);
        }
        pVar.a(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public final void setOnCloseButtonListener(wo.b listener) {
        this.f6577r.setOnClickListener(listener);
    }
}
