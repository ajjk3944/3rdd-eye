package com.applovin.impl;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.d;
import com.applovin.impl.o3;
import com.applovin.impl.s2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitsListActivity;
import com.applovin.mediation.MaxDebuggerDetailActivity;
import com.applovin.mediation.MaxDebuggerTcfConsentStatusesListActivity;
import com.applovin.mediation.MaxDebuggerTcfInfoListActivity;
import com.applovin.mediation.MaxDebuggerTestLiveNetworkActivity;
import com.applovin.mediation.MaxDebuggerTestModeNetworkActivity;
import com.applovin.mediation.MaxDebuggerUnifiedFlowActivity;

/* loaded from: classes.dex */
public abstract class m3 extends n3 {

    /* renamed from: a, reason: collision with root package name */
    private o3 f6460a;

    /* renamed from: b, reason: collision with root package name */
    private DataSetObserver f6461b;

    /* renamed from: c, reason: collision with root package name */
    private FrameLayout f6462c;

    /* renamed from: d, reason: collision with root package name */
    private ListView f6463d;

    /* renamed from: e, reason: collision with root package name */
    private com.applovin.impl.a f6464e;

    public class a extends DataSetObserver {
        public a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            m3.this.a();
            m3 m3Var = m3.this;
            m3Var.b((Context) m3Var);
        }
    }

    public class b implements s2.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.c f6466a;

        public class a implements d.b {
            public a() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerUnifiedFlowActivity maxDebuggerUnifiedFlowActivity) {
                maxDebuggerUnifiedFlowActivity.initialize(m3.this.f6460a.t());
            }
        }

        /* renamed from: com.applovin.impl.m3$b$b, reason: collision with other inner class name */
        public class C0076b implements d.b {
            public C0076b() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTcfInfoListActivity maxDebuggerTcfInfoListActivity) {
                maxDebuggerTcfInfoListActivity.initialize(m3.this.f6460a.d(), m3.this.f6460a.t());
            }
        }

        public class c implements d.b {
            public c() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTcfConsentStatusesListActivity maxDebuggerTcfConsentStatusesListActivity) {
                maxDebuggerTcfConsentStatusesListActivity.initialize(m3.this.f6460a.d(), m3.this.f6460a.t());
            }
        }

        public class d implements d.b {
            public d() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(m3.this.f6460a.f(), false, m3.this.f6460a.t());
            }
        }

        public class e implements d.b {
            public e() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTestLiveNetworkActivity maxDebuggerTestLiveNetworkActivity) {
                maxDebuggerTestLiveNetworkActivity.initialize(m3.this.f6460a.k(), m3.this.f6460a.w(), m3.this.f6460a.t());
            }
        }

        public class f implements d.b {
            public f() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTestModeNetworkActivity maxDebuggerTestModeNetworkActivity) {
                maxDebuggerTestModeNetworkActivity.initialize(m3.this.f6460a.v(), m3.this.f6460a.t());
            }
        }

        public class g implements d.b {
            public g() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(m3.this.f6460a.o(), true, m3.this.f6460a.t());
            }
        }

        public class h implements d.b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ r2 f6475a;

            public h(r2 r2Var) {
                this.f6475a = r2Var;
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerDetailActivity maxDebuggerDetailActivity) {
                maxDebuggerDetailActivity.initialize(((z3) this.f6475a).r());
            }
        }

        public b(com.applovin.impl.c cVar) {
            this.f6466a = cVar;
        }

        @Override // com.applovin.impl.s2.a
        public void a(j2 j2Var, r2 r2Var) {
            int iB = j2Var.b();
            if (iB == o3.e.APP_INFO.ordinal()) {
                n7.a(r2Var.c(), r2Var.b(), m3.this);
                return;
            }
            if (iB == o3.e.MAX.ordinal()) {
                if (m3.this.f6460a.a(r2Var)) {
                    com.applovin.impl.d.a(m3.this, MaxDebuggerUnifiedFlowActivity.class, this.f6466a, new a());
                    return;
                } else {
                    n7.a(r2Var.c(), r2Var.b(), m3.this);
                    return;
                }
            }
            if (iB == o3.e.PRIVACY.ordinal()) {
                if (j2Var.a() != o3.d.CMP.ordinal()) {
                    if (j2Var.a() == o3.d.NETWORK_CONSENT_STATUSES.ordinal()) {
                        com.applovin.impl.d.a(m3.this, MaxDebuggerTcfConsentStatusesListActivity.class, this.f6466a, new c());
                        return;
                    }
                    return;
                } else if (StringUtils.isValidString(m3.this.f6460a.t().r0().j())) {
                    com.applovin.impl.d.a(m3.this, MaxDebuggerTcfInfoListActivity.class, this.f6466a, new C0076b());
                    return;
                } else {
                    n7.a(r2Var.c(), r2Var.b(), m3.this);
                    return;
                }
            }
            if (iB != o3.e.ADS.ordinal()) {
                if ((iB == o3.e.INCOMPLETE_NETWORKS.ordinal() || iB == o3.e.COMPLETED_NETWORKS.ordinal()) && (r2Var instanceof z3)) {
                    com.applovin.impl.d.a(m3.this, MaxDebuggerDetailActivity.class, this.f6466a, new h(r2Var));
                    return;
                }
                return;
            }
            if (j2Var.a() == o3.b.AD_UNITS.ordinal()) {
                if (m3.this.f6460a.f().size() > 0) {
                    com.applovin.impl.d.a(m3.this, MaxDebuggerAdUnitsListActivity.class, this.f6466a, new d());
                    return;
                } else {
                    n7.a("No live ad units", "Please setup or enable your MAX ad units on https://applovin.com.", m3.this);
                    return;
                }
            }
            if (j2Var.a() == o3.b.SELECT_LIVE_NETWORKS.ordinal()) {
                if (m3.this.f6460a.k().size() <= 0 && m3.this.f6460a.w().size() <= 0) {
                    n7.a("Complete Integrations", "Please complete integrations in order to access this.", m3.this);
                    return;
                } else if (m3.this.f6460a.t().s0().c()) {
                    n7.a("Restart Required", r2Var.b(), m3.this);
                    return;
                } else {
                    com.applovin.impl.d.a(m3.this, MaxDebuggerTestLiveNetworkActivity.class, this.f6466a, new e());
                    return;
                }
            }
            if (j2Var.a() != o3.b.SELECT_TEST_MODE_NETWORKS.ordinal()) {
                if (j2Var.a() == o3.b.INITIALIZATION_AD_UNITS.ordinal()) {
                    com.applovin.impl.d.a(m3.this, MaxDebuggerAdUnitsListActivity.class, this.f6466a, new g());
                }
            } else if (!m3.this.f6460a.t().s0().c()) {
                m3.this.getSdk().s0().a();
                n7.a("Restart Required", r2Var.b(), m3.this);
            } else if (m3.this.f6460a.v().size() > 0) {
                com.applovin.impl.d.a(m3.this, MaxDebuggerTestModeNetworkActivity.class, this.f6466a, new f());
            } else {
                n7.a("Complete Integrations", "Please complete integrations in order to access this.", m3.this);
            }
        }
    }

    private void c() {
        a();
        com.applovin.impl.a aVar = new com.applovin.impl.a(this, 50, R.attr.progressBarStyleLarge);
        this.f6464e = aVar;
        aVar.setColor(-3355444);
        this.f6462c.addView(this.f6464e, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f6462c.bringChildToFront(this.f6464e);
        this.f6464e.a();
    }

    @Override // com.applovin.impl.n3
    public com.applovin.impl.sdk.k getSdk() {
        o3 o3Var = this.f6460a;
        if (o3Var != null) {
            return o3Var.t();
        }
        return null;
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Mediation Debugger");
        setContentView(com.applovin.sdk.R.layout.mediation_debugger_list_view);
        this.f6462c = (FrameLayout) findViewById(R.id.content);
        ListView listView = (ListView) findViewById(com.applovin.sdk.R.id.listView);
        this.f6463d = listView;
        listView.setAdapter((ListAdapter) this.f6460a);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(com.applovin.sdk.R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        o3 o3Var = this.f6460a;
        if (o3Var != null) {
            o3Var.unregisterDataSetObserver(this.f6461b);
            this.f6460a.a((s2.a) null);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (com.applovin.sdk.R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        b();
        return true;
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        o3 o3Var = this.f6460a;
        if (o3Var == null || o3Var.y()) {
            return;
        }
        c();
    }

    public void setListAdapter(o3 o3Var, c cVar) {
        DataSetObserver dataSetObserver;
        o3 o3Var2 = this.f6460a;
        if (o3Var2 != null && (dataSetObserver = this.f6461b) != null) {
            o3Var2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f6460a = o3Var;
        this.f6461b = new a();
        b((Context) this);
        this.f6460a.registerDataSetObserver(this.f6461b);
        this.f6460a.a(new b(cVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        com.applovin.impl.a aVar = this.f6464e;
        if (aVar != null) {
            aVar.b();
            this.f6462c.removeView(this.f6464e);
            this.f6464e = null;
        }
    }

    private void b() {
        o3 o3Var = this.f6460a;
        if (o3Var == null) {
            return;
        }
        String strP = o3Var.p();
        if (TextUtils.isEmpty(strP)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", strP);
        intent.putExtra("android.intent.extra.TITLE", "Mediation Debugger logs");
        intent.putExtra("android.intent.extra.SUBJECT", "MAX Mediation Debugger logs");
        startActivity(Intent.createChooser(intent, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Context context) {
        n7.a(this.f6460a.i(), this.f6460a.h(), context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final Context context) {
        if (!StringUtils.isValidString(this.f6460a.h()) || this.f6460a.x()) {
            return;
        }
        this.f6460a.b(true);
        runOnUiThread(new Runnable() { // from class: com.applovin.impl.mc
            @Override // java.lang.Runnable
            public final void run() {
                this.f6495a.a(context);
            }
        });
    }
}
