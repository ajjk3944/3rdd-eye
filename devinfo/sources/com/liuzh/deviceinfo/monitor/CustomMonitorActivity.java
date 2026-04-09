package com.liuzh.deviceinfo.monitor;

import ah.i;
import ah.o;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t0;
import com.google.android.gms.internal.ads.xz;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.monitor.CustomMonitorActivity;
import com.liuzh.deviceinfo.pro.ProActivity;
import e4.m0;
import e4.v0;
import ec.p2;
import hg.a;
import ig.l;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import nk.k;
import rg.f;
import wb.e;
import x.n0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class CustomMonitorActivity extends a {
    public static final /* synthetic */ int F = 0;
    public xz B;
    public final ArrayList C = new ArrayList();
    public final p2 D;
    public final i E;

    public CustomMonitorActivity() {
        int i4 = 2;
        this.D = new p2(i4, this);
        this.E = new i(i4, this);
    }

    public final boolean D() {
        n0 n0Var = wi.i.f36764a;
        if (Settings.canDrawOverlays(this)) {
            return true;
        }
        f.k0(this, R.string.monitor_floating_permission_desc, new l(21, this));
        return false;
    }

    public final void E(List list) {
        ArrayList arrayList = this.C;
        arrayList.clear();
        arrayList.addAll(list);
        xz xzVar = this.B;
        if (xzVar == null) {
            k.k("viewBinding");
            throw null;
        }
        t0 adapter = ((RecyclerView) xzVar.g).getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        xz xzVar2 = this.B;
        if (xzVar2 != null) {
            ((TextView) xzVar2.f18588e).setVisibility(arrayList.isEmpty() ? 0 : 8);
        } else {
            k.k("viewBinding");
            throw null;
        }
    }

    @Override // hg.a, i.g, d.j, r3.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final int i4 = 0;
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_custom_monitor, (ViewGroup) null, false);
        int i10 = R.id.btn_active_pro;
        TextView textView = (TextView) e.s(R.id.btn_active_pro, viewInflate);
        if (textView != null) {
            i10 = R.id.btn_add_monitor;
            Button button = (Button) e.s(R.id.btn_add_monitor, viewInflate);
            if (button != null) {
                i10 = R.id.content_container;
                LinearLayout linearLayout = (LinearLayout) e.s(R.id.content_container, viewInflate);
                if (linearLayout != null) {
                    i10 = R.id.empty_view;
                    TextView textView2 = (TextView) e.s(R.id.empty_view, viewInflate);
                    if (textView2 != null) {
                        i10 = R.id.pro_summary;
                        if (((TextView) e.s(R.id.pro_summary, viewInflate)) != null) {
                            i10 = R.id.pro_tips_card;
                            LinearLayout linearLayout2 = (LinearLayout) e.s(R.id.pro_tips_card, viewInflate);
                            if (linearLayout2 != null) {
                                i10 = R.id.recyclerview;
                                RecyclerView recyclerView = (RecyclerView) e.s(R.id.recyclerview, viewInflate);
                                if (recyclerView != null) {
                                    i10 = R.id.toolbar;
                                    Toolbar toolbar = (Toolbar) e.s(R.id.toolbar, viewInflate);
                                    if (toolbar != null) {
                                        FrameLayout frameLayout = (FrameLayout) viewInflate;
                                        this.B = new xz(frameLayout, textView, button, linearLayout, textView2, linearLayout2, recyclerView, toolbar);
                                        setContentView(frameLayout);
                                        xz xzVar = this.B;
                                        if (xzVar == null) {
                                            k.k("viewBinding");
                                            throw null;
                                        }
                                        z((Toolbar) xzVar.f18590h);
                                        A();
                                        xz xzVar2 = this.B;
                                        if (xzVar2 == null) {
                                            k.k("viewBinding");
                                            throw null;
                                        }
                                        zh.i.e((Toolbar) xzVar2.f18590h);
                                        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
                                        int iD = com.liuzh.deviceinfo.utilities.f.d();
                                        xz xzVar3 = this.B;
                                        if (xzVar3 == null) {
                                            k.k("viewBinding");
                                            throw null;
                                        }
                                        Button button2 = (Button) xzVar3.f18586c;
                                        Drawable background = button2.getBackground();
                                        k.d(background, "getBackground(...)");
                                        button2.setBackground(e.M(background, iD));
                                        xz xzVar4 = this.B;
                                        if (xzVar4 == null) {
                                            k.k("viewBinding");
                                            throw null;
                                        }
                                        ((Button) xzVar4.f18586c).setOnClickListener(new View.OnClickListener(this) { // from class: wg.h

                                            /* renamed from: b, reason: collision with root package name */
                                            public final /* synthetic */ CustomMonitorActivity f36677b;

                                            {
                                                this.f36677b = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i11 = i4;
                                                CustomMonitorActivity customMonitorActivity = this.f36677b;
                                                switch (i11) {
                                                    case 0:
                                                        int i12 = CustomMonitorActivity.F;
                                                        if (customMonitorActivity.D()) {
                                                            new xg.g().h0(customMonitorActivity.s(), "EditMonitorDialog");
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        int i13 = CustomMonitorActivity.F;
                                                        ProActivity.D(customMonitorActivity);
                                                        break;
                                                }
                                            }
                                        });
                                        xz xzVar5 = this.B;
                                        if (xzVar5 == null) {
                                            k.k("viewBinding");
                                            throw null;
                                        }
                                        ((RecyclerView) xzVar5.g).setAdapter(new ej.e(4, this));
                                        List listB = fVar.b();
                                        k.d(listB, "getCustomMonitors(...)");
                                        E(listB);
                                        com.liuzh.deviceinfo.utilities.f.n(this.D);
                                        o oVar = o.f400d;
                                        boolean zC = oVar.c();
                                        i iVar = this.E;
                                        iVar.i(zC);
                                        xz xzVar6 = this.B;
                                        if (xzVar6 == null) {
                                            k.k("viewBinding");
                                            throw null;
                                        }
                                        final int i11 = 1;
                                        ((TextView) xzVar6.f18585b).setOnClickListener(new View.OnClickListener(this) { // from class: wg.h

                                            /* renamed from: b, reason: collision with root package name */
                                            public final /* synthetic */ CustomMonitorActivity f36677b;

                                            {
                                                this.f36677b = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i112 = i11;
                                                CustomMonitorActivity customMonitorActivity = this.f36677b;
                                                switch (i112) {
                                                    case 0:
                                                        int i12 = CustomMonitorActivity.F;
                                                        if (customMonitorActivity.D()) {
                                                            new xg.g().h0(customMonitorActivity.s(), "EditMonitorDialog");
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        int i13 = CustomMonitorActivity.F;
                                                        ProActivity.D(customMonitorActivity);
                                                        break;
                                                }
                                            }
                                        });
                                        oVar.b(iVar);
                                        xz xzVar7 = this.B;
                                        if (xzVar7 == null) {
                                            k.k("viewBinding");
                                            throw null;
                                        }
                                        FrameLayout frameLayout2 = (FrameLayout) xzVar7.f18584a;
                                        lf.e eVar = new lf.e(18, this);
                                        WeakHashMap weakHashMap = v0.f22405a;
                                        m0.j(frameLayout2, eVar);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    @Override // i.g, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        com.liuzh.deviceinfo.utilities.f.f21257c.unregisterOnSharedPreferenceChangeListener(this.D);
        o.f400d.h(this.E);
    }
}
