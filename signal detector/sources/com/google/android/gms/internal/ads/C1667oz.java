package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import f4.InterfaceFutureC2326a;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.oz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1667oz extends AbstractC2098wz {

    /* renamed from: f, reason: collision with root package name */
    public final Map f16084f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f16085g;

    /* renamed from: h, reason: collision with root package name */
    public final EnumC1450ky f16086h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public final long f16087j;

    public C1667oz(S5 s5, C1291hz c1291hz, Map map, Context context, EnumC1450ky enumC1450ky, Xx xx, C1948uA c1948uA) {
        super("Qx6fKcghp39v3hBS7aGRudr3CfsW9ttl9o6D5CM1a5VL5o9yAVkUDqNE55A7wfv7", "6qdYmVukMTFpVys4cpUndL5YDKVPIertd1vgaMgush0=", s5, c1291hz, c1948uA.a(113));
        this.f16085g = context;
        this.f16084f = map;
        this.f16086h = enumC1450ky;
        this.i = xx.N();
        this.f16087j = xx.O();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2098wz
    public final void a(Method method, S5 s5) {
        C1136f6 c1136f6;
        Object[] objArr = (Object[]) method.invoke("", this.f16085g, Integer.valueOf(this.f16086h.ordinal()));
        objArr.getClass();
        String strV0 = "E";
        try {
            InterfaceFutureC2326a interfaceFutureC2326a = (InterfaceFutureC2326a) this.f16084f.get("gs");
            if (interfaceFutureC2326a != null && ((Build.VERSION.SDK_INT < 31 || interfaceFutureC2326a.isDone()) && (c1136f6 = (C1136f6) interfaceFutureC2326a.get(this.i, TimeUnit.MILLISECONDS)) != null && c1136f6.v0().length() > 1)) {
                strV0 = c1136f6.v0();
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (strV0.equals("E")) {
            try {
                InterfaceFutureC2326a interfaceFutureC2326a2 = (InterfaceFutureC2326a) this.f16084f.get("ai");
                if (interfaceFutureC2326a2 != null) {
                    String str = (String) interfaceFutureC2326a2.get(this.f16087j, TimeUnit.MILLISECONDS);
                    if (!C1476lN.k(str)) {
                        strV0 = str;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        Boolean bool = (Boolean) objArr[5];
        synchronized (s5) {
            try {
                long jLongValue = ((Long) objArr[0]).longValue();
                s5.b();
                ((C1136f6) s5.f13551b).F(jLongValue);
                String str2 = (String) objArr[1];
                s5.b();
                ((C1136f6) s5.f13551b).E(str2);
                String str3 = (String) objArr[2];
                s5.b();
                ((C1136f6) s5.f13551b).O(str3);
                String str4 = (String) objArr[3];
                s5.b();
                ((C1136f6) s5.f13551b).P(str4);
                C2166yC c2166yCF = C2166yC.f17693f.f();
                byte[] bArr = (byte[]) objArr[4];
                String strG = c2166yCF.g(bArr.length, bArr);
                s5.b();
                ((C1136f6) s5.f13551b).A(strG);
                s5.b();
                ((C1136f6) s5.f13551b).S0(strV0);
                if (bool != null) {
                    int i = true != bool.booleanValue() ? 1 : 2;
                    s5.b();
                    ((C1136f6) s5.f13551b).t0(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
