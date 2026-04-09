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
import com.applovin.impl.AbstractC2113d;
import com.applovin.impl.e3;
import com.applovin.impl.k2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitsListActivity;
import com.applovin.mediation.MaxDebuggerDetailActivity;
import com.applovin.mediation.MaxDebuggerTcfConsentStatusesListActivity;
import com.applovin.mediation.MaxDebuggerTcfInfoListActivity;
import com.applovin.mediation.MaxDebuggerTestLiveNetworkActivity;
import com.applovin.mediation.MaxDebuggerTestModeNetworkActivity;
import com.applovin.mediation.MaxDebuggerUnifiedFlowActivity;

/* loaded from: classes.dex */
public abstract class c3 extends d3 {

    /* renamed from: a, reason: collision with root package name */
    private e3 f19151a;

    /* renamed from: b, reason: collision with root package name */
    private DataSetObserver f19152b;

    /* renamed from: c, reason: collision with root package name */
    private FrameLayout f19153c;

    /* renamed from: d, reason: collision with root package name */
    private ListView f19154d;

    /* renamed from: e, reason: collision with root package name */
    private C2105a f19155e;

    public class a extends DataSetObserver {
        public a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            c3.this.a();
            c3 c3Var = c3.this;
            c3Var.b((Context) c3Var);
        }
    }

    public class b implements k2.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2111c f19157a;

        public class a implements AbstractC2113d.b {
            public a() {
            }

            @Override // com.applovin.impl.AbstractC2113d.b
            public void a(MaxDebuggerUnifiedFlowActivity maxDebuggerUnifiedFlowActivity) {
                maxDebuggerUnifiedFlowActivity.initialize(c3.this.f19151a.t());
            }
        }

        /* renamed from: com.applovin.impl.c3$b$b, reason: collision with other inner class name */
        public class C0308b implements AbstractC2113d.b {
            public C0308b() {
            }

            @Override // com.applovin.impl.AbstractC2113d.b
            public void a(MaxDebuggerTcfInfoListActivity maxDebuggerTcfInfoListActivity) {
                maxDebuggerTcfInfoListActivity.initialize(c3.this.f19151a.d(), c3.this.f19151a.t());
            }
        }

        public class c implements AbstractC2113d.b {
            public c() {
            }

            @Override // com.applovin.impl.AbstractC2113d.b
            public void a(MaxDebuggerTcfConsentStatusesListActivity maxDebuggerTcfConsentStatusesListActivity) {
                maxDebuggerTcfConsentStatusesListActivity.initialize(c3.this.f19151a.d(), c3.this.f19151a.t());
            }
        }

        public class d implements AbstractC2113d.b {
            public d() {
            }

            @Override // com.applovin.impl.AbstractC2113d.b
            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(c3.this.f19151a.f(), false, c3.this.f19151a.t());
            }
        }

        public class e implements AbstractC2113d.b {
            public e() {
            }

            @Override // com.applovin.impl.AbstractC2113d.b
            public void a(MaxDebuggerTestLiveNetworkActivity maxDebuggerTestLiveNetworkActivity) {
                maxDebuggerTestLiveNetworkActivity.initialize(c3.this.f19151a.k(), c3.this.f19151a.w(), c3.this.f19151a.t());
            }
        }

        public class f implements AbstractC2113d.b {
            public f() {
            }

            @Override // com.applovin.impl.AbstractC2113d.b
            public void a(MaxDebuggerTestModeNetworkActivity maxDebuggerTestModeNetworkActivity) {
                maxDebuggerTestModeNetworkActivity.initialize(c3.this.f19151a.v(), c3.this.f19151a.t());
            }
        }

        public class g implements AbstractC2113d.b {
            public g() {
            }

            @Override // com.applovin.impl.AbstractC2113d.b
            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(c3.this.f19151a.o(), true, c3.this.f19151a.t());
            }
        }

        public class h implements AbstractC2113d.b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j2 f19166a;

            public h(j2 j2Var) {
                this.f19166a = j2Var;
            }

            @Override // com.applovin.impl.AbstractC2113d.b
            public void a(MaxDebuggerDetailActivity maxDebuggerDetailActivity) {
                maxDebuggerDetailActivity.initialize(((o3) this.f19166a).r());
            }
        }

        public b(C2111c c2111c) {
            this.f19157a = c2111c;
        }

        @Override // com.applovin.impl.k2.a
        public void a(d2 d2Var, j2 j2Var) {
            int iB = d2Var.b();
            if (iB == e3.e.APP_INFO.ordinal()) {
                a7.a(j2Var.c(), j2Var.b(), c3.this);
                return;
            }
            if (iB == e3.e.MAX.ordinal()) {
                if (c3.this.f19151a.a(j2Var)) {
                    AbstractC2113d.a(c3.this, MaxDebuggerUnifiedFlowActivity.class, this.f19157a, new a());
                    return;
                } else {
                    a7.a(j2Var.c(), j2Var.b(), c3.this);
                    return;
                }
            }
            if (iB == e3.e.PRIVACY.ordinal()) {
                if (d2Var.a() != e3.d.CMP.ordinal()) {
                    if (d2Var.a() == e3.d.NETWORK_CONSENT_STATUSES.ordinal()) {
                        AbstractC2113d.a(c3.this, MaxDebuggerTcfConsentStatusesListActivity.class, this.f19157a, new c());
                        return;
                    }
                    return;
                } else if (StringUtils.isValidString(c3.this.f19151a.t().r0().j())) {
                    AbstractC2113d.a(c3.this, MaxDebuggerTcfInfoListActivity.class, this.f19157a, new C0308b());
                    return;
                } else {
                    a7.a(j2Var.c(), j2Var.b(), c3.this);
                    return;
                }
            }
            if (iB != e3.e.ADS.ordinal()) {
                if ((iB == e3.e.MICRO_SDK_PARTNER_NETWORKS.ordinal() || iB == e3.e.INCOMPLETE_NETWORKS.ordinal() || iB == e3.e.COMPLETED_NETWORKS.ordinal()) && (j2Var instanceof o3)) {
                    AbstractC2113d.a(c3.this, MaxDebuggerDetailActivity.class, this.f19157a, new h(j2Var));
                    return;
                }
                return;
            }
            if (d2Var.a() == e3.b.AD_UNITS.ordinal()) {
                if (c3.this.f19151a.f().size() > 0) {
                    AbstractC2113d.a(c3.this, MaxDebuggerAdUnitsListActivity.class, this.f19157a, new d());
                    return;
                } else {
                    a7.a("No live ad units", "Please setup or enable your MAX ad units on https://applovin.com.", c3.this);
                    return;
                }
            }
            if (d2Var.a() == e3.b.SELECT_LIVE_NETWORKS.ordinal()) {
                if (c3.this.f19151a.k().size() <= 0 && c3.this.f19151a.w().size() <= 0) {
                    a7.a("Complete Integrations", "Please complete integrations in order to access this.", c3.this);
                    return;
                } else if (c3.this.f19151a.t().s0().c()) {
                    a7.a("Restart Required", j2Var.b(), c3.this);
                    return;
                } else {
                    AbstractC2113d.a(c3.this, MaxDebuggerTestLiveNetworkActivity.class, this.f19157a, new e());
                    return;
                }
            }
            if (d2Var.a() != e3.b.SELECT_TEST_MODE_NETWORKS.ordinal()) {
                if (d2Var.a() == e3.b.INITIALIZATION_AD_UNITS.ordinal()) {
                    AbstractC2113d.a(c3.this, MaxDebuggerAdUnitsListActivity.class, this.f19157a, new g());
                }
            } else if (!c3.this.f19151a.t().s0().c()) {
                c3.this.getSdk().s0().a();
                a7.a("Restart Required", j2Var.b(), c3.this);
            } else if (c3.this.f19151a.v().size() > 0) {
                AbstractC2113d.a(c3.this, MaxDebuggerTestModeNetworkActivity.class, this.f19157a, new f());
            } else {
                a7.a("Complete Integrations", "Please complete integrations in order to access this.", c3.this);
            }
        }
    }

    private void c() {
        a();
        C2105a c2105a = new C2105a(this, 50, R.attr.progressBarStyleLarge);
        this.f19155e = c2105a;
        c2105a.setColor(-3355444);
        this.f19153c.addView(this.f19155e, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f19153c.bringChildToFront(this.f19155e);
        this.f19155e.a();
    }

    @Override // com.applovin.impl.d3
    public com.applovin.impl.sdk.k getSdk() {
        e3 e3Var = this.f19151a;
        if (e3Var != null) {
            return e3Var.t();
        }
        return null;
    }

    @Override // com.applovin.impl.d3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Mediation Debugger");
        setContentView(com.applovin.sdk.R.layout.mediation_debugger_list_view);
        this.f19153c = (FrameLayout) findViewById(R.id.content);
        ListView listView = (ListView) findViewById(com.applovin.sdk.R.id.listView);
        this.f19154d = listView;
        listView.setAdapter((ListAdapter) this.f19151a);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(com.applovin.sdk.R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    @Override // com.applovin.impl.d3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        e3 e3Var = this.f19151a;
        if (e3Var != null) {
            e3Var.unregisterDataSetObserver(this.f19152b);
            this.f19151a.a((k2.a) null);
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
        e3 e3Var = this.f19151a;
        if (e3Var == null || e3Var.y()) {
            return;
        }
        c();
    }

    public void setListAdapter(e3 e3Var, C2111c c2111c) {
        DataSetObserver dataSetObserver;
        e3 e3Var2 = this.f19151a;
        if (e3Var2 != null && (dataSetObserver = this.f19152b) != null) {
            e3Var2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f19151a = e3Var;
        this.f19152b = new a();
        b((Context) this);
        this.f19151a.registerDataSetObserver(this.f19152b);
        this.f19151a.a(new b(c2111c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        C2105a c2105a = this.f19155e;
        if (c2105a != null) {
            c2105a.b();
            this.f19153c.removeView(this.f19155e);
            this.f19155e = null;
        }
    }

    private void b() {
        e3 e3Var = this.f19151a;
        if (e3Var == null) {
            return;
        }
        String strP = e3Var.p();
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
        a7.a(this.f19151a.i(), this.f19151a.h(), context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context) {
        if (!StringUtils.isValidString(this.f19151a.h()) || this.f19151a.x()) {
            return;
        }
        this.f19151a.b(true);
        runOnUiThread(new H0(3, this, context));
    }
}
