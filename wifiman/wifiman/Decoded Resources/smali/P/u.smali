.class final LP/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Z

.field private final b:Lmh/a;

.field private final c:Lr/a;

.field private final d:Ljava/util/List;

.field private e:Ly/j;


# direct methods
.method public constructor <init>(ZLmh/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LP/u;->a:Z

    iput-object p2, p0, LP/u;->b:Lmh/a;

    const/4 p1, 0x2

    const/4 p2, 0x0

    const/4 v0, 0x0

    invoke-static {v0, v0, p1, p2}, Lr/b;->b(FFILjava/lang/Object;)Lr/a;

    move-result-object p1

    iput-object p1, p0, LP/u;->c:Lr/a;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LP/u;->d:Ljava/util/List;

    return-void
.end method

.method public static final synthetic a(LP/u;)Lr/a;
    .locals 0

    iget-object p0, p0, LP/u;->c:Lr/a;

    return-object p0
.end method


# virtual methods
.method public final b(Lo0/f;FJ)V
    .locals 22

    move-object/from16 v1, p0

    iget-object v0, v1, LP/u;->c:Lr/a;

    invoke-virtual {v0}, Lr/a;->m()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v4

    const/4 v0, 0x0

    cmpl-float v0, v4, v0

    if-lez v0, :cond_1

    const/16 v8, 0xe

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-wide/from16 v2, p3

    invoke-static/range {v2 .. v9}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v11

    iget-boolean v0, v1, LP/u;->a:Z

    if-eqz v0, :cond_0

    invoke-interface/range {p1 .. p1}, Lo0/f;->c()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll0/m;->i(J)F

    move-result v7

    invoke-interface/range {p1 .. p1}, Lo0/f;->c()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll0/m;->g(J)F

    move-result v8

    sget-object v0, Lm0/u0;->a:Lm0/u0$a;

    invoke-virtual {v0}, Lm0/u0$a;->b()I

    move-result v9

    invoke-interface/range {p1 .. p1}, Lo0/f;->k1()Lo0/d;

    move-result-object v2

    invoke-interface {v2}, Lo0/d;->c()J

    move-result-wide v14

    invoke-interface {v2}, Lo0/d;->d()Lm0/n0;

    move-result-object v0

    invoke-interface {v0}, Lm0/n0;->j()V

    :try_start_0
    invoke-interface {v2}, Lo0/d;->e()Lo0/h;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-interface/range {v4 .. v9}, Lo0/h;->b(FFFFI)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/16 v20, 0x7c

    const/16 v21, 0x0

    const-wide/16 v3, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v10, p1

    move/from16 v13, p2

    move-wide v5, v14

    move-wide v14, v3

    :try_start_1
    invoke-static/range {v10 .. v21}, Lo0/f;->P1(Lo0/f;JFJFLo0/g;Lm0/w0;IILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {v2}, Lo0/d;->d()Lm0/n0;

    move-result-object v0

    invoke-interface {v0}, Lm0/n0;->r()V

    invoke-interface {v2, v5, v6}, Lo0/d;->f(J)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v0

    move-wide v5, v14

    :goto_0
    invoke-interface {v2}, Lo0/d;->d()Lm0/n0;

    move-result-object v3

    invoke-interface {v3}, Lm0/n0;->r()V

    invoke-interface {v2, v5, v6}, Lo0/d;->f(J)V

    throw v0

    :cond_0
    const/16 v20, 0x7c

    const/16 v21, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v10, p1

    move/from16 v13, p2

    invoke-static/range {v10 .. v21}, Lo0/f;->P1(Lo0/f;JFJFLo0/g;Lm0/w0;IILjava/lang/Object;)V

    :cond_1
    :goto_1
    return-void
.end method

.method public final c(Ly/j;LIi/N;)V
    .locals 9

    instance-of v0, p1, Ly/g;

    if-eqz v0, :cond_0

    iget-object v1, p0, LP/u;->d:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    instance-of v1, p1, Ly/h;

    if-eqz v1, :cond_1

    iget-object v1, p0, LP/u;->d:Ljava/util/List;

    move-object v2, p1

    check-cast v2, Ly/h;

    invoke-virtual {v2}, Ly/h;->a()Ly/g;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    instance-of v1, p1, Ly/d;

    if-eqz v1, :cond_2

    iget-object v1, p0, LP/u;->d:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    instance-of v1, p1, Ly/e;

    if-eqz v1, :cond_3

    iget-object v1, p0, LP/u;->d:Ljava/util/List;

    move-object v2, p1

    check-cast v2, Ly/e;

    invoke-virtual {v2}, Ly/e;->a()Ly/d;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    instance-of v1, p1, Ly/b;

    if-eqz v1, :cond_4

    iget-object v1, p0, LP/u;->d:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    instance-of v1, p1, Ly/c;

    if-eqz v1, :cond_5

    iget-object v1, p0, LP/u;->d:Ljava/util/List;

    move-object v2, p1

    check-cast v2, Ly/c;

    invoke-virtual {v2}, Ly/c;->a()Ly/b;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    instance-of v1, p1, Ly/a;

    if-eqz v1, :cond_a

    iget-object v1, p0, LP/u;->d:Ljava/util/List;

    move-object v2, p1

    check-cast v2, Ly/a;

    invoke-virtual {v2}, Ly/a;->a()Ly/b;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :goto_0
    iget-object v1, p0, LP/u;->d:Ljava/util/List;

    invoke-static {v1}, LZg/v;->D0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly/j;

    iget-object v2, p0, LP/u;->e:Ly/j;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    const/4 v2, 0x0

    if-eqz v1, :cond_9

    iget-object v3, p0, LP/u;->b:Lmh/a;

    invoke-interface {v3}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LP/g;

    if-eqz v0, :cond_6

    invoke-virtual {v3}, LP/g;->c()F

    move-result p1

    goto :goto_1

    :cond_6
    instance-of v0, p1, Ly/d;

    if-eqz v0, :cond_7

    invoke-virtual {v3}, LP/g;->b()F

    move-result p1

    goto :goto_1

    :cond_7
    instance-of p1, p1, Ly/b;

    if-eqz p1, :cond_8

    invoke-virtual {v3}, LP/g;->a()F

    move-result p1

    goto :goto_1

    :cond_8
    const/4 p1, 0x0

    :goto_1
    invoke-static {v1}, LP/p;->a(Ly/j;)Lr/i;

    move-result-object v0

    new-instance v6, LP/u$a;

    invoke-direct {v6, p0, p1, v0, v2}, LP/u$a;-><init>(LP/u;FLr/i;Ldh/e;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v3, p2

    invoke-static/range {v3 .. v8}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    goto :goto_2

    :cond_9
    iget-object p1, p0, LP/u;->e:Ly/j;

    invoke-static {p1}, LP/p;->b(Ly/j;)Lr/i;

    move-result-object p1

    new-instance v6, LP/u$b;

    invoke-direct {v6, p0, p1, v2}, LP/u$b;-><init>(LP/u;Lr/i;Ldh/e;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v3, p2

    invoke-static/range {v3 .. v8}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    :goto_2
    iput-object v1, p0, LP/u;->e:Ly/j;

    :cond_a
    return-void
.end method
