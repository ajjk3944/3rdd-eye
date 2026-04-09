package as;

/* loaded from: classes.dex */
public enum h0 {
    ONE_COLLECTION_PARAMETER("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
    OBJECT_PARAMETER_NON_GENERIC(null, true),
    OBJECT_PARAMETER_GENERIC("Ljava/lang/Object;", true);

    private final boolean isObjectReplacedWithTypeParameter;
    private final String valueParametersSignature;

    h0(String str, boolean z10) {
        this.valueParametersSignature = str;
        this.isObjectReplacedWithTypeParameter = z10;
    }
}
