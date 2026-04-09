package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.gf0;
import defpackage.hf0;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {
    public int f = 0;
    public final HashMap g = new HashMap();
    public final gf0 h = new gf0(this);
    public final hf0 i = new hf0(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.i;
    }
}
