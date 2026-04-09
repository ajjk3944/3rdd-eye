.class public final LL0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LL0/L;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LL0/L;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LL0/g;->a:LL0/L;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LL0/g;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-object v1, p0, LL0/g;->a:LL0/L;

    invoke-virtual {v1}, LL0/L;->j()LL0/d;

    move-result-object v3

    check-cast p1, LL0/g;

    iget-object v4, p1, LL0/g;->a:LL0/L;

    invoke-virtual {v4}, LL0/L;->j()LL0/d;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    return v2

    :cond_2
    invoke-virtual {v1}, LL0/L;->i()LL0/U;

    move-result-object v3

    iget-object v4, p1, LL0/g;->a:LL0/L;

    invoke-virtual {v4}, LL0/L;->i()LL0/U;

    move-result-object v4

    invoke-virtual {v3, v4}, LL0/U;->G(LL0/U;)Z

    move-result v3

    if-nez v3, :cond_3

    return v2

    :cond_3
    invoke-virtual {v1}, LL0/L;->g()Ljava/util/List;

    move-result-object v3

    iget-object v4, p1, LL0/g;->a:LL0/L;

    invoke-virtual {v4}, LL0/L;->g()Ljava/util/List;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    return v2

    :cond_4
    invoke-virtual {v1}, LL0/L;->e()I

    move-result v3

    iget-object v4, p1, LL0/g;->a:LL0/L;

    invoke-virtual {v4}, LL0/L;->e()I

    move-result v4

    if-eq v3, v4, :cond_5

    return v2

    :cond_5
    invoke-virtual {v1}, LL0/L;->h()Z

    move-result v3

    iget-object v4, p1, LL0/g;->a:LL0/L;

    invoke-virtual {v4}, LL0/L;->h()Z

    move-result v4

    if-eq v3, v4, :cond_6

    return v2

    :cond_6
    invoke-virtual {v1}, LL0/L;->f()I

    move-result v3

    iget-object v4, p1, LL0/g;->a:LL0/L;

    invoke-virtual {v4}, LL0/L;->f()I

    move-result v4

    invoke-static {v3, v4}, LW0/t;->e(II)Z

    move-result v3

    if-nez v3, :cond_7

    return v2

    :cond_7
    invoke-virtual {v1}, LL0/L;->b()LY0/d;

    move-result-object v3

    iget-object v4, p1, LL0/g;->a:LL0/L;

    invoke-virtual {v4}, LL0/L;->b()LY0/d;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    return v2

    :cond_8
    invoke-virtual {v1}, LL0/L;->d()LY0/t;

    move-result-object v3

    iget-object v4, p1, LL0/g;->a:LL0/L;

    invoke-virtual {v4}, LL0/L;->d()LY0/t;

    move-result-object v4

    if-eq v3, v4, :cond_9

    return v2

    :cond_9
    invoke-virtual {v1}, LL0/L;->c()LQ0/k$b;

    move-result-object v3

    iget-object v4, p1, LL0/g;->a:LL0/L;

    invoke-virtual {v4}, LL0/L;->c()LQ0/k$b;

    move-result-object v4

    if-eq v3, v4, :cond_a

    return v2

    :cond_a
    invoke-virtual {v1}, LL0/L;->a()J

    move-result-wide v3

    invoke-static {v3, v4}, LY0/b;->l(J)I

    move-result v3

    iget-object v4, p1, LL0/g;->a:LL0/L;

    invoke-virtual {v4}, LL0/L;->a()J

    move-result-wide v4

    invoke-static {v4, v5}, LY0/b;->l(J)I

    move-result v4

    if-eq v3, v4, :cond_b

    return v2

    :cond_b
    invoke-virtual {v1}, LL0/L;->a()J

    move-result-wide v3

    invoke-static {v3, v4}, LY0/b;->k(J)I

    move-result v1

    iget-object p1, p1, LL0/g;->a:LL0/L;

    invoke-virtual {p1}, LL0/L;->a()J

    move-result-wide v3

    invoke-static {v3, v4}, LY0/b;->k(J)I

    move-result p1

    if-eq v1, p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, LL0/g;->a:LL0/L;

    invoke-virtual {v0}, LL0/L;->j()LL0/d;

    move-result-object v1

    invoke-virtual {v1}, LL0/d;->hashCode()I

    move-result v1

    mul-int/lit8 v1, v1, 0x1f

    invoke-virtual {v0}, LL0/L;->i()LL0/U;

    move-result-object v2

    invoke-virtual {v2}, LL0/U;->H()I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    invoke-virtual {v0}, LL0/L;->g()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    invoke-virtual {v0}, LL0/L;->e()I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    invoke-virtual {v0}, LL0/L;->h()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    invoke-virtual {v0}, LL0/L;->f()I

    move-result v2

    invoke-static {v2}, LW0/t;->f(I)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    invoke-virtual {v0}, LL0/L;->b()LY0/d;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    invoke-virtual {v0}, LL0/L;->d()LY0/t;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    invoke-virtual {v0}, LL0/L;->c()LQ0/k$b;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    invoke-virtual {v0}, LL0/L;->a()J

    move-result-wide v2

    invoke-static {v2, v3}, LY0/b;->l(J)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    invoke-virtual {v0}, LL0/L;->a()J

    move-result-wide v2

    invoke-static {v2, v3}, LY0/b;->k(J)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    add-int/2addr v1, v0

    return v1
.end method
