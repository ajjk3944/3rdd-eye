package com.wifihacker.detector;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import androidx.databinding.f;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;
import java.util.ArrayList;
import java.util.List;
import l8.b;
import l8.b0;
import l8.b1;
import l8.d;
import l8.d0;
import l8.d1;
import l8.f0;
import l8.f1;
import l8.h;
import l8.h0;
import l8.h1;
import l8.j;
import l8.j0;
import l8.j1;
import l8.l;
import l8.l0;
import l8.l1;
import l8.n;
import l8.n0;
import l8.n1;
import l8.p;
import l8.p0;
import l8.p1;
import l8.r;
import l8.r0;
import l8.r1;
import l8.t;
import l8.t0;
import l8.t1;
import l8.v;
import l8.v0;
import l8.v1;
import l8.x;
import l8.x0;
import l8.x1;
import l8.z;
import l8.z0;
import l8.z1;

/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends e {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f20280a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(39);
        f20280a = sparseIntArray;
        sparseIntArray.put(R.layout.activity_about, 1);
        sparseIntArray.put(R.layout.activity_device_detail, 2);
        sparseIntArray.put(R.layout.activity_fragment, 3);
        sparseIntArray.put(R.layout.activity_guide, 4);
        sparseIntArray.put(R.layout.activity_help, 5);
        sparseIntArray.put(R.layout.activity_history, 6);
        sparseIntArray.put(R.layout.activity_history_detail, 7);
        sparseIntArray.put(R.layout.activity_lock_screen, 8);
        sparseIntArray.put(R.layout.activity_main, 9);
        sparseIntArray.put(R.layout.activity_ping, 10);
        sparseIntArray.put(R.layout.activity_pro, 11);
        sparseIntArray.put(R.layout.activity_pro1, 12);
        sparseIntArray.put(R.layout.activity_scan_animation, 13);
        sparseIntArray.put(R.layout.activity_scan_result, 14);
        sparseIntArray.put(R.layout.activity_setting, 15);
        sparseIntArray.put(R.layout.activity_show_ad, 16);
        sparseIntArray.put(R.layout.activity_splash, 17);
        sparseIntArray.put(R.layout.activity_wake_on_lan, 18);
        sparseIntArray.put(R.layout.activity_whois, 19);
        sparseIntArray.put(R.layout.activity_wifi_info, 20);
        sparseIntArray.put(R.layout.adapter_device, 21);
        sparseIntArray.put(R.layout.adapter_device_list_tittle, 22);
        sparseIntArray.put(R.layout.dialog_js_http_auth, 23);
        sparseIntArray.put(R.layout.dialog_js_prompt, 24);
        sparseIntArray.put(R.layout.dialog_ping_setting, 25);
        sparseIntArray.put(R.layout.dialog_wake_on_lan, 26);
        sparseIntArray.put(R.layout.fragment_device_list, 27);
        sparseIntArray.put(R.layout.fragment_discover, 28);
        sparseIntArray.put(R.layout.fragment_history, 29);
        sparseIntArray.put(R.layout.fragment_router, 30);
        sparseIntArray.put(R.layout.fragment_tools, 31);
        sparseIntArray.put(R.layout.fragment_whois, 32);
        sparseIntArray.put(R.layout.fragment_wifi_info, 33);
        sparseIntArray.put(R.layout.include_lock_screen_layout, 34);
        sparseIntArray.put(R.layout.view_more_tools, 35);
        sparseIntArray.put(R.layout.view_ping_item, 36);
        sparseIntArray.put(R.layout.view_title, 37);
        sparseIntArray.put(R.layout.view_wol_item, 38);
        sparseIntArray.put(R.layout.wifi_device_count_layout, 39);
    }

    @Override // androidx.databinding.e
    public List a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.e
    public ViewDataBinding b(f fVar, View view, int i10) {
        int i11 = f20280a.get(i10);
        if (i11 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        switch (i11) {
            case 1:
                if ("layout/activity_about_0".equals(tag)) {
                    return new b(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_about is invalid. Received: " + tag);
            case 2:
                if ("layout/activity_device_detail_0".equals(tag)) {
                    return new d(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_device_detail is invalid. Received: " + tag);
            case 3:
                if ("layout/activity_fragment_0".equals(tag)) {
                    return new l8.f(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_fragment is invalid. Received: " + tag);
            case 4:
                if ("layout/activity_guide_0".equals(tag)) {
                    return new h(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_guide is invalid. Received: " + tag);
            case 5:
                if ("layout/activity_help_0".equals(tag)) {
                    return new j(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_help is invalid. Received: " + tag);
            case 6:
                if ("layout/activity_history_0".equals(tag)) {
                    return new l(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_history is invalid. Received: " + tag);
            case 7:
                if ("layout/activity_history_detail_0".equals(tag)) {
                    return new n(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_history_detail is invalid. Received: " + tag);
            case 8:
                if ("layout/activity_lock_screen_0".equals(tag)) {
                    return new p(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_lock_screen is invalid. Received: " + tag);
            case 9:
                if ("layout/activity_main_0".equals(tag)) {
                    return new r(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
            case 10:
                if ("layout/activity_ping_0".equals(tag)) {
                    return new t(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_ping is invalid. Received: " + tag);
            case 11:
                if ("layout/activity_pro_0".equals(tag)) {
                    return new x(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_pro is invalid. Received: " + tag);
            case 12:
                if ("layout/activity_pro1_0".equals(tag)) {
                    return new v(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_pro1 is invalid. Received: " + tag);
            case 13:
                if ("layout/activity_scan_animation_0".equals(tag)) {
                    return new z(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_scan_animation is invalid. Received: " + tag);
            case 14:
                if ("layout/activity_scan_result_0".equals(tag)) {
                    return new b0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_scan_result is invalid. Received: " + tag);
            case 15:
                if ("layout/activity_setting_0".equals(tag)) {
                    return new d0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_setting is invalid. Received: " + tag);
            case 16:
                if ("layout/activity_show_ad_0".equals(tag)) {
                    return new f0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_show_ad is invalid. Received: " + tag);
            case 17:
                if ("layout/activity_splash_0".equals(tag)) {
                    return new h0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
            case 18:
                if ("layout/activity_wake_on_lan_0".equals(tag)) {
                    return new j0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_wake_on_lan is invalid. Received: " + tag);
            case 19:
                if ("layout/activity_whois_0".equals(tag)) {
                    return new l0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_whois is invalid. Received: " + tag);
            case 20:
                if ("layout/activity_wifi_info_0".equals(tag)) {
                    return new n0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_wifi_info is invalid. Received: " + tag);
            case 21:
                if ("layout/adapter_device_0".equals(tag)) {
                    return new p0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for adapter_device is invalid. Received: " + tag);
            case 22:
                if ("layout/adapter_device_list_tittle_0".equals(tag)) {
                    return new r0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for adapter_device_list_tittle is invalid. Received: " + tag);
            case 23:
                if ("layout/dialog_js_http_auth_0".equals(tag)) {
                    return new t0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_js_http_auth is invalid. Received: " + tag);
            case 24:
                if ("layout/dialog_js_prompt_0".equals(tag)) {
                    return new v0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_js_prompt is invalid. Received: " + tag);
            case 25:
                if ("layout/dialog_ping_setting_0".equals(tag)) {
                    return new x0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_ping_setting is invalid. Received: " + tag);
            case 26:
                if ("layout/dialog_wake_on_lan_0".equals(tag)) {
                    return new z0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_wake_on_lan is invalid. Received: " + tag);
            case 27:
                if ("layout/fragment_device_list_0".equals(tag)) {
                    return new b1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_device_list is invalid. Received: " + tag);
            case 28:
                if ("layout/fragment_discover_0".equals(tag)) {
                    return new d1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_discover is invalid. Received: " + tag);
            case 29:
                if ("layout/fragment_history_0".equals(tag)) {
                    return new f1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_history is invalid. Received: " + tag);
            case 30:
                if ("layout/fragment_router_0".equals(tag)) {
                    return new h1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_router is invalid. Received: " + tag);
            case 31:
                if ("layout/fragment_tools_0".equals(tag)) {
                    return new j1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_tools is invalid. Received: " + tag);
            case 32:
                if ("layout/fragment_whois_0".equals(tag)) {
                    return new l1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_whois is invalid. Received: " + tag);
            case 33:
                if ("layout/fragment_wifi_info_0".equals(tag)) {
                    return new n1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_wifi_info is invalid. Received: " + tag);
            case 34:
                if ("layout/include_lock_screen_layout_0".equals(tag)) {
                    return new p1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for include_lock_screen_layout is invalid. Received: " + tag);
            case 35:
                if ("layout/view_more_tools_0".equals(tag)) {
                    return new r1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for view_more_tools is invalid. Received: " + tag);
            case 36:
                if ("layout/view_ping_item_0".equals(tag)) {
                    return new t1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for view_ping_item is invalid. Received: " + tag);
            case 37:
                if ("layout/view_title_0".equals(tag)) {
                    return new v1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for view_title is invalid. Received: " + tag);
            case 38:
                if ("layout/view_wol_item_0".equals(tag)) {
                    return new x1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for view_wol_item is invalid. Received: " + tag);
            case 39:
                if ("layout/wifi_device_count_layout_0".equals(tag)) {
                    return new z1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for wifi_device_count_layout is invalid. Received: " + tag);
            default:
                return null;
        }
    }

    @Override // androidx.databinding.e
    public ViewDataBinding c(f fVar, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f20280a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
