package com.applovin.impl;

import N7.G8;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.j2;
import com.applovin.impl.k2;
import com.applovin.impl.n6;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.applovin.impl.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC2122h0 extends d3 {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f19463a;

    /* renamed from: b, reason: collision with root package name */
    private k2 f19464b;

    /* renamed from: com.applovin.impl.h0$a */
    public class a extends k2 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f19465e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f19466f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f19467g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ List f19468h;
        final /* synthetic */ List i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list, List list2, List list3, List list4, List list5) {
            super(context);
            this.f19465e = list;
            this.f19466f = list2;
            this.f19467g = list3;
            this.f19468h = list4;
            this.i = list5;
        }

        @Override // com.applovin.impl.k2
        public int b() {
            return c.values().length;
        }

        @Override // com.applovin.impl.k2
        public List c(int i) {
            List list;
            boolean z10 = true;
            if (i == c.MISSING_TC_NETWORKS.ordinal()) {
                list = this.f19465e;
            } else if (i == c.MISSING_AC_NETWORKS.ordinal()) {
                list = this.f19466f;
            } else {
                z10 = false;
                list = i == c.LISTED_TC_NETWORKS.ordinal() ? this.f19467g : i == c.LISTED_AC_NETWORKS.ordinal() ? this.f19468h : this.i;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractActivityC2122h0.this.a((n6) it.next(), z10));
            }
            return arrayList;
        }

        @Override // com.applovin.impl.k2
        public int d(int i) {
            return i == c.MISSING_TC_NETWORKS.ordinal() ? this.f19465e.size() : i == c.MISSING_AC_NETWORKS.ordinal() ? this.f19466f.size() : i == c.LISTED_TC_NETWORKS.ordinal() ? this.f19467g.size() : i == c.LISTED_AC_NETWORKS.ordinal() ? this.f19468h.size() : this.i.size();
        }

        @Override // com.applovin.impl.k2
        public j2 e(int i) {
            return i == c.MISSING_TC_NETWORKS.ordinal() ? new j4("MISSING TCF VENDORS (TC STRING)") : i == c.MISSING_AC_NETWORKS.ordinal() ? new j4("MISSING ATP NETWORKS (AC STRING)") : i == c.LISTED_TC_NETWORKS.ordinal() ? new j4("LISTED TCF VENDORS (TC STRING)") : i == c.LISTED_AC_NETWORKS.ordinal() ? new j4("LISTED ATP NETWORKS (AC STRING)") : new j4("NON-CONFIGURABLE NETWORKS");
        }
    }

    /* renamed from: com.applovin.impl.h0$b */
    public class b implements k2.a {
        public b() {
        }

        @Override // com.applovin.impl.k2.a
        public void a(d2 d2Var, j2 j2Var) {
            a7.a(j2Var.c(), j2Var.b(), AbstractActivityC2122h0.this);
        }
    }

    /* renamed from: com.applovin.impl.h0$c */
    public enum c {
        MISSING_TC_NETWORKS,
        MISSING_AC_NETWORKS,
        LISTED_TC_NETWORKS,
        LISTED_AC_NETWORKS,
        OTHER_NETWORKS
    }

    @Override // com.applovin.impl.d3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f19463a;
    }

    public void initialize(List<n6> list, List<n6> list2, List<n6> list3, List<n6> list4, List<n6> list5, com.applovin.impl.sdk.k kVar) {
        this.f19463a = kVar;
        a aVar = new a(this, list, list2, list3, list4, list5);
        this.f19464b = aVar;
        aVar.a(new b());
        this.f19464b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.d3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("Configured CMP Networks");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f19464b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public j2 a(n6 n6Var, boolean z10) {
        j2.b bVarA = j2.a();
        boolean zB = this.f19463a.r0().b();
        n6.a aVarF = n6Var.f();
        n6.a aVar = n6.a.TCF_VENDOR;
        if (aVarF == aVar || (n6Var.f() == n6.a.ATP_NETWORK && zB)) {
            String strC = n6Var.c();
            String str = n6Var.f() == aVar ? "IAB Vendor ID: " : "Google ATP ID: ";
            j2.b bVarB = bVarA.d(strC).d(z10 ? -65536 : -16777216).b(strC);
            StringBuilder sbU = G8.u(str);
            sbU.append(n6Var.d());
            bVarB.a(sbU.toString()).a(true);
        } else {
            bVarA.d(n6Var.b());
        }
        return bVarA.a();
    }
}
