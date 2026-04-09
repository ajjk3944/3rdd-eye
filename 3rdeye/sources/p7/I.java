package P7;

import P7.H;
import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import b9.C1992A;
import f9.InterfaceC4347e;

/* compiled from: ShimmerBaseAdView.kt */
@h9.e(c = "com.zipoapps.ads.ShimmerBaseAdView$loadAdInternal$1", f = "ShimmerBaseAdView.kt", l = {106}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class I extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f10710l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ H f10711m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(H h10, InterfaceC4347e<? super I> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f10711m = h10;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new I(this.f10711m, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((I) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f10710l;
        H h10 = this.f10711m;
        com.facebook.shimmer.c cVar = h10.f22350c;
        if (i == 0) {
            b9.n.b(obj);
            ValueAnimator valueAnimator = cVar.f22377e;
            if (valueAnimator != null && ((valueAnimator == null || !valueAnimator.isStarted()) && cVar.getCallback() != null)) {
                cVar.f22377e.start();
            }
            this.f10710l = 1;
            obj = h10.f(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b9.n.b(obj);
        }
        H.a aVar2 = (H.a) obj;
        if (aVar2 != null) {
            Integer num = aVar2.f10703b;
            int iIntValue = num != null ? num.intValue() : -2;
            Integer num2 = aVar2.f10704c;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iIntValue, num2 != null ? num2.intValue() : -2);
            layoutParams.gravity = 17;
            h10.addView(aVar2.f10702a, layoutParams);
            if (h10.f22351d) {
                ValueAnimator valueAnimator2 = cVar.f22377e;
                if (valueAnimator2 != null && valueAnimator2.isStarted()) {
                    cVar.f22377e.cancel();
                }
                h10.f22351d = false;
                h10.invalidate();
            }
        } else {
            H.d(h10);
            h10.setVisibility(8);
        }
        return C1992A.f18074a;
    }
}
