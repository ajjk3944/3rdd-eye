package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import java.io.UnsupportedEncodingException;

/* renamed from: com.google.android.gms.internal.ads.xz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2152xz {

    /* renamed from: a, reason: collision with root package name */
    public final Context f17656a;

    /* renamed from: b, reason: collision with root package name */
    public final C1948uA f17657b;

    /* renamed from: c, reason: collision with root package name */
    public final Yy f17658c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17659d;

    public C2152xz(Context context, C1948uA c1948uA, Yy yy, Xx xx) {
        this.f17656a = context;
        this.f17657b = c1948uA;
        this.f17658c = yy;
        this.f17659d = xx.G();
    }

    public final String a(long j6) {
        String string;
        C1894tA c1894tAA = this.f17657b.a(55);
        try {
            try {
                c1894tAA.a();
                C1405k6 c1405k6A = C1459l6.A();
                String str = this.f17659d;
                c1405k6A.b();
                ((C1459l6) c1405k6A.f13551b).C(str);
                c1405k6A.b();
                ((C1459l6) c1405k6A.f13551b).B("0.825731049");
                Context context = this.f17656a;
                String packageName = context.getPackageName();
                c1405k6A.b();
                ((C1459l6) c1405k6A.f13551b).E(packageName);
                long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                c1405k6A.b();
                ((C1459l6) c1405k6A.f13551b).D(jCurrentTimeMillis);
                long jCurrentTimeMillis2 = (System.currentTimeMillis() - j6) / 1000;
                c1405k6A.b();
                ((C1459l6) c1405k6A.f13551b).G(jCurrentTimeMillis2);
                try {
                    long j7 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    c1405k6A.b();
                    ((C1459l6) c1405k6A.f13551b).F(j7);
                } catch (PackageManager.NameNotFoundException unused) {
                    c1405k6A.b();
                    ((C1459l6) c1405k6A.f13551b).F(-1L);
                }
                Yy yy = this.f17658c;
                if (!yy.b()) {
                    yy.a();
                }
                C1621o6 c1621o6E = yy.e(null, ((C1459l6) c1405k6A.d()).b());
                c1621o6E.b();
                ((C1675p6) c1621o6E.f13551b).D(5);
                c1621o6E.b();
                ((C1675p6) c1621o6E.f13551b).E(2);
                byte[] bArrB = ((C1675p6) c1621o6E.d()).b();
                C2058wC c2058wC = C2166yC.f17692e;
                if (c2058wC.f17695b != null) {
                    c2058wC = new C2058wC(c2058wC.f17694a, (Character) null);
                }
                string = c2058wC.g(bArrB.length, bArrB);
            } catch (UnsupportedEncodingException e6) {
                c1894tAA.b(e6);
                string = Integer.toString(7);
            } catch (Throwable th) {
                c1894tAA.b(th);
                throw th;
            }
            c1894tAA.c();
            return string;
        } catch (Throwable th2) {
            c1894tAA.c();
            throw th2;
        }
    }
}
