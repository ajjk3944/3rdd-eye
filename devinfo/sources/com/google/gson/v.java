package com.google.gson;

import java.io.IOException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final r f20895a;

    /* renamed from: b, reason: collision with root package name */
    public static final s f20896b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ v[] f20897c;

    static {
        r rVar = new r();
        f20895a = rVar;
        s sVar = new s();
        f20896b = sVar;
        f20897c = new v[]{rVar, sVar, new v() { // from class: com.google.gson.t
            public static Double b(String str, yf.b bVar) throws NumberFormatException, yf.d {
                try {
                    Double dValueOf = Double.valueOf(str);
                    if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                        if (bVar.f37600o != 1) {
                            throw new yf.d("JSON forbids NaN and infinities: " + dValueOf + "; at path " + bVar.y(true));
                        }
                    }
                    return dValueOf;
                } catch (NumberFormatException e2) {
                    StringBuilder sbA = d.h.A("Cannot parse ", str, "; at path ");
                    sbA.append(bVar.y(true));
                    throw new ac.m(sbA.toString(), e2);
                }
            }

            @Override // com.google.gson.v
            public final Number a(yf.b bVar) throws IOException {
                String strX = bVar.X();
                if (strX.indexOf(46) >= 0) {
                    return b(strX, bVar);
                }
                try {
                    return Long.valueOf(Long.parseLong(strX));
                } catch (NumberFormatException unused) {
                    return b(strX, bVar);
                }
            }
        }, new v() { // from class: com.google.gson.u
            @Override // com.google.gson.v
            public final Number a(yf.b bVar) throws IOException {
                String strX = bVar.X();
                try {
                    return com.google.gson.internal.g.i(strX);
                } catch (NumberFormatException e2) {
                    StringBuilder sbA = d.h.A("Cannot parse ", strX, "; at path ");
                    sbA.append(bVar.y(true));
                    throw new ac.m(sbA.toString(), e2);
                }
            }
        }};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f20897c.clone();
    }

    public abstract Number a(yf.b bVar);
}
