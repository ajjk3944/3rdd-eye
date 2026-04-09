package P7;

import A9.C0575f;
import A9.L0;
import A9.U;
import D9.InterfaceC0645g;
import F9.C0663f;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b9.C1992A;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.facebook.shimmer.b;
import com.zipoapps.premiumhelper.e;
import f9.InterfaceC4347e;
import f9.InterfaceC4350h;

/* compiled from: ShimmerBaseAdView.kt */
/* loaded from: classes3.dex */
public abstract class H extends ShimmerFrameLayout {

    /* renamed from: e, reason: collision with root package name */
    public C0663f f10700e;

    /* renamed from: f, reason: collision with root package name */
    public final View f10701f;

    /* compiled from: ShimmerBaseAdView.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final View f10702a;

        /* renamed from: b, reason: collision with root package name */
        public final Integer f10703b;

        /* renamed from: c, reason: collision with root package name */
        public final Integer f10704c;

        public a(View view, Integer num, Integer num2) {
            kotlin.jvm.internal.l.f(view, "view");
            this.f10702a = view;
            this.f10703b = num;
            this.f10704c = num2;
        }
    }

    /* compiled from: View.kt */
    public static final class b implements View.OnLayoutChangeListener {
        public b() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            view.removeOnLayoutChangeListener(this);
            H h10 = H.this;
            h10.setMinimumHeight(Math.max(h10.getMinHeightInternal(), h10.getMinimumHeight()));
        }
    }

    /* compiled from: View.kt */
    public static final class c implements View.OnLayoutChangeListener {
        public c() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            view.removeOnLayoutChangeListener(this);
            H h10 = H.this;
            C0663f c0663f = h10.f10700e;
            I9.c cVar = U.f211a;
            C0575f.e(c0663f, F9.q.f1782a, null, h10.new d(null), 2);
        }
    }

    /* compiled from: ShimmerBaseAdView.kt */
    @h9.e(c = "com.zipoapps.ads.ShimmerBaseAdView$onAttachedToWindow$2$1", f = "ShimmerBaseAdView.kt", l = {71}, m = "invokeSuspend")
    public static final class d extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f10707l;

        /* compiled from: ShimmerBaseAdView.kt */
        public static final class a<T> implements InterfaceC0645g {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ H f10709b;

            public a(H h10) {
                this.f10709b = h10;
            }

            @Override // D9.InterfaceC0645g
            public final Object emit(Object obj, InterfaceC4347e interfaceC4347e) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                H h10 = this.f10709b;
                if (zBooleanValue) {
                    H.d(h10);
                } else {
                    C0663f c0663f = h10.f10700e;
                    I9.c cVar = U.f211a;
                    C0575f.e(c0663f, F9.q.f1782a, null, new I(h10, null), 2);
                }
                h10.setVisibility(!zBooleanValue ? 0 : 8);
                return C1992A.f18074a;
            }
        }

        public d(InterfaceC4347e<? super d> interfaceC4347e) {
            super(2, interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return H.this.new d(interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((d) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f10707l;
            if (i == 0) {
                b9.n.b(obj);
                com.zipoapps.premiumhelper.e.f37006D.getClass();
                D9.A a10 = e.a.a().f37027q.f43576h;
                a aVar2 = new a(H.this);
                this.f10707l = 1;
                if (a10.f1130b.b(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b9.n.b(obj);
            }
            return C1992A.f18074a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public H(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.l.f(context, "context");
    }

    public static final void d(H h10) {
        h10.e();
        int i = 0;
        while (i < h10.getChildCount()) {
            int i10 = i + 1;
            View childAt = h10.getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (!childAt.equals(h10.f10701f)) {
                h10.removeView(childAt);
            }
            i = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getMinHeightInternal() {
        com.zipoapps.premiumhelper.e.f37006D.getClass();
        if (e.a.a().i.j()) {
            return 0;
        }
        return getMinHeight();
    }

    public abstract void e();

    public abstract Object f(h9.c cVar);

    public abstract int getMinHeight();

    @Override // com.facebook.shimmer.ShimmerFrameLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        L0 l0A = C0575f.a();
        I9.c cVar = U.f211a;
        B9.g gVar = F9.q.f1782a;
        this.f10700e = A9.F.a(InterfaceC4350h.a.C0456a.d(l0A, gVar.R0()));
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new b());
        } else {
            setMinimumHeight(Math.max(getMinHeightInternal(), getMinimumHeight()));
        }
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new c());
        } else {
            C0575f.e(this.f10700e, gVar, null, new d(null), 2);
        }
    }

    @Override // com.facebook.shimmer.ShimmerFrameLayout, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
        A9.F.b(this.f10700e, null);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        addView(this.f10701f, new FrameLayout.LayoutParams(0, 0));
    }

    @Override // android.view.View
    public final void onSizeChanged(final int i, final int i10, int i11, int i12) {
        super.onSizeChanged(i, i10, i11, i12);
        if (i == i11 && i10 == i12) {
            return;
        }
        post(new Runnable() { // from class: P7.G
            @Override // java.lang.Runnable
            public final void run() {
                H h10 = this.f10697b;
                View view = h10.f10701f;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = (i - h10.getPaddingStart()) - h10.getPaddingEnd();
                layoutParams.height = (i10 - h10.getPaddingTop()) - h10.getPaddingBottom();
                view.setLayoutParams(layoutParams);
            }
        });
    }

    public H(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        L0 l0A = C0575f.a();
        I9.c cVar = U.f211a;
        this.f10700e = A9.F.a(InterfaceC4350h.a.C0456a.d(l0A, F9.q.f1782a.R0()));
        View view = new View(context);
        this.f10701f = view;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i8.r.f38633c);
        int color = typedArrayObtainStyledAttributes.getColor(0, -1);
        int color2 = typedArrayObtainStyledAttributes.getColor(1, -3355444);
        view.setBackgroundColor(color);
        b.c cVar2 = new b.c();
        com.facebook.shimmer.b bVar = cVar2.f22372a;
        bVar.f22357e = (color & 16777215) | (bVar.f22357e & (-16777216));
        bVar.f22356d = color2;
        b(cVar2.a());
        typedArrayObtainStyledAttributes.recycle();
    }
}
