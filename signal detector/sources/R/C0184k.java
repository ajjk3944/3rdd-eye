package R;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: R.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0184k {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f3340a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f3341b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f3342c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3343d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f3344e;

    public C0184k(ViewGroup viewGroup) {
        this.f3342c = viewGroup;
    }

    public final boolean a(float f2, float f5, boolean z6) {
        ViewParent viewParentE;
        if (this.f3343d && (viewParentE = e(0)) != null) {
            try {
                return viewParentE.onNestedFling(this.f3342c, f2, f5, z6);
            } catch (AbstractMethodError e6) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedFling", e6);
            }
        }
        return false;
    }

    public final boolean b(float f2, float f5) {
        ViewParent viewParentE;
        if (this.f3343d && (viewParentE = e(0)) != null) {
            try {
                return viewParentE.onNestedPreFling(this.f3342c, f2, f5);
            } catch (AbstractMethodError e6) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreFling", e6);
            }
        }
        return false;
    }

    public final boolean c(int i, int i3, int i6, int[] iArr, int[] iArr2) {
        ViewParent viewParentE;
        int i7;
        int i8;
        int[] iArr3;
        if (!this.f3343d || (viewParentE = e(i6)) == null) {
            return false;
        }
        if (i == 0 && i3 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f3342c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i7 = iArr2[0];
            i8 = iArr2[1];
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (iArr == null) {
            if (this.f3344e == null) {
                this.f3344e = new int[2];
            }
            iArr3 = this.f3344e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentE instanceof InterfaceC0185l) {
            ((InterfaceC0185l) viewParentE).f(viewGroup, i, i3, iArr3, i6);
        } else if (i6 == 0) {
            try {
                viewParentE.onNestedPreScroll(viewGroup, i, i3, iArr3);
            } catch (AbstractMethodError e6) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreScroll", e6);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i7;
            iArr2[1] = iArr2[1] - i8;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean d(int i, int i3, int i6, int i7, int[] iArr, int i8, int[] iArr2) {
        ViewParent viewParentE;
        int i9;
        int i10;
        int[] iArr3;
        if (this.f3343d && (viewParentE = e(i8)) != null) {
            if (i != 0 || i3 != 0 || i6 != 0 || i7 != 0) {
                ViewGroup viewGroup = this.f3342c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i9 = iArr[0];
                    i10 = iArr[1];
                } else {
                    i9 = 0;
                    i10 = 0;
                }
                if (iArr2 == null) {
                    if (this.f3344e == null) {
                        this.f3344e = new int[2];
                    }
                    int[] iArr4 = this.f3344e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentE instanceof InterfaceC0186m) {
                    ((InterfaceC0186m) viewParentE).b(viewGroup, i, i3, i6, i7, i8, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i6;
                    iArr3[1] = iArr3[1] + i7;
                    if (viewParentE instanceof InterfaceC0185l) {
                        ((InterfaceC0185l) viewParentE).c(viewGroup, i, i3, i6, i7, i8);
                    } else if (i8 == 0) {
                        try {
                            viewParentE.onNestedScroll(viewGroup, i, i3, i6, i7);
                        } catch (AbstractMethodError e6) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedScroll", e6);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i9;
                    iArr[1] = iArr[1] - i10;
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
            return this.f3340a;
        }
        if (i != 1) {
            return null;
        }
        return this.f3341b;
    }

    public final boolean f(int i) {
        return e(i) != null;
    }

    public final boolean g(int i, int i3) {
        boolean zOnStartNestedScroll;
        if (!f(i3)) {
            if (this.f3343d) {
                View view = this.f3342c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z6 = parent instanceof InterfaceC0185l;
                    if (z6) {
                        zOnStartNestedScroll = ((InterfaceC0185l) parent).d(view2, view, i, i3);
                    } else if (i3 == 0) {
                        try {
                            zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i);
                        } catch (AbstractMethodError e6) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e6);
                        }
                    } else {
                        zOnStartNestedScroll = false;
                    }
                    if (zOnStartNestedScroll) {
                        if (i3 == 0) {
                            this.f3340a = parent;
                        } else if (i3 == 1) {
                            this.f3341b = parent;
                        }
                        if (z6) {
                            ((InterfaceC0185l) parent).e(view2, view, i, i3);
                        } else if (i3 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i);
                            } catch (AbstractMethodError e7) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e7);
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

    public final void h(int i) {
        ViewParent viewParentE = e(i);
        if (viewParentE != null) {
            boolean z6 = viewParentE instanceof InterfaceC0185l;
            ViewGroup viewGroup = this.f3342c;
            if (z6) {
                ((InterfaceC0185l) viewParentE).a(i, viewGroup);
            } else if (i == 0) {
                try {
                    viewParentE.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e6) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onStopNestedScroll", e6);
                }
            }
            if (i == 0) {
                this.f3340a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f3341b = null;
            }
        }
    }
}
