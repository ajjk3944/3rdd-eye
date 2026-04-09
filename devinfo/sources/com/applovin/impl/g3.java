package com.applovin.impl;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import com.applovin.impl.e3;
import com.applovin.impl.r2;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class g3 extends s2 {

    /* renamed from: e, reason: collision with root package name */
    private final e3 f4142e;

    /* renamed from: f, reason: collision with root package name */
    private List f4143f;
    private final List g;

    /* renamed from: h, reason: collision with root package name */
    private final List f4144h;

    /* renamed from: i, reason: collision with root package name */
    private final List f4145i;
    private final List j;

    /* renamed from: k, reason: collision with root package name */
    private SpannedString f4146k;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum a {
        INTEGRATIONS,
        PERMISSIONS,
        CONFIGURATION,
        DEPENDENCIES,
        TEST_ADS,
        COUNT
    }

    public g3(e3 e3Var, Context context) {
        super(context);
        this.f4142e = e3Var;
        if (e3Var.q() == e3.a.INVALID_INTEGRATION) {
            SpannableString spannableString = new SpannableString("Tap for more information");
            spannableString.setSpan(new AbsoluteSizeSpan(12, true), 0, spannableString.length(), 33);
            this.f4146k = new SpannedString(spannableString);
        } else {
            this.f4146k = new SpannedString("");
        }
        this.f4143f = g();
        this.g = b(e3Var.n());
        this.f4144h = e();
        this.f4145i = a(e3Var.f());
        this.j = j();
        notifyDataSetChanged();
    }

    private r2 f() {
        if (this.f4142e.H()) {
            return null;
        }
        return r2.a().d("Initialization Status").c(f(this.f4142e.i())).a(false).a();
    }

    private List g() {
        ArrayList arrayList = new ArrayList(3);
        CollectionUtils.addObjectIfExists(i(), arrayList);
        CollectionUtils.addObjectIfExists(d(), arrayList);
        CollectionUtils.addObjectIfExists(f(), arrayList);
        return arrayList;
    }

    private r2 i() {
        r2.b bVarC = r2.a().d("SDK").c(this.f4142e.p());
        if (TextUtils.isEmpty(this.f4142e.p())) {
            bVarC.a(a(this.f4142e.F())).b(b(this.f4142e.F()));
        }
        return bVarC.a();
    }

    private List j() {
        ArrayList arrayList = new ArrayList(3);
        if (StringUtils.isValidString(this.f4142e.v())) {
            arrayList.add(r2.a(r2.c.DETAIL).d(this.f4142e.v()).a());
        }
        if (this.f4142e.y() == e3.b.NOT_SUPPORTED) {
            return arrayList;
        }
        if (this.f4142e.s() != null) {
            arrayList.add(c(this.f4142e.s()));
        }
        arrayList.add(a(this.f4142e.y()));
        return arrayList;
    }

    public boolean a(j2 j2Var) {
        return j2Var.b() == a.TEST_ADS.ordinal() && j2Var.a() == this.j.size() - 1;
    }

    @Override // com.applovin.impl.s2
    public int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.s2
    public List c(int i4) {
        return i4 == a.INTEGRATIONS.ordinal() ? this.f4143f : i4 == a.PERMISSIONS.ordinal() ? this.g : i4 == a.CONFIGURATION.ordinal() ? this.f4144h : i4 == a.DEPENDENCIES.ordinal() ? this.f4145i : this.j;
    }

    @Override // com.applovin.impl.s2
    public int d(int i4) {
        return i4 == a.INTEGRATIONS.ordinal() ? this.f4143f.size() : i4 == a.PERMISSIONS.ordinal() ? this.g.size() : i4 == a.CONFIGURATION.ordinal() ? this.f4144h.size() : i4 == a.DEPENDENCIES.ordinal() ? this.f4145i.size() : this.j.size();
    }

    @Override // com.applovin.impl.s2
    public r2 e(int i4) {
        return i4 == a.INTEGRATIONS.ordinal() ? new v4("INTEGRATIONS") : i4 == a.PERMISSIONS.ordinal() ? new v4("PERMISSIONS") : i4 == a.CONFIGURATION.ordinal() ? new v4("CONFIGURATION") : i4 == a.DEPENDENCIES.ordinal() ? new v4("DEPENDENCIES") : new v4("TEST ADS");
    }

    public e3 h() {
        return this.f4142e;
    }

    public void k() {
        this.f4143f = g();
    }

    public String toString() {
        return "MediatedNetworkListAdapter{}";
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k1 k1Var = (k1) it.next();
                arrayList.add(a(k1Var.b(), k1Var.a(), k1Var.c(), true));
            }
        }
        return arrayList;
    }

    private List b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                p4 p4Var = (p4) it.next();
                arrayList.add(a(p4Var.b(), p4Var.a(), p4Var.c(), true));
            }
        }
        return arrayList;
    }

    private String f(int i4) {
        if (MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.getCode() != i4 && MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.getCode() != i4 && MaxAdapter.InitializationStatus.DOES_NOT_APPLY.getCode() != i4) {
            if (MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() == i4) {
                return "Failure";
            }
            if (MaxAdapter.InitializationStatus.INITIALIZING.getCode() == i4) {
                return "Initializing...";
            }
            return "Not Initialized";
        }
        return "Initialized";
    }

    private r2 a(e3.b bVar) {
        r2.b bVarA = r2.a();
        if (bVar == e3.b.READY) {
            bVarA.a(this.f5283a);
        }
        return bVarA.d("Test Mode").c(bVar.c()).c(bVar.d()).b("Restart Required").a(bVar.b()).a(true).a();
    }

    private int b(boolean z3) {
        return m0.a(z3 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f5283a);
    }

    private r2 c(List list) {
        return r2.a().d("Region/VPN Required").c(CollectionUtils.implode(list, ", ", list.size())).a();
    }

    private r2 d() {
        r2.b bVarC = r2.a().d("Adapter").c(this.f4142e.c());
        if (TextUtils.isEmpty(this.f4142e.c())) {
            bVarC.a(a(this.f4142e.z())).b(b(this.f4142e.z()));
        }
        return bVarC.a();
    }

    private List e() {
        ArrayList arrayList = new ArrayList(1);
        if (this.f4142e.D()) {
            arrayList.add(a("Java 8", "For optimal performance, please enable Java 8 support. See: https://support.axon.ai/en/max/android/overview/integration", com.applovin.impl.sdk.k.F0(), true));
        }
        return arrayList;
    }

    private int c(boolean z3) {
        return z3 ? R.drawable.applovin_ic_x_mark : R.drawable.applovin_ic_warning;
    }

    private int d(boolean z3) {
        return m0.a(z3 ? R.color.applovin_sdk_xmarkColor : R.color.applovin_sdk_warningColor, this.f5283a);
    }

    private r2 a(String str, String str2, boolean z3, boolean z10) {
        return r2.a(z3 ? r2.c.RIGHT_DETAIL : r2.c.DETAIL).d(str).a(z3 ? null : this.f4146k).b("Instructions").a(str2).a(z3 ? R.drawable.applovin_ic_check_mark_bordered : c(z10)).b(z3 ? m0.a(R.color.applovin_sdk_checkmarkColor, this.f5283a) : d(z10)).a(!z3).a();
    }

    private int a(boolean z3) {
        return z3 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark;
    }
}
