package r2;

import androidx.sqlite.db.SupportSQLiteQuery;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: r2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7558a implements SupportSQLiteQuery {

    /* renamed from: c, reason: collision with root package name */
    public static final C2089a f60046c = new C2089a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f60047a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f60048b;

    /* renamed from: r2.a$a, reason: collision with other inner class name */
    public static final class C2089a {
        public /* synthetic */ C2089a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a(g gVar, int i10, Object obj) {
            if (obj == null) {
                gVar.bindNull(i10);
                return;
            }
            if (obj instanceof byte[]) {
                gVar.bindBlob(i10, (byte[]) obj);
                return;
            }
            if (obj instanceof Float) {
                gVar.bindDouble(i10, ((Number) obj).floatValue());
                return;
            }
            if (obj instanceof Double) {
                gVar.bindDouble(i10, ((Number) obj).doubleValue());
                return;
            }
            if (obj instanceof Long) {
                gVar.bindLong(i10, ((Number) obj).longValue());
                return;
            }
            if (obj instanceof Integer) {
                gVar.bindLong(i10, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Short) {
                gVar.bindLong(i10, ((Number) obj).shortValue());
                return;
            }
            if (obj instanceof Byte) {
                gVar.bindLong(i10, ((Number) obj).byteValue());
                return;
            }
            if (obj instanceof String) {
                gVar.bindString(i10, (String) obj);
                return;
            }
            if (obj instanceof Boolean) {
                gVar.bindLong(i10, ((Boolean) obj).booleanValue() ? 1L : 0L);
                return;
            }
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
        }

        public final void b(g statement, Object[] objArr) {
            AbstractC6492s.i(statement, "statement");
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i10 = 0;
            while (i10 < length) {
                Object obj = objArr[i10];
                i10++;
                a(statement, i10, obj);
            }
        }

        private C2089a() {
        }
    }

    public C7558a(String query, Object[] objArr) {
        AbstractC6492s.i(query, "query");
        this.f60047a = query;
        this.f60048b = objArr;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public void a(g statement) {
        AbstractC6492s.i(statement, "statement");
        f60046c.b(statement, this.f60048b);
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public int g() {
        Object[] objArr = this.f60048b;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public String h() {
        return this.f60047a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7558a(String query) {
        this(query, null);
        AbstractC6492s.i(query, "query");
    }
}
