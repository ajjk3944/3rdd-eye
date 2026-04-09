package com.lefan.signal.ui.wifi;

import B4.g;
import F4.d;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import c.AbstractC0391p;
import com.apm.insight.R;
import h.AbstractActivityC2349g;
import q5.i;

/* loaded from: classes.dex */
public final class SquatterHelpActivity extends AbstractActivityC2349g {

    /* renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ int f19378O = 0;

    @Override // h.AbstractActivityC2349g, c.AbstractActivityC0389n, G.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        AbstractC0391p.a(this);
        super.onCreate(bundle);
        setContentView(R.layout.activity_squatter_help);
        View viewFindViewById = findViewById(R.id.app_bar);
        i.d(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = findViewById(R.id.squatter_help_scroll_view);
        i.d(viewFindViewById2, "findViewById(...)");
        d.a(viewFindViewById, viewFindViewById2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.squatter_help_toolbar);
        B(toolbar);
        com.bumptech.glide.d dVarR = r();
        if (dVarR != null) {
            dVarR.S(true);
        }
        toolbar.setNavigationOnClickListener(new g(23, this));
    }
}
