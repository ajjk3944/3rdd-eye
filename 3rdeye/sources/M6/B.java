package M6;

import M6.C0795a;
import O6.t;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: WrapContentPageSizeOffScreenPagesController.kt */
/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final O6.t f4210a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4211b;

    /* renamed from: c, reason: collision with root package name */
    public final n f4212c;

    /* renamed from: d, reason: collision with root package name */
    public final j f4213d;

    /* renamed from: e, reason: collision with root package name */
    public final C0795a f4214e;

    /* renamed from: f, reason: collision with root package name */
    public int f4215f;

    /* compiled from: WrapContentPageSizeOffScreenPagesController.kt */
    public static final class a extends t.a {
        public a() {
        }

        @Override // O6.t.a, android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            B b10 = B.this;
            int iA = b10.a();
            if (iA <= b10.f4215f) {
                return;
            }
            b10.f4215f = iA;
            O6.t tVar = b10.f4210a;
            RecyclerView recyclerView = tVar.getRecyclerView();
            if (recyclerView != null) {
                recyclerView.setItemViewCacheSize((b10.f4215f * 2) + 3);
            }
            tVar.getViewPager().setOffscreenPageLimit(b10.f4215f);
        }

        @Override // Q1.f.e
        public final void onPageSelected(int i) {
            B b10 = B.this;
            int iA = b10.a();
            if (iA <= b10.f4215f) {
                return;
            }
            b10.f4215f = iA;
            O6.t tVar = b10.f4210a;
            RecyclerView recyclerView = tVar.getRecyclerView();
            if (recyclerView != null) {
                recyclerView.setItemViewCacheSize((b10.f4215f * 2) + 3);
            }
            tVar.getViewPager().setOffscreenPageLimit(b10.f4215f);
        }
    }

    public B(O6.t parent, float f10, n nVar, j jVar, C0795a c0795a) {
        kotlin.jvm.internal.l.f(parent, "parent");
        this.f4210a = parent;
        this.f4211b = f10;
        this.f4212c = nVar;
        this.f4213d = jVar;
        this.f4214e = c0795a;
        this.f4215f = 1;
        this.f4215f = a();
        RecyclerView recyclerView = parent.getRecyclerView();
        if (recyclerView != null) {
            recyclerView.setItemViewCacheSize((this.f4215f * 2) + 3);
        }
        parent.getViewPager().setOffscreenPageLimit(this.f4215f);
        parent.setChangePageCallbackForOffScreenPages$div_release(new a());
    }

    public final int a() {
        C0795a.C0076a c0076a;
        O6.t tVar = this.f4210a;
        int currentItem$div_release = tVar.getCurrentItem$div_release();
        n nVar = this.f4212c;
        Float f10 = nVar.f(currentItem$div_release);
        if (f10 != null) {
            float fFloatValue = f10.floatValue();
            int currentItem$div_release2 = tVar.getCurrentItem$div_release() - 1;
            int i = 0;
            int i10 = 0;
            while (fFloatValue > 0.0f && currentItem$div_release2 > 0) {
                i10++;
                Float fB = b(currentItem$div_release2);
                if (fB == null) {
                    break;
                }
                fFloatValue -= fB.floatValue();
                currentItem$div_release2--;
            }
            j jVar = this.f4213d;
            float f11 = jVar.f4257g;
            if (fFloatValue > f11 && currentItem$div_release2 == 0) {
                i10++;
                Float fB2 = b(currentItem$div_release2);
                fFloatValue -= fB2 != null ? fB2.floatValue() : 0.0f;
            }
            Float fE = nVar.e(tVar.getCurrentItem$div_release());
            if (fE != null) {
                float fFloatValue2 = fE.floatValue();
                if (fFloatValue > f11) {
                    fFloatValue2 += fFloatValue;
                }
                int currentItem$div_release3 = tVar.getCurrentItem$div_release() + 1;
                while (true) {
                    c0076a = this.f4214e.f4227v;
                    if (fFloatValue2 > 0.0f && currentItem$div_release3 < c0076a.c() - 1) {
                        i++;
                        Float fB3 = b(currentItem$div_release3);
                        if (fB3 == null) {
                            break;
                        }
                        fFloatValue2 -= fB3.floatValue();
                        currentItem$div_release3++;
                    } else {
                        break;
                    }
                }
                if (fFloatValue2 > jVar.f4258h && currentItem$div_release3 == c0076a.c() - 1) {
                    i++;
                    Float fB4 = b(currentItem$div_release3);
                    fFloatValue2 -= fB4 != null ? fB4.floatValue() : 0.0f;
                }
                while (fFloatValue2 > 0.0f && currentItem$div_release2 >= 0) {
                    i10++;
                    Float fB5 = b(currentItem$div_release2);
                    if (fB5 == null) {
                        break;
                    }
                    fFloatValue2 -= fB5.floatValue();
                    currentItem$div_release2--;
                }
                int iMax = Math.max(i10, i);
                if (iMax >= 1) {
                    return iMax;
                }
            } else if (i10 >= 1) {
                return i10;
            }
        }
        return 1;
    }

    public final Float b(int i) {
        Float fD = this.f4212c.d(i);
        if (fD != null) {
            return Float.valueOf(fD.floatValue() + this.f4211b);
        }
        return null;
    }
}
