package com.liuzho.lib.appinfo.provider;

import androidx.annotation.Keep;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@Keep
/* loaded from: classes3.dex */
public class NativeLibInfoProvider$LocalNativeLibInfo {
    String icon;
    boolean isRegex;
    String label;
    private Pattern mPattern;
    String name;
    String website;

    public Pattern getPattern() {
        if (!this.isRegex) {
            return null;
        }
        if (this.mPattern == null) {
            this.mPattern = Pattern.compile(this.name);
        }
        return this.mPattern;
    }
}
