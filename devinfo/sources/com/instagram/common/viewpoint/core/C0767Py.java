package com.instagram.common.viewpoint.core;

import android.view.WindowInsets;

/* renamed from: com.facebook.ads.redexgen.X.Py, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0767Py {
    public final Object A00;

    public C0767Py(Object obj) {
        this.A00 = obj;
    }

    public static C0767Py A00(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C0767Py(obj);
    }

    public static Object A01(C0767Py c0767Py) {
        if (c0767Py == null) {
            return null;
        }
        return c0767Py.A00;
    }

    public final int A02() {
        return ((WindowInsets) this.A00).getSystemWindowInsetBottom();
    }

    public final int A03() {
        return ((WindowInsets) this.A00).getSystemWindowInsetLeft();
    }

    public final int A04() {
        return ((WindowInsets) this.A00).getSystemWindowInsetRight();
    }

    public final int A05() {
        return ((WindowInsets) this.A00).getSystemWindowInsetTop();
    }

    public final C0767Py A06(int i4, int i10, int i11, int i12) {
        return new C0767Py(((WindowInsets) this.A00).replaceSystemWindowInsets(i4, i10, i11, i12));
    }

    public final boolean A07() {
        return ((WindowInsets) this.A00).isConsumed();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0767Py c0767Py = (C0767Py) obj;
        return this.A00 == null ? c0767Py.A00 == null : this.A00.equals(c0767Py.A00);
    }

    public final int hashCode() {
        if (this.A00 == null) {
            return 0;
        }
        return this.A00.hashCode();
    }
}
