.class final LN/O0$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/O0;->a(Landroidx/compose/ui/e;Lm0/i1;JJLs/g;FLmh/p;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/e;

.field final synthetic b:Lm0/i1;

.field final synthetic c:J

.field final synthetic d:F

.field final synthetic e:Ls/g;

.field final synthetic f:F

.field final synthetic g:Lmh/p;


# direct methods
.method constructor <init>(Landroidx/compose/ui/e;Lm0/i1;JFLs/g;FLmh/p;)V
    .locals 0

    iput-object p1, p0, LN/O0$a;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LN/O0$a;->b:Lm0/i1;

    iput-wide p3, p0, LN/O0$a;->c:J

    iput p5, p0, LN/O0$a;->d:F

    iput-object p6, p0, LN/O0$a;->e:Ls/g;

    iput p7, p0, LN/O0$a;->f:F

    iput-object p8, p0, LN/O0$a;->g:Lmh/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 11

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:114)"

    const v2, -0x6c9bf7c6

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v3, p0, LN/O0$a;->a:Landroidx/compose/ui/e;

    iget-object v4, p0, LN/O0$a;->b:Lm0/i1;

    iget-wide v5, p0, LN/O0$a;->c:J

    invoke-static {}, LN/N;->d()LT/H0;

    move-result-object p2

    invoke-interface {p1, p2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p2

    move-object v7, p2

    check-cast v7, LN/M;

    iget v8, p0, LN/O0$a;->d:F

    const/4 v10, 0x0

    move-object v9, p1

    invoke-static/range {v5 .. v10}, LN/O0;->d(JLN/M;FLT/l;I)J

    move-result-wide v5

    iget-object v7, p0, LN/O0$a;->e:Ls/g;

    iget v8, p0, LN/O0$a;->f:F

    invoke-static/range {v3 .. v8}, LN/O0;->c(Landroidx/compose/ui/e;Lm0/i1;JLs/g;F)Landroidx/compose/ui/e;

    move-result-object p2

    sget-object v0, LN/O0$a$a;->a:LN/O0$a$a;

    const/4 v1, 0x0

    invoke-static {p2, v1, v0}, LJ0/m;->b(Landroidx/compose/ui/e;ZLmh/l;)Landroidx/compose/ui/e;

    move-result-object p2

    sget-object v0, LYg/J;->a:LYg/J;

    new-instance v2, LN/O0$a$b;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, LN/O0$a$b;-><init>(Ldh/e;)V

    invoke-static {p2, v0, v2}, Ly0/P;->d(Landroidx/compose/ui/e;Ljava/lang/Object;Lmh/p;)Landroidx/compose/ui/e;

    move-result-object p2

    iget-object v0, p0, LN/O0$a;->g:Lmh/p;

    sget-object v2, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v2}, Lf0/c$a;->o()Lf0/c;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v2

    invoke-static {p1, v1}, LT/j;->a(LT/l;I)I

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

    if-nez v7, :cond_3

    invoke-static {}, LT/j;->c()V

    :cond_3
    invoke-interface {p1}, LT/l;->u()V

    invoke-interface {p1}, LT/l;->o()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {p1, v6}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_4
    invoke-interface {p1}, LT/l;->I()V

    :goto_1
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

    if-nez v4, :cond_5

    invoke-interface {v6}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    :cond_5
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v6, v4}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v6, v3, v2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_6
    invoke-virtual {v5}, LE0/g$a;->f()Lmh/p;

    move-result-object v2

    invoke-static {v6, p2, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object p2, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    :goto_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LN/O0$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
