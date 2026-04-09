.class public final Ly0/C;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LE0/G;

.field private final b:Ly0/e;

.field private final c:Ly0/z;

.field private final d:LE0/u;

.field private e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LE0/G;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly0/C;->a:LE0/G;

    new-instance v0, Ly0/e;

    invoke-virtual {p1}, LE0/G;->c()LC0/r;

    move-result-object p1

    invoke-direct {v0, p1}, Ly0/e;-><init>(LC0/r;)V

    iput-object v0, p0, Ly0/C;->b:Ly0/e;

    new-instance p1, Ly0/z;

    invoke-direct {p1}, Ly0/z;-><init>()V

    iput-object p1, p0, Ly0/C;->c:Ly0/z;

    new-instance p1, LE0/u;

    invoke-direct {p1}, LE0/u;-><init>()V

    iput-object p1, p0, Ly0/C;->d:LE0/u;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Ly0/C;->b:Ly0/e;

    invoke-virtual {v0}, Ly0/e;->b()V

    return-void
.end method

.method public final b(Ly0/A;Ly0/M;Z)I
    .locals 18

    move-object/from16 v1, p0

    iget-boolean v0, v1, Ly0/C;->e:Z

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-static {v2, v2}, Ly0/D;->a(ZZ)I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, v1, Ly0/C;->e:Z

    iget-object v3, v1, Ly0/C;->c:Ly0/z;

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    invoke-virtual {v3, v4, v5}, Ly0/z;->b(Ly0/A;Ly0/M;)Ly0/f;

    move-result-object v3

    invoke-virtual {v3}, Ly0/f;->b()Lo/t;

    move-result-object v4

    invoke-virtual {v4}, Lo/t;->o()I

    move-result v4

    move v5, v2

    :goto_0
    if-ge v5, v4, :cond_3

    invoke-virtual {v3}, Ly0/f;->b()Lo/t;

    move-result-object v6

    invoke-virtual {v6, v5}, Lo/t;->p(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly0/y;

    invoke-virtual {v6}, Ly0/y;->i()Z

    move-result v7

    if-nez v7, :cond_2

    invoke-virtual {v6}, Ly0/y;->l()Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_6

    :cond_2
    :goto_1
    move v4, v2

    goto :goto_2

    :cond_3
    move v4, v0

    :goto_2
    invoke-virtual {v3}, Ly0/f;->b()Lo/t;

    move-result-object v5

    invoke-virtual {v5}, Lo/t;->o()I

    move-result v5

    move v6, v2

    :goto_3
    if-ge v6, v5, :cond_6

    invoke-virtual {v3}, Ly0/f;->b()Lo/t;

    move-result-object v7

    invoke-virtual {v7, v6}, Lo/t;->p(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ly0/y;

    if-nez v4, :cond_4

    invoke-static {v7}, Ly0/o;->b(Ly0/y;)Z

    move-result v8

    if-eqz v8, :cond_5

    :cond_4
    invoke-virtual {v7}, Ly0/y;->n()I

    move-result v8

    sget-object v9, Ly0/L;->a:Ly0/L$a;

    invoke-virtual {v9}, Ly0/L$a;->d()I

    move-result v9

    invoke-static {v8, v9}, Ly0/L;->g(II)Z

    move-result v14

    iget-object v10, v1, Ly0/C;->a:LE0/G;

    invoke-virtual {v7}, Ly0/y;->h()J

    move-result-wide v11

    iget-object v13, v1, Ly0/C;->d:LE0/u;

    const/16 v16, 0x8

    const/16 v17, 0x0

    const/4 v15, 0x0

    invoke-static/range {v10 .. v17}, LE0/G;->y0(LE0/G;JLE0/u;ZZILjava/lang/Object;)V

    iget-object v8, v1, Ly0/C;->d:LE0/u;

    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_5

    iget-object v8, v1, Ly0/C;->b:Ly0/e;

    invoke-virtual {v7}, Ly0/y;->f()J

    move-result-wide v9

    iget-object v11, v1, Ly0/C;->d:LE0/u;

    invoke-static {v7}, Ly0/o;->b(Ly0/y;)Z

    move-result v7

    invoke-virtual {v8, v9, v10, v11, v7}, Ly0/e;->a(JLjava/util/List;Z)V

    iget-object v7, v1, Ly0/C;->d:LE0/u;

    invoke-virtual {v7}, LE0/u;->clear()V

    :cond_5
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_6
    iget-object v4, v1, Ly0/C;->b:Ly0/e;

    invoke-virtual {v4}, Ly0/e;->e()V

    iget-object v4, v1, Ly0/C;->b:Ly0/e;

    move/from16 v5, p3

    invoke-virtual {v4, v3, v5}, Ly0/e;->c(Ly0/f;Z)Z

    move-result v4

    invoke-virtual {v3}, Ly0/f;->d()Z

    move-result v5

    if-eqz v5, :cond_8

    :cond_7
    move v0, v2

    goto :goto_5

    :cond_8
    invoke-virtual {v3}, Ly0/f;->b()Lo/t;

    move-result-object v5

    invoke-virtual {v5}, Lo/t;->o()I

    move-result v5

    move v6, v2

    :goto_4
    if-ge v6, v5, :cond_7

    invoke-virtual {v3}, Ly0/f;->b()Lo/t;

    move-result-object v7

    invoke-virtual {v7, v6}, Lo/t;->p(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ly0/y;

    invoke-static {v7}, Ly0/o;->k(Ly0/y;)Z

    move-result v8

    if-eqz v8, :cond_9

    invoke-virtual {v7}, Ly0/y;->p()Z

    move-result v7

    if-eqz v7, :cond_9

    goto :goto_5

    :cond_9
    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :goto_5
    invoke-static {v4, v0}, Ly0/D;->a(ZZ)I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v2, v1, Ly0/C;->e:Z

    return v0

    :goto_6
    iput-boolean v2, v1, Ly0/C;->e:Z

    throw v0
.end method

.method public final c()V
    .locals 1

    iget-boolean v0, p0, Ly0/C;->e:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ly0/C;->c:Ly0/z;

    invoke-virtual {v0}, Ly0/z;->a()V

    iget-object v0, p0, Ly0/C;->b:Ly0/e;

    invoke-virtual {v0}, Ly0/e;->d()V

    :cond_0
    return-void
.end method
