.class public final Ls0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lm0/J0;

.field private b:Lm0/n0;

.field private c:LY0/d;

.field private d:LY0/t;

.field private e:J

.field private f:I

.field private final g:Lo0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LY0/t;->Ltr:LY0/t;

    iput-object v0, p0, Ls0/a;->d:LY0/t;

    sget-object v0, LY0/r;->b:LY0/r$a;

    invoke-virtual {v0}, LY0/r$a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Ls0/a;->e:J

    sget-object v0, Lm0/K0;->b:Lm0/K0$a;

    invoke-virtual {v0}, Lm0/K0$a;->b()I

    move-result v0

    iput v0, p0, Ls0/a;->f:I

    new-instance v0, Lo0/a;

    invoke-direct {v0}, Lo0/a;-><init>()V

    iput-object v0, p0, Ls0/a;->g:Lo0/a;

    return-void
.end method

.method private final a(Lo0/f;)V
    .locals 14

    sget-object v0, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v0}, Lm0/v0$a;->a()J

    move-result-wide v2

    sget-object v0, Lm0/d0;->a:Lm0/d0$a;

    invoke-virtual {v0}, Lm0/d0$a;->a()I

    move-result v11

    const/16 v12, 0x3e

    const/4 v13, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v13}, Lo0/f;->u0(Lo0/f;JJJFLo0/g;Lm0/w0;IILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final b(IJLY0/d;LY0/t;Lmh/l;)V
    .locals 14

    move-object v0, p0

    move v8, p1

    move-object/from16 v9, p4

    move-object/from16 v10, p5

    iput-object v9, v0, Ls0/a;->c:LY0/d;

    iput-object v10, v0, Ls0/a;->d:LY0/t;

    iget-object v1, v0, Ls0/a;->a:Lm0/J0;

    iget-object v2, v0, Ls0/a;->b:Lm0/n0;

    if-eqz v1, :cond_1

    if-eqz v2, :cond_1

    invoke-static/range {p2 .. p3}, LY0/r;->g(J)I

    move-result v3

    invoke-interface {v1}, Lm0/J0;->getWidth()I

    move-result v4

    if-gt v3, v4, :cond_1

    invoke-static/range {p2 .. p3}, LY0/r;->f(J)I

    move-result v3

    invoke-interface {v1}, Lm0/J0;->getHeight()I

    move-result v4

    if-gt v3, v4, :cond_1

    iget v3, v0, Ls0/a;->f:I

    invoke-static {v3, p1}, Lm0/K0;->i(II)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-wide/from16 v3, p2

    goto :goto_2

    :cond_1
    :goto_1
    invoke-static/range {p2 .. p3}, LY0/r;->g(J)I

    move-result v1

    invoke-static/range {p2 .. p3}, LY0/r;->f(J)I

    move-result v2

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v3, p1

    invoke-static/range {v1 .. v7}, Lm0/L0;->b(IIIZLn0/c;ILjava/lang/Object;)Lm0/J0;

    move-result-object v1

    invoke-static {v1}, Lm0/p0;->a(Lm0/J0;)Lm0/n0;

    move-result-object v2

    iput-object v1, v0, Ls0/a;->a:Lm0/J0;

    iput-object v2, v0, Ls0/a;->b:Lm0/n0;

    iput v8, v0, Ls0/a;->f:I

    goto :goto_0

    :goto_2
    iput-wide v3, v0, Ls0/a;->e:J

    iget-object v5, v0, Ls0/a;->g:Lo0/a;

    invoke-static/range {p2 .. p3}, LY0/s;->d(J)J

    move-result-wide v3

    invoke-virtual {v5}, Lo0/a;->B()Lo0/a$a;

    move-result-object v6

    invoke-virtual {v6}, Lo0/a$a;->a()LY0/d;

    move-result-object v7

    invoke-virtual {v6}, Lo0/a$a;->b()LY0/t;

    move-result-object v8

    invoke-virtual {v6}, Lo0/a$a;->c()Lm0/n0;

    move-result-object v11

    invoke-virtual {v6}, Lo0/a$a;->d()J

    move-result-wide v12

    invoke-virtual {v5}, Lo0/a;->B()Lo0/a$a;

    move-result-object v6

    invoke-virtual {v6, v9}, Lo0/a$a;->j(LY0/d;)V

    invoke-virtual {v6, v10}, Lo0/a$a;->k(LY0/t;)V

    invoke-virtual {v6, v2}, Lo0/a$a;->i(Lm0/n0;)V

    invoke-virtual {v6, v3, v4}, Lo0/a$a;->l(J)V

    invoke-interface {v2}, Lm0/n0;->j()V

    invoke-direct {p0, v5}, Ls0/a;->a(Lo0/f;)V

    move-object/from16 v3, p6

    invoke-interface {v3, v5}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2}, Lm0/n0;->r()V

    invoke-virtual {v5}, Lo0/a;->B()Lo0/a$a;

    move-result-object v2

    invoke-virtual {v2, v7}, Lo0/a$a;->j(LY0/d;)V

    invoke-virtual {v2, v8}, Lo0/a$a;->k(LY0/t;)V

    invoke-virtual {v2, v11}, Lo0/a$a;->i(Lm0/n0;)V

    invoke-virtual {v2, v12, v13}, Lo0/a$a;->l(J)V

    invoke-interface {v1}, Lm0/J0;->a()V

    return-void
.end method

.method public final c(Lo0/f;FLm0/w0;)V
    .locals 18

    move-object/from16 v0, p0

    iget-object v2, v0, Ls0/a;->a:Lm0/J0;

    if-eqz v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    const-string v1, "drawCachedImage must be invoked first before attempting to draw the result into another destination"

    invoke-static {v1}, LB0/a;->b(Ljava/lang/String;)V

    :cond_1
    iget-wide v5, v0, Ls0/a;->e:J

    const/16 v16, 0x35a

    const/16 v17, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v1, p1

    move/from16 v11, p2

    move-object/from16 v13, p3

    invoke-static/range {v1 .. v17}, Lo0/f;->u1(Lo0/f;Lm0/J0;JJJJFLo0/g;Lm0/w0;IIILjava/lang/Object;)V

    return-void
.end method

.method public final d()Lm0/J0;
    .locals 1

    iget-object v0, p0, Ls0/a;->a:Lm0/J0;

    return-object v0
.end method
