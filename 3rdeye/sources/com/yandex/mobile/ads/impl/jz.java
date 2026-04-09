package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.yandex.mobile.ads.impl.ov;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class jz implements ov {

    /* renamed from: a, reason: collision with root package name */
    private final Context f29383a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f29384b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final ov f29385c;

    /* renamed from: d, reason: collision with root package name */
    private bb0 f29386d;

    /* renamed from: e, reason: collision with root package name */
    private kg f29387e;

    /* renamed from: f, reason: collision with root package name */
    private xr f29388f;

    /* renamed from: g, reason: collision with root package name */
    private ov f29389g;

    /* renamed from: h, reason: collision with root package name */
    private m72 f29390h;
    private mv i;

    /* renamed from: j, reason: collision with root package name */
    private mn1 f29391j;

    /* renamed from: k, reason: collision with root package name */
    private ov f29392k;

    public static final class a implements ov.a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f29393a;

        /* renamed from: b, reason: collision with root package name */
        private final ov.a f29394b;

        public a(Context context, ov.a aVar) {
            this.f29393a = context.getApplicationContext();
            this.f29394b = aVar;
        }

        @Override // com.yandex.mobile.ads.impl.ov.a
        public final ov a() {
            return new jz(this.f29393a, this.f29394b.a());
        }
    }

    public jz(Context context, ov ovVar) {
        this.f29383a = context.getApplicationContext();
        this.f29385c = (ov) zf.a(ovVar);
    }

    private void a(ov ovVar) {
        for (int i = 0; i < this.f29384b.size(); i++) {
            ovVar.a((q62) this.f29384b.get(i));
        }
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final void close() throws IOException {
        ov ovVar = this.f29392k;
        if (ovVar != null) {
            try {
                ovVar.close();
            } finally {
                this.f29392k = null;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final Map<String, List<String>> getResponseHeaders() {
        ov ovVar = this.f29392k;
        return ovVar == null ? Collections.EMPTY_MAP : ovVar.getResponseHeaders();
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final Uri getUri() {
        ov ovVar = this.f29392k;
        if (ovVar == null) {
            return null;
        }
        return ovVar.getUri();
    }

    @Override // com.yandex.mobile.ads.impl.lv
    public final int read(byte[] bArr, int i, int i10) throws IOException {
        ov ovVar = this.f29392k;
        ovVar.getClass();
        return ovVar.read(bArr, i, i10);
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final void a(q62 q62Var) {
        q62Var.getClass();
        this.f29385c.a(q62Var);
        this.f29384b.add(q62Var);
        bb0 bb0Var = this.f29386d;
        if (bb0Var != null) {
            bb0Var.a(q62Var);
        }
        kg kgVar = this.f29387e;
        if (kgVar != null) {
            kgVar.a(q62Var);
        }
        xr xrVar = this.f29388f;
        if (xrVar != null) {
            xrVar.a(q62Var);
        }
        ov ovVar = this.f29389g;
        if (ovVar != null) {
            ovVar.a(q62Var);
        }
        m72 m72Var = this.f29390h;
        if (m72Var != null) {
            m72Var.a(q62Var);
        }
        mv mvVar = this.i;
        if (mvVar != null) {
            mvVar.a(q62Var);
        }
        mn1 mn1Var = this.f29391j;
        if (mn1Var != null) {
            mn1Var.a(q62Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final long a(sv svVar) throws IOException {
        if (this.f29392k == null) {
            String scheme = svVar.f33250a.getScheme();
            Uri uri = svVar.f33250a;
            int i = s82.f32899a;
            String scheme2 = uri.getScheme();
            if (!TextUtils.isEmpty(scheme2) && !"file".equals(scheme2)) {
                if ("asset".equals(scheme)) {
                    if (this.f29387e == null) {
                        kg kgVar = new kg(this.f29383a);
                        this.f29387e = kgVar;
                        a(kgVar);
                    }
                    this.f29392k = this.f29387e;
                } else if (AppLovinEventTypes.USER_VIEWED_CONTENT.equals(scheme)) {
                    if (this.f29388f == null) {
                        xr xrVar = new xr(this.f29383a);
                        this.f29388f = xrVar;
                        a(xrVar);
                    }
                    this.f29392k = this.f29388f;
                } else if ("rtmp".equals(scheme)) {
                    if (this.f29389g == null) {
                        try {
                            ov ovVar = (ov) Class.forName("com.monetization.ads.exo.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                            this.f29389g = ovVar;
                            a(ovVar);
                        } catch (ClassNotFoundException unused) {
                            rs0.d("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                        } catch (Exception e4) {
                            throw new RuntimeException("Error instantiating RTMP extension", e4);
                        }
                        if (this.f29389g == null) {
                            this.f29389g = this.f29385c;
                        }
                    }
                    this.f29392k = this.f29389g;
                } else if ("udp".equals(scheme)) {
                    if (this.f29390h == null) {
                        m72 m72Var = new m72(0);
                        this.f29390h = m72Var;
                        a(m72Var);
                    }
                    this.f29392k = this.f29390h;
                } else if ("data".equals(scheme)) {
                    if (this.i == null) {
                        mv mvVar = new mv();
                        this.i = mvVar;
                        a(mvVar);
                    }
                    this.f29392k = this.i;
                } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                    this.f29392k = this.f29385c;
                } else {
                    if (this.f29391j == null) {
                        mn1 mn1Var = new mn1(this.f29383a);
                        this.f29391j = mn1Var;
                        a(mn1Var);
                    }
                    this.f29392k = this.f29391j;
                }
            } else {
                String path = svVar.f33250a.getPath();
                if (path != null && path.startsWith("/android_asset/")) {
                    if (this.f29387e == null) {
                        kg kgVar2 = new kg(this.f29383a);
                        this.f29387e = kgVar2;
                        a(kgVar2);
                    }
                    this.f29392k = this.f29387e;
                } else {
                    if (this.f29386d == null) {
                        bb0 bb0Var = new bb0();
                        this.f29386d = bb0Var;
                        a(bb0Var);
                    }
                    this.f29392k = this.f29386d;
                }
            }
            return this.f29392k.a(svVar);
        }
        throw new IllegalStateException();
    }
}
