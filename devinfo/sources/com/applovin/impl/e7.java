package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.r2;
import com.applovin.impl.s2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class e7 extends n3 {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f4070a;

    /* renamed from: b, reason: collision with root package name */
    private List f4071b;

    /* renamed from: c, reason: collision with root package name */
    private s2 f4072c;

    /* renamed from: d, reason: collision with root package name */
    private List f4073d;

    /* renamed from: e, reason: collision with root package name */
    private ListView f4074e;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a extends s2 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f4075e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list) {
            super(context);
            this.f4075e = list;
        }

        @Override // com.applovin.impl.s2
        public r2 a() {
            return new r2.b(r2.c.SECTION_CENTERED).d("Select a network to load test ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
        }

        @Override // com.applovin.impl.s2
        public int b() {
            return 1;
        }

        @Override // com.applovin.impl.s2
        public List c(int i4) {
            return e7.this.f4073d;
        }

        @Override // com.applovin.impl.s2
        public int d(int i4) {
            return this.f4075e.size();
        }

        @Override // com.applovin.impl.s2
        public r2 e(int i4) {
            return new v4("TEST MODE NETWORKS");
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class b implements s2.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f4077a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.k f4078b;

        public b(List list, com.applovin.impl.sdk.k kVar) {
            this.f4077a = list;
            this.f4078b = kVar;
        }

        @Override // com.applovin.impl.s2.a
        public void a(j2 j2Var, r2 r2Var) {
            List listU = ((e3) this.f4077a.get(j2Var.a())).u();
            if (listU.equals(this.f4078b.s0().b())) {
                this.f4078b.s0().a((List) null);
            } else {
                this.f4078b.s0().a(listU);
            }
            e7.this.f4072c.notifyDataSetChanged();
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class c extends z3 {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ e3 f4080p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e3 e3Var, Context context, e3 e3Var2) {
            super(e3Var, context);
            this.f4080p = e3Var2;
        }

        @Override // com.applovin.impl.z3, com.applovin.impl.r2
        public int d() {
            if (this.f4080p.u().equals(e7.this.f4070a.s0().b())) {
                return R.drawable.applovin_ic_check_mark_borderless;
            }
            return 0;
        }

        @Override // com.applovin.impl.z3, com.applovin.impl.r2
        public int e() {
            if (this.f4080p.u().equals(e7.this.f4070a.s0().b())) {
                return -16776961;
            }
            return super.e();
        }

        @Override // com.applovin.impl.r2
        public SpannedString k() {
            return StringUtils.createSpannedString(this.f4080p.g(), o() ? -16777216 : -7829368, 18, 1);
        }
    }

    public e7() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    @Override // com.applovin.impl.n3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f4070a;
    }

    public void initialize(List<e3> list, com.applovin.impl.sdk.k kVar) {
        this.f4070a = kVar;
        this.f4071b = list;
        this.f4073d = a(list);
        a aVar = new a(this, list);
        this.f4072c = aVar;
        aVar.a(new b(list, kVar));
        this.f4072c.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Test Mode Network");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f4074e = listView;
        listView.setAdapter((ListAdapter) this.f4072c);
    }

    @Override // com.applovin.impl.n3, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f4073d = a(this.f4071b);
        this.f4072c.notifyDataSetChanged();
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e3 e3Var = (e3) it.next();
            arrayList.add(new c(e3Var, this, e3Var));
        }
        return arrayList;
    }
}
