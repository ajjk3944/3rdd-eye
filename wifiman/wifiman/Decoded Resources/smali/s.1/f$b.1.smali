.class final Ls/f$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls/f;->L2(Lj0/d;Lm0/l0;Lm0/Q0$a;ZF)Lj0/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ll0/i;

.field final synthetic b:Lkotlin/jvm/internal/N;

.field final synthetic c:J

.field final synthetic d:Lm0/w0;


# direct methods
.method constructor <init>(Ll0/i;Lkotlin/jvm/internal/N;JLm0/w0;)V
    .locals 0

    iput-object p1, p0, Ls/f$b;->a:Ll0/i;

    iput-object p2, p0, Ls/f$b;->b:Lkotlin/jvm/internal/N;

    iput-wide p3, p0, Ls/f$b;->c:J

    iput-object p5, p0, Ls/f$b;->d:Lm0/w0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lo0/c;)V
    .locals 21

    move-object/from16 v1, p0

    invoke-interface/range {p1 .. p1}, Lo0/c;->X1()V

    iget-object v0, v1, Ls/f$b;->a:Ll0/i;

    invoke-virtual {v0}, Ll0/i;->k()F

    move-result v2

    iget-object v0, v1, Ls/f$b;->a:Ll0/i;

    invoke-virtual {v0}, Ll0/i;->n()F

    move-result v3

    iget-object v0, v1, Ls/f$b;->b:Lkotlin/jvm/internal/N;

    iget-wide v8, v1, Ls/f$b;->c:J

    iget-object v5, v1, Ls/f$b;->d:Lm0/w0;

    invoke-interface/range {p1 .. p1}, Lo0/f;->k1()Lo0/d;

    move-result-object v4

    invoke-interface {v4}, Lo0/d;->e()Lo0/h;

    move-result-object v4

    invoke-interface {v4, v2, v3}, Lo0/h;->c(FF)V

    :try_start_0
    iget-object v0, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v0, Lm0/J0;

    const/16 v19, 0x37a

    const/16 v20, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v4, p1

    move-object/from16 v16, v5

    move-object v5, v0

    invoke-static/range {v4 .. v20}, Lo0/f;->u1(Lo0/f;Lm0/J0;JJJJFLo0/g;Lm0/w0;IIILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface/range {p1 .. p1}, Lo0/f;->k1()Lo0/d;

    move-result-object v0

    invoke-interface {v0}, Lo0/d;->e()Lo0/h;

    move-result-object v0

    neg-float v2, v2

    neg-float v3, v3

    invoke-interface {v0, v2, v3}, Lo0/h;->c(FF)V

    return-void

    :catchall_0
    move-exception v0

    invoke-interface/range {p1 .. p1}, Lo0/f;->k1()Lo0/d;

    move-result-object v4

    invoke-interface {v4}, Lo0/d;->e()Lo0/h;

    move-result-object v4

    neg-float v2, v2

    neg-float v3, v3

    invoke-interface {v4, v2, v3}, Lo0/h;->c(FF)V

    throw v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo0/c;

    invoke-virtual {p0, p1}, Ls/f$b;->a(Lo0/c;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
