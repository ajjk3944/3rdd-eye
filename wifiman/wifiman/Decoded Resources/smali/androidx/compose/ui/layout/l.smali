.class public abstract Landroidx/compose/ui/layout/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lmh/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Landroidx/compose/ui/layout/l$e;->a:Landroidx/compose/ui/layout/l$e;

    sput-object v0, Landroidx/compose/ui/layout/l;->a:Lmh/p;

    return-void
.end method

.method public static final a(Lmh/q;LT/l;I)V
    .locals 4

    const v0, -0x4041fd34

    invoke-interface {p1, v0}, LT/l;->r(I)LT/l;

    move-result-object p1

    and-int/lit8 v1, p2, 0x6

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-interface {p1, p0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, p2

    goto :goto_1

    :cond_1
    move v1, p2

    :goto_1
    and-int/lit8 v3, v1, 0x3

    if-ne v3, v2, :cond_3

    invoke-interface {p1}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p1}, LT/l;->C()V

    goto :goto_4

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x1

    const-string v3, "androidx.compose.ui.layout.LookaheadScope (LookaheadScope.kt:50)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_5

    new-instance v0, Landroidx/compose/ui/layout/k;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v3, v2, v3}, Landroidx/compose/ui/layout/k;-><init>(Lmh/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    check-cast v0, Landroidx/compose/ui/layout/k;

    sget-object v2, Landroidx/compose/ui/layout/l$a;->a:Landroidx/compose/ui/layout/l$a;

    invoke-interface {p1}, LT/l;->x()LT/f;

    move-result-object v3

    if-nez v3, :cond_6

    invoke-static {}, LT/j;->c()V

    :cond_6
    invoke-interface {p1}, LT/l;->u()V

    invoke-interface {p1}, LT/l;->o()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {p1, v2}, LT/l;->D(Lmh/a;)V

    goto :goto_3

    :cond_7
    invoke-interface {p1}, LT/l;->I()V

    :goto_3
    invoke-static {p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v2

    sget-object v3, Landroidx/compose/ui/layout/l$b;->a:Landroidx/compose/ui/layout/l$b;

    invoke-static {v2, v3}, LT/E1;->b(LT/l;Lmh/l;)V

    sget-object v3, Landroidx/compose/ui/layout/l$c;->a:Landroidx/compose/ui/layout/l$c;

    invoke-static {v2, v0, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    shl-int/lit8 v1, v1, 0x3

    and-int/lit8 v1, v1, 0x70

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, p1, v1}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
    :goto_4
    invoke-interface {p1}, LT/l;->z()LT/X0;

    move-result-object p1

    if-eqz p1, :cond_9

    new-instance v0, Landroidx/compose/ui/layout/l$d;

    invoke-direct {v0, p0, p2}, Landroidx/compose/ui/layout/l$d;-><init>(Lmh/q;I)V

    invoke-interface {p1, v0}, LT/X0;->a(Lmh/p;)V

    :cond_9
    return-void
.end method

.method public static final b(Landroidx/compose/ui/e;Lmh/l;Lmh/p;Lmh/q;)Landroidx/compose/ui/e;
    .locals 1

    new-instance v0, Landroidx/compose/ui/layout/ApproachLayoutElement;

    invoke-direct {v0, p3, p1, p2}, Landroidx/compose/ui/layout/ApproachLayoutElement;-><init>(Lmh/q;Lmh/l;Lmh/p;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/e;Lmh/l;Lmh/p;Lmh/q;ILjava/lang/Object;)Landroidx/compose/ui/e;
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    sget-object p2, Landroidx/compose/ui/layout/l;->a:Lmh/p;

    :cond_0
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/ui/layout/l;->b(Landroidx/compose/ui/e;Lmh/l;Lmh/p;Lmh/q;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method
