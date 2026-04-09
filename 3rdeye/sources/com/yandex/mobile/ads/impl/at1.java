package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class at1<T extends View> {
    public static View a(Context context, Class layoutClass, int i, ViewGroup viewGroup) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(layoutClass, "layoutClass");
        try {
            return (View) layoutClass.cast(LayoutInflater.from(context).inflate(i, viewGroup, false));
        } catch (Exception e4) {
            fp0.b(e4);
            return null;
        }
    }
}
