package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.internal.Buffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class kz0 {

    /* renamed from: a, reason: collision with root package name */
    public final w81 f13297a;

    /* renamed from: b, reason: collision with root package name */
    public final lz0 f13298b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f13299c;

    /* renamed from: d, reason: collision with root package name */
    public final String f13300d;

    /* renamed from: e, reason: collision with root package name */
    public final zc f13301e;

    /* renamed from: f, reason: collision with root package name */
    public final sz0 f13302f;
    public final g21 g;

    public kz0(w81 w81Var, lz0 lz0Var, sz0 sz0Var, zx0 zx0Var, String str, zc zcVar, ks1 ks1Var, ks1 ks1Var2, ks1 ks1Var3, g21 g21Var) {
        this.f13297a = w81Var;
        this.f13298b = lz0Var;
        this.f13300d = str;
        this.f13302f = sz0Var;
        this.f13301e = zcVar;
        this.g = g21Var;
        int iOrdinal = zx0Var.ordinal();
        if (iOrdinal == 0) {
            this.f13299c = ks1Var.a();
        } else if (iOrdinal == 1) {
            this.f13299c = ks1Var2.a();
        } else {
            if (iOrdinal != 2) {
                throw new IllegalStateException();
            }
            this.f13299c = ks1Var3.a();
        }
    }

    public final vd.b a() {
        boolean z3;
        if (!this.f13298b.b()) {
            return yo0.e(Integer.toString(7));
        }
        sz0 sz0Var = this.f13302f;
        synchronized (sz0Var) {
            z3 = sz0Var.j;
        }
        if (!z3) {
            final int i4 = 1;
            return yo0.z(this.f13297a, new Callable(this) { // from class: com.google.android.gms.internal.ads.jz0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ kz0 f12905b;

                {
                    this.f12905b = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String strEncodeToString;
                    switch (i4) {
                        case 0:
                            kz0 kz0Var = this.f12905b;
                            try {
                                kz0Var.g.a(101).a();
                                md mdVar = (md) kz0Var.f13301e.e();
                                String str = kz0Var.f13300d;
                                lz0 lz0Var = kz0Var.f13298b;
                                try {
                                    strEncodeToString = Base64.encodeToString(((wd) lz0Var.e(str, mdVar.b()).e()).b(), 11);
                                } catch (IllegalArgumentException unused) {
                                    lz0Var.getClass();
                                    zc zcVarC0 = md.C0();
                                    zcVarC0.i(Buffer.SEGMENTING_THRESHOLD);
                                    strEncodeToString = Base64.encodeToString(lz0Var.c(((md) zcVarC0.e()).b(), str, true), 11);
                                }
                                return strEncodeToString;
                            } finally {
                            }
                        default:
                            kz0 kz0Var2 = this.f12905b;
                            String str2 = kz0Var2.f13300d;
                            lz0 lz0Var2 = kz0Var2.f13298b;
                            lz0Var2.getClass();
                            zc zcVarC02 = md.C0();
                            zcVarC02.i(Http2.INITIAL_MAX_FRAME_SIZE);
                            return Base64.encodeToString(lz0Var2.c(((md) zcVarC02.e()).b(), str2, true), 11);
                    }
                }
            });
        }
        Set set = this.f13299c;
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((ex) this.f13297a).e((g01) it.next()));
        }
        x41 x41VarQ = x41.q(arrayList);
        final int i10 = 0;
        Callable callable = new Callable(this) { // from class: com.google.android.gms.internal.ads.jz0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ kz0 f12905b;

            {
                this.f12905b = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                String strEncodeToString;
                switch (i10) {
                    case 0:
                        kz0 kz0Var = this.f12905b;
                        try {
                            kz0Var.g.a(101).a();
                            md mdVar = (md) kz0Var.f13301e.e();
                            String str = kz0Var.f13300d;
                            lz0 lz0Var = kz0Var.f13298b;
                            try {
                                strEncodeToString = Base64.encodeToString(((wd) lz0Var.e(str, mdVar.b()).e()).b(), 11);
                            } catch (IllegalArgumentException unused) {
                                lz0Var.getClass();
                                zc zcVarC0 = md.C0();
                                zcVarC0.i(Buffer.SEGMENTING_THRESHOLD);
                                strEncodeToString = Base64.encodeToString(lz0Var.c(((md) zcVarC0.e()).b(), str, true), 11);
                            }
                            return strEncodeToString;
                        } finally {
                        }
                    default:
                        kz0 kz0Var2 = this.f12905b;
                        String str2 = kz0Var2.f13300d;
                        lz0 lz0Var2 = kz0Var2.f13298b;
                        lz0Var2.getClass();
                        zc zcVarC02 = md.C0();
                        zcVarC02.i(Http2.INITIAL_MAX_FRAME_SIZE);
                        return Base64.encodeToString(lz0Var2.c(((md) zcVarC02.e()).b(), str2, true), 11);
                }
            }
        };
        k81 k81Var = k81.f13081a;
        j81 j81Var = new j81(x41VarQ, false, false);
        j81Var.f12674p = new i81(j81Var, callable, k81Var);
        j81Var.w();
        return j81Var;
    }
}
