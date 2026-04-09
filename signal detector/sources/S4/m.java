package S4;

import C0.t;
import android.database.Cursor;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class m implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3541a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f3542b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f3543c;

    public /* synthetic */ m(n nVar, t tVar, int i) {
        this.f3541a = i;
        this.f3543c = nVar;
        this.f3542b = tVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Cursor cursorL;
        switch (this.f3541a) {
            case 0:
                cursorL = this.f3543c.f3544a.l(this.f3542b);
                try {
                    Integer numValueOf = null;
                    if (cursorL.moveToFirst() && !cursorL.isNull(0)) {
                        numValueOf = Integer.valueOf(cursorL.getInt(0));
                    }
                    return numValueOf;
                } finally {
                }
            default:
                cursorL = this.f3543c.f3544a.l(this.f3542b);
                try {
                    Integer numValueOf2 = null;
                    if (cursorL.moveToFirst() && !cursorL.isNull(0)) {
                        numValueOf2 = Integer.valueOf(cursorL.getInt(0));
                    }
                    return numValueOf2;
                } finally {
                }
        }
    }

    public final void finalize() {
        switch (this.f3541a) {
            case 0:
                this.f3542b.b();
                break;
            default:
                this.f3542b.b();
                break;
        }
    }
}
