package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.S1;
import com.google.android.gms.internal.measurement.U1;

/* loaded from: classes.dex */
abstract /* synthetic */ class F7 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f35872a;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f35873b;

    static {
        int[] iArr = new int[S1.b.values().length];
        f35873b = iArr;
        try {
            iArr[S1.b.LESS_THAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f35873b[S1.b.GREATER_THAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f35873b[S1.b.EQUAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f35873b[S1.b.BETWEEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[U1.b.values().length];
        f35872a = iArr2;
        try {
            iArr2[U1.b.REGEXP.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f35872a[U1.b.BEGINS_WITH.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f35872a[U1.b.ENDS_WITH.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f35872a[U1.b.PARTIAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f35872a[U1.b.EXACT.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f35872a[U1.b.IN_LIST.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
