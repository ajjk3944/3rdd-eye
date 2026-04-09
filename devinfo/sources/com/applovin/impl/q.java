package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.d;
import com.applovin.impl.r2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxDebuggerAdUnitWaterfallsListActivity;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class q extends n3 {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f5126a;

    /* renamed from: b, reason: collision with root package name */
    private s2 f5127b;

    /* renamed from: c, reason: collision with root package name */
    private List f5128c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f5129d;

    /* renamed from: e, reason: collision with root package name */
    private ListView f5130e;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a extends s2 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f5131e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list) {
            super(context);
            this.f5131e = list;
        }

        @Override // com.applovin.impl.s2
        public int b() {
            return 1;
        }

        @Override // com.applovin.impl.s2
        public List c(int i4) {
            return q.this.f5128c;
        }

        @Override // com.applovin.impl.s2
        public int d(int i4) {
            return this.f5131e.size();
        }

        @Override // com.applovin.impl.s2
        public r2 e(int i4) {
            return new v4("");
        }
    }

    @Override // com.applovin.impl.n3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f5126a;
    }

    public void initialize(List<n> list, boolean z3, com.applovin.impl.sdk.k kVar) {
        this.f5129d = z3;
        this.f5126a = kVar;
        this.f5128c = a(list);
        a aVar = new a(this, list);
        this.f5127b = aVar;
        aVar.a(new ah.d(this, list, kVar, 5));
        this.f5127b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle((this.f5129d ? "Selective Init " : "").concat("Ad Units"));
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f5130e = listView;
        listView.setAdapter((ListAdapter) this.f5127b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, final com.applovin.impl.sdk.k kVar, j2 j2Var, r2 r2Var) {
        final n nVar = (n) list.get(j2Var.a());
        if (nVar.g().size() == 1) {
            final int i4 = 0;
            d.a(this, MaxDebuggerAdUnitDetailActivity.class, kVar.e(), new d.b() { // from class: com.applovin.impl.ba
                @Override // com.applovin.impl.d.b
                public final void a(Activity activity) {
                    switch (i4) {
                        case 0:
                            ((MaxDebuggerAdUnitDetailActivity) activity).initialize(nVar, null, null, kVar);
                            break;
                        default:
                            ((MaxDebuggerAdUnitWaterfallsListActivity) activity).initialize(nVar, kVar);
                            break;
                    }
                }
            });
        } else {
            final int i10 = 1;
            d.a(this, MaxDebuggerAdUnitWaterfallsListActivity.class, kVar.e(), new d.b() { // from class: com.applovin.impl.ba
                @Override // com.applovin.impl.d.b
                public final void a(Activity activity) {
                    switch (i10) {
                        case 0:
                            ((MaxDebuggerAdUnitDetailActivity) activity).initialize(nVar, null, null, kVar);
                            break;
                        default:
                            ((MaxDebuggerAdUnitWaterfallsListActivity) activity).initialize(nVar, kVar);
                            break;
                    }
                }
            });
        }
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ID\t\t\t\t\t\t", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(nVar.c(), -16777216));
            spannableStringBuilder.append((CharSequence) new SpannedString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("FORMAT  ", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(nVar.b(), -16777216));
            arrayList.add(r2.a(r2.c.DETAIL).b(StringUtils.createSpannedString(nVar.d(), -16777216, 18, 1)).a(new SpannedString(spannableStringBuilder)).a(this).a(true).a());
        }
        return arrayList;
    }
}
