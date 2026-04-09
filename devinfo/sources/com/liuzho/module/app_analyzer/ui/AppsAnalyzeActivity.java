package com.liuzho.module.app_analyzer.ui;

import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import i.g;
import i0.f;
import ig.e;
import jg.n;
import km.o;
import km.y;
import o7.d;
import uj.a;
import v3.b;
import wj.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class AppsAnalyzeActivity extends g implements a {
    public static final /* synthetic */ int S = 0;
    public TextView A;
    public View B;
    public RecyclerView C;
    public e D;
    public o F;
    public Spinner H;
    public FrameLayout I;
    public k J;
    public n.a K;
    public final z2.k M;
    public Toolbar N;
    public f O;
    public boolean P;
    public b Q;
    public boolean R;
    public final AppsAnalyzeActivity E = this;
    public int G = 2;
    public final int L = 1;

    public AppsAnalyzeActivity() {
        d dVar = ii.a.f26002b;
        nk.k.b(dVar);
        this.M = (z2.k) dVar.f30421b;
        this.P = false;
        this.R = false;
    }

    @Override // d.j, android.app.Activity
    public final void onBackPressed() {
        if (this.I.getChildCount() != 0) {
            this.I.removeAllViews();
            return;
        }
        if (this.O == null || !this.P) {
            super.onBackPressed();
            return;
        }
        this.f32744a.a(new n(6, this));
        this.O.T(this, new y(26, this));
        this.O = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0146  */
    @Override // i.g, d.j, r3.g, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liuzho.module.app_analyzer.ui.AppsAnalyzeActivity.onCreate(android.os.Bundle):void");
    }

    @Override // i.g, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        n.a aVar = this.K;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
