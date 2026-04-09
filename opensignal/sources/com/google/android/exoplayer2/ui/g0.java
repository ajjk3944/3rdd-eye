package com.google.android.exoplayer2.ui;

import android.text.Layout;

/* loaded from: classes.dex */
public abstract /* synthetic */ class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f4659a;

    static {
        int[] iArr = new int[Layout.Alignment.values().length];
        f4659a = iArr;
        try {
            iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f4659a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f4659a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
