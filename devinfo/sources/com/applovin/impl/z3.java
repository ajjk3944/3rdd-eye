package com.applovin.impl;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.impl.e3;
import com.applovin.impl.r2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class z3 extends r2 {

    /* renamed from: n, reason: collision with root package name */
    private final e3 f6309n;

    /* renamed from: o, reason: collision with root package name */
    private final Context f6310o;

    public z3(e3 e3Var, Context context) {
        super(r2.c.DETAIL);
        this.f6309n = e3Var;
        this.f6310o = context;
        this.f5190c = t();
        this.f5191d = s();
    }

    private SpannedString q() {
        if (!this.f6309n.z()) {
            return StringUtils.createListItemDetailSpannedString("Adapter Missing", -65536);
        }
        if (TextUtils.isEmpty(this.f6309n.c())) {
            return StringUtils.createListItemDetailSpannedString("Adapter Found", -16777216);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ADAPTER  ", -7829368));
        spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f6309n.c(), -16777216));
        if (this.f6309n.A()) {
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("  LATEST  ", m0.a(R.color.applovin_sdk_orangeColor, this.f6310o)));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f6309n.k(), -16777216));
        }
        if (!this.f6309n.B()) {
            spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("INCOMPATIBLE WITH MAX SDK VERSION", -65536));
        }
        return new SpannedString(spannableStringBuilder);
    }

    private SpannedString s() {
        if (!o()) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) u());
        spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
        spannableStringBuilder.append((CharSequence) q());
        if (this.f6309n.q() == e3.a.INVALID_INTEGRATION) {
            spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString("Invalid Integration", -65536));
        } else if (this.f6309n.q() == e3.a.INCOMPLETE_INTEGRATION && this.f6309n.E()) {
            spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString("Mismatched SDK/Adapter Versions", -65536));
        }
        return new SpannedString(spannableStringBuilder);
    }

    private SpannedString t() {
        return StringUtils.createSpannedString(this.f6309n.g(), o() ? -16777216 : -7829368, 18, 1);
    }

    private SpannedString u() {
        if (!this.f6309n.F()) {
            return StringUtils.createListItemDetailSpannedString("SDK Missing", -65536);
        }
        if (!StringUtils.isValidString(this.f6309n.p())) {
            return StringUtils.createListItemDetailSpannedString(this.f6309n.z() ? "Retrieving SDK Version..." : "SDK Found", -16777216);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("SDK\t\t\t\t\t  ", -7829368));
        spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f6309n.p(), -16777216));
        return new SpannedString(spannableStringBuilder);
    }

    @Override // com.applovin.impl.r2
    public int d() {
        return o() ? R.drawable.applovin_ic_disclosure_arrow : super.h();
    }

    @Override // com.applovin.impl.r2
    public int e() {
        return m0.a(R.color.applovin_sdk_disclosureButtonColor, this.f6310o);
    }

    @Override // com.applovin.impl.r2
    public int h() {
        int iH = this.f6309n.h();
        return iH > 0 ? iH : R.drawable.applovin_ic_mediation_placeholder;
    }

    @Override // com.applovin.impl.r2
    public boolean o() {
        return this.f6309n.q() != e3.a.MISSING;
    }

    public e3 r() {
        return this.f6309n;
    }

    public String toString() {
        return "MediatedNetworkListItemViewModel{text=" + ((Object) this.f5190c) + ", detailText=" + ((Object) this.f5191d) + ", network=" + this.f6309n + "}";
    }
}
