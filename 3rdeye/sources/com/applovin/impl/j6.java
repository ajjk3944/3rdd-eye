package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.n6;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class j6 extends d3 {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f19599a;

    /* renamed from: b, reason: collision with root package name */
    private k2 f19600b;

    public class a extends k2 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f19601e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f19602f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f19603g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, ArrayList arrayList, ArrayList arrayList2, boolean z10) {
            super(context);
            this.f19601e = arrayList;
            this.f19602f = arrayList2;
            this.f19603g = z10;
        }

        @Override // com.applovin.impl.k2
        public int b() {
            return b.values().length;
        }

        @Override // com.applovin.impl.k2
        public List c(int i) {
            return i == b.TC_NETWORKS.ordinal() ? this.f19601e : this.f19602f;
        }

        @Override // com.applovin.impl.k2
        public int d(int i) {
            return i == b.TC_NETWORKS.ordinal() ? this.f19601e.size() : this.f19602f.size();
        }

        @Override // com.applovin.impl.k2
        public j2 e(int i) {
            if (i == b.TC_NETWORKS.ordinal()) {
                return new j4("TCF VENDORS (TC STRING)");
            }
            return new j4(this.f19603g ? "ATP NETWORKS (AC STRING)" : "APPLOVIN PRIVACY SETTING");
        }
    }

    public enum b {
        TC_NETWORKS,
        AC_NETWORKS
    }

    private j2 a(String str, String str2) {
        return j2.a().d(str).c(str2).a();
    }

    @Override // com.applovin.impl.d3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f19599a;
    }

    public void initialize(List<n6> list, com.applovin.impl.sdk.k kVar) {
        this.f19599a = kVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String strA = AbstractC2130l0.b().a(this);
        boolean zB = kVar.r0().b();
        if (!zB) {
            arrayList2.add(a("Has User Consent", strA));
        }
        for (n6 n6Var : list) {
            Boolean boolA = n6Var.a();
            if (boolA != null) {
                if (n6Var.f() == n6.a.TCF_VENDOR) {
                    arrayList.add(a(n6Var.b(), String.valueOf(boolA)));
                } else if (n6Var.f() == n6.a.ATP_NETWORK) {
                    arrayList2.add(a(n6Var.b(), String.valueOf(boolA)));
                }
            } else if (zB && n6Var.f() == n6.a.ATP_NETWORK) {
                arrayList2.add(a(n6Var.b(), strA));
            }
        }
        a aVar = new a(this, arrayList, arrayList2, zB);
        this.f19600b = aVar;
        aVar.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.d3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("Network Consent Statuses");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f19600b);
    }
}
