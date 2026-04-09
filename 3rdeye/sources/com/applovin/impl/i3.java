package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.mediation.MaxAdFormat;

/* loaded from: classes.dex */
public class i3 {

    /* renamed from: a, reason: collision with root package name */
    private a f19523a;

    /* renamed from: b, reason: collision with root package name */
    private String f19524b;

    public enum a {
        AD_UNIT_ID,
        AD_FORMAT,
        AD
    }

    private i3(a aVar, String str) {
        this.f19523a = aVar;
        this.f19524b = str;
    }

    public a a() {
        return this.f19523a;
    }

    public String b() {
        return this.f19524b;
    }

    public static i3 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new i3(a.AD_UNIT_ID, str);
    }

    public static i3 a(MaxAdFormat maxAdFormat) {
        String label = maxAdFormat.getLabel();
        if (TextUtils.isEmpty(label)) {
            return null;
        }
        return new i3(a.AD_FORMAT, label);
    }

    public static i3 a(q2 q2Var) {
        String strO = q2Var.O();
        if (TextUtils.isEmpty(strO)) {
            return null;
        }
        return new i3(a.AD, strO);
    }
}
