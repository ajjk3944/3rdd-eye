package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import br.l;
import g4.j;
import i7.i;
import java.util.LinkedHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, j.BYTES_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public int f2113a;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f2114d = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final i7.j f2115g = new i7.j(this);

    /* renamed from: r, reason: collision with root package name */
    public final i f2116r = new i(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        l.e(intent, "intent");
        return this.f2116r;
    }
}
