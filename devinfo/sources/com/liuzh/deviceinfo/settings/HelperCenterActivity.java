package com.liuzh.deviceinfo.settings;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.settings.HelperCenterActivity;
import com.liuzh.deviceinfo.utilities.l;
import com.liuzh.deviceinfo.view.SettingsItemView;
import e4.m0;
import e4.v0;
import hg.a;
import i0.f;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import je.u;
import vk.i;
import wb.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class HelperCenterActivity extends a {
    public static final /* synthetic */ int B = 0;

    public static String D(String str) {
        String strN = l.N(str);
        if (strN == null || i.H0(strN)) {
            return "";
        }
        return str + "=" + strN + "\n";
    }

    @Override // hg.a, i.g, d.j, r3.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final int i4 = 0;
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_helper_center, (ViewGroup) null, false);
        int i10 = R.id.build_time;
        SettingsItemView settingsItemView = (SettingsItemView) e.s(R.id.build_time, viewInflate);
        if (settingsItemView != null) {
            i10 = R.id.feedback_info;
            SettingsItemView settingsItemView2 = (SettingsItemView) e.s(R.id.feedback_info, viewInflate);
            if (settingsItemView2 != null) {
                i10 = R.id.list_container;
                LinearLayout linearLayout = (LinearLayout) e.s(R.id.list_container, viewInflate);
                if (linearLayout != null) {
                    i10 = R.id.toolbar;
                    Toolbar toolbar = (Toolbar) e.s(R.id.toolbar, viewInflate);
                    if (toolbar != null) {
                        FrameLayout frameLayout = (FrameLayout) viewInflate;
                        f fVar = new f(frameLayout, settingsItemView, settingsItemView2, linearLayout, toolbar);
                        setContentView(frameLayout);
                        z(toolbar);
                        zh.i.e(toolbar);
                        A();
                        settingsItemView2.setOnClickListener(new View.OnClickListener(this) { // from class: qh.a

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ HelperCenterActivity f32383b;

                            {
                                this.f32383b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
                                int i11 = i4;
                                HelperCenterActivity helperCenterActivity = this.f32383b;
                                switch (i11) {
                                    case 0:
                                        int i12 = HelperCenterActivity.B;
                                        HashMap mapE = com.liuzh.deviceinfo.utilities.l.e();
                                        StringBuilder sb2 = new StringBuilder();
                                        for (Map.Entry entry : mapE.entrySet()) {
                                            sb2.append((String) entry.getKey());
                                            sb2.append("=");
                                            sb2.append((String) entry.getValue());
                                            sb2.append("\n");
                                        }
                                        t7.m mVar = new t7.m(helperCenterActivity);
                                        i.b bVar = (i.b) mVar.f34474c;
                                        bVar.f25233d = "反馈弹窗";
                                        String str = Build.DEVICE;
                                        String str2 = Build.MODEL;
                                        String strD = HelperCenterActivity.D("ro.product.marketname");
                                        String strD2 = HelperCenterActivity.D("ro.vendor.oplus.market.name");
                                        String strD3 = HelperCenterActivity.D("ro.oppo.market.name");
                                        String strD4 = HelperCenterActivity.D("ro.config.marketing_name");
                                        String strD5 = HelperCenterActivity.D("ro.vendor.asus.product.mkt_name");
                                        String strD6 = HelperCenterActivity.D("ro.lge.petname");
                                        String strD7 = HelperCenterActivity.D("ro.boot.vendor.lge.petname");
                                        String strD8 = HelperCenterActivity.D("ro.vivo.internet.name");
                                        String strD9 = HelperCenterActivity.D("ro.vendor.vivo.market.name");
                                        String strD10 = HelperCenterActivity.D("ro.product.odm.marketname");
                                        String strD11 = HelperCenterActivity.D("ro.vendor.product.ztename");
                                        String strD12 = HelperCenterActivity.D("transsion.device.name");
                                        String strD13 = HelperCenterActivity.D("persist.sys.tran.device.name");
                                        StringBuilder sb3 = new StringBuilder("请将此弹窗截图后发送给开发者\n-------SOC info-----\n");
                                        sb3.append((Object) sb2);
                                        sb3.append("\n-------Device info-----\nDEVICE=");
                                        sb3.append(str);
                                        sb3.append("\nMODEL=");
                                        u.B(sb3, str2, "\n", strD, strD2);
                                        u.B(sb3, strD3, strD4, strD5, strD6);
                                        u.B(sb3, strD7, strD8, strD9, strD10);
                                        bVar.f25235f = r5.c.m(sb3, strD11, strD12, strD13);
                                        mVar.x(android.R.string.ok, null);
                                        mVar.A().setCanceledOnTouchOutside(false);
                                        break;
                                    default:
                                        int i13 = HelperCenterActivity.B;
                                        t7.m mVar2 = new t7.m(helperCenterActivity);
                                        i.b bVar2 = (i.b) mVar2.f34474c;
                                        bVar2.f25233d = "构建时间";
                                        bVar2.f25235f = "Build.TIME=" + Build.TIME + "\nHwBuildEx.TIME=" + com.liuzh.deviceinfo.utilities.l.B("TIME");
                                        mVar2.x(android.R.string.ok, null);
                                        bVar2.f25240m = false;
                                        mVar2.A();
                                        break;
                                }
                            }
                        });
                        final int i11 = 1;
                        settingsItemView.setOnClickListener(new View.OnClickListener(this) { // from class: qh.a

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ HelperCenterActivity f32383b;

                            {
                                this.f32383b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
                                int i112 = i11;
                                HelperCenterActivity helperCenterActivity = this.f32383b;
                                switch (i112) {
                                    case 0:
                                        int i12 = HelperCenterActivity.B;
                                        HashMap mapE = com.liuzh.deviceinfo.utilities.l.e();
                                        StringBuilder sb2 = new StringBuilder();
                                        for (Map.Entry entry : mapE.entrySet()) {
                                            sb2.append((String) entry.getKey());
                                            sb2.append("=");
                                            sb2.append((String) entry.getValue());
                                            sb2.append("\n");
                                        }
                                        t7.m mVar = new t7.m(helperCenterActivity);
                                        i.b bVar = (i.b) mVar.f34474c;
                                        bVar.f25233d = "反馈弹窗";
                                        String str = Build.DEVICE;
                                        String str2 = Build.MODEL;
                                        String strD = HelperCenterActivity.D("ro.product.marketname");
                                        String strD2 = HelperCenterActivity.D("ro.vendor.oplus.market.name");
                                        String strD3 = HelperCenterActivity.D("ro.oppo.market.name");
                                        String strD4 = HelperCenterActivity.D("ro.config.marketing_name");
                                        String strD5 = HelperCenterActivity.D("ro.vendor.asus.product.mkt_name");
                                        String strD6 = HelperCenterActivity.D("ro.lge.petname");
                                        String strD7 = HelperCenterActivity.D("ro.boot.vendor.lge.petname");
                                        String strD8 = HelperCenterActivity.D("ro.vivo.internet.name");
                                        String strD9 = HelperCenterActivity.D("ro.vendor.vivo.market.name");
                                        String strD10 = HelperCenterActivity.D("ro.product.odm.marketname");
                                        String strD11 = HelperCenterActivity.D("ro.vendor.product.ztename");
                                        String strD12 = HelperCenterActivity.D("transsion.device.name");
                                        String strD13 = HelperCenterActivity.D("persist.sys.tran.device.name");
                                        StringBuilder sb3 = new StringBuilder("请将此弹窗截图后发送给开发者\n-------SOC info-----\n");
                                        sb3.append((Object) sb2);
                                        sb3.append("\n-------Device info-----\nDEVICE=");
                                        sb3.append(str);
                                        sb3.append("\nMODEL=");
                                        u.B(sb3, str2, "\n", strD, strD2);
                                        u.B(sb3, strD3, strD4, strD5, strD6);
                                        u.B(sb3, strD7, strD8, strD9, strD10);
                                        bVar.f25235f = r5.c.m(sb3, strD11, strD12, strD13);
                                        mVar.x(android.R.string.ok, null);
                                        mVar.A().setCanceledOnTouchOutside(false);
                                        break;
                                    default:
                                        int i13 = HelperCenterActivity.B;
                                        t7.m mVar2 = new t7.m(helperCenterActivity);
                                        i.b bVar2 = (i.b) mVar2.f34474c;
                                        bVar2.f25233d = "构建时间";
                                        bVar2.f25235f = "Build.TIME=" + Build.TIME + "\nHwBuildEx.TIME=" + com.liuzh.deviceinfo.utilities.l.B("TIME");
                                        mVar2.x(android.R.string.ok, null);
                                        bVar2.f25240m = false;
                                        mVar2.A();
                                        break;
                                }
                            }
                        });
                        lf.e eVar = new lf.e(7, fVar);
                        WeakHashMap weakHashMap = v0.f22405a;
                        m0.j(frameLayout, eVar);
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }
}
