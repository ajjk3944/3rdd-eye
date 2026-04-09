package com.staircase3.opensignal.goldstar.widget;

import com.staircase3.opensignal.goldstar.widget.NetworkStatusView;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f6120a;

    static {
        int[] iArr = new int[NetworkStatusView.a.values().length];
        try {
            iArr[NetworkStatusView.a.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NetworkStatusView.a.CONNECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NetworkStatusView.a.NOT_CONNECTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[NetworkStatusView.a.POSSIBLE_ISSUES.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f6120a = iArr;
    }
}
