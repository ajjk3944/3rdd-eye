package e4;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f22380a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f22381b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f22382c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f22383d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f22384e;

    public p(ViewGroup viewGroup) {
        this.f22382c = viewGroup;
    }

    public final boolean a(float f10, float f11, boolean z3) {
        ViewParent viewParentE;
        if (this.f22383d && (viewParentE = e(0)) != null) {
            try {
                return viewParentE.onNestedFling(this.f22382c, f10, f11, z3);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedFling", e2);
            }
        }
        return false;
    }

    public final boolean b(float f10, float f11) {
        ViewParent viewParentE;
        if (this.f22383d && (viewParentE = e(0)) != null) {
            try {
                return viewParentE.onNestedPreFling(this.f22382c, f10, f11);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreFling", e2);
            }
        }
        return false;
    }

    public final boolean c(int i4, int i10, int i11, int[] iArr, int[] iArr2) {
        ViewParent viewParentE;
        int i12;
        int i13;
        int[] iArr3;
        if (!this.f22383d || (viewParentE = e(i11)) == null) {
            return false;
        }
        if (i4 == 0 && i10 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f22382c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i12 = iArr2[0];
            i13 = iArr2[1];
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (iArr == null) {
            if (this.f22384e == null) {
                this.f22384e = new int[2];
            }
            iArr3 = this.f22384e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentE instanceof q) {
            ((q) viewParentE).h(viewGroup, i4, i10, iArr3, i11);
        } else if (i11 == 0) {
            try {
                viewParentE.onNestedPreScroll(viewGroup, i4, i10, iArr3);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreScroll", e2);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i12;
            iArr2[1] = iArr2[1] - i13;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean d(int i4, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        ViewParent viewParentE;
        int i14;
        int i15;
        int[] iArr3;
        if (this.f22383d && (viewParentE = e(i13)) != null) {
            if (i4 != 0 || i10 != 0 || i11 != 0 || i12 != 0) {
                ViewGroup viewGroup = this.f22382c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i14 = iArr[0];
                    i15 = iArr[1];
                } else {
                    i14 = 0;
                    i15 = 0;
                }
                if (iArr2 == null) {
                    if (this.f22384e == null) {
                        this.f22384e = new int[2];
                    }
                    int[] iArr4 = this.f22384e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentE instanceof r) {
                    ((r) viewParentE).d(viewGroup, i4, i10, i11, i12, i13, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i11;
                    iArr3[1] = iArr3[1] + i12;
                    if (viewParentE instanceof q) {
                        ((q) viewParentE).e(viewGroup, i4, i10, i11, i12, i13);
                    } else if (i13 == 0) {
                        try {
                            viewParentE.onNestedScroll(viewGroup, i4, i10, i11, i12);
                        } catch (AbstractMethodError e2) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedScroll", e2);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i14;
                    iArr[1] = iArr[1] - i15;
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

    public final ViewParent e(int i4) {
        if (i4 == 0) {
            return this.f22380a;
        }
        if (i4 != 1) {
            return null;
        }
        return this.f22381b;
    }

    public final boolean f(int i4) {
        return e(i4) != null;
    }

    public final boolean g(int i4, int i10) {
        boolean zOnStartNestedScroll;
        if (!f(i10)) {
            if (this.f22383d) {
                View view = this.f22382c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z3 = parent instanceof q;
                    if (z3) {
                        zOnStartNestedScroll = ((q) parent).f(view2, view, i4, i10);
                    } else if (i10 == 0) {
                        try {
                            zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i4);
                        } catch (AbstractMethodError e2) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e2);
                        }
                    } else {
                        zOnStartNestedScroll = false;
                    }
                    if (zOnStartNestedScroll) {
                        if (i10 == 0) {
                            this.f22380a = parent;
                        } else if (i10 == 1) {
                            this.f22381b = parent;
                        }
                        if (z3) {
                            ((q) parent).g(view2, view, i4, i10);
                        } else if (i10 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i4);
                            } catch (AbstractMethodError e10) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e10);
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

    public final void h(int i4) {
        ViewParent viewParentE = e(i4);
        if (viewParentE != null) {
            boolean z3 = viewParentE instanceof q;
            ViewGroup viewGroup = this.f22382c;
            if (z3) {
                ((q) viewParentE).c(i4, viewGroup);
            } else if (i4 == 0) {
                try {
                    viewParentE.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onStopNestedScroll", e2);
                }
            }
            if (i4 == 0) {
                this.f22380a = null;
            } else {
                if (i4 != 1) {
                    return;
                }
                this.f22381b = null;
            }
        }
    }
}
