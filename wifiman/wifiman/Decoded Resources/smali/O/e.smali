.class public abstract LO/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(LO/g;FLdh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, LO/e;->d(LO/g;FLdh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;LO/g;Z)Landroidx/compose/ui/e;
    .locals 2

    new-instance v0, LO/e$a;

    invoke-direct {v0, p1}, LO/e$a;-><init>(Ljava/lang/Object;)V

    new-instance v1, LO/e$b;

    invoke-direct {v1, p1}, LO/e$b;-><init>(Ljava/lang/Object;)V

    invoke-static {p0, v0, v1, p2}, LO/e;->c(Landroidx/compose/ui/e;Lmh/l;Lmh/p;Z)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/e;Lmh/l;Lmh/p;Z)Landroidx/compose/ui/e;
    .locals 1

    new-instance v0, LO/f;

    invoke-direct {v0, p1, p2, p3}, LO/f;-><init>(Lmh/l;Lmh/p;Z)V

    const/4 p1, 0x0

    const/4 p2, 0x2

    invoke-static {p0, v0, p1, p2, p1}, Landroidx/compose/ui/input/nestedscroll/a;->b(Landroidx/compose/ui/e;Lx0/a;Lx0/b;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

.method private static final synthetic d(LO/g;FLdh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LO/g;->r(F)F

    move-result p0

    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/b;->c(F)Ljava/lang/Float;

    move-result-object p0

    return-object p0
.end method
