package com.applovin.impl;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import com.applovin.impl.r2;
import com.applovin.sdk.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class p1 extends r2 {

    /* renamed from: n, reason: collision with root package name */
    private final q1 f5039n;

    /* renamed from: o, reason: collision with root package name */
    private final Context f5040o;

    public p1(q1 q1Var, Context context) {
        super(r2.c.DETAIL);
        this.f5039n = q1Var;
        this.f5040o = context;
        this.f5190c = r();
        this.f5191d = q();
    }

    private SpannedString q() {
        return new SpannedString("Displayed " + n7.a(this.f5039n.b(), true));
    }

    private SpannedString r() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f5039n.d());
        spannableStringBuilder.append((CharSequence) " - ");
        spannableStringBuilder.append((CharSequence) this.f5039n.f());
        return new SpannedString(spannableStringBuilder);
    }

    @Override // com.applovin.impl.r2
    public int d() {
        return o() ? R.drawable.applovin_ic_disclosure_arrow : super.h();
    }

    @Override // com.applovin.impl.r2
    public int e() {
        return m0.a(R.color.applovin_sdk_disclosureButtonColor, this.f5040o);
    }

    @Override // com.applovin.impl.r2
    public boolean o() {
        return true;
    }
}
