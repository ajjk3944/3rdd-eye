.class final LF/V$a$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/V$a;->a(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LI/G;

.field final synthetic b:LR0/H;

.field final synthetic c:LR0/Q;

.field final synthetic d:LF/E;

.field final synthetic e:Lm0/l0;


# direct methods
.method constructor <init>(LI/G;LR0/H;LR0/Q;LF/E;Lm0/l0;)V
    .locals 0

    iput-object p1, p0, LF/V$a$b;->a:LI/G;

    iput-object p2, p0, LF/V$a$b;->b:LR0/H;

    iput-object p3, p0, LF/V$a$b;->c:LR0/Q;

    iput-object p4, p0, LF/V$a$b;->d:LF/E;

    iput-object p5, p0, LF/V$a$b;->e:Lm0/l0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lo0/c;)V
    .locals 16

    move-object/from16 v0, p0

    invoke-interface/range {p1 .. p1}, Lo0/c;->X1()V

    iget-object v1, v0, LF/V$a$b;->a:LI/G;

    invoke-virtual {v1}, LI/G;->d()F

    move-result v11

    const/4 v1, 0x0

    cmpg-float v2, v11, v1

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, v0, LF/V$a$b;->b:LR0/H;

    iget-object v3, v0, LF/V$a$b;->c:LR0/Q;

    invoke-virtual {v3}, LR0/Q;->h()J

    move-result-wide v3

    invoke-static {v3, v4}, LL0/S;->n(J)I

    move-result v3

    invoke-interface {v2, v3}, LR0/H;->b(I)I

    move-result v2

    iget-object v3, v0, LF/V$a$b;->d:LF/E;

    invoke-virtual {v3}, LF/E;->j()LF/j0;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, LF/j0;->f()LL0/M;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3, v2}, LL0/M;->e(I)Ll0/i;

    move-result-object v2

    if-nez v2, :cond_2

    :cond_1
    new-instance v2, Ll0/i;

    invoke-direct {v2, v1, v1, v1, v1}, Ll0/i;-><init>(FFFF)V

    :cond_2
    invoke-static {}, LF/V;->b()F

    move-result v1

    move-object/from16 v3, p1

    invoke-interface {v3, v1}, LY0/d;->d1(F)F

    move-result v8

    invoke-virtual {v2}, Ll0/i;->k()F

    move-result v1

    const/4 v4, 0x2

    int-to-float v4, v4

    div-float v4, v8, v4

    add-float/2addr v1, v4

    invoke-interface/range {p1 .. p1}, Lo0/f;->c()J

    move-result-wide v5

    invoke-static {v5, v6}, Ll0/m;->i(J)F

    move-result v5

    sub-float/2addr v5, v4

    invoke-static {v1, v5}, Lsh/m;->f(FF)F

    move-result v1

    invoke-static {v1, v4}, Lsh/m;->c(FF)F

    move-result v1

    invoke-virtual {v2}, Ll0/i;->n()F

    move-result v4

    invoke-static {v1, v4}, Ll0/h;->a(FF)J

    move-result-wide v4

    invoke-virtual {v2}, Ll0/i;->e()F

    move-result v2

    invoke-static {v1, v2}, Ll0/h;->a(FF)J

    move-result-wide v6

    iget-object v1, v0, LF/V$a$b;->e:Lm0/l0;

    const/16 v14, 0x1b0

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v2, p1

    move-object v3, v1

    invoke-static/range {v2 .. v15}, Lo0/f;->i0(Lo0/f;Lm0/l0;JJFILm0/V0;FLm0/w0;IILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo0/c;

    invoke-virtual {p0, p1}, LF/V$a$b;->a(Lo0/c;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
