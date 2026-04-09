package com.google.gson.internal.sql;

import com.google.gson.x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f20877a;

    /* renamed from: b, reason: collision with root package name */
    public static final x f20878b;

    /* renamed from: c, reason: collision with root package name */
    public static final x f20879c;

    /* renamed from: d, reason: collision with root package name */
    public static final x f20880d;

    static {
        boolean z3;
        try {
            Class.forName("java.sql.Date");
            z3 = true;
        } catch (ClassNotFoundException unused) {
            z3 = false;
        }
        f20877a = z3;
        if (z3) {
            f20878b = SqlDateTypeAdapter.f20871b;
            f20879c = SqlTimeTypeAdapter.f20873b;
            f20880d = SqlTimestampTypeAdapter.f20875b;
        } else {
            f20878b = null;
            f20879c = null;
            f20880d = null;
        }
    }
}
