.class public interface abstract Lz/T;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic n(Lz/T;IIIIZILjava/lang/Object;)J
    .locals 6

    if-nez p7, :cond_1

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move v5, p5

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    invoke-interface/range {v0 .. v5}, Lz/T;->g(IIIIZ)J

    move-result-wide p0

    return-wide p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: createConstraints-xF2OJ5Q"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract a(I[I[ILandroidx/compose/ui/layout/m;)V
.end method

.method public abstract d([Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/m;I[III[IIII)LC0/D;
.end method

.method public abstract g(IIIIZ)J
.end method

.method public abstract h(Landroidx/compose/ui/layout/t;)I
.end method

.method public abstract k(Landroidx/compose/ui/layout/t;)I
.end method
