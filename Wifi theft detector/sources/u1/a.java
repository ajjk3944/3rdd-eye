package u1;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final String f24485a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f24486b;

    public a(String str, Object[] objArr) {
        this.f24485a = str;
        this.f24486b = objArr;
    }

    public static void a(d dVar, int i10, Object obj) {
        if (obj == null) {
            dVar.R(i10);
            return;
        }
        if (obj instanceof byte[]) {
            dVar.N(i10, (byte[]) obj);
            return;
        }
        if (obj instanceof Float) {
            dVar.c(i10, ((Float) obj).floatValue());
            return;
        }
        if (obj instanceof Double) {
            dVar.c(i10, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Long) {
            dVar.s(i10, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof Integer) {
            dVar.s(i10, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Short) {
            dVar.s(i10, ((Short) obj).shortValue());
            return;
        }
        if (obj instanceof Byte) {
            dVar.s(i10, ((Byte) obj).byteValue());
            return;
        }
        if (obj instanceof String) {
            dVar.i(i10, (String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            dVar.s(i10, ((Boolean) obj).booleanValue() ? 1L : 0L);
            return;
        }
        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: null, byte[], float, double, long, int, short, byte, string");
    }

    public static void b(d dVar, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i10 = 0;
        while (i10 < length) {
            Object obj = objArr[i10];
            i10++;
            a(dVar, i10, obj);
        }
    }

    @Override // u1.e
    public String d() {
        return this.f24485a;
    }

    @Override // u1.e
    public void e(d dVar) {
        b(dVar, this.f24486b);
    }

    public a(String str) {
        this(str, null);
    }
}
