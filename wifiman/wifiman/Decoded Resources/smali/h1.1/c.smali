.class public Lh1/c;
.super Lg1/e;
.source "SourceFile"


# instance fields
.field private q0:Lg1/g$c;

.field private r0:I

.field private s0:Lj1/a;


# direct methods
.method public constructor <init>(Lg1/g;)V
    .locals 1

    sget-object v0, Lg1/g$d;->BARRIER:Lg1/g$d;

    invoke-direct {p0, p1, v0}, Lg1/e;-><init>(Lg1/g;Lg1/g$d;)V

    return-void
.end method


# virtual methods
.method public J(I)Lg1/a;
    .locals 0

    iput p1, p0, Lh1/c;->r0:I

    return-object p0
.end method

.method public K(Ljava/lang/Object;)Lg1/a;
    .locals 1

    iget-object v0, p0, Lg1/e;->m0:Lg1/g;

    invoke-virtual {v0, p1}, Lg1/g;->e(Ljava/lang/Object;)I

    move-result p1

    invoke-virtual {p0, p1}, Lh1/c;->J(I)Lg1/a;

    return-object p0
.end method

.method public apply()V
    .locals 3

    invoke-virtual {p0}, Lh1/c;->u0()Lj1/j;

    sget-object v0, Lh1/c$a;->a:[I

    iget-object v1, p0, Lh1/c;->q0:Lg1/g$c;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v2, 0x4

    if-eq v0, v2, :cond_1

    const/4 v2, 0x5

    if-eq v0, v2, :cond_0

    const/4 v2, 0x6

    if-eq v0, v2, :cond_2

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    :cond_2
    :goto_0
    iget-object v0, p0, Lh1/c;->s0:Lj1/a;

    invoke-virtual {v0, v1}, Lj1/a;->j1(I)V

    iget-object v0, p0, Lh1/c;->s0:Lj1/a;

    iget v1, p0, Lh1/c;->r0:I

    invoke-virtual {v0, v1}, Lj1/a;->k1(I)V

    return-void
.end method

.method public u0()Lj1/j;
    .locals 1

    iget-object v0, p0, Lh1/c;->s0:Lj1/a;

    if-nez v0, :cond_0

    new-instance v0, Lj1/a;

    invoke-direct {v0}, Lj1/a;-><init>()V

    iput-object v0, p0, Lh1/c;->s0:Lj1/a;

    :cond_0
    iget-object v0, p0, Lh1/c;->s0:Lj1/a;

    return-object v0
.end method

.method public w0(Lg1/g$c;)V
    .locals 0

    iput-object p1, p0, Lh1/c;->q0:Lg1/g$c;

    return-void
.end method
