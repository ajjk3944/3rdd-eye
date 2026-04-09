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

/* loaded from: classes.dex */
public abstract class l0 extends n3 {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f6369a;

    /* renamed from: b, reason: collision with root package name */
    private s2 f6370b;

    public class a extends s2 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f6371e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f6372f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f6373g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ List f6374h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ List f6375i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list, List list2, List list3, List list4, List list5) {
            super(context);
            this.f6371e = list;
            this.f6372f = list2;
            this.f6373g = list3;
            this.f6374h = list4;
            this.f6375i = list5;
        }

        @Override // com.applovin.impl.s2
        public int b() {
            return c.values().length;
        }

        @Override // com.applovin.impl.s2
        public List c(int i10) {
            List list;
            boolean z10 = true;
            if (i10 == c.MISSING_TC_NETWORKS.ordinal()) {
                list = this.f6371e;
            } else if (i10 == c.MISSING_AC_NETWORKS.ordinal()) {
                list = this.f6372f;
            } else {
                z10 = false;
                list = i10 == c.LISTED_TC_NETWORKS.ordinal() ? this.f6373g : i10 == c.LISTED_AC_NETWORKS.ordinal() ? this.f6374h : this.f6375i;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(l0.this.a((a7) it.next(), z10));
            }
            return arrayList;
        }

        @Override // com.applovin.impl.s2
        public int d(int i10) {
            return i10 == c.MISSING_TC_NETWORKS.ordinal() ? this.f6371e.size() : i10 == c.MISSING_AC_NETWORKS.ordinal() ? this.f6372f.size() : i10 == c.LISTED_TC_NETWORKS.ordinal() ? this.f6373g.size() : i10 == c.LISTED_AC_NETWORKS.ordinal() ? this.f6374h.size() : this.f6375i.size();
        }

        @Override // com.applovin.impl.s2
        public r2 e(int i10) {
            return i10 == c.MISSING_TC_NETWORKS.ordinal() ? new v4("MISSING TCF VENDORS (TC STRING)") : i10 == c.MISSING_AC_NETWORKS.ordinal() ? new v4("MISSING ATP NETWORKS (AC STRING)") : i10 == c.LISTED_TC_NETWORKS.ordinal() ? new v4("LISTED TCF VENDORS (TC STRING)") : i10 == c.LISTED_AC_NETWORKS.ordinal() ? new v4("LISTED ATP NETWORKS (AC STRING)") : new v4("NON-CONFIGURABLE NETWORKS");
        }
    }

    public class b implements s2.a {
        public b() {
        }

        @Override // com.applovin.impl.s2.a
        public void a(j2 j2Var, r2 r2Var) {
            n7.a(r2Var.c(), r2Var.b(), l0.this);
        }
    }

    public enum c {
        MISSING_TC_NETWORKS,
        MISSING_AC_NETWORKS,
        LISTED_TC_NETWORKS,
        LISTED_AC_NETWORKS,
        OTHER_NETWORKS
    }

    @Override // com.applovin.impl.n3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f6369a;
    }

    public void initialize(List<a7> list, List<a7> list2, List<a7> list3, List<a7> list4, List<a7> list5, com.applovin.impl.sdk.k kVar) {
        this.f6369a = kVar;
        a aVar = new a(this, list, list2, list3, list4, list5);
        this.f6370b = aVar;
        aVar.a(new b());
        this.f6370b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("Configured CMP Networks");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f6370b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public r2 a(a7 a7Var, boolean z10) {
        r2.b bVarA = r2.a();
        boolean zB = this.f6369a.r0().b();
        a7.a aVarF = a7Var.f();
        a7.a aVar = a7.a.TCF_VENDOR;
        if (aVarF == aVar || (a7Var.f() == a7.a.ATP_NETWORK && zB)) {
            String strC = a7Var.c();
            String str = a7Var.f() == aVar ? "IAB Vendor ID: " : "Google ATP ID: ";
            bVarA.d(strC).d(z10 ? -65536 : -16777216).b(strC).a(str + a7Var.d()).a(true);
        } else {
            bVarA.d(a7Var.b());
        }
        return bVarA.a();
    }
}
