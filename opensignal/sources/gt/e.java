package gt;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class e extends j {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9646x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(l lVar, ConcurrentHashMap concurrentHashMap, ar.k kVar, int i10) {
        super(lVar, concurrentHashMap, kVar, 0);
        this.f9646x = i10;
    }

    public static /* synthetic */ void e(int i10) {
        String str = i10 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 3 ? 3 : 2];
        if (i10 == 1) {
            objArr[0] = "map";
        } else if (i10 == 2) {
            objArr[0] = "computation";
        } else if (i10 != 3) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
        }
        if (i10 != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
        } else {
            objArr[1] = "computeIfAbsent";
        }
        if (i10 == 2) {
            objArr[2] = "computeIfAbsent";
        } else if (i10 != 3) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 == 3) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // gt.j, ar.k
    public Object a(Object obj) throws Throwable {
        switch (this.f9646x) {
            case 1:
                Object objA = super.a(obj);
                if (objA != null) {
                    return objA;
                }
                throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull", "invoke"));
            default:
                return super.a(obj);
        }
    }
}
