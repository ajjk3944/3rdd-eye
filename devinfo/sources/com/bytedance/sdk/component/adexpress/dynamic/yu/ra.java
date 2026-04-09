package com.bytedance.sdk.component.adexpress.dynamic.yu;

import android.graphics.Color;
import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.fkw.cf;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ra {
    public fkw fkw;

    /* renamed from: le, reason: collision with root package name */
    public String f7307le;

    /* renamed from: lh, reason: collision with root package name */
    public JSONObject f7308lh;
    public int ouw;
    public String vt;
    public le yu;

    public ra(fkw fkwVar) {
        this.fkw = fkwVar;
        this.ouw = fkwVar.ouw();
        this.vt = fkwVar.vt;
        this.f7308lh = fkwVar.f7280lh.kn;
        this.f7307le = fkwVar.fkw;
        com.bytedance.sdk.component.adexpress.ouw.ouw.lh lhVar = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f7383lh;
        this.yu = fkwVar.f7280lh;
        if (com.bytedance.sdk.component.adexpress.yu.vt()) {
            this.yu = fkwVar.f7280lh;
        }
    }

    private boolean jg() {
        return (com.bytedance.sdk.component.adexpress.yu.vt() && (this.fkw.ouw.contains("logo-union") || this.fkw.ouw.contains("logounion") || this.fkw.ouw.contains("logoad"))) || "logo-union".equals(this.fkw.ouw) || "logounion".equals(this.fkw.ouw) || "logoad".equals(this.fkw.ouw);
    }

    private boolean ko() {
        if (com.bytedance.sdk.component.adexpress.yu.vt()) {
            return false;
        }
        return (!TextUtils.isEmpty(this.vt) && this.vt.contains("adx:")) || cf.vt();
    }

    public final String bly() {
        return this.ouw == 1 ? this.vt : "";
    }

    public final int cf() {
        return ouw(this.yu.ko);
    }

    public final String fkw() {
        return this.ouw == 0 ? !TextUtils.isEmpty(this.vt) ? this.vt : this.f7308lh.optString(com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw())) : "";
    }

    public final int le() {
        return ouw(this.yu.ryl);
    }

    public final int lh() {
        return (int) this.yu.fkw;
    }

    public final int mwh() {
        return ouw(this.yu.mwh);
    }

    public final int ouw() {
        return (int) this.yu.yu;
    }

    public final String pno() {
        int i4 = this.ouw;
        return (i4 == 2 || i4 == 13) ? this.vt : "";
    }

    public final int ra() {
        String str = this.yu.f7282cf;
        if ("left".equals(str)) {
            return 17;
        }
        if ("center".equals(str)) {
            return 4;
        }
        return "right".equals(str) ? 3 : 2;
    }

    public final int ryl() {
        le leVar;
        String str = this.yu.ksc;
        if ("skip-with-time-skip-btn".equals(this.fkw.ouw) || "skip".equals(this.fkw.ouw) || TextUtils.equals("skip-with-countdowns-skip-btn", this.fkw.ouw)) {
            return 6;
        }
        if (!"skip-with-time-countdown".equals(this.fkw.ouw) && !"skip-with-time".equals(this.fkw.ouw)) {
            if (this.ouw == 10 && TextUtils.equals(this.yu.jae, "click")) {
                return 5;
            }
            if (jg() && ko()) {
                return 0;
            }
            if (jg()) {
                return 7;
            }
            if ("feedback-dislike".equals(this.fkw.ouw)) {
                return 3;
            }
            if (!TextUtils.isEmpty(str) && !str.equals("none")) {
                if (str.equals("video") || (this.fkw.ouw() == 7 && TextUtils.equals(str, "normal"))) {
                    return (com.bytedance.sdk.component.adexpress.yu.vt() && (leVar = this.fkw.f7280lh) != null && leVar.npr) ? 11 : 4;
                }
                if (str.equals("normal")) {
                    return 1;
                }
                return (str.equals("creative") || "slide".equals(this.yu.jae)) ? 2 : 0;
            }
        }
        return 0;
    }

    public final double tlj() throws NumberFormatException {
        if (this.ouw == 11) {
            try {
                return !com.bytedance.sdk.component.adexpress.yu.vt() ? (int) r0 : Double.parseDouble(this.vt);
            } catch (NumberFormatException unused) {
            }
        }
        return -1.0d;
    }

    public final int vt() {
        return (int) this.yu.ra;
    }

    public final int yu() {
        return (int) this.yu.f7287le;
    }

    public static int ouw(String str) {
        String[] strArrSplit;
        if (TextUtils.isEmpty(str)) {
            return -16777216;
        }
        if (str.equals("transparent")) {
            return 0;
        }
        if (str.charAt(0) == '#' && str.length() == 7) {
            return Color.parseColor(str);
        }
        if (str.charAt(0) == '#' && str.length() == 9) {
            return Color.parseColor(str);
        }
        if (str.startsWith("rgba") && (strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",")) != null) {
            try {
                if (strArrSplit.length == 4) {
                    return (((int) ((Float.parseFloat(strArrSplit[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(strArrSplit[0])) << 16) | (((int) Float.parseFloat(strArrSplit[1])) << 8) | ((int) Float.parseFloat(strArrSplit[2]));
                }
            } catch (NumberFormatException unused) {
                return 0;
            }
        }
        return -16777216;
    }

    public static float[] vt(String str) {
        String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",");
        if (strArrSplit != null && strArrSplit.length == 4) {
            return new float[]{Float.parseFloat(strArrSplit[0]), Float.parseFloat(strArrSplit[1]), Float.parseFloat(strArrSplit[2]), Float.parseFloat(strArrSplit[3])};
        }
        return new float[]{0.0f, 0.0f, 0.0f, 0.0f};
    }
}
