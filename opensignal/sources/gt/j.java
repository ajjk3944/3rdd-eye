package gt;

/* loaded from: classes.dex */
public class j implements ar.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9652a;

    /* renamed from: d, reason: collision with root package name */
    public final Object f9653d;

    /* renamed from: g, reason: collision with root package name */
    public final Object f9654g;

    /* renamed from: r, reason: collision with root package name */
    public final Object f9655r;

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i10) {
        this.f9652a = i10;
        this.f9653d = obj;
        this.f9654g = obj2;
        this.f9655r = obj3;
    }

    public static /* synthetic */ void e(int i10) {
        String str = (i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 3 || i10 == 4) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "map";
        } else if (i10 == 2) {
            objArr[0] = "compute";
        } else if (i10 == 3 || i10 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[0] = "storageManager";
        }
        if (i10 == 3) {
            objArr[1] = "recursionDetected";
        } else if (i10 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[1] = "raceCondition";
        }
        if (i10 != 3 && i10 != 4) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 3 && i10 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009e A[Catch: all -> 0x0097, PHI: r4
  0x009e: PHI (r4v2 java.lang.Object) = (r4v1 java.lang.Object), (r4v10 java.lang.Object) binds: [B:29:0x0083, B:33:0x008f] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0097, blocks: (B:27:0x007a, B:30:0x0085, B:32:0x008d, B:34:0x0091, B:38:0x009a, B:39:0x009d, B:40:0x009e, B:42:0x00a2, B:44:0x00a8, B:46:0x00ac, B:47:0x00af, B:48:0x00b2, B:50:0x00b5, B:64:0x00d9, B:67:0x00e1, B:69:0x00ee, B:70:0x00f2, B:71:0x00f3, B:72:0x00f6, B:73:0x00f7, B:74:0x00fa, B:75:0x00fb, B:76:0x0100, B:53:0x00bc, B:57:0x00cb, B:61:0x00d3, B:62:0x00d7), top: B:79:0x007a, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b3  */
    @Override // ar.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gt.j.a(java.lang.Object):java.lang.Object");
    }

    public AssertionError g(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + ((l) this.f9653d));
        l.e(assertionError);
        return assertionError;
    }
}
