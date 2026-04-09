package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.j2;
import com.applovin.impl.k2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class r6 extends d3 {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f20899a;

    /* renamed from: b, reason: collision with root package name */
    private List f20900b;

    /* renamed from: c, reason: collision with root package name */
    private k2 f20901c;

    /* renamed from: d, reason: collision with root package name */
    private List f20902d;

    /* renamed from: e, reason: collision with root package name */
    private ListView f20903e;

    public class a extends k2 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f20904e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list) {
            super(context);
            this.f20904e = list;
        }

        @Override // com.applovin.impl.k2
        public j2 a() {
            return new j2.b(j2.c.SECTION_CENTERED).d("Select a network to load test ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
        }

        @Override // com.applovin.impl.k2
        public int b() {
            return 1;
        }

        @Override // com.applovin.impl.k2
        public List c(int i) {
            return r6.this.f20902d;
        }

        @Override // com.applovin.impl.k2
        public int d(int i) {
            return this.f20904e.size();
        }

        @Override // com.applovin.impl.k2
        public j2 e(int i) {
            return new j4("TEST MODE NETWORKS");
        }
    }

    public class b implements k2.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f20906a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.k f20907b;

        public b(List list, com.applovin.impl.sdk.k kVar) {
            this.f20906a = list;
            this.f20907b = kVar;
        }

        @Override // com.applovin.impl.k2.a
        public void a(d2 d2Var, j2 j2Var) {
            List listU = ((v2) this.f20906a.get(d2Var.a())).u();
            if (listU.equals(this.f20907b.s0().b())) {
                this.f20907b.s0().a((List) null);
            } else {
                this.f20907b.s0().a(listU);
            }
            r6.this.f20901c.notifyDataSetChanged();
        }
    }

    public class c extends o3 {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ v2 f20909p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v2 v2Var, Context context, v2 v2Var2) {
            super(v2Var, context);
            this.f20909p = v2Var2;
        }

        @Override // com.applovin.impl.o3, com.applovin.impl.j2
        public int d() {
            if (this.f20909p.u().equals(r6.this.f20899a.s0().b())) {
                return R.drawable.applovin_ic_check_mark_borderless;
            }
            return 0;
        }

        @Override // com.applovin.impl.o3, com.applovin.impl.j2
        public int e() {
            if (this.f20909p.u().equals(r6.this.f20899a.s0().b())) {
                return -16776961;
            }
            return super.e();
        }

        @Override // com.applovin.impl.j2
        public SpannedString k() {
            return StringUtils.createSpannedString(this.f20909p.g(), o() ? -16777216 : -7829368, 18, 1);
        }
    }

    public r6() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    @Override // com.applovin.impl.d3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f20899a;
    }

    public void initialize(List<v2> list, com.applovin.impl.sdk.k kVar) {
        this.f20899a = kVar;
        this.f20900b = list;
        this.f20902d = a(list);
        a aVar = new a(this, list);
        this.f20901c = aVar;
        aVar.a(new b(list, kVar));
        this.f20901c.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.d3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Test Mode Network");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f20903e = listView;
        listView.setAdapter((ListAdapter) this.f20901c);
    }

    @Override // com.applovin.impl.d3, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f20902d = a(this.f20900b);
        this.f20901c.notifyDataSetChanged();
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            v2 v2Var = (v2) it.next();
            arrayList.add(new c(v2Var, this, v2Var));
        }
        return arrayList;
    }
}
