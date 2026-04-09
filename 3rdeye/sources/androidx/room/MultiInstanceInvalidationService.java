package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.b;
import b9.C1992A;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.l;

/* compiled from: MultiInstanceInvalidationService.android.kt */
/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: b, reason: collision with root package name */
    public int f16778b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f16779c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final b f16780d = new b();

    /* renamed from: e, reason: collision with root package name */
    public final a f16781e = new a();

    /* compiled from: MultiInstanceInvalidationService.android.kt */
    public static final class a extends b.a {
        public a() {
            attachInterface(this, androidx.room.b.f16786f8);
        }

        @Override // androidx.room.b
        public final int e(androidx.room.a callback, String str) {
            l.f(callback, "callback");
            int i = 0;
            if (str == null) {
                return 0;
            }
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (multiInstanceInvalidationService.f16780d) {
                try {
                    int i10 = multiInstanceInvalidationService.f16778b + 1;
                    multiInstanceInvalidationService.f16778b = i10;
                    if (multiInstanceInvalidationService.f16780d.register(callback, Integer.valueOf(i10))) {
                        multiInstanceInvalidationService.f16779c.put(Integer.valueOf(i10), str);
                        i = i10;
                    } else {
                        multiInstanceInvalidationService.f16778b--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return i;
        }

        @Override // androidx.room.b
        public final void p(int i, String[] tables) {
            l.f(tables, "tables");
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (multiInstanceInvalidationService.f16780d) {
                String str = (String) multiInstanceInvalidationService.f16779c.get(Integer.valueOf(i));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int iBeginBroadcast = multiInstanceInvalidationService.f16780d.beginBroadcast();
                for (int i10 = 0; i10 < iBeginBroadcast; i10++) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService.f16780d.getBroadcastCookie(i10);
                        l.d(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        Integer num = (Integer) broadcastCookie;
                        int iIntValue = num.intValue();
                        String str2 = (String) multiInstanceInvalidationService.f16779c.get(num);
                        if (i != iIntValue && str.equals(str2)) {
                            try {
                                multiInstanceInvalidationService.f16780d.getBroadcastItem(i10).c(tables);
                                C1992A c1992a = C1992A.f18074a;
                            } catch (RemoteException e4) {
                                Log.w("ROOM", "Error invoking a remote callback", e4);
                            }
                        }
                    } catch (Throwable th) {
                        multiInstanceInvalidationService.f16780d.finishBroadcast();
                        throw th;
                    }
                }
                multiInstanceInvalidationService.f16780d.finishBroadcast();
                C1992A c1992a2 = C1992A.f18074a;
            }
        }

        @Override // androidx.room.b
        public final void t(androidx.room.a callback, int i) {
            l.f(callback, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (multiInstanceInvalidationService.f16780d) {
                multiInstanceInvalidationService.f16780d.unregister(callback);
            }
        }
    }

    /* compiled from: MultiInstanceInvalidationService.android.kt */
    public static final class b extends RemoteCallbackList<androidx.room.a> {
        public b() {
        }

        @Override // android.os.RemoteCallbackList
        public final void onCallbackDied(IInterface iInterface, Object cookie) {
            androidx.room.a callback = (androidx.room.a) iInterface;
            l.f(callback, "callback");
            l.f(cookie, "cookie");
            MultiInstanceInvalidationService.this.f16779c.remove((Integer) cookie);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        l.f(intent, "intent");
        return this.f16781e;
    }
}
