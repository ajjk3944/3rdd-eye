package com.bytedance.sdk.component.utils;

import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class jqy {
    private static vt ouw;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static abstract class ouw {
        public abstract JSONObject ouw();

        public final String vt() {
            try {
                return ouw().toString();
            } catch (Exception unused) {
                return "";
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface vt {
        void ouw(String str, ouw ouwVar);
    }

    public static void ouw(vt vtVar) {
        ouw = vtVar;
    }

    public static void ouw(String str, ouw ouwVar) {
        vt vtVar = ouw;
        if (vtVar == null) {
            return;
        }
        vtVar.ouw(str, ouwVar);
    }
}
