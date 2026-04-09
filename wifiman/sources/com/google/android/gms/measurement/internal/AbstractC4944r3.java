package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.X1;

/* renamed from: com.google.android.gms.measurement.internal.r3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract /* synthetic */ class AbstractC4944r3 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f36685a;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f36686b;

    /* renamed from: c, reason: collision with root package name */
    static final /* synthetic */ int[] f36687c;

    static {
        int[] iArr = new int[X1.d.values().length];
        f36687c = iArr;
        try {
            iArr[X1.d.DENIED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f36687c[X1.d.GRANTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[X1.e.values().length];
        f36686b = iArr2;
        try {
            iArr2[X1.e.AD_STORAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f36686b[X1.e.ANALYTICS_STORAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f36686b[X1.e.AD_USER_DATA.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f36686b[X1.e.AD_PERSONALIZATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr3 = new int[com.google.android.gms.internal.measurement.B7.values().length];
        f36685a = iArr3;
        try {
            iArr3[com.google.android.gms.internal.measurement.B7.DEBUG.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f36685a[com.google.android.gms.internal.measurement.B7.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f36685a[com.google.android.gms.internal.measurement.B7.WARN.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f36685a[com.google.android.gms.internal.measurement.B7.VERBOSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
