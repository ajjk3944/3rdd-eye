.class public Lbj/E;
.super LYi/a;
.source "SourceFile"

# interfaces
.implements Laj/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbj/E$a;,
        Lbj/E$b;
    }
.end annotation


# instance fields
.field private final b:Laj/b;

.field private final c:Lbj/M;

.field public final d:Lbj/a;

.field private final e:Lcj/e;

.field private f:I

.field private g:Lbj/E$a;

.field private final h:Laj/g;

.field private final i:Lbj/q;


# direct methods
.method public constructor <init>(Laj/b;Lbj/M;Lbj/a;LXi/f;Lbj/E$a;)V
    .locals 1

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lexer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LYi/a;-><init>()V

    iput-object p1, p0, Lbj/E;->b:Laj/b;

    iput-object p2, p0, Lbj/E;->c:Lbj/M;

    iput-object p3, p0, Lbj/E;->d:Lbj/a;

    invoke-virtual {p1}, Laj/b;->a()Lcj/e;

    move-result-object p2

    iput-object p2, p0, Lbj/E;->e:Lcj/e;

    const/4 p2, -0x1

    iput p2, p0, Lbj/E;->f:I

    iput-object p5, p0, Lbj/E;->g:Lbj/E$a;

    invoke-virtual {p1}, Laj/b;->e()Laj/g;

    move-result-object p1

    iput-object p1, p0, Lbj/E;->h:Laj/g;

    invoke-virtual {p1}, Laj/g;->j()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance p1, Lbj/q;

    invoke-direct {p1, p4}, Lbj/q;-><init>(LXi/f;)V

    :goto_0
    iput-object p1, p0, Lbj/E;->i:Lbj/q;

    return-void
.end method

