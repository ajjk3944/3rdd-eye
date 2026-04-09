package com.liuzh.deviceinfo.pro;

import ah.c;
import ah.e;
import ah.n;
import ah.o;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.view.SimpleShimmerLayout;
import d.m;
import e4.m0;
import e4.v0;
import hg.a;
import java.util.WeakHashMap;
import si.d;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class ProActivity extends a implements n {
    public static final /* synthetic */ int L = 0;
    public TextView B;
    public SimpleShimmerLayout C;
    public d D;
    public TextView E;
    public TextView F;
    public View G;
    public TextView H;
    public TextView I;
    public View J;
    public final e K = new e(this);

    public static void D(Context context) {
        o.f400d.getClass();
        boolean z3 = mg.d.f29372a;
        context.startActivity(new Intent(context, (Class<?>) ProActivity.class));
    }

    @Override // ah.n
    public final void i(boolean z3) {
        if (z3) {
            this.J.setVisibility(8);
            this.B.setVisibility(8);
        }
        this.C.a(!z3);
        this.G.setVisibility(z3 ? 8 : 0);
        this.I.setVisibility(z3 ? 8 : 0);
        findViewById(R.id.flag).setVisibility(z3 ? 8 : 0);
        findViewById(R.id.unlocked_pro).setVisibility(z3 ? 0 : 8);
        ((TextView) findViewById(R.id.title)).setText(z3 ? R.string.pro_version_activaed : R.string.upgrade_to_pro_version);
    }

    @Override // hg.a, i.g, d.j, r3.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m.a(this);
        setContentView(R.layout.activity_pro);
        this.C = (SimpleShimmerLayout) findViewById(R.id.btn_pay_container);
        TextView textView = (TextView) findViewById(R.id.btn_pay);
        this.I = textView;
        int i4 = 0;
        textView.setOnClickListener(new c(this, i4));
        View viewFindViewById = findViewById(R.id.sku_item);
        this.G = viewFindViewById;
        this.E = (TextView) viewFindViewById.findViewById(R.id.price);
        TextView textView2 = (TextView) this.G.findViewById(R.id.ori_price);
        this.F = textView2;
        TextPaint paint = textView2.getPaint();
        paint.setFlags(paint.getFlags() | 16);
        this.H = (TextView) this.G.findViewById(R.id.sku_name);
        TextView textView3 = (TextView) findViewById(R.id.restore);
        this.B = textView3;
        TextPaint paint2 = textView3.getPaint();
        paint2.setFlags(paint2.getFlags() | 8);
        this.B.setOnClickListener(new c(this, 1));
        View viewFindViewById2 = findViewById(R.id.close);
        viewFindViewById2.setOnClickListener(new c(this, 2));
        this.J = findViewById(R.id.progressBar);
        o oVar = o.f400d;
        if (oVar.c()) {
            this.J.setVisibility(8);
        } else {
            this.J.setVisibility(0);
            this.E.setText("");
            this.F.setText("");
            this.H.setText("");
            this.I.setText(R.string.pay_now);
            int i10 = 3;
            this.I.setOnClickListener(new c(this, i10));
            oVar.e(this, new o7.d(i10, this));
        }
        i(oVar.c());
        oVar.b(this);
        View viewFindViewById3 = findViewById(R.id.scroll_view);
        ah.d dVar = new ah.d(this, viewFindViewById2, viewFindViewById3, i4);
        WeakHashMap weakHashMap = v0.f22405a;
        m0.j(viewFindViewById3, dVar);
    }

    @Override // i.g, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        o.f400d.h(this);
    }

    @Override // hg.a, i.g, android.app.Activity
    public final void onPause() {
        super.onPause();
        SimpleShimmerLayout simpleShimmerLayout = this.C;
        if (simpleShimmerLayout != null) {
            simpleShimmerLayout.a(false);
        }
    }

    @Override // hg.a, i.g, android.app.Activity
    public final void onResume() {
        super.onResume();
        SimpleShimmerLayout simpleShimmerLayout = this.C;
        if (simpleShimmerLayout != null) {
            simpleShimmerLayout.a(!o.f400d.c());
        }
    }
}
