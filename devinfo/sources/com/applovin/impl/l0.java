package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.a7;
import com.applovin.impl.r2;
import com.applovin.impl.s2;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class l0 extends n3 {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f4402a;

    /* renamed from: b, reason: collision with root package name */
    private s2 f4403b;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a extends s2 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f4404e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f4405f;
        final /* synthetic */ List g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ List f4406h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ List f4407i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list, List list2, List list3, List list4, List list5) {
            super(context);
            this.f4404e = list;
            this.f4405f = list2;
            this.g = list3;
            this.f4406h = list4;
            this.f4407i = list5;
        }

        @Override // com.applovin.impl.s2
        public int b() {
            return c.values().length;
        }

        @Override // com.applovin.impl.s2
        public List c(int i4) {
            List list;
            boolean z3 = true;
            if (i4 == c.MISSING_TC_NETWORKS.ordinal()) {
                list = this.f4404e;
            } else if (i4 == c.MISSING_AC_NETWORKS.ordinal()) {
                list = this.f4405f;
            } else {
                z3 = false;
                list = i4 == c.LISTED_TC_NETWORKS.ordinal() ? this.g : i4 == c.LISTED_AC_NETWORKS.ordinal() ? this.f4406h : this.f4407i;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(l0.this.a((a7) it.next(), z3));
            }
            return arrayList;
        }

        @Override // com.applovin.impl.s2
        public int d(int i4) {
            return i4 == c.MISSING_TC_NETWORKS.ordinal() ? this.f4404e.size() : i4 == c.MISSING_AC_NETWORKS.ordinal() ? this.f4405f.size() : i4 == c.LISTED_TC_NETWORKS.ordinal() ? this.g.size() : i4 == c.LISTED_AC_NETWORKS.ordinal() ? this.f4406h.size() : this.f4407i.size();
        }

        @Override // com.applovin.impl.s2
        public r2 e(int i4) {
            return i4 == c.MISSING_TC_NETWORKS.ordinal() ? new v4("MISSING TCF VENDORS (TC STRING)") : i4 == c.MISSING_AC_NETWORKS.ordinal() ? new v4("MISSING ATP NETWORKS (AC STRING)") : i4 == c.LISTED_TC_NETWORKS.ordinal() ? new v4("LISTED TCF VENDORS (TC STRING)") : i4 == c.LISTED_AC_NETWORKS.ordinal() ? new v4("LISTED ATP NETWORKS (AC STRING)") : new v4("NON-CONFIGURABLE NETWORKS");
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class b implements s2.a {
        public b() {
        }

        @Override // com.applovin.impl.s2.a
        public void a(j2 j2Var, r2 r2Var) {
            n7.a(r2Var.c(), r2Var.b(), l0.this);
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum c {
        MISSING_TC_NETWORKS,
        MISSING_AC_NETWORKS,
        LISTED_TC_NETWORKS,
        LISTED_AC_NETWORKS,
        OTHER_NETWORKS
    }

    @Override // com.applovin.impl.n3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f4402a;
    }

    public void initialize(List<a7> list, List<a7> list2, List<a7> list3, List<a7> list4, List<a7> list5, com.applovin.impl.sdk.k kVar) {
        this.f4402a = kVar;
        a aVar = new a(this, list, list2, list3, list4, list5);
        this.f4403b = aVar;
        aVar.a(new b());
        this.f4403b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("Configured CMP Networks");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f4403b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public r2 a(a7 a7Var, boolean z3) {
        r2.b bVarA = r2.a();
        boolean zB = this.f4402a.r0().b();
        a7.a aVarF = a7Var.f();
        a7.a aVar = a7.a.TCF_VENDOR;
        if (aVarF == aVar || (a7Var.f() == a7.a.ATP_NETWORK && zB)) {
            String strC = a7Var.c();
            String str = a7Var.f() == aVar ? "IAB Vendor ID: " : "Google ATP ID: ";
            r2.b bVarB = bVarA.d(strC).d(z3 ? -65536 : -16777216).b(strC);
            StringBuilder sbZ = d.h.z(str);
            sbZ.append(a7Var.d());
            bVarB.a(sbZ.toString()).a(true);
        } else {
            bVarA.d(a7Var.b());
        }
        return bVarA.a();
    }
}
