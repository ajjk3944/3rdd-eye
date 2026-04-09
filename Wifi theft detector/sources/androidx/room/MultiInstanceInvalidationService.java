package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.room.c;
import java.util.HashMap;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public int f4018a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4019b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final RemoteCallbackList f4020c = new a();

    /* renamed from: d, reason: collision with root package name */
    public final c.a f4021d = new b();

    public class a extends RemoteCallbackList {
        public a() {
        }

        @Override // android.os.RemoteCallbackList
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onCallbackDied(androidx.room.b bVar, Object obj) {
            HashMap map = MultiInstanceInvalidationService.this.f4019b;
            Integer num = (Integer) obj;
            num.intValue();
            map.remove(num);
        }
    }

    public class b extends c.a {
        public b() {
        }

        @Override // androidx.room.c
        public void b(int i10, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f4020c) {
                try {
                    String str = (String) MultiInstanceInvalidationService.this.f4019b.get(Integer.valueOf(i10));
                    if (str == null) {
                        Log.w("ROOM", "Remote invalidation client ID not registered");
                        return;
                    }
                    int iBeginBroadcast = MultiInstanceInvalidationService.this.f4020c.beginBroadcast();
                    for (int i11 = 0; i11 < iBeginBroadcast; i11++) {
                        try {
                            Integer num = (Integer) MultiInstanceInvalidationService.this.f4020c.getBroadcastCookie(i11);
                            int iIntValue = num.intValue();
                            String str2 = (String) MultiInstanceInvalidationService.this.f4019b.get(num);
                            if (i10 != iIntValue && str.equals(str2)) {
                                try {
                                    ((androidx.room.b) MultiInstanceInvalidationService.this.f4020c.getBroadcastItem(i11)).a(strArr);
                                } catch (RemoteException e10) {
                                    Log.w("ROOM", "Error invoking a remote callback", e10);
                                }
                            }
                        } finally {
                            MultiInstanceInvalidationService.this.f4020c.finishBroadcast();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.room.c
        public int c(androidx.room.b bVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f4020c) {
                try {
                    MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                    int i10 = multiInstanceInvalidationService.f4018a + 1;
                    multiInstanceInvalidationService.f4018a = i10;
                    if (multiInstanceInvalidationService.f4020c.register(bVar, Integer.valueOf(i10))) {
                        MultiInstanceInvalidationService.this.f4019b.put(Integer.valueOf(i10), str);
                        return i10;
                    }
                    MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                    multiInstanceInvalidationService2.f4018a--;
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.room.c
        public void e(androidx.room.b bVar, int i10) {
            synchronized (MultiInstanceInvalidationService.this.f4020c) {
                MultiInstanceInvalidationService.this.f4020c.unregister(bVar);
                MultiInstanceInvalidationService.this.f4019b.remove(Integer.valueOf(i10));
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f4021d;
    }
}
