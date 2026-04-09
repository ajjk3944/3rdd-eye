.class public abstract Landroidx/compose/foundation/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LT/H0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Landroidx/compose/foundation/j$a;->a:Landroidx/compose/foundation/j$a;

    invoke-static {v0}, LT/w;->f(Lmh/a;)LT/H0;

    move-result-object v0

    sput-object v0, Landroidx/compose/foundation/j;->a:LT/H0;

    return-void
.end method

.method public static final a()LT/H0;
    .locals 1

    sget-object v0, Landroidx/compose/foundation/j;->a:LT/H0;

    return-object v0
.end method

.method public static final b(Landroidx/compose/ui/e;Ly/k;Ls/G;)Landroidx/compose/ui/e;
    .locals 2

    if-nez p2, :cond_0

    return-object p0

    :cond_0
    instance-of v0, p2, Ls/I;

    if-eqz v0, :cond_1

    new-instance v0, Landroidx/compose/foundation/IndicationModifierElement;

    check-cast p2, Ls/I;

    invoke-direct {v0, p1, p2}, Landroidx/compose/foundation/IndicationModifierElement;-><init>(Ly/k;Ls/I;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {}, Landroidx/compose/ui/platform/z0;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Landroidx/compose/foundation/j$b;

    invoke-direct {v0, p1, p2}, Landroidx/compose/foundation/j$b;-><init>(Ly/k;Ls/G;)V

    goto :goto_0

    :cond_2
    invoke-static {}, Landroidx/compose/ui/platform/z0;->a()Lmh/l;

    move-result-object v0

    :goto_0
    new-instance v1, Landroidx/compose/foundation/j$c;

    invoke-direct {v1, p2, p1}, Landroidx/compose/foundation/j$c;-><init>(Ls/G;Ly/k;)V

    invoke-static {p0, v0, v1}, Landroidx/compose/ui/c;->b(Landroidx/compose/ui/e;Lmh/l;Lmh/q;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method
