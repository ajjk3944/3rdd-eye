package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class rv {
    public static void a(ov ovVar) {
        if (ovVar != null) {
            try {
                ovVar.close();
            } catch (IOException unused) {
            }
        }
    }
}
