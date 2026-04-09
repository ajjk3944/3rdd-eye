package com.liuzh.deviceinfo.splash;

import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import bi.d;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.material.button.MaterialButton;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.splash.SplashActivity;
import com.liuzh.deviceinfo.view.StarAnimView;
import e4.m0;
import e4.v0;
import hg.a;
import i0.f;
import ig.l;
import j$.util.Objects;
import java.io.IOException;
import java.util.Locale;
import java.util.Random;
import java.util.WeakHashMap;
import je.u;
import km.i;
import km.n;
import km.y;
import mg.c;
import org.xmlpull.v1.XmlPullParserException;
import rh.b;
import rh.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class SplashActivity extends a {
    public static final /* synthetic */ int K = 0;
    public StarAnimView B;
    public FrameLayout D;
    public f E;
    public c F;
    public n.a G;
    public b H;
    public final Handler C = new Handler(Looper.getMainLooper());
    public boolean I = false;
    public boolean J = false;

    public static void D(SplashActivity splashActivity) {
        int i4;
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) DeviceInfoApp.f21145f.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            i4 = 1200;
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis();
            cg.a.f2848b.f(r5.c.g("action", "load"), "ad_splash");
            u.k(splashActivity, new e(splashActivity, jCurrentTimeMillis, 0), ag.a.b("ca-app-pub-3724073793374078/3545651850"));
            i4 = 22000;
        }
        splashActivity.E(i4, false);
    }

    public final void E(long j, boolean z3) {
        Objects.toString(new Exception().getStackTrace()[1]);
        Handler handler = this.C;
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(new b(this, z3, 0), j);
    }

    public final void F(boolean z3) {
        this.C.removeCallbacksAndMessages(null);
        this.H = null;
        b bVar = new b(this, z3, 2);
        f fVar = this.E;
        if (fVar == null) {
            bVar.run();
            return;
        }
        fVar.T(this, new n(this, false, bVar, 15));
        this.E = null;
    }

    @Override // hg.a, i.g, d.j, r3.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        toString();
        Objects.toString(bundle);
        a4.a.C(this);
        if ("notification".equalsIgnoreCase(getIntent().getStringExtra("from"))) {
            cg.a.f2848b.f(null, "splash_by_noti");
        }
        this.F = new c(this);
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        final int i4 = 0;
        if (com.liuzh.deviceinfo.utilities.f.f()) {
            int i10 = 15;
            if (getIntent().getBooleanExtra("delay_finish", false)) {
                setContentView(R.layout.activity_splash);
                findViewById(R.id.progressBar).setVisibility(4);
                d.a(new l(i10, this), 800L);
                return;
            }
            setContentView(R.layout.activity_splash_ad);
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.bottom_container);
            ImageView imageView = (ImageView) findViewById(R.id.iv_bg);
            TextView textView = (TextView) findViewById(R.id.android_version);
            rh.d dVar = new rh.d(imageView, textView);
            if (com.liuzh.deviceinfo.utilities.l.Z()) {
                if (com.liuzh.deviceinfo.utilities.f.h()) {
                    imageView.setImageResource(R.drawable.img_harmony_os_white);
                } else {
                    imageView.setImageResource(R.drawable.img_harmony_os_black);
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                marginLayoutParams.height = -2;
                imageView.setLayoutParams(marginLayoutParams);
                d.c(new k1.b(10, dVar, textView));
            } else {
                dVar.run();
            }
            if (com.liuzh.deviceinfo.utilities.f.g()) {
                E(new Random().nextInt(TTAdConstant.MATE_VALID) + 300, false);
            } else {
                this.F.a(this, new y(i10, this));
            }
            View viewFindViewById = findViewById(R.id.root_container);
            i iVar = new i(16, viewGroup);
            WeakHashMap weakHashMap = v0.f22405a;
            m0.j(viewFindViewById, iVar);
            return;
        }
        setContentView(R.layout.activity_splash);
        this.D = (FrameLayout) findViewById(R.id.bottom_container);
        this.B = (StarAnimView) findViewById(R.id.star_anim_view);
        boolean z3 = com.liuzh.deviceinfo.utilities.d.f21252a;
        Locale locale = Locale.getDefault();
        if (!"cn".equalsIgnoreCase(locale.getCountry())) {
            "zh".equalsIgnoreCase(locale.getLanguage());
        }
        final int i11 = 1;
        LayoutInflater.from(this).inflate(R.layout.splash_bottom_button, (ViewGroup) this.D, true);
        boolean zU = ci.b.u();
        final boolean z10 = !zU;
        TextView textView2 = (TextView) findViewById(R.id.privacy_policy);
        TextView textView3 = (TextView) findViewById(R.id.term_of_service);
        TextPaint paint = textView2.getPaint();
        paint.setFlags(paint.getFlags() | 8);
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: rh.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SplashActivity f32948b;

            {
                this.f32948b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = i4;
                SplashActivity splashActivity = this.f32948b;
                switch (i12) {
                    case 0:
                        com.liuzh.deviceinfo.utilities.d.n(splashActivity);
                        break;
                    case 1:
                        com.liuzh.deviceinfo.utilities.d.o(splashActivity);
                        break;
                    default:
                        int i13 = SplashActivity.K;
                        splashActivity.finish();
                        break;
                }
            }
        });
        TextPaint paint2 = textView3.getPaint();
        paint2.setFlags(paint2.getFlags() | 8);
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: rh.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SplashActivity f32948b;

            {
                this.f32948b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = i11;
                SplashActivity splashActivity = this.f32948b;
                switch (i12) {
                    case 0:
                        com.liuzh.deviceinfo.utilities.d.n(splashActivity);
                        break;
                    case 1:
                        com.liuzh.deviceinfo.utilities.d.o(splashActivity);
                        break;
                    default:
                        int i13 = SplashActivity.K;
                        splashActivity.finish();
                        break;
                }
            }
        });
        View viewFindViewById2 = findViewById(R.id.action_exit);
        final int i12 = 2;
        viewFindViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: rh.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SplashActivity f32948b;

            {
                this.f32948b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i122 = i12;
                SplashActivity splashActivity = this.f32948b;
                switch (i122) {
                    case 0:
                        com.liuzh.deviceinfo.utilities.d.n(splashActivity);
                        break;
                    case 1:
                        com.liuzh.deviceinfo.utilities.d.o(splashActivity);
                        break;
                    default:
                        int i13 = SplashActivity.K;
                        splashActivity.finish();
                        break;
                }
            }
        });
        final MaterialButton materialButton = (MaterialButton) findViewById(R.id.button);
        if ("fr".equalsIgnoreCase(Locale.getDefault().getLanguage())) {
            ((TextView) findViewById(R.id.installed_apps)).setTextSize(12.0f);
            textView2.setTextSize(11.4f);
            textView3.setTextSize(11.4f);
        }
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: rh.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws XmlPullParserException, Resources.NotFoundException, IOException {
                int i13 = SplashActivity.K;
                materialButton.setEnabled(false);
                com.liuzh.deviceinfo.utilities.f fVar2 = com.liuzh.deviceinfo.utilities.f.f21256b;
                com.liuzh.deviceinfo.utilities.f.f21257c.edit().putBoolean("agree_privacy_policy", true).apply();
                DeviceInfoApp.f21145f.b();
                SplashActivity splashActivity = this.f32952a;
                ViewGroup viewGroup2 = (ViewGroup) splashActivity.findViewById(R.id.bottom_container);
                viewGroup2.animate().alpha(0.0f).setDuration(400L).setListener(new od.b(splashActivity, z10, viewGroup2)).start();
                splashActivity.findViewById(R.id.progressBar).animate().alpha(1.0f).start();
            }
        });
        if (com.liuzh.deviceinfo.utilities.d.k()) {
            materialButton.setFocusable(true);
            com.liuzh.deviceinfo.utilities.y.k(materialButton, textView3, textView2, viewFindViewById2);
            materialButton.postDelayed(new pc.a(materialButton, 1), 100L);
        }
        if (!zU) {
            u.k(this, new e(this, System.currentTimeMillis(), i11), ag.a.b("ca-app-pub-3724073793374078/1625231375"));
        }
        View viewFindViewById3 = findViewById(R.id.root_view);
        o.e eVar = new o.e(11, this);
        WeakHashMap weakHashMap2 = v0.f22405a;
        m0.j(viewFindViewById3, eVar);
    }

    @Override // i.g, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        n.a aVar = this.G;
        if (aVar != null) {
            aVar.b();
            this.G = null;
        }
        this.C.removeCallbacksAndMessages(null);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.ad_container);
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
    }

    @Override // hg.a, i.g, android.app.Activity
    public final void onResume() {
        super.onResume();
        b bVar = this.H;
        if (bVar != null) {
            bVar.run();
            this.H = null;
        }
    }
}
