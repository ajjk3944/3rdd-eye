package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import java.util.Map;

/* loaded from: classes3.dex */
public final class uj1 {
    @SuppressLint({"WrongConstant"})
    public static Intent a(Context context, tj1 preferredPackage) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(preferredPackage, "preferredPackage");
        String strE = preferredPackage.e();
        String strD = preferredPackage.d();
        Map<String, Object> mapA = preferredPackage.a();
        Integer numB = preferredPackage.b();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(strE));
        if (numB == null || !(context instanceof Activity)) {
            intent.addFlags((numB != null ? numB.intValue() : 0) | 1342177280);
        } else {
            intent.addFlags(numB.intValue());
        }
        intent.setPackage(strD);
        if (mapA != null) {
            for (Map.Entry<String, Object> entry : mapA.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Boolean) {
                    intent.putExtra(key, ((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    intent.putExtra(key, ((Number) value).intValue());
                } else if (value instanceof String) {
                    intent.putExtra(key, (String) value);
                } else if (value instanceof a80) {
                    try {
                        ((a80) value).getClass();
                        intent.putExtra(key, (Parcelable) null);
                    } catch (Throwable th) {
                        b9.n.a(th);
                    }
                }
            }
        }
        return intent;
    }
}
