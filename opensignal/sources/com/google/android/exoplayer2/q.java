package com.google.android.exoplayer2;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements qb.h, a5.j, u3.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4398a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f4399d;

    public /* synthetic */ q(int i10, boolean z10) {
        this.f4398a = i10;
        this.f4399d = z10;
    }

    @Override // qb.h, a5.j
    public void a(Object obj) {
        switch (this.f4398a) {
            case 0:
                ((d1) obj).onShuffleModeEnabledChanged(this.f4399d);
                break;
            case 1:
                ((androidx.media3.common.q0) obj).onSkipSilenceEnabledChanged(this.f4399d);
                break;
            case 2:
                ((androidx.media3.common.q0) obj).onShuffleModeEnabledChanged(this.f4399d);
                break;
            default:
                ((androidx.media3.common.q0) obj).onSkipSilenceEnabledChanged(this.f4399d);
                break;
        }
    }

    @Override // u3.n
    public u3.h1 c0(View view, u3.h1 h1Var) {
        br.l.e(view, "view");
        k3.d dVarF = h1Var.f23176a.f(143);
        br.l.d(dVarF, "getInsets(...)");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, dVarF.f14015b + (this.f4399d ? view.getResources().getDimensionPixelSize(on.p.survicate_micro_survey_dialog_top_space) : 0), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        view.setLayoutParams(marginLayoutParams);
        return h1Var;
    }
}
