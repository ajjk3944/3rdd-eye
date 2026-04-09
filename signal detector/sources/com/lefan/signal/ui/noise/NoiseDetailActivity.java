package com.lefan.signal.ui.noise;

import F4.d;
import K4.e;
import R2.a;
import a4.p;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import c.AbstractC0391p;
import com.apm.insight.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.slider.Slider;
import com.lefan.ads.banner.BannerView;
import com.lefan.signal.ui.noise.NoiseDetailActivity;
import com.lefan.signal.ui.noise.NoiseTrendView;
import com.lefan.signal.ui.noise.NoiseView;
import d5.AbstractC2282j;
import h.AbstractActivityC2349g;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import q5.i;

/* loaded from: classes.dex */
public final class NoiseDetailActivity extends AbstractActivityC2349g implements Runnable {

    /* renamed from: c0, reason: collision with root package name */
    public static final /* synthetic */ int f18995c0 = 0;

    /* renamed from: O, reason: collision with root package name */
    public e f18996O;

    /* renamed from: P, reason: collision with root package name */
    public final Handler f18997P = new Handler(Looper.getMainLooper());

    /* renamed from: Q, reason: collision with root package name */
    public final ArrayList f18998Q = new ArrayList();

    /* renamed from: R, reason: collision with root package name */
    public boolean f18999R;

    /* renamed from: S, reason: collision with root package name */
    public AppCompatTextView f19000S;

    /* renamed from: T, reason: collision with root package name */
    public AppCompatTextView f19001T;

    /* renamed from: U, reason: collision with root package name */
    public Slider f19002U;

    /* renamed from: V, reason: collision with root package name */
    public NoiseView f19003V;

    /* renamed from: W, reason: collision with root package name */
    public NoiseTrendView f19004W;

    /* renamed from: X, reason: collision with root package name */
    public TextView f19005X;

    /* renamed from: Y, reason: collision with root package name */
    public TextView f19006Y;

    /* renamed from: Z, reason: collision with root package name */
    public TextView f19007Z;

    /* renamed from: a0, reason: collision with root package name */
    public MaterialButton f19008a0;
    public int b0;

