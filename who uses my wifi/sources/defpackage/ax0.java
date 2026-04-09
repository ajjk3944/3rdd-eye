package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ax0 implements ws2 {
    public static ax0 g;
    public final Object f;

    public ax0(Object obj) {
        this.f = obj;
    }

    @Override // defpackage.eu2
    /* renamed from: a */
    public Object mo18a() {
        return this.f;
    }

    public ax0() {
        this.f = new Object();
        new Handler(Looper.getMainLooper(), new zw0(0, this));
    }
}
