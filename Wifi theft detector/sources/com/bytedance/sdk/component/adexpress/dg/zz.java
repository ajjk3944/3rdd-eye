package com.bytedance.sdk.component.adexpress.dg;

import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class zz {

    public enum emc {
        HTML("text/html"),
        CSS("text/css"),
        JS("application/x-javascript"),
        IMAGE("image/*");

        private String bw;

        emc(String str) {
            this.bw = str;
        }

        public String emc() {
            return this.bw;
        }
    }

    public static emc emc(String str) {
        emc emcVar = emc.IMAGE;
        if (!TextUtils.isEmpty(str)) {
            try {
                String path = Uri.parse(str).getPath();
                if (path != null) {
                    if (path.endsWith(".css")) {
                        return emc.CSS;
                    }
                    if (path.endsWith(".js")) {
                        return emc.JS;
                    }
                    if (!path.endsWith(".jpg") && !path.endsWith(".gif") && !path.endsWith(".png") && !path.endsWith(".jpeg") && !path.endsWith(".webp") && !path.endsWith(".bmp") && !path.endsWith(".ico") && path.endsWith(".html")) {
                        return emc.HTML;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return emcVar;
    }

    public static boolean ypw(String str) {
        Uri uri;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null) {
            return false;
        }
        String path = uri.getPath();
        if (TextUtils.isEmpty(path)) {
            return false;
        }
        return path.endsWith(".gif");
    }
}
