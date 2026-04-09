package io.sentry.android.core;

import android.view.View;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class b0 extends CopyOnWriteArrayList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11543a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11544d;

    public /* synthetic */ b0(int i10, Object obj) {
        this.f11543a = i10;
        this.f11544d = obj;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final boolean add(Object obj) throws InterruptedException {
        switch (this.f11543a) {
            case 0:
                a0 a0Var = (a0) obj;
                boolean zAdd = super.add(a0Var);
                if (Boolean.FALSE.equals(((c0) this.f11544d).f11549d.f11558r)) {
                    a0Var.b();
                } else if (Boolean.TRUE.equals(((c0) this.f11544d).f11549d.f11558r)) {
                    a0Var.f();
                }
                return zAdd;
            default:
                io.sentry.android.replay.f fVar = (io.sentry.android.replay.f) obj;
                io.sentry.android.replay.q qVar = (io.sentry.android.replay.q) this.f11544d;
                io.sentry.q qVarA = qVar.f11944d.a();
                try {
                    Iterator it = qVar.f11946r.iterator();
                    while (it.hasNext()) {
                        View view = (View) it.next();
                        if (fVar != null) {
                            fVar.b(view, true);
                        }
                    }
                    vc.e.e(qVarA, null);
                    return super.add(fVar);
                } finally {
                }
        }
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public /* bridge */ boolean contains(Object obj) {
        switch (this.f11543a) {
            case 1:
                if (obj == null ? true : obj instanceof io.sentry.android.replay.f) {
                    return super.contains((io.sentry.android.replay.f) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.f11543a) {
            case 1:
                if (obj == null ? true : obj instanceof io.sentry.android.replay.f) {
                    return super.indexOf((io.sentry.android.replay.f) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f11543a) {
            case 1:
                if (obj == null ? true : obj instanceof io.sentry.android.replay.f) {
                    return super.lastIndexOf((io.sentry.android.replay.f) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public /* bridge */ boolean remove(Object obj) {
        switch (this.f11543a) {
            case 1:
                if (obj == null ? true : obj instanceof io.sentry.android.replay.f) {
                    return super.remove((io.sentry.android.replay.f) obj);
                }
                return false;
            default:
                return super.remove(obj);
        }
    }
}
