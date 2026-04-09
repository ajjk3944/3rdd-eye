package K1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* compiled from: ChangeBounds.java */
/* loaded from: classes.dex */
public final class b extends i {

    /* renamed from: C, reason: collision with root package name */
    public static final String[] f2947C = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: D, reason: collision with root package name */
    public static final a f2948D = new a(PointF.class, "topLeft");

    /* renamed from: E, reason: collision with root package name */
    public static final C0052b f2949E = new C0052b(PointF.class, "bottomRight");

    /* renamed from: F, reason: collision with root package name */
    public static final c f2950F = new c(PointF.class, "bottomRight");

    /* renamed from: G, reason: collision with root package name */
    public static final d f2951G = new d(PointF.class, "topLeft");

    /* renamed from: H, reason: collision with root package name */
    public static final e f2952H = new e(PointF.class, "position");

    /* compiled from: ChangeBounds.java */
    public class a extends Property<h, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(h hVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(h hVar, PointF pointF) {
            h hVar2 = hVar;
            PointF pointF2 = pointF;
            hVar2.getClass();
            hVar2.f2955a = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            hVar2.f2956b = iRound;
            int i = hVar2.f2960f + 1;
            hVar2.f2960f = i;
            if (i == hVar2.f2961g) {
                s.a(hVar2.f2959e, hVar2.f2955a, iRound, hVar2.f2957c, hVar2.f2958d);
                hVar2.f2960f = 0;
                hVar2.f2961g = 0;
            }
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: K1.b$b, reason: collision with other inner class name */
    public class C0052b extends Property<h, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(h hVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(h hVar, PointF pointF) {
            h hVar2 = hVar;
            PointF pointF2 = pointF;
            hVar2.getClass();
            hVar2.f2957c = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            hVar2.f2958d = iRound;
            int i = hVar2.f2961g + 1;
            hVar2.f2961g = i;
            if (hVar2.f2960f == i) {
                s.a(hVar2.f2959e, hVar2.f2955a, hVar2.f2956b, hVar2.f2957c, iRound);
                hVar2.f2960f = 0;
                hVar2.f2961g = 0;
            }
        }
    }

    /* compiled from: ChangeBounds.java */
    public class c extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            s.a(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    /* compiled from: ChangeBounds.java */
    public class d extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            s.a(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    /* compiled from: ChangeBounds.java */
    public class e extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int iRound = Math.round(pointF2.x);
            int iRound2 = Math.round(pointF2.y);
            s.a(view2, iRound, iRound2, view2.getWidth() + iRound, view2.getHeight() + iRound2);
        }
    }

    /* compiled from: ChangeBounds.java */
    public class f extends AnimatorListenerAdapter {
        private final h mViewBounds;

        public f(h hVar) {
            this.mViewBounds = hVar;
        }
    }

    /* compiled from: ChangeBounds.java */
    public static class g extends l {

        /* renamed from: a, reason: collision with root package name */
        public boolean f2953a = false;

        /* renamed from: b, reason: collision with root package name */
        public final ViewGroup f2954b;

        public g(ViewGroup viewGroup) {
            this.f2954b = viewGroup;
        }

        @Override // K1.i.d
        public final void a(i iVar) {
            if (!this.f2953a) {
                r.a(this.f2954b, false);
            }
            iVar.z(this);
        }

        @Override // K1.l, K1.i.d
        public final void c(i iVar) {
            r.a(this.f2954b, true);
        }

        @Override // K1.l, K1.i.d
        public final void f(i iVar) {
            r.a(this.f2954b, false);
            this.f2953a = true;
        }

        @Override // K1.l, K1.i.d
        public final void g(i iVar) {
            r.a(this.f2954b, false);
        }
    }

    /* compiled from: ChangeBounds.java */
    public static class h {

        /* renamed from: a, reason: collision with root package name */
        public int f2955a;

        /* renamed from: b, reason: collision with root package name */
        public int f2956b;

        /* renamed from: c, reason: collision with root package name */
        public int f2957c;

        /* renamed from: d, reason: collision with root package name */
        public int f2958d;

        /* renamed from: e, reason: collision with root package name */
        public final View f2959e;

        /* renamed from: f, reason: collision with root package name */
        public int f2960f;

        /* renamed from: g, reason: collision with root package name */
        public int f2961g;

        public h(View view) {
            this.f2959e = view;
        }
    }

    public static void M(p pVar) {
        View view = pVar.f3032b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap map = pVar.f3031a;
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", pVar.f3032b.getParent());
    }

    @Override // K1.i
    public final void f(p pVar) {
        M(pVar);
    }

    @Override // K1.i
    public final void i(p pVar) {
        M(pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // K1.i
    public final Animator m(ViewGroup viewGroup, p pVar, p pVar2) {
        int i;
        b bVar;
        ObjectAnimator objectAnimatorA;
        if (pVar != null && pVar2 != null) {
            HashMap map = pVar.f3031a;
            HashMap map2 = pVar2.f3031a;
            ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
            ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
            if (viewGroup2 != null && viewGroup3 != null) {
                Rect rect = (Rect) map.get("android:changeBounds:bounds");
                Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
                int i10 = rect.left;
                int i11 = rect2.left;
                int i12 = rect.top;
                int i13 = rect2.top;
                int i14 = rect.right;
                int i15 = rect2.right;
                int i16 = rect.bottom;
                int i17 = rect2.bottom;
                int i18 = i14 - i10;
                int i19 = i16 - i12;
                int i20 = i15 - i11;
                int i21 = i17 - i13;
                Rect rect3 = (Rect) map.get("android:changeBounds:clip");
                Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
                if ((i18 == 0 || i19 == 0) && (i20 == 0 || i21 == 0)) {
                    i = 0;
                } else {
                    i = (i10 == i11 && i12 == i13) ? 0 : 1;
                    if (i14 != i15 || i16 != i17) {
                        i++;
                    }
                }
                if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                    i++;
                }
                if (i > 0) {
                    View view = pVar2.f3032b;
                    s.a(view, i10, i12, i14, i16);
                    if (i != 2) {
                        bVar = this;
                        objectAnimatorA = (i10 == i11 && i12 == i13) ? K1.g.a(view, f2950F, bVar.f3000x.i0(i14, i16, i15, i17)) : K1.g.a(view, f2951G, bVar.f3000x.i0(i10, i12, i11, i13));
                    } else if (i18 == i20 && i19 == i21) {
                        bVar = this;
                        objectAnimatorA = K1.g.a(view, f2952H, bVar.f3000x.i0(i10, i12, i11, i13));
                    } else {
                        bVar = this;
                        h hVar = new h(view);
                        ObjectAnimator objectAnimatorA2 = K1.g.a(hVar, f2948D, bVar.f3000x.i0(i10, i12, i11, i13));
                        ObjectAnimator objectAnimatorA3 = K1.g.a(hVar, f2949E, bVar.f3000x.i0(i14, i16, i15, i17));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(objectAnimatorA2, objectAnimatorA3);
                        animatorSet.addListener(new f(hVar));
                        objectAnimatorA = animatorSet;
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                        r.a(viewGroup4, true);
                        bVar.r().a(new g(viewGroup4));
                    }
                    return objectAnimatorA;
                }
            }
        }
        return null;
    }

    @Override // K1.i
    public final String[] t() {
        return f2947C;
    }
}
