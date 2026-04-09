package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class z3 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5278a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5279b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(e4 e4Var) {
        super(null);
        this.f5279b = e4Var;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        switch (this.f5278a) {
            case 0:
                ((AtomicBoolean) ((p.v2) this.f5279b).f20201d).set(true);
                return;
            case 1:
                e4 e4Var = (e4) this.f5279b;
                synchronized (e4Var.f4973f) {
                    e4Var.f4974g = null;
                    e4Var.f4970c.run();
                }
                synchronized (e4Var) {
                    try {
                        Iterator it = e4Var.f4975h.iterator();
                        if (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                            throw null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                super.onChange(z10);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(p.v2 v2Var) {
        super(null);
        Objects.requireNonNull(v2Var);
        this.f5279b = v2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(yt.c cVar, Handler handler) {
        super(handler);
        this.f5279b = cVar;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10, Uri uri) {
        switch (this.f5278a) {
            case 2:
                ((yt.c) this.f5279b).c(lq.b0.f15562a);
                break;
            default:
                super.onChange(z10, uri);
                break;
        }
    }
}
