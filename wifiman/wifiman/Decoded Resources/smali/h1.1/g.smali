.class public Lh1/g;
.super Lg1/e;
.source "SourceFile"


# instance fields
.field private A0:Ljava/lang/String;

.field private B0:Ljava/lang/String;

.field private C0:Ljava/lang/String;

.field private D0:Ljava/lang/String;

.field private E0:I

.field private q0:Li1/b;

.field private r0:I

.field private s0:I

.field private t0:I

.field private u0:I

.field private v0:I

.field private w0:I

.field private x0:I

.field private y0:F

.field private z0:F


# direct methods
.method public constructor <init>(Lg1/g;Lg1/g$d;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lg1/e;-><init>(Lg1/g;Lg1/g$d;)V

    const/4 p1, 0x0

    iput p1, p0, Lh1/g;->r0:I

    iput p1, p0, Lh1/g;->s0:I

    iput p1, p0, Lh1/g;->t0:I

    iput p1, p0, Lh1/g;->u0:I

    sget-object p1, Lg1/g$d;->ROW:Lg1/g$d;

    const/4 v0, 0x1

    if-ne p2, p1, :cond_0

    iput v0, p0, Lh1/g;->w0:I

    goto :goto_0

    :cond_0
    sget-object p1, Lg1/g$d;->COLUMN:Lg1/g$d;

    if-ne p2, p1, :cond_1

    iput v0, p0, Lh1/g;->x0:I

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public A0(F)V
    .locals 0

    iput p1, p0, Lh1/g;->y0:F

    return-void
.end method

.method public B0(I)V
    .locals 0

    iput p1, p0, Lh1/g;->v0:I

    return-void
.end method

.method public C0(I)V
    .locals 0

    iput p1, p0, Lh1/g;->u0:I

    return-void
.end method

.method public D0(I)V
    .locals 0

    iput p1, p0, Lh1/g;->s0:I

    return-void
.end method

.method public E0(I)V
    .locals 0

    iput p1, p0, Lh1/g;->r0:I

    return-void
.end method

.method public F0(I)V
    .locals 0

    iput p1, p0, Lh1/g;->t0:I

    return-void
.end method

.method public G0(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lh1/g;->A0:Ljava/lang/String;

    return-void
.end method

.method public H0(I)V
    .locals 2

    invoke-super {p0}, Lg1/e;->v0()Lg1/g$d;

    move-result-object v0

    sget-object v1, Lg1/g$d;->COLUMN:Lg1/g$d;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iput p1, p0, Lh1/g;->w0:I

    return-void
.end method

.method public I0(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lh1/g;->D0:Ljava/lang/String;

    return-void
.end method

.method public J0(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lh1/g;->C0:Ljava/lang/String;

    return-void
.end method

.method public K0(F)V
    .locals 0

    iput p1, p0, Lh1/g;->z0:F

    return-void
.end method

.method public apply()V
    .locals 3

    invoke-virtual {p0}, Lh1/g;->u0()Lj1/j;

    iget-object v0, p0, Lh1/g;->q0:Li1/b;

    iget v1, p0, Lh1/g;->v0:I

    invoke-virtual {v0, v1}, Li1/b;->Y1(I)V

    iget v0, p0, Lh1/g;->w0:I

    if-eqz v0, :cond_0

    iget-object v1, p0, Lh1/g;->q0:Li1/b;

    invoke-virtual {v1, v0}, Li1/b;->a2(I)V

    :cond_0
    iget v0, p0, Lh1/g;->x0:I

    if-eqz v0, :cond_1

    iget-object v1, p0, Lh1/g;->q0:Li1/b;

    invoke-virtual {v1, v0}, Li1/b;->V1(I)V

    :cond_1
    iget v0, p0, Lh1/g;->y0:F

    const/4 v1, 0x0

    cmpl-float v2, v0, v1

    if-eqz v2, :cond_2

    iget-object v2, p0, Lh1/g;->q0:Li1/b;

    invoke-virtual {v2, v0}, Li1/b;->X1(F)V

    :cond_2
    iget v0, p0, Lh1/g;->z0:F

    cmpl-float v1, v0, v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lh1/g;->q0:Li1/b;

    invoke-virtual {v1, v0}, Li1/b;->d2(F)V

    :cond_3
    iget-object v0, p0, Lh1/g;->A0:Ljava/lang/String;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lh1/g;->q0:Li1/b;

    iget-object v1, p0, Lh1/g;->A0:Ljava/lang/String;

    invoke-virtual {v0, v1}, Li1/b;->Z1(Ljava/lang/String;)V

    :cond_4
    iget-object v0, p0, Lh1/g;->B0:Ljava/lang/String;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lh1/g;->q0:Li1/b;

    iget-object v1, p0, Lh1/g;->B0:Ljava/lang/String;

    invoke-virtual {v0, v1}, Li1/b;->U1(Ljava/lang/String;)V

    :cond_5
    iget-object v0, p0, Lh1/g;->C0:Ljava/lang/String;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Lh1/g;->q0:Li1/b;

    iget-object v1, p0, Lh1/g;->C0:Ljava/lang/String;

    invoke-virtual {v0, v1}, Li1/b;->c2(Ljava/lang/CharSequence;)V

    :cond_6
    iget-object v0, p0, Lh1/g;->D0:Ljava/lang/String;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p0, Lh1/g;->q0:Li1/b;

    iget-object v1, p0, Lh1/g;->D0:Ljava/lang/String;

    invoke-virtual {v0, v1}, Li1/b;->b2(Ljava/lang/String;)V

    :cond_7
    iget-object v0, p0, Lh1/g;->q0:Li1/b;

    iget v1, p0, Lh1/g;->E0:I

    invoke-virtual {v0, v1}, Li1/b;->W1(I)V

    iget-object v0, p0, Lh1/g;->q0:Li1/b;

    iget v1, p0, Lh1/g;->r0:I

    invoke-virtual {v0, v1}, Lj1/l;->u1(I)V

    iget-object v0, p0, Lh1/g;->q0:Li1/b;

    iget v1, p0, Lh1/g;->s0:I

    invoke-virtual {v0, v1}, Lj1/l;->r1(I)V

    iget-object v0, p0, Lh1/g;->q0:Li1/b;

    iget v1, p0, Lh1/g;->t0:I

    invoke-virtual {v0, v1}, Lj1/l;->v1(I)V

    iget-object v0, p0, Lh1/g;->q0:Li1/b;

    iget v1, p0, Lh1/g;->u0:I

    invoke-virtual {v0, v1}, Lj1/l;->q1(I)V

    invoke-virtual {p0}, Lg1/e;->t0()V

    return-void
.end method

.method public u0()Lj1/j;
    .locals 1

    iget-object v0, p0, Lh1/g;->q0:Li1/b;

    if-nez v0, :cond_0

    new-instance v0, Li1/b;

    invoke-direct {v0}, Li1/b;-><init>()V

    iput-object v0, p0, Lh1/g;->q0:Li1/b;

    :cond_0
    iget-object v0, p0, Lh1/g;->q0:Li1/b;

    return-object v0
.end method

.method public w0(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lh1/g;->B0:Ljava/lang/String;

    return-void
.end method

.method public x0(I)V
    .locals 2

    invoke-super {p0}, Lg1/e;->v0()Lg1/g$d;

    move-result-object v0

    sget-object v1, Lg1/g$d;->ROW:Lg1/g$d;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iput p1, p0, Lh1/g;->x0:I

    return-void
.end method

.method public y0(I)V
    .locals 0

    iput p1, p0, Lh1/g;->E0:I

    return-void
.end method

.method public z0(Ljava/lang/String;)V
    .locals 4

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "\\|"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    iput v0, p0, Lh1/g;->E0:I

    array-length v1, p1

    :goto_0
    if-ge v0, v1, :cond_3

    aget-object v2, p1, v0

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    const-string v3, "subgridbycolrow"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    const-string v3, "spansrespectwidgetorder"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    iget v2, p0, Lh1/g;->E0:I

    or-int/lit8 v2, v2, 0x2

    iput v2, p0, Lh1/g;->E0:I

    goto :goto_1

    :cond_2
    iget v2, p0, Lh1/g;->E0:I

    or-int/lit8 v2, v2, 0x1

    iput v2, p0, Lh1/g;->E0:I

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method
