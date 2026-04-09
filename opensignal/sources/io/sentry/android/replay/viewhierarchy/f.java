package io.sentry.android.replay.viewhierarchy;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f12023a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12024b;

    /* renamed from: c, reason: collision with root package name */
    public final float f12025c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12026d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f12027e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f12028f;

    public f(int i10, int i11, float f10, f fVar, boolean z10, Rect rect) {
        this.f12023a = i10;
        this.f12024b = i11;
        this.f12025c = f10;
        this.f12026d = z10;
        this.f12027e = rect;
    }

    public final void a(c7.b bVar) {
        ArrayList arrayList;
        if (!((Boolean) bVar.a(this)).booleanValue() || (arrayList = this.f12028f) == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((f) it.next()).a(bVar);
        }
    }
}
