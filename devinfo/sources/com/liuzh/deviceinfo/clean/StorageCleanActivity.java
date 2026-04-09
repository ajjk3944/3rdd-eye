package com.liuzh.deviceinfo.clean;

import ah.g;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import c1.o;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.internal.ads.e80;
import com.liuzh.deviceinfo.R;
import dj.b;
import e4.m0;
import e4.v0;
import hg.a;
import i0.f;
import java.util.ArrayList;
import java.util.WeakHashMap;
import je.u;
import jg.c;
import jg.h;
import jg.j;
import jg.l;
import jg.m;
import jg.n;
import nk.k;
import wb.e;
import zh.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class StorageCleanActivity extends a {
    public static final /* synthetic */ int K = 0;
    public final ArrayList B = new ArrayList();
    public final ArrayList C = new ArrayList();
    public f D;
    public e80 E;
    public o F;
    public c G;
    public boolean H;
    public boolean I;
    public n.a J;

    public static final void D(StorageCleanActivity storageCleanActivity, TextView textView, long j) {
        if (storageCleanActivity.isFinishing() || storageCleanActivity.isDestroyed()) {
            return;
        }
        textView.setText(wi.c.e(j));
    }

    public final void E() {
        e80 e80Var = this.E;
        if (e80Var == null) {
            k.k("binding");
            throw null;
        }
        ((LottieAnimationView) e80Var.f10735h).animate().alpha(0.0f).setDuration(180L).start();
        e80 e80Var2 = this.E;
        if (e80Var2 == null) {
            k.k("binding");
            throw null;
        }
        LottieAnimationView lottieAnimationView = (LottieAnimationView) e80Var2.f10736i;
        lottieAnimationView.setAlpha(0.0f);
        lottieAnimationView.setVisibility(0);
        e80 e80Var3 = this.E;
        if (e80Var3 == null) {
            k.k("binding");
            throw null;
        }
        ((TextView) e80Var3.f10740n).setAlpha(0.0f);
        e80 e80Var4 = this.E;
        if (e80Var4 == null) {
            k.k("binding");
            throw null;
        }
        ((TextView) e80Var4.f10740n).animate().alpha(1.0f).setDuration(240L).start();
        e80 e80Var5 = this.E;
        if (e80Var5 == null) {
            k.k("binding");
            throw null;
        }
        ((TextView) e80Var5.f10741o).animate().alpha(0.0f).setDuration(100L).setListener(new j(this, 1)).start();
        e80 e80Var6 = this.E;
        if (e80Var6 == null) {
            k.k("binding");
            throw null;
        }
        ((LottieAnimationView) e80Var6.f10736i).animate().alpha(1.0f).setDuration(220L).start();
        e80 e80Var7 = this.E;
        if (e80Var7 == null) {
            k.k("binding");
            throw null;
        }
        ((LottieAnimationView) e80Var7.f10736i).postDelayed(new h(this, 0), 100L);
        this.H = true;
        if (this.I) {
            e80 e80Var8 = this.E;
            if (e80Var8 != null) {
                ((CardView) e80Var8.f10730b).post(new h(this, 1));
            } else {
                k.k("binding");
                throw null;
            }
        }
    }

    @Override // d.j, android.app.Activity
    public final void onBackPressed() {
        if (this.D == null) {
            super.onBackPressed();
            return;
        }
        this.f32744a.a(new n(0, this));
        f fVar = this.D;
        k.b(fVar);
        fVar.T(this, new jf.c(25, this));
        this.D = null;
    }

    @Override // hg.a, i.g, d.j, r3.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        lg.a aVar = new lg.a();
        int i4 = 0;
        aVar.f28807b = new l(this, i4);
        ArrayList arrayList = this.C;
        arrayList.add(aVar);
        lg.k kVar = new lg.k();
        int i10 = 1;
        kVar.f28807b = new l(this, i10);
        arrayList.add(kVar);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_storage_clean, (ViewGroup) null, false);
        int i11 = R.id.ad_container;
        CardView cardView = (CardView) e.s(R.id.ad_container, viewInflate);
        if (cardView != null) {
            i11 = R.id.clean_layout;
            ConstraintLayout constraintLayout = (ConstraintLayout) e.s(R.id.clean_layout, viewInflate);
            if (constraintLayout != null) {
                i11 = R.id.clean_tips;
                TextView textView = (TextView) e.s(R.id.clean_tips, viewInflate);
                if (textView != null) {
                    i11 = R.id.confirm_button;
                    Button button = (Button) e.s(R.id.confirm_button, viewInflate);
                    if (button != null) {
                        i11 = R.id.coordinator;
                        if (((CoordinatorLayout) e.s(R.id.coordinator, viewInflate)) != null) {
                            i11 = R.id.empty_animation;
                            LottieAnimationView lottieAnimationView = (LottieAnimationView) e.s(R.id.empty_animation, viewInflate);
                            if (lottieAnimationView != null) {
                                i11 = R.id.icon_head;
                                ImageView imageView = (ImageView) e.s(R.id.icon_head, viewInflate);
                                if (imageView != null) {
                                    i11 = R.id.lottie_animation_cleaning;
                                    LottieAnimationView lottieAnimationView2 = (LottieAnimationView) e.s(R.id.lottie_animation_cleaning, viewInflate);
                                    if (lottieAnimationView2 != null) {
                                        i11 = R.id.lottie_animation_finish;
                                        LottieAnimationView lottieAnimationView3 = (LottieAnimationView) e.s(R.id.lottie_animation_finish, viewInflate);
                                        if (lottieAnimationView3 != null) {
                                            i11 = R.id.recycler_view;
                                            RecyclerView recyclerView = (RecyclerView) e.s(R.id.recycler_view, viewInflate);
                                            if (recyclerView != null) {
                                                i11 = R.id.scan_result_layout;
                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) e.s(R.id.scan_result_layout, viewInflate);
                                                if (constraintLayout2 != null) {
                                                    i11 = R.id.scanning_layout;
                                                    View viewS = e.s(R.id.scanning_layout, viewInflate);
                                                    if (viewS != null) {
                                                        int i12 = R.id.guide_line_center_vertical;
                                                        if (((Guideline) e.s(R.id.guide_line_center_vertical, viewS)) != null) {
                                                            i12 = R.id.lottie_animation_scanning;
                                                            if (((LottieAnimationView) e.s(R.id.lottie_animation_scanning, viewS)) != null) {
                                                                i12 = R.id.progress_apk_file;
                                                                ProgressBar progressBar = (ProgressBar) e.s(R.id.progress_apk_file, viewS);
                                                                if (progressBar != null) {
                                                                    i12 = R.id.progress_app_cache;
                                                                    ProgressBar progressBar2 = (ProgressBar) e.s(R.id.progress_app_cache, viewS);
                                                                    if (progressBar2 != null) {
                                                                        i12 = R.id.progress_empty_folder;
                                                                        ProgressBar progressBar3 = (ProgressBar) e.s(R.id.progress_empty_folder, viewS);
                                                                        if (progressBar3 != null) {
                                                                            i12 = R.id.progress_log_file;
                                                                            ProgressBar progressBar4 = (ProgressBar) e.s(R.id.progress_log_file, viewS);
                                                                            if (progressBar4 != null) {
                                                                                i12 = R.id.progress_temp_file;
                                                                                ProgressBar progressBar5 = (ProgressBar) e.s(R.id.progress_temp_file, viewS);
                                                                                if (progressBar5 != null) {
                                                                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) viewS;
                                                                                    i12 = R.id.tv_size_apk_file;
                                                                                    TextView textView2 = (TextView) e.s(R.id.tv_size_apk_file, viewS);
                                                                                    if (textView2 != null) {
                                                                                        i12 = R.id.tv_size_app_cache;
                                                                                        TextView textView3 = (TextView) e.s(R.id.tv_size_app_cache, viewS);
                                                                                        if (textView3 != null) {
                                                                                            i12 = R.id.tv_size_empty_folder;
                                                                                            TextView textView4 = (TextView) e.s(R.id.tv_size_empty_folder, viewS);
                                                                                            if (textView4 != null) {
                                                                                                i12 = R.id.tv_size_log_file;
                                                                                                TextView textView5 = (TextView) e.s(R.id.tv_size_log_file, viewS);
                                                                                                if (textView5 != null) {
                                                                                                    i12 = R.id.tv_size_temp_file;
                                                                                                    TextView textView6 = (TextView) e.s(R.id.tv_size_temp_file, viewS);
                                                                                                    if (textView6 != null) {
                                                                                                        i12 = R.id.tv_trash_apk_file;
                                                                                                        if (((TextView) e.s(R.id.tv_trash_apk_file, viewS)) != null) {
                                                                                                            i12 = R.id.tv_trash_app_cache;
                                                                                                            if (((TextView) e.s(R.id.tv_trash_app_cache, viewS)) != null) {
                                                                                                                i12 = R.id.tv_trash_empty_folder;
                                                                                                                if (((TextView) e.s(R.id.tv_trash_empty_folder, viewS)) != null) {
                                                                                                                    i12 = R.id.tv_trash_log_file;
                                                                                                                    if (((TextView) e.s(R.id.tv_trash_log_file, viewS)) != null) {
                                                                                                                        i12 = R.id.tv_trash_temp_file;
                                                                                                                        if (((TextView) e.s(R.id.tv_trash_temp_file, viewS)) != null) {
                                                                                                                            o oVar = new o(constraintLayout3, progressBar, progressBar2, progressBar3, progressBar4, progressBar5, textView2, textView3, textView4, textView5, textView6);
                                                                                                                            i11 = R.id.toolbar;
                                                                                                                            Toolbar toolbar = (Toolbar) e.s(R.id.toolbar, viewInflate);
                                                                                                                            if (toolbar != null) {
                                                                                                                                i11 = R.id.top_layout;
                                                                                                                                if (((LinearLayout) e.s(R.id.top_layout, viewInflate)) != null) {
                                                                                                                                    i11 = R.id.tv_cleaned;
                                                                                                                                    TextView textView7 = (TextView) e.s(R.id.tv_cleaned, viewInflate);
                                                                                                                                    if (textView7 != null) {
                                                                                                                                        i11 = R.id.tv_cleaning;
                                                                                                                                        TextView textView8 = (TextView) e.s(R.id.tv_cleaning, viewInflate);
                                                                                                                                        if (textView8 != null) {
                                                                                                                                            i11 = R.id.tv_result_title_size;
                                                                                                                                            TextView textView9 = (TextView) e.s(R.id.tv_result_title_size, viewInflate);
                                                                                                                                            if (textView9 != null) {
                                                                                                                                                FrameLayout frameLayout = (FrameLayout) viewInflate;
                                                                                                                                                this.E = new e80(frameLayout, cardView, constraintLayout, textView, button, lottieAnimationView, imageView, lottieAnimationView2, lottieAnimationView3, recyclerView, constraintLayout2, oVar, toolbar, textView7, textView8, textView9);
                                                                                                                                                setContentView(frameLayout);
                                                                                                                                                e80 e80Var = this.E;
                                                                                                                                                if (e80Var == null) {
                                                                                                                                                    k.k("binding");
                                                                                                                                                    throw null;
                                                                                                                                                }
                                                                                                                                                z((Toolbar) e80Var.f10739m);
                                                                                                                                                e80 e80Var2 = this.E;
                                                                                                                                                if (e80Var2 == null) {
                                                                                                                                                    k.k("binding");
                                                                                                                                                    throw null;
                                                                                                                                                }
                                                                                                                                                i.e((Toolbar) e80Var2.f10739m);
                                                                                                                                                A();
                                                                                                                                                e80 e80Var3 = this.E;
                                                                                                                                                if (e80Var3 == null) {
                                                                                                                                                    k.k("binding");
                                                                                                                                                    throw null;
                                                                                                                                                }
                                                                                                                                                this.F = (o) e80Var3.f10738l;
                                                                                                                                                com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
                                                                                                                                                int iD = com.liuzh.deviceinfo.utilities.f.d();
                                                                                                                                                o oVar2 = this.F;
                                                                                                                                                if (oVar2 == null) {
                                                                                                                                                    k.k("scanningBinding");
                                                                                                                                                    throw null;
                                                                                                                                                }
                                                                                                                                                b.i((ProgressBar) oVar2.g, iD);
                                                                                                                                                o oVar3 = this.F;
                                                                                                                                                if (oVar3 == null) {
                                                                                                                                                    k.k("scanningBinding");
                                                                                                                                                    throw null;
                                                                                                                                                }
                                                                                                                                                b.i((ProgressBar) oVar3.f2573e, iD);
                                                                                                                                                o oVar4 = this.F;
                                                                                                                                                if (oVar4 == null) {
                                                                                                                                                    k.k("scanningBinding");
                                                                                                                                                    throw null;
                                                                                                                                                }
                                                                                                                                                b.i((ProgressBar) oVar4.f2571c, iD);
                                                                                                                                                o oVar5 = this.F;
                                                                                                                                                if (oVar5 == null) {
                                                                                                                                                    k.k("scanningBinding");
                                                                                                                                                    throw null;
                                                                                                                                                }
                                                                                                                                                b.i((ProgressBar) oVar5.f2572d, iD);
                                                                                                                                                o oVar6 = this.F;
                                                                                                                                                if (oVar6 == null) {
                                                                                                                                                    k.k("scanningBinding");
                                                                                                                                                    throw null;
                                                                                                                                                }
                                                                                                                                                b.i((ProgressBar) oVar6.f2574f, iD);
                                                                                                                                                e80 e80Var4 = this.E;
                                                                                                                                                if (e80Var4 == null) {
                                                                                                                                                    k.k("binding");
                                                                                                                                                    throw null;
                                                                                                                                                }
                                                                                                                                                ImageView imageView2 = (ImageView) e80Var4.g;
                                                                                                                                                Drawable background = imageView2.getBackground();
                                                                                                                                                k.d(background, "getBackground(...)");
                                                                                                                                                Context context = imageView2.getContext();
                                                                                                                                                k.d(context, "getContext(...)");
                                                                                                                                                imageView2.setBackground(e.M(background, i.c(context)));
                                                                                                                                                imageView2.setColorFilter(iD);
                                                                                                                                                e80 e80Var5 = this.E;
                                                                                                                                                if (e80Var5 == null) {
                                                                                                                                                    k.k("binding");
                                                                                                                                                    throw null;
                                                                                                                                                }
                                                                                                                                                b.k((RecyclerView) e80Var5.j, iD);
                                                                                                                                                e80 e80Var6 = this.E;
                                                                                                                                                if (e80Var6 == null) {
                                                                                                                                                    k.k("binding");
                                                                                                                                                    throw null;
                                                                                                                                                }
                                                                                                                                                Button button2 = (Button) e80Var6.f10733e;
                                                                                                                                                button2.setOnClickListener(new g(6, button2, this));
                                                                                                                                                Drawable background2 = button2.getBackground();
                                                                                                                                                k.d(background2, "getBackground(...)");
                                                                                                                                                button2.setBackground(e.M(background2, iD));
                                                                                                                                                new Thread(new h(this, 2)).start();
                                                                                                                                                if (!com.liuzh.deviceinfo.utilities.f.g()) {
                                                                                                                                                    u.k(this, new m(i4, this), ag.a.c(R.layout.ad_native_common));
                                                                                                                                                    u.k(this, new eg.k(i10, this), ag.a.b("ca-app-pub-3724073793374078/7414422718"));
                                                                                                                                                }
                                                                                                                                                e80 e80Var7 = this.E;
                                                                                                                                                if (e80Var7 == null) {
                                                                                                                                                    k.k("binding");
                                                                                                                                                    throw null;
                                                                                                                                                }
                                                                                                                                                FrameLayout frameLayout2 = (FrameLayout) e80Var7.f10729a;
                                                                                                                                                ca.b bVar = new ca.b(21, this);
                                                                                                                                                WeakHashMap weakHashMap = v0.f22405a;
                                                                                                                                                m0.j(frameLayout2, bVar);
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
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        throw new NullPointerException("Missing required view with ID: ".concat(viewS.getResources().getResourceName(i12)));
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    @Override // i.g, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        n.a aVar = this.J;
        if (aVar != null) {
            aVar.b();
        }
    }
}
