.class public abstract Landroidx/compose/foundation/layout/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;
    .locals 3

    new-instance v0, Landroidx/compose/foundation/layout/OffsetPxElement;

    new-instance v1, Landroidx/compose/foundation/layout/l$b;

    invoke-direct {v1, p1}, Landroidx/compose/foundation/layout/l$b;-><init>(Lmh/l;)V

    const/4 v2, 0x1

    invoke-direct {v0, p1, v2, v1}, Landroidx/compose/foundation/layout/OffsetPxElement;-><init>(Lmh/l;ZLmh/l;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;
    .locals 7

    new-instance v6, Landroidx/compose/foundation/layout/OffsetElement;

    new-instance v4, Landroidx/compose/foundation/layout/l$a;

    invoke-direct {v4, p1, p2}, Landroidx/compose/foundation/layout/l$a;-><init>(FF)V

    const/4 v5, 0x0

    const/4 v3, 0x1

    move-object v0, v6

    move v1, p1

    move v2, p2

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/layout/OffsetElement;-><init>(FFZLmh/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v6}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    int-to-float p1, v0

    invoke-static {p1}, LY0/h;->j(F)F

    move-result p1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    int-to-float p2, v0

    invoke-static {p2}, LY0/h;->j(F)F

    move-result p2

    :cond_1
    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/layout/l;->b(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method
