package u3;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f23185a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f23186b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f23187c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f23188d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f23189e;

    public k(ViewGroup viewGroup) {
        this.f23187c = viewGroup;
    }

    public final boolean a(float f10, float f11, boolean z10) {
        ViewParent viewParentE;
        if (this.f23188d && (viewParentE = e(0)) != null) {
            try {
                return viewParentE.onNestedFling(this.f23187c, f10, f11, z10);
            } catch (AbstractMethodError e4) {
                io.sentry.android.core.e0.c("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedFling", e4);
            }
        }
        return false;
    }

    public final boolean b(float f10, float f11) {
        ViewParent viewParentE;
        if (this.f23188d && (viewParentE = e(0)) != null) {
            try {
                return viewParentE.onNestedPreFling(this.f23187c, f10, f11);
            } catch (AbstractMethodError e4) {
                io.sentry.android.core.e0.c("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreFling", e4);
            }
        }
        return false;
    }

    public final boolean c(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        ViewParent viewParentE;
        int i13;
        int i14;
        int[] iArr3;
        if (!this.f23188d || (viewParentE = e(i12)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f23187c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i13 = iArr2[0];
            i14 = iArr2[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr == null) {
            if (this.f23189e == null) {
                this.f23189e = new int[2];
            }
            iArr3 = this.f23189e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentE instanceof l) {
            ((l) viewParentE).f(viewGroup, i10, i11, iArr3, i12);
        } else if (i12 == 0) {
            try {
                viewParentE.onNestedPreScroll(viewGroup, i10, i11, iArr3);
            } catch (AbstractMethodError e4) {
                io.sentry.android.core.e0.c("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreScroll", e4);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i13;
            iArr2[1] = iArr2[1] - i14;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean d(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent viewParentE;
        int i15;
        int i16;
        int[] iArr3;
        if (this.f23188d && (viewParentE = e(i14)) != null) {
            if (i10 != 0 || i11 != 0 || i12 != 0 || i13 != 0) {
                ViewGroup viewGroup = this.f23187c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i15 = iArr[0];
                    i16 = iArr[1];
                } else {
                    i15 = 0;
                    i16 = 0;
                }
                if (iArr2 == null) {
                    if (this.f23189e == null) {
                        this.f23189e = new int[2];
                    }
                    int[] iArr4 = this.f23189e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentE instanceof m) {
                    ((m) viewParentE).a(viewGroup, i10, i11, i12, i13, i14, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i12;
                    iArr3[1] = iArr3[1] + i13;
                    if (viewParentE instanceof l) {
                        ((l) viewParentE).b(viewGroup, i10, i11, i12, i13, i14);
                    } else if (i14 == 0) {
                        try {
                            viewParentE.onNestedScroll(viewGroup, i10, i11, i12, i13);
                        } catch (AbstractMethodError e4) {
                            io.sentry.android.core.e0.c("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedScroll", e4);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i15;
                    iArr[1] = iArr[1] - i16;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final ViewParent e(int i10) {
        if (i10 == 0) {
            return this.f23185a;
        }
        if (i10 != 1) {
            return null;
        }
        return this.f23186b;
    }

    public final boolean f(int i10) {
        return e(i10) != null;
    }

    public final boolean g(int i10, int i11) {
        boolean zOnStartNestedScroll;
        if (!f(i11)) {
            if (this.f23188d) {
                View view = this.f23187c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z10 = parent instanceof l;
                    if (z10) {
                        zOnStartNestedScroll = ((l) parent).c(view2, view, i10, i11);
                    } else if (i11 == 0) {
                        try {
                            zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i10);
                        } catch (AbstractMethodError e4) {
                            io.sentry.android.core.e0.c("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e4);
                        }
                    } else {
                        zOnStartNestedScroll = false;
                    }
                    if (zOnStartNestedScroll) {
                        if (i11 == 0) {
                            this.f23185a = parent;
                        } else if (i11 == 1) {
                            this.f23186b = parent;
                        }
                        if (z10) {
                            ((l) parent).d(view2, view, i10, i11);
                        } else if (i11 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i10);
                            } catch (AbstractMethodError e10) {
                                io.sentry.android.core.e0.c("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e10);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void h(int i10) {
        ViewParent viewParentE = e(i10);
        if (viewParentE != null) {
            boolean z10 = viewParentE instanceof l;
            ViewGroup viewGroup = this.f23187c;
            if (z10) {
                ((l) viewParentE).e(viewGroup, i10);
            } else if (i10 == 0) {
                try {
                    viewParentE.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e4) {
                    io.sentry.android.core.e0.c("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onStopNestedScroll", e4);
                }
            }
            if (i10 == 0) {
                this.f23185a = null;
            } else {
                if (i10 != 1) {
                    return;
                }
                this.f23186b = null;
            }
        }
    }
}
