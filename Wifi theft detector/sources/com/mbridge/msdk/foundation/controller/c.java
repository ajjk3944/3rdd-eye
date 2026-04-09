package com.mbridge.msdk.foundation.controller;

import android.annotation.SuppressLint;
import com.mbridge.msdk.foundation.controller.a;

/* loaded from: classes3.dex */
public class c extends a {

    /* renamed from: t, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile c f14736t;

    private c() {
    }

    public static c n() {
        if (f14736t == null) {
            synchronized (c.class) {
                try {
                    if (f14736t == null) {
                        f14736t = new c();
                    }
                } finally {
                }
            }
        }
        return f14736t;
    }

    @Override // com.mbridge.msdk.foundation.controller.a
    public void a(a.e eVar) {
    }
}
