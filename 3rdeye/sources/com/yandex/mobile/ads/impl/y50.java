package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ss1;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class y50 {

    /* renamed from: a, reason: collision with root package name */
    private final wn1 f35630a;

    /* renamed from: b, reason: collision with root package name */
    private final ta f35631b;

    /* renamed from: c, reason: collision with root package name */
    private final tn1 f35632c;

    /* renamed from: d, reason: collision with root package name */
    private final r50 f35633d;

    /* renamed from: e, reason: collision with root package name */
    private ss1.b f35634e;

    /* renamed from: f, reason: collision with root package name */
    private ss1 f35635f;

    /* renamed from: g, reason: collision with root package name */
    private int f35636g;

    /* renamed from: h, reason: collision with root package name */
    private int f35637h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private ps1 f35638j;

    public y50(wn1 connectionPool, ta address, tn1 call, r50 eventListener) {
        kotlin.jvm.internal.l.f(connectionPool, "connectionPool");
        kotlin.jvm.internal.l.f(address, "address");
        kotlin.jvm.internal.l.f(call, "call");
        kotlin.jvm.internal.l.f(eventListener, "eventListener");
        this.f35630a = connectionPool;
        this.f35631b = address;
        this.f35632c = call;
        this.f35633d = eventListener;
    }

    public final x50 a(vd1 client, xn1 chain) {
        kotlin.jvm.internal.l.f(client, "client");
        kotlin.jvm.internal.l.f(chain, "chain");
        try {
            try {
                return a(chain.c(), chain.e(), chain.g(), client.v(), !kotlin.jvm.internal.l.b(chain.f().f(), "GET")).a(client, chain);
            } catch (rs1 e4) {
                e = e4;
                rs1 rs1Var = e;
                a(rs1Var.b());
                throw rs1Var;
            } catch (IOException e10) {
                e = e10;
                IOException iOException = e;
                a(iOException);
                throw new rs1(iOException);
            }
        } catch (rs1 e11) {
            e = e11;
        } catch (IOException e12) {
            e = e12;
        }
    }

    public final boolean b() {
        ss1 ss1Var;
        un1 un1VarD;
        int i = this.f35636g;
        if (i == 0 && this.f35637h == 0 && this.i == 0) {
            return false;
        }
        if (this.f35638j != null) {
            return true;
        }
        ps1 ps1VarK = null;
        if (i <= 1 && this.f35637h <= 1 && this.i <= 0 && (un1VarD = this.f35632c.d()) != null) {
            synchronized (un1VarD) {
                if (un1VarD.e() == 0) {
                    rh0 rh0VarK = un1VarD.k().a().k();
                    rh0 other = this.f35631b.k();
                    byte[] bArr = t82.f33480a;
                    kotlin.jvm.internal.l.f(rh0VarK, "<this>");
                    kotlin.jvm.internal.l.f(other, "other");
                    if (kotlin.jvm.internal.l.b(rh0VarK.g(), other.g()) && rh0VarK.i() == other.i() && kotlin.jvm.internal.l.b(rh0VarK.k(), other.k())) {
                        ps1VarK = un1VarD.k();
                    }
                }
            }
        }
        if (ps1VarK != null) {
            this.f35638j = ps1VarK;
            return true;
        }
        ss1.b bVar = this.f35634e;
        if ((bVar == null || !bVar.b()) && (ss1Var = this.f35635f) != null) {
            return ss1Var.a();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.yandex.mobile.ads.impl.un1 a(int r12, int r13, int r14, boolean r15, boolean r16) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.y50.a(int, int, int, boolean, boolean):com.yandex.mobile.ads.impl.un1");
    }

    public final ta a() {
        return this.f35631b;
    }

    public final boolean a(rh0 url) {
        kotlin.jvm.internal.l.f(url, "url");
        rh0 rh0VarK = this.f35631b.k();
        return url.i() == rh0VarK.i() && kotlin.jvm.internal.l.b(url.g(), rh0VarK.g());
    }

    public final void a(IOException e4) {
        kotlin.jvm.internal.l.f(e4, "e");
        this.f35638j = null;
        if ((e4 instanceof n22) && ((n22) e4).f30745b == o50.f31190h) {
            this.f35636g++;
        } else if (e4 instanceof kr) {
            this.f35637h++;
        } else {
            this.i++;
        }
    }
}
