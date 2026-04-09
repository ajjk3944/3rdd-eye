package com.lefan.signal.ui.wifi;

import B4.r;
import D4.c;
import F4.d;
import K4.g;
import N4.a;
import Q4.e;
import a4.p;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import c.AbstractC0391p;
import c5.C0410g;
import com.apm.insight.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.lefan.signal.db.SquatterBean;
import com.lefan.signal.ui.wifi.SquatterDetailActivity;
import d5.y;
import h.AbstractActivityC2349g;
import q5.i;

/* loaded from: classes.dex */
public final class SquatterDetailActivity extends AbstractActivityC2349g {

    /* renamed from: R, reason: collision with root package name */
    public static final /* synthetic */ int f19374R = 0;

    /* renamed from: O, reason: collision with root package name */
    public g f19375O;

    /* renamed from: P, reason: collision with root package name */
    public final C0410g f19376P = new C0410g(new c(9, this));

    /* renamed from: Q, reason: collision with root package name */
    public SquatterBean f19377Q;

    @Override // h.AbstractActivityC2349g, c.AbstractActivityC0389n, G.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        AbstractC0391p.a(this);
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_squatter_detail, (ViewGroup) null, false);
        int i3 = R.id.app_bar;
        AppBarLayout appBarLayout = (AppBarLayout) p.e(R.id.app_bar, viewInflate);
        if (appBarLayout != null) {
            i3 = R.id.device_ip;
            AppCompatTextView appCompatTextView = (AppCompatTextView) p.e(R.id.device_ip, viewInflate);
            if (appCompatTextView != null) {
                i3 = R.id.device_known;
                SwitchMaterial switchMaterial = (SwitchMaterial) p.e(R.id.device_known, viewInflate);
                if (switchMaterial != null) {
                    i3 = R.id.device_mac;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) p.e(R.id.device_mac, viewInflate);
                    if (appCompatTextView2 != null) {
                        i3 = R.id.device_name;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) p.e(R.id.device_name, viewInflate);
                        if (appCompatTextView3 != null) {
                            i3 = R.id.device_type;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) p.e(R.id.device_type, viewInflate);
                            if (appCompatImageView != null) {
                                i3 = R.id.liner_ip;
                                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) p.e(R.id.liner_ip, viewInflate);
                                if (linearLayoutCompat != null) {
                                    i3 = R.id.liner_mac;
                                    LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) p.e(R.id.liner_mac, viewInflate);
                                    if (linearLayoutCompat2 != null) {
                                        i3 = R.id.liner_name;
                                        LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) p.e(R.id.liner_name, viewInflate);
                                        if (linearLayoutCompat3 != null) {
                                            i3 = R.id.liner_type;
                                            LinearLayoutCompat linearLayoutCompat4 = (LinearLayoutCompat) p.e(R.id.liner_type, viewInflate);
                                            if (linearLayoutCompat4 != null) {
                                                i3 = R.id.scroll_view;
                                                NestedScrollView nestedScrollView = (NestedScrollView) p.e(R.id.scroll_view, viewInflate);
                                                if (nestedScrollView != null) {
                                                    i3 = R.id.squatter_detail_toolbar;
                                                    Toolbar toolbar = (Toolbar) p.e(R.id.squatter_detail_toolbar, viewInflate);
                                                    if (toolbar != null) {
                                                        LinearLayoutCompat linearLayoutCompat5 = (LinearLayoutCompat) viewInflate;
                                                        this.f19375O = new g(linearLayoutCompat5, appBarLayout, appCompatTextView, switchMaterial, appCompatTextView2, appCompatTextView3, appCompatImageView, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, linearLayoutCompat4, nestedScrollView, toolbar);
                                                        setContentView(linearLayoutCompat5);
                                                        g gVar = this.f19375O;
                                                        if (gVar == null) {
                                                            i.g("binding");
                                                            throw null;
                                                        }
                                                        AppBarLayout appBarLayout2 = gVar.f2257c;
                                                        if (gVar == null) {
                                                            i.g("binding");
                                                            throw null;
                                                        }
                                                        d.a(appBarLayout2, gVar.f2262h);
                                                        g gVar2 = this.f19375O;
                                                        if (gVar2 == null) {
                                                            i.g("binding");
                                                            throw null;
                                                        }
                                                        Toolbar toolbar2 = gVar2.i;
                                                        B(toolbar2);
                                                        com.bumptech.glide.d dVarR = r();
                                                        if (dVarR != null) {
                                                            dVarR.S(true);
                                                        }
                                                        final int i6 = 0;
                                                        toolbar2.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: Y4.p

                                                            /* renamed from: b, reason: collision with root package name */
                                                            public final /* synthetic */ SquatterDetailActivity f4490b;

                                                            {
                                                                this.f4490b = this;
                                                            }

                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view) {
                                                                String mac;
                                                                int i7 = i6;
                                                                SquatterDetailActivity squatterDetailActivity = this.f4490b;
                                                                switch (i7) {
                                                                    case 0:
                                                                        int i8 = SquatterDetailActivity.f19374R;
                                                                        if (squatterDetailActivity.f19377Q != null) {
                                                                            Intent intent = new Intent();
                                                                            intent.putExtra("result_squatter", squatterDetailActivity.f19377Q);
                                                                            squatterDetailActivity.setResult(1006, intent);
                                                                            squatterDetailActivity.finish();
                                                                            break;
                                                                        } else {
                                                                            squatterDetailActivity.finish();
                                                                            break;
                                                                        }
                                                                    case 1:
                                                                        SquatterBean squatterBean = squatterDetailActivity.f19377Q;
                                                                        q5.i.b(squatterBean);
                                                                        String mac2 = squatterBean.getMac();
                                                                        if (mac2 != null && mac2.length() != 0) {
                                                                            k0.K kS = squatterDetailActivity.s();
                                                                            SquatterBean squatterBean2 = squatterDetailActivity.f19377Q;
                                                                            mac = squatterBean2 != null ? squatterBean2.getMac() : null;
                                                                            String string = squatterDetailActivity.getString(R.string.mac_address);
                                                                            if (kS != null) {
                                                                                B4.A a6 = new B4.A();
                                                                                a6.f687A0 = mac;
                                                                                a6.f688B0 = string;
                                                                                a6.e0(kS, "share_copy_dialog");
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    default:
                                                                        int i9 = SquatterDetailActivity.f19374R;
                                                                        k0.K kS2 = squatterDetailActivity.s();
                                                                        SquatterBean squatterBean3 = squatterDetailActivity.f19377Q;
                                                                        mac = squatterBean3 != null ? squatterBean3.getIp() : null;
                                                                        String string2 = squatterDetailActivity.getString(R.string.ip_address);
                                                                        if (kS2 != null) {
                                                                            B4.A a7 = new B4.A();
                                                                            a7.f687A0 = mac;
                                                                            a7.f688B0 = string2;
                                                                            a7.e0(kS2, "share_copy_dialog");
                                                                            break;
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        g gVar3 = this.f19375O;
                                                        if (gVar3 == null) {
                                                            i.g("binding");
                                                            throw null;
                                                        }
                                                        AppCompatTextView appCompatTextView4 = gVar3.f2260f;
                                                        if (gVar3 == null) {
                                                            i.g("binding");
                                                            throw null;
                                                        }
                                                        AppCompatTextView appCompatTextView5 = gVar3.f2259e;
                                                        if (gVar3 == null) {
                                                            i.g("binding");
                                                            throw null;
                                                        }
                                                        AppCompatImageView appCompatImageView2 = gVar3.f2261g;
                                                        if (gVar3 == null) {
                                                            i.g("binding");
                                                            throw null;
                                                        }
                                                        SwitchMaterial switchMaterial2 = (SwitchMaterial) gVar3.f2263j;
                                                        SquatterBean squatterBean = Build.VERSION.SDK_INT >= 33 ? (SquatterBean) getIntent().getSerializableExtra("squatter", SquatterBean.class) : (SquatterBean) getIntent().getSerializableExtra("squatter");
                                                        this.f19377Q = squatterBean;
                                                        if (squatterBean == null) {
                                                            return;
                                                        }
                                                        appCompatTextView5.setText(squatterBean.getMac());
                                                        g gVar4 = this.f19375O;
                                                        if (gVar4 == null) {
                                                            i.g("binding");
                                                            throw null;
                                                        }
                                                        AppCompatTextView appCompatTextView6 = gVar4.f2258d;
                                                        SquatterBean squatterBean2 = this.f19377Q;
                                                        appCompatTextView6.setText(squatterBean2 != null ? squatterBean2.getIp() : null);
                                                        SquatterBean squatterBean3 = this.f19377Q;
                                                        appCompatTextView4.setText(squatterBean3 != null ? squatterBean3.getBrand() : null);
                                                        SquatterBean squatterBean4 = this.f19377Q;
                                                        switchMaterial2.setChecked(squatterBean4 != null ? squatterBean4.isKnown() : false);
                                                        SquatterBean squatterBean5 = this.f19377Q;
                                                        i.b(squatterBean5);
                                                        switch (squatterBean5.getType()) {
                                                            case 1:
                                                                i = R.drawable.ic_phone_device;
                                                                break;
                                                            case 2:
                                                                i = R.drawable.ic_tablet;
                                                                break;
                                                            case 3:
                                                                i = R.drawable.ic_watch;
                                                                break;
                                                            case 4:
                                                                i = R.drawable.ic_computer;
                                                                break;
                                                            case 5:
                                                                i = R.drawable.ic_camera;
                                                                break;
                                                            case 6:
                                                                i = R.drawable.ic_tv_device;
                                                                break;
                                                            case 7:
                                                                i = R.drawable.ic_router_device;
                                                                break;
                                                            case 8:
                                                                i = R.drawable.ic_sound_device;
                                                                break;
                                                            case 9:
                                                                i = R.drawable.ic_device_printer;
                                                                break;
                                                            case 10:
                                                                i = R.drawable.ic_device_game;
                                                                break;
                                                            case 11:
                                                                i = R.drawable.ic_car;
                                                                break;
                                                            default:
                                                                i = R.drawable.ic_unknown_device;
                                                                break;
                                                        }
                                                        appCompatImageView2.setImageResource(i);
                                                        SquatterBean squatterBean6 = this.f19377Q;
                                                        String mac = squatterBean6 != null ? squatterBean6.getMac() : null;
                                                        if (mac == null || mac.length() == 0) {
                                                            g gVar5 = this.f19375O;
                                                            if (gVar5 == null) {
                                                                i.g("binding");
                                                                throw null;
                                                            }
                                                            ((LinearLayoutCompat) gVar5.f2265l).setVisibility(8);
                                                        }
                                                        SquatterBean squatterBean7 = this.f19377Q;
                                                        i.b(squatterBean7);
                                                        if (squatterBean7.isMy()) {
                                                            switchMaterial2.setVisibility(8);
                                                        }
                                                        SquatterBean squatterBean8 = this.f19377Q;
                                                        i.b(squatterBean8);
                                                        String mac2 = squatterBean8.getMac();
                                                        if (mac2 == null || mac2.length() == 0) {
                                                            switchMaterial2.setVisibility(8);
                                                            g gVar6 = this.f19375O;
                                                            if (gVar6 == null) {
                                                                i.g("binding");
                                                                throw null;
                                                            }
                                                            ((LinearLayoutCompat) gVar6.f2267n).setVisibility(8);
                                                            g gVar7 = this.f19375O;
                                                            if (gVar7 == null) {
                                                                i.g("binding");
                                                                throw null;
                                                            }
                                                            ((LinearLayoutCompat) gVar7.f2265l).setVisibility(8);
                                                        }
                                                        g gVar8 = this.f19375O;
                                                        if (gVar8 == null) {
                                                            i.g("binding");
                                                            throw null;
                                                        }
                                                        ((LinearLayoutCompat) gVar8.f2266m).setOnClickListener(new r(this, 13, appCompatTextView4));
                                                        g gVar9 = this.f19375O;
                                                        if (gVar9 == null) {
                                                            i.g("binding");
                                                            throw null;
                                                        }
                                                        final int i7 = 1;
                                                        ((LinearLayoutCompat) gVar9.f2265l).setOnClickListener(new View.OnClickListener(this) { // from class: Y4.p

                                                            /* renamed from: b, reason: collision with root package name */
                                                            public final /* synthetic */ SquatterDetailActivity f4490b;

                                                            {
                                                                this.f4490b = this;
                                                            }

                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view) {
                                                                String mac3;
                                                                int i72 = i7;
                                                                SquatterDetailActivity squatterDetailActivity = this.f4490b;
                                                                switch (i72) {
                                                                    case 0:
                                                                        int i8 = SquatterDetailActivity.f19374R;
                                                                        if (squatterDetailActivity.f19377Q != null) {
                                                                            Intent intent = new Intent();
                                                                            intent.putExtra("result_squatter", squatterDetailActivity.f19377Q);
                                                                            squatterDetailActivity.setResult(1006, intent);
                                                                            squatterDetailActivity.finish();
                                                                            break;
                                                                        } else {
                                                                            squatterDetailActivity.finish();
                                                                            break;
                                                                        }
                                                                    case 1:
                                                                        SquatterBean squatterBean9 = squatterDetailActivity.f19377Q;
                                                                        q5.i.b(squatterBean9);
                                                                        String mac22 = squatterBean9.getMac();
                                                                        if (mac22 != null && mac22.length() != 0) {
                                                                            k0.K kS = squatterDetailActivity.s();
                                                                            SquatterBean squatterBean22 = squatterDetailActivity.f19377Q;
                                                                            mac3 = squatterBean22 != null ? squatterBean22.getMac() : null;
                                                                            String string = squatterDetailActivity.getString(R.string.mac_address);
                                                                            if (kS != null) {
                                                                                B4.A a6 = new B4.A();
                                                                                a6.f687A0 = mac3;
                                                                                a6.f688B0 = string;
                                                                                a6.e0(kS, "share_copy_dialog");
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    default:
                                                                        int i9 = SquatterDetailActivity.f19374R;
                                                                        k0.K kS2 = squatterDetailActivity.s();
                                                                        SquatterBean squatterBean32 = squatterDetailActivity.f19377Q;
                                                                        mac3 = squatterBean32 != null ? squatterBean32.getIp() : null;
                                                                        String string2 = squatterDetailActivity.getString(R.string.ip_address);
                                                                        if (kS2 != null) {
                                                                            B4.A a7 = new B4.A();
                                                                            a7.f687A0 = mac3;
                                                                            a7.f688B0 = string2;
                                                                            a7.e0(kS2, "share_copy_dialog");
                                                                            break;
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        g gVar10 = this.f19375O;
                                                        if (gVar10 == null) {
                                                            i.g("binding");
                                                            throw null;
                                                        }
                                                        ((LinearLayoutCompat) gVar10.f2267n).setOnClickListener(new r(this, 14, appCompatImageView2));
                                                        switchMaterial2.setOnCheckedChangeListener(new a(2, this));
                                                        g gVar11 = this.f19375O;
                                                        if (gVar11 == null) {
                                                            i.g("binding");
                                                            throw null;
                                                        }
                                                        final int i8 = 2;
                                                        ((LinearLayoutCompat) gVar11.f2264k).setOnClickListener(new View.OnClickListener(this) { // from class: Y4.p

                                                            /* renamed from: b, reason: collision with root package name */
                                                            public final /* synthetic */ SquatterDetailActivity f4490b;

                                                            {
                                                                this.f4490b = this;
                                                            }

                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view) {
                                                                String mac3;
                                                                int i72 = i8;
                                                                SquatterDetailActivity squatterDetailActivity = this.f4490b;
                                                                switch (i72) {
                                                                    case 0:
                                                                        int i82 = SquatterDetailActivity.f19374R;
                                                                        if (squatterDetailActivity.f19377Q != null) {
                                                                            Intent intent = new Intent();
                                                                            intent.putExtra("result_squatter", squatterDetailActivity.f19377Q);
                                                                            squatterDetailActivity.setResult(1006, intent);
                                                                            squatterDetailActivity.finish();
                                                                            break;
                                                                        } else {
                                                                            squatterDetailActivity.finish();
                                                                            break;
                                                                        }
                                                                    case 1:
                                                                        SquatterBean squatterBean9 = squatterDetailActivity.f19377Q;
                                                                        q5.i.b(squatterBean9);
                                                                        String mac22 = squatterBean9.getMac();
                                                                        if (mac22 != null && mac22.length() != 0) {
                                                                            k0.K kS = squatterDetailActivity.s();
                                                                            SquatterBean squatterBean22 = squatterDetailActivity.f19377Q;
                                                                            mac3 = squatterBean22 != null ? squatterBean22.getMac() : null;
                                                                            String string = squatterDetailActivity.getString(R.string.mac_address);
                                                                            if (kS != null) {
                                                                                B4.A a6 = new B4.A();
                                                                                a6.f687A0 = mac3;
                                                                                a6.f688B0 = string;
                                                                                a6.e0(kS, "share_copy_dialog");
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    default:
                                                                        int i9 = SquatterDetailActivity.f19374R;
                                                                        k0.K kS2 = squatterDetailActivity.s();
                                                                        SquatterBean squatterBean32 = squatterDetailActivity.f19377Q;
                                                                        mac3 = squatterBean32 != null ? squatterBean32.getIp() : null;
                                                                        String string2 = squatterDetailActivity.getString(R.string.ip_address);
                                                                        if (kS2 != null) {
                                                                            B4.A a7 = new B4.A();
                                                                            a7.f687A0 = mac3;
                                                                            a7.f688B0 = string2;
                                                                            a7.e0(kS2, "share_copy_dialog");
                                                                            break;
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        y.a(o(), new e(4, this));
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
    }
}
