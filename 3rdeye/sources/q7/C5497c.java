package q7;

import A9.E;
import D9.H;
import D9.InterfaceC0644f;
import X0.h;
import b9.C1992A;
import b9.m;
import b9.n;
import f9.InterfaceC4347e;
import h7.C4421b;
import h9.e;
import h9.i;
import java.util.WeakHashMap;
import kotlin.jvm.internal.l;
import p7.C5471c;
import p7.C5477i;
import p9.p;
import q7.C5496b;

/* compiled from: ViewPreCreationProfileRepository.kt */
@e(c = "com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository$get$2", f = "ViewPreCreationProfileRepository.kt", l = {33}, m = "invokeSuspend")
/* renamed from: q7.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5497c extends i implements p<E, InterfaceC4347e<? super C5477i>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f45454l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f45455m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C5496b f45456n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f45457o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5497c(C5496b c5496b, String str, InterfaceC4347e<? super C5497c> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f45456n = c5496b;
        this.f45457o = str;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        C5497c c5497c = new C5497c(this.f45456n, this.f45457o, interfaceC4347e);
        c5497c.f45455m = obj;
        return c5497c;
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super C5477i> interfaceC4347e) {
        return ((C5497c) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objD;
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f45454l;
        C5496b c5496b = this.f45456n;
        try {
            if (i == 0) {
                n.b(obj);
                String str = this.f45457o;
                WeakHashMap<String, h<C5477i>> weakHashMap = C5496b.f45446c;
                InterfaceC0644f data = C5496b.a.a(c5496b.f45447a, str).getData();
                this.f45454l = 1;
                objD = H.d(data, this);
                if (objD == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n.b(obj);
                objD = obj;
            }
            objA = (C5477i) objD;
        } catch (Throwable th) {
            objA = n.a(th);
        }
        if (m.a(objA) != null) {
            int i10 = C4421b.f38269a;
            C4421b.a(C7.a.ERROR);
        }
        if (objA instanceof m.a) {
            objA = null;
        }
        C5477i c5477i = (C5477i) objA;
        if (c5477i != null) {
            return c5477i;
        }
        C5477i.b bVar = C5477i.Companion;
        C5477i c5477i2 = c5496b.f45448b;
        C5471c text = c5477i2.f45277b;
        l.f(text, "text");
        C5471c image = c5477i2.f45278c;
        l.f(image, "image");
        C5471c gifImage = c5477i2.f45279d;
        l.f(gifImage, "gifImage");
        C5471c overlapContainer = c5477i2.f45280e;
        l.f(overlapContainer, "overlapContainer");
        C5471c linearContainer = c5477i2.f45281f;
        l.f(linearContainer, "linearContainer");
        C5471c wrapContainer = c5477i2.f45282g;
        l.f(wrapContainer, "wrapContainer");
        C5471c grid = c5477i2.f45283h;
        l.f(grid, "grid");
        C5471c gallery = c5477i2.i;
        l.f(gallery, "gallery");
        C5471c pager = c5477i2.f45284j;
        l.f(pager, "pager");
        C5471c tab = c5477i2.f45285k;
        l.f(tab, "tab");
        C5471c state = c5477i2.f45286l;
        l.f(state, "state");
        C5471c custom = c5477i2.f45287m;
        l.f(custom, "custom");
        C5471c indicator = c5477i2.f45288n;
        l.f(indicator, "indicator");
        C5471c slider = c5477i2.f45289o;
        l.f(slider, "slider");
        C5471c input = c5477i2.f45290p;
        l.f(input, "input");
        C5471c select = c5477i2.f45291q;
        l.f(select, "select");
        C5471c video = c5477i2.f45292r;
        l.f(video, "video");
        C5471c c5471c = c5477i2.f45293s;
        l.f(c5471c, "switch");
        return new C5477i(this.f45457o, text, image, gifImage, overlapContainer, linearContainer, wrapContainer, grid, gallery, pager, tab, state, custom, indicator, slider, input, select, video, c5471c);
    }
}
