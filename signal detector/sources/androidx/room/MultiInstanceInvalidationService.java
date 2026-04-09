package androidx.room;

import C0.m;
import C0.n;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
import q5.i;

/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public int f5634a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f5635b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final n f5636c = new n(this);

    /* renamed from: d, reason: collision with root package name */
    public final m f5637d = new m(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        i.e(intent, "intent");
        return this.f5637d;
    }
}
