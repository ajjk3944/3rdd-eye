package com.google.common.math;

import com.google.common.base.g;

/* loaded from: classes2.dex */
public abstract class a {
    public static double a(double d10) {
        g.d(!Double.isNaN(d10));
        return Math.max(d10, 0.0d);
    }
}
