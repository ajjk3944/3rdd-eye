package yb;

import android.os.Bundle;
import android.util.Log;
import ba.l;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f26234a;

    /* renamed from: b, reason: collision with root package name */
    public final dd.h f26235b = new dd.h();

    /* renamed from: c, reason: collision with root package name */
    public final int f26236c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f26237d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f26238e;

    public j(int i10, int i11, Bundle bundle, int i12) {
        this.f26238e = i12;
        this.f26234a = i10;
        this.f26236c = i11;
        this.f26237d = bundle;
    }

    public final boolean a() {
        switch (this.f26238e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(l lVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            toString();
            lVar.toString();
        }
        this.f26235b.f7294a.n(lVar);
    }

    public final String toString() {
        return "Request { what=" + this.f26236c + " id=" + this.f26234a + " oneWay=" + a() + "}";
    }
}
