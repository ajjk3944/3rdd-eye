package com.instagram.common.viewpoint.core;

import android.net.Uri;

/* loaded from: assets/audience_network/classes2.dex */
public abstract /* synthetic */ class MX {
    public static String[] A00 = {"kAVLkaOPTenDjNStg3AqGnsJ6mUxlh", "fdMZ5FC2", "RcZfMO7G0A", "D26EIYlb", "rGLz93weyR", "", "QBfYKUrTqNlMcNacns9hu", ""};

    public static /* synthetic */ String A00(C02565i c02565i) {
        if (c02565i.A08 != null) {
            return c02565i.A08;
        }
        Uri uri = c02565i.A06;
        String[] strArr = A00;
        if (strArr[5].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A00[6] = "qSUHhmHVZn4hNc1KXxuwz";
        return uri.toString();
    }
}
