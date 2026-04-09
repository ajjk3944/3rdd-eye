package F1;

/* compiled from: SimpleSQLiteQuery.android.kt */
/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: b, reason: collision with root package name */
    public final String f1576b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f1577c;

    /* compiled from: SimpleSQLiteQuery.android.kt */
    /* renamed from: F1.a$a, reason: collision with other inner class name */
    public static final class C0025a {
        public static void a(d dVar, Object[] objArr) {
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                if (obj == null) {
                    dVar.f(i);
                } else if (obj instanceof byte[]) {
                    dVar.b0(i, (byte[]) obj);
                } else if (obj instanceof Float) {
                    dVar.p(i, ((Number) obj).floatValue());
                } else if (obj instanceof Double) {
                    dVar.p(i, ((Number) obj).doubleValue());
                } else if (obj instanceof Long) {
                    dVar.b(i, ((Number) obj).longValue());
                } else if (obj instanceof Integer) {
                    dVar.b(i, ((Number) obj).intValue());
                } else if (obj instanceof Short) {
                    dVar.b(i, ((Number) obj).shortValue());
                } else if (obj instanceof Byte) {
                    dVar.b(i, ((Number) obj).byteValue());
                } else if (obj instanceof String) {
                    dVar.h(i, (String) obj);
                } else {
                    if (!(obj instanceof Boolean)) {
                        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                    }
                    dVar.b(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
                }
            }
        }
    }

    public a(String str) {
        this.f1576b = str;
        this.f1577c = null;
    }

    @Override // F1.e
    public final void a(d dVar) {
        C0025a.a(dVar, this.f1577c);
    }

    @Override // F1.e
    public final String c() {
        return this.f1576b;
    }

    public a(String str, Object[] objArr) {
        this.f1576b = str;
        this.f1577c = objArr;
    }
}
