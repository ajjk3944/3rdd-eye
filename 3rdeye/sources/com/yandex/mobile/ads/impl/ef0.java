package com.yandex.mobile.ads.impl;

import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class ef0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f26819a;

    /* renamed from: b, reason: collision with root package name */
    private final String f26820b;

    public ef0(String str, String str2) {
        this.f26819a = str;
        this.f26820b = str2;
    }

    public final String a() {
        return this.f26819a;
    }

    public final String b() {
        return this.f26820b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ef0.class == obj.getClass()) {
            ef0 ef0Var = (ef0) obj;
            if (TextUtils.equals(this.f26819a, ef0Var.f26819a) && TextUtils.equals(this.f26820b, ef0Var.f26820b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f26820b.hashCode() + (this.f26819a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Header[name=");
        sb.append(this.f26819a);
        sb.append(",value=");
        return B4.f.c(sb, this.f26820b, "]");
    }
}
