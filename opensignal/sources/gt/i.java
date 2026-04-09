package gt;

/* loaded from: classes.dex */
public class i extends h implements m {
    @Override // gt.h, ar.a
    public final Object c() throws Throwable {
        Object objC = super.c();
        if (objC != null) {
            return objC;
        }
        throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue", "invoke"));
    }
}
