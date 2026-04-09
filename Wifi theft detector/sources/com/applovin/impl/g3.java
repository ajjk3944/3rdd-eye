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

/* loaded from: classes.dex */
public class g3 extends s2 {

    /* renamed from: e, reason: collision with root package name */
    private final e3 f6042e;

    /* renamed from: f, reason: collision with root package name */
    private List f6043f;

    /* renamed from: g, reason: collision with root package name */
    private final List f6044g;

    /* renamed from: h, reason: collision with root package name */
    private final List f6045h;

    /* renamed from: i, reason: collision with root package name */
    private final List f6046i;

    /* renamed from: j, reason: collision with root package name */
    private final List f6047j;

    /* renamed from: k, reason: collision with root package name */
    private SpannedString f6048k;

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
        this.f6042e = e3Var;
        if (e3Var.q() == e3.a.INVALID_INTEGRATION) {
            SpannableString spannableString = new SpannableString("Tap for more information");
            spannableString.setSpan(new AbsoluteSizeSpan(12, true), 0, spannableString.length(), 33);
            this.f6048k = new SpannedString(spannableString);
        } else {
            this.f6048k = new SpannedString("");
        }
        this.f6043f = g();
        this.f6044g = b(e3Var.n());
        this.f6045h = e();
        this.f6046i = a(e3Var.f());
        this.f6047j = j();
        notifyDataSetChanged();
    }

    private r2 f() {
        if (this.f6042e.H()) {
            return null;
        }
        return r2.a().d("Initialization Status").c(f(this.f6042e.i())).a(false).a();
    }

    private List g() {
        ArrayList arrayList = new ArrayList(3);
        CollectionUtils.addObjectIfExists(i(), arrayList);
        CollectionUtils.addObjectIfExists(d(), arrayList);
        CollectionUtils.addObjectIfExists(f(), arrayList);
        return arrayList;
    }

    private r2 i() {
        r2.b bVarC = r2.a().d("SDK").c(this.f6042e.p());
        if (TextUtils.isEmpty(this.f6042e.p())) {
            bVarC.a(a(this.f6042e.F())).b(b(this.f6042e.F()));
        }
        return bVarC.a();
    }

    private List j() {
        ArrayList arrayList = new ArrayList(3);
        if (StringUtils.isValidString(this.f6042e.v())) {
            arrayList.add(r2.a(r2.c.DETAIL).d(this.f6042e.v()).a());
        }
        if (this.f6042e.y() == e3.b.NOT_SUPPORTED) {
            return arrayList;
        }
        if (this.f6042e.s() != null) {
            arrayList.add(c(this.f6042e.s()));
        }
        arrayList.add(a(this.f6042e.y()));
        return arrayList;
    }

    public boolean a(j2 j2Var) {
        return j2Var.b() == a.TEST_ADS.ordinal() && j2Var.a() == this.f6047j.size() - 1;
    }

    @Override // com.applovin.impl.s2
    public int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.s2
    public List c(int i10) {
        return i10 == a.INTEGRATIONS.ordinal() ? this.f6043f : i10 == a.PERMISSIONS.ordinal() ? this.f6044g : i10 == a.CONFIGURATION.ordinal() ? this.f6045h : i10 == a.DEPENDENCIES.ordinal() ? this.f6046i : this.f6047j;
    }

    @Override // com.applovin.impl.s2
    public int d(int i10) {
        return i10 == a.INTEGRATIONS.ordinal() ? this.f6043f.size() : i10 == a.PERMISSIONS.ordinal() ? this.f6044g.size() : i10 == a.CONFIGURATION.ordinal() ? this.f6045h.size() : i10 == a.DEPENDENCIES.ordinal() ? this.f6046i.size() : this.f6047j.size();
    }

    @Override // com.applovin.impl.s2
    public r2 e(int i10) {
        return i10 == a.INTEGRATIONS.ordinal() ? new v4("INTEGRATIONS") : i10 == a.PERMISSIONS.ordinal() ? new v4("PERMISSIONS") : i10 == a.CONFIGURATION.ordinal() ? new v4("CONFIGURATION") : i10 == a.DEPENDENCIES.ordinal() ? new v4("DEPENDENCIES") : new v4("TEST ADS");
    }

    public e3 h() {
        return this.f6042e;
    }

    public void k() {
        this.f6043f = g();
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

    private String f(int i10) {
        if (MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.getCode() != i10 && MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.getCode() != i10 && MaxAdapter.InitializationStatus.DOES_NOT_APPLY.getCode() != i10) {
            if (MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() == i10) {
                return "Failure";
            }
            if (MaxAdapter.InitializationStatus.INITIALIZING.getCode() == i10) {
                return "Initializing...";
            }
            return "Not Initialized";
        }
        return "Initialized";
    }

    private r2 a(e3.b bVar) {
        r2.b bVarA = r2.a();
        if (bVar == e3.b.READY) {
            bVarA.a(this.f7531a);
        }
        return bVarA.d("Test Mode").c(bVar.c()).c(bVar.d()).b("Restart Required").a(bVar.b()).a(true).a();
    }

    private int b(boolean z10) {
        return m0.a(z10 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f7531a);
    }

    private r2 c(List list) {
        return r2.a().d("Region/VPN Required").c(CollectionUtils.implode(list, ", ", list.size())).a();
    }

    private r2 d() {
        r2.b bVarC = r2.a().d("Adapter").c(this.f6042e.c());
        if (TextUtils.isEmpty(this.f6042e.c())) {
            bVarC.a(a(this.f6042e.z())).b(b(this.f6042e.z()));
        }
        return bVarC.a();
    }

    private List e() {
        ArrayList arrayList = new ArrayList(1);
        if (this.f6042e.D()) {
            arrayList.add(a("Java 8", "For optimal performance, please enable Java 8 support. See: https://support.axon.ai/en/max/android/overview/integration", com.applovin.impl.sdk.k.F0(), true));
        }
        return arrayList;
    }

    private int c(boolean z10) {
        return z10 ? R.drawable.applovin_ic_x_mark : R.drawable.applovin_ic_warning;
    }

    private int d(boolean z10) {
        return m0.a(z10 ? R.color.applovin_sdk_xmarkColor : R.color.applovin_sdk_warningColor, this.f7531a);
    }

    private r2 a(String str, String str2, boolean z10, boolean z11) {
        return r2.a(z10 ? r2.c.RIGHT_DETAIL : r2.c.DETAIL).d(str).a(z10 ? null : this.f6048k).b("Instructions").a(str2).a(z10 ? R.drawable.applovin_ic_check_mark_bordered : c(z11)).b(z10 ? m0.a(R.color.applovin_sdk_checkmarkColor, this.f7531a) : d(z11)).a(!z10).a();
    }

    private int a(boolean z10) {
        return z10 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark;
    }
}
