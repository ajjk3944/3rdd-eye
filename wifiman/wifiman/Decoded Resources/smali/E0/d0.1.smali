.class public abstract LE0/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(LE0/j;II)Landroidx/compose/ui/e$c;
    .locals 0

    invoke-static {p0, p1, p2}, LE0/d0;->b(LE0/j;II)Landroidx/compose/ui/e$c;

    move-result-object p0

    return-object p0
.end method

.method private static final b(LE0/j;II)Landroidx/compose/ui/e$c;
    .locals 3

    invoke-interface {p0}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->a2()I

    move-result v1

    and-int/2addr v1, p1

    if-nez v1, :cond_1

    return-object v0

    :cond_1
    :goto_0
    if-eqz p0, :cond_4

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->f2()I

    move-result v1

    and-int v2, v1, p2

    if-eqz v2, :cond_2

    return-object v0

    :cond_2
    and-int/2addr v1, p1

    if-eqz v1, :cond_3

    return-object p0

    :cond_3
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object p0

    goto :goto_0

    :cond_4
    return-object v0
.end method
