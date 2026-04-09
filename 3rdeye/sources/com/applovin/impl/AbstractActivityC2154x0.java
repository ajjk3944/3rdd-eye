package com.applovin.impl;

import android.app.Activity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity;
import com.applovin.impl.AbstractC2113d;
import com.applovin.impl.C2156y0;
import com.applovin.impl.k2;
import com.applovin.sdk.R;

/* renamed from: com.applovin.impl.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC2154x0 extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private C2156y0 f21712a;

    /* renamed from: b, reason: collision with root package name */
    private FrameLayout f21713b;

    /* renamed from: c, reason: collision with root package name */
    private ListView f21714c;

    /* renamed from: com.applovin.impl.x0$a */
    public class a implements k2.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2111c f21715a;

        /* renamed from: com.applovin.impl.x0$a$a, reason: collision with other inner class name */
        public class C0324a implements AbstractC2113d.b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d2 f21717a;

            public C0324a(d2 d2Var) {
                this.f21717a = d2Var;
            }

            @Override // com.applovin.impl.AbstractC2113d.b
            public void a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
                maxCreativeDebuggerDisplayedAdActivity.a((l1) AbstractActivityC2154x0.this.f21712a.d().get(this.f21717a.a()), AbstractActivityC2154x0.this.f21712a.e());
            }
        }

        public a(C2111c c2111c) {
            this.f21715a = c2111c;
        }

        @Override // com.applovin.impl.k2.a
        public void a(d2 d2Var, j2 j2Var) {
            if (d2Var.b() != C2156y0.a.RECENT_ADS.ordinal()) {
                return;
            }
            AbstractC2113d.a(AbstractActivityC2154x0.this, MaxCreativeDebuggerDisplayedAdActivity.class, this.f21715a, new C0324a(d2Var));
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Creative Debugger");
        setContentView(R.layout.mediation_debugger_list_view);
        this.f21713b = (FrameLayout) findViewById(android.R.id.content);
        this.f21714c = (ListView) findViewById(R.id.listView);
        r7.a(this.f21713b, com.applovin.impl.sdk.k.f21161C0);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C2156y0 c2156y0 = this.f21712a;
        if (c2156y0 != null) {
            c2156y0.a((k2.a) null);
            this.f21712a.g();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        C2156y0 c2156y0 = this.f21712a;
        if (c2156y0 == null) {
            finish();
            return;
        }
        this.f21714c.setAdapter((ListAdapter) c2156y0);
        C2156y0 c2156y02 = this.f21712a;
        if (c2156y02 != null && !c2156y02.e().z().g()) {
            a(R.string.applovin_creative_debugger_disabled_text);
            return;
        }
        C2156y0 c2156y03 = this.f21712a;
        if (c2156y03 == null || !c2156y03.f()) {
            return;
        }
        a(R.string.applovin_creative_debugger_no_ads_text);
    }

    public void a(C2156y0 c2156y0, C2111c c2111c) {
        this.f21712a = c2156y0;
        c2156y0.a(new a(c2111c));
    }

    private void a(int i) {
        TextView textView = new TextView(this);
        textView.setGravity(17);
        textView.setTextSize(18.0f);
        textView.setText(i);
        this.f21713b.addView(textView, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f21713b.bringChildToFront(textView);
    }
}
