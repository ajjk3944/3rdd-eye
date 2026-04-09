package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class XK {

    /* renamed from: a, reason: collision with root package name */
    public static volatile XK f12412a;

    /* renamed from: b, reason: collision with root package name */
    public static final XK f12413b;

    static {
        XK xk = new XK();
        Map map = Collections.EMPTY_MAP;
        f12413b = xk;
    }

    public static XK a() {
        XK xk = f12412a;
        if (xk != null) {
            return xk;
        }
        synchronized (XK.class) {
            try {
                XK xk2 = f12412a;
                if (xk2 != null) {
                    return xk2;
                }
                int i = JK.f9277a;
                XK xkL = AbstractC0933bL.l();
                f12412a = xkL;
                return xkL;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
