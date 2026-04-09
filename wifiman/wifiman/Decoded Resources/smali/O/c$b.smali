.class final LO/c$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO/c;->b(LO/g;JLandroidx/compose/ui/e;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LO/g;

.field final synthetic b:LT/z1;

.field final synthetic c:J

.field final synthetic d:Lm0/U0;


# direct methods
.method constructor <init>(LO/g;LT/z1;JLm0/U0;)V
    .locals 0

    iput-object p1, p0, LO/c$b;->a:LO/g;

    iput-object p2, p0, LO/c$b;->b:LT/z1;

    iput-wide p3, p0, LO/c$b;->c:J

    iput-object p5, p0, LO/c$b;->d:Lm0/U0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lo0/f;)V
    .locals 33

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    iget-object v2, v1, LO/c$b;->a:LO/g;

    invoke-virtual {v2}, LO/g;->j()F

    move-result v2

    invoke-static {v2}, LO/c;->f(F)LO/a;

    move-result-object v18

    iget-object v2, v1, LO/c$b;->b:LT/z1;

    invoke-interface {v2}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v19

    invoke-virtual/range {v18 .. v18}, LO/a;->b()F

    move-result v2

    iget-wide v14, v1, LO/c$b;->c:J

    iget-object v13, v1, LO/c$b;->d:Lm0/U0;

    invoke-interface/range {p1 .. p1}, Lo0/f;->D1()J

    move-result-wide v3

    invoke-interface/range {p1 .. p1}, Lo0/f;->k1()Lo0/d;

    move-result-object v12

    invoke-interface {v12}, Lo0/d;->c()J

    move-result-wide v10

    invoke-interface {v12}, Lo0/d;->d()Lm0/n0;

    move-result-object v5

    invoke-interface {v5}, Lm0/n0;->j()V

    :try_start_0
    invoke-interface {v12}, Lo0/d;->e()Lo0/h;

    move-result-object v5

    invoke-interface {v5, v2, v3, v4}, Lo0/h;->i(FJ)V

    invoke-static {}, LO/c;->i()F

    move-result v2

    invoke-interface {v0, v2}, LY0/d;->d1(F)F

    move-result v2

    invoke-static {}, LO/c;->j()F

    move-result v3

    invoke-interface {v0, v3}, LY0/d;->d1(F)F

    move-result v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    add-float/2addr v2, v3

    new-instance v8, Ll0/i;

    invoke-interface/range {p1 .. p1}, Lo0/f;->c()J

    move-result-wide v3

    invoke-static {v3, v4}, Ll0/n;->b(J)J

    move-result-wide v3

    invoke-static {v3, v4}, Ll0/g;->m(J)F

    move-result v3

    sub-float/2addr v3, v2

    invoke-interface/range {p1 .. p1}, Lo0/f;->c()J

    move-result-wide v4

    invoke-static {v4, v5}, Ll0/n;->b(J)J

    move-result-wide v4

    invoke-static {v4, v5}, Ll0/g;->n(J)F

    move-result v4

    sub-float/2addr v4, v2

    invoke-interface/range {p1 .. p1}, Lo0/f;->c()J

    move-result-wide v5

    invoke-static {v5, v6}, Ll0/n;->b(J)J

    move-result-wide v5

    invoke-static {v5, v6}, Ll0/g;->m(J)F

    move-result v5

    add-float/2addr v5, v2

    invoke-interface/range {p1 .. p1}, Lo0/f;->c()J

    move-result-wide v6

    invoke-static {v6, v7}, Ll0/n;->b(J)J

    move-result-wide v6

    invoke-static {v6, v7}, Ll0/g;->n(J)F

    move-result v6

    add-float/2addr v6, v2

    invoke-direct {v8, v3, v4, v5, v6}, Ll0/i;-><init>(FFFF)V

    invoke-virtual/range {v18 .. v18}, LO/a;->d()F

    move-result v5

    invoke-virtual/range {v18 .. v18}, LO/a;->a()F

    move-result v2

    invoke-virtual/range {v18 .. v18}, LO/a;->d()F

    move-result v3

    sub-float v6, v2, v3

    invoke-virtual {v8}, Ll0/i;->p()J

    move-result-wide v16

    invoke-virtual {v8}, Ll0/i;->m()J

    move-result-wide v20

    new-instance v30, Lo0/k;

    invoke-static {}, LO/c;->j()F

    move-result v2

    invoke-interface {v0, v2}, LY0/d;->d1(F)F

    move-result v23

    sget-object v2, Lm0/k1;->a:Lm0/k1$a;

    invoke-virtual {v2}, Lm0/k1$a;->c()I

    move-result v25

    const/16 v28, 0x1a

    const/16 v29, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    move-object/from16 v22, v30

    invoke-direct/range {v22 .. v29}, Lo0/k;-><init>(FFIILm0/V0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/16 v22, 0x300

    const/16 v23, 0x0

    const/4 v7, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    move-object/from16 v2, p1

    move-wide v3, v14

    move-object/from16 v26, v8

    move-wide/from16 v8, v16

    move-wide/from16 v31, v10

    move-wide/from16 v10, v20

    move-object/from16 v20, v12

    move/from16 v12, v19

    move-object/from16 v21, v13

    move-object/from16 v13, v30

    move-wide/from16 v27, v14

    move-object/from16 v14, v24

    move/from16 v15, v25

    move/from16 v16, v22

    move-object/from16 v17, v23

    :try_start_1
    invoke-static/range {v2 .. v17}, Lo0/f;->p1(Lo0/f;JFFZJJFLo0/g;Lm0/w0;IILjava/lang/Object;)V

    move-object/from16 v2, p1

    move-object/from16 v3, v21

    move-object/from16 v4, v26

    move-wide/from16 v5, v27

    move/from16 v7, v19

    move-object/from16 v8, v18

    invoke-static/range {v2 .. v8}, LO/c;->h(Lo0/f;Lm0/U0;Ll0/i;JFLO/a;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface/range {v20 .. v20}, Lo0/d;->d()Lm0/n0;

    move-result-object v0

    invoke-interface {v0}, Lm0/n0;->r()V

    move-object/from16 v2, v20

    move-wide/from16 v3, v31

    invoke-interface {v2, v3, v4}, Lo0/d;->f(J)V

    return-void

    :catchall_0
    move-exception v0

    move-object/from16 v2, v20

    move-wide/from16 v3, v31

    goto :goto_0

    :catchall_1
    move-exception v0

    move-wide v3, v10

    move-object v2, v12

    :goto_0
    invoke-interface {v2}, Lo0/d;->d()Lm0/n0;

    move-result-object v5

    invoke-interface {v5}, Lm0/n0;->r()V

    invoke-interface {v2, v3, v4}, Lo0/d;->f(J)V

    throw v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo0/f;

    invoke-virtual {p0, p1}, LO/c$b;->a(Lo0/f;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
