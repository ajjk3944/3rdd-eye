package H7;

import N7.B8;
import android.database.sqlite.SQLiteStatement;
import b9.C1992A;
import b9.C2001h;
import c9.C2097r;
import java.util.ArrayList;
import java.util.List;
import p9.InterfaceC5480a;
import y9.C5819a;

/* compiled from: StorageStatements.kt */
/* loaded from: classes.dex */
public final class q implements j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2302a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<J7.a> f2303b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p9.l<List<String>, C1992A> f2304c;

    /* compiled from: StorageStatements.kt */
    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<String> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ List<J7.a> f2305g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends J7.a> list) {
            super(0);
            this.f2305g = list;
        }

        @Override // p9.InterfaceC5480a
        public final String invoke() {
            return C2097r.u0(this.f2305g, null, null, null, p.f2301g, 31);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(List<? extends J7.a> list, p9.l<? super List<String>, C1992A> lVar) {
        this.f2303b = list;
        this.f2304c = lVar;
        this.f2302a = C2001h.a(b9.i.NONE, new a(list));
    }

    @Override // H7.j
    public final void a(c cVar) {
        ArrayList arrayList = new ArrayList();
        SQLiteStatement sQLiteStatementT = cVar.t("INSERT OR REPLACE INTO raw_json VALUES (?, ?)");
        for (J7.a aVar : this.f2303b) {
            sQLiteStatementT.bindString(1, aVar.getId());
            String string = aVar.getData().toString();
            kotlin.jvm.internal.l.e(string, "json.data.toString()");
            byte[] bytes = string.getBytes(C5819a.f48359b);
            kotlin.jvm.internal.l.e(bytes, "this as java.lang.String).getBytes(charset)");
            sQLiteStatementT.bindBlob(2, bytes);
            long jExecuteInsert = sQLiteStatementT.executeInsert();
            Long lValueOf = Long.valueOf(jExecuteInsert);
            if (jExecuteInsert >= 0) {
                lValueOf = null;
            }
            if (lValueOf != null) {
                arrayList.add(aVar.getId());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.f2304c.invoke(arrayList);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [b9.g, java.lang.Object] */
    public final String toString() {
        return B8.j(new StringBuilder("Replace raw jsons ("), (String) this.f2302a.getValue(), ')');
    }
}
