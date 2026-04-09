.class final Landroidx/compose/animation/a$f$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/a$f;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/runtime/snapshots/k;

.field final synthetic b:Ljava/lang/Object;

.field final synthetic c:Landroidx/compose/animation/e;

.field final synthetic d:Lmh/r;


# direct methods
.method constructor <init>(Landroidx/compose/runtime/snapshots/k;Ljava/lang/Object;Landroidx/compose/animation/e;Lmh/r;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/a$f$d;->a:Landroidx/compose/runtime/snapshots/k;

    iput-object p2, p0, Landroidx/compose/animation/a$f$d;->b:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/compose/animation/a$f$d;->c:Landroidx/compose/animation/e;

    iput-object p4, p0, Landroidx/compose/animation/a$f$d;->d:Lmh/r;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lq/e;LT/l;I)V
    .locals 5

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-nez v0, :cond_0

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-interface {p2, p1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr p3, v0

    :cond_2
    and-int/lit8 v0, p3, 0x13

    const/16 v1, 0x12

    if-ne v0, v1, :cond_4

    invoke-interface {p2}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {p2}, LT/l;->C()V

    goto/16 :goto_3

    :cond_4
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, -0x1

    const-string v1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:793)"

    const v2, -0x24ba65ea

    invoke-static {v2, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_5
    iget-object v0, p0, Landroidx/compose/animation/a$f$d;->a:Landroidx/compose/runtime/snapshots/k;

    invoke-interface {p2, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Landroidx/compose/animation/a$f$d;->b:Ljava/lang/Object;

    invoke-interface {p2, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    iget-object v1, p0, Landroidx/compose/animation/a$f$d;->c:Landroidx/compose/animation/e;

    invoke-interface {p2, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    iget-object v1, p0, Landroidx/compose/animation/a$f$d;->a:Landroidx/compose/runtime/snapshots/k;

    iget-object v2, p0, Landroidx/compose/animation/a$f$d;->b:Ljava/lang/Object;

    iget-object v3, p0, Landroidx/compose/animation/a$f$d;->c:Landroidx/compose/animation/e;

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_6

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v4, v0, :cond_7

    :cond_6
    new-instance v4, Landroidx/compose/animation/a$f$d$a;

    invoke-direct {v4, v1, v2, v3}, Landroidx/compose/animation/a$f$d$a;-><init>(Landroidx/compose/runtime/snapshots/k;Ljava/lang/Object;Landroidx/compose/animation/e;)V

    invoke-interface {p2, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    check-cast v4, Lmh/l;

    and-int/lit8 p3, p3, 0xe

    invoke-static {p1, v4, p2, p3}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    iget-object p3, p0, Landroidx/compose/animation/a$f$d;->c:Landroidx/compose/animation/e;

    invoke-virtual {p3}, Landroidx/compose/animation/e;->q()Lo/H;

    move-result-object p3

    iget-object v0, p0, Landroidx/compose/animation/a$f$d;->b:Ljava/lang/Object;

    const-string v1, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p1

    check-cast v1, Lq/f;

    invoke-virtual {v1}, Lq/f;->a()LT/q0;

    move-result-object v1

    invoke-virtual {p3, v0, v1}, Lo/H;->s(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object p3

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne p3, v0, :cond_8

    new-instance p3, Landroidx/compose/animation/c;

    invoke-direct {p3, p1}, Landroidx/compose/animation/c;-><init>(Lq/e;)V

    invoke-interface {p2, p3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    check-cast p3, Landroidx/compose/animation/c;

    iget-object p1, p0, Landroidx/compose/animation/a$f$d;->d:Lmh/r;

    iget-object v0, p0, Landroidx/compose/animation/a$f$d;->b:Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, p3, v0, p2, v1}, Lmh/r;->y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    :goto_3
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/animation/a$f$d;->a(Lq/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
