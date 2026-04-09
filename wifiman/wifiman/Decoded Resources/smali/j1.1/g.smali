.class public Lj1/g;
.super Lj1/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj1/g$a;
    }
.end annotation


# instance fields
.field private Z0:I

.field private a1:I

.field private b1:I

.field private c1:I

.field private d1:I

.field private e1:I

.field private f1:F

.field private g1:F

.field private h1:F

.field private i1:F

.field private j1:F

.field private k1:F

.field private l1:I

.field private m1:I

.field private n1:I

.field private o1:I

.field private p1:I

.field private q1:I

.field private r1:I

.field private s1:Ljava/util/ArrayList;

.field private t1:[Lj1/e;

.field private u1:[Lj1/e;

.field private v1:[I

.field private w1:[Lj1/e;

.field private x1:I


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lj1/l;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lj1/g;->Z0:I

    iput v0, p0, Lj1/g;->a1:I

    iput v0, p0, Lj1/g;->b1:I

    iput v0, p0, Lj1/g;->c1:I

    iput v0, p0, Lj1/g;->d1:I

    iput v0, p0, Lj1/g;->e1:I

    const/high16 v1, 0x3f000000    # 0.5f

    iput v1, p0, Lj1/g;->f1:F

    iput v1, p0, Lj1/g;->g1:F

    iput v1, p0, Lj1/g;->h1:F

    iput v1, p0, Lj1/g;->i1:F

    iput v1, p0, Lj1/g;->j1:F

    iput v1, p0, Lj1/g;->k1:F

    const/4 v1, 0x0

    iput v1, p0, Lj1/g;->l1:I

    iput v1, p0, Lj1/g;->m1:I

    const/4 v2, 0x2

    iput v2, p0, Lj1/g;->n1:I

    iput v2, p0, Lj1/g;->o1:I

    iput v1, p0, Lj1/g;->p1:I

    iput v0, p0, Lj1/g;->q1:I

    iput v1, p0, Lj1/g;->r1:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lj1/g;->s1:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput-object v0, p0, Lj1/g;->t1:[Lj1/e;

    iput-object v0, p0, Lj1/g;->u1:[Lj1/e;

    iput-object v0, p0, Lj1/g;->v1:[I

    iput v1, p0, Lj1/g;->x1:I

    return-void
.end method

.method static synthetic A1(Lj1/g;)I
    .locals 0

    iget p0, p0, Lj1/g;->d1:I

    return p0
.end method

.method static synthetic B1(Lj1/g;)F
    .locals 0

    iget p0, p0, Lj1/g;->j1:F

    return p0
.end method

.method static synthetic C1(Lj1/g;)F
    .locals 0

    iget p0, p0, Lj1/g;->g1:F

    return p0
.end method

.method static synthetic D1(Lj1/g;)I
    .locals 0

    iget p0, p0, Lj1/g;->c1:I

    return p0
.end method

.method static synthetic E1(Lj1/g;)F
    .locals 0

    iget p0, p0, Lj1/g;->i1:F

    return p0
.end method

.method static synthetic F1(Lj1/g;)I
    .locals 0

    iget p0, p0, Lj1/g;->e1:I

    return p0
.end method

.method static synthetic G1(Lj1/g;)F
    .locals 0

    iget p0, p0, Lj1/g;->k1:F

    return p0
.end method

.method static synthetic H1(Lj1/g;)I
    .locals 0

    iget p0, p0, Lj1/g;->n1:I

    return p0
.end method

.method static synthetic I1(Lj1/g;Lj1/e;I)I
    .locals 0

    invoke-direct {p0, p1, p2}, Lj1/g;->S1(Lj1/e;I)I

    move-result p0

    return p0
.end method

.method static synthetic J1(Lj1/g;Lj1/e;I)I
    .locals 0

    invoke-direct {p0, p1, p2}, Lj1/g;->R1(Lj1/e;I)I

    move-result p0

    return p0
.end method

.method static synthetic K1(Lj1/g;)I
    .locals 0

    iget p0, p0, Lj1/g;->x1:I

    return p0
.end method

.method static synthetic L1(Lj1/g;)[Lj1/e;
    .locals 0

    iget-object p0, p0, Lj1/g;->w1:[Lj1/e;

    return-object p0
.end method

.method static synthetic M1(Lj1/g;)I
    .locals 0

    iget p0, p0, Lj1/g;->a1:I

    return p0
.end method

.method static synthetic N1(Lj1/g;)I
    .locals 0

    iget p0, p0, Lj1/g;->o1:I

    return p0
.end method

.method static synthetic O1(Lj1/g;)I
    .locals 0

    iget p0, p0, Lj1/g;->Z0:I

    return p0
.end method

.method static synthetic P1(Lj1/g;)F
    .locals 0

    iget p0, p0, Lj1/g;->f1:F

    return p0
.end method

.method private Q1(Z)V
    .locals 11

    iget-object v0, p0, Lj1/g;->v1:[I

    if-eqz v0, :cond_15

    iget-object v0, p0, Lj1/g;->u1:[Lj1/e;

    if-eqz v0, :cond_15

    iget-object v0, p0, Lj1/g;->t1:[Lj1/e;

    if-nez v0, :cond_0

    goto/16 :goto_9

    :cond_0
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget v2, p0, Lj1/g;->x1:I

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Lj1/g;->w1:[Lj1/e;

    aget-object v2, v2, v1

    invoke-virtual {v2}, Lj1/e;->l0()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lj1/g;->v1:[I

    aget v2, v1, v0

    const/4 v3, 0x1

    aget v1, v1, v3

    iget v4, p0, Lj1/g;->f1:F

    const/4 v5, 0x0

    move v6, v0

    :goto_1
    const/16 v7, 0x8

    if-ge v6, v2, :cond_8

    if-eqz p1, :cond_2

    sub-int v4, v2, v6

    sub-int/2addr v4, v3

    const/high16 v8, 0x3f800000    # 1.0f

    iget v9, p0, Lj1/g;->f1:F

    sub-float/2addr v8, v9

    goto :goto_2

    :cond_2
    move v8, v4

    move v4, v6

    :goto_2
    iget-object v9, p0, Lj1/g;->u1:[Lj1/e;

    aget-object v4, v9, v4

    if-eqz v4, :cond_7

    invoke-virtual {v4}, Lj1/e;->N()I

    move-result v9

    if-ne v9, v7, :cond_3

    goto :goto_3

    :cond_3
    if-nez v6, :cond_4

    iget-object v7, v4, Lj1/e;->N:Lj1/d;

    iget-object v9, p0, Lj1/e;->N:Lj1/d;

    invoke-virtual {p0}, Lj1/l;->h1()I

    move-result v10

    invoke-virtual {v4, v7, v9, v10}, Lj1/e;->h(Lj1/d;Lj1/d;I)V

    iget v7, p0, Lj1/g;->Z0:I

    invoke-virtual {v4, v7}, Lj1/e;->B0(I)V

    invoke-virtual {v4, v8}, Lj1/e;->A0(F)V

    :cond_4
    add-int/lit8 v7, v2, -0x1

    if-ne v6, v7, :cond_5

    iget-object v7, v4, Lj1/e;->P:Lj1/d;

    iget-object v9, p0, Lj1/e;->P:Lj1/d;

    invoke-virtual {p0}, Lj1/l;->i1()I

    move-result v10

    invoke-virtual {v4, v7, v9, v10}, Lj1/e;->h(Lj1/d;Lj1/d;I)V

    :cond_5
    if-lez v6, :cond_6

    if-eqz v5, :cond_6

    iget-object v7, v4, Lj1/e;->N:Lj1/d;

    iget-object v9, v5, Lj1/e;->P:Lj1/d;

    iget v10, p0, Lj1/g;->l1:I

    invoke-virtual {v4, v7, v9, v10}, Lj1/e;->h(Lj1/d;Lj1/d;I)V

    iget-object v7, v5, Lj1/e;->P:Lj1/d;

    iget-object v9, v4, Lj1/e;->N:Lj1/d;

    invoke-virtual {v5, v7, v9, v0}, Lj1/e;->h(Lj1/d;Lj1/d;I)V

    :cond_6
    move-object v5, v4

    :cond_7
    :goto_3
    add-int/lit8 v6, v6, 0x1

    move v4, v8

    goto :goto_1

    :cond_8
    move p1, v0

    :goto_4
    if-ge p1, v1, :cond_e

    iget-object v4, p0, Lj1/g;->t1:[Lj1/e;

    aget-object v4, v4, p1

    if-eqz v4, :cond_d

    invoke-virtual {v4}, Lj1/e;->N()I

    move-result v6

    if-ne v6, v7, :cond_9

    goto :goto_5

    :cond_9
    if-nez p1, :cond_a

    iget-object v6, v4, Lj1/e;->O:Lj1/d;

    iget-object v8, p0, Lj1/e;->O:Lj1/d;

    invoke-virtual {p0}, Lj1/l;->j1()I

    move-result v9

    invoke-virtual {v4, v6, v8, v9}, Lj1/e;->h(Lj1/d;Lj1/d;I)V

    iget v6, p0, Lj1/g;->a1:I

    invoke-virtual {v4, v6}, Lj1/e;->O0(I)V

    iget v6, p0, Lj1/g;->g1:F

    invoke-virtual {v4, v6}, Lj1/e;->N0(F)V

    :cond_a
    add-int/lit8 v6, v1, -0x1

    if-ne p1, v6, :cond_b

    iget-object v6, v4, Lj1/e;->Q:Lj1/d;

    iget-object v8, p0, Lj1/e;->Q:Lj1/d;

    invoke-virtual {p0}, Lj1/l;->g1()I

    move-result v9

    invoke-virtual {v4, v6, v8, v9}, Lj1/e;->h(Lj1/d;Lj1/d;I)V

    :cond_b
    if-lez p1, :cond_c

    if-eqz v5, :cond_c

    iget-object v6, v4, Lj1/e;->O:Lj1/d;

    iget-object v8, v5, Lj1/e;->Q:Lj1/d;

    iget v9, p0, Lj1/g;->m1:I

    invoke-virtual {v4, v6, v8, v9}, Lj1/e;->h(Lj1/d;Lj1/d;I)V

    iget-object v6, v5, Lj1/e;->Q:Lj1/d;

    iget-object v8, v4, Lj1/e;->O:Lj1/d;

    invoke-virtual {v5, v6, v8, v0}, Lj1/e;->h(Lj1/d;Lj1/d;I)V

    :cond_c
    move-object v5, v4

    :cond_d
    :goto_5
    add-int/lit8 p1, p1, 0x1

    goto :goto_4

    :cond_e
    move p1, v0

    :goto_6
    if-ge p1, v2, :cond_15

    move v4, v0

    :goto_7
    if-ge v4, v1, :cond_14

    mul-int v5, v4, v2

    add-int/2addr v5, p1

    iget v6, p0, Lj1/g;->r1:I

    if-ne v6, v3, :cond_f

    mul-int v5, p1, v1

    add-int/2addr v5, v4

    :cond_f
    iget-object v6, p0, Lj1/g;->w1:[Lj1/e;

    array-length v8, v6

    if-lt v5, v8, :cond_10

    goto :goto_8

    :cond_10
    aget-object v5, v6, v5

    if-eqz v5, :cond_13

    invoke-virtual {v5}, Lj1/e;->N()I

    move-result v6

    if-ne v6, v7, :cond_11

    goto :goto_8

    :cond_11
    iget-object v6, p0, Lj1/g;->u1:[Lj1/e;

    aget-object v6, v6, p1

    iget-object v8, p0, Lj1/g;->t1:[Lj1/e;

    aget-object v8, v8, v4

    if-eq v5, v6, :cond_12

    iget-object v9, v5, Lj1/e;->N:Lj1/d;

    iget-object v10, v6, Lj1/e;->N:Lj1/d;

    invoke-virtual {v5, v9, v10, v0}, Lj1/e;->h(Lj1/d;Lj1/d;I)V

    iget-object v9, v5, Lj1/e;->P:Lj1/d;

    iget-object v6, v6, Lj1/e;->P:Lj1/d;

    invoke-virtual {v5, v9, v6, v0}, Lj1/e;->h(Lj1/d;Lj1/d;I)V

    :cond_12
    if-eq v5, v8, :cond_13

    iget-object v6, v5, Lj1/e;->O:Lj1/d;

    iget-object v9, v8, Lj1/e;->O:Lj1/d;

    invoke-virtual {v5, v6, v9, v0}, Lj1/e;->h(Lj1/d;Lj1/d;I)V

    iget-object v6, v5, Lj1/e;->Q:Lj1/d;

    iget-object v8, v8, Lj1/e;->Q:Lj1/d;

    invoke-virtual {v5, v6, v8, v0}, Lj1/e;->h(Lj1/d;Lj1/d;I)V

    :cond_13
    :goto_8
    add-int/lit8 v4, v4, 0x1

    goto :goto_7

    :cond_14
    add-int/lit8 p1, p1, 0x1

    goto :goto_6

    :cond_15
    :goto_9
    return-void
.end method

.method private R1(Lj1/e;I)I
    .locals 9

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p1}, Lj1/e;->M()Lj1/e$b;

    move-result-object v1

    sget-object v2, Lj1/e$b;->MATCH_CONSTRAINT:Lj1/e$b;

    if-ne v1, v2, :cond_5

    iget v1, p1, Lj1/e;->x:I

    if-nez v1, :cond_1

    return v0

    :cond_1
    const/4 v0, 0x2

    const/4 v2, 0x1

    if-ne v1, v0, :cond_3

    iget v0, p1, Lj1/e;->E:F

    int-to-float p2, p2

    mul-float/2addr v0, p2

    float-to-int p2, v0

    invoke-virtual {p1}, Lj1/e;->u()I

    move-result v0

    if-eq p2, v0, :cond_2

    invoke-virtual {p1, v2}, Lj1/e;->J0(Z)V

    invoke-virtual {p1}, Lj1/e;->x()Lj1/e$b;

    move-result-object v5

    invoke-virtual {p1}, Lj1/e;->O()I

    move-result v6

    sget-object v7, Lj1/e$b;->FIXED:Lj1/e$b;

    move-object v3, p0

    move-object v4, p1

    move v8, p2

    invoke-virtual/range {v3 .. v8}, Lj1/l;->l1(Lj1/e;Lj1/e$b;ILj1/e$b;I)V

    :cond_2
    return p2

    :cond_3
    if-ne v1, v2, :cond_4

    invoke-virtual {p1}, Lj1/e;->u()I

    move-result p1

    return p1

    :cond_4
    const/4 p2, 0x3

    if-ne v1, p2, :cond_5

    invoke-virtual {p1}, Lj1/e;->O()I

    move-result p2

    int-to-float p2, p2

    iget p1, p1, Lj1/e;->c0:F

    mul-float/2addr p2, p1

    const/high16 p1, 0x3f000000    # 0.5f

    add-float/2addr p2, p1

    float-to-int p1, p2

    return p1

    :cond_5
    invoke-virtual {p1}, Lj1/e;->u()I

    move-result p1

    return p1
.end method

.method private S1(Lj1/e;I)I
    .locals 9

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p1}, Lj1/e;->x()Lj1/e$b;

    move-result-object v1

    sget-object v2, Lj1/e$b;->MATCH_CONSTRAINT:Lj1/e$b;

    if-ne v1, v2, :cond_5

    iget v1, p1, Lj1/e;->w:I

    if-nez v1, :cond_1

    return v0

    :cond_1
    const/4 v0, 0x2

    const/4 v2, 0x1

    if-ne v1, v0, :cond_3

    iget v0, p1, Lj1/e;->B:F

    int-to-float p2, p2

    mul-float/2addr v0, p2

    float-to-int p2, v0

    invoke-virtual {p1}, Lj1/e;->O()I

    move-result v0

    if-eq p2, v0, :cond_2

    invoke-virtual {p1, v2}, Lj1/e;->J0(Z)V

    sget-object v5, Lj1/e$b;->FIXED:Lj1/e$b;

    invoke-virtual {p1}, Lj1/e;->M()Lj1/e$b;

    move-result-object v7

    invoke-virtual {p1}, Lj1/e;->u()I

    move-result v8

    move-object v3, p0

    move-object v4, p1

    move v6, p2

    invoke-virtual/range {v3 .. v8}, Lj1/l;->l1(Lj1/e;Lj1/e$b;ILj1/e$b;I)V

    :cond_2
    return p2

    :cond_3
    if-ne v1, v2, :cond_4

    invoke-virtual {p1}, Lj1/e;->O()I

    move-result p1

    return p1

    :cond_4
    const/4 p2, 0x3

    if-ne v1, p2, :cond_5

    invoke-virtual {p1}, Lj1/e;->u()I

    move-result p2

    int-to-float p2, p2

    iget p1, p1, Lj1/e;->c0:F

    mul-float/2addr p2, p1

    const/high16 p1, 0x3f000000    # 0.5f

    add-float/2addr p2, p1

    float-to-int p1, p2

    return p1

    :cond_5
    invoke-virtual {p1}, Lj1/e;->O()I

    move-result p1

    return p1
.end method

.method private T1([Lj1/e;III[I)V
    .locals 10

    const/4 v0, 0x0

    if-nez p3, :cond_4

    iget v1, p0, Lj1/g;->q1:I

    if-gtz v1, :cond_3

    move v1, v0

    move v2, v1

    move v3, v2

    :goto_0
    if-ge v2, p2, :cond_3

    if-lez v2, :cond_0

    iget v4, p0, Lj1/g;->l1:I

    add-int/2addr v3, v4

    :cond_0
    aget-object v4, p1, v2

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    invoke-direct {p0, v4, p4}, Lj1/g;->S1(Lj1/e;I)I

    move-result v4

    add-int/2addr v3, v4

    if-le v3, p4, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v1, v1, 0x1

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    move v2, v1

    move v1, v0

    goto :goto_6

    :cond_4
    iget v1, p0, Lj1/g;->q1:I

    if-gtz v1, :cond_8

    move v1, v0

    move v2, v1

    move v3, v2

    :goto_3
    if-ge v2, p2, :cond_8

    if-lez v2, :cond_5

    iget v4, p0, Lj1/g;->m1:I

    add-int/2addr v3, v4

    :cond_5
    aget-object v4, p1, v2

    if-nez v4, :cond_6

    goto :goto_4

    :cond_6
    invoke-direct {p0, v4, p4}, Lj1/g;->R1(Lj1/e;I)I

    move-result v4

    add-int/2addr v3, v4

    if-le v3, p4, :cond_7

    goto :goto_5

    :cond_7
    add-int/lit8 v1, v1, 0x1

    :goto_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_8
    :goto_5
    move v2, v0

    :goto_6
    iget-object v3, p0, Lj1/g;->v1:[I

    if-nez v3, :cond_9

    const/4 v3, 0x2

    new-array v3, v3, [I

    iput-object v3, p0, Lj1/g;->v1:[I

    :cond_9
    const/4 v3, 0x1

    if-nez v1, :cond_a

    if-eq p3, v3, :cond_b

    :cond_a
    if-nez v2, :cond_c

    if-nez p3, :cond_c

    :cond_b
    move v4, v3

    goto :goto_7

    :cond_c
    move v4, v0

    :goto_7
    if-nez v4, :cond_22

    if-nez p3, :cond_d

    int-to-float v1, p2

    int-to-float v5, v2

    div-float/2addr v1, v5

    float-to-double v5, v1

    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v5

    double-to-int v1, v5

    goto :goto_8

    :cond_d
    int-to-float v2, p2

    int-to-float v5, v1

    div-float/2addr v2, v5

    float-to-double v5, v2

    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v5

    double-to-int v2, v5

    :goto_8
    iget-object v5, p0, Lj1/g;->u1:[Lj1/e;

    const/4 v6, 0x0

    if-eqz v5, :cond_f

    array-length v7, v5

    if-ge v7, v2, :cond_e

    goto :goto_9

    :cond_e
    invoke-static {v5, v6}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_a

    :cond_f
    :goto_9
    new-array v5, v2, [Lj1/e;

    iput-object v5, p0, Lj1/g;->u1:[Lj1/e;

    :goto_a
    iget-object v5, p0, Lj1/g;->t1:[Lj1/e;

    if-eqz v5, :cond_11

    array-length v7, v5

    if-ge v7, v1, :cond_10

    goto :goto_b

    :cond_10
    invoke-static {v5, v6}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_c

    :cond_11
    :goto_b
    new-array v5, v1, [Lj1/e;

    iput-object v5, p0, Lj1/g;->t1:[Lj1/e;

    :goto_c
    move v5, v0

    :goto_d
    if-ge v5, v2, :cond_1a

    move v6, v0

    :goto_e
    if-ge v6, v1, :cond_19

    mul-int v7, v6, v2

    add-int/2addr v7, v5

    if-ne p3, v3, :cond_12

    mul-int v7, v5, v1

    add-int/2addr v7, v6

    :cond_12
    array-length v8, p1

    if-lt v7, v8, :cond_13

    goto :goto_f

    :cond_13
    aget-object v7, p1, v7

    if-nez v7, :cond_14

    goto :goto_f

    :cond_14
    invoke-direct {p0, v7, p4}, Lj1/g;->S1(Lj1/e;I)I

    move-result v8

    iget-object v9, p0, Lj1/g;->u1:[Lj1/e;

    aget-object v9, v9, v5

    if-eqz v9, :cond_15

    invoke-virtual {v9}, Lj1/e;->O()I

    move-result v9

    if-ge v9, v8, :cond_16

    :cond_15
    iget-object v8, p0, Lj1/g;->u1:[Lj1/e;

    aput-object v7, v8, v5

    :cond_16
    invoke-direct {p0, v7, p4}, Lj1/g;->R1(Lj1/e;I)I

    move-result v8

    iget-object v9, p0, Lj1/g;->t1:[Lj1/e;

    aget-object v9, v9, v6

    if-eqz v9, :cond_17

    invoke-virtual {v9}, Lj1/e;->u()I

    move-result v9

    if-ge v9, v8, :cond_18

    :cond_17
    iget-object v8, p0, Lj1/g;->t1:[Lj1/e;

    aput-object v7, v8, v6

    :cond_18
    :goto_f
    add-int/lit8 v6, v6, 0x1

    goto :goto_e

    :cond_19
    add-int/lit8 v5, v5, 0x1

    goto :goto_d

    :cond_1a
    move v5, v0

    move v6, v5

    :goto_10
    if-ge v5, v2, :cond_1d

    iget-object v7, p0, Lj1/g;->u1:[Lj1/e;

    aget-object v7, v7, v5

    if-eqz v7, :cond_1c

    if-lez v5, :cond_1b

    iget v8, p0, Lj1/g;->l1:I

    add-int/2addr v6, v8

    :cond_1b
    invoke-direct {p0, v7, p4}, Lj1/g;->S1(Lj1/e;I)I

    move-result v7

    add-int/2addr v6, v7

    :cond_1c
    add-int/lit8 v5, v5, 0x1

    goto :goto_10

    :cond_1d
    move v5, v0

    move v7, v5

    :goto_11
    if-ge v5, v1, :cond_20

    iget-object v8, p0, Lj1/g;->t1:[Lj1/e;

    aget-object v8, v8, v5

    if-eqz v8, :cond_1f

    if-lez v5, :cond_1e

    iget v9, p0, Lj1/g;->m1:I

    add-int/2addr v7, v9

    :cond_1e
    invoke-direct {p0, v8, p4}, Lj1/g;->R1(Lj1/e;I)I

    move-result v8

    add-int/2addr v7, v8

    :cond_1f
    add-int/lit8 v5, v5, 0x1

    goto :goto_11

    :cond_20
    aput v6, p5, v0

    aput v7, p5, v3

    if-nez p3, :cond_21

    if-le v6, p4, :cond_b

    if-le v2, v3, :cond_b

    add-int/lit8 v2, v2, -0x1

    goto/16 :goto_7

    :cond_21
    if-le v7, p4, :cond_b

    if-le v1, v3, :cond_b

    add-int/lit8 v1, v1, -0x1

    goto/16 :goto_7

    :cond_22
    iget-object p1, p0, Lj1/g;->v1:[I

    aput v2, p1, v0

    aput v1, p1, v3

    return-void
.end method

.method private U1([Lj1/e;III[I)V
    .locals 28

    move-object/from16 v8, p0

    move/from16 v9, p2

    move/from16 v15, p4

    if-nez v9, :cond_0

    return-void

    :cond_0
    iget-object v0, v8, Lj1/g;->s1:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    new-instance v10, Lj1/g$a;

    iget-object v3, v8, Lj1/e;->N:Lj1/d;

    iget-object v4, v8, Lj1/e;->O:Lj1/d;

    iget-object v5, v8, Lj1/e;->P:Lj1/d;

    iget-object v6, v8, Lj1/e;->Q:Lj1/d;

    move-object v0, v10

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v7, p4

    invoke-direct/range {v0 .. v7}, Lj1/g$a;-><init>(Lj1/g;ILj1/d;Lj1/d;Lj1/d;Lj1/d;I)V

    iget-object v0, v8, Lj1/g;->s1:Ljava/util/ArrayList;

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v20, 0x1

    const/16 v21, 0x0

    if-nez p3, :cond_7

    move/from16 v0, v21

    move v1, v0

    move v11, v1

    :goto_0
    if-ge v11, v9, :cond_e

    aget-object v12, p1, v11

    invoke-direct {v8, v12, v15}, Lj1/g;->S1(Lj1/e;I)I

    move-result v13

    invoke-virtual {v12}, Lj1/e;->x()Lj1/e$b;

    move-result-object v2

    sget-object v3, Lj1/e$b;->MATCH_CONSTRAINT:Lj1/e$b;

    if-ne v2, v3, :cond_1

    add-int/lit8 v0, v0, 0x1

    :cond_1
    move v14, v0

    if-eq v1, v15, :cond_2

    iget v0, v8, Lj1/g;->l1:I

    add-int/2addr v0, v1

    add-int/2addr v0, v13

    if-le v0, v15, :cond_3

    :cond_2
    invoke-static {v10}, Lj1/g$a;->a(Lj1/g$a;)Lj1/e;

    move-result-object v0

    if-eqz v0, :cond_3

    move/from16 v0, v20

    goto :goto_1

    :cond_3
    move/from16 v0, v21

    :goto_1
    if-nez v0, :cond_4

    if-lez v11, :cond_4

    iget v2, v8, Lj1/g;->q1:I

    if-lez v2, :cond_4

    rem-int v2, v11, v2

    if-nez v2, :cond_4

    move/from16 v0, v20

    :cond_4
    if-eqz v0, :cond_6

    new-instance v10, Lj1/g$a;

    iget-object v3, v8, Lj1/e;->N:Lj1/d;

    iget-object v4, v8, Lj1/e;->O:Lj1/d;

    iget-object v5, v8, Lj1/e;->P:Lj1/d;

    iget-object v6, v8, Lj1/e;->Q:Lj1/d;

    move-object v0, v10

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v7, p4

    invoke-direct/range {v0 .. v7}, Lj1/g$a;-><init>(Lj1/g;ILj1/d;Lj1/d;Lj1/d;Lj1/d;I)V

    invoke-virtual {v10, v11}, Lj1/g$a;->i(I)V

    iget-object v0, v8, Lj1/g;->s1:Ljava/util/ArrayList;

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    move v1, v13

    goto :goto_2

    :cond_6
    if-lez v11, :cond_5

    iget v0, v8, Lj1/g;->l1:I

    add-int/2addr v0, v13

    add-int/2addr v1, v0

    :goto_2
    invoke-virtual {v10, v12}, Lj1/g$a;->b(Lj1/e;)V

    add-int/lit8 v11, v11, 0x1

    move v0, v14

    goto :goto_0

    :cond_7
    move/from16 v0, v21

    move v1, v0

    move v11, v1

    :goto_3
    if-ge v11, v9, :cond_e

    aget-object v12, p1, v11

    invoke-direct {v8, v12, v15}, Lj1/g;->R1(Lj1/e;I)I

    move-result v13

    invoke-virtual {v12}, Lj1/e;->M()Lj1/e$b;

    move-result-object v2

    sget-object v3, Lj1/e$b;->MATCH_CONSTRAINT:Lj1/e$b;

    if-ne v2, v3, :cond_8

    add-int/lit8 v0, v0, 0x1

    :cond_8
    move v14, v0

    if-eq v1, v15, :cond_9

    iget v0, v8, Lj1/g;->m1:I

    add-int/2addr v0, v1

    add-int/2addr v0, v13

    if-le v0, v15, :cond_a

    :cond_9
    invoke-static {v10}, Lj1/g$a;->a(Lj1/g$a;)Lj1/e;

    move-result-object v0

    if-eqz v0, :cond_a

    move/from16 v0, v20

    goto :goto_4

    :cond_a
    move/from16 v0, v21

    :goto_4
    if-nez v0, :cond_b

    if-lez v11, :cond_b

    iget v2, v8, Lj1/g;->q1:I

    if-lez v2, :cond_b

    rem-int v2, v11, v2

    if-nez v2, :cond_b

    move/from16 v0, v20

    :cond_b
    if-eqz v0, :cond_d

    new-instance v10, Lj1/g$a;

    iget-object v3, v8, Lj1/e;->N:Lj1/d;

    iget-object v4, v8, Lj1/e;->O:Lj1/d;

    iget-object v5, v8, Lj1/e;->P:Lj1/d;

    iget-object v6, v8, Lj1/e;->Q:Lj1/d;

    move-object v0, v10

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v7, p4

    invoke-direct/range {v0 .. v7}, Lj1/g$a;-><init>(Lj1/g;ILj1/d;Lj1/d;Lj1/d;Lj1/d;I)V

    invoke-virtual {v10, v11}, Lj1/g$a;->i(I)V

    iget-object v0, v8, Lj1/g;->s1:Ljava/util/ArrayList;

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_c
    move v1, v13

    goto :goto_5

    :cond_d
    if-lez v11, :cond_c

    iget v0, v8, Lj1/g;->m1:I

    add-int/2addr v0, v13

    add-int/2addr v1, v0

    :goto_5
    invoke-virtual {v10, v12}, Lj1/g$a;->b(Lj1/e;)V

    add-int/lit8 v11, v11, 0x1

    move v0, v14

    goto :goto_3

    :cond_e
    iget-object v1, v8, Lj1/g;->s1:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    iget-object v2, v8, Lj1/e;->N:Lj1/d;

    iget-object v3, v8, Lj1/e;->O:Lj1/d;

    iget-object v4, v8, Lj1/e;->P:Lj1/d;

    iget-object v5, v8, Lj1/e;->Q:Lj1/d;

    invoke-virtual/range {p0 .. p0}, Lj1/l;->h1()I

    move-result v6

    invoke-virtual/range {p0 .. p0}, Lj1/l;->j1()I

    move-result v7

    invoke-virtual/range {p0 .. p0}, Lj1/l;->i1()I

    move-result v9

    invoke-virtual/range {p0 .. p0}, Lj1/l;->g1()I

    move-result v10

    invoke-virtual/range {p0 .. p0}, Lj1/e;->x()Lj1/e$b;

    move-result-object v11

    sget-object v12, Lj1/e$b;->WRAP_CONTENT:Lj1/e$b;

    if-eq v11, v12, :cond_10

    invoke-virtual/range {p0 .. p0}, Lj1/e;->M()Lj1/e$b;

    move-result-object v11

    if-ne v11, v12, :cond_f

    goto :goto_6

    :cond_f
    move/from16 v11, v21

    goto :goto_7

    :cond_10
    :goto_6
    move/from16 v11, v20

    :goto_7
    if-lez v0, :cond_12

    if-eqz v11, :cond_12

    move/from16 v0, v21

    :goto_8
    if-ge v0, v1, :cond_12

    iget-object v11, v8, Lj1/g;->s1:Ljava/util/ArrayList;

    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lj1/g$a;

    if-nez p3, :cond_11

    invoke-virtual {v11}, Lj1/g$a;->f()I

    move-result v12

    sub-int v12, v15, v12

    invoke-virtual {v11, v12}, Lj1/g$a;->g(I)V

    goto :goto_9

    :cond_11
    invoke-virtual {v11}, Lj1/g$a;->e()I

    move-result v12

    sub-int v12, v15, v12

    invoke-virtual {v11, v12}, Lj1/g$a;->g(I)V

    :goto_9
    add-int/lit8 v0, v0, 0x1

    goto :goto_8

    :cond_12
    move/from16 v22, v7

    move v0, v9

    move/from16 v12, v21

    move v13, v12

    move v14, v13

    move v7, v6

    move-object v6, v3

    move-object v3, v2

    move v2, v10

    :goto_a
    if-ge v14, v1, :cond_18

    iget-object v9, v8, Lj1/g;->s1:Ljava/util/ArrayList;

    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    move-object/from16 v23, v9

    check-cast v23, Lj1/g$a;

    if-nez p3, :cond_15

    add-int/lit8 v2, v1, -0x1

    if-ge v14, v2, :cond_13

    iget-object v2, v8, Lj1/g;->s1:Ljava/util/ArrayList;

    add-int/lit8 v5, v14, 0x1

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj1/g$a;

    invoke-static {v2}, Lj1/g$a;->a(Lj1/g$a;)Lj1/e;

    move-result-object v2

    iget-object v2, v2, Lj1/e;->O:Lj1/d;

    move/from16 v5, v21

    goto :goto_b

    :cond_13
    iget-object v2, v8, Lj1/e;->Q:Lj1/d;

    invoke-virtual/range {p0 .. p0}, Lj1/l;->g1()I

    move-result v5

    :goto_b
    invoke-static/range {v23 .. v23}, Lj1/g$a;->a(Lj1/g$a;)Lj1/e;

    move-result-object v9

    iget-object v11, v9, Lj1/e;->Q:Lj1/d;

    move-object/from16 v9, v23

    move/from16 v10, p3

    move-object/from16 v24, v11

    move-object v11, v3

    move-object/from16 p1, v3

    move v3, v12

    move-object v12, v6

    move v6, v13

    move-object v13, v4

    move-object/from16 p2, v4

    move v4, v14

    move-object v14, v2

    move v15, v7

    move/from16 v16, v22

    move/from16 v17, v0

    move/from16 v18, v5

    move/from16 v19, p4

    invoke-virtual/range {v9 .. v19}, Lj1/g$a;->j(ILj1/d;Lj1/d;Lj1/d;Lj1/d;IIIII)V

    invoke-virtual/range {v23 .. v23}, Lj1/g$a;->f()I

    move-result v9

    invoke-static {v6, v9}, Ljava/lang/Math;->max(II)I

    move-result v6

    invoke-virtual/range {v23 .. v23}, Lj1/g$a;->e()I

    move-result v9

    add-int v12, v3, v9

    if-lez v4, :cond_14

    iget v3, v8, Lj1/g;->m1:I

    add-int/2addr v12, v3

    :cond_14
    move-object/from16 v3, p1

    move v13, v6

    move/from16 v22, v21

    move-object/from16 v6, v24

    move-object/from16 v24, p2

    move/from16 v27, v5

    move-object v5, v2

    move/from16 v2, v27

    goto/16 :goto_d

    :cond_15
    move-object/from16 p1, v3

    move v3, v12

    move v0, v13

    move v4, v14

    add-int/lit8 v9, v1, -0x1

    if-ge v4, v9, :cond_16

    iget-object v9, v8, Lj1/g;->s1:Ljava/util/ArrayList;

    add-int/lit8 v14, v4, 0x1

    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lj1/g$a;

    invoke-static {v9}, Lj1/g$a;->a(Lj1/g$a;)Lj1/e;

    move-result-object v9

    iget-object v9, v9, Lj1/e;->N:Lj1/d;

    move-object/from16 v24, v9

    move/from16 v25, v21

    goto :goto_c

    :cond_16
    iget-object v9, v8, Lj1/e;->P:Lj1/d;

    invoke-virtual/range {p0 .. p0}, Lj1/l;->i1()I

    move-result v10

    move-object/from16 v24, v9

    move/from16 v25, v10

    :goto_c
    invoke-static/range {v23 .. v23}, Lj1/g$a;->a(Lj1/g$a;)Lj1/e;

    move-result-object v9

    iget-object v15, v9, Lj1/e;->P:Lj1/d;

    move-object/from16 v9, v23

    move/from16 v10, p3

    move-object/from16 v11, p1

    move-object v12, v6

    move-object/from16 v13, v24

    move-object v14, v5

    move-object/from16 v26, v15

    move v15, v7

    move/from16 v16, v22

    move/from16 v17, v25

    move/from16 v18, v2

    move/from16 v19, p4

    invoke-virtual/range {v9 .. v19}, Lj1/g$a;->j(ILj1/d;Lj1/d;Lj1/d;Lj1/d;IIIII)V

    invoke-virtual/range {v23 .. v23}, Lj1/g$a;->f()I

    move-result v7

    add-int v13, v0, v7

    invoke-virtual/range {v23 .. v23}, Lj1/g$a;->e()I

    move-result v0

    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    if-lez v4, :cond_17

    iget v3, v8, Lj1/g;->l1:I

    add-int/2addr v13, v3

    :cond_17
    move v12, v0

    move/from16 v7, v21

    move/from16 v0, v25

    move-object/from16 v3, v26

    :goto_d
    add-int/lit8 v14, v4, 0x1

    move/from16 v15, p4

    move-object/from16 v4, v24

    goto/16 :goto_a

    :cond_18
    move v3, v12

    move v0, v13

    aput v0, p5, v21

    aput v3, p5, v20

    return-void
.end method

.method private V1([Lj1/e;III[I)V
    .locals 28

    move-object/from16 v8, p0

    move/from16 v9, p2

    move/from16 v15, p4

    if-nez v9, :cond_0

    return-void

    :cond_0
    iget-object v0, v8, Lj1/g;->s1:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    new-instance v10, Lj1/g$a;

    iget-object v3, v8, Lj1/e;->N:Lj1/d;

    iget-object v4, v8, Lj1/e;->O:Lj1/d;

    iget-object v5, v8, Lj1/e;->P:Lj1/d;

    iget-object v6, v8, Lj1/e;->Q:Lj1/d;

    move-object v0, v10

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v7, p4

    invoke-direct/range {v0 .. v7}, Lj1/g$a;-><init>(Lj1/g;ILj1/d;Lj1/d;Lj1/d;Lj1/d;I)V

    iget-object v0, v8, Lj1/g;->s1:Ljava/util/ArrayList;

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v20, 0x0

    const/16 v21, 0x1

    if-nez p3, :cond_7

    move/from16 v0, v20

    move v1, v0

    move v2, v1

    move v11, v2

    :goto_0
    if-ge v11, v9, :cond_e

    add-int/lit8 v0, v0, 0x1

    aget-object v12, p1, v11

    invoke-direct {v8, v12, v15}, Lj1/g;->S1(Lj1/e;I)I

    move-result v13

    invoke-virtual {v12}, Lj1/e;->x()Lj1/e$b;

    move-result-object v3

    sget-object v4, Lj1/e$b;->MATCH_CONSTRAINT:Lj1/e$b;

    if-ne v3, v4, :cond_1

    add-int/lit8 v1, v1, 0x1

    :cond_1
    move v14, v1

    if-eq v2, v15, :cond_2

    iget v1, v8, Lj1/g;->l1:I

    add-int/2addr v1, v2

    add-int/2addr v1, v13

    if-le v1, v15, :cond_3

    :cond_2
    invoke-static {v10}, Lj1/g$a;->a(Lj1/g$a;)Lj1/e;

    move-result-object v1

    if-eqz v1, :cond_3

    move/from16 v1, v21

    goto :goto_1

    :cond_3
    move/from16 v1, v20

    :goto_1
    if-nez v1, :cond_4

    if-lez v11, :cond_4

    iget v3, v8, Lj1/g;->q1:I

    if-lez v3, :cond_4

    if-le v0, v3, :cond_4

    move/from16 v1, v21

    :cond_4
    if-eqz v1, :cond_5

    new-instance v10, Lj1/g$a;

    iget-object v3, v8, Lj1/e;->N:Lj1/d;

    iget-object v4, v8, Lj1/e;->O:Lj1/d;

    iget-object v5, v8, Lj1/e;->P:Lj1/d;

    iget-object v6, v8, Lj1/e;->Q:Lj1/d;

    move-object v0, v10

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v7, p4

    invoke-direct/range {v0 .. v7}, Lj1/g$a;-><init>(Lj1/g;ILj1/d;Lj1/d;Lj1/d;Lj1/d;I)V

    invoke-virtual {v10, v11}, Lj1/g$a;->i(I)V

    iget-object v0, v8, Lj1/g;->s1:Ljava/util/ArrayList;

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v2, v13

    move/from16 v0, v21

    goto :goto_2

    :cond_5
    if-lez v11, :cond_6

    iget v1, v8, Lj1/g;->l1:I

    add-int/2addr v1, v13

    add-int/2addr v2, v1

    goto :goto_2

    :cond_6
    move v2, v13

    :goto_2
    invoke-virtual {v10, v12}, Lj1/g$a;->b(Lj1/e;)V

    add-int/lit8 v11, v11, 0x1

    move v1, v14

    goto :goto_0

    :cond_7
    move/from16 v0, v20

    move v1, v0

    move v2, v1

    move v11, v2

    :goto_3
    if-ge v11, v9, :cond_e

    add-int/lit8 v0, v0, 0x1

    aget-object v12, p1, v11

    invoke-direct {v8, v12, v15}, Lj1/g;->R1(Lj1/e;I)I

    move-result v13

    invoke-virtual {v12}, Lj1/e;->M()Lj1/e$b;

    move-result-object v3

    sget-object v4, Lj1/e$b;->MATCH_CONSTRAINT:Lj1/e$b;

    if-ne v3, v4, :cond_8

    add-int/lit8 v1, v1, 0x1

    :cond_8
    move v14, v1

    if-eq v2, v15, :cond_9

    iget v1, v8, Lj1/g;->m1:I

    add-int/2addr v1, v2

    add-int/2addr v1, v13

    if-le v1, v15, :cond_a

    :cond_9
    invoke-static {v10}, Lj1/g$a;->a(Lj1/g$a;)Lj1/e;

    move-result-object v1

    if-eqz v1, :cond_a

    move/from16 v1, v21

    goto :goto_4

    :cond_a
    move/from16 v1, v20

    :goto_4
    if-nez v1, :cond_b

    if-lez v11, :cond_b

    iget v3, v8, Lj1/g;->q1:I

    if-lez v3, :cond_b

    if-le v0, v3, :cond_b

    move/from16 v1, v21

    :cond_b
    if-eqz v1, :cond_c

    new-instance v10, Lj1/g$a;

    iget-object v3, v8, Lj1/e;->N:Lj1/d;

    iget-object v4, v8, Lj1/e;->O:Lj1/d;

    iget-object v5, v8, Lj1/e;->P:Lj1/d;

    iget-object v6, v8, Lj1/e;->Q:Lj1/d;

    move-object v0, v10

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v7, p4

    invoke-direct/range {v0 .. v7}, Lj1/g$a;-><init>(Lj1/g;ILj1/d;Lj1/d;Lj1/d;Lj1/d;I)V

    invoke-virtual {v10, v11}, Lj1/g$a;->i(I)V

    iget-object v0, v8, Lj1/g;->s1:Ljava/util/ArrayList;

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v2, v13

    move/from16 v0, v21

    goto :goto_5

    :cond_c
    if-lez v11, :cond_d

    iget v1, v8, Lj1/g;->m1:I

    add-int/2addr v1, v13

    add-int/2addr v2, v1

    goto :goto_5

    :cond_d
    move v2, v13

    :goto_5
    invoke-virtual {v10, v12}, Lj1/g$a;->b(Lj1/e;)V

    add-int/lit8 v11, v11, 0x1

    move v1, v14

    goto :goto_3

    :cond_e
    iget-object v0, v8, Lj1/g;->s1:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v2, v8, Lj1/e;->N:Lj1/d;

    iget-object v3, v8, Lj1/e;->O:Lj1/d;

    iget-object v4, v8, Lj1/e;->P:Lj1/d;

    iget-object v5, v8, Lj1/e;->Q:Lj1/d;

    invoke-virtual/range {p0 .. p0}, Lj1/l;->h1()I

    move-result v6

    invoke-virtual/range {p0 .. p0}, Lj1/l;->j1()I

    move-result v7

    invoke-virtual/range {p0 .. p0}, Lj1/l;->i1()I

    move-result v9

    invoke-virtual/range {p0 .. p0}, Lj1/l;->g1()I

    move-result v10

    invoke-virtual/range {p0 .. p0}, Lj1/e;->x()Lj1/e$b;

    move-result-object v11

    sget-object v12, Lj1/e$b;->WRAP_CONTENT:Lj1/e$b;

    if-eq v11, v12, :cond_10

    invoke-virtual/range {p0 .. p0}, Lj1/e;->M()Lj1/e$b;

    move-result-object v11

    if-ne v11, v12, :cond_f

    goto :goto_6

    :cond_f
    move/from16 v11, v20

    goto :goto_7

    :cond_10
    :goto_6
    move/from16 v11, v21

    :goto_7
    if-lez v1, :cond_12

    if-eqz v11, :cond_12

    move/from16 v1, v20

    :goto_8
    if-ge v1, v0, :cond_12

    iget-object v11, v8, Lj1/g;->s1:Ljava/util/ArrayList;

    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lj1/g$a;

    if-nez p3, :cond_11

    invoke-virtual {v11}, Lj1/g$a;->f()I

    move-result v12

    sub-int v12, v15, v12

    invoke-virtual {v11, v12}, Lj1/g$a;->g(I)V

    goto :goto_9

    :cond_11
    invoke-virtual {v11}, Lj1/g$a;->e()I

    move-result v12

    sub-int v12, v15, v12

    invoke-virtual {v11, v12}, Lj1/g$a;->g(I)V

    :goto_9
    add-int/lit8 v1, v1, 0x1

    goto :goto_8

    :cond_12
    move/from16 v22, v7

    move v1, v9

    move/from16 v12, v20

    move v13, v12

    move v14, v13

    move v7, v6

    move-object v6, v3

    move-object v3, v2

    move v2, v10

    :goto_a
    if-ge v14, v0, :cond_18

    iget-object v9, v8, Lj1/g;->s1:Ljava/util/ArrayList;

    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    move-object/from16 v23, v9

    check-cast v23, Lj1/g$a;

    if-nez p3, :cond_15

    add-int/lit8 v2, v0, -0x1

    if-ge v14, v2, :cond_13

    iget-object v2, v8, Lj1/g;->s1:Ljava/util/ArrayList;

    add-int/lit8 v5, v14, 0x1

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj1/g$a;

    invoke-static {v2}, Lj1/g$a;->a(Lj1/g$a;)Lj1/e;

    move-result-object v2

    iget-object v2, v2, Lj1/e;->O:Lj1/d;

    move/from16 v5, v20

    goto :goto_b

    :cond_13
    iget-object v2, v8, Lj1/e;->Q:Lj1/d;

    invoke-virtual/range {p0 .. p0}, Lj1/l;->g1()I

    move-result v5

    :goto_b
    invoke-static/range {v23 .. v23}, Lj1/g$a;->a(Lj1/g$a;)Lj1/e;

    move-result-object v9

    iget-object v11, v9, Lj1/e;->Q:Lj1/d;

    move-object/from16 v9, v23

    move/from16 v10, p3

    move-object/from16 v24, v11

    move-object v11, v3

    move-object/from16 p1, v3

    move v3, v12

    move-object v12, v6

    move v6, v13

    move-object v13, v4

    move-object/from16 p2, v4

    move v4, v14

    move-object v14, v2

    move v15, v7

    move/from16 v16, v22

    move/from16 v17, v1

    move/from16 v18, v5

    move/from16 v19, p4

    invoke-virtual/range {v9 .. v19}, Lj1/g$a;->j(ILj1/d;Lj1/d;Lj1/d;Lj1/d;IIIII)V

    invoke-virtual/range {v23 .. v23}, Lj1/g$a;->f()I

    move-result v9

    invoke-static {v6, v9}, Ljava/lang/Math;->max(II)I

    move-result v6

    invoke-virtual/range {v23 .. v23}, Lj1/g$a;->e()I

    move-result v9

    add-int v12, v3, v9

    if-lez v4, :cond_14

    iget v3, v8, Lj1/g;->m1:I

    add-int/2addr v12, v3

    :cond_14
    move-object/from16 v3, p1

    move v13, v6

    move/from16 v22, v20

    move-object/from16 v6, v24

    move-object/from16 v24, p2

    move/from16 v27, v5

    move-object v5, v2

    move/from16 v2, v27

    goto/16 :goto_d

    :cond_15
    move-object/from16 p1, v3

    move v3, v12

    move v1, v13

    move v4, v14

    add-int/lit8 v9, v0, -0x1

    if-ge v4, v9, :cond_16

    iget-object v9, v8, Lj1/g;->s1:Ljava/util/ArrayList;

    add-int/lit8 v14, v4, 0x1

    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lj1/g$a;

    invoke-static {v9}, Lj1/g$a;->a(Lj1/g$a;)Lj1/e;

    move-result-object v9

    iget-object v9, v9, Lj1/e;->N:Lj1/d;

    move-object/from16 v24, v9

    move/from16 v25, v20

    goto :goto_c

    :cond_16
    iget-object v9, v8, Lj1/e;->P:Lj1/d;

    invoke-virtual/range {p0 .. p0}, Lj1/l;->i1()I

    move-result v10

    move-object/from16 v24, v9

    move/from16 v25, v10

    :goto_c
    invoke-static/range {v23 .. v23}, Lj1/g$a;->a(Lj1/g$a;)Lj1/e;

    move-result-object v9

    iget-object v15, v9, Lj1/e;->P:Lj1/d;

    move-object/from16 v9, v23

    move/from16 v10, p3

    move-object/from16 v11, p1

    move-object v12, v6

    move-object/from16 v13, v24

    move-object v14, v5

    move-object/from16 v26, v15

    move v15, v7

    move/from16 v16, v22

    move/from16 v17, v25

    move/from16 v18, v2

    move/from16 v19, p4

    invoke-virtual/range {v9 .. v19}, Lj1/g$a;->j(ILj1/d;Lj1/d;Lj1/d;Lj1/d;IIIII)V

    invoke-virtual/range {v23 .. v23}, Lj1/g$a;->f()I

    move-result v7

    add-int v13, v1, v7

    invoke-virtual/range {v23 .. v23}, Lj1/g$a;->e()I

    move-result v1

    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-lez v4, :cond_17

    iget v3, v8, Lj1/g;->l1:I

    add-int/2addr v13, v3

    :cond_17
    move v12, v1

    move/from16 v7, v20

    move/from16 v1, v25

    move-object/from16 v3, v26

    :goto_d
    add-int/lit8 v14, v4, 0x1

    move/from16 v15, p4

    move-object/from16 v4, v24

    goto/16 :goto_a

    :cond_18
    move v3, v12

    move v1, v13

    aput v1, p5, v20

    aput v3, p5, v21

    return-void
.end method

.method private W1([Lj1/e;III[I)V
    .locals 22

    move-object/from16 v8, p0

    move/from16 v9, p2

    if-nez v9, :cond_0

    return-void

    :cond_0
    iget-object v0, v8, Lj1/g;->s1:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v10, 0x0

    if-nez v0, :cond_1

    new-instance v11, Lj1/g$a;

    iget-object v3, v8, Lj1/e;->N:Lj1/d;

    iget-object v4, v8, Lj1/e;->O:Lj1/d;

    iget-object v5, v8, Lj1/e;->P:Lj1/d;

    iget-object v6, v8, Lj1/e;->Q:Lj1/d;

    move-object v0, v11

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v7, p4

    invoke-direct/range {v0 .. v7}, Lj1/g$a;-><init>(Lj1/g;ILj1/d;Lj1/d;Lj1/d;Lj1/d;I)V

    iget-object v0, v8, Lj1/g;->s1:Ljava/util/ArrayList;

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object v0, v8, Lj1/g;->s1:Ljava/util/ArrayList;

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj1/g$a;

    invoke-virtual {v0}, Lj1/g$a;->c()V

    iget-object v13, v8, Lj1/e;->N:Lj1/d;

    iget-object v14, v8, Lj1/e;->O:Lj1/d;

    iget-object v15, v8, Lj1/e;->P:Lj1/d;

    iget-object v1, v8, Lj1/e;->Q:Lj1/d;

    invoke-virtual/range {p0 .. p0}, Lj1/l;->h1()I

    move-result v17

    invoke-virtual/range {p0 .. p0}, Lj1/l;->j1()I

    move-result v18

    invoke-virtual/range {p0 .. p0}, Lj1/l;->i1()I

    move-result v19

    invoke-virtual/range {p0 .. p0}, Lj1/l;->g1()I

    move-result v20

    move-object v11, v0

    move/from16 v12, p3

    move-object/from16 v16, v1

    move/from16 v21, p4

    invoke-virtual/range {v11 .. v21}, Lj1/g$a;->j(ILj1/d;Lj1/d;Lj1/d;Lj1/d;IIIII)V

    :goto_0
    move v0, v10

    :goto_1
    if-ge v0, v9, :cond_2

    aget-object v1, p1, v0

    invoke-virtual {v11, v1}, Lj1/g$a;->b(Lj1/e;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {v11}, Lj1/g$a;->f()I

    move-result v0

    aput v0, p5, v10

    invoke-virtual {v11}, Lj1/g$a;->e()I

    move-result v0

    const/4 v1, 0x1

    aput v0, p5, v1

    return-void
.end method

.method static synthetic w1(Lj1/g;)I
    .locals 0

    iget p0, p0, Lj1/g;->l1:I

    return p0
.end method

.method static synthetic x1(Lj1/g;)I
    .locals 0

    iget p0, p0, Lj1/g;->m1:I

    return p0
.end method

.method static synthetic y1(Lj1/g;)I
    .locals 0

    iget p0, p0, Lj1/g;->b1:I

    return p0
.end method

.method static synthetic z1(Lj1/g;)F
    .locals 0

    iget p0, p0, Lj1/g;->h1:F

    return p0
.end method


# virtual methods
.method public X1(F)V
    .locals 0

    iput p1, p0, Lj1/g;->h1:F

    return-void
.end method

.method public Y1(I)V
    .locals 0

    iput p1, p0, Lj1/g;->b1:I

    return-void
.end method

.method public Z1(F)V
    .locals 0

    iput p1, p0, Lj1/g;->i1:F

    return-void
.end method

.method public a2(I)V
    .locals 0

    iput p1, p0, Lj1/g;->c1:I

    return-void
.end method

.method public b2(I)V
    .locals 0

    iput p1, p0, Lj1/g;->n1:I

    return-void
.end method

.method public c2(F)V
    .locals 0

    iput p1, p0, Lj1/g;->f1:F

    return-void
.end method

.method public d(Lc1/d;Z)V
    .locals 5

    invoke-super {p0, p1, p2}, Lj1/e;->d(Lc1/d;Z)V

    invoke-virtual {p0}, Lj1/e;->F()Lj1/e;

    move-result-object p1

    const/4 p2, 0x0

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lj1/e;->F()Lj1/e;

    move-result-object p1

    check-cast p1, Lj1/f;

    invoke-virtual {p1}, Lj1/f;->y1()Z

    move-result p1

    if-eqz p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    move p1, p2

    :goto_0
    iget v1, p0, Lj1/g;->p1:I

    if-eqz v1, :cond_6

    if-eq v1, v0, :cond_4

    const/4 v2, 0x2

    if-eq v1, v2, :cond_3

    const/4 v2, 0x3

    if-eq v1, v2, :cond_1

    goto :goto_5

    :cond_1
    iget-object v1, p0, Lj1/g;->s1:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    move v2, p2

    :goto_1
    if-ge v2, v1, :cond_7

    iget-object v3, p0, Lj1/g;->s1:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj1/g$a;

    add-int/lit8 v4, v1, -0x1

    if-ne v2, v4, :cond_2

    move v4, v0

    goto :goto_2

    :cond_2
    move v4, p2

    :goto_2
    invoke-virtual {v3, p1, v2, v4}, Lj1/g$a;->d(ZIZ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    invoke-direct {p0, p1}, Lj1/g;->Q1(Z)V

    goto :goto_5

    :cond_4
    iget-object v1, p0, Lj1/g;->s1:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    move v2, p2

    :goto_3
    if-ge v2, v1, :cond_7

    iget-object v3, p0, Lj1/g;->s1:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj1/g$a;

    add-int/lit8 v4, v1, -0x1

    if-ne v2, v4, :cond_5

    move v4, v0

    goto :goto_4

    :cond_5
    move v4, p2

    :goto_4
    invoke-virtual {v3, p1, v2, v4}, Lj1/g$a;->d(ZIZ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lj1/g;->s1:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_7

    iget-object v1, p0, Lj1/g;->s1:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj1/g$a;

    invoke-virtual {v1, p1, p2, v0}, Lj1/g$a;->d(ZIZ)V

    :cond_7
    :goto_5
    invoke-virtual {p0, p2}, Lj1/l;->o1(Z)V

    return-void
.end method

.method public d2(I)V
    .locals 0

    iput p1, p0, Lj1/g;->l1:I

    return-void
.end method

.method public e2(I)V
    .locals 0

    iput p1, p0, Lj1/g;->Z0:I

    return-void
.end method

.method public f2(F)V
    .locals 0

    iput p1, p0, Lj1/g;->j1:F

    return-void
.end method

.method public g2(I)V
    .locals 0

    iput p1, p0, Lj1/g;->d1:I

    return-void
.end method

.method public h2(F)V
    .locals 0

    iput p1, p0, Lj1/g;->k1:F

    return-void
.end method

.method public i2(I)V
    .locals 0

    iput p1, p0, Lj1/g;->e1:I

    return-void
.end method

.method public j2(I)V
    .locals 0

    iput p1, p0, Lj1/g;->q1:I

    return-void
.end method

.method public k1(IIII)V
    .locals 18

    move-object/from16 v6, p0

    move/from16 v7, p1

    move/from16 v8, p2

    move/from16 v9, p3

    move/from16 v10, p4

    iget v0, v6, Lj1/j;->L0:I

    const/4 v11, 0x0

    if-lez v0, :cond_0

    invoke-virtual/range {p0 .. p0}, Lj1/l;->m1()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v6, v11, v11}, Lj1/l;->p1(II)V

    invoke-virtual {v6, v11}, Lj1/l;->o1(Z)V

    return-void

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lj1/l;->h1()I

    move-result v12

    invoke-virtual/range {p0 .. p0}, Lj1/l;->i1()I

    move-result v13

    invoke-virtual/range {p0 .. p0}, Lj1/l;->j1()I

    move-result v14

    invoke-virtual/range {p0 .. p0}, Lj1/l;->g1()I

    move-result v15

    const/4 v0, 0x2

    new-array v5, v0, [I

    sub-int v1, v8, v12

    sub-int/2addr v1, v13

    iget v2, v6, Lj1/g;->r1:I

    const/4 v4, 0x1

    if-ne v2, v4, :cond_1

    sub-int v1, v10, v14

    sub-int/2addr v1, v15

    :cond_1
    move/from16 v16, v1

    const/4 v1, -0x1

    if-nez v2, :cond_3

    iget v2, v6, Lj1/g;->Z0:I

    if-ne v2, v1, :cond_2

    iput v11, v6, Lj1/g;->Z0:I

    :cond_2
    iget v2, v6, Lj1/g;->a1:I

    if-ne v2, v1, :cond_5

    iput v11, v6, Lj1/g;->a1:I

    goto :goto_0

    :cond_3
    iget v2, v6, Lj1/g;->Z0:I

    if-ne v2, v1, :cond_4

    iput v11, v6, Lj1/g;->Z0:I

    :cond_4
    iget v2, v6, Lj1/g;->a1:I

    if-ne v2, v1, :cond_5

    iput v11, v6, Lj1/g;->a1:I

    :cond_5
    :goto_0
    iget-object v1, v6, Lj1/j;->K0:[Lj1/e;

    move v2, v11

    move v3, v2

    :goto_1
    iget v11, v6, Lj1/j;->L0:I

    const/16 v0, 0x8

    if-ge v2, v11, :cond_7

    iget-object v11, v6, Lj1/j;->K0:[Lj1/e;

    aget-object v11, v11, v2

    invoke-virtual {v11}, Lj1/e;->N()I

    move-result v11

    if-ne v11, v0, :cond_6

    add-int/lit8 v3, v3, 0x1

    :cond_6
    add-int/lit8 v2, v2, 0x1

    const/4 v0, 0x2

    goto :goto_1

    :cond_7
    if-lez v3, :cond_a

    sub-int/2addr v11, v3

    new-array v1, v11, [Lj1/e;

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_2
    iget v11, v6, Lj1/j;->L0:I

    if-ge v2, v11, :cond_9

    iget-object v11, v6, Lj1/j;->K0:[Lj1/e;

    aget-object v11, v11, v2

    invoke-virtual {v11}, Lj1/e;->N()I

    move-result v4

    if-eq v4, v0, :cond_8

    aput-object v11, v1, v3

    add-int/lit8 v3, v3, 0x1

    :cond_8
    add-int/lit8 v2, v2, 0x1

    const/4 v4, 0x1

    goto :goto_2

    :cond_9
    move v2, v3

    goto :goto_3

    :cond_a
    move v2, v11

    :goto_3
    iput-object v1, v6, Lj1/g;->w1:[Lj1/e;

    iput v2, v6, Lj1/g;->x1:I

    iget v0, v6, Lj1/g;->p1:I

    if-eqz v0, :cond_e

    const/4 v4, 0x1

    if-eq v0, v4, :cond_d

    const/4 v3, 0x2

    if-eq v0, v3, :cond_c

    const/4 v3, 0x3

    if-eq v0, v3, :cond_b

    move v11, v4

    move-object/from16 v17, v5

    :goto_4
    const/4 v0, 0x0

    goto :goto_5

    :cond_b
    iget v3, v6, Lj1/g;->r1:I

    move-object/from16 v0, p0

    move v11, v4

    move/from16 v4, v16

    move-object/from16 v17, v5

    invoke-direct/range {v0 .. v5}, Lj1/g;->V1([Lj1/e;III[I)V

    goto :goto_4

    :cond_c
    move v11, v4

    move-object/from16 v17, v5

    iget v3, v6, Lj1/g;->r1:I

    move-object/from16 v0, p0

    move/from16 v4, v16

    invoke-direct/range {v0 .. v5}, Lj1/g;->T1([Lj1/e;III[I)V

    goto :goto_4

    :cond_d
    move v11, v4

    move-object/from16 v17, v5

    iget v3, v6, Lj1/g;->r1:I

    move-object/from16 v0, p0

    move/from16 v4, v16

    invoke-direct/range {v0 .. v5}, Lj1/g;->U1([Lj1/e;III[I)V

    goto :goto_4

    :cond_e
    move-object/from16 v17, v5

    const/4 v11, 0x1

    iget v3, v6, Lj1/g;->r1:I

    move-object/from16 v0, p0

    move/from16 v4, v16

    invoke-direct/range {v0 .. v5}, Lj1/g;->W1([Lj1/e;III[I)V

    goto :goto_4

    :goto_5
    aget v1, v17, v0

    add-int/2addr v1, v12

    add-int/2addr v1, v13

    aget v2, v17, v11

    add-int/2addr v2, v14

    add-int/2addr v2, v15

    const/high16 v3, -0x80000000

    const/high16 v4, 0x40000000    # 2.0f

    if-ne v7, v4, :cond_f

    move v1, v8

    goto :goto_6

    :cond_f
    if-ne v7, v3, :cond_10

    invoke-static {v1, v8}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_6

    :cond_10
    if-nez v7, :cond_11

    goto :goto_6

    :cond_11
    move v1, v0

    :goto_6
    if-ne v9, v4, :cond_12

    move v2, v10

    goto :goto_7

    :cond_12
    if-ne v9, v3, :cond_13

    invoke-static {v2, v10}, Ljava/lang/Math;->min(II)I

    move-result v2

    goto :goto_7

    :cond_13
    if-nez v9, :cond_14

    goto :goto_7

    :cond_14
    move v2, v0

    :goto_7
    invoke-virtual {v6, v1, v2}, Lj1/l;->p1(II)V

    invoke-virtual {v6, v1}, Lj1/e;->U0(I)V

    invoke-virtual {v6, v2}, Lj1/e;->z0(I)V

    iget v1, v6, Lj1/j;->L0:I

    if-lez v1, :cond_15

    goto :goto_8

    :cond_15
    move v11, v0

    :goto_8
    invoke-virtual {v6, v11}, Lj1/l;->o1(Z)V

    return-void
.end method

.method public k2(I)V
    .locals 0

    iput p1, p0, Lj1/g;->r1:I

    return-void
.end method

.method public l2(I)V
    .locals 0

    iput p1, p0, Lj1/g;->o1:I

    return-void
.end method

.method public m2(F)V
    .locals 0

    iput p1, p0, Lj1/g;->g1:F

    return-void
.end method

.method public n2(I)V
    .locals 0

    iput p1, p0, Lj1/g;->m1:I

    return-void
.end method

.method public o2(I)V
    .locals 0

    iput p1, p0, Lj1/g;->a1:I

    return-void
.end method

.method public p2(I)V
    .locals 0

    iput p1, p0, Lj1/g;->p1:I

    return-void
.end method
