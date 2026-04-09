package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.mediation.MaxAdFormat;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class t3 {

    /* renamed from: a, reason: collision with root package name */
    private a f5764a;

    /* renamed from: b, reason: collision with root package name */
    private String f5765b;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum a {
        AD_UNIT_ID,
        AD_FORMAT,
        AD
    }

    public t3(a aVar, String str) {
        this.f5764a = aVar;
        this.f5765b = str;
    }

    public a a() {
        return this.f5764a;
    }

    public String b() {
        return this.f5765b;
    }

    public static t3 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new t3(a.AD_UNIT_ID, str);
    }

    public static t3 a(MaxAdFormat maxAdFormat) {
        String label = maxAdFormat.getLabel();
        if (TextUtils.isEmpty(label)) {
            return null;
        }
        return new t3(a.AD_FORMAT, label);
    }

    public static t3 a(y2 y2Var) {
        String strQ = y2Var.Q();
        MaxAdFormat format = y2Var.getFormat();
        if (TextUtils.isEmpty(strQ) || format == null) {
            return null;
        }
        return new q3(new j3(strQ, format));
    }
}
