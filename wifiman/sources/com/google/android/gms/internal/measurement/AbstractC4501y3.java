package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.N2;

/* renamed from: com.google.android.gms.internal.measurement.y3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract /* synthetic */ class AbstractC4501y3 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f35534a;

    static {
        int[] iArr = new int[N2.a.values().length];
        f35534a = iArr;
        try {
            iArr[N2.a.STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f35534a[N2.a.NUMBER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f35534a[N2.a.BOOLEAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f35534a[N2.a.STATEMENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f35534a[N2.a.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
