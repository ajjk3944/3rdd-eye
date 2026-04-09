package j;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import j.C5161b;

/* compiled from: StateListDrawableCompat.java */
/* renamed from: j.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5163d extends C5161b {

    /* renamed from: o, reason: collision with root package name */
    public a f42673o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f42674p;

    /* compiled from: StateListDrawableCompat.java */
    /* renamed from: j.d$a */
    public static class a extends C5161b.c {

        /* renamed from: H, reason: collision with root package name */
        public int[][] f42675H;

        public a(a aVar, C5163d c5163d, Resources resources) {
            super(aVar, c5163d, resources);
            if (aVar != null) {
                this.f42675H = aVar.f42675H;
            } else {
                this.f42675H = new int[this.f42653g.length][];
            }
        }

        @Override // j.C5161b.c
        public void e() {
            int[][] iArr = this.f42675H;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[] iArr3 = this.f42675H[length];
                iArr2[length] = iArr3 != null ? (int[]) iArr3.clone() : null;
            }
            this.f42675H = iArr2;
        }

        public final int f(int[] iArr) {
            int[][] iArr2 = this.f42675H;
            int i = this.f42654h;
            for (int i10 = 0; i10 < i; i10++) {
                if (StateSet.stateSetMatches(iArr2[i10], iArr)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C5163d(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C5163d(this, resources);
        }
    }

    public C5163d(a aVar, Resources resources) {
        e(new a(aVar, this, resources));
        onStateChange(getState());
    }

    @Override // j.C5161b, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // j.C5161b
    public void e(C5161b.c cVar) {
        this.f42627b = cVar;
        int i = this.f42633h;
        if (i >= 0) {
            Drawable drawableD = cVar.d(i);
            this.f42629d = drawableD;
            if (drawableD != null) {
                c(drawableD);
            }
        }
        this.f42630e = null;
        if (cVar instanceof a) {
            this.f42673o = (a) cVar;
        }
    }

    @Override // j.C5161b
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public a b() {
        return new a(this.f42673o, this, null);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // j.C5161b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f42674p) {
            super.mutate();
            this.f42673o.e();
            this.f42674p = true;
        }
        return this;
    }

    @Override // j.C5161b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        int iF = this.f42673o.f(iArr);
        if (iF < 0) {
            iF = this.f42673o.f(StateSet.WILD_CARD);
        }
        return d(iF) || zOnStateChange;
    }
}
