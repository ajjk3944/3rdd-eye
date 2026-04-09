package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
import nk.k;
import t5.h;
import t5.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public int f1567a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1568b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final i f1569c = new i(this);

    /* renamed from: d, reason: collision with root package name */
    public final h f1570d = new h(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        k.e(intent, "intent");
        return this.f1570d;
    }
}
