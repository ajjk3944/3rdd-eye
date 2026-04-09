package or;

/* loaded from: classes.dex */
public enum r {
    UBYTE(qs.b.e("kotlin/UByte", false)),
    USHORT(qs.b.e("kotlin/UShort", false)),
    UINT(qs.b.e("kotlin/UInt", false)),
    ULONG(qs.b.e("kotlin/ULong", false));

    private final qs.b arrayClassId;
    private final qs.b classId;
    private final qs.g typeName;

    r(qs.b bVar) {
        this.classId = bVar;
        qs.g gVarI = bVar.i();
        br.l.d(gVarI, "classId.shortClassName");
        this.typeName = gVarI;
        this.arrayClassId = new qs.b(bVar.g(), qs.g.e(gVarI.b() + "Array"));
    }

    public final qs.b getArrayClassId() {
        return this.arrayClassId;
    }

    public final qs.b getClassId() {
        return this.classId;
    }

    public final qs.g getTypeName() {
        return this.typeName;
    }
}
