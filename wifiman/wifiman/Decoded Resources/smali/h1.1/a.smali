.class public Lh1/a;
.super Lg1/e;
.source "SourceFile"


# instance fields
.field private q0:F


# direct methods
.method public constructor <init>(Lg1/g;)V
    .locals 1

    sget-object v0, Lg1/g$d;->ALIGN_VERTICALLY:Lg1/g$d;

    invoke-direct {p0, p1, v0}, Lg1/e;-><init>(Lg1/g;Lg1/g$d;)V

    const/high16 p1, 0x3f000000    # 0.5f

    iput p1, p0, Lh1/a;->q0:F

    return-void
.end method


# virtual methods
.method public apply()V
    .locals 4

    iget-object v0, p0, Lg1/e;->o0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lg1/e;->m0:Lg1/g;

    invoke-virtual {v2, v1}, Lg1/g;->d(Ljava/lang/Object;)Lg1/a;

    move-result-object v1

    invoke-virtual {v1}, Lg1/a;->u()Lg1/a;

    iget-object v2, p0, Lg1/a;->O:Ljava/lang/Object;

    if-eqz v2, :cond_1

    invoke-virtual {v1, v2}, Lg1/a;->i0(Ljava/lang/Object;)Lg1/a;

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lg1/a;->P:Ljava/lang/Object;

    if-eqz v2, :cond_2

    invoke-virtual {v1, v2}, Lg1/a;->h0(Ljava/lang/Object;)Lg1/a;

    goto :goto_1

    :cond_2
    sget-object v2, Lg1/g;->k:Ljava/lang/Integer;

    invoke-virtual {v1, v2}, Lg1/a;->i0(Ljava/lang/Object;)Lg1/a;

    :goto_1
    iget-object v2, p0, Lg1/a;->Q:Ljava/lang/Object;

    if-eqz v2, :cond_3

    invoke-virtual {v1, v2}, Lg1/a;->A(Ljava/lang/Object;)Lg1/a;

    goto :goto_2

    :cond_3
    iget-object v2, p0, Lg1/a;->R:Ljava/lang/Object;

    if-eqz v2, :cond_4

    invoke-virtual {v1, v2}, Lg1/a;->z(Ljava/lang/Object;)Lg1/a;

    goto :goto_2

    :cond_4
    sget-object v2, Lg1/g;->k:Ljava/lang/Integer;

    invoke-virtual {v1, v2}, Lg1/a;->z(Ljava/lang/Object;)Lg1/a;

    :goto_2
    iget v2, p0, Lh1/a;->q0:F

    const/high16 v3, 0x3f000000    # 0.5f

    cmpl-float v3, v2, v3

    if-eqz v3, :cond_0

    invoke-virtual {v1, v2}, Lg1/a;->F(F)Lg1/a;

    goto :goto_0

    :cond_5
    return-void
.end method
