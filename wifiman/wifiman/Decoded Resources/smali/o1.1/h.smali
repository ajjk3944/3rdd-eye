.class public Lo1/h;
.super Lo1/e;
.source "SourceFile"


# instance fields
.field private A0:I

.field private B0:I

.field protected w0:F

.field protected x0:I

.field protected y0:I

.field private z0:Lo1/d;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lo1/e;-><init>()V

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lo1/h;->w0:F

    const/4 v0, -0x1

    iput v0, p0, Lo1/h;->x0:I

    iput v0, p0, Lo1/h;->y0:I

    iget-object v0, p0, Lo1/e;->C:Lo1/d;

    iput-object v0, p0, Lo1/h;->z0:Lo1/d;

    const/4 v0, 0x0

    iput v0, p0, Lo1/h;->A0:I

    iput v0, p0, Lo1/h;->B0:I

    iget-object v1, p0, Lo1/e;->K:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v1, p0, Lo1/e;->K:Ljava/util/ArrayList;

    iget-object v2, p0, Lo1/h;->z0:Lo1/d;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lo1/e;->J:[Lo1/d;

    array-length v1, v1

    :goto_0
    if-ge v0, v1, :cond_0

    iget-object v2, p0, Lo1/e;->J:[Lo1/d;

    iget-object v3, p0, Lo1/h;->z0:Lo1/d;

    aput-object v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public J0(Ln1/d;)V
    .locals 3

    invoke-virtual {p0}, Lo1/e;->G()Lo1/e;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lo1/h;->z0:Lo1/d;

    invoke-virtual {p1, v0}, Ln1/d;->x(Ljava/lang/Object;)I

    move-result p1

    iget v0, p0, Lo1/h;->A0:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    invoke-virtual {p0, p1}, Lo1/e;->F0(I)V

    invoke-virtual {p0, v2}, Lo1/e;->G0(I)V

    invoke-virtual {p0}, Lo1/e;->G()Lo1/e;

    move-result-object p1

    invoke-virtual {p1}, Lo1/e;->v()I

    move-result p1

    invoke-virtual {p0, p1}, Lo1/e;->h0(I)V

    invoke-virtual {p0, v2}, Lo1/e;->E0(I)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v2}, Lo1/e;->F0(I)V

    invoke-virtual {p0, p1}, Lo1/e;->G0(I)V

    invoke-virtual {p0}, Lo1/e;->G()Lo1/e;

    move-result-object p1

    invoke-virtual {p1}, Lo1/e;->P()I

    move-result p1

    invoke-virtual {p0, p1}, Lo1/e;->E0(I)V

    invoke-virtual {p0, v2}, Lo1/e;->h0(I)V

    :goto_0
    return-void
.end method

.method public K0()I
    .locals 1

    iget v0, p0, Lo1/h;->A0:I

    return v0
.end method

.method public L0()I
    .locals 1

    iget v0, p0, Lo1/h;->x0:I

    return v0
.end method

.method public M0()I
    .locals 1

    iget v0, p0, Lo1/h;->y0:I

    return v0
.end method

.method public N0()F
    .locals 1

    iget v0, p0, Lo1/h;->w0:F

    return v0
.end method

.method public O0(I)V
    .locals 2

    const/4 v0, -0x1

    if-le p1, v0, :cond_0

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, Lo1/h;->w0:F

    iput p1, p0, Lo1/h;->x0:I

    iput v0, p0, Lo1/h;->y0:I

    :cond_0
    return-void
.end method

.method public P0(I)V
    .locals 2

    const/4 v0, -0x1

    if-le p1, v0, :cond_0

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, Lo1/h;->w0:F

    iput v0, p0, Lo1/h;->x0:I

    iput p1, p0, Lo1/h;->y0:I

    :cond_0
    return-void
.end method

.method public Q0(F)V
    .locals 1

    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    iput p1, p0, Lo1/h;->w0:F

    const/4 p1, -0x1

    iput p1, p0, Lo1/h;->x0:I

    iput p1, p0, Lo1/h;->y0:I

    :cond_0
    return-void
.end method

.method public R0(I)V
    .locals 3

    iget v0, p0, Lo1/h;->A0:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput p1, p0, Lo1/h;->A0:I

    iget-object p1, p0, Lo1/e;->K:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    iget p1, p0, Lo1/h;->A0:I

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lo1/e;->B:Lo1/d;

    iput-object p1, p0, Lo1/h;->z0:Lo1/d;

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lo1/e;->C:Lo1/d;

    iput-object p1, p0, Lo1/h;->z0:Lo1/d;

    :goto_0
    iget-object p1, p0, Lo1/e;->K:Ljava/util/ArrayList;

    iget-object v0, p0, Lo1/h;->z0:Lo1/d;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lo1/e;->J:[Lo1/d;

    array-length p1, p1

    const/4 v0, 0x0

    :goto_1
    if-ge v0, p1, :cond_2

    iget-object v1, p0, Lo1/e;->J:[Lo1/d;

    iget-object v2, p0, Lo1/h;->z0:Lo1/d;

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public f(Ln1/d;)V
    .locals 8

    invoke-virtual {p0}, Lo1/e;->G()Lo1/e;

    move-result-object v0

    check-cast v0, Lo1/f;

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v1, Lo1/d$b;->LEFT:Lo1/d$b;

    invoke-virtual {v0, v1}, Lo1/e;->m(Lo1/d$b;)Lo1/d;

    move-result-object v1

    sget-object v2, Lo1/d$b;->RIGHT:Lo1/d$b;

    invoke-virtual {v0, v2}, Lo1/e;->m(Lo1/d$b;)Lo1/d;

    move-result-object v2

    iget-object v3, p0, Lo1/e;->N:Lo1/e;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_1

    iget-object v3, v3, Lo1/e;->M:[Lo1/e$b;

    aget-object v3, v3, v5

    sget-object v6, Lo1/e$b;->WRAP_CONTENT:Lo1/e$b;

    if-ne v3, v6, :cond_1

    move v3, v4

    goto :goto_0

    :cond_1
    move v3, v5

    :goto_0
    iget v6, p0, Lo1/h;->A0:I

    if-nez v6, :cond_3

    sget-object v1, Lo1/d$b;->TOP:Lo1/d$b;

    invoke-virtual {v0, v1}, Lo1/e;->m(Lo1/d$b;)Lo1/d;

    move-result-object v1

    sget-object v2, Lo1/d$b;->BOTTOM:Lo1/d$b;

    invoke-virtual {v0, v2}, Lo1/e;->m(Lo1/d$b;)Lo1/d;

    move-result-object v2

    iget-object v0, p0, Lo1/e;->N:Lo1/e;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lo1/e;->M:[Lo1/e$b;

    aget-object v0, v0, v4

    sget-object v3, Lo1/e$b;->WRAP_CONTENT:Lo1/e$b;

    if-ne v0, v3, :cond_2

    goto :goto_1

    :cond_2
    move v4, v5

    :goto_1
    move v3, v4

    :cond_3
    iget v0, p0, Lo1/h;->x0:I

    const/16 v4, 0x8

    const/4 v6, -0x1

    const/4 v7, 0x5

    if-eq v0, v6, :cond_4

    iget-object v0, p0, Lo1/h;->z0:Lo1/d;

    invoke-virtual {p1, v0}, Ln1/d;->q(Ljava/lang/Object;)Ln1/i;

    move-result-object v0

    invoke-virtual {p1, v1}, Ln1/d;->q(Ljava/lang/Object;)Ln1/i;

    move-result-object v1

    iget v6, p0, Lo1/h;->x0:I

    invoke-virtual {p1, v0, v1, v6, v4}, Ln1/d;->e(Ln1/i;Ln1/i;II)Ln1/b;

    if-eqz v3, :cond_6

    invoke-virtual {p1, v2}, Ln1/d;->q(Ljava/lang/Object;)Ln1/i;

    move-result-object v1

    invoke-virtual {p1, v1, v0, v5, v7}, Ln1/d;->h(Ln1/i;Ln1/i;II)V

    goto :goto_2

    :cond_4
    iget v0, p0, Lo1/h;->y0:I

    if-eq v0, v6, :cond_5

    iget-object v0, p0, Lo1/h;->z0:Lo1/d;

    invoke-virtual {p1, v0}, Ln1/d;->q(Ljava/lang/Object;)Ln1/i;

    move-result-object v0

    invoke-virtual {p1, v2}, Ln1/d;->q(Ljava/lang/Object;)Ln1/i;

    move-result-object v2

    iget v6, p0, Lo1/h;->y0:I

    neg-int v6, v6

    invoke-virtual {p1, v0, v2, v6, v4}, Ln1/d;->e(Ln1/i;Ln1/i;II)Ln1/b;

    if-eqz v3, :cond_6

    invoke-virtual {p1, v1}, Ln1/d;->q(Ljava/lang/Object;)Ln1/i;

    move-result-object v1

    invoke-virtual {p1, v0, v1, v5, v7}, Ln1/d;->h(Ln1/i;Ln1/i;II)V

    invoke-virtual {p1, v2, v0, v5, v7}, Ln1/d;->h(Ln1/i;Ln1/i;II)V

    goto :goto_2

    :cond_5
    iget v0, p0, Lo1/h;->w0:F

    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_6

    iget-object v0, p0, Lo1/h;->z0:Lo1/d;

    invoke-virtual {p1, v0}, Ln1/d;->q(Ljava/lang/Object;)Ln1/i;

    move-result-object v0

    invoke-virtual {p1, v2}, Ln1/d;->q(Ljava/lang/Object;)Ln1/i;

    move-result-object v1

    iget v2, p0, Lo1/h;->w0:F

    invoke-static {p1, v0, v1, v2}, Ln1/d;->s(Ln1/d;Ln1/i;Ln1/i;F)Ln1/b;

    move-result-object v0

    invoke-virtual {p1, v0}, Ln1/d;->d(Ln1/b;)V

    :cond_6
    :goto_2
    return-void
.end method

.method public g()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public m(Lo1/d$b;)Lo1/d;
    .locals 2

    sget-object v0, Lo1/h$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/4 p1, 0x0

    return-object p1

    :pswitch_1
    iget v0, p0, Lo1/h;->A0:I

    if-nez v0, :cond_0

    iget-object p1, p0, Lo1/h;->z0:Lo1/d;

    return-object p1

    :pswitch_2
    iget v0, p0, Lo1/h;->A0:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object p1, p0, Lo1/h;->z0:Lo1/d;

    return-object p1

    :cond_0
    :goto_0
    new-instance v0, Ljava/lang/AssertionError;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
