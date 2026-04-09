package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class ul {
    private static final Map<Integer, emc<?, ?>> emc = new ConcurrentHashMap();

    public static emc<?, ?> emc(Context context, int i) {
        emc<?, ?> emcVarYpw;
        Map<Integer, emc<?, ?>> map = emc;
        emc<?, ?> emcVar = map.get(Integer.valueOf(i));
        if (emcVar != null) {
            return emcVar;
        }
        synchronized (ul.class) {
            try {
                emcVarYpw = map.get(Integer.valueOf(i));
                if (emcVarYpw == null) {
                    emcVarYpw = ypw(context, i);
                    map.put(Integer.valueOf(i), emcVarYpw);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return emcVarYpw;
    }

    private static emc<?, ?> ypw(Context context, int i) {
        if (i == 7) {
            return new aa(context);
        }
        if (i == 8) {
            return new uym(context);
        }
        throw new IllegalArgumentException("Unsupported ad type: ".concat(String.valueOf(i)));
    }
}
