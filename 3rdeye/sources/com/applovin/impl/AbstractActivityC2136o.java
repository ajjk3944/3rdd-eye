package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.j2;
import com.applovin.impl.k2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxDebuggerWaterfallSegmentsActivity;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.impl.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC2136o extends d3 {

    /* renamed from: a, reason: collision with root package name */
    private C2131m f20606a;

    /* renamed from: b, reason: collision with root package name */
    private com.applovin.impl.sdk.k f20607b;

    /* renamed from: c, reason: collision with root package name */
    private k2 f20608c;

    /* renamed from: com.applovin.impl.o$a */
    public class a extends k2 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C2131m f20609e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, C2131m c2131m) {
            super(context);
            this.f20609e = c2131m;
        }

        @Override // com.applovin.impl.k2
        public int b() {
            return this.f20609e.g().size();
        }

        @Override // com.applovin.impl.k2
        public List c(int i) {
            ArrayList arrayList = new ArrayList();
            C2134n c2134n = (C2134n) this.f20609e.g().get(i);
            arrayList.add(AbstractActivityC2136o.this.c(c2134n.c()));
            if (c2134n.b() != null) {
                arrayList.add(AbstractActivityC2136o.this.a("AB Test Experiment Name", c2134n.b()));
            }
            x7 x7VarD = c2134n.d();
            AbstractActivityC2136o abstractActivityC2136o = AbstractActivityC2136o.this;
            arrayList.add(abstractActivityC2136o.a("Device ID Targeting", abstractActivityC2136o.a(x7VarD.a())));
            AbstractActivityC2136o abstractActivityC2136o2 = AbstractActivityC2136o.this;
            arrayList.add(abstractActivityC2136o2.a("Device Type Targeting", abstractActivityC2136o2.b(x7VarD.b())));
            if (x7VarD.c() != null) {
                arrayList.add(AbstractActivityC2136o.this.a(x7VarD.c()));
            }
            return arrayList;
        }

        @Override // com.applovin.impl.k2
        public int d(int i) {
            C2134n c2134n = (C2134n) this.f20609e.g().get(i);
            return (c2134n.b() != null ? 1 : 0) + 3 + (c2134n.d().c() != null ? 1 : 0);
        }

        @Override // com.applovin.impl.k2
        public j2 e(int i) {
            return i == b.TARGETED_WATERFALL.ordinal() ? new j4("TARGETED WATERFALL FOR CURRENT DEVICE") : i == b.OTHER_WATERFALLS.ordinal() ? new j4("OTHER WATERFALLS") : new j4("");
        }
    }

    /* renamed from: com.applovin.impl.o$b */
    public enum b {
        TARGETED_WATERFALL,
        OTHER_WATERFALLS
    }

    @Override // com.applovin.impl.d3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f20607b;
    }

    public void initialize(C2131m c2131m, com.applovin.impl.sdk.k kVar) {
        this.f20606a = c2131m;
        this.f20607b = kVar;
        a aVar = new a(this, c2131m);
        this.f20608c = aVar;
        aVar.a(new V7.a(this, kVar, c2131m, 1));
        this.f20608c.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.d3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle(this.f20606a.d());
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter((ListAdapter) this.f20608c);
        listView.setDividerHeight(0);
    }

    @Override // com.applovin.impl.d3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        k2 k2Var = this.f20608c;
        if (k2Var != null) {
            k2Var.a((k2.a) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(String str) {
        if (str.equals("phone")) {
            return "Phones";
        }
        if (str.equals("tablet")) {
            return "Tablets";
        }
        return "All";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public j2 c(String str) {
        return j2.a(j2.c.RIGHT_DETAIL).b(StringUtils.createSpannedString(str, -16777216, 18, 1)).a(this).a(true).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.k kVar, C2131m c2131m, d2 d2Var, j2 j2Var) {
        if (d2Var.a() == 0) {
            AbstractC2113d.a(this, MaxDebuggerAdUnitDetailActivity.class, kVar.e(), new A0(c2131m, d2Var, kVar));
        } else {
            AbstractC2113d.a(this, MaxDebuggerWaterfallSegmentsActivity.class, kVar.e(), new D3.b(c2131m, d2Var, kVar, 7));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(C2131m c2131m, d2 d2Var, com.applovin.impl.sdk.k kVar, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(c2131m, (C2134n) c2131m.g().get(d2Var.b()), null, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(C2131m c2131m, d2 d2Var, com.applovin.impl.sdk.k kVar, MaxDebuggerWaterfallSegmentsActivity maxDebuggerWaterfallSegmentsActivity) {
        C2134n c2134n = (C2134n) c2131m.g().get(d2Var.b());
        maxDebuggerWaterfallSegmentsActivity.initialize(c2134n.c(), c2134n.d().c(), kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public j2 a(String str, String str2) {
        return j2.a(j2.c.RIGHT_DETAIL).d(str).c(str2).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public j2 a(List list) {
        return j2.a(j2.c.DETAIL).d("Segment Targeting").a(StringUtils.createSpannedString(list.size() + " segment group(s)", -7829368, 14)).a(this).a(true).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        if (str.equals("idfa")) {
            return "IDFA Only";
        }
        if (str.equals("dnt")) {
            return "No IDFA Only";
        }
        return "All";
    }
}
