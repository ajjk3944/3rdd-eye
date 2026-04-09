package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class ul {
    private static final Map<Integer, emc<?, ?>> emc = new ConcurrentHashMap();

    public static emc<?, ?> emc(Context context, int i10) {
        emc<?, ?> emcVarYpw;
        Map<Integer, emc<?, ?>> map = emc;
        emc<?, ?> emcVar = map.get(Integer.valueOf(i10));
        if (emcVar != null) {
            return emcVar;
        }
        synchronized (ul.class) {
            try {
                emcVarYpw = map.get(Integer.valueOf(i10));
                if (emcVarYpw == null) {
                    emcVarYpw = ypw(context, i10);
                    map.put(Integer.valueOf(i10), emcVarYpw);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return emcVarYpw;
    }

    private static emc<?, ?> ypw(Context context, int i10) {
        if (i10 == 7) {
            return new aa(context);
        }
        if (i10 == 8) {
            return new uym(context);
        }
        throw new IllegalArgumentException("Unsupported ad type: ".concat(String.valueOf(i10)));
    }
}
