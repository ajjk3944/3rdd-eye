package a1;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.view.ViewStructure;
import ar.p;
import lq.b0;

/* loaded from: classes.dex */
public final class o extends br.n implements p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f26d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f27g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i10, Object obj) {
        super(4);
        this.f26d = i10;
        this.f27g = obj;
    }

    @Override // ar.p
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f26d) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                int iIntValue2 = ((Number) obj2).intValue();
                ((ViewStructure) this.f27g).setDimens(iIntValue, iIntValue2, 0, 0, ((Number) obj3).intValue() - iIntValue, ((Number) obj4).intValue() - iIntValue2);
                return b0.f15562a;
            default:
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                o7.d dVar = (o7.d) this.f27g;
                br.l.b(sQLiteQuery);
                dVar.h(new p7.j(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
        }
    }
}
