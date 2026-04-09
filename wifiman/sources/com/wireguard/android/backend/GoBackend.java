package com.wireguard.android.backend;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.VpnService;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.OsConstants;
import android.util.Log;
import com.wireguard.android.backend.BackendException;
import com.wireguard.android.backend.c;
import com.wireguard.crypto.KeyFormatException;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class GoBackend implements com.wireguard.android.backend.a {

    /* renamed from: f, reason: collision with root package name */
    private static b f45589f;

    /* renamed from: g, reason: collision with root package name */
    private static c f45590g = new c();

    /* renamed from: h, reason: collision with root package name */
    private static final AtomicBoolean f45591h = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    private final Context f45592a;

    /* renamed from: b, reason: collision with root package name */
    private com.wireguard.config.a f45593b;

    /* renamed from: c, reason: collision with root package name */
    private com.wireguard.android.backend.c f45594c;

    /* renamed from: d, reason: collision with root package name */
    private int f45595d = -1;

    /* renamed from: e, reason: collision with root package name */
    private Class f45596e;

    public interface b {
        void a();
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final LinkedBlockingQueue f45597a;

        /* renamed from: b, reason: collision with root package name */
        private final FutureTask f45598b;

        private c() {
            final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(1);
            this.f45597a = linkedBlockingQueue;
            Objects.requireNonNull(linkedBlockingQueue);
            this.f45598b = new FutureTask(new Callable() { // from class: Wf.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return linkedBlockingQueue.peek();
                }
            });
        }

        public boolean a(Object obj) {
            boolean zOffer = this.f45597a.offer(obj);
            if (zOffer) {
                this.f45598b.run();
            }
            return zOffer;
        }

        public Object b(long j10, TimeUnit timeUnit) {
            return this.f45598b.get(j10, timeUnit);
        }

        public boolean c() {
            return !this.f45597a.isEmpty();
        }

        public c d() {
            return new c();
        }
    }

    public static abstract class d extends VpnService {

        /* renamed from: a, reason: collision with root package name */
        private GoBackend f45599a;

        public VpnService.Builder a() {
            return new VpnService.Builder(this);
        }

        public void b(GoBackend goBackend) {
            this.f45599a = goBackend;
        }

        @Override // android.app.Service
        public void onCreate() {
            GoBackend.f45590g.a(this);
            super.onCreate();
        }

        @Override // android.app.Service
        public void onDestroy() {
            com.wireguard.android.backend.c cVar;
            GoBackend goBackend = this.f45599a;
            if (goBackend != null && (cVar = goBackend.f45594c) != null) {
                GoBackend.o(this.f45599a.f45592a);
                if (this.f45599a.f45595d != -1) {
                    GoBackend.wgTurnOff(this.f45599a.f45595d);
                }
                this.f45599a.f45594c = null;
                this.f45599a.f45595d = -1;
                this.f45599a.f45593b = null;
                cVar.c(c.a.DOWN);
            }
            c unused = GoBackend.f45590g = GoBackend.f45590g.d();
            super.onDestroy();
        }

        @Override // android.app.Service
        public int onStartCommand(Intent intent, int i10, int i11) {
            GoBackend.f45590g.a(this);
            if (intent == null || intent.getComponent() == null || !intent.getComponent().getPackageName().equals(getPackageName())) {
                Log.d("WireGuard/GoBackend", "Service started by Always-on VPN feature");
                if (GoBackend.f45589f != null) {
                    GoBackend.f45589f.a();
                }
            }
            return super.onStartCommand(intent, i10, i11);
        }
    }

    public GoBackend(Context context, Class cls) {
        this.f45592a = context;
        this.f45596e = cls;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o(Context context) {
        AtomicBoolean atomicBoolean = f45591h;
        synchronized (atomicBoolean) {
            try {
                if (atomicBoolean.compareAndSet(false, true)) {
                    Log.i("WireGuard/GoBackend", "Loading WG native lib ");
                    Xf.a.b(context, "wg-go");
                    Log.i("WireGuard/GoBackend", "WG native lib loaded");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void p(b bVar) {
        f45589f = bVar;
    }

    private void q(com.wireguard.android.backend.c cVar, com.wireguard.config.a aVar, c.a aVar2) throws BackendException, InterruptedException, PackageManager.NameNotFoundException, IOException {
        Log.i("WireGuard/GoBackend", "Bringing tunnel " + cVar.getName() + ' ' + aVar2);
        o(this.f45592a);
        if (aVar2 != c.a.UP) {
            int i10 = this.f45595d;
            if (i10 == -1) {
                Log.w("WireGuard/GoBackend", "Tunnel already down");
                return;
            }
            this.f45594c = null;
            this.f45595d = -1;
            this.f45593b = null;
            wgTurnOff(i10);
            try {
                ((d) f45590g.b(0L, TimeUnit.NANOSECONDS)).stopSelf();
            } catch (TimeoutException unused) {
            }
        } else {
            if (aVar == null) {
                throw new BackendException(BackendException.a.TUNNEL_MISSING_CONFIG, new Object[0]);
            }
            if (VpnService.prepare(this.f45592a) != null) {
                throw new BackendException(BackendException.a.VPN_NOT_AUTHORIZED, new Object[0]);
            }
            if (!f45590g.c()) {
                Log.d("WireGuard/GoBackend", "Requesting to start VpnService [" + this.f45596e.getName() + ']');
                this.f45592a.startService(new Intent(this.f45592a, (Class<?>) this.f45596e));
            }
            try {
                d dVar = (d) f45590g.b(2L, TimeUnit.SECONDS);
                dVar.b(this);
                if (this.f45595d != -1) {
                    Log.w("WireGuard/GoBackend", "Tunnel already up");
                    return;
                }
                loop0: for (int i11 = 0; i11 < 10; i11++) {
                    Iterator it = aVar.b().iterator();
                    while (it.hasNext()) {
                        Yf.c cVar2 = (Yf.c) ((com.wireguard.config.c) it.next()).f().orElse(null);
                        if (cVar2 != null && cVar2.b().orElse(null) == null) {
                            if (i11 >= 9) {
                                throw new BackendException(BackendException.a.DNS_RESOLUTION_FAILURE, cVar2.a());
                            }
                            Log.w("WireGuard/GoBackend", "DNS host \"" + cVar2.a() + "\" failed to resolve; trying again");
                            Thread.sleep(1000L);
                        }
                    }
                }
                String strC = aVar.c();
                VpnService.Builder builderA = dVar.a();
                builderA.setSession(cVar.getName());
                Iterator it2 = aVar.a().g().iterator();
                while (it2.hasNext()) {
                    builderA.addDisallowedApplication((String) it2.next());
                }
                Iterator it3 = aVar.a().h().iterator();
                while (it3.hasNext()) {
                    builderA.addAllowedApplication((String) it3.next());
                }
                for (Yf.d dVar2 : aVar.a().e()) {
                    builderA.addAddress(dVar2.a(), dVar2.b());
                }
                Iterator it4 = aVar.a().f().iterator();
                while (it4.hasNext()) {
                    builderA.addDnsServer(((InetAddress) it4.next()).getHostAddress());
                }
                Iterator it5 = aVar.b().iterator();
                boolean z10 = false;
                while (it5.hasNext()) {
                    for (Yf.d dVar3 : ((com.wireguard.config.c) it5.next()).e()) {
                        if (dVar3.b() == 0) {
                            z10 = true;
                        }
                        builderA.addRoute(dVar3.a(), dVar3.b());
                    }
                }
                if (!z10 || aVar.b().size() != 1) {
                    builderA.allowFamily(OsConstants.AF_INET);
                    builderA.allowFamily(OsConstants.AF_INET6);
                }
                builderA.setMtu(((Integer) aVar.a().i().orElse(1280)).intValue());
                if (Build.VERSION.SDK_INT >= 29) {
                    builderA.setMetered(false);
                }
                dVar.setUnderlyingNetworks(null);
                builderA.setBlocking(true);
                ParcelFileDescriptor parcelFileDescriptorEstablish = builderA.establish();
                try {
                    if (parcelFileDescriptorEstablish == null) {
                        throw new BackendException(BackendException.a.TUN_CREATION_ERROR, new Object[0]);
                    }
                    Log.d("WireGuard/GoBackend", "Go backend " + wgVersion());
                    this.f45595d = wgTurnOn(cVar.getName(), parcelFileDescriptorEstablish.detachFd(), strC);
                    parcelFileDescriptorEstablish.close();
                    int i12 = this.f45595d;
                    if (i12 < 0) {
                        throw new BackendException(BackendException.a.GO_ACTIVATION_ERROR_CODE, Integer.valueOf(this.f45595d));
                    }
                    this.f45594c = cVar;
                    this.f45593b = aVar;
                    dVar.protect(wgGetSocketV4(i12));
                    dVar.protect(wgGetSocketV6(this.f45595d));
                } catch (Throwable th2) {
                    if (parcelFileDescriptorEstablish != null) {
                        try {
                            parcelFileDescriptorEstablish.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (TimeoutException e10) {
                BackendException backendException = new BackendException(BackendException.a.UNABLE_TO_START_VPN, new Object[0]);
                backendException.initCause(e10);
                throw backendException;
            }
        }
        cVar.c(aVar2);
    }

    private static native String wgGetConfig(int i10);

    private static native int wgGetSocketV4(int i10);

    private static native int wgGetSocketV6(int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void wgTurnOff(int i10);

    private static native int wgTurnOn(String str, int i10, String str2);

    private static native String wgVersion();

    @Override // com.wireguard.android.backend.a
    public c.a a(com.wireguard.android.backend.c cVar, c.a aVar, com.wireguard.config.a aVar2) throws Exception {
        c.a aVarB = b(cVar);
        if (aVar == c.a.TOGGLE && aVarB == (aVar = c.a.UP)) {
            aVar = c.a.DOWN;
        }
        if (aVar == aVarB && cVar == this.f45594c && aVar2 == this.f45593b) {
            return aVarB;
        }
        if (aVar == c.a.UP) {
            com.wireguard.config.a aVar3 = this.f45593b;
            com.wireguard.android.backend.c cVar2 = this.f45594c;
            if (cVar2 != null) {
                q(cVar2, null, c.a.DOWN);
            }
            try {
                q(cVar, aVar2, aVar);
            } catch (Exception e10) {
                if (cVar2 != null) {
                    q(cVar2, aVar3, c.a.UP);
                }
                throw e10;
            }
        } else {
            c.a aVar4 = c.a.DOWN;
            if (aVar == aVar4 && cVar == this.f45594c) {
                q(cVar, null, aVar4);
            }
        }
        return b(cVar);
    }

    @Override // com.wireguard.android.backend.a
    public c.a b(com.wireguard.android.backend.c cVar) {
        return this.f45594c == cVar ? c.a.UP : c.a.DOWN;
    }

    @Override // com.wireguard.android.backend.a
    public com.wireguard.android.backend.b c(com.wireguard.android.backend.c cVar) throws NumberFormatException {
        int i10;
        String strWgGetConfig;
        o(this.f45592a);
        com.wireguard.android.backend.b bVar = new com.wireguard.android.backend.b();
        if (cVar != this.f45594c || (i10 = this.f45595d) == -1 || (strWgGetConfig = wgGetConfig(i10)) == null) {
            return bVar;
        }
        com.wireguard.crypto.b bVarD = null;
        long j10 = 0;
        long j11 = 0;
        for (String str : strWgGetConfig.split("\\n")) {
            if (str.startsWith("public_key=")) {
                if (bVarD != null) {
                    bVar.a(bVarD, j10, j11);
                }
                try {
                    bVarD = com.wireguard.crypto.b.d(str.substring(11));
                } catch (KeyFormatException unused) {
                    bVarD = null;
                }
                j10 = 0;
                j11 = 0;
            } else if (str.startsWith("rx_bytes=")) {
                if (bVarD != null) {
                    try {
                        j10 = Long.parseLong(str.substring(9));
                    } catch (NumberFormatException unused2) {
                        j10 = 0;
                    }
                }
            } else if (str.startsWith("tx_bytes=") && bVarD != null) {
                try {
                    j11 = Long.parseLong(str.substring(9));
                } catch (NumberFormatException unused3) {
                    j11 = 0;
                }
            }
        }
        if (bVarD != null) {
            bVar.a(bVarD, j10, j11);
        }
        return bVar;
    }
}
