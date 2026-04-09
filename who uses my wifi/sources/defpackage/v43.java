package defpackage;

import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class v43 implements n53 {
    public final l83 a;
    public final PackageInfo b;
    public final ra4 c;

    public v43(l83 l83Var, PackageInfo packageInfo, ra4 ra4Var) {
        this.a = l83Var;
        this.b = packageInfo;
        this.c = ra4Var;
    }

    @Override // defpackage.n53
    public final void c(Object obj) {
        int i;
        JSONObject jSONObject;
        String str;
        JSONArray jSONArrayOptJSONArray;
        int i2;
        l83 l83Var = this.a;
        ArrayList<String> arrayList = l83Var.h;
        jm2 jm2Var = (jm2) obj;
        if (arrayList == null) {
            return;
        }
        if (arrayList.isEmpty()) {
            jm2Var.a.putInt("native_version", 0);
            return;
        }
        Bundle bundle = jm2Var.a;
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", l83Var.i);
        r12 r12Var = l83Var.j;
        if (r12Var != null) {
            if (r12Var.f > 3) {
                bundle.putBoolean("enable_native_media_orientation", true);
                int i3 = r12Var.m;
                String str2 = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? "unknown" : "square" : "portrait" : "landscape" : "any";
                if (!"unknown".equals(str2)) {
                    bundle.putString("native_media_orientation", str2);
                }
            }
            int i4 = r12Var.h;
            String str3 = i4 != 0 ? i4 != 1 ? i4 != 2 ? "unknown" : "landscape" : "portrait" : "any";
            if (!"unknown".equals(str3)) {
                bundle.putString("native_image_orientation", str3);
            }
            bundle.putBoolean("native_multiple_images", r12Var.i);
            bundle.putBoolean("use_custom_mute", r12Var.l);
            r12 r12Var2 = this.a.j;
            if (r12Var2 != null && (i2 = r12Var2.n) != 0) {
                bundle.putBoolean("sccg_tap", r12Var2.o);
                bundle.putInt("sccg_dir", i2);
            }
        }
        PackageInfo packageInfo = this.b;
        int i5 = packageInfo != null ? packageInfo.versionCode : 0;
        ra4 ra4Var = this.c;
        ra4Var.h();
        synchronized (ra4Var.a) {
            i = ra4Var.r;
        }
        if (i5 > i) {
            ra4Var.h();
            synchronized (ra4Var.a) {
                try {
                    ra4Var.t = new JSONObject();
                    SharedPreferences.Editor editor = ra4Var.g;
                    if (editor != null) {
                        editor.remove("native_advanced_settings");
                        ra4Var.g.apply();
                    }
                    ra4Var.i();
                } finally {
                }
            }
            ra4Var.h();
            synchronized (ra4Var.a) {
                try {
                    if (ra4Var.r != i5) {
                        ra4Var.r = i5;
                        SharedPreferences.Editor editor2 = ra4Var.g;
                        if (editor2 != null) {
                            editor2.putInt("version_code", i5);
                            ra4Var.g.apply();
                        }
                        ra4Var.i();
                    }
                } finally {
                }
            }
        }
        ra4Var.h();
        synchronized (ra4Var.a) {
            jSONObject = ra4Var.t;
        }
        String string = null;
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray(l83Var.g)) != null) {
            string = jSONArrayOptJSONArray.toString();
        }
        if (!TextUtils.isEmpty(string)) {
            bundle.putString("native_advanced_settings", string);
        }
        int i6 = l83Var.l;
        if (i6 > 1) {
            bundle.putInt("max_num_ads", i6);
        }
        f52 f52Var = l83Var.b;
        if (f52Var != null) {
            String str4 = f52Var.h;
            if (TextUtils.isEmpty(str4)) {
                if (f52Var.f >= 2) {
                    int i7 = f52Var.i;
                    str = (i7 == 2 || i7 != 3) ? "l" : "p";
                } else {
                    int i8 = f52Var.g;
                    if (i8 == 1) {
                        str = "l";
                    } else if (i8 != 2) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 41);
                        sb.append("Instream ad video aspect ratio ");
                        sb.append(i8);
                        sb.append(" is wrong.");
                        gi2.Z(sb.toString());
                        str = "l";
                    } else {
                        str = "p";
                    }
                }
                bundle.putString("ia_var", str);
            } else {
                bundle.putString("ad_tag", str4);
            }
            bundle.putBoolean("instr", true);
        }
        if (!((Boolean) tw1.e.c.a(mz1.Fc)).booleanValue() || r12Var == null) {
            return;
        }
        ih3 ih3Var = r12Var.k;
        if (ih3Var != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("startMuted", ih3Var.f);
            bundle2.putBoolean("clickToExpandRequested", ih3Var.h);
            bundle2.putBoolean("customControlsRequested", ih3Var.g);
            bundle.putBundle("video", bundle2);
        }
        bundle.putBoolean("disable_image_loading", r12Var.g);
        bundle.putInt("preferred_ad_choices_position", r12Var.j);
    }

    @Override // defpackage.n53
    public final void p(Object obj) {
        int i;
        l83 l83Var = this.a;
        ArrayList arrayList = l83Var.h;
        jm2 jm2Var = (jm2) obj;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Bundle bundle = jm2Var.b;
        r12 r12Var = l83Var.j;
        if (r12Var == null || (i = r12Var.n) == 0) {
            return;
        }
        bundle.putBoolean("sccg_tap", r12Var.o);
        bundle.putInt("sccg_dir", i);
    }
}
