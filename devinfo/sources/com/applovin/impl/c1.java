package com.applovin.impl;

import android.app.Activity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity;
import com.applovin.impl.d;
import com.applovin.impl.d1;
import com.applovin.impl.s2;
import com.applovin.sdk.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class c1 extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private d1 f3802a;

    /* renamed from: b, reason: collision with root package name */
    private FrameLayout f3803b;

    /* renamed from: c, reason: collision with root package name */
    private ListView f3804c;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a implements s2.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f3805a;

        /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
        /* renamed from: com.applovin.impl.c1$a$a, reason: collision with other inner class name */
        public class C0008a implements d.b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j2 f3807a;

            public C0008a(j2 j2Var) {
                this.f3807a = j2Var;
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
                maxCreativeDebuggerDisplayedAdActivity.a((q1) c1.this.f3802a.d().get(this.f3807a.a()), c1.this.f3802a.e());
            }
        }

        public a(c cVar) {
            this.f3805a = cVar;
        }

        @Override // com.applovin.impl.s2.a
        public void a(j2 j2Var, r2 r2Var) {
            if (j2Var.b() != d1.a.RECENT_ADS.ordinal()) {
                return;
            }
            d.a(c1.this, MaxCreativeDebuggerDisplayedAdActivity.class, this.f3805a, new C0008a(j2Var));
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Creative Debugger");
        setContentView(R.layout.mediation_debugger_list_view);
        this.f3803b = (FrameLayout) findViewById(android.R.id.content);
        this.f3804c = (ListView) findViewById(R.id.listView);
        e8.a(this.f3803b, com.applovin.impl.sdk.k.C0);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        d1 d1Var = this.f3802a;
        if (d1Var != null) {
            d1Var.a((s2.a) null);
            this.f3802a.g();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        d1 d1Var = this.f3802a;
        if (d1Var == null) {
            finish();
            return;
        }
        this.f3804c.setAdapter((ListAdapter) d1Var);
        d1 d1Var2 = this.f3802a;
        if (d1Var2 != null && !d1Var2.e().y().g()) {
            a(R.string.applovin_creative_debugger_disabled_text);
            return;
        }
        d1 d1Var3 = this.f3802a;
        if (d1Var3 == null || !d1Var3.f()) {
            return;
        }
        a(R.string.applovin_creative_debugger_no_ads_text);
    }

    public void a(d1 d1Var, c cVar) {
        this.f3802a = d1Var;
        d1Var.a(new a(cVar));
    }

    private void a(int i4) {
        TextView textView = new TextView(this);
        textView.setGravity(17);
        textView.setTextSize(18.0f);
        textView.setText(i4);
        this.f3803b.addView(textView, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f3803b.bringChildToFront(textView);
    }
}
