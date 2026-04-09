package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.r2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class d7 extends n3 {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f3966a;

    /* renamed from: b, reason: collision with root package name */
    private List f3967b;

    /* renamed from: c, reason: collision with root package name */
    private List f3968c;

    /* renamed from: d, reason: collision with root package name */
    private s2 f3969d;

    /* renamed from: e, reason: collision with root package name */
    private List f3970e;

    /* renamed from: f, reason: collision with root package name */
    private List f3971f;
    private ListView g;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a extends s2 {
        public a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.s2
        public r2 a() {
            return new r2.b(r2.c.SECTION_CENTERED).d("Select a network to load ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
        }

        @Override // com.applovin.impl.s2
        public int b() {
            return c.COUNT.ordinal();
        }

        @Override // com.applovin.impl.s2
        public List c(int i4) {
            return i4 == c.BIDDERS.ordinal() ? d7.this.f3970e : d7.this.f3971f;
        }

        @Override // com.applovin.impl.s2
        public int d(int i4) {
            return i4 == c.BIDDERS.ordinal() ? d7.this.f3970e.size() : d7.this.f3971f.size();
        }

        @Override // com.applovin.impl.s2
        public r2 e(int i4) {
            return i4 == c.BIDDERS.ordinal() ? new v4("BIDDERS") : new v4("WATERFALL");
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class b extends z3 {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ u2 f3973p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e3 e3Var, Context context, u2 u2Var) {
            super(e3Var, context);
            this.f3973p = u2Var;
        }

        @Override // com.applovin.impl.z3, com.applovin.impl.r2
        public int d() {
            if (d7.this.f3966a.s0().b() == null || !d7.this.f3966a.s0().b().equals(this.f3973p.b())) {
                return 0;
            }
            return R.drawable.applovin_ic_check_mark_borderless;
        }

        @Override // com.applovin.impl.z3, com.applovin.impl.r2
        public int e() {
            if (d7.this.f3966a.s0().b() == null || !d7.this.f3966a.s0().b().equals(this.f3973p.b())) {
                return super.e();
            }
            return -16776961;
        }

        @Override // com.applovin.impl.r2
        public SpannedString k() {
            return StringUtils.createSpannedString(this.f3973p.a(), o() ? -16777216 : -7829368, 18, 1);
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum c {
        BIDDERS,
        WATERFALL,
        COUNT
    }

    public d7() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    @Override // com.applovin.impl.n3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f3966a;
    }

    public void initialize(List<u2> list, List<u2> list2, com.applovin.impl.sdk.k kVar) {
        this.f3966a = kVar;
        this.f3967b = list;
        this.f3968c = list2;
        this.f3970e = a(list);
        this.f3971f = a(list2);
        a aVar = new a(this);
        this.f3969d = aVar;
        aVar.a(new z8(this, kVar));
        this.f3969d.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Live Network");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.g = listView;
        listView.setAdapter((ListAdapter) this.f3969d);
    }

    @Override // com.applovin.impl.n3, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f3970e = a(this.f3967b);
        this.f3971f = a(this.f3968c);
        this.f3969d.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.k kVar, j2 j2Var, r2 r2Var) {
        List listB = a(j2Var).b();
        if (listB.equals(kVar.s0().b())) {
            kVar.s0().a((List) null);
        } else {
            kVar.s0().a(listB);
        }
        this.f3969d.notifyDataSetChanged();
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            u2 u2Var = (u2) it.next();
            arrayList.add(new b(u2Var.d(), this, u2Var));
        }
        return arrayList;
    }

    private u2 a(j2 j2Var) {
        if (j2Var.b() == c.BIDDERS.ordinal()) {
            return (u2) this.f3967b.get(j2Var.a());
        }
        return (u2) this.f3968c.get(j2Var.a());
    }
}
