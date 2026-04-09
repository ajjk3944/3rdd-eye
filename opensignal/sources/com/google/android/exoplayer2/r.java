package com.google.android.exoplayer2;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements qb.h, a5.j, v3.m, io.sentry.instrumentation.file.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4418a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4419d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4420g;

    public /* synthetic */ r(int i10, int i11, Object obj) {
        this.f4418a = i11;
        this.f4420g = obj;
        this.f4419d = i10;
    }

    @Override // qb.h, a5.j
    public void a(Object obj) {
        switch (this.f4418a) {
            case 0:
                ((d1) obj).onMediaItemTransition((n0) this.f4420g, this.f4419d);
                break;
            default:
                ((androidx.media3.common.q0) obj).onMediaItemTransition((androidx.media3.common.e0) this.f4420g, this.f4419d);
                break;
        }
    }

    @Override // io.sentry.instrumentation.file.a
    public Object call() throws IOException {
        io.sentry.instrumentation.file.f fVar = (io.sentry.instrumentation.file.f) this.f4420g;
        fVar.f12345a.write(this.f4419d);
        return 1;
    }

    @Override // v3.m
    public boolean d(View view) {
        SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f4420g;
        int i10 = SideSheetBehavior.f5681w;
        int i11 = this.f4419d;
        if (i11 == 1 || i11 == 2) {
            throw new IllegalArgumentException(w.g.j(new StringBuilder("STATE_"), i11 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = sideSheetBehavior.f5696p;
        if (weakReference == null || weakReference.get() == null) {
            sideSheetBehavior.s(i11);
            return true;
        }
        View view2 = (View) sideSheetBehavior.f5696p.get();
        c cVar = new c(i11, 2, sideSheetBehavior);
        ViewParent parent = view2.getParent();
        if (parent != null && parent.isLayoutRequested() && view2.isAttachedToWindow()) {
            view2.post(cVar);
            return true;
        }
        cVar.run();
        return true;
    }
}
