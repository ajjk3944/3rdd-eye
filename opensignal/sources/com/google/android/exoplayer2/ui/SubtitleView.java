package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class SubtitleView extends FrameLayout implements eb.k {
    public int B;
    public a0 D;
    public View E;

    /* renamed from: a, reason: collision with root package name */
    public List f4612a;

    /* renamed from: d, reason: collision with root package name */
    public d f4613d;

    /* renamed from: g, reason: collision with root package name */
    public float f4614g;

    /* renamed from: r, reason: collision with root package name */
    public float f4615r;

    /* renamed from: x, reason: collision with root package name */
    public boolean f4616x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f4617y;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4612a = Collections.EMPTY_LIST;
        this.f4613d = d.f4630g;
        this.f4614g = 0.0533f;
        this.f4615r = 0.08f;
        this.f4616x = true;
        this.f4617y = true;
        c cVar = new c(context, 0);
        this.D = cVar;
        this.E = cVar;
        addView(cVar);
        this.B = 1;
    }

    private List<eb.b> getCuesWithStylingPreferencesApplied() {
        if (this.f4616x && this.f4617y) {
            return this.f4612a;
        }
        ArrayList arrayList = new ArrayList(this.f4612a.size());
        for (int i10 = 0; i10 < this.f4612a.size(); i10++) {
            eb.a aVarA = ((eb.b) this.f4612a.get(i10)).a();
            if (!this.f4616x) {
                aVarA.f8051n = false;
                CharSequence charSequence = aVarA.f8040a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        aVarA.f8040a = SpannableString.valueOf(charSequence);
                    }
                    CharSequence charSequence2 = aVarA.f8040a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof ib.b)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                vc.e.I(aVarA);
            } else if (!this.f4617y) {
                vc.e.I(aVarA);
            }
            arrayList.add(aVarA.a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (qb.v.f20828a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private d getUserCaptionStyle() {
        CaptioningManager captioningManager;
        int i10 = qb.v.f20828a;
        d dVar = d.f4630g;
        if (i10 < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return dVar;
        }
        CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
        if (i10 >= 21) {
            return new d(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
        }
        return new d(userStyle.foregroundColor, userStyle.backgroundColor, 0, userStyle.edgeType, userStyle.edgeColor, userStyle.getTypeface());
    }

    private <T extends View & a0> void setView(T t10) {
        removeView(this.E);
        View view = this.E;
        if (view instanceof h0) {
            ((h0) view).f4661d.destroy();
        }
        this.E = t10;
        this.D = t10;
        addView(t10);
    }

    public final void a() {
        setStyle(getUserCaptionStyle());
    }

    public final void b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void c() {
        this.D.a(getCuesWithStylingPreferencesApplied(), this.f4613d, this.f4614g, this.f4615r);
    }

    @Override // eb.k
    public final void onCues(List list) {
        setCues(list);
    }

    public void setApplyEmbeddedFontSizes(boolean z10) {
        this.f4617y = z10;
        c();
    }

    public void setApplyEmbeddedStyles(boolean z10) {
        this.f4616x = z10;
        c();
    }

    public void setBottomPaddingFraction(float f10) {
        this.f4615r = f10;
        c();
    }

    public void setCues(List<eb.b> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.f4612a = list;
        c();
    }

    public void setFractionalTextSize(float f10) {
        this.f4614g = f10;
        c();
    }

    public void setStyle(d dVar) {
        this.f4613d = dVar;
        c();
    }

    public void setViewType(int i10) {
        if (this.B == i10) {
            return;
        }
        if (i10 == 1) {
            setView(new c(getContext(), 0));
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException();
            }
            setView(new h0(getContext()));
        }
        this.B = i10;
    }
}
