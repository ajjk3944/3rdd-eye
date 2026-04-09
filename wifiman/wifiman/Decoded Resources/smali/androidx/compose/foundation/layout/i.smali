.class public abstract Landroidx/compose/foundation/layout/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/compose/ui/e;Lz/J;)Landroidx/compose/ui/e;
    .locals 3

    new-instance v0, Landroidx/compose/foundation/layout/IntrinsicHeightElement;

    invoke-static {}, Landroidx/compose/ui/platform/z0;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Landroidx/compose/foundation/layout/i$a;

    invoke-direct {v1, p1}, Landroidx/compose/foundation/layout/i$a;-><init>(Lz/J;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/z0;->a()Lmh/l;

    move-result-object v1

    :goto_0
    const/4 v2, 0x1

    invoke-direct {v0, p1, v2, v1}, Landroidx/compose/foundation/layout/IntrinsicHeightElement;-><init>(Lz/J;ZLmh/l;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;Lz/J;)Landroidx/compose/ui/e;
    .locals 3

    new-instance v0, Landroidx/compose/foundation/layout/IntrinsicWidthElement;

    invoke-static {}, Landroidx/compose/ui/platform/z0;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Landroidx/compose/foundation/layout/i$b;

    invoke-direct {v1, p1}, Landroidx/compose/foundation/layout/i$b;-><init>(Lz/J;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/z0;->a()Lmh/l;

    move-result-object v1

    :goto_0
    const/4 v2, 0x1

    invoke-direct {v0, p1, v2, v1}, Landroidx/compose/foundation/layout/IntrinsicWidthElement;-><init>(Lz/J;ZLmh/l;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method
