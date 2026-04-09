package com.bytedance.sdk.component.adexpress.yu;

import android.net.Uri;
import android.text.TextUtils;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class bly {

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum ouw {
        HTML("text/html"),
        CSS("text/css"),
        JS("application/x-javascript"),
        IMAGE("image/*");

        public String fkw;

        ouw(String str) {
            this.fkw = str;
        }
    }

    public static ouw ouw(String str) {
        ouw ouwVar = ouw.IMAGE;
        if (!TextUtils.isEmpty(str)) {
            try {
                String path = Uri.parse(str).getPath();
                if (path != null) {
                    if (path.endsWith(".css")) {
                        return ouw.CSS;
                    }
                    if (path.endsWith(".js")) {
                        return ouw.JS;
                    }
                    if (!path.endsWith(".jpg") && !path.endsWith(".gif") && !path.endsWith(".png") && !path.endsWith(".jpeg") && !path.endsWith(".webp") && !path.endsWith(".bmp") && !path.endsWith(".ico") && path.endsWith(".html")) {
                        return ouw.HTML;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return ouwVar;
    }
}
