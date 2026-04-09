package com.liuzho.lib.fileanalyzer.activity;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.f1;
import com.bumptech.glide.p;
import com.google.android.gms.internal.measurement.d5;
import com.liuzh.deviceinfo.R;
import d.m;
import e4.d2;
import e4.e2;
import e4.f2;
import e4.h2;
import e4.m0;
import e4.v0;
import i.g;
import java.io.File;
import java.util.WeakHashMap;
import nk.k;
import o7.c;
import pd.b;
import vk.i;
import wb.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class PicPreviewActivity extends g implements View.OnClickListener {
    public static final /* synthetic */ int C = 0;
    public f1 A;
    public String B;

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        k.e(view, "v");
        f1 f1Var = this.A;
        if (f1Var == null) {
            k.k("binding");
            throw null;
        }
        if (!view.equals((ImageView) f1Var.f1137e)) {
            f1 f1Var2 = this.A;
            if (f1Var2 == null) {
                k.k("binding");
                throw null;
            }
            if (view.equals((ImageView) f1Var2.f1136d)) {
                String str = this.B;
                if (str != null) {
                    b.t(this, new File(str));
                    return;
                } else {
                    k.k("imgPath");
                    throw null;
                }
            }
            return;
        }
        f1 f1Var3 = this.A;
        if (f1Var3 == null) {
            k.k("binding");
            throw null;
        }
        boolean z3 = ((Toolbar) f1Var3.f1138f).getVisibility() == 0;
        f1 f1Var4 = this.A;
        if (f1Var4 == null) {
            k.k("binding");
            throw null;
        }
        ((Toolbar) f1Var4.f1138f).setVisibility(!z3 ? 0 : 8);
        f1 f1Var5 = this.A;
        if (f1Var5 == null) {
            k.k("binding");
            throw null;
        }
        ((FrameLayout) f1Var5.f1135c).setVisibility(z3 ? 8 : 0);
        Window window = getWindow();
        c cVar = new c(getWindow().getDecorView());
        int i4 = Build.VERSION.SDK_INT;
        d5 h2Var = i4 >= 35 ? new h2(window, cVar) : i4 >= 30 ? new f2(window, cVar) : i4 >= 26 ? new e2(window, cVar) : new d2(window, cVar);
        if (z3) {
            h2Var.n();
        } else {
            h2Var.x(519);
        }
    }

    @Override // i.g, d.j, r3.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        getWindow().requestFeature(1);
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("arg_img_path");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.B = stringExtra;
        if (i.H0(stringExtra)) {
            finish();
            return;
        }
        m.a(this);
        View viewInflate = getLayoutInflater().inflate(R.layout.fa_activity_pic_preview, (ViewGroup) null, false);
        int i4 = R.id.bottom_btn_container;
        FrameLayout frameLayout = (FrameLayout) e.s(R.id.bottom_btn_container, viewInflate);
        if (frameLayout != null) {
            i4 = R.id.iv_info;
            ImageView imageView = (ImageView) e.s(R.id.iv_info, viewInflate);
            if (imageView != null) {
                i4 = R.id.iv_preview;
                ImageView imageView2 = (ImageView) e.s(R.id.iv_preview, viewInflate);
                if (imageView2 != null) {
                    i4 = R.id.toolbar;
                    Toolbar toolbar = (Toolbar) e.s(R.id.toolbar, viewInflate);
                    if (toolbar != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        this.A = new f1(constraintLayout, frameLayout, imageView, imageView2, toolbar, 9);
                        setContentView(constraintLayout);
                        Window window = getWindow();
                        c cVar = new c(getWindow().getDecorView());
                        int i10 = Build.VERSION.SDK_INT;
                        d5 h2Var = i10 >= 35 ? new h2(window, cVar) : i10 >= 30 ? new f2(window, cVar) : i10 >= 26 ? new e2(window, cVar) : new d2(window, cVar);
                        h2Var.w(false);
                        h2Var.v(false);
                        f1 f1Var = this.A;
                        if (f1Var == null) {
                            k.k("binding");
                            throw null;
                        }
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) f1Var.f1134b;
                        ca.b bVar = new ca.b(10, this);
                        WeakHashMap weakHashMap = v0.f22405a;
                        m0.j(constraintLayout2, bVar);
                        p pVarD = com.bumptech.glide.b.a(this).f6474e.d(this);
                        String str = this.B;
                        if (str == null) {
                            k.k("imgPath");
                            throw null;
                        }
                        com.bumptech.glide.m mVarC = pVarD.i(Drawable.class).C(new File(str));
                        f1 f1Var2 = this.A;
                        if (f1Var2 == null) {
                            k.k("binding");
                            throw null;
                        }
                        mVarC.z((ImageView) f1Var2.f1137e);
                        f1 f1Var3 = this.A;
                        if (f1Var3 == null) {
                            k.k("binding");
                            throw null;
                        }
                        ((ImageView) f1Var3.f1137e).setOnClickListener(this);
                        f1 f1Var4 = this.A;
                        if (f1Var4 == null) {
                            k.k("binding");
                            throw null;
                        }
                        z((Toolbar) f1Var4.f1138f);
                        wd.b bVarR = r();
                        if (bVarR != null) {
                            bVarR.Q(true);
                        }
                        setTitle("");
                        f1 f1Var5 = this.A;
                        if (f1Var5 != null) {
                            ((ImageView) f1Var5.f1136d).setOnClickListener(this);
                            return;
                        } else {
                            k.k("binding");
                            throw null;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        k.e(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
