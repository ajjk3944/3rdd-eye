package com.applovin.impl;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import com.applovin.impl.j2;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v2;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class x2 extends k2 {

    /* renamed from: e, reason: collision with root package name */
    private final v2 f21721e;

    /* renamed from: f, reason: collision with root package name */
    private List f21722f;

    /* renamed from: g, reason: collision with root package name */
    private final List f21723g;

    /* renamed from: h, reason: collision with root package name */
    private final List f21724h;
    private final List i;

    /* renamed from: j, reason: collision with root package name */
    private final List f21725j;

    /* renamed from: k, reason: collision with root package name */
    private SpannedString f21726k;

    public enum a {
        INTEGRATIONS,
        PERMISSIONS,
        CONFIGURATION,
        DEPENDENCIES,
        TEST_ADS,
        COUNT
    }

    public x2(v2 v2Var, Context context) {
        super(context);
        this.f21721e = v2Var;
        if (v2Var.q() == v2.a.INVALID_INTEGRATION) {
            SpannableString spannableString = new SpannableString("Tap for more information");
            spannableString.setSpan(new AbsoluteSizeSpan(12, true), 0, spannableString.length(), 33);
            this.f21726k = new SpannedString(spannableString);
        } else {
            this.f21726k = new SpannedString("");
        }
        this.f21722f = g();
        this.f21723g = b(v2Var.n());
        this.f21724h = e();
        this.i = a(v2Var.f());
        this.f21725j = j();
        notifyDataSetChanged();
    }

    private j2 f() {
        if (this.f21721e.I()) {
            return null;
        }
        return j2.a().d("Initialization Status").c(f(this.f21721e.i())).a(false).a();
    }

    private List g() {
        ArrayList arrayList = new ArrayList(3);
        CollectionUtils.addObjectIfExists(i(), arrayList);
        CollectionUtils.addObjectIfExists(d(), arrayList);
        CollectionUtils.addObjectIfExists(f(), arrayList);
        return arrayList;
    }

    private j2 i() {
        j2.b bVarC = j2.a().d("SDK").c(this.f21721e.p());
        if (TextUtils.isEmpty(this.f21721e.p())) {
            bVarC.a(a(this.f21721e.G())).b(b(this.f21721e.G()));
        }
        return bVarC.a();
    }

    private List j() {
        ArrayList arrayList = new ArrayList(3);
        if (StringUtils.isValidString(this.f21721e.v())) {
            arrayList.add(j2.a(j2.c.DETAIL).d(this.f21721e.v()).a());
        }
        if (this.f21721e.y() == v2.b.NOT_SUPPORTED) {
            return arrayList;
        }
        if (this.f21721e.s() != null) {
            arrayList.add(c(this.f21721e.s()));
        }
        arrayList.add(a(this.f21721e.y()));
        return arrayList;
    }

    public boolean a(d2 d2Var) {
        return d2Var.b() == a.TEST_ADS.ordinal() && d2Var.a() == this.f21725j.size() - 1;
    }

    @Override // com.applovin.impl.k2
    public int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.k2
    public List c(int i) {
        return i == a.INTEGRATIONS.ordinal() ? this.f21722f : i == a.PERMISSIONS.ordinal() ? this.f21723g : i == a.CONFIGURATION.ordinal() ? this.f21724h : i == a.DEPENDENCIES.ordinal() ? this.i : this.f21725j;
    }

    @Override // com.applovin.impl.k2
    public int d(int i) {
        return i == a.INTEGRATIONS.ordinal() ? this.f21722f.size() : i == a.PERMISSIONS.ordinal() ? this.f21723g.size() : i == a.CONFIGURATION.ordinal() ? this.f21724h.size() : i == a.DEPENDENCIES.ordinal() ? this.i.size() : this.f21725j.size();
    }

    @Override // com.applovin.impl.k2
    public j2 e(int i) {
        return i == a.INTEGRATIONS.ordinal() ? new j4("INTEGRATIONS") : i == a.PERMISSIONS.ordinal() ? new j4("PERMISSIONS") : i == a.CONFIGURATION.ordinal() ? new j4("CONFIGURATION") : i == a.DEPENDENCIES.ordinal() ? new j4("DEPENDENCIES") : new j4("TEST ADS");
    }

    public v2 h() {
        return this.f21721e;
    }

    public void k() {
        this.f21722f = g();
    }

    public String toString() {
        return "MediatedNetworkListAdapter{}";
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                f1 f1Var = (f1) it.next();
                arrayList.add(a(f1Var.b(), f1Var.a(), f1Var.c(), true));
            }
        }
        return arrayList;
    }

    private List b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c4 c4Var = (c4) it.next();
                arrayList.add(a(c4Var.b(), c4Var.a(), c4Var.c(), true));
            }
        }
        return arrayList;
    }

    private String f(int i) {
        if (MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.getCode() != i && MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.getCode() != i && MaxAdapter.InitializationStatus.DOES_NOT_APPLY.getCode() != i) {
            if (MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() == i) {
                return "Failure";
            }
            if (MaxAdapter.InitializationStatus.INITIALIZING.getCode() == i) {
                return "Initializing...";
            }
            return "Not Initialized";
        }
        return "Initialized";
    }

    private j2 a(v2.b bVar) {
        j2.b bVarA = j2.a();
        if (bVar == v2.b.READY) {
            bVarA.a(this.f19645a);
        }
        return bVarA.d("Test Mode").c(bVar.c()).c(bVar.d()).b("Restart Required").a(bVar.b()).a(true).a();
    }

    private int b(boolean z10) {
        return AbstractC2124i0.a(z10 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f19645a);
    }

    private j2 c(List list) {
        return j2.a().d("Region/VPN Required").c(CollectionUtils.implode(list, ", ", list.size())).a();
    }

    private j2 d() {
        j2.b bVarC = j2.a().d("Adapter").c(this.f21721e.c());
        if (TextUtils.isEmpty(this.f21721e.c())) {
            bVarC.a(a(this.f21721e.A())).b(b(this.f21721e.A()));
        }
        return bVarC.a();
    }

    private List e() {
        ArrayList arrayList = new ArrayList(1);
        if (this.f21721e.E()) {
            arrayList.add(a("Java 8", "For optimal performance, please enable Java 8 support. See: https://developers.applovin.com/en/android/overview/integration", com.applovin.impl.sdk.k.F0(), true));
        }
        return arrayList;
    }

    private int c(boolean z10) {
        return z10 ? R.drawable.applovin_ic_x_mark : R.drawable.applovin_ic_warning;
    }

    private int d(boolean z10) {
        return AbstractC2124i0.a(z10 ? R.color.applovin_sdk_xmarkColor : R.color.applovin_sdk_warningColor, this.f19645a);
    }

    private j2 a(String str, String str2, boolean z10, boolean z11) {
        return j2.a(z10 ? j2.c.RIGHT_DETAIL : j2.c.DETAIL).d(str).a(z10 ? null : this.f21726k).b("Instructions").a(str2).a(z10 ? R.drawable.applovin_ic_check_mark_bordered : c(z11)).b(z10 ? AbstractC2124i0.a(R.color.applovin_sdk_checkmarkColor, this.f19645a) : d(z11)).a(!z10).a();
    }

    private int a(boolean z10) {
        return z10 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark;
    }
}
