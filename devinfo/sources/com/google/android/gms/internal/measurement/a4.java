package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import j$.util.Objects;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a4 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19607a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19608b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(f4 f4Var) {
        super(null);
        this.f19608b = f4Var;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.f19607a) {
            case 3:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z3, Uri uri) {
        switch (this.f19607a) {
            case 2:
                ((zk.h) this.f19608b).l(yj.u.f37649a);
                break;
            default:
                super.onChange(z3, uri);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(pe.c cVar) {
        super(null);
        Objects.requireNonNull(cVar);
        this.f19608b = cVar;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z3) {
        Cursor cursor;
        switch (this.f19607a) {
            case 0:
                ((AtomicBoolean) ((pe.c) this.f19608b).f31750b).set(true);
                return;
            case 1:
                f4 f4Var = (f4) this.f19608b;
                synchronized (f4Var.f19737f) {
                    f4Var.g = null;
                    f4Var.f19734c.run();
                }
                synchronized (f4Var) {
                    try {
                        Iterator it = f4Var.f19738h.iterator();
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
            case 2:
            default:
                super.onChange(z3);
                return;
            case 3:
                p.b3 b3Var = (p.b3) this.f19608b;
                if (!b3Var.f27925b || (cursor = b3Var.f27926c) == null || cursor.isClosed()) {
                    return;
                }
                b3Var.f27924a = b3Var.f27926c.requery();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(zk.h hVar, Handler handler) {
        super(handler);
        this.f19608b = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(p.b3 b3Var) {
        super(new Handler());
        this.f19608b = b3Var;
    }
}
