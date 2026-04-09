.class final Landroidx/compose/animation/a$f;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/a;->b(Lr/o0;Landroidx/compose/ui/e;Lmh/l;Lf0/c;Lmh/l;Lmh/r;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lr/o0;

.field final synthetic b:Ljava/lang/Object;

.field final synthetic c:Lmh/l;

.field final synthetic d:Landroidx/compose/animation/e;

.field final synthetic e:Landroidx/compose/runtime/snapshots/k;

.field final synthetic f:Lmh/r;


# direct methods
.method constructor <init>(Lr/o0;Ljava/lang/Object;Lmh/l;Landroidx/compose/animation/e;Landroidx/compose/runtime/snapshots/k;Lmh/r;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/a$f;->a:Lr/o0;

    iput-object p2, p0, Landroidx/compose/animation/a$f;->b:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/compose/animation/a$f;->c:Lmh/l;

    iput-object p4, p0, Landroidx/compose/animation/a$f;->d:Landroidx/compose/animation/e;

    iput-object p5, p0, Landroidx/compose/animation/a$f;->e:Landroidx/compose/runtime/snapshots/k;

    iput-object p6, p0, Landroidx/compose/animation/a$f;->f:Lmh/r;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 12

    and-int/lit8 v1, p2, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto/16 :goto_3

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:757)"

    const v3, 0x34c9ce26

    invoke-static {v3, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v0, p0, Landroidx/compose/animation/a$f;->c:Lmh/l;

    iget-object v1, p0, Landroidx/compose/animation/a$f;->d:Landroidx/compose/animation/e;

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v2, v4, :cond_3

    invoke-interface {v0, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lq/i;

    invoke-interface {p1, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    check-cast v2, Lq/i;

    iget-object v0, p0, Landroidx/compose/animation/a$f;->a:Lr/o0;

    invoke-virtual {v0}, Lr/o0;->n()Lr/o0$b;

    move-result-object v0

    invoke-interface {v0}, Lr/o0$b;->f()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/animation/a$f;->b:Ljava/lang/Object;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p1, v0}, LT/l;->c(Z)Z

    move-result v0

    iget-object v1, p0, Landroidx/compose/animation/a$f;->a:Lr/o0;

    iget-object v4, p0, Landroidx/compose/animation/a$f;->b:Ljava/lang/Object;

    iget-object v5, p0, Landroidx/compose/animation/a$f;->c:Lmh/l;

    iget-object v6, p0, Landroidx/compose/animation/a$f;->d:Landroidx/compose/animation/e;

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v0, :cond_4

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v7, v0, :cond_6

    :cond_4
    invoke-virtual {v1}, Lr/o0;->n()Lr/o0$b;

    move-result-object v0

    invoke-interface {v0}, Lr/o0$b;->f()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Landroidx/compose/animation/k;->a:Landroidx/compose/animation/k$a;

    invoke-virtual {v0}, Landroidx/compose/animation/k$a;->a()Landroidx/compose/animation/k;

    move-result-object v0

    :goto_1
    move-object v7, v0

    goto :goto_2

    :cond_5
    invoke-interface {v5, v6}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq/i;

    invoke-virtual {v0}, Lq/i;->a()Landroidx/compose/animation/k;

    move-result-object v0

    goto :goto_1

    :goto_2
    invoke-interface {p1, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    move-object v4, v7

    check-cast v4, Landroidx/compose/animation/k;

    iget-object v0, p0, Landroidx/compose/animation/a$f;->b:Ljava/lang/Object;

    iget-object v1, p0, Landroidx/compose/animation/a$f;->a:Lr/o0;

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v5, v6, :cond_7

    new-instance v5, Landroidx/compose/animation/e$a;

    invoke-virtual {v1}, Lr/o0;->p()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    invoke-direct {v5, v0}, Landroidx/compose/animation/e$a;-><init>(Z)V

    invoke-interface {p1, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    check-cast v5, Landroidx/compose/animation/e$a;

    invoke-virtual {v2}, Lq/i;->c()Landroidx/compose/animation/i;

    move-result-object v6

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-interface {p1, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v1, :cond_8

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v7, v1, :cond_9

    :cond_8
    new-instance v7, Landroidx/compose/animation/a$f$a;

    invoke-direct {v7, v2}, Landroidx/compose/animation/a$f$a;-><init>(Lq/i;)V

    invoke-interface {p1, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_9
    check-cast v7, Lmh/q;

    invoke-static {v0, v7}, Landroidx/compose/ui/layout/g;->a(Landroidx/compose/ui/e;Lmh/q;)Landroidx/compose/ui/e;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/animation/a$f;->b:Ljava/lang/Object;

    iget-object v2, p0, Landroidx/compose/animation/a$f;->a:Lr/o0;

    invoke-virtual {v2}, Lr/o0;->p()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v5, v1}, Landroidx/compose/animation/e$a;->c(Z)V

    invoke-interface {v0, v5}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    iget-object v0, p0, Landroidx/compose/animation/a$f;->a:Lr/o0;

    iget-object v1, p0, Landroidx/compose/animation/a$f;->b:Ljava/lang/Object;

    invoke-interface {p1, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    iget-object v5, p0, Landroidx/compose/animation/a$f;->b:Ljava/lang/Object;

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v1, :cond_a

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v7, v1, :cond_b

    :cond_a
    new-instance v7, Landroidx/compose/animation/a$f$b;

    invoke-direct {v7, v5}, Landroidx/compose/animation/a$f$b;-><init>(Ljava/lang/Object;)V

    invoke-interface {p1, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    move-object v1, v7

    check-cast v1, Lmh/l;

    invoke-interface {p1, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_c

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v7, v3, :cond_d

    :cond_c
    new-instance v7, Landroidx/compose/animation/a$f$c;

    invoke-direct {v7, v4}, Landroidx/compose/animation/a$f$c;-><init>(Landroidx/compose/animation/k;)V

    invoke-interface {p1, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_d
    move-object v5, v7

    check-cast v5, Lmh/p;

    new-instance v3, Landroidx/compose/animation/a$f$d;

    iget-object v7, p0, Landroidx/compose/animation/a$f;->e:Landroidx/compose/runtime/snapshots/k;

    iget-object v9, p0, Landroidx/compose/animation/a$f;->b:Ljava/lang/Object;

    iget-object v10, p0, Landroidx/compose/animation/a$f;->d:Landroidx/compose/animation/e;

    iget-object v11, p0, Landroidx/compose/animation/a$f;->f:Lmh/r;

    invoke-direct {v3, v7, v9, v10, v11}, Landroidx/compose/animation/a$f$d;-><init>(Landroidx/compose/runtime/snapshots/k;Ljava/lang/Object;Landroidx/compose/animation/e;Lmh/r;)V

    const/16 v7, 0x36

    const v9, -0x24ba65ea

    const/4 v10, 0x1

    invoke-static {v9, v10, v3, p1, v7}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    const/high16 v9, 0xc00000

    const/16 v10, 0x40

    const/4 v11, 0x0

    move-object v3, v6

    move-object v6, v11

    move-object v8, p1

    invoke-static/range {v0 .. v10}, Lq/d;->a(Lr/o0;Lmh/l;Landroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Lmh/p;Lq/s;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {}, LT/o;->P()V

    :cond_e
    :goto_3
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/animation/a$f;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
