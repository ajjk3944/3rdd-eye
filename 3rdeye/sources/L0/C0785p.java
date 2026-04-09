package L0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: NestedScrollingChildHelper.java */
/* renamed from: L0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0785p {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f3926a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f3927b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f3928c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3929d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f3930e;

    public C0785p(ViewGroup viewGroup) {
        this.f3928c = viewGroup;
    }

    public final boolean a(float f10, float f11, boolean z10) {
        ViewParent viewParentE;
        if (this.f3929d && (viewParentE = e(0)) != null) {
            try {
                return P.a(viewParentE, this.f3928c, f10, f11, z10);
            } catch (AbstractMethodError e4) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedFling", e4);
            }
        }
        return false;
    }

    public final boolean b(float f10, float f11) {
        ViewParent viewParentE;
        if (this.f3929d && (viewParentE = e(0)) != null) {
            try {
                return P.b(viewParentE, this.f3928c, f10, f11);
            } catch (AbstractMethodError e4) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreFling", e4);
            }
        }
        return false;
    }

    public final boolean c(int i, int i10, int[] iArr, int[] iArr2, int i11) {
        ViewParent viewParentE;
        int i12;
        int i13;
        if (!this.f3929d || (viewParentE = e(i11)) == null) {
            return false;
        }
        if (i == 0 && i10 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f3928c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i12 = iArr2[0];
            i13 = iArr2[1];
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (iArr == null) {
            if (this.f3930e == null) {
                this.f3930e = new int[2];
            }
            iArr = this.f3930e;
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentE instanceof InterfaceC0786q) {
            ((InterfaceC0786q) viewParentE).o(viewGroup, i, i10, iArr3, i11);
        } else if (i11 == 0) {
            try {
                P.c(viewParentE, viewGroup, i, i10, iArr3);
            } catch (AbstractMethodError e4) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreScroll", e4);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i12;
            iArr2[1] = iArr2[1] - i13;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean d(int i, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        ViewParent viewParentE;
        int i14;
        int i15;
        int[] iArr3;
        if (this.f3929d && (viewParentE = e(i13)) != null) {
            if (i != 0 || i10 != 0 || i11 != 0 || i12 != 0) {
                ViewGroup viewGroup = this.f3928c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i14 = iArr[0];
                    i15 = iArr[1];
                } else {
                    i14 = 0;
                    i15 = 0;
                }
                if (iArr2 == null) {
                    if (this.f3930e == null) {
                        this.f3930e = new int[2];
                    }
                    int[] iArr4 = this.f3930e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentE instanceof r) {
                    ((r) viewParentE).k(viewGroup, i, i10, i11, i12, i13, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i11;
                    iArr3[1] = iArr3[1] + i12;
                    if (viewParentE instanceof InterfaceC0786q) {
                        ((InterfaceC0786q) viewParentE).l(viewGroup, i, i10, i11, i12, i13);
                    } else if (i13 == 0) {
                        try {
                            P.d(viewParentE, viewGroup, i, i10, i11, i12);
                        } catch (AbstractMethodError e4) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedScroll", e4);
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

    public final ViewParent e(int i) {
        if (i == 0) {
            return this.f3926a;
        }
        if (i != 1) {
            return null;
        }
        return this.f3927b;
    }

    public final boolean f(int i) {
        return e(i) != null;
    }

    public final boolean g(int i, int i10) {
        boolean zF;
        if (!f(i10)) {
            if (this.f3929d) {
                ViewGroup viewGroup = this.f3928c;
                View view = viewGroup;
                for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z10 = parent instanceof InterfaceC0786q;
                    if (z10) {
                        zF = ((InterfaceC0786q) parent).m(view, viewGroup, i, i10);
                    } else if (i10 == 0) {
                        try {
                            zF = P.f(parent, view, viewGroup, i);
                        } catch (AbstractMethodError e4) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e4);
                        }
                    } else {
                        zF = false;
                    }
                    if (zF) {
                        if (i10 == 0) {
                            this.f3926a = parent;
                        } else if (i10 == 1) {
                            this.f3927b = parent;
                        }
                        if (z10) {
                            ((InterfaceC0786q) parent).n(view, viewGroup, i, i10);
                        } else if (i10 == 0) {
                            try {
                                P.e(parent, view, viewGroup, i);
                            } catch (AbstractMethodError e10) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e10);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void h(int i) {
        ViewParent viewParentE = e(i);
        if (viewParentE != null) {
            boolean z10 = viewParentE instanceof InterfaceC0786q;
            ViewGroup viewGroup = this.f3928c;
            if (z10) {
                ((InterfaceC0786q) viewParentE).j(i, viewGroup);
            } else if (i == 0) {
                try {
                    P.g(viewParentE, viewGroup);
                } catch (AbstractMethodError e4) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onStopNestedScroll", e4);
                }
            }
            if (i == 0) {
                this.f3926a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f3927b = null;
            }
        }
    }
}
