package com.staircase3.opensignal.views;

import com.staircase3.opensignal.views.SpeedDialView;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f6353a;

    static {
        int[] iArr = new int[SpeedDialView.a.values().length];
        try {
            iArr[SpeedDialView.a.DOWNLOAD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SpeedDialView.a.UPLOAD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f6353a = iArr;
    }
}
