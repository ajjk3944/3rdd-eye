.class public abstract Lj1/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static a:[Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x3

    new-array v0, v0, [Z

    sput-object v0, Lj1/k;->a:[Z

    return-void
.end method

.method static a(Lj1/f;Lc1/d;Lj1/e;)V
    .locals 6

    const/4 v0, -0x1

    iput v0, p2, Lj1/e;->t:I

    iput v0, p2, Lj1/e;->u:I

    iget-object v0, p0, Lj1/e;->Y:[Lj1/e$b;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    sget-object v2, Lj1/e$b;->WRAP_CONTENT:Lj1/e$b;

    const/4 v3, 0x2

    if-eq v0, v2, :cond_0

    iget-object v0, p2, Lj1/e;->Y:[Lj1/e$b;

    aget-object v0, v0, v1

    sget-object v1, Lj1/e$b;->MATCH_PARENT:Lj1/e$b;

    if-ne v0, v1, :cond_0

    iget-object v0, p2, Lj1/e;->N:Lj1/d;

    iget v0, v0, Lj1/d;->g:I

    invoke-virtual {p0}, Lj1/e;->O()I

    move-result v1

    iget-object v4, p2, Lj1/e;->P:Lj1/d;

    iget v4, v4, Lj1/d;->g:I

    sub-int/2addr v1, v4

    iget-object v4, p2, Lj1/e;->N:Lj1/d;

    invoke-virtual {p1, v4}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object v5

    iput-object v5, v4, Lj1/d;->i:Lc1/i;

    iget-object v4, p2, Lj1/e;->P:Lj1/d;

    invoke-virtual {p1, v4}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object v5

    iput-object v5, v4, Lj1/d;->i:Lc1/i;

    iget-object v4, p2, Lj1/e;->N:Lj1/d;

    iget-object v4, v4, Lj1/d;->i:Lc1/i;

    invoke-virtual {p1, v4, v0}, Lc1/d;->f(Lc1/i;I)V

    iget-object v4, p2, Lj1/e;->P:Lj1/d;

    iget-object v4, v4, Lj1/d;->i:Lc1/i;

    invoke-virtual {p1, v4, v1}, Lc1/d;->f(Lc1/i;I)V

    iput v3, p2, Lj1/e;->t:I

    invoke-virtual {p2, v0, v1}, Lj1/e;->C0(II)V

    :cond_0
    iget-object v0, p0, Lj1/e;->Y:[Lj1/e$b;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    if-eq v0, v2, :cond_3

    iget-object v0, p2, Lj1/e;->Y:[Lj1/e$b;

    aget-object v0, v0, v1

    sget-object v1, Lj1/e$b;->MATCH_PARENT:Lj1/e$b;

    if-ne v0, v1, :cond_3

    iget-object v0, p2, Lj1/e;->O:Lj1/d;

    iget v0, v0, Lj1/d;->g:I

    invoke-virtual {p0}, Lj1/e;->u()I

    move-result p0

    iget-object v1, p2, Lj1/e;->Q:Lj1/d;

    iget v1, v1, Lj1/d;->g:I

    sub-int/2addr p0, v1

    iget-object v1, p2, Lj1/e;->O:Lj1/d;

    invoke-virtual {p1, v1}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object v2

    iput-object v2, v1, Lj1/d;->i:Lc1/i;

    iget-object v1, p2, Lj1/e;->Q:Lj1/d;

    invoke-virtual {p1, v1}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object v2

    iput-object v2, v1, Lj1/d;->i:Lc1/i;

    iget-object v1, p2, Lj1/e;->O:Lj1/d;

    iget-object v1, v1, Lj1/d;->i:Lc1/i;

    invoke-virtual {p1, v1, v0}, Lc1/d;->f(Lc1/i;I)V

    iget-object v1, p2, Lj1/e;->Q:Lj1/d;

    iget-object v1, v1, Lj1/d;->i:Lc1/i;

    invoke-virtual {p1, v1, p0}, Lc1/d;->f(Lc1/i;I)V

    iget v1, p2, Lj1/e;->k0:I

    if-gtz v1, :cond_1

    invoke-virtual {p2}, Lj1/e;->N()I

    move-result v1

    const/16 v2, 0x8

    if-ne v1, v2, :cond_2

    :cond_1
    iget-object v1, p2, Lj1/e;->R:Lj1/d;

    invoke-virtual {p1, v1}, Lc1/d;->q(Ljava/lang/Object;)Lc1/i;

    move-result-object v2

    iput-object v2, v1, Lj1/d;->i:Lc1/i;

    iget-object v1, p2, Lj1/e;->R:Lj1/d;

    iget-object v1, v1, Lj1/d;->i:Lc1/i;

    iget v2, p2, Lj1/e;->k0:I

    add-int/2addr v2, v0

    invoke-virtual {p1, v1, v2}, Lc1/d;->f(Lc1/i;I)V

    :cond_2
    iput v3, p2, Lj1/e;->u:I

    invoke-virtual {p2, v0, p0}, Lj1/e;->P0(II)V

    :cond_3
    return-void
.end method

.method public static final b(II)Z
    .locals 0

    and-int/2addr p0, p1

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
