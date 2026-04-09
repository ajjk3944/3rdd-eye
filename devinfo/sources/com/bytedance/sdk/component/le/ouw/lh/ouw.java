package com.bytedance.sdk.component.le.ouw.lh;

import android.text.TextUtils;
import com.bytedance.sdk.component.le.ouw.fkw;
import com.bytedance.sdk.component.le.ouw.pno;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {
    private static final LinkedList<String> ouw = new LinkedList<>();
    private static final LinkedList<String> vt = new LinkedList<>();

    /* renamed from: lh, reason: collision with root package name */
    private static final LinkedList<String> f7532lh = new LinkedList<>();
    private static final LinkedList<String> yu = new LinkedList<>();
    private static final Map<String, Integer> fkw = new HashMap();

    /* renamed from: le, reason: collision with root package name */
    private static HashMap<String, Integer> f7531le = null;
    private static String ra = "upload_init";
    private static int pno = 0;
    private static int bly = 0;

    public static void bly() {
        try {
            lh();
        } catch (Exception e2) {
            e2.getMessage();
            vt.lh();
        }
    }

    public static void cf() {
        try {
            fkw fkwVar = pno.vt().bly;
        } catch (Exception e2) {
            e2.getMessage();
            vt.lh();
        }
    }

    public static boolean fkw() {
        return pno.vt().bly != null;
    }

    public static void le() {
        fkw fkwVar = pno.vt().bly;
    }

    public static boolean lh() {
        fkw fkwVar = pno.vt().bly;
        return false;
    }

    public static String ouw(com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar) {
        if (ouwVar == null || ouwVar.ra() == null) {
            return null;
        }
        yu();
        return ouwVar.vt() == 3 ? ouwVar.ra().optString("event") : ouwVar.ra().optString("label");
    }

    public static void pno() {
        fkw fkwVar = pno.vt().bly;
        yu();
    }

    public static void ra() {
        fkw fkwVar = pno.vt().bly;
    }

    public static void tlj() {
        fkw fkwVar = pno.vt().bly;
    }

    public static String vt(com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar) {
        if (ouwVar != null && ouwVar.ra() != null) {
            yu();
            String strOptString = ouwVar.ra().optString("log_extra");
            if (!TextUtils.isEmpty(strOptString)) {
                try {
                    return new JSONObject(strOptString).optString("req_id");
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
        return null;
    }

    public static boolean yu() {
        fkw fkwVar = pno.vt().bly;
        return false;
    }

    public static void ouw() {
        try {
            fkw fkwVar = pno.vt().bly;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void vt() {
        try {
            fkw fkwVar = pno.vt().bly;
        } catch (Exception unused) {
        }
    }

    public static String ouw(int i4) {
        switch (i4) {
            case 1:
                return "flush once";
            case 2:
                return "flush memory db";
            case 3:
                return "flush memory";
            case 4:
                return "new event";
            case 5:
                return "server busy";
            case 6:
                return "empty message";
            case 7:
                return "net error";
            default:
                return "default";
        }
    }
}
