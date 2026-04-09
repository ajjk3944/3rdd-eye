package H6;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import b9.C1992A;
import io.appmetrica.analytics.impl.Oo;
import j6.RunnableC5197b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* compiled from: DivPlaceholderLoader.kt */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final Oo f2262a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f2263b;

    /* compiled from: DivPlaceholderLoader.kt */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<C6.i, C1992A> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Q6.c f2264g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.m f2265h;
        public final /* synthetic */ x i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f2266j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.m f2267k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Q6.c cVar, p9.l<? super Drawable, C1992A> lVar, x xVar, int i, p9.l<? super C6.i, C1992A> lVar2) {
            super(1);
            this.f2264g = cVar;
            this.f2265h = (kotlin.jvm.internal.m) lVar;
            this.i = xVar;
            this.f2266j = i;
            this.f2267k = (kotlin.jvm.internal.m) lVar2;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.m, p9.l] */
        /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.jvm.internal.m, p9.l] */
        @Override // p9.l
        public final C1992A invoke(C6.i iVar) {
            C6.i iVar2 = iVar;
            if (iVar2 == null) {
                Throwable th = new Throwable("Preview doesn't contain base64 image");
                Q6.c cVar = this.f2264g;
                cVar.f11320d.add(th);
                cVar.b();
                this.i.f2262a.getClass();
                this.f2265h.invoke(new ColorDrawable(this.f2266j));
            } else {
                this.f2267k.invoke(iVar2);
            }
            return C1992A.f18074a;
        }
    }

    public x(Oo imageStubProvider, ExecutorService executorService) {
        kotlin.jvm.internal.l.f(imageStubProvider, "imageStubProvider");
        kotlin.jvm.internal.l.f(executorService, "executorService");
        this.f2262a = imageStubProvider;
        this.f2263b = executorService;
    }

    public final void a(O6.F imageView, Q6.c cVar, String str, int i, boolean z10, p9.l<? super Drawable, C1992A> lVar, p9.l<? super C6.i, C1992A> lVar2) {
        x xVar;
        int i10;
        p9.l<? super Drawable, C1992A> lVar3;
        kotlin.jvm.internal.l.f(imageView, "imageView");
        C1992A c1992a = null;
        Future<?> futureSubmit = null;
        if (str != null) {
            xVar = this;
            i10 = i;
            lVar3 = lVar;
            a aVar = new a(cVar, lVar3, xVar, i10, lVar2);
            Future<?> loadingTask = imageView.getLoadingTask();
            if (loadingTask != null) {
                loadingTask.cancel(true);
            }
            RunnableC5197b runnableC5197b = new RunnableC5197b(str, z10, new y(0, aVar, imageView));
            if (z10) {
                runnableC5197b.run();
            } else {
                futureSubmit = xVar.f2263b.submit(runnableC5197b);
            }
            if (futureSubmit != null) {
                imageView.i(futureSubmit);
            }
            c1992a = C1992A.f18074a;
        } else {
            xVar = this;
            i10 = i;
            lVar3 = lVar;
        }
        if (c1992a == null) {
            xVar.f2262a.getClass();
            lVar3.invoke(new ColorDrawable(i10));
        }
    }
}
