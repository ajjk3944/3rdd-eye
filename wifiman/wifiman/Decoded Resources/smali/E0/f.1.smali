.class abstract LE0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a([I)[I
    .locals 0

    return-object p0
.end method

.method public static final b([II)I
    .locals 1

    invoke-static {p0}, LE0/f;->c([I)I

    move-result v0

    add-int/2addr p1, v0

    aget p0, p0, p1

    return p0
.end method

.method private static final c([I)I
    .locals 0

    array-length p0, p0

    div-int/lit8 p0, p0, 0x2

    return p0
.end method

.method public static final d([III)V
    .locals 1

    invoke-static {p0}, LE0/f;->c([I)I

    move-result v0

    add-int/2addr p1, v0

    aput p2, p0, p1

    return-void
.end method
