package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.AbstractC2113d;
import com.applovin.impl.j2;
import com.applovin.impl.k2;
import com.applovin.impl.n6;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerCmpNetworksListActivity;
import com.applovin.mediation.MaxDebuggerTcfStringActivity;
import com.applovin.sdk.R;
import g0.C4356c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class l6 extends d3 {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f20085a;

    /* renamed from: b, reason: collision with root package name */
    private k2 f20086b;

    /* renamed from: c, reason: collision with root package name */
    private final List f20087c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final List f20088d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final List f20089e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final List f20090f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final List f20091g = new ArrayList();

    public class a extends k2 {
        public a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.k2
        public int b() {
            return e.values().length;
        }

        @Override // com.applovin.impl.k2
        public List c(int i) {
            return i == e.IAB_TCF_PARAMETERS.ordinal() ? l6.this.c() : l6.this.a();
        }

        @Override // com.applovin.impl.k2
        public int d(int i) {
            return i == e.IAB_TCF_PARAMETERS.ordinal() ? d.values().length : c.values().length;
        }

        @Override // com.applovin.impl.k2
        public j2 e(int i) {
            return i == e.IAB_TCF_PARAMETERS.ordinal() ? new j4("IAB TCF Parameters") : new j4("CMP CONFIGURATION");
        }
    }

    public class b implements k2.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m6 f20093a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.k f20094b;

        public class a implements AbstractC2113d.b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f20096a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f20097b;

            public a(String str, String str2) {
                this.f20096a = str;
                this.f20097b = str2;
            }

            @Override // com.applovin.impl.AbstractC2113d.b
            public void a(MaxDebuggerTcfStringActivity maxDebuggerTcfStringActivity) {
                maxDebuggerTcfStringActivity.initialize(this.f20096a, this.f20097b, b.this.f20094b);
            }
        }

        /* renamed from: com.applovin.impl.l6$b$b, reason: collision with other inner class name */
        public class C0310b implements AbstractC2113d.b {
            public C0310b() {
            }

            @Override // com.applovin.impl.AbstractC2113d.b
            public void a(MaxDebuggerCmpNetworksListActivity maxDebuggerCmpNetworksListActivity) {
                maxDebuggerCmpNetworksListActivity.initialize(l6.this.f20089e, l6.this.f20090f, l6.this.f20087c, l6.this.f20088d, l6.this.f20091g, b.this.f20094b);
            }
        }

        public b(m6 m6Var, com.applovin.impl.sdk.k kVar) {
            this.f20093a = m6Var;
            this.f20094b = kVar;
        }

        @Override // com.applovin.impl.k2.a
        public void a(d2 d2Var, j2 j2Var) {
            String strA;
            String strC;
            if (d2Var.b() != e.IAB_TCF_PARAMETERS.ordinal()) {
                if (d2Var.a() == c.CONFIGURED_NETWORKS.ordinal()) {
                    AbstractC2113d.a(l6.this, MaxDebuggerCmpNetworksListActivity.class, this.f20094b.e(), new C0310b());
                    return;
                } else {
                    a7.a(j2Var.c(), j2Var.b(), l6.this);
                    return;
                }
            }
            if (d2Var.a() == d.TC_STRING.ordinal()) {
                strA = n4.f20588v.a();
                strC = this.f20093a.j();
            } else {
                strA = n4.f20589w.a();
                strC = this.f20093a.c();
            }
            AbstractC2113d.a(l6.this, MaxDebuggerTcfStringActivity.class, this.f20094b.e(), new a(strA, strC));
        }
    }

    public enum c {
        CMP_SDK_ID,
        CMP_SDK_VERSION,
        INSTRUCTIONS,
        CONFIGURED_NETWORKS
    }

    public enum d {
        GDPR_APPLIES,
        TC_STRING,
        AC_STRING
    }

    public enum e {
        IAB_TCF_PARAMETERS,
        CMP_CONFIGURATION
    }

    @Override // com.applovin.impl.d3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f20085a;
    }

    public void initialize(List<n6> list, com.applovin.impl.sdk.k kVar) {
        this.f20085a = kVar;
        m6 m6VarR0 = kVar.r0();
        a(list);
        a aVar = new a(this);
        this.f20086b = aVar;
        aVar.a(new b(m6VarR0, kVar));
        this.f20086b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.d3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("CMP (Consent Management Platform)");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f20086b);
    }

    @Override // com.applovin.impl.d3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        k2 k2Var = this.f20086b;
        if (k2Var != null) {
            k2Var.a((k2.a) null);
        }
    }

    private void a(List list) {
        boolean zB = this.f20085a.r0().b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            n6 n6Var = (n6) it.next();
            if (n6Var.f() == n6.a.TCF_VENDOR) {
                if (Boolean.TRUE.equals(n6Var.a())) {
                    a(n6Var, this.f20087c);
                } else {
                    a(n6Var, this.f20089e);
                }
            } else if (n6Var.f() != n6.a.ATP_NETWORK) {
                this.f20091g.add(n6Var);
            } else if (!zB) {
                this.f20091g.add(n6Var);
            } else if (Boolean.TRUE.equals(n6Var.a())) {
                a(n6Var, this.f20088d);
            } else {
                a(n6Var, this.f20090f);
            }
        }
    }

    private j2 b() {
        j2.b bVarA;
        String strA = n4.f20585s.a();
        Integer numE = this.f20085a.r0().e();
        if (StringUtils.isValidString(this.f20085a.r0().d())) {
            bVarA = j2.a(j2.c.RIGHT_DETAIL);
        } else {
            j2.b bVarB = j2.a(j2.c.DETAIL).b("Unknown CMP SDK ID");
            bVarA = bVarB.a("Your integrated CMP might not be Google-certified. " + ("SharedPreferences value for key " + strA + " is " + numE + ".") + "\n\nIf you use Google AdMob or Google Ad Manager, make sure that the integrated CMP is included in the list of Google-certified CMPs at: https://support.google.com/admob/answer/13554116").a(R.drawable.applovin_ic_warning).b(AbstractC2124i0.a(R.color.applovin_sdk_warningColor, this)).a(true);
        }
        bVarA.d(strA);
        bVarA.c(numE != null ? numE.toString() : "No value set");
        bVarA.c(numE != null ? -16777216 : -65536);
        return bVarA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List c() {
        ArrayList arrayList = new ArrayList(d.values().length);
        Integer numG = this.f20085a.r0().g();
        String strJ = this.f20085a.r0().j();
        String strC = this.f20085a.r0().c();
        arrayList.add(a(n4.f20587u.a(), numG));
        arrayList.add(a(n4.f20588v.a(), strJ, !p6.b(strJ)));
        arrayList.add(a(n4.f20589w.a(), strC, false));
        return arrayList;
    }

    private void a(n6 n6Var, List list) {
        if (n6Var.d() != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (n6Var.d().equals(((n6) it.next()).d())) {
                    return;
                }
            }
        }
        list.add(n6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a() {
        String strI;
        ArrayList arrayList = new ArrayList(c.values().length);
        int size = this.f20090f.size() + this.f20089e.size();
        arrayList.add(b());
        arrayList.add(a(n4.f20586t.a(), this.f20085a.r0().f()));
        arrayList.add(j2.a(j2.c.DETAIL).d("To check which networks are missing from your CMP, first make sure that you have granted consent to all networks through your CMP flow. Then add the following networks to your CMP network list.").a());
        j2.b bVarD = j2.a(j2.c.RIGHT_DETAIL).d("Configured CMP Networks");
        if (size > 0) {
            strI = C4356c.i(size, "Missing ", " network(s)");
        } else {
            strI = "";
        }
        arrayList.add(bVarD.c(strI).c(size > 0 ? -65536 : -16777216).a(this).a(true).a());
        return arrayList;
    }

    private j2 a(String str, Integer num) {
        return j2.a(j2.c.RIGHT_DETAIL).d(str).c(num != null ? num.toString() : "No value set").c(num != null ? -16777216 : -65536).a();
    }

    private j2 a(String str, String str2, boolean z10) {
        boolean zIsValidString = StringUtils.isValidString(str2);
        if (zIsValidString && str2.length() > 35) {
            str2 = str2.substring(0, 35) + "...";
        }
        j2.b bVarD = j2.a(j2.c.DETAIL).d(str);
        if (!zIsValidString) {
            str2 = "No value set";
        }
        j2.b bVarA = bVarD.c(str2).c(z10 ? -65536 : -16777216).a(zIsValidString);
        if (zIsValidString) {
            bVarA.a(this);
        }
        return bVarA.a();
    }
}
