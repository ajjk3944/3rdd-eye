package com.survicate.surveys.presentation.widget;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import br.l;
import com.google.android.material.datepicker.g;
import com.survicate.surveys.entities.colors.MicroColorControlOpacity;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import kotlin.Metadata;
import on.r;
import on.t;
import se.b;
import u3.i0;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/survicate/surveys/presentation/widget/MicroNavigationButtonBack;", "Landroid/widget/FrameLayout;", "", "enabled", "Llq/b0;", "setEnabled", "(Z)V", "", "value", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "text", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MicroNavigationButtonBack extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public MicroColorScheme f6551a;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f6552d;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f6553g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroNavigationButtonBack(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.e(context, "context");
        View viewInflate = View.inflate(context, t.view_micro_navigation_button_back, this);
        View viewFindViewById = viewInflate.findViewById(r.view_micro_navigation_button_back_text);
        l.d(viewFindViewById, "findViewById(...)");
        this.f6552d = (TextView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(r.view_micro_navigation_button_back_icon);
        l.d(viewFindViewById2, "findViewById(...)");
        this.f6553g = (ImageView) viewFindViewById2;
        setFocusable(true);
        setClickable(true);
        i0.n(this, new g(3));
    }

    public final String getText() {
        return this.f6552d.getText().toString();
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        ImageView imageView = this.f6553g;
        TextView textView = this.f6552d;
        if (!enabled) {
            MicroColorScheme microColorScheme = this.f6551a;
            if (microColorScheme == null) {
                l.l("colorScheme");
                throw null;
            }
            int iZ = b.z(microColorScheme.getAnswer(), MicroColorControlOpacity.OutlinedButtonTextDisabled.getOpacityValue());
            textView.setTextColor(iZ);
            imageView.setColorFilter(iZ, PorterDuff.Mode.SRC_IN);
            return;
        }
        MicroColorScheme microColorScheme2 = this.f6551a;
        if (microColorScheme2 == null) {
            l.l("colorScheme");
            throw null;
        }
        textView.setTextColor(microColorScheme2.getButton());
        MicroColorScheme microColorScheme3 = this.f6551a;
        if (microColorScheme3 != null) {
            imageView.setColorFilter(microColorScheme3.getButton(), PorterDuff.Mode.SRC_IN);
        } else {
            l.l("colorScheme");
            throw null;
        }
    }

    public final void setText(String str) {
        l.e(str, "value");
        this.f6552d.setText(str);
        setContentDescription(str);
    }
}
