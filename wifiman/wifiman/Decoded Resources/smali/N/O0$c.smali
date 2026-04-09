.class final LN/O0$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/O0;->b(Lmh/a;Landroidx/compose/ui/e;ZLm0/i1;JJLs/g;FLy/m;Lmh/p;LT/l;II)V
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

.field final synthetic g:Ly/m;

.field final synthetic h:Z

.field final synthetic i:Lmh/a;

.field final synthetic j:Lmh/p;


# direct methods
.method constructor <init>(Landroidx/compose/ui/e;Lm0/i1;JFLs/g;FLy/m;ZLmh/a;Lmh/p;)V
    .locals 0

    iput-object p1, p0, LN/O0$c;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LN/O0$c;->b:Lm0/i1;

    iput-wide p3, p0, LN/O0$c;->c:J

    iput p5, p0, LN/O0$c;->d:F

    iput-object p6, p0, LN/O0$c;->e:Ls/g;

    iput p7, p0, LN/O0$c;->f:F

    iput-object p8, p0, LN/O0$c;->g:Ly/m;

    iput-boolean p9, p0, LN/O0$c;->h:Z

    iput-object p10, p0, LN/O0$c;->i:Lmh/a;

    iput-object p11, p0, LN/O0$c;->j:Lmh/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v8, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    invoke-interface/range {p1 .. p1}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LT/l;->C()V

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "androidx.compose.material.Surface.<anonymous> (Surface.kt:224)"

    const v4, 0x7916180d

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, LN/O0$c;->a:Landroidx/compose/ui/e;

    invoke-static {v1}, LN/c0;->d(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v7

    iget-object v9, v0, LN/O0$c;->b:Lm0/i1;

    iget-wide v1, v0, LN/O0$c;->c:J

    invoke-static {}, LN/N;->d()LT/H0;

    move-result-object v3

    invoke-interface {v8, v3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LN/M;

    iget v4, v0, LN/O0$c;->d:F

    const/4 v6, 0x0

    move-object/from16 v5, p1

    invoke-static/range {v1 .. v6}, LN/O0;->d(JLN/M;FLT/l;I)J

    move-result-wide v4

    iget-object v6, v0, LN/O0$c;->e:Ls/g;

    iget v1, v0, LN/O0$c;->f:F

    move-object v2, v7

    move-object v3, v9

    move v7, v1

    invoke-static/range {v2 .. v7}, LN/O0;->c(Landroidx/compose/ui/e;Lm0/i1;JLs/g;F)Landroidx/compose/ui/e;

    move-result-object v10

    iget-object v11, v0, LN/O0$c;->g:Ly/m;

    const/4 v6, 0x0

    const/4 v7, 0x7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    move-object/from16 v5, p1

    invoke-static/range {v1 .. v7}, LN/A0;->g(ZFJLT/l;II)Ls/G;

    move-result-object v12

    iget-boolean v13, v0, LN/O0$c;->h:Z

    iget-object v1, v0, LN/O0$c;->i:Lmh/a;

    const/16 v17, 0x18

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v16, v1

    invoke-static/range {v10 .. v18}, Landroidx/compose/foundation/d;->b(Landroidx/compose/ui/e;Ly/m;Ls/G;ZLjava/lang/String;LJ0/g;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    iget-object v2, v0, LN/O0$c;->j:Lmh/p;

    sget-object v3, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v3}, Lf0/c$a;->o()Lf0/c;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v8, v4}, LT/j;->a(LT/l;I)I

    move-result v5

    invoke-interface/range {p1 .. p1}, LT/l;->G()LT/x;

    move-result-object v6

    invoke-static {v8, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v7, LE0/g;->K:LE0/g$a;

    invoke-virtual {v7}, LE0/g$a;->a()Lmh/a;

    move-result-object v9

    invoke-interface/range {p1 .. p1}, LT/l;->x()LT/f;

    move-result-object v10

    if-nez v10, :cond_3

    invoke-static {}, LT/j;->c()V

    :cond_3
    invoke-interface/range {p1 .. p1}, LT/l;->u()V

    invoke-interface/range {p1 .. p1}, LT/l;->o()Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-interface {v8, v9}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p1 .. p1}, LT/l;->I()V

    :goto_1
    invoke-static/range {p1 .. p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v9

    invoke-virtual {v7}, LE0/g$a;->e()Lmh/p;

    move-result-object v10

    invoke-static {v9, v3, v10}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v7}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v9, v6, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v7}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v9}, LT/l;->o()Z

    move-result v6

    if-nez v6, :cond_5

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v6, v10}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    :cond_5
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v9, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v9, v5, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_6
    invoke-virtual {v7}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v9, v1, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v8, v1}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface/range {p1 .. p1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_7

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

    invoke-virtual {p0, p1, p2}, LN/O0$c;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