    public static String C(int i) {
        int i3 = i / 3600;
        int i6 = i - (i3 * 3600);
        int i7 = i6 / 60;
        int i8 = i6 - (i7 * 60);
        Integer numValueOf = Integer.valueOf(i3);
        Integer numValueOf2 = Integer.valueOf(i7);
        Integer numValueOf3 = Integer.valueOf(i8);
        if (!a.f3390d) {
            return String.format(Locale.ENGLISH, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{numValueOf, numValueOf2, numValueOf3}, 3));
        }
        Locale locale = F4.e.f1457a;
        return String.format(F4.e.b(), "%02d:%02d:%02d", Arrays.copyOf(new Object[]{numValueOf, numValueOf2, numValueOf3}, 3));
    }

    @Override // h.AbstractActivityC2349g, c.AbstractActivityC0389n, G.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object serializableExtra;
        AbstractC0391p.a(this);
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_noise_detail, (ViewGroup) null, false);
        int i = R.id.ad_view;
        if (((BannerView) p.e(R.id.ad_view, viewInflate)) != null) {
            i = R.id.address_text;
            AppCompatTextView appCompatTextView = (AppCompatTextView) p.e(R.id.address_text, viewInflate);
            if (appCompatTextView != null) {
                i = R.id.app_bar;
                AppBarLayout appBarLayout = (AppBarLayout) p.e(R.id.app_bar, viewInflate);
                if (appBarLayout != null) {
                    i = R.id.avg_value;
                    TextView textView = (TextView) p.e(R.id.avg_value, viewInflate);
                    if (textView != null) {
                        i = R.id.bottom_layout;
                        RelativeLayout relativeLayout = (RelativeLayout) p.e(R.id.bottom_layout, viewInflate);
                        if (relativeLayout != null) {
                            i = R.id.max_value;
                            TextView textView2 = (TextView) p.e(R.id.max_value, viewInflate);
                            if (textView2 != null) {
                                i = R.id.min_value;
                                TextView textView3 = (TextView) p.e(R.id.min_value, viewInflate);
                                if (textView3 != null) {
                                    i = R.id.noise_detail_toolbar;
                                    Toolbar toolbar = (Toolbar) p.e(R.id.noise_detail_toolbar, viewInflate);
                                    if (toolbar != null) {
                                        i = R.id.noise_trend;
                                        NoiseTrendView noiseTrendView = (NoiseTrendView) p.e(R.id.noise_trend, viewInflate);
                                        if (noiseTrendView != null) {
                                            i = R.id.noise_view;
                                            NoiseView noiseView = (NoiseView) p.e(R.id.noise_view, viewInflate);
                                            if (noiseView != null) {
                                                i = R.id.start_btn;
                                                MaterialButton materialButton = (MaterialButton) p.e(R.id.start_btn, viewInflate);
                                                if (materialButton != null) {
                                                    i = R.id.start_time;
                                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) p.e(R.id.start_time, viewInflate);
                                                    if (appCompatTextView2 != null) {
                                                        i = R.id.step_slider;
                                                        Slider slider = (Slider) p.e(R.id.step_slider, viewInflate);
                                                        if (slider != null) {
                                                            i = R.id.time_text;
                                                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) p.e(R.id.time_text, viewInflate);
                                                            if (appCompatTextView3 != null) {
                                                                i = R.id.total_time;
                                                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) p.e(R.id.total_time, viewInflate);
                                                                if (appCompatTextView4 != null) {
                                                                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) viewInflate;
                                                                    this.f18996O = new e(linearLayoutCompat, appCompatTextView, appBarLayout, textView, relativeLayout, textView2, textView3, toolbar, noiseTrendView, noiseView, materialButton, appCompatTextView2, slider, appCompatTextView3, appCompatTextView4);
                                                                    setContentView(linearLayoutCompat);
                                                                    e eVar = this.f18996O;
                                                                    if (eVar == null) {
                                                                        i.g("binding");
                                                                        throw null;
                                                                    }
                                                                    AppBarLayout appBarLayout2 = (AppBarLayout) eVar.f2242f;
                                                                    if (eVar == null) {
                                                                        i.g("binding");
                                                                        throw null;
                                                                    }
                                                                    d.a(appBarLayout2, (RelativeLayout) eVar.f2245j);
                                                                    e eVar2 = this.f18996O;
                                                                    if (eVar2 == null) {
                                                                        i.g("binding");
                                                                        throw null;
                                                                    }
                                                                    Toolbar toolbar2 = (Toolbar) eVar2.f2246k;
                                                                    B(toolbar2);
                                                                    com.bumptech.glide.d dVarR = r();
                                                                    if (dVarR != null) {
                                                                        dVarR.S(true);
                                                                    }
                                                                    final int i3 = 0;
                                                                    toolbar2.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: S4.o

                                                                        /* renamed from: b, reason: collision with root package name */
                                                                        public final /* synthetic */ NoiseDetailActivity f3548b;

                                                                        {
                                                                            this.f3548b = this;
                                                                        }

                                                                        @Override // android.view.View.OnClickListener
                                                                        public final void onClick(View view) {
                                                                            int i6 = i3;
                                                                            NoiseDetailActivity noiseDetailActivity = this.f3548b;
                                                                            switch (i6) {
                                                                                case 0:
                                                                                    int i7 = NoiseDetailActivity.f18995c0;
                                                                                    noiseDetailActivity.finish();
                                                                                    return;
                                                                                default:
                                                                                    if (noiseDetailActivity.f18999R) {
                                                                                        MaterialButton materialButton2 = noiseDetailActivity.f19008a0;
                                                                                        if (materialButton2 == null) {
                                                                                            q5.i.g("startBtn");
                                                                                            throw null;
                                                                                        }
                                                                                        materialButton2.setIcon(noiseDetailActivity.getDrawable(R.drawable.ic_start));
                                                                                        Slider slider2 = noiseDetailActivity.f19002U;
                                                                                        if (slider2 == null) {
                                                                                            q5.i.g("slider");
                                                                                            throw null;
                                                                                        }
                                                                                        slider2.setEnabled(false);
                                                                                        NoiseView noiseView2 = noiseDetailActivity.f19003V;
                                                                                        if (noiseView2 == null) {
                                                                                            q5.i.g("noiseView");
                                                                                            throw null;
                                                                                        }
                                                                                        noiseView2.setMdb(0.0f);
                                                                                        noiseDetailActivity.b0 = 0;
                                                                                        NoiseTrendView noiseTrendView2 = noiseDetailActivity.f19004W;
                                                                                        if (noiseTrendView2 == null) {
                                                                                            q5.i.g("trendView");
                                                                                            throw null;
                                                                                        }
                                                                                        noiseTrendView2.b();
                                                                                        NoiseTrendView noiseTrendView3 = noiseDetailActivity.f19004W;
                                                                                        if (noiseTrendView3 == null) {
                                                                                            q5.i.g("trendView");
                                                                                            throw null;
                                                                                        }
                                                                                        noiseTrendView3.c(noiseDetailActivity.f18998Q);
                                                                                    } else {
                                                                                        MaterialButton materialButton3 = noiseDetailActivity.f19008a0;
                                                                                        if (materialButton3 == null) {
                                                                                            q5.i.g("startBtn");
                                                                                            throw null;
                                                                                        }
                                                                                        materialButton3.setIcon(noiseDetailActivity.getDrawable(R.drawable.ic_stop));
                                                                                        NoiseTrendView noiseTrendView4 = noiseDetailActivity.f19004W;
                                                                                        if (noiseTrendView4 == null) {
                                                                                            q5.i.g("trendView");
                                                                                            throw null;
                                                                                        }
                                                                                        noiseTrendView4.b();
                                                                                        Slider slider3 = noiseDetailActivity.f19002U;
                                                                                        if (slider3 == null) {
                                                                                            q5.i.g("slider");
                                                                                            throw null;
                                                                                        }
                                                                                        slider3.setEnabled(true);
                                                                                        noiseDetailActivity.f18997P.postDelayed(noiseDetailActivity, 1000L);
                                                                                    }
                                                                                    noiseDetailActivity.f18999R = !noiseDetailActivity.f18999R;
                                                                                    return;
                                                                            }
                                                                        }
                                                                    });
                                                                    Intent intent = getIntent();
                                                                    i.d(intent, "getIntent(...)");
                                                                    if (Build.VERSION.SDK_INT >= 33) {
                                                                        serializableExtra = intent.getSerializableExtra("noise_bean", NoiseBean.class);
                                                                    } else {
                                                                        Serializable serializableExtra2 = intent.getSerializableExtra("noise_bean");
                                                                        if (serializableExtra2 == null || !(serializableExtra2 instanceof NoiseBean)) {
                                                                            serializableExtra2 = null;
                                                                        }
                                                                        if (!(serializableExtra2 instanceof NoiseBean)) {
                                                                            serializableExtra2 = null;
                                                                        }
                                                                        serializableExtra = (NoiseBean) serializableExtra2;
                                                                    }
                                                                    NoiseBean noiseBean = (NoiseBean) serializableExtra;
                                                                    if (noiseBean == null) {
                                                                        return;
                                                                    }
                                                                    e eVar3 = this.f18996O;
                                                                    if (eVar3 == null) {
                                                                        i.g("binding");
                                                                        throw null;
                                                                    }
                                                                    AppCompatTextView appCompatTextView5 = (AppCompatTextView) eVar3.f2239c;
                                                                    this.f19000S = appCompatTextView5;
                                                                    appCompatTextView5.setText(C(0));
                                                                    e eVar4 = this.f18996O;
                                                                    if (eVar4 == null) {
                                                                        i.g("binding");
                                                                        throw null;
                                                                    }
                                                                    this.f19001T = (AppCompatTextView) eVar4.f2241e;
                                                                    this.f19002U = (Slider) eVar4.f2236C;
                                                                    this.f19003V = (NoiseView) eVar4.f2248m;
                                                                    this.f19004W = (NoiseTrendView) eVar4.f2247l;
                                                                    this.f19005X = (TextView) eVar4.i;
                                                                    this.f19007Z = (TextView) eVar4.f2244h;
                                                                    this.f19006Y = (TextView) eVar4.f2243g;
                                                                    this.f19008a0 = (MaterialButton) eVar4.f2249n;
                                                                    ((AppCompatTextView) eVar4.f2238b).setText(noiseBean.getAddress());
                                                                    ArrayList arrayList = this.f18998Q;
                                                                    arrayList.clear();
                                                                    List<Float> step = noiseBean.getStep();
                                                                    if (step != null) {
                                                                        arrayList.addAll(step);
                                                                    }
                                                                    TextView textView4 = this.f19005X;
                                                                    if (textView4 == null) {
                                                                        i.g("minText");
                                                                        throw null;
                                                                    }
                                                                    textView4.setText(a.k(Float.valueOf(noiseBean.getMinValue()), "%.1f"));
                                                                    TextView textView5 = this.f19006Y;
                                                                    if (textView5 == null) {
                                                                        i.g("avgText");
                                                                        throw null;
                                                                    }
                                                                    textView5.setText(a.k(Float.valueOf(noiseBean.getAvgValue()), "%.1f"));
                                                                    TextView textView6 = this.f19007Z;
                                                                    if (textView6 == null) {
                                                                        i.g("maxText");
                                                                        throw null;
                                                                    }
                                                                    textView6.setText(a.k(Float.valueOf(noiseBean.getMaxValue()), "%.1f"));
                                                                    e eVar5 = this.f18996O;
                                                                    if (eVar5 == null) {
                                                                        i.g("binding");
                                                                        throw null;
                                                                    }
                                                                    ((AppCompatTextView) eVar5.f2240d).setText(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", F4.e.c(null)).format(Long.valueOf(noiseBean.getTime())));
                                                                    Slider slider2 = this.f19002U;
                                                                    if (slider2 == null) {
                                                                        i.g("slider");
                                                                        throw null;
                                                                    }
                                                                    slider2.setValueTo(arrayList.size());
                                                                    AppCompatTextView appCompatTextView6 = this.f19001T;
                                                                    if (appCompatTextView6 == null) {
                                                                        i.g("totalTimeText");
                                                                        throw null;
                                                                    }
                                                                    appCompatTextView6.setText(C(arrayList.size()));
                                                                    NoiseTrendView noiseTrendView2 = this.f19004W;
                                                                    if (noiseTrendView2 == null) {
                                                                        i.g("trendView");
                                                                        throw null;
                                                                    }
                                                                    noiseTrendView2.c(arrayList);
                                                                    MaterialButton materialButton2 = this.f19008a0;
                                                                    if (materialButton2 == null) {
                                                                        i.g("startBtn");
                                                                        throw null;
                                                                    }
                                                                    final int i6 = 1;
                                                                    materialButton2.setOnClickListener(new View.OnClickListener(this) { // from class: S4.o

                                                                        /* renamed from: b, reason: collision with root package name */
                                                                        public final /* synthetic */ NoiseDetailActivity f3548b;

                                                                        {
                                                                            this.f3548b = this;
                                                                        }

                                                                        @Override // android.view.View.OnClickListener
                                                                        public final void onClick(View view) {
                                                                            int i62 = i6;
                                                                            NoiseDetailActivity noiseDetailActivity = this.f3548b;
                                                                            switch (i62) {
                                                                                case 0:
                                                                                    int i7 = NoiseDetailActivity.f18995c0;
                                                                                    noiseDetailActivity.finish();
                                                                                    return;
                                                                                default:
                                                                                    if (noiseDetailActivity.f18999R) {
                                                                                        MaterialButton materialButton22 = noiseDetailActivity.f19008a0;
                                                                                        if (materialButton22 == null) {
                                                                                            q5.i.g("startBtn");
                                                                                            throw null;
                                                                                        }
                                                                                        materialButton22.setIcon(noiseDetailActivity.getDrawable(R.drawable.ic_start));
                                                                                        Slider slider22 = noiseDetailActivity.f19002U;
                                                                                        if (slider22 == null) {
                                                                                            q5.i.g("slider");
                                                                                            throw null;
                                                                                        }
                                                                                        slider22.setEnabled(false);
                                                                                        NoiseView noiseView2 = noiseDetailActivity.f19003V;
                                                                                        if (noiseView2 == null) {
                                                                                            q5.i.g("noiseView");
                                                                                            throw null;
                                                                                        }
                                                                                        noiseView2.setMdb(0.0f);
                                                                                        noiseDetailActivity.b0 = 0;
                                                                                        NoiseTrendView noiseTrendView22 = noiseDetailActivity.f19004W;
                                                                                        if (noiseTrendView22 == null) {
                                                                                            q5.i.g("trendView");
                                                                                            throw null;
                                                                                        }
                                                                                        noiseTrendView22.b();
                                                                                        NoiseTrendView noiseTrendView3 = noiseDetailActivity.f19004W;
                                                                                        if (noiseTrendView3 == null) {
                                                                                            q5.i.g("trendView");
                                                                                            throw null;
                                                                                        }
                                                                                        noiseTrendView3.c(noiseDetailActivity.f18998Q);
                                                                                    } else {
                                                                                        MaterialButton materialButton3 = noiseDetailActivity.f19008a0;
                                                                                        if (materialButton3 == null) {
                                                                                            q5.i.g("startBtn");
                                                                                            throw null;
                                                                                        }
                                                                                        materialButton3.setIcon(noiseDetailActivity.getDrawable(R.drawable.ic_stop));
                                                                                        NoiseTrendView noiseTrendView4 = noiseDetailActivity.f19004W;
                                                                                        if (noiseTrendView4 == null) {
                                                                                            q5.i.g("trendView");
                                                                                            throw null;
                                                                                        }
                                                                                        noiseTrendView4.b();
                                                                                        Slider slider3 = noiseDetailActivity.f19002U;
                                                                                        if (slider3 == null) {
                                                                                            q5.i.g("slider");
                                                                                            throw null;
                                                                                        }
                                                                                        slider3.setEnabled(true);
                                                                                        noiseDetailActivity.f18997P.postDelayed(noiseDetailActivity, 1000L);
                                                                                    }
                                                                                    noiseDetailActivity.f18999R = !noiseDetailActivity.f18999R;
                                                                                    return;
                                                                            }
                                                                        }
                                                                    });
                                                                    Slider slider3 = this.f19002U;
                                                                    if (slider3 == null) {
                                                                        i.g("slider");
                                                                        throw null;
                                                                    }
                                                                    slider3.f1979m.add(new R4.a(this, 1));
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // h.AbstractActivityC2349g, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.f18997P.removeCallbacks(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f18999R) {
            Float f2 = (Float) AbstractC2282j.V(this.b0, this.f18998Q);
            if (f2 == null) {
                this.b0 = 0;
                NoiseTrendView noiseTrendView = this.f19004W;
                if (noiseTrendView == null) {
                    i.g("trendView");
                    throw null;
                }
                noiseTrendView.b();
                Slider slider = this.f19002U;
                if (slider == null) {
                    i.g("slider");
                    throw null;
                }
                slider.setValue(0.0f);
            } else {
                NoiseTrendView noiseTrendView2 = this.f19004W;
                if (noiseTrendView2 == null) {
                    i.g("trendView");
                    throw null;
                }
                noiseTrendView2.a(f2.floatValue());
                NoiseView noiseView = this.f19003V;
                if (noiseView == null) {
                    i.g("noiseView");
                    throw null;
                }
                noiseView.setMdb(f2.floatValue());
                Slider slider2 = this.f19002U;
                if (slider2 == null) {
                    i.g("slider");
                    throw null;
                }
                slider2.setValue(this.b0 * 1.0f);
                this.b0++;
            }
            AppCompatTextView appCompatTextView = this.f19000S;
            if (appCompatTextView == null) {
                i.g("startTimeText");
                throw null;
            }
            appCompatTextView.setText(C(this.b0));
            this.f18997P.postDelayed(this, 1000L);
        }
    }
}
