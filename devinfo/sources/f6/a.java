package f6;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;
import nk.k;
import nm.d0;
import v2.p;
import v2.r;
import w4.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements mk.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23656a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23657b;

    public /* synthetic */ a(int i4, Object obj) {
        this.f23656a = i4;
        this.f23657b = obj;
    }

    @Override // mk.g
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f23656a) {
            case 0:
                d0 d0Var = (d0) this.f23657b;
                SQLiteCursorDriver sQLiteCursorDriver = (SQLiteCursorDriver) obj2;
                String str = (String) obj3;
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                k.b(sQLiteQuery);
                i iVar = new i(sQLiteQuery);
                w5.e eVar = (w5.e) d0Var.f30011b;
                int length = eVar.f36478d.length;
                for (int i4 = 1; i4 < length; i4++) {
                    int i10 = eVar.f36478d[i4];
                    if (i10 == 1) {
                        iVar.a(i4, eVar.f36479e[i4]);
                    } else if (i10 == 2) {
                        iVar.H(eVar.f36480f[i4], i4);
                    } else if (i10 == 3) {
                        String str2 = eVar.g[i4];
                        k.b(str2);
                        iVar.k(i4, str2);
                    } else if (i10 == 4) {
                        byte[] bArr = eVar.f36481h[i4];
                        k.b(bArr);
                        iVar.b(i4, bArr);
                    } else if (i10 == 5) {
                        iVar.d(i4);
                    }
                }
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            default:
                z2.c cVar = (z2.c) this.f23657b;
                r rVarB = ((v2.e) cVar.f37845e).b((p) obj, (v2.k) obj2, ((v2.i) obj3).f35774a, ((v2.j) obj4).f35775a);
                if (rVarB instanceof r) {
                    Object obj5 = rVarB.f35789a;
                    k.c(obj5, "null cannot be cast to non-null type android.graphics.Typeface");
                    return (Typeface) obj5;
                }
                m mVar = new m(rVarB, cVar.j);
                cVar.j = mVar;
                Object obj6 = mVar.f36444c;
                k.c(obj6, "null cannot be cast to non-null type android.graphics.Typeface");
                return (Typeface) obj6;
        }
    }
}
