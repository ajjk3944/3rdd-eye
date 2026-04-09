package com.mbridge.msdk.dycreator.utils;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    private static volatile f f14596b;

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.dycreator.engine.b f14597a;

    private f(Context context) {
        this.f14597a = null;
        com.mbridge.msdk.dycreator.engine.b bVarA = com.mbridge.msdk.dycreator.engine.b.a();
        this.f14597a = bVarA;
        bVarA.a(context, "");
    }

    public static f a(Context context) {
        if (f14596b == null) {
            synchronized (f.class) {
                try {
                    if (f14596b == null) {
                        f14596b = new f(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f14596b;
    }

    public View a(String str) {
        if (new File(str).exists()) {
            return this.f14597a.e(str);
        }
        return null;
    }

    public View a(ViewGroup viewGroup, String str) {
        if (viewGroup != null && !TextUtils.isEmpty(str)) {
            if (viewGroup.getId() == str.hashCode()) {
                return viewGroup;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getId() == str.hashCode()) {
                    return childAt;
                }
                if (childAt instanceof ViewGroup) {
                    a((ViewGroup) childAt, str);
                }
            }
        }
        return null;
    }
}
