package androidx.camera.core.impl;

import C.InterfaceC0625l;
import D.a;
import N7.G8;
import androidx.camera.core.impl.J;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import v.C5664t;

/* compiled from: CameraStateRegistry.java */
/* loaded from: classes.dex */
public final class N implements a.InterfaceC0008a {

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f14922a = new StringBuilder();

    /* renamed from: b, reason: collision with root package name */
    public final Object f14923b;

    /* renamed from: c, reason: collision with root package name */
    public int f14924c;

    /* renamed from: d, reason: collision with root package name */
    public final A.a f14925d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f14926e;

    /* renamed from: f, reason: collision with root package name */
    public int f14927f;

    /* compiled from: CameraStateRegistry.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public J.a f14928a = null;

        /* renamed from: b, reason: collision with root package name */
        public final H.g f14929b;

        /* renamed from: c, reason: collision with root package name */
        public final C5664t.c f14930c;

        /* renamed from: d, reason: collision with root package name */
        public final C5664t.b f14931d;

        public a(H.g gVar, C5664t.c cVar, C5664t.b bVar) {
            this.f14929b = gVar;
            this.f14930c = cVar;
            this.f14931d = bVar;
        }
    }

    public N(A.a aVar) {
        Object obj = new Object();
        this.f14923b = obj;
        this.f14926e = new HashMap();
        this.f14924c = 1;
        synchronized (obj) {
            this.f14925d = aVar;
            this.f14927f = this.f14924c;
        }
    }

    public static void d(C5664t c5664t, J.a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (J1.a.b()) {
            J1.a.c(aVar.ordinal(), "CX:State[" + c5664t + "]");
        }
    }

    @Override // D.a.InterfaceC0008a
    public final void a(int i, int i10) {
        synchronized (this.f14923b) {
            boolean z10 = true;
            this.f14924c = i10 == 2 ? 2 : 1;
            boolean z11 = i != 2 && i10 == 2;
            if (i != 2 || i10 == 2) {
                z10 = false;
            }
            if (z11 || z10) {
                c();
            }
        }
    }

    public final a b(String str) {
        HashMap map = this.f14926e;
        for (InterfaceC0625l interfaceC0625l : map.keySet()) {
            if (str.equals(((I) interfaceC0625l.a()).d())) {
                return (a) map.get(interfaceC0625l);
            }
        }
        return null;
    }

    public final void c() {
        boolean zD = C.S.d("CameraStateRegistry");
        StringBuilder sb = this.f14922a;
        if (zD) {
            sb.setLength(0);
            sb.append("Recalculating open cameras:\n");
            sb.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            sb.append("-------------------------------------------------------------------\n");
        }
        int i = 0;
        for (Map.Entry entry : this.f14926e.entrySet()) {
            if (C.S.d("CameraStateRegistry")) {
                sb.append(String.format(Locale.US, "%-45s%-22s\n", ((InterfaceC0625l) entry.getKey()).toString(), ((a) entry.getValue()).f14928a != null ? ((a) entry.getValue()).f14928a.toString() : "UNKNOWN"));
            }
            J.a aVar = ((a) entry.getValue()).f14928a;
            if (aVar != null && aVar.holdsCameraSlot()) {
                i++;
            }
        }
        if (C.S.d("CameraStateRegistry")) {
            sb.append("-------------------------------------------------------------------\n");
            Locale locale = Locale.US;
            sb.append(G8.r("Open count: ", i, " (Max allowed: ", this.f14924c, ")"));
            C.S.a("CameraStateRegistry", sb.toString());
        }
        this.f14927f = Math.max(this.f14924c - i, 0);
    }

    public final boolean e(C5664t c5664t) {
        boolean z10;
        synchronized (this.f14923b) {
            try {
                a aVar = (a) this.f14926e.get(c5664t);
                A2.l.p(aVar, "Camera must first be registered with registerCamera()");
                z10 = true;
                if (C.S.d("CameraStateRegistry")) {
                    this.f14922a.setLength(0);
                    StringBuilder sb = this.f14922a;
                    Locale locale = Locale.US;
                    int i = this.f14927f;
                    J.a aVar2 = aVar.f14928a;
                    boolean z11 = aVar2 != null && aVar2.holdsCameraSlot();
                    sb.append("tryOpenCamera(" + c5664t + ") [Available Cameras: " + i + ", Already Open: " + z11 + " (Previous state: " + aVar.f14928a + ")]");
                }
                if (this.f14927f > 0) {
                    J.a aVar3 = J.a.OPENING;
                    aVar.f14928a = aVar3;
                    d(c5664t, aVar3);
                } else {
                    J.a aVar4 = aVar.f14928a;
                    if (aVar4 != null && aVar4.holdsCameraSlot()) {
                        J.a aVar32 = J.a.OPENING;
                        aVar.f14928a = aVar32;
                        d(c5664t, aVar32);
                    } else {
                        z10 = false;
                    }
                }
                if (C.S.d("CameraStateRegistry")) {
                    StringBuilder sb2 = this.f14922a;
                    Locale locale2 = Locale.US;
                    sb2.append(" --> ".concat(z10 ? "SUCCESS" : "FAIL"));
                    C.S.a("CameraStateRegistry", this.f14922a.toString());
                }
                if (z10) {
                    c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    public final boolean f(String str, String str2) {
        synchronized (this.f14923b) {
            try {
                boolean z10 = true;
                if (this.f14925d.f4e != 2) {
                    return true;
                }
                a aVarB = b(str);
                J.a aVar = aVarB != null ? aVarB.f14928a : null;
                a aVarB2 = str2 != null ? b(str2) : null;
                J.a aVar2 = aVarB2 != null ? aVarB2.f14928a : null;
                J.a aVar3 = J.a.OPEN;
                boolean z11 = aVar3.equals(aVar) || J.a.CONFIGURED.equals(aVar);
                boolean z12 = aVar3.equals(aVar2) || J.a.CONFIGURED.equals(aVar2);
                if (!z11 || !z12) {
                    z10 = false;
                }
                return z10;
            } finally {
            }
        }
    }
}
