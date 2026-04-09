package com.applovin.impl;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import com.applovin.impl.j2;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public class k1 extends j2 {

    /* renamed from: n, reason: collision with root package name */
    private final l1 f19643n;

    /* renamed from: o, reason: collision with root package name */
    private final Context f19644o;

    public k1(l1 l1Var, Context context) {
        super(j2.c.DETAIL);
        this.f19643n = l1Var;
        this.f19644o = context;
        this.f19557c = r();
        this.f19558d = q();
    }

    private SpannedString q() {
        return new SpannedString("Displayed " + a7.a(this.f19643n.b(), true));
    }

    private SpannedString r() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f19643n.c());
        spannableStringBuilder.append((CharSequence) " - ");
        spannableStringBuilder.append((CharSequence) this.f19643n.d());
        return new SpannedString(spannableStringBuilder);
    }

    @Override // com.applovin.impl.j2
    public int d() {
        return o() ? R.drawable.applovin_ic_disclosure_arrow : super.h();
    }

    @Override // com.applovin.impl.j2
    public int e() {
        return AbstractC2124i0.a(R.color.applovin_sdk_disclosureButtonColor, this.f19644o);
    }

    @Override // com.applovin.impl.j2
    public boolean o() {
        return true;
    }
}