.method private final L()V
    .locals 8

    iget-object v0, p0, Lbj/E;->d:Lbj/a;

    invoke-virtual {v0}, Lbj/a;->F()B

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v2, p0, Lbj/E;->d:Lbj/a;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const-string v3, "Unexpected leading comma"

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lbj/a;->z(Lbj/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0
.end method

.method private final M(LXi/f;I)Z
    .locals 5

    iget-object v0, p0, Lbj/E;->b:Laj/b;

    invoke-interface {p1, p2}, LXi/f;->j(I)Z

    move-result v1

    invoke-interface {p1, p2}, LXi/f;->i(I)LXi/f;

    move-result-object p1

    const/4 p2, 0x1

    if-eqz v1, :cond_0

    invoke-interface {p1}, LXi/f;->c()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lbj/E;->d:Lbj/a;

    invoke-virtual {v2, p2}, Lbj/a;->N(Z)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_2

    :cond_0
    invoke-interface {p1}, LXi/f;->h()LXi/m;

    move-result-object v2

    sget-object v3, LXi/m$b;->a:LXi/m$b;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-interface {p1}, LXi/f;->c()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lbj/E;->d:Lbj/a;

    invoke-virtual {v2, v3}, Lbj/a;->N(Z)Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_1
    :goto_0
    move p2, v3

    goto :goto_2

    :cond_2
    iget-object v2, p0, Lbj/E;->d:Lbj/a;

    iget-object v4, p0, Lbj/E;->h:Laj/g;

    invoke-virtual {v4}, Laj/g;->q()Z

    move-result v4

    invoke-virtual {v2, v4}, Lbj/a;->G(Z)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {p1, v0, v2}, Lbj/t;->i(LXi/f;Laj/b;Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v0}, Laj/b;->e()Laj/g;

    move-result-object v0

    invoke-virtual {v0}, Laj/g;->j()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-interface {p1}, LXi/f;->c()Z

    move-result p1

    if-eqz p1, :cond_4

    move p1, p2

    goto :goto_1

    :cond_4
    move p1, v3

    :goto_1
    const/4 v0, -0x3

    if-ne v2, v0, :cond_1

    if-nez v1, :cond_5

    if-eqz p1, :cond_1

    :cond_5
    iget-object p1, p0, Lbj/E;->d:Lbj/a;

    invoke-virtual {p1}, Lbj/a;->q()Ljava/lang/String;

    :goto_2
    return p2
.end method

.method private final N()I
    .locals 9

    iget-object v0, p0, Lbj/E;->d:Lbj/a;

    invoke-virtual {v0}, Lbj/a;->M()Z

    move-result v0

    iget-object v1, p0, Lbj/E;->d:Lbj/a;

    invoke-virtual {v1}, Lbj/a;->f()Z

    move-result v1

    const/4 v2, -0x1

    if-eqz v1, :cond_2

    iget v1, p0, Lbj/E;->f:I

    if-eq v1, v2, :cond_1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lbj/E;->d:Lbj/a;

    const/4 v7, 0x6

    const/4 v8, 0x0

    const-string v4, "Expected end of the array or comma"

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lbj/a;->z(Lbj/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0

    :cond_1
    :goto_0
    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lbj/E;->f:I

    goto :goto_1

    :cond_2
    if-eqz v0, :cond_4

    iget-object v0, p0, Lbj/E;->b:Laj/b;

    invoke-virtual {v0}, Laj/b;->e()Laj/g;

    move-result-object v0

    invoke-virtual {v0}, Laj/g;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lbj/E;->d:Lbj/a;

    const-string v1, "array"

    invoke-static {v0, v1}, Lbj/r;->f(Lbj/a;Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0

    :cond_4
    :goto_1
    return v2
.end method

.method private final O()I
    .locals 11

    iget v0, p0, Lbj/E;->f:I

    rem-int/lit8 v1, v0, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    const/4 v4, -0x1

    if-eqz v1, :cond_1

    if-eq v0, v4, :cond_2

    iget-object v0, p0, Lbj/E;->d:Lbj/a;

    invoke-virtual {v0}, Lbj/a;->M()Z

    move-result v3

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lbj/E;->d:Lbj/a;

    const/16 v5, 0x3a

    invoke-virtual {v0, v5}, Lbj/a;->m(C)V

    :cond_2
    :goto_1
    iget-object v0, p0, Lbj/E;->d:Lbj/a;

    invoke-virtual {v0}, Lbj/a;->f()Z

    move-result v0

    if-eqz v0, :cond_7

    if-eqz v1, :cond_6

    iget v0, p0, Lbj/E;->f:I

    if-ne v0, v4, :cond_4

    iget-object v5, p0, Lbj/E;->d:Lbj/a;

    iget v7, v5, Lbj/a;->a:I

    if-nez v3, :cond_3

    goto :goto_2

    :cond_3
    const/4 v9, 0x4

    const/4 v10, 0x0

    const-string v6, "Unexpected leading comma"

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lbj/a;->z(Lbj/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0

    :cond_4
    iget-object v1, p0, Lbj/E;->d:Lbj/a;

    iget v0, v1, Lbj/a;->a:I

    if-eqz v3, :cond_5

    goto :goto_2

    :cond_5
    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v2, "Expected comma after the key-value pair"

    const/4 v4, 0x0

    move v3, v0

    invoke-static/range {v1 .. v6}, Lbj/a;->z(Lbj/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0

    :cond_6
    :goto_2
    iget v0, p0, Lbj/E;->f:I

    add-int/lit8 v4, v0, 0x1

    iput v4, p0, Lbj/E;->f:I

    goto :goto_3

    :cond_7
    if-eqz v3, :cond_9

    iget-object v0, p0, Lbj/E;->b:Laj/b;

    invoke-virtual {v0}, Laj/b;->e()Laj/g;

    move-result-object v0

    invoke-virtual {v0}, Laj/g;->d()Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_3

    :cond_8
    iget-object v0, p0, Lbj/E;->d:Lbj/a;

    const/4 v1, 0x0

    invoke-static {v0, v1, v2, v1}, Lbj/r;->g(Lbj/a;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0

    :cond_9
    :goto_3
    return v4
.end method

.method private final P(LXi/f;)I
    .locals 5

    iget-object v0, p0, Lbj/E;->d:Lbj/a;

    invoke-virtual {v0}, Lbj/a;->M()Z

    move-result v0

    :goto_0
    iget-object v1, p0, Lbj/E;->d:Lbj/a;

    invoke-virtual {v1}, Lbj/a;->f()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_4

    invoke-direct {p0}, Lbj/E;->Q()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lbj/E;->d:Lbj/a;

    const/16 v3, 0x3a

    invoke-virtual {v1, v3}, Lbj/a;->m(C)V

    iget-object v1, p0, Lbj/E;->b:Laj/b;

    invoke-static {p1, v1, v0}, Lbj/t;->i(LXi/f;Laj/b;Ljava/lang/String;)I

    move-result v1

    const/4 v3, -0x3

    const/4 v4, 0x0

    if-eq v1, v3, :cond_2

    iget-object v2, p0, Lbj/E;->h:Laj/g;

    invoke-virtual {v2}, Laj/g;->g()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-direct {p0, p1, v1}, Lbj/E;->M(LXi/f;I)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, p0, Lbj/E;->d:Lbj/a;

    invoke-virtual {v1}, Lbj/a;->M()Z

    move-result v1

    move v2, v4

    goto :goto_1

    :cond_0
    iget-object p1, p0, Lbj/E;->i:Lbj/q;

    if-eqz p1, :cond_1

    invoke-virtual {p1, v1}, Lbj/q;->c(I)V

    :cond_1
    return v1

    :cond_2
    move v1, v4

    :goto_1
    if-eqz v2, :cond_3

    invoke-direct {p0, p1, v0}, Lbj/E;->R(LXi/f;Ljava/lang/String;)Z

    move-result v0

    goto :goto_0

    :cond_3
    move v0, v1

    goto :goto_0

    :cond_4
    if-eqz v0, :cond_6

    iget-object p1, p0, Lbj/E;->b:Laj/b;

    invoke-virtual {p1}, Laj/b;->e()Laj/g;

    move-result-object p1

    invoke-virtual {p1}, Laj/g;->d()Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_2

    :cond_5
    iget-object p1, p0, Lbj/E;->d:Lbj/a;

    const/4 v0, 0x0

    invoke-static {p1, v0, v2, v0}, Lbj/r;->g(Lbj/a;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    :cond_6
    :goto_2
    iget-object p1, p0, Lbj/E;->i:Lbj/q;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lbj/q;->d()I

    move-result p1

    goto :goto_3

    :cond_7
    const/4 p1, -0x1

    :goto_3
    return p1
.end method

.method private final Q()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbj/E;->h:Laj/g;

    invoke-virtual {v0}, Laj/g;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbj/E;->d:Lbj/a;

    invoke-virtual {v0}, Lbj/a;->t()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lbj/E;->d:Lbj/a;

    invoke-virtual {v0}, Lbj/a;->j()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method private final R(LXi/f;Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lbj/E;->b:Laj/b;

    invoke-static {p1, v0}, Lbj/t;->m(LXi/f;Laj/b;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lbj/E;->g:Lbj/E$a;

    invoke-direct {p0, p1, p2}, Lbj/E;->T(Lbj/E$a;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lbj/E;->d:Lbj/a;

    iget-object p1, p1, Lbj/a;->b:Lbj/u;

    invoke-virtual {p1}, Lbj/u;->b()V

    iget-object p1, p0, Lbj/E;->d:Lbj/a;

    invoke-virtual {p1, p2}, Lbj/a;->A(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    :goto_0
    iget-object p1, p0, Lbj/E;->d:Lbj/a;

    iget-object p2, p0, Lbj/E;->h:Laj/g;

    invoke-virtual {p2}, Laj/g;->q()Z

    move-result p2

    invoke-virtual {p1, p2}, Lbj/a;->I(Z)V

    :goto_1
    iget-object p1, p0, Lbj/E;->d:Lbj/a;

    invoke-virtual {p1}, Lbj/a;->M()Z

    move-result p1

    return p1
.end method

.method private final S(LXi/f;)V
    .locals 2

    :cond_0
    invoke-virtual {p0, p1}, Lbj/E;->k(LXi/f;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    return-void
.end method

.method private final T(Lbj/E$a;Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p1, Lbj/E$a;->a:Ljava/lang/String;

    invoke-static {v1, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    const/4 p2, 0x0

    iput-object p2, p1, Lbj/E$a;->a:Ljava/lang/String;

    const/4 p1, 0x1

    return p1

    :cond_1
    return v0
.end method


# virtual methods
.method public D()B
    .locals 10

    iget-object v0, p0, Lbj/E;->d:Lbj/a;

    invoke-virtual {v0}, Lbj/a;->n()J

    move-result-wide v0

    long-to-int v2, v0

    int-to-byte v2, v2

    int-to-long v3, v2

    cmp-long v3, v0, v3

    if-nez v3, :cond_0

    return v2

    :cond_0
    iget-object v4, p0, Lbj/E;->d:Lbj/a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to parse byte for input \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v0, 0x27

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lbj/a;->z(Lbj/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0
.end method

.method public F()S
    .locals 10

    iget-object v0, p0, Lbj/E;->d:Lbj/a;

    invoke-virtual {v0}, Lbj/a;->n()J

    move-result-wide v0

    long-to-int v2, v0

    int-to-short v2, v2

    int-to-long v3, v2

    cmp-long v3, v0, v3

    if-nez v3, :cond_0

    return v2

    :cond_0
    iget-object v4, p0, Lbj/E;->d:Lbj/a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to parse short for input \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v0, 0x27

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lbj/a;->z(Lbj/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0
.end method

.method public G()F
    .locals 6

    iget-object v0, p0, Lbj/E;->d:Lbj/a;

    invoke-virtual {v0}, Lbj/a;->s()Ljava/lang/String;

    move-result-object v1

    :try_start_0
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v1, p0, Lbj/E;->b:Laj/b;

    invoke-virtual {v1}, Laj/b;->e()Laj/g;

    move-result-object v1

    invoke-virtual {v1}, Laj/g;->b()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lbj/E;->d:Lbj/a;

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v1, v0}, Lbj/r;->j(Lbj/a;Ljava/lang/Number;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0

    :cond_1
    :goto_0
    return v0

    :catch_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to parse type \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "float"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\' for input \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lbj/a;->z(Lbj/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0
.end method

.method public I()D
    .locals 6

    iget-object v0, p0, Lbj/E;->d:Lbj/a;

    invoke-virtual {v0}, Lbj/a;->s()Ljava/lang/String;

    move-result-object v1

    :try_start_0
    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v2, p0, Lbj/E;->b:Laj/b;

    invoke-virtual {v2}, Laj/b;->e()Laj/g;

    move-result-object v2

    invoke-virtual {v2}, Laj/g;->b()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {v0, v1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lbj/E;->d:Lbj/a;

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v2, v0}, Lbj/r;->j(Lbj/a;Ljava/lang/Number;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0

    :cond_1
    :goto_0
    return-wide v0

    :catch_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to parse type \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "double"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\' for input \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lbj/a;->z(Lbj/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0
.end method

.method public a()Lcj/e;
    .locals 1

    iget-object v0, p0, Lbj/E;->e:Lcj/e;

    return-object v0
.end method

.method public b(LXi/f;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LXi/f;->e()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lbj/E;->b:Laj/b;

    invoke-static {p1, v0}, Lbj/t;->m(LXi/f;Laj/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lbj/E;->S(LXi/f;)V

    :cond_0
    iget-object p1, p0, Lbj/E;->d:Lbj/a;

    invoke-virtual {p1}, Lbj/a;->M()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lbj/E;->b:Laj/b;

    invoke-virtual {p1}, Laj/b;->e()Laj/g;

    move-result-object p1

    invoke-virtual {p1}, Laj/g;->d()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lbj/E;->d:Lbj/a;

    const-string v0, ""

    invoke-static {p1, v0}, Lbj/r;->f(Lbj/a;Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    iget-object p1, p0, Lbj/E;->d:Lbj/a;

    iget-object v0, p0, Lbj/E;->c:Lbj/M;

    iget-char v0, v0, Lbj/M;->end:C

    invoke-virtual {p1, v0}, Lbj/a;->m(C)V

    iget-object p1, p0, Lbj/E;->d:Lbj/a;

    iget-object p1, p1, Lbj/a;->b:Lbj/u;

    invoke-virtual {p1}, Lbj/u;->b()V

    return-void
.end method

.method public c(LXi/f;)LYi/c;
    .locals 7

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbj/E;->b:Laj/b;

    invoke-static {v0, p1}, Lbj/N;->b(Laj/b;LXi/f;)Lbj/M;

    move-result-object v3

    iget-object v0, p0, Lbj/E;->d:Lbj/a;

    iget-object v0, v0, Lbj/a;->b:Lbj/u;

    invoke-virtual {v0, p1}, Lbj/u;->c(LXi/f;)V

    iget-object v0, p0, Lbj/E;->d:Lbj/a;

    iget-char v1, v3, Lbj/M;->begin:C

    invoke-virtual {v0, v1}, Lbj/a;->m(C)V

    invoke-direct {p0}, Lbj/E;->L()V

    sget-object v0, Lbj/E$b;->a:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lbj/E;->c:Lbj/M;

    if-ne v0, v3, :cond_0

    iget-object v0, p0, Lbj/E;->b:Laj/b;

    invoke-virtual {v0}, Laj/b;->e()Laj/g;

    move-result-object v0

    invoke-virtual {v0}, Laj/g;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    new-instance v0, Lbj/E;

    iget-object v2, p0, Lbj/E;->b:Laj/b;

    iget-object v4, p0, Lbj/E;->d:Lbj/a;

    iget-object v6, p0, Lbj/E;->g:Lbj/E$a;

    move-object v1, v0

    move-object v5, p1

    invoke-direct/range {v1 .. v6}, Lbj/E;-><init>(Laj/b;Lbj/M;Lbj/a;LXi/f;Lbj/E$a;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lbj/E;

    iget-object v2, p0, Lbj/E;->b:Laj/b;

    iget-object v4, p0, Lbj/E;->d:Lbj/a;

    iget-object v6, p0, Lbj/E;->g:Lbj/E$a;

    move-object v1, v0

    move-object v5, p1

    invoke-direct/range {v1 .. v6}, Lbj/E;-><init>(Laj/b;Lbj/M;Lbj/a;LXi/f;Lbj/E$a;)V

    :goto_0
    return-object v0
.end method

.method public final d()Laj/b;
    .locals 1

    iget-object v0, p0, Lbj/E;->b:Laj/b;

    return-object v0
.end method

.method public e(LXi/f;)I
    .locals 4

    const-string v0, "enumDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbj/E;->b:Laj/b;

    invoke-virtual {p0}, Lbj/E;->s()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " at path "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lbj/E;->d:Lbj/a;

    iget-object v3, v3, Lbj/a;->b:Lbj/u;

    invoke-virtual {v3}, Lbj/u;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v0, v1, v2}, Lbj/t;->j(LXi/f;Laj/b;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public f()Z
    .locals 1

    iget-object v0, p0, Lbj/E;->d:Lbj/a;

    invoke-virtual {v0}, Lbj/a;->h()Z

    move-result v0

    return v0
.end method

.method public g()C
    .locals 7

    iget-object v0, p0, Lbj/E;->d:Lbj/a;

    invoke-virtual {v0}, Lbj/a;->s()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    return v0

    :cond_0
    iget-object v1, p0, Lbj/E;->d:Lbj/a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Expected single char, but got \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x27

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lbj/a;->z(Lbj/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0
.end method

.method public k(LXi/f;)I
    .locals 2

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbj/E;->c:Lbj/M;

    sget-object v1, Lbj/E$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    invoke-direct {p0}, Lbj/E;->N()I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lbj/E;->P(LXi/f;)I

    move-result p1

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lbj/E;->O()I

    move-result p1

    :goto_0
    iget-object v0, p0, Lbj/E;->c:Lbj/M;

    sget-object v1, Lbj/M;->MAP:Lbj/M;

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lbj/E;->d:Lbj/a;

    iget-object v0, v0, Lbj/a;->b:Lbj/u;

    invoke-virtual {v0, p1}, Lbj/u;->g(I)V

    :cond_2
    return p1
.end method

.method public l(LXi/f;)LYi/e;
    .locals 2

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lbj/G;->b(LXi/f;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, Lbj/p;

    iget-object v0, p0, Lbj/E;->d:Lbj/a;

    iget-object v1, p0, Lbj/E;->b:Laj/b;

    invoke-direct {p1, v0, v1}, Lbj/p;-><init>(Lbj/a;Laj/b;)V

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, LYi/a;->l(LXi/f;)LYi/e;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public m()Laj/j;
    .locals 3

    new-instance v0, Lbj/C;

    iget-object v1, p0, Lbj/E;->b:Laj/b;

    invoke-virtual {v1}, Laj/b;->e()Laj/g;

    move-result-object v1

    iget-object v2, p0, Lbj/E;->d:Lbj/a;

    invoke-direct {v0, v1, v2}, Lbj/C;-><init>(Laj/g;Lbj/a;)V

    invoke-virtual {v0}, Lbj/C;->e()Laj/j;

    move-result-object v0

    return-object v0
.end method

.method public n()I
    .locals 10

    iget-object v0, p0, Lbj/E;->d:Lbj/a;

    invoke-virtual {v0}, Lbj/a;->n()J

    move-result-wide v0

    long-to-int v2, v0

    int-to-long v3, v2

    cmp-long v3, v0, v3

    if-nez v3, :cond_0

    return v2

    :cond_0
    iget-object v4, p0, Lbj/E;->d:Lbj/a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to parse int for input \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v0, 0x27

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lbj/a;->z(Lbj/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0
.end method

.method public p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deserializer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbj/E;->c:Lbj/M;

    sget-object v1, Lbj/M;->MAP:Lbj/M;

    if-ne v0, v1, :cond_0

    and-int/lit8 v0, p2, 0x1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v1, p0, Lbj/E;->d:Lbj/a;

    iget-object v1, v1, Lbj/a;->b:Lbj/u;

    invoke-virtual {v1}, Lbj/u;->d()V

    :cond_1
    invoke-super {p0, p1, p2, p3, p4}, LYi/a;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz v0, :cond_2

    iget-object p2, p0, Lbj/E;->d:Lbj/a;

    iget-object p2, p2, Lbj/a;->b:Lbj/u;

    invoke-virtual {p2, p1}, Lbj/u;->f(Ljava/lang/Object;)V

    :cond_2
    return-object p1
.end method

.method public r()Ljava/lang/Void;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public s()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbj/E;->h:Laj/g;

    invoke-virtual {v0}, Laj/g;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbj/E;->d:Lbj/a;

    invoke-virtual {v0}, Lbj/a;->t()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lbj/E;->d:Lbj/a;

    invoke-virtual {v0}, Lbj/a;->q()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public t(LVi/a;)Ljava/lang/Object;
    .locals 11

    const-string v0, "deserializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    :try_start_0
    instance-of v2, p1, LZi/b;

    if-eqz v2, :cond_6

    iget-object v2, p0, Lbj/E;->b:Laj/b;

    invoke-virtual {v2}, Laj/b;->e()Laj/g;

    move-result-object v2

    invoke-virtual {v2}, Laj/g;->p()Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_3

    :cond_0
    move-object v2, p1

    check-cast v2, LZi/b;

    invoke-interface {v2}, LVi/b;->a()LXi/f;

    move-result-object v2

    iget-object v3, p0, Lbj/E;->b:Laj/b;

    invoke-static {v2, v3}, Lbj/D;->c(LXi/f;Laj/b;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lbj/E;->d:Lbj/a;

    iget-object v4, p0, Lbj/E;->h:Laj/g;

    invoke-virtual {v4}, Laj/g;->q()Z

    move-result v4

    invoke-virtual {v3, v2, v4}, Lbj/a;->E(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_5

    instance-of v2, p1, LZi/b;

    if-eqz v2, :cond_4

    invoke-interface {p0}, Laj/i;->d()Laj/b;

    move-result-object v2

    invoke-virtual {v2}, Laj/b;->e()Laj/g;

    move-result-object v2

    invoke-virtual {v2}, Laj/g;->p()Z

    move-result v2

    if-eqz v2, :cond_1

    goto/16 :goto_1

    :cond_1
    move-object v2, p1

    check-cast v2, LZi/b;

    invoke-interface {v2}, LVi/b;->a()LXi/f;

    move-result-object v2

    invoke-interface {p0}, Laj/i;->d()Laj/b;

    move-result-object v3

    invoke-static {v2, v3}, Lbj/D;->c(LXi/f;Laj/b;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0}, Laj/i;->m()Laj/j;

    move-result-object v3

    move-object v4, p1

    check-cast v4, LZi/b;

    invoke-interface {v4}, LVi/b;->a()LXi/f;

    move-result-object v4

    invoke-interface {v4}, LXi/f;->a()Ljava/lang/String;

    move-result-object v4

    instance-of v5, v3, Laj/E;

    const/4 v6, -0x1

    if-eqz v5, :cond_3

    check-cast v3, Laj/E;

    invoke-virtual {v3, v2}, Laj/E;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Laj/j;

    if-eqz v4, :cond_2

    invoke-static {v4}, Laj/k;->i(Laj/j;)Laj/G;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-static {v4}, Laj/k;->e(Laj/G;)Ljava/lang/String;

    move-result-object v4
    :try_end_0
    .catch Lkotlinx/serialization/MissingFieldException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto/16 :goto_4

    :cond_2
    move-object v4, v1

    :goto_0
    :try_start_1
    check-cast p1, LZi/b;

    invoke-static {p1, p0, v4}, LVi/g;->a(LZi/b;LYi/c;Ljava/lang/String;)LVi/a;

    move-result-object p1
    :try_end_1
    .catch Lkotlinx/serialization/SerializationException; {:try_start_1 .. :try_end_1} :catch_1

    :try_start_2
    const-string v4, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Laj/i;->d()Laj/b;

    move-result-object v4

    invoke-static {v4, v2, v3, p1}, Lbj/L;->b(Laj/b;Ljava/lang/String;Laj/E;LVi/a;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_2

    :catch_1
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v3}, Laj/E;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v6, p1, v2}, Lbj/r;->e(ILjava/lang/String;Ljava/lang/CharSequence;)Lkotlinx/serialization/json/internal/JsonDecodingException;

    move-result-object p1

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v2, Laj/E;

    invoke-static {v2}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v2

    invoke-interface {v2}, Lth/d;->v()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", but had "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v2

    invoke-interface {v2}, Lth/d;->v()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " as the serialized body of "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " at element: "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lbj/E;->d:Lbj/a;

    iget-object v2, v2, Lbj/a;->b:Lbj/u;

    invoke-virtual {v2}, Lbj/u;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v6, p1, v2}, Lbj/r;->e(ILjava/lang/String;Ljava/lang/CharSequence;)Lkotlinx/serialization/json/internal/JsonDecodingException;

    move-result-object p1

    throw p1

    :cond_4
    :goto_1
    invoke-interface {p1, p0}, LVi/a;->c(LYi/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catch Lkotlinx/serialization/MissingFieldException; {:try_start_2 .. :try_end_2} :catch_0

    :goto_2
    return-object p1

    :cond_5
    :try_start_3
    check-cast p1, LZi/b;

    invoke-static {p1, p0, v3}, LVi/g;->a(LZi/b;LYi/c;Ljava/lang/String;)LVi/a;

    move-result-object p1
    :try_end_3
    .catch Lkotlinx/serialization/SerializationException; {:try_start_3 .. :try_end_3} :catch_2

    :try_start_4
    const-string v3, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.StreamingJsonDecoder.decodeSerializableValue>"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lbj/E$a;

    invoke-direct {v3, v2}, Lbj/E$a;-><init>(Ljava/lang/String;)V

    iput-object v3, p0, Lbj/E;->g:Lbj/E$a;

    invoke-interface {p1, p0}, LVi/a;->c(LYi/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :catch_2
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    const/16 v3, 0xa

    invoke-static {v2, v3, v1, v0, v1}, Lkotlin/text/t;->k1(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "."

    invoke-static {v2, v4}, Lkotlin/text/t;->H0(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    const-string v2, ""

    invoke-static {p1, v3, v2}, Lkotlin/text/t;->a1(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    move-result-object v8

    iget-object v5, p0, Lbj/E;->d:Lbj/a;

    const/4 v9, 0x2

    const/4 v10, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lbj/a;->z(Lbj/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    :cond_6
    :goto_3
    invoke-interface {p1, p0}, LVi/a;->c(LYi/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_4
    .catch Lkotlinx/serialization/MissingFieldException; {:try_start_4 .. :try_end_4} :catch_0

    return-object p1

    :goto_4
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    const-string v3, "at path"

    const/4 v4, 0x0

    invoke-static {v2, v3, v4, v0, v1}, Lkotlin/text/t;->W(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    throw p1

    :cond_7
    new-instance v0, Lkotlinx/serialization/MissingFieldException;

    invoke-virtual {p1}, Lkotlinx/serialization/MissingFieldException;->a()Ljava/util/List;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " at path: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lbj/E;->d:Lbj/a;

    iget-object v3, v3, Lbj/a;->b:Lbj/u;

    invoke-virtual {v3}, Lbj/u;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2, p1}, Lkotlinx/serialization/MissingFieldException;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public v()J
    .locals 2

    iget-object v0, p0, Lbj/E;->d:Lbj/a;

    invoke-virtual {v0}, Lbj/a;->n()J

    move-result-wide v0

    return-wide v0
.end method

.method public y()Z
    .locals 4

    iget-object v0, p0, Lbj/E;->i:Lbj/q;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lbj/q;->b()Z

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-nez v0, :cond_1

    iget-object v0, p0, Lbj/E;->d:Lbj/a;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v1, v3, v2}, Lbj/a;->O(Lbj/a;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    move v1, v3

    :cond_1
    return v1
.end method
