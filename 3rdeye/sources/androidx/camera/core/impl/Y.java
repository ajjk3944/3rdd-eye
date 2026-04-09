package androidx.camera.core.impl;

import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeoutException;
import o0.b;

/* compiled from: DeferrableSurfaces.java */
/* loaded from: classes.dex */
public final class Y implements I.c<List<Surface>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b.a f14997b;

    public Y(b.a aVar) {
        this.f14997b = aVar;
    }

    @Override // I.c
    public final void onFailure(Throwable th) {
        boolean z10 = th instanceof TimeoutException;
        b.a aVar = this.f14997b;
        if (z10) {
            aVar.d(th);
        } else {
            aVar.b(Collections.EMPTY_LIST);
        }
    }

    @Override // I.c
    public final void onSuccess(List<Surface> list) {
        List<Surface> list2 = list;
        list2.getClass();
        this.f14997b.b(new ArrayList(list2));
    }
}
