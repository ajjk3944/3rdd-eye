package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class ko2 {
    public static void a(in2 in2Var) {
        if (!in2Var.h()) {
            throw new IllegalStateException("AdSession is not started");
        }
        if (in2Var.k()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }
}
