package j;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import j.C5161b;
import j.C5163d;
import m0.C5313f;
import m0.j;
import m0.k;
import n0.C5346a;

/* compiled from: AnimatedStateListDrawableCompat.java */
/* renamed from: j.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5160a extends C5163d {

    /* renamed from: q, reason: collision with root package name */
    public b f42612q;

    /* renamed from: r, reason: collision with root package name */
    public f f42613r;

    /* renamed from: s, reason: collision with root package name */
    public int f42614s = -1;

    /* renamed from: t, reason: collision with root package name */
    public int f42615t = -1;

    /* renamed from: u, reason: collision with root package name */
    public boolean f42616u;

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* renamed from: j.a$a, reason: collision with other inner class name */
    public static class C0469a extends f {

        /* renamed from: a, reason: collision with root package name */
        public final Animatable f42617a;

        public C0469a(Animatable animatable) {
            this.f42617a = animatable;
        }

        @Override // j.C5160a.f
        public final void c() {
            this.f42617a.start();
        }

        @Override // j.C5160a.f
        public final void d() {
            this.f42617a.stop();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* renamed from: j.a$b */
    public static class b extends C5163d.a {

        /* renamed from: I, reason: collision with root package name */
        public C5313f<Long> f42618I;

        /* renamed from: J, reason: collision with root package name */
        public j<Integer> f42619J;

        public b(b bVar, C5160a c5160a, Resources resources) {
            super(bVar, c5160a, resources);
            if (bVar != null) {
                this.f42618I = bVar.f42618I;
                this.f42619J = bVar.f42619J;
            } else {
                this.f42618I = new C5313f<>();
                this.f42619J = new j<>();
            }
        }

        @Override // j.C5163d.a, j.C5161b.c
        public final void e() {
            this.f42618I = this.f42618I.clone();
            this.f42619J = this.f42619J.clone();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r5v3 */
        public final int g(int i) {
            ?? r52;
            if (i < 0) {
                return 0;
            }
            j<Integer> jVar = this.f42619J;
            int i10 = 0;
            int iA = C5346a.a(jVar.f44033d, i, jVar.f44031b);
            if (iA >= 0 && (r52 = jVar.f44032c[iA]) != k.f44034a) {
                i10 = r52;
            }
            return i10.intValue();
        }

        @Override // j.C5163d.a, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new C5160a(this, null);
        }

        @Override // j.C5163d.a, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new C5160a(this, resources);
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* renamed from: j.a$c */
    public static class c extends f {

        /* renamed from: a, reason: collision with root package name */
        public final L1.d f42620a;

        public c(L1.d dVar) {
            this.f42620a = dVar;
        }

        @Override // j.C5160a.f
        public final void c() {
            this.f42620a.start();
        }

        @Override // j.C5160a.f
        public final void d() {
            this.f42620a.stop();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* renamed from: j.a$d */
    public static class d extends f {

        /* renamed from: a, reason: collision with root package name */
        public final ObjectAnimator f42621a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f42622b;

        public d(AnimationDrawable animationDrawable, boolean z10, boolean z11) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z10 ? numberOfFrames - 1 : 0;
            int i10 = z10 ? 0 : numberOfFrames - 1;
            e eVar = new e();
            int numberOfFrames2 = animationDrawable.getNumberOfFrames();
            eVar.f42624b = numberOfFrames2;
            int[] iArr = eVar.f42623a;
            if (iArr == null || iArr.length < numberOfFrames2) {
                eVar.f42623a = new int[numberOfFrames2];
            }
            int[] iArr2 = eVar.f42623a;
            int i11 = 0;
            for (int i12 = 0; i12 < numberOfFrames2; i12++) {
                int duration = animationDrawable.getDuration(z10 ? (numberOfFrames2 - i12) - 1 : i12);
                iArr2[i12] = duration;
                i11 += duration;
            }
            eVar.f42625c = i11;
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i10);
            objectAnimatorOfInt.setAutoCancel(true);
            objectAnimatorOfInt.setDuration(eVar.f42625c);
            objectAnimatorOfInt.setInterpolator(eVar);
            this.f42622b = z11;
            this.f42621a = objectAnimatorOfInt;
        }

        @Override // j.C5160a.f
        public final boolean a() {
            return this.f42622b;
        }

        @Override // j.C5160a.f
        public final void b() {
            this.f42621a.reverse();
        }

        @Override // j.C5160a.f
        public final void c() {
            this.f42621a.start();
        }

        @Override // j.C5160a.f
        public final void d() {
            this.f42621a.cancel();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* renamed from: j.a$e */
    public static class e implements TimeInterpolator {

        /* renamed from: a, reason: collision with root package name */
        public int[] f42623a;

        /* renamed from: b, reason: collision with root package name */
        public int f42624b;

        /* renamed from: c, reason: collision with root package name */
        public int f42625c;

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            int i = (int) ((f10 * this.f42625c) + 0.5f);
            int i10 = this.f42624b;
            int[] iArr = this.f42623a;
            int i11 = 0;
            while (i11 < i10) {
                int i12 = iArr[i11];
                if (i < i12) {
                    break;
                }
                i -= i12;
                i11++;
            }
            return (i11 / i10) + (i11 < i10 ? i / this.f42625c : 0.0f);
        }
    }

    public C5160a(b bVar, Resources resources) {
        e(new b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x0265, code lost:
    
        r5.onStateChange(r5.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x026c, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static j.C5160a g(android.content.Context r23, android.content.res.Resources r24, android.content.res.XmlResourceParser r25, android.util.AttributeSet r26, android.content.res.Resources.Theme r27) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 651
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j.C5160a.g(android.content.Context, android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):j.a");
    }

    @Override // j.C5163d, j.C5161b
    public final C5161b.c b() {
        return new b(this.f42612q, this, null);
    }

    @Override // j.C5163d, j.C5161b
    public final void e(C5161b.c cVar) {
        super.e(cVar);
        if (cVar instanceof b) {
            this.f42612q = (b) cVar;
        }
    }

    @Override // j.C5163d
    /* renamed from: f */
    public final C5163d.a b() {
        return new b(this.f42612q, this, null);
    }

    @Override // j.C5161b, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        f fVar = this.f42613r;
        if (fVar != null) {
            fVar.d();
            this.f42613r = null;
            d(this.f42614s);
            this.f42614s = -1;
            this.f42615t = -1;
        }
    }

    @Override // j.C5163d, j.C5161b, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f42616u) {
            super.mutate();
            this.f42612q.e();
            this.f42616u = true;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d1  */
    @Override // j.C5163d, j.C5161b, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onStateChange(int[] r15) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j.C5160a.onStateChange(int[]):boolean");
    }

    @Override // j.C5161b, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        f fVar = this.f42613r;
        if (fVar != null && (visible || z11)) {
            if (z10) {
                fVar.c();
                return visible;
            }
            jumpToCurrentState();
        }
        return visible;
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* renamed from: j.a$f */
    public static abstract class f {
        public boolean a() {
            return false;
        }

        public abstract void c();

        public abstract void d();

        public void b() {
        }
    }
}
