package com.lefan.base.activity;

import F4.d;
import a4.p;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import c.AbstractC0391p;
import com.apm.insight.R;
import com.google.android.material.appbar.AppBarLayout;
import h.AbstractActivityC2349g;
import q5.i;
import u4.ViewOnClickListenerC2957b;

/* loaded from: classes.dex */
public final class HelpActivity extends AbstractActivityC2349g {

    /* renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ int f18755O = 0;

    @Override // h.AbstractActivityC2349g, c.AbstractActivityC0389n, G.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        AbstractC0391p.a(this);
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_help, (ViewGroup) null, false);
        int i = R.id.appbar;
        if (((AppBarLayout) p.e(R.id.appbar, viewInflate)) != null) {
            if (((FrameLayout) p.e(R.id.help_frame, viewInflate)) == null) {
                i = R.id.help_frame;
            } else if (((Toolbar) p.e(R.id.help_tool_bar, viewInflate)) == null) {
                i = R.id.help_tool_bar;
            } else {
                if (((NestedScrollView) p.e(R.id.scrollView_help, viewInflate)) != null) {
                    setContentView((LinearLayoutCompat) viewInflate);
                    View viewFindViewById = findViewById(R.id.appbar);
                    i.d(viewFindViewById, "findViewById(...)");
                    View viewFindViewById2 = findViewById(R.id.scrollView_help);
                    i.d(viewFindViewById2, "findViewById(...)");
                    d.a(viewFindViewById, viewFindViewById2);
                    Toolbar toolbar = (Toolbar) findViewById(R.id.help_tool_bar);
                    B(toolbar);
                    com.bumptech.glide.d dVarR = r();
                    if (dVarR != null) {
                        dVarR.S(true);
                    }
                    toolbar.setNavigationOnClickListener(new ViewOnClickListenerC2957b(this, 1));
                    toolbar.setTitle(getIntent().getStringExtra("help_name"));
                    FrameLayout frameLayout = (FrameLayout) findViewById(R.id.help_frame);
                    if (frameLayout != null) {
                        frameLayout.removeAllViews();
                    }
                    int intExtra = getIntent().getIntExtra("help_layout", R.layout.activity_help);
                    if (frameLayout != null) {
                        frameLayout.addView(LayoutInflater.from(this).inflate(intExtra, (ViewGroup) null));
                        return;
                    }
                    return;
                }
                i = R.id.scrollView_help;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
