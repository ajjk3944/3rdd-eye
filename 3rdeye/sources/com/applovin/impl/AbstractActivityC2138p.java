package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.j2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxDebuggerAdUnitWaterfallsListActivity;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.applovin.impl.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC2138p extends d3 {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f20640a;

    /* renamed from: b, reason: collision with root package name */
    private k2 f20641b;

    /* renamed from: c, reason: collision with root package name */
    private List f20642c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f20643d;

    /* renamed from: e, reason: collision with root package name */
    private ListView f20644e;

    /* renamed from: com.applovin.impl.p$a */
    public class a extends k2 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f20645e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list) {
            super(context);
            this.f20645e = list;
        }

        @Override // com.applovin.impl.k2
        public int b() {
            return 1;
        }

        @Override // com.applovin.impl.k2
        public List c(int i) {
            return AbstractActivityC2138p.this.f20642c;
        }

        @Override // com.applovin.impl.k2
        public int d(int i) {
            return this.f20645e.size();
        }

        @Override // com.applovin.impl.k2
        public j2 e(int i) {
            return new j4("");
        }
    }

    @Override // com.applovin.impl.d3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f20640a;
    }

    public void initialize(List<C2131m> list, boolean z10, com.applovin.impl.sdk.k kVar) {
        this.f20643d = z10;
        this.f20640a = kVar;
        this.f20642c = a(list);
        a aVar = new a(this, list);
        this.f20641b = aVar;
        aVar.a(new V7.a(this, list, kVar, 2));
        this.f20641b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.d3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle((this.f20643d ? "Selective Init " : "").concat("Ad Units"));
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f20644e = listView;
        listView.setAdapter((ListAdapter) this.f20641b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, com.applovin.impl.sdk.k kVar, d2 d2Var, j2 j2Var) {
        C2131m c2131m = (C2131m) list.get(d2Var.a());
        if (c2131m.g().size() == 1) {
            AbstractC2113d.a(this, MaxDebuggerAdUnitDetailActivity.class, kVar.e(), new B.i(7, c2131m, kVar));
        } else {
            AbstractC2113d.a(this, MaxDebuggerAdUnitWaterfallsListActivity.class, kVar.e(), new C.e0(6, c2131m, kVar));
        }
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2131m c2131m = (C2131m) it.next();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ID\t\t\t\t\t\t", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(c2131m.c(), -16777216));
            spannableStringBuilder.append((CharSequence) new SpannedString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("FORMAT  ", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(c2131m.b(), -16777216));
            arrayList.add(j2.a(j2.c.DETAIL).b(StringUtils.createSpannedString(c2131m.d(), -16777216, 18, 1)).a(new SpannedString(spannableStringBuilder)).a(this).a(true).a());
        }
        return arrayList;
    }
}
