package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.a7;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class w6 extends n3 {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f5945a;

    /* renamed from: b, reason: collision with root package name */
    private s2 f5946b;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a extends s2 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f5947e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f5948f;
        final /* synthetic */ boolean g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, ArrayList arrayList, ArrayList arrayList2, boolean z3) {
            super(context);
            this.f5947e = arrayList;
            this.f5948f = arrayList2;
            this.g = z3;
        }

        @Override // com.applovin.impl.s2
        public int b() {
            return b.values().length;
        }

        @Override // com.applovin.impl.s2
        public List c(int i4) {
            return i4 == b.TC_NETWORKS.ordinal() ? this.f5947e : this.f5948f;
        }

        @Override // com.applovin.impl.s2
        public int d(int i4) {
            return i4 == b.TC_NETWORKS.ordinal() ? this.f5947e.size() : this.f5948f.size();
        }

        @Override // com.applovin.impl.s2
        public r2 e(int i4) {
            if (i4 == b.TC_NETWORKS.ordinal()) {
                return new v4("TCF VENDORS (TC STRING)");
            }
            return new v4(this.g ? "ATP NETWORKS (AC STRING)" : "APPLOVIN PRIVACY SETTING");
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum b {
        TC_NETWORKS,
        AC_NETWORKS
    }

    private r2 a(String str, String str2) {
        return r2.a().d(str).c(str2).a();
    }

    @Override // com.applovin.impl.n3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f5945a;
    }

    public void initialize(List<a7> list, com.applovin.impl.sdk.k kVar) {
        this.f5945a = kVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String strA = p0.b().a(this);
        boolean zB = kVar.r0().b();
        if (!zB) {
            arrayList2.add(a("Has User Consent", strA));
        }
        for (a7 a7Var : list) {
            Boolean boolA = a7Var.a();
            if (boolA != null) {
                if (a7Var.f() == a7.a.TCF_VENDOR) {
                    arrayList.add(a(a7Var.b(), String.valueOf(boolA)));
                } else if (a7Var.f() == a7.a.ATP_NETWORK) {
                    arrayList2.add(a(a7Var.b(), String.valueOf(boolA)));
                }
            } else if (zB && a7Var.f() == a7.a.ATP_NETWORK) {
                arrayList2.add(a(a7Var.b(), strA));
            }
        }
        a aVar = new a(this, arrayList, arrayList2, zB);
        this.f5946b = aVar;
        aVar.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("Network Consent Statuses");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f5946b);
    }
}
