package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class tn {
    public final ViewGroup a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public boolean d = false;
    public boolean e = false;

    public tn(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public static tn f(ViewGroup viewGroup, fr frVar) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof tn) {
            return (tn) tag;
        }
        frVar.getClass();
        tn tnVar = new tn(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, tnVar);
        return tnVar;
    }

    public final void a(int i, int i2, ex exVar) {
        synchronized (this.b) {
            try {
                md mdVar = new md();
                lx0 lx0VarD = d(exVar.c);
                if (lx0VarD != null) {
                    lx0VarD.c(i, i2);
                    return;
                }
                lx0 lx0Var = new lx0(i, i2, exVar, mdVar);
                this.b.add(lx0Var);
                lx0Var.d.add(new kx0(this, lx0Var, 0));
                lx0Var.d.add(new kx0(this, lx0Var, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(ArrayList arrayList, boolean z) {
        boolean z2;
        ArrayList arrayList2;
        ViewGroup viewGroup;
        int size = arrayList.size();
        boolean z3 = false;
        lx0 lx0Var = null;
        int i = 0;
        lx0 lx0Var2 = null;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            lx0 lx0Var3 = (lx0) obj;
            int iC = ex0.c(lx0Var3.c.J);
            int iS = ex0.s(lx0Var3.a);
            if (iS != 0) {
                if (iS != 1) {
                    if (iS == 2 || iS == 3) {
                    }
                } else if (iC != 2) {
                    lx0Var2 = lx0Var3;
                }
            }
            if (iC == 2 && lx0Var == null) {
                lx0Var = lx0Var3;
            }
        }
        if (xw.F(2)) {
            Objects.toString(lx0Var);
            Objects.toString(lx0Var2);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList(arrayList);
        iw iwVar = ((lx0) arrayList.get(arrayList.size() - 1)).c;
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            hw hwVar = ((lx0) obj2).c.M;
            hw hwVar2 = iwVar.M;
            hwVar.b = hwVar2.b;
            hwVar.c = hwVar2.c;
            hwVar.d = hwVar2.d;
            hwVar.e = hwVar2.e;
        }
        int size3 = arrayList.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList.get(i3);
            i3++;
            lx0 lx0Var4 = (lx0) obj3;
            md mdVar = new md();
            lx0Var4.d();
            HashSet hashSet = lx0Var4.e;
            hashSet.add(mdVar);
            rn rnVar = new rn(lx0Var4, mdVar);
            rnVar.d = z3;
            rnVar.c = z;
            arrayList3.add(rnVar);
            md mdVar2 = new md();
            lx0Var4.d();
            hashSet.add(mdVar2);
            boolean z4 = (!z ? lx0Var4 == lx0Var2 : lx0Var4 == lx0Var) ? z3 : true;
            sn snVar = new sn(lx0Var4, mdVar2);
            int i4 = lx0Var4.a;
            iw iwVar2 = lx0Var4.c;
            if (i4 == 2) {
                if (z) {
                    hw hwVar3 = iwVar2.M;
                } else {
                    iwVar2.getClass();
                }
                if (z) {
                    hw hwVar4 = iwVar2.M;
                } else {
                    hw hwVar5 = iwVar2.M;
                }
            } else if (z) {
                hw hwVar6 = iwVar2.M;
            } else {
                iwVar2.getClass();
            }
            if (z4) {
                if (z) {
                    hw hwVar7 = iwVar2.M;
                } else {
                    iwVar2.getClass();
                }
            }
            arrayList4.add(snVar);
            lx0Var4.d.add(new jq3(this, arrayList5, lx0Var4));
            z3 = false;
        }
        HashMap map = new HashMap();
        int size4 = arrayList4.size();
        int i5 = 0;
        while (i5 < size4) {
            Object obj4 = arrayList4.get(i5);
            i5++;
            lx0 lx0Var5 = (lx0) ((sn) obj4).a;
            ex0.c(lx0Var5.c.J);
            int i6 = lx0Var5.a;
        }
        int size5 = arrayList4.size();
        int i7 = 0;
        while (i7 < size5) {
            Object obj5 = arrayList4.get(i7);
            i7++;
            sn snVar2 = (sn) obj5;
            map.put((lx0) snVar2.a, Boolean.FALSE);
            snVar2.e();
        }
        boolean zContainsValue = map.containsValue(Boolean.TRUE);
        ViewGroup viewGroup2 = this.a;
        Context context = viewGroup2.getContext();
        ArrayList arrayList6 = new ArrayList();
        int size6 = arrayList3.size();
        boolean z5 = false;
        int i8 = 0;
        while (i8 < size6) {
            Object obj6 = arrayList3.get(i8);
            i8++;
            rn rnVar2 = (rn) obj6;
            lx0 lx0Var6 = (lx0) rnVar2.a;
            int iC2 = ex0.c(lx0Var6.c.J);
            int i9 = lx0Var6.a;
            if (iC2 == i9 || !(iC2 == 2 || i9 == 2)) {
                z2 = zContainsValue;
                arrayList2 = arrayList3;
                viewGroup = viewGroup2;
                rnVar2.e();
                zContainsValue = z2;
                viewGroup2 = viewGroup;
                arrayList3 = arrayList2;
            } else {
                gw3 gw3VarW = rnVar2.w(context);
                if (gw3VarW == null) {
                    rnVar2.e();
                } else {
                    Animator animator = (Animator) gw3VarW.h;
                    if (animator == null) {
                        arrayList6.add(rnVar2);
                    } else {
                        lx0 lx0Var7 = (lx0) rnVar2.a;
                        iw iwVar3 = lx0Var7.c;
                        z2 = zContainsValue;
                        arrayList2 = arrayList3;
                        if (Boolean.TRUE.equals(map.get(lx0Var7))) {
                            if (xw.F(2)) {
                                Objects.toString(iwVar3);
                            }
                            rnVar2.e();
                            viewGroup = viewGroup2;
                            zContainsValue = z2;
                            viewGroup2 = viewGroup;
                            arrayList3 = arrayList2;
                        } else {
                            boolean z6 = lx0Var7.a == 3;
                            if (z6) {
                                arrayList5.remove(lx0Var7);
                            }
                            View view = iwVar3.J;
                            viewGroup2.startViewTransition(view);
                            ViewGroup viewGroup3 = viewGroup2;
                            animator.addListener(new pn(viewGroup3, view, z6, lx0Var7, rnVar2));
                            animator.setTarget(view);
                            animator.start();
                            if (xw.F(2)) {
                                lx0Var7.toString();
                            }
                            ((md) rnVar2.b).a(new gw3(animator, lx0Var7, 6, false));
                            zContainsValue = z2;
                            viewGroup2 = viewGroup3;
                            arrayList3 = arrayList2;
                            z5 = true;
                        }
                    }
                }
                z2 = zContainsValue;
                arrayList2 = arrayList3;
                viewGroup = viewGroup2;
                zContainsValue = z2;
                viewGroup2 = viewGroup;
                arrayList3 = arrayList2;
            }
        }
        boolean z7 = zContainsValue;
        ViewGroup viewGroup4 = viewGroup2;
        int size7 = arrayList6.size();
        int i10 = 0;
        while (i10 < size7) {
            Object obj7 = arrayList6.get(i10);
            i10++;
            rn rnVar3 = (rn) obj7;
            lx0 lx0Var8 = (lx0) rnVar3.a;
            iw iwVar4 = lx0Var8.c;
            if (z7) {
                if (xw.F(2)) {
                    Objects.toString(iwVar4);
                }
                rnVar3.e();
            } else if (z5) {
                if (xw.F(2)) {
                    Objects.toString(iwVar4);
                }
                rnVar3.e();
            } else {
                View view2 = iwVar4.J;
                gw3 gw3VarW2 = rnVar3.w(context);
                gw3VarW2.getClass();
                Animation animation = (Animation) gw3VarW2.g;
                animation.getClass();
                if (lx0Var8.a != 1) {
                    view2.startAnimation(animation);
                    rnVar3.e();
                } else {
                    viewGroup4.startViewTransition(view2);
                    lw lwVar = new lw(animation, viewGroup4, view2);
                    lwVar.setAnimationListener(new qn(lx0Var8, viewGroup4, view2, rnVar3));
                    view2.startAnimation(lwVar);
                    if (xw.F(2)) {
                        lx0Var8.toString();
                    }
                }
                ((md) rnVar3.b).a(new p21(view2, viewGroup4, rnVar3, lx0Var8));
            }
        }
        int size8 = arrayList5.size();
        int i11 = 0;
        while (i11 < size8) {
            Object obj8 = arrayList5.get(i11);
            i11++;
            lx0 lx0Var9 = (lx0) obj8;
            ex0.a(lx0Var9.c.J, lx0Var9.a);
        }
        arrayList5.clear();
        if (xw.F(2)) {
            Objects.toString(lx0Var);
            Objects.toString(lx0Var2);
        }
    }

    public final void c() {
        if (this.e) {
            return;
        }
        ViewGroup viewGroup = this.a;
        WeakHashMap weakHashMap = e61.a;
        if (!viewGroup.isAttachedToWindow()) {
            e();
            this.d = false;
            return;
        }
        synchronized (this.b) {
            try {
                if (!this.b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.c);
                    this.c.clear();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        lx0 lx0Var = (lx0) obj;
                        if (xw.F(2)) {
                            Objects.toString(lx0Var);
                        }
                        lx0Var.a();
                        if (!lx0Var.g) {
                            this.c.add(lx0Var);
                        }
                    }
                    g();
                    ArrayList arrayList2 = new ArrayList(this.b);
                    this.b.clear();
                    this.c.addAll(arrayList2);
                    xw.F(2);
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = arrayList2.get(i2);
                        i2++;
                        ((lx0) obj2).d();
                    }
                    b(arrayList2, this.d);
                    this.d = false;
                    xw.F(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final lx0 d(iw iwVar) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            lx0 lx0Var = (lx0) obj;
            if (lx0Var.c.equals(iwVar) && !lx0Var.f) {
                return lx0Var;
            }
        }
        return null;
    }

    public final void e() {
        xw.F(2);
        ViewGroup viewGroup = this.a;
        WeakHashMap weakHashMap = e61.a;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.b) {
            try {
                g();
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((lx0) obj).d();
                }
                ArrayList arrayList2 = new ArrayList(this.c);
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    lx0 lx0Var = (lx0) obj2;
                    if (xw.F(2)) {
                        if (!zIsAttachedToWindow) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Container ");
                            sb.append(this.a);
                            sb.append(" is not attached to window. ");
                        }
                        Objects.toString(lx0Var);
                    }
                    lx0Var.a();
                }
                ArrayList arrayList3 = new ArrayList(this.b);
                int size3 = arrayList3.size();
                while (i < size3) {
                    Object obj3 = arrayList3.get(i);
                    i++;
                    lx0 lx0Var2 = (lx0) obj3;
                    if (xw.F(2)) {
                        if (!zIsAttachedToWindow) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Container ");
                            sb2.append(this.a);
                            sb2.append(" is not attached to window. ");
                        }
                        Objects.toString(lx0Var2);
                    }
                    lx0Var2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            lx0 lx0Var = (lx0) obj;
            if (lx0Var.b == 2) {
                lx0Var.c(ex0.b(lx0Var.c.H().getVisibility()), 1);
            }
        }
    }
}
