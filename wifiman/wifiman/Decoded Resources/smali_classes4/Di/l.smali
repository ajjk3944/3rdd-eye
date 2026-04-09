.class public abstract LDi/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(II)I
    .locals 0

    shr-int/2addr p0, p1

    and-int/lit8 p0, p0, 0x1f

    return p0
.end method

.method public static final b()LCi/f;
    .locals 1

    sget-object v0, LDi/j;->c:LDi/j$a;

    invoke-virtual {v0}, LDi/j$a;->a()LDi/j;

    move-result-object v0

    return-object v0
.end method

.method public static final c(I)I
    .locals 0

    add-int/lit8 p0, p0, -0x1

    and-int/lit8 p0, p0, -0x20

    return p0
.end method
