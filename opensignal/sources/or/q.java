package or;

/* loaded from: classes.dex */
public enum q {
    UBYTEARRAY(qs.b.e("kotlin/UByteArray", false)),
    USHORTARRAY(qs.b.e("kotlin/UShortArray", false)),
    UINTARRAY(qs.b.e("kotlin/UIntArray", false)),
    ULONGARRAY(qs.b.e("kotlin/ULongArray", false));

    private final qs.b classId;
    private final qs.g typeName;

    q(qs.b bVar) {
        this.classId = bVar;
        qs.g gVarI = bVar.i();
        br.l.d(gVarI, "classId.shortClassName");
        this.typeName = gVarI;
    }

    public final qs.g getTypeName() {
        return this.typeName;
    }
}
