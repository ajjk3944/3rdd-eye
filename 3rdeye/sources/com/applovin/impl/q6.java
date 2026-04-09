package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.j2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class q6 extends d3 {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f20800a;

    /* renamed from: b, reason: collision with root package name */
    private List f20801b;

    /* renamed from: c, reason: collision with root package name */
    private List f20802c;

    /* renamed from: d, reason: collision with root package name */
    private k2 f20803d;

    /* renamed from: e, reason: collision with root package name */
    private List f20804e;

    /* renamed from: f, reason: collision with root package name */
    private List f20805f;

    /* renamed from: g, reason: collision with root package name */
    private ListView f20806g;

    public class a extends k2 {
        public a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.k2
        public j2 a() {
            return new j2.b(j2.c.SECTION_CENTERED).d("Select a network to load ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
        }

        @Override // com.applovin.impl.k2
        public int b() {
            return c.COUNT.ordinal();
        }

        @Override // com.applovin.impl.k2
        public List c(int i) {
            return i == c.BIDDERS.ordinal() ? q6.this.f20804e : q6.this.f20805f;
        }

        @Override // com.applovin.impl.k2
        public int d(int i) {
            return i == c.BIDDERS.ordinal() ? q6.this.f20804e.size() : q6.this.f20805f.size();
        }

        @Override // com.applovin.impl.k2
        public j2 e(int i) {
            return i == c.BIDDERS.ordinal() ? new j4("BIDDERS") : new j4("WATERFALL");
        }
    }

    public class b extends o3 {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ m2 f20808p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v2 v2Var, Context context, m2 m2Var) {
            super(v2Var, context);
            this.f20808p = m2Var;
        }

        @Override // com.applovin.impl.o3, com.applovin.impl.j2
        public int d() {
            if (q6.this.f20800a.s0().b() == null || !q6.this.f20800a.s0().b().equals(this.f20808p.b())) {
                return 0;
            }
            return R.drawable.applovin_ic_check_mark_borderless;
        }

        @Override // com.applovin.impl.o3, com.applovin.impl.j2
        public int e() {
            if (q6.this.f20800a.s0().b() == null || !q6.this.f20800a.s0().b().equals(this.f20808p.b())) {
                return super.e();
            }
            return -16776961;
        }

        @Override // com.applovin.impl.j2
        public SpannedString k() {
            return StringUtils.createSpannedString(this.f20808p.a(), o() ? -16777216 : -7829368, 18, 1);
        }
    }

    public enum c {
        BIDDERS,
        WATERFALL,
        COUNT
    }

    public q6() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    @Override // com.applovin.impl.d3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f20800a;
    }

    public void initialize(List<m2> list, List<m2> list2, com.applovin.impl.sdk.k kVar) {
        this.f20800a = kVar;
        this.f20801b = list;
        this.f20802c = list2;
        this.f20804e = a(list);
        this.f20805f = a(list2);
        a aVar = new a(this);
        this.f20803d = aVar;
        aVar.a(new C.e0(8, this, kVar));
        this.f20803d.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.d3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Live Network");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f20806g = listView;
        listView.setAdapter((ListAdapter) this.f20803d);
    }

    @Override // com.applovin.impl.d3, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f20804e = a(this.f20801b);
        this.f20805f = a(this.f20802c);
        this.f20803d.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.k kVar, d2 d2Var, j2 j2Var) {
        List listB = a(d2Var).b();
        if (listB.equals(kVar.s0().b())) {
            kVar.s0().a((List) null);
        } else {
            kVar.s0().a(listB);
        }
        this.f20803d.notifyDataSetChanged();
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m2 m2Var = (m2) it.next();
            arrayList.add(new b(m2Var.d(), this, m2Var));
        }
        return arrayList;
    }

    private m2 a(d2 d2Var) {
        if (d2Var.b() == c.BIDDERS.ordinal()) {
            return (m2) this.f20801b.get(d2Var.a());
        }
        return (m2) this.f20802c.get(d2Var.a());
    }
}
