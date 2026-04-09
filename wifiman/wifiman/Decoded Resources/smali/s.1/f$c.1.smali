.class final Ls/f$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls/f;->M2(Lj0/d;Lm0/l0;Lm0/Q0$c;JJZF)Lj0/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lm0/l0;

.field final synthetic c:J

.field final synthetic d:F

.field final synthetic e:F

.field final synthetic f:J

.field final synthetic g:J

.field final synthetic h:Lo0/k;


# direct methods
.method constructor <init>(ZLm0/l0;JFFJJLo0/k;)V
    .locals 0

    iput-boolean p1, p0, Ls/f$c;->a:Z

    iput-object p2, p0, Ls/f$c;->b:Lm0/l0;

    iput-wide p3, p0, Ls/f$c;->c:J

    iput p5, p0, Ls/f$c;->d:F

    iput p6, p0, Ls/f$c;->e:F

    iput-wide p7, p0, Ls/f$c;->f:J

    iput-wide p9, p0, Ls/f$c;->g:J

    iput-object p11, p0, Ls/f$c;->h:Lo0/k;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lo0/c;)V
    .locals 23

    move-object/from16 v1, p0

    invoke-interface/range {p1 .. p1}, Lo0/c;->X1()V

    iget-boolean v0, v1, Ls/f$c;->a:Z

    if-eqz v0, :cond_0

    iget-object v3, v1, Ls/f$c;->b:Lm0/l0;

    iget-wide v8, v1, Ls/f$c;->c:J

    const/16 v14, 0xf6

    const/4 v15, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v15}, Lo0/f;->d0(Lo0/f;Lm0/l0;JJJFLo0/g;Lm0/w0;IILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_0
    iget-wide v2, v1, Ls/f$c;->c:J

    invoke-static {v2, v3}, Ll0/a;->d(J)F

    move-result v0

    iget v2, v1, Ls/f$c;->d:F

    cmpg-float v0, v0, v2

    if-gez v0, :cond_1

    iget v5, v1, Ls/f$c;->e:F

    invoke-interface/range {p1 .. p1}, Lo0/f;->c()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll0/m;->i(J)F

    move-result v0

    iget v2, v1, Ls/f$c;->e:F

    sub-float v6, v0, v2

    invoke-interface/range {p1 .. p1}, Lo0/f;->c()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll0/m;->g(J)F

    move-result v0

    iget v2, v1, Ls/f$c;->e:F

    sub-float v7, v0, v2

    sget-object v0, Lm0/u0;->a:Lm0/u0$a;

    invoke-virtual {v0}, Lm0/u0$a;->a()I

    move-result v8

    iget-object v10, v1, Ls/f$c;->b:Lm0/l0;

    iget-wide v13, v1, Ls/f$c;->c:J

    invoke-interface/range {p1 .. p1}, Lo0/f;->k1()Lo0/d;

    move-result-object v2

    invoke-interface {v2}, Lo0/d;->c()J

    move-result-wide v11

    invoke-interface {v2}, Lo0/d;->d()Lm0/n0;

    move-result-object v0

    invoke-interface {v0}, Lm0/n0;->j()V

    :try_start_0
    invoke-interface {v2}, Lo0/d;->e()Lo0/h;

    move-result-object v3

    move v4, v5

    invoke-interface/range {v3 .. v8}, Lo0/h;->b(FFFFI)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/16 v21, 0xf6

    const/16 v22, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v9, p1

    move-wide v7, v11

    move-wide v11, v3

    move-wide v3, v13

    move-wide v13, v5

    move-wide v15, v3

    :try_start_1
    invoke-static/range {v9 .. v22}, Lo0/f;->d0(Lo0/f;Lm0/l0;JJJFLo0/g;Lm0/w0;IILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {v2}, Lo0/d;->d()Lm0/n0;

    move-result-object v0

    invoke-interface {v0}, Lm0/n0;->r()V

    invoke-interface {v2, v7, v8}, Lo0/d;->f(J)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v0

    move-wide v7, v11

    :goto_0
    invoke-interface {v2}, Lo0/d;->d()Lm0/n0;

    move-result-object v3

    invoke-interface {v3}, Lm0/n0;->r()V

    invoke-interface {v2, v7, v8}, Lo0/d;->f(J)V

    throw v0

    :cond_1
    iget-object v10, v1, Ls/f$c;->b:Lm0/l0;

    iget-wide v11, v1, Ls/f$c;->f:J

    iget-wide v13, v1, Ls/f$c;->g:J

    iget-wide v3, v1, Ls/f$c;->c:J

    invoke-static {v3, v4, v2}, Ls/e;->d(JF)J

    move-result-wide v15

    iget-object v0, v1, Ls/f$c;->h:Lo0/k;

    const/16 v21, 0xd0

    const/16 v22, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v9, p1

    move-object/from16 v18, v0

    invoke-static/range {v9 .. v22}, Lo0/f;->d0(Lo0/f;Lm0/l0;JJJFLo0/g;Lm0/w0;IILjava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo0/c;

    invoke-virtual {p0, p1}, Ls/f$c;->a(Lo0/c;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
