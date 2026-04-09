package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.yandex.mobile.ads.impl.g60;
import com.yandex.mobile.ads.impl.ov;
import com.yandex.mobile.ads.impl.sv;
import com.yandex.mobile.ads.impl.tz;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class jh0 implements pv0 {

    /* renamed from: a, reason: collision with root package name */
    private final ov.a f29140a;

    /* renamed from: b, reason: collision with root package name */
    private final String f29141b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f29142c;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f29143d;

    public jh0(String str, boolean z10, tz.a aVar) {
        zf.a((z10 && TextUtils.isEmpty(str)) ? false : true);
        this.f29140a = aVar;
        this.f29141b = str;
        this.f29142c = z10;
        this.f29143d = new HashMap();
    }

    public final byte[] a(UUID uuid, g60.a aVar) throws qv0 {
        String strB = aVar.b();
        if (this.f29142c || TextUtils.isEmpty(strB)) {
            strB = this.f29141b;
        }
        if (TextUtils.isEmpty(strB)) {
            sv.a aVar2 = new sv.a();
            Uri uri = Uri.EMPTY;
            throw new qv0(aVar2.a(uri).a(), uri, yj0.g(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = lm.f30042e;
        map.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : lm.f30040c.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f29143d) {
            map.putAll(this.f29143d);
        }
        return a(this.f29140a, strB, aVar.a(), map);
    }

    public final byte[] a(g60.d dVar) throws qv0 {
        return a(this.f29140a, dVar.b() + "&signedRequest=" + s82.a(dVar.a()), null, Collections.EMPTY_MAP);
    }

    public final void a(String str, String str2) {
        str.getClass();
        str2.getClass();
        synchronized (this.f29143d) {
            this.f29143d.put(str, str2);
        }
    }

    private static byte[] a(ov.a aVar, String str, byte[] bArr, Map<String, String> map) throws qv0 {
        Map<String, List<String>> map2;
        List<String> list;
        g22 g22Var = new g22(aVar.a());
        sv svVarA = new sv.a().b(str).a(map).b().a(bArr).a(1).a();
        int i = 0;
        int i10 = 0;
        sv svVarA2 = svVarA;
        while (true) {
            try {
                qv qvVar = new qv(g22Var, svVarA2);
                try {
                    try {
                        int i11 = s82.f32899a;
                        byte[] bArr2 = new byte[4096];
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        while (true) {
                            int i12 = qvVar.read(bArr2);
                            if (i12 != -1) {
                                byteArrayOutputStream.write(bArr2, i, i12);
                            } else {
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                s82.a((Closeable) qvVar);
                                return byteArray;
                            }
                        }
                    } catch (eh0 e4) {
                        int i13 = e4.f26866e;
                        String str2 = ((i13 != 307 && i13 != 308) || i10 >= 5 || (map2 = e4.f26867f) == null || (list = map2.get("Location")) == null || list.isEmpty()) ? null : list.get(i);
                        if (str2 != null) {
                            i10++;
                            svVarA2 = svVarA2.a().b(str2).a();
                            s82.a((Closeable) qvVar);
                        } else {
                            throw e4;
                        }
                    }
                } catch (Throwable th) {
                    s82.a((Closeable) qvVar);
                    throw th;
                }
            } catch (Exception e10) {
                Uri uriF = g22Var.f();
                uriF.getClass();
                throw new qv0(svVarA, uriF, g22Var.getResponseHeaders(), g22Var.e(), e10);
            }
        }
    }
}
