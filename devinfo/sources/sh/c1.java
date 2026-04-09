package sh;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.liuzh.deviceinfo.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p.o1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class c1 extends a {
    public RecyclerView Z;

    /* renamed from: a0, reason: collision with root package name */
    public HandlerThread f33656a0;

    /* renamed from: b0, reason: collision with root package name */
    public Handler f33657b0;

    /* renamed from: c0, reason: collision with root package name */
    public final ArrayList f33658c0 = new ArrayList();

    /* renamed from: d0, reason: collision with root package name */
    public final o1 f33659d0 = new o1(6, this);

    /* renamed from: e0, reason: collision with root package name */
    public ej.e f33660e0;

    /* renamed from: f0, reason: collision with root package name */
    public ViewGroup f33661f0;

    /* renamed from: g0, reason: collision with root package name */
    public ProgressBar f33662g0;

    /* renamed from: h0, reason: collision with root package name */
    public View f33663h0;

    @Override // b5.z
    public final void F(Bundle bundle) {
        super.F(bundle);
        HandlerThread handlerThread = new HandlerThread("TabThermalLoader");
        this.f33656a0 = handlerThread;
        handlerThread.start();
        this.f33657b0 = new Handler(this.f33656a0.getLooper());
    }

    @Override // b5.z
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.f33661f0 == null) {
            final int i4 = 0;
            this.f33661f0 = (ViewGroup) layoutInflater.inflate(R.layout.tab_thermal, viewGroup, false);
            com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
            int iD = com.liuzh.deviceinfo.utilities.f.d();
            SharedPreferences sharedPreferences = com.liuzh.deviceinfo.utilities.f.f21257c;
            if (!sharedPreferences.getBoolean("rate_scene_clicked_tab_thermal", false)) {
                final int i10 = 1;
                if (sharedPreferences.getBoolean("can_show_rate_dialog", true)) {
                    final ViewGroup viewGroup2 = (ViewGroup) this.f33661f0.findViewById(R.id.container_rate);
                    final View viewInflate = layoutInflater.inflate(R.layout.item_rate_us, viewGroup2, false);
                    ((ImageView) viewInflate.findViewById(R.id.star1)).setColorFilter(iD);
                    ((ImageView) viewInflate.findViewById(R.id.star2)).setColorFilter(iD);
                    ((ImageView) viewInflate.findViewById(R.id.star3)).setColorFilter(iD);
                    ((ImageView) viewInflate.findViewById(R.id.star4)).setColorFilter(iD);
                    ((ImageView) viewInflate.findViewById(R.id.star5)).setColorFilter(iD);
                    Button button = (Button) viewInflate.findViewById(R.id.rating);
                    button.setBackground(wb.e.M(button.getBackground(), iD));
                    button.setOnClickListener(new View.OnClickListener(this) { // from class: sh.y0

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ c1 f33791b;

                        {
                            this.f33791b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i11 = i4;
                            View view2 = viewInflate;
                            ViewGroup viewGroup3 = viewGroup2;
                            c1 c1Var = this.f33791b;
                            switch (i11) {
                                case 0:
                                    if (!c1Var.c0()) {
                                        com.liuzh.deviceinfo.utilities.f fVar2 = com.liuzh.deviceinfo.utilities.f.f21256b;
                                        com.liuzh.deviceinfo.utilities.f.q("tab_thermal");
                                        com.liuzh.deviceinfo.utilities.d.j(c1Var.W(), "com.liuzh.deviceinfo", "ThermalRate");
                                        viewGroup3.removeView(view2);
                                        viewGroup3.setVisibility(8);
                                        break;
                                    }
                                    break;
                                default:
                                    if (!c1Var.c0()) {
                                        viewGroup3.removeView(view2);
                                        viewGroup3.setVisibility(8);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    viewInflate.findViewById(R.id.close).setOnClickListener(new View.OnClickListener(this) { // from class: sh.y0

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ c1 f33791b;

                        {
                            this.f33791b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i11 = i10;
                            View view2 = viewInflate;
                            ViewGroup viewGroup3 = viewGroup2;
                            c1 c1Var = this.f33791b;
                            switch (i11) {
                                case 0:
                                    if (!c1Var.c0()) {
                                        com.liuzh.deviceinfo.utilities.f fVar2 = com.liuzh.deviceinfo.utilities.f.f21256b;
                                        com.liuzh.deviceinfo.utilities.f.q("tab_thermal");
                                        com.liuzh.deviceinfo.utilities.d.j(c1Var.W(), "com.liuzh.deviceinfo", "ThermalRate");
                                        viewGroup3.removeView(view2);
                                        viewGroup3.setVisibility(8);
                                        break;
                                    }
                                    break;
                                default:
                                    if (!c1Var.c0()) {
                                        viewGroup3.removeView(view2);
                                        viewGroup3.setVisibility(8);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    viewGroup2.addView(viewInflate);
                    viewGroup2.setVisibility(0);
                }
            }
            RecyclerView recyclerView = (RecyclerView) this.f33661f0.findViewById(R.id.recycler_view);
            this.Z = recyclerView;
            dj.b.k(recyclerView, iD);
            ProgressBar progressBar = (ProgressBar) this.f33661f0.findViewById(R.id.progressBar);
            this.f33662g0 = progressBar;
            dj.b.i(progressBar, iD);
            this.f33663h0 = this.f33661f0.findViewById(R.id.failed);
            ej.e eVar = new ej.e(2, this);
            this.f33660e0 = eVar;
            this.Z.setAdapter(eVar);
            GridLayoutManager gridLayoutManager = (GridLayoutManager) this.Z.getLayoutManager();
            gridLayoutManager.g = new z0(gridLayoutManager);
            this.Z.i(new a1());
        }
        return this.f33661f0;
    }

    @Override // b5.z
    public final void H() {
        this.F = true;
        this.f33656a0.quitSafely();
    }

    @Override // b5.z
    public final void L() {
        this.F = true;
        this.f33657b0.removeCallbacks(this.f33659d0);
    }

    @Override // b5.z
    public final void N() {
        this.F = true;
        Handler handler = this.f33657b0;
        o1 o1Var = this.f33659d0;
        handler.removeCallbacks(o1Var);
        this.f33657b0.post(o1Var);
    }

    @Override // b5.z
    public final void R(View view, Bundle bundle) {
        com.applovin.impl.sdk.ad.f fVar = new com.applovin.impl.sdk.ad.f(19, this, view);
        WeakHashMap weakHashMap = e4.v0.f22405a;
        e4.m0.j(view, fVar);
    }
}
