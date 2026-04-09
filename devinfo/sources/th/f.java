package th;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.f1;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.RecyclerView;
import bl.z;
import com.google.android.gms.internal.consent_sdk.a0;
import com.google.android.gms.internal.measurement.j4;
import com.google.android.material.button.MaterialButton;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.utilities.y;
import com.liuzho.module.app_analyzer.ui.AppsAnalyzeActivity;
import e4.m0;
import e4.v0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import nk.v;
import p.v1;
import p.z2;
import xk.g0;
import xk.x;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f extends sh.a {
    public a0 Z;

    /* renamed from: a0, reason: collision with root package name */
    public final h f34611a0 = new h(new z(7, this));

    /* renamed from: b0, reason: collision with root package name */
    public i0.f f34612b0;

    /* renamed from: c0, reason: collision with root package name */
    public i f34613c0;

    /* renamed from: d0, reason: collision with root package name */
    public final f1 f34614d0;

    public f() {
        yj.f fVarT = a.a.t(yj.g.f37636b, new b2.b(28, new b2.b(27, this)));
        this.f34614d0 = new f1(v.a(q.class), new ej.h(fVarT, 14), new c2.c(19, this, fVarT), new ej.h(fVarT, 15));
    }

    @Override // b5.z
    public final void F(Bundle bundle) {
        super.F(bundle);
        this.f34612b0 = new i0.f(W(), this);
    }

    @Override // b5.z
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        nk.k.e(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.tab_apps, viewGroup, false);
        int i4 = R.id.btn_analyze;
        MaterialButton materialButton = (MaterialButton) wb.e.s(R.id.btn_analyze, viewInflate);
        if (materialButton != null) {
            i4 = R.id.btn_retry;
            MaterialButton materialButton2 = (MaterialButton) wb.e.s(R.id.btn_retry, viewInflate);
            if (materialButton2 != null) {
                i4 = R.id.btn_sort;
                ImageView imageView = (ImageView) wb.e.s(R.id.btn_sort, viewInflate);
                if (imageView != null) {
                    i4 = R.id.empty_content;
                    LinearLayout linearLayout = (LinearLayout) wb.e.s(R.id.empty_content, viewInflate);
                    if (linearLayout != null) {
                        i4 = R.id.permission_container;
                        FrameLayout frameLayout = (FrameLayout) wb.e.s(R.id.permission_container, viewInflate);
                        if (frameLayout != null) {
                            i4 = R.id.progress;
                            ProgressBar progressBar = (ProgressBar) wb.e.s(R.id.progress, viewInflate);
                            if (progressBar != null) {
                                i4 = R.id.recycler_view;
                                RecyclerView recyclerView = (RecyclerView) wb.e.s(R.id.recycler_view, viewInflate);
                                if (recyclerView != null) {
                                    i4 = R.id.spinner;
                                    AppCompatSpinner appCompatSpinner = (AppCompatSpinner) wb.e.s(R.id.spinner, viewInflate);
                                    if (appCompatSpinner != null) {
                                        i4 = R.id.spinner_container;
                                        FrameLayout frameLayout2 = (FrameLayout) wb.e.s(R.id.spinner_container, viewInflate);
                                        if (frameLayout2 != null) {
                                            i4 = R.id.tv_apps_count;
                                            TextView textView = (TextView) wb.e.s(R.id.tv_apps_count, viewInflate);
                                            if (textView != null) {
                                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                this.Z = new a0(constraintLayout, materialButton, materialButton2, imageView, linearLayout, frameLayout, progressBar, recyclerView, appCompatSpinner, frameLayout2, textView);
                                                nk.k.d(constraintLayout, "getRoot(...)");
                                                return constraintLayout;
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }

    @Override // b5.z
    public final void R(View view, Bundle bundle) throws Resources.NotFoundException {
        nk.k.e(view, "view");
        ArrayList arrayList = zh.i.f38298a;
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        int iD = com.liuzh.deviceinfo.utilities.f.d();
        a0 a0Var = this.Z;
        if (a0Var == null) {
            nk.k.k("binding");
            throw null;
        }
        dj.b.k((RecyclerView) a0Var.f19260h, iD);
        a0 a0Var2 = this.Z;
        if (a0Var2 == null) {
            nk.k.k("binding");
            throw null;
        }
        dj.b.q((MaterialButton) a0Var2.f19256c, iD);
        a0 a0Var3 = this.Z;
        if (a0Var3 == null) {
            nk.k.k("binding");
            throw null;
        }
        dj.b.i((ProgressBar) a0Var3.g, iD);
        a0 a0Var4 = this.Z;
        if (a0Var4 == null) {
            nk.k.k("binding");
            throw null;
        }
        ((RecyclerView) a0Var4.f19260h).setAdapter(this.f34611a0);
        Context contextW = W();
        a0 a0Var5 = this.Z;
        if (a0Var5 == null) {
            nk.k.k("binding");
            throw null;
        }
        zh.e.a(contextW, (RecyclerView) a0Var5.f19260h);
        int integer = t().getInteger(R.integer.recyclerview_grid_span_count_1_2);
        int dimensionPixelOffset = t().getDimensionPixelOffset(R.dimen.content_padding);
        a0 a0Var6 = this.Z;
        if (a0Var6 == null) {
            nk.k.k("binding");
            throw null;
        }
        ((RecyclerView) a0Var6.f19260h).i(new ig.c(dimensionPixelOffset, integer));
        a0 a0Var7 = this.Z;
        if (a0Var7 == null) {
            nk.k.k("binding");
            throw null;
        }
        final int i4 = 2;
        ((AppCompatSpinner) a0Var7.f19261i).setOnItemSelectedListener(new v1(i4, this));
        a0 a0Var8 = this.Z;
        if (a0Var8 == null) {
            nk.k.k("binding");
            throw null;
        }
        AppCompatSpinner appCompatSpinner = (AppCompatSpinner) a0Var8.f19261i;
        if (!appCompatSpinner.isLaidOut() || appCompatSpinner.isLayoutRequested()) {
            appCompatSpinner.addOnLayoutChangeListener(new nc.a(3, this));
        } else {
            a0 a0Var9 = this.Z;
            if (a0Var9 == null) {
                nk.k.k("binding");
                throw null;
            }
            if (((AppCompatSpinner) a0Var9.f19261i).getMeasuredWidth() >= 0) {
                a0 a0Var10 = this.Z;
                if (a0Var10 == null) {
                    nk.k.k("binding");
                    throw null;
                }
                AppCompatSpinner appCompatSpinner2 = (AppCompatSpinner) a0Var10.f19261i;
                appCompatSpinner2.setDropDownWidth(appCompatSpinner2.getMeasuredWidth());
            }
        }
        final int i10 = 0;
        final int i11 = 1;
        if (com.liuzh.deviceinfo.utilities.d.k()) {
            a0 a0Var11 = this.Z;
            if (a0Var11 == null) {
                nk.k.k("binding");
                throw null;
            }
            y.k((MaterialButton) a0Var11.f19255b);
        }
        a0 a0Var12 = this.Z;
        if (a0Var12 == null) {
            nk.k.k("binding");
            throw null;
        }
        MaterialButton materialButton = (MaterialButton) a0Var12.f19255b;
        Drawable background = materialButton.getBackground();
        nk.k.d(background, "getBackground(...)");
        materialButton.setBackground(wb.e.M(background, iD));
        a0 a0Var13 = this.Z;
        if (a0Var13 == null) {
            nk.k.k("binding");
            throw null;
        }
        ((MaterialButton) a0Var13.f19255b).setOnClickListener(new View.OnClickListener(this) { // from class: th.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f34602b;

            {
                this.f34602b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i10;
                ck.c cVar = null;
                f fVar2 = this.f34602b;
                switch (i12) {
                    case 0:
                        if (!zg.c.b()) {
                            zg.a.a(fVar2.W(), new c(fVar2, 0));
                            break;
                        } else {
                            Context contextW2 = fVar2.W();
                            int i13 = AppsAnalyzeActivity.S;
                            Intent intent = new Intent(contextW2, (Class<?>) AppsAnalyzeActivity.class);
                            intent.putExtra("type", 2);
                            contextW2.startActivity(intent);
                            cg.a.f2848b.f(null, "app_ana_click");
                            break;
                        }
                    case 1:
                        q qVarH0 = fVar2.h0();
                        qVarH0.getClass();
                        i5.a aVarG = y0.g(qVarH0);
                        el.e eVar = g0.f37189a;
                        x.v(aVarG, cl.o.f2935a, null, new al.k(qVarH0, cVar, 17), 2);
                        break;
                    default:
                        String[] strArr = {fVar2.u(R.string.sort_by_name_asc), fVar2.u(R.string.sort_by_name_desc), fVar2.u(R.string.sort_by_apk_size_asc), fVar2.u(R.string.sort_by_apk_size_desc), fVar2.u(R.string.sort_by_update_time_asc), fVar2.u(R.string.sort_by_update_time_desc)};
                        t7.m mVar = new t7.m(fVar2.W());
                        mVar.y(R.string.menu_sort);
                        eg.d dVar = new eg.d(8, fVar2);
                        i.b bVar = (i.b) mVar.f34474c;
                        bVar.f25244q = strArr;
                        bVar.f25246s = dVar;
                        mVar.w(R.string.cancel, null);
                        mVar.A();
                        break;
                }
            }
        });
        a0 a0Var14 = this.Z;
        if (a0Var14 == null) {
            nk.k.k("binding");
            throw null;
        }
        ((MaterialButton) a0Var14.f19256c).setOnClickListener(new View.OnClickListener(this) { // from class: th.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f34602b;

            {
                this.f34602b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i11;
                ck.c cVar = null;
                f fVar2 = this.f34602b;
                switch (i12) {
                    case 0:
                        if (!zg.c.b()) {
                            zg.a.a(fVar2.W(), new c(fVar2, 0));
                            break;
                        } else {
                            Context contextW2 = fVar2.W();
                            int i13 = AppsAnalyzeActivity.S;
                            Intent intent = new Intent(contextW2, (Class<?>) AppsAnalyzeActivity.class);
                            intent.putExtra("type", 2);
                            contextW2.startActivity(intent);
                            cg.a.f2848b.f(null, "app_ana_click");
                            break;
                        }
                    case 1:
                        q qVarH0 = fVar2.h0();
                        qVarH0.getClass();
                        i5.a aVarG = y0.g(qVarH0);
                        el.e eVar = g0.f37189a;
                        x.v(aVarG, cl.o.f2935a, null, new al.k(qVarH0, cVar, 17), 2);
                        break;
                    default:
                        String[] strArr = {fVar2.u(R.string.sort_by_name_asc), fVar2.u(R.string.sort_by_name_desc), fVar2.u(R.string.sort_by_apk_size_asc), fVar2.u(R.string.sort_by_apk_size_desc), fVar2.u(R.string.sort_by_update_time_asc), fVar2.u(R.string.sort_by_update_time_desc)};
                        t7.m mVar = new t7.m(fVar2.W());
                        mVar.y(R.string.menu_sort);
                        eg.d dVar = new eg.d(8, fVar2);
                        i.b bVar = (i.b) mVar.f34474c;
                        bVar.f25244q = strArr;
                        bVar.f25246s = dVar;
                        mVar.w(R.string.cancel, null);
                        mVar.A();
                        break;
                }
            }
        });
        a0 a0Var15 = this.Z;
        if (a0Var15 == null) {
            nk.k.k("binding");
            throw null;
        }
        ((ImageView) a0Var15.f19257d).setOnClickListener(new View.OnClickListener(this) { // from class: th.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f34602b;

            {
                this.f34602b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i4;
                ck.c cVar = null;
                f fVar2 = this.f34602b;
                switch (i12) {
                    case 0:
                        if (!zg.c.b()) {
                            zg.a.a(fVar2.W(), new c(fVar2, 0));
                            break;
                        } else {
                            Context contextW2 = fVar2.W();
                            int i13 = AppsAnalyzeActivity.S;
                            Intent intent = new Intent(contextW2, (Class<?>) AppsAnalyzeActivity.class);
                            intent.putExtra("type", 2);
                            contextW2.startActivity(intent);
                            cg.a.f2848b.f(null, "app_ana_click");
                            break;
                        }
                    case 1:
                        q qVarH0 = fVar2.h0();
                        qVarH0.getClass();
                        i5.a aVarG = y0.g(qVarH0);
                        el.e eVar = g0.f37189a;
                        x.v(aVarG, cl.o.f2935a, null, new al.k(qVarH0, cVar, 17), 2);
                        break;
                    default:
                        String[] strArr = {fVar2.u(R.string.sort_by_name_asc), fVar2.u(R.string.sort_by_name_desc), fVar2.u(R.string.sort_by_apk_size_asc), fVar2.u(R.string.sort_by_apk_size_desc), fVar2.u(R.string.sort_by_update_time_asc), fVar2.u(R.string.sort_by_update_time_desc)};
                        t7.m mVar = new t7.m(fVar2.W());
                        mVar.y(R.string.menu_sort);
                        eg.d dVar = new eg.d(8, fVar2);
                        i.b bVar = (i.b) mVar.f34474c;
                        bVar.f25244q = strArr;
                        bVar.f25246s = dVar;
                        mVar.w(R.string.cancel, null);
                        mVar.A();
                        break;
                }
            }
        });
        com.applovin.impl.sdk.ad.f fVar2 = new com.applovin.impl.sdk.ad.f(22, view, this);
        WeakHashMap weakHashMap = v0.f22405a;
        m0.j(view, fVar2);
        i.g gVarU = U();
        i iVar = new i(this, h0());
        this.f34613c0 = iVar;
        gVarU.l(iVar, v());
        int i12 = 13;
        h0().f34653h.e(v(), new bh.i(new mk.c(this) { // from class: th.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f34604b;

            {
                this.f34604b = this;
            }

            @Override // mk.c
            public final Object invoke(Object obj) throws Resources.NotFoundException {
                int i13 = i10;
                u uVar = u.f37649a;
                f fVar3 = this.f34604b;
                switch (i13) {
                    case 0:
                        m mVar = (m) obj;
                        k kVar = mVar.f34637a;
                        String str = mVar.f34639c;
                        List list = mVar.f34638b;
                        list.size();
                        Objects.toString(kVar);
                        h hVar = fVar3.f34611a0;
                        hVar.getClass();
                        ArrayList arrayList2 = hVar.f34618k;
                        arrayList2.clear();
                        arrayList2.addAll(list);
                        if (!hVar.j) {
                            hVar.notifyDataSetChanged();
                        }
                        if (!vk.i.H0(str)) {
                            List list2 = mVar.f34640d;
                            hVar.j = true;
                            ArrayList arrayList3 = hVar.f34619l;
                            arrayList3.clear();
                            arrayList3.addAll(list2);
                            hVar.notifyDataSetChanged();
                        } else if (hVar.j) {
                            hVar.j = false;
                            hVar.notifyDataSetChanged();
                        }
                        a0 a0Var16 = fVar3.Z;
                        if (a0Var16 == null) {
                            nk.k.k("binding");
                            throw null;
                        }
                        ((TextView) a0Var16.f19262k).setText(String.valueOf(hVar.getItemCount()));
                        int iOrdinal = mVar.f34637a.ordinal();
                        if (iOrdinal == 0) {
                            a0 a0Var17 = fVar3.Z;
                            if (a0Var17 == null) {
                                nk.k.k("binding");
                                throw null;
                            }
                            ((ProgressBar) a0Var17.g).setVisibility(0);
                            a0 a0Var18 = fVar3.Z;
                            if (a0Var18 == null) {
                                nk.k.k("binding");
                                throw null;
                            }
                            ((RecyclerView) a0Var18.f19260h).setVisibility(8);
                            a0 a0Var19 = fVar3.Z;
                            if (a0Var19 == null) {
                                nk.k.k("binding");
                                throw null;
                            }
                            ((LinearLayout) a0Var19.f19258e).setVisibility(8);
                            a0 a0Var20 = fVar3.Z;
                            if (a0Var20 == null) {
                                nk.k.k("binding");
                                throw null;
                            }
                            ((FrameLayout) a0Var20.f19259f).removeAllViews();
                            a0 a0Var21 = fVar3.Z;
                            if (a0Var21 == null) {
                                nk.k.k("binding");
                                throw null;
                            }
                            ((FrameLayout) a0Var21.f19259f).setVisibility(8);
                        } else {
                            if (iOrdinal == 1) {
                                a0 a0Var22 = fVar3.Z;
                                if (a0Var22 == null) {
                                    nk.k.k("binding");
                                    throw null;
                                }
                                ((ProgressBar) a0Var22.g).setVisibility(8);
                                a0 a0Var23 = fVar3.Z;
                                if (a0Var23 == null) {
                                    nk.k.k("binding");
                                    throw null;
                                }
                                ((RecyclerView) a0Var23.f19260h).setVisibility(8);
                                a0 a0Var24 = fVar3.Z;
                                if (a0Var24 == null) {
                                    nk.k.k("binding");
                                    throw null;
                                }
                                ((LinearLayout) a0Var24.f19258e).setVisibility(8);
                                a0 a0Var25 = fVar3.Z;
                                if (a0Var25 == null) {
                                    nk.k.k("binding");
                                    throw null;
                                }
                                ((FrameLayout) a0Var25.f19259f).setVisibility(0);
                                LayoutInflater layoutInflaterQ = fVar3.q();
                                nk.k.d(layoutInflaterQ, "getLayoutInflater(...)");
                                a0 a0Var26 = fVar3.Z;
                                if (a0Var26 == null) {
                                    nk.k.k("binding");
                                    throw null;
                                }
                                FrameLayout frameLayout = (FrameLayout) a0Var26.f19259f;
                                c cVar = new c(fVar3, i);
                                View viewInflate = layoutInflaterQ.inflate(R.layout.card_apps_permission_require, (ViewGroup) frameLayout, false);
                                frameLayout.addView(viewInflate);
                                int i14 = R.id.btn_grant;
                                MaterialButton materialButton2 = (MaterialButton) wb.e.s(R.id.btn_grant, viewInflate);
                                if (materialButton2 != null) {
                                    i14 = R.id.msg;
                                    TextView textView = (TextView) wb.e.s(R.id.msg, viewInflate);
                                    if (textView != null) {
                                        i14 = R.id.title;
                                        if (((TextView) wb.e.s(R.id.title, viewInflate)) != null) {
                                            String string = DeviceInfoApp.f21145f.getString(R.string.allapps_permission_require);
                                            Spanned spannedF = Build.VERSION.SDK_INT >= 24 ? j4.f(string) : Html.fromHtml(string);
                                            nk.k.d(spannedF, "fromHtml(...)");
                                            textView.setText(spannedF);
                                            com.liuzh.deviceinfo.utilities.f fVar4 = com.liuzh.deviceinfo.utilities.f.f21256b;
                                            dj.b.q(materialButton2, com.liuzh.deviceinfo.utilities.f.d());
                                            materialButton2.setOnClickListener(new yh.e(1, cVar));
                                        }
                                    }
                                }
                                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i14)));
                            }
                            if (iOrdinal != 2) {
                                throw new ac.m();
                            }
                            a0 a0Var27 = fVar3.Z;
                            if (a0Var27 == null) {
                                nk.k.k("binding");
                                throw null;
                            }
                            ((ProgressBar) a0Var27.g).setVisibility(8);
                            if (vk.i.H0(str)) {
                                i = hVar.getItemCount() != 0 ? 0 : 1;
                                a0 a0Var28 = fVar3.Z;
                                if (a0Var28 == null) {
                                    nk.k.k("binding");
                                    throw null;
                                }
                                ((RecyclerView) a0Var28.f19260h).setVisibility(i == 0 ? 0 : 8);
                                a0 a0Var29 = fVar3.Z;
                                if (a0Var29 == null) {
                                    nk.k.k("binding");
                                    throw null;
                                }
                                ((LinearLayout) a0Var29.f19258e).setVisibility(i == 0 ? 8 : 0);
                            } else {
                                a0 a0Var30 = fVar3.Z;
                                if (a0Var30 == null) {
                                    nk.k.k("binding");
                                    throw null;
                                }
                                ((RecyclerView) a0Var30.f19260h).setVisibility(0);
                                a0 a0Var31 = fVar3.Z;
                                if (a0Var31 == null) {
                                    nk.k.k("binding");
                                    throw null;
                                }
                                ((LinearLayout) a0Var31.f19258e).setVisibility(8);
                            }
                            a0 a0Var32 = fVar3.Z;
                            if (a0Var32 == null) {
                                nk.k.k("binding");
                                throw null;
                            }
                            ((FrameLayout) a0Var32.f19259f).removeAllViews();
                            a0 a0Var33 = fVar3.Z;
                            if (a0Var33 == null) {
                                nk.k.k("binding");
                                throw null;
                            }
                            ((FrameLayout) a0Var33.f19259f).setVisibility(8);
                        }
                        return uVar;
                    default:
                        n nVar = (n) obj;
                        if ((nVar == null ? -1 : d.f34607a[nVar.ordinal()]) != 1) {
                            throw new ac.m();
                        }
                        zg.a.b(fVar3.W());
                        return uVar;
                }
            }
        }, i12));
        h0().g.e(v(), new bh.i(new mk.c(this) { // from class: th.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f34604b;

            {
                this.f34604b = this;
            }

            @Override // mk.c
            public final Object invoke(Object obj) throws Resources.NotFoundException {
                int i13 = i11;
                u uVar = u.f37649a;
                f fVar3 = this.f34604b;
                switch (i13) {
                    case 0:
                        m mVar = (m) obj;
                        k kVar = mVar.f34637a;
                        String str = mVar.f34639c;
                        List list = mVar.f34638b;
                        list.size();
                        Objects.toString(kVar);
                        h hVar = fVar3.f34611a0;
                        hVar.getClass();
                        ArrayList arrayList2 = hVar.f34618k;
                        arrayList2.clear();
                        arrayList2.addAll(list);
                        if (!hVar.j) {
                            hVar.notifyDataSetChanged();
                        }
                        if (!vk.i.H0(str)) {
                            List list2 = mVar.f34640d;
                            hVar.j = true;
                            ArrayList arrayList3 = hVar.f34619l;
                            arrayList3.clear();
                            arrayList3.addAll(list2);
                            hVar.notifyDataSetChanged();
                        } else if (hVar.j) {
                            hVar.j = false;
                            hVar.notifyDataSetChanged();
                        }
                        a0 a0Var16 = fVar3.Z;
                        if (a0Var16 == null) {
                            nk.k.k("binding");
                            throw null;
                        }
                        ((TextView) a0Var16.f19262k).setText(String.valueOf(hVar.getItemCount()));
                        int iOrdinal = mVar.f34637a.ordinal();
                        if (iOrdinal == 0) {
                            a0 a0Var17 = fVar3.Z;
                            if (a0Var17 == null) {
                                nk.k.k("binding");
                                throw null;
                            }
                            ((ProgressBar) a0Var17.g).setVisibility(0);
                            a0 a0Var18 = fVar3.Z;
                            if (a0Var18 == null) {
                                nk.k.k("binding");
                                throw null;
                            }
                            ((RecyclerView) a0Var18.f19260h).setVisibility(8);
                            a0 a0Var19 = fVar3.Z;
                            if (a0Var19 == null) {
                                nk.k.k("binding");
                                throw null;
                            }
                            ((LinearLayout) a0Var19.f19258e).setVisibility(8);
                            a0 a0Var20 = fVar3.Z;
                            if (a0Var20 == null) {
                                nk.k.k("binding");
                                throw null;
                            }
                            ((FrameLayout) a0Var20.f19259f).removeAllViews();
                            a0 a0Var21 = fVar3.Z;
                            if (a0Var21 == null) {
                                nk.k.k("binding");
                                throw null;
                            }
                            ((FrameLayout) a0Var21.f19259f).setVisibility(8);
                        } else {
                            if (iOrdinal == 1) {
                                a0 a0Var22 = fVar3.Z;
                                if (a0Var22 == null) {
                                    nk.k.k("binding");
                                    throw null;
                                }
                                ((ProgressBar) a0Var22.g).setVisibility(8);
                                a0 a0Var23 = fVar3.Z;
                                if (a0Var23 == null) {
                                    nk.k.k("binding");
                                    throw null;
                                }
                                ((RecyclerView) a0Var23.f19260h).setVisibility(8);
                                a0 a0Var24 = fVar3.Z;
                                if (a0Var24 == null) {
                                    nk.k.k("binding");
                                    throw null;
                                }
                                ((LinearLayout) a0Var24.f19258e).setVisibility(8);
                                a0 a0Var25 = fVar3.Z;
                                if (a0Var25 == null) {
                                    nk.k.k("binding");
                                    throw null;
                                }
                                ((FrameLayout) a0Var25.f19259f).setVisibility(0);
                                LayoutInflater layoutInflaterQ = fVar3.q();
                                nk.k.d(layoutInflaterQ, "getLayoutInflater(...)");
                                a0 a0Var26 = fVar3.Z;
                                if (a0Var26 == null) {
                                    nk.k.k("binding");
                                    throw null;
                                }
                                FrameLayout frameLayout = (FrameLayout) a0Var26.f19259f;
                                c cVar = new c(fVar3, i);
                                View viewInflate = layoutInflaterQ.inflate(R.layout.card_apps_permission_require, (ViewGroup) frameLayout, false);
                                frameLayout.addView(viewInflate);
                                int i14 = R.id.btn_grant;
                                MaterialButton materialButton2 = (MaterialButton) wb.e.s(R.id.btn_grant, viewInflate);
                                if (materialButton2 != null) {
                                    i14 = R.id.msg;
                                    TextView textView = (TextView) wb.e.s(R.id.msg, viewInflate);
                                    if (textView != null) {
                                        i14 = R.id.title;
                                        if (((TextView) wb.e.s(R.id.title, viewInflate)) != null) {
                                            String string = DeviceInfoApp.f21145f.getString(R.string.allapps_permission_require);
                                            Spanned spannedF = Build.VERSION.SDK_INT >= 24 ? j4.f(string) : Html.fromHtml(string);
                                            nk.k.d(spannedF, "fromHtml(...)");
                                            textView.setText(spannedF);
                                            com.liuzh.deviceinfo.utilities.f fVar4 = com.liuzh.deviceinfo.utilities.f.f21256b;
                                            dj.b.q(materialButton2, com.liuzh.deviceinfo.utilities.f.d());
                                            materialButton2.setOnClickListener(new yh.e(1, cVar));
                                        }
                                    }
                                }
                                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i14)));
                            }
                            if (iOrdinal != 2) {
                                throw new ac.m();
                            }
                            a0 a0Var27 = fVar3.Z;
                            if (a0Var27 == null) {
                                nk.k.k("binding");
                                throw null;
                            }
                            ((ProgressBar) a0Var27.g).setVisibility(8);
                            if (vk.i.H0(str)) {
                                i = hVar.getItemCount() != 0 ? 0 : 1;
                                a0 a0Var28 = fVar3.Z;
                                if (a0Var28 == null) {
                                    nk.k.k("binding");
                                    throw null;
                                }
                                ((RecyclerView) a0Var28.f19260h).setVisibility(i == 0 ? 0 : 8);
                                a0 a0Var29 = fVar3.Z;
                                if (a0Var29 == null) {
                                    nk.k.k("binding");
                                    throw null;
                                }
                                ((LinearLayout) a0Var29.f19258e).setVisibility(i == 0 ? 8 : 0);
                            } else {
                                a0 a0Var30 = fVar3.Z;
                                if (a0Var30 == null) {
                                    nk.k.k("binding");
                                    throw null;
                                }
                                ((RecyclerView) a0Var30.f19260h).setVisibility(0);
                                a0 a0Var31 = fVar3.Z;
                                if (a0Var31 == null) {
                                    nk.k.k("binding");
                                    throw null;
                                }
                                ((LinearLayout) a0Var31.f19258e).setVisibility(8);
                            }
                            a0 a0Var32 = fVar3.Z;
                            if (a0Var32 == null) {
                                nk.k.k("binding");
                                throw null;
                            }
                            ((FrameLayout) a0Var32.f19259f).removeAllViews();
                            a0 a0Var33 = fVar3.Z;
                            if (a0Var33 == null) {
                                nk.k.k("binding");
                                throw null;
                            }
                            ((FrameLayout) a0Var33.f19259f).setVisibility(8);
                        }
                        return uVar;
                    default:
                        n nVar = (n) obj;
                        if ((nVar == null ? -1 : d.f34607a[nVar.ordinal()]) != 1) {
                            throw new ac.m();
                        }
                        zg.a.b(fVar3.W());
                        return uVar;
                }
            }
        }, i12));
    }

    @Override // hg.d
    public final boolean d0() {
        i iVar = this.f34613c0;
        if (iVar == null) {
            nk.k.k("menuProvider");
            throw null;
        }
        z2 z2Var = iVar.f34622c;
        if (z2Var == null || z2Var.P) {
            return false;
        }
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = z2Var.f30931p;
        searchView$SearchAutoComplete.setText("");
        searchView$SearchAutoComplete.setSelection(searchView$SearchAutoComplete.length());
        z2Var.f30923b0 = "";
        z2Var.setIconified(true);
        return true;
    }

    public final q h0() {
        return (q) this.f34614d0.getValue();
    }
}
