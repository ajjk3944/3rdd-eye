package F7;

import A9.I;
import H7.b;
import M6.C0795a;
import android.database.sqlite.SQLiteDatabase;
import b9.C1992A;
import java.util.LinkedHashSet;
import p9.InterfaceC5480a;

/* compiled from: DivStorageImpl.kt */
/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.m implements InterfaceC5480a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1699g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1700h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj, int i) {
        super(0);
        this.f1699g = i;
        this.f1700h = obj;
    }

    @Override // p9.InterfaceC5480a
    public final Object invoke() {
        SQLiteDatabase sQLiteDatabase;
        switch (this.f1699g) {
            case 0:
                H7.b bVar = ((g) this.f1700h).f1680a;
                b.C0038b c0038b = bVar.f2276a;
                synchronized (c0038b) {
                    c0038b.f2287g = c0038b.f2281a.getWritableDatabase();
                    c0038b.f2286f++;
                    LinkedHashSet linkedHashSet = c0038b.f2285e;
                    Thread threadCurrentThread = Thread.currentThread();
                    kotlin.jvm.internal.l.e(threadCurrentThread, "currentThread()");
                    linkedHashSet.add(threadCurrentThread);
                    sQLiteDatabase = c0038b.f2287g;
                    kotlin.jvm.internal.l.c(sQLiteDatabase);
                }
                return bVar.a(sQLiteDatabase);
            case 1:
                return Boolean.valueOf(((C0795a) this.f1700h).f4228w == 0);
            default:
                Q6.i iVar = (Q6.i) this.f1700h;
                if (iVar.f11342g != null) {
                    Q6.g gVar = iVar.f11338c;
                    Throwable thA = b9.m.a(Q6.i.a(iVar, gVar.a(true)));
                    if (thA != null && I.j(thA)) {
                        Q6.i.a(iVar, gVar.a(false));
                    }
                }
                return C1992A.f18074a;
        }
    }
}
