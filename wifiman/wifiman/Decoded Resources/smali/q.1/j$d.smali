.class final Lq/j$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq/j;->b(Lr/o0;Landroidx/compose/ui/e;Lr/H;Lmh/l;Lmh/q;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lr/o0;

.field final synthetic b:Lr/H;

.field final synthetic c:Ljava/lang/Object;

.field final synthetic d:Lmh/q;


# direct methods
.method constructor <init>(Lr/o0;Lr/H;Ljava/lang/Object;Lmh/q;)V
    .locals 0

    iput-object p1, p0, Lq/j$d;->a:Lr/o0;

    iput-object p2, p0, Lq/j$d;->b:Lr/H;

    iput-object p3, p0, Lq/j$d;->c:Ljava/lang/Object;

    iput-object p4, p0, Lq/j$d;->d:Lmh/q;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method

.method public static final synthetic a(LT/z1;)F
    .locals 0

    invoke-static {p0}, Lq/j$d;->h(LT/z1;)F

    move-result p0

    return p0
.end method

.method private static final h(LT/z1;)F
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method


# virtual methods
.method public final c(LT/l;I)V
    .locals 12

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto/16 :goto_3

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    const/4 v1, -0x1

    if-eqz v0, :cond_2

    const v0, -0x55057628

    const-string v2, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous> (Crossfade.kt:127)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v3, p0, Lq/j$d;->a:Lr/o0;

    new-instance p2, Lq/j$d$b;

    iget-object v0, p0, Lq/j$d;->b:Lr/H;

    invoke-direct {p2, v0}, Lq/j$d$b;-><init>(Lr/H;)V

    iget-object v0, p0, Lq/j$d;->c:Ljava/lang/Object;

    sget-object v2, Lkotlin/jvm/internal/l;->a:Lkotlin/jvm/internal/l;

    invoke-static {v2}, Lr/u0;->f(Lkotlin/jvm/internal/l;)Lr/s0;

    move-result-object v7

    invoke-virtual {v3}, Lr/o0;->i()Ljava/lang/Object;

    move-result-object v2

    const v4, -0x1a25b2ec

    invoke-interface {p1, v4}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v5

    const-string v6, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:129)"

    const/4 v11, 0x0

    if-eqz v5, :cond_3

    invoke-static {v4, v11, v1, v6}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_3
    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v5, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    if-eqz v2, :cond_4

    move v2, v8

    goto :goto_1

    :cond_4
    move v2, v5

    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    invoke-interface {p1}, LT/l;->J()V

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v3}, Lr/o0;->p()Ljava/lang/Object;

    move-result-object v9

    invoke-interface {p1, v4}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-static {v4, v11, v1, v6}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    move v5, v8

    :cond_7
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
    invoke-interface {p1}, LT/l;->J()V

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-virtual {v3}, Lr/o0;->n()Lr/o0$b;

    move-result-object v0

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, p1, v1}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    move-object v6, p2

    check-cast v6, Lr/H;

    const/4 v10, 0x0

    const-string v8, "FloatAnimation"

    move-object v4, v2

    move-object v9, p1

    invoke-static/range {v3 .. v10}, Lr/p0;->d(Lr/o0;Ljava/lang/Object;Ljava/lang/Object;Lr/H;Lr/s0;Ljava/lang/String;LT/l;I)LT/z1;

    move-result-object p2

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-interface {p1, p2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_9

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_a

    :cond_9
    new-instance v2, Lq/j$d$a;

    invoke-direct {v2, p2}, Lq/j$d$a;-><init>(LT/z1;)V

    invoke-interface {p1, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_a
    check-cast v2, Lmh/l;

    invoke-static {v0, v2}, Landroidx/compose/ui/graphics/b;->a(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object p2

    iget-object v0, p0, Lq/j$d;->d:Lmh/q;

    iget-object v1, p0, Lq/j$d;->c:Ljava/lang/Object;

    sget-object v2, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v2}, Lf0/c$a;->o()Lf0/c;

    move-result-object v2

    invoke-static {v2, v11}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v2

    invoke-static {p1, v11}, LT/j;->a(LT/l;I)I

    move-result v3

    invoke-interface {p1}, LT/l;->G()LT/x;

    move-result-object v4

    invoke-static {p1, p2}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p2

    sget-object v5, LE0/g;->K:LE0/g$a;

    invoke-virtual {v5}, LE0/g$a;->a()Lmh/a;

    move-result-object v6

    invoke-interface {p1}, LT/l;->x()LT/f;

    move-result-object v7

    if-nez v7, :cond_b

    invoke-static {}, LT/j;->c()V

    :cond_b
    invoke-interface {p1}, LT/l;->u()V

    invoke-interface {p1}, LT/l;->o()Z

    move-result v7

    if-eqz v7, :cond_c

    invoke-interface {p1, v6}, LT/l;->D(Lmh/a;)V

    goto :goto_2

    :cond_c
    invoke-interface {p1}, LT/l;->I()V

    :goto_2
    invoke-static {p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v6

    invoke-virtual {v5}, LE0/g$a;->e()Lmh/p;

    move-result-object v7

    invoke-static {v6, v2, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v5}, LE0/g$a;->g()Lmh/p;

    move-result-object v2

    invoke-static {v6, v4, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v5}, LE0/g$a;->b()Lmh/p;

    move-result-object v2

    invoke-interface {v6}, LT/l;->o()Z

    move-result v4

    if-nez v4, :cond_d

    invoke-interface {v6}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_e

    :cond_d
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v6, v4}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v6, v3, v2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_e
    invoke-virtual {v5}, LE0/g$a;->f()Lmh/p;

    move-result-object v2

    invoke-static {v6, p2, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object p2, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v0, v1, p1, p2}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_f

    invoke-static {}, LT/o;->P()V

    :cond_f
    :goto_3
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lq/j$d;->c(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
