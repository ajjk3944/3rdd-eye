.class public final LUh/n$b;
.super Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/protobuf/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUh/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:LUh/q;

.field private i:I

.field private j:Ljava/util/List;

.field private k:LUh/q;

.field private l:I

.field private m:Ljava/util/List;

.field private n:Ljava/util/List;

.field private o:LUh/u;

.field private p:I

.field private q:I

.field private r:Ljava/util/List;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;-><init>()V

    const/16 v0, 0x206

    iput v0, p0, LUh/n$b;->e:I

    const/16 v0, 0x806

    iput v0, p0, LUh/n$b;->f:I

    invoke-static {}, LUh/q;->h1()LUh/q;

    move-result-object v0

    iput-object v0, p0, LUh/n$b;->h:LUh/q;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/n$b;->j:Ljava/util/List;

    invoke-static {}, LUh/q;->h1()LUh/q;

    move-result-object v0

    iput-object v0, p0, LUh/n$b;->k:LUh/q;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/n$b;->m:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/n$b;->n:Ljava/util/List;

    invoke-static {}, LUh/u;->P0()LUh/u;

    move-result-object v0

    iput-object v0, p0, LUh/n$b;->o:LUh/u;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/n$b;->r:Ljava/util/List;

    invoke-direct {p0}, LUh/n$b;->E()V

    return-void
.end method

.method private A()V
    .locals 3

    iget v0, p0, LUh/n$b;->d:I

    const/16 v1, 0x100

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LUh/n$b;->m:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LUh/n$b;->m:Ljava/util/List;

    iget v0, p0, LUh/n$b;->d:I

    or-int/2addr v0, v1

    iput v0, p0, LUh/n$b;->d:I

    :cond_0
    return-void
.end method

.method private B()V
    .locals 3

    iget v0, p0, LUh/n$b;->d:I

    const/16 v1, 0x20

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LUh/n$b;->j:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LUh/n$b;->j:Ljava/util/List;

    iget v0, p0, LUh/n$b;->d:I

    or-int/2addr v0, v1

    iput v0, p0, LUh/n$b;->d:I

    :cond_0
    return-void
.end method

.method private D()V
    .locals 3

    iget v0, p0, LUh/n$b;->d:I

    const/16 v1, 0x2000

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LUh/n$b;->r:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LUh/n$b;->r:Ljava/util/List;

    iget v0, p0, LUh/n$b;->d:I

    or-int/2addr v0, v1

    iput v0, p0, LUh/n$b;->d:I

    :cond_0
    return-void
.end method

.method private E()V
    .locals 0

    return-void
.end method

.method static synthetic r()LUh/n$b;
    .locals 1

    invoke-static {}, LUh/n$b;->x()LUh/n$b;

    move-result-object v0

    return-object v0
.end method

.method private static x()LUh/n$b;
    .locals 1

    new-instance v0, LUh/n$b;

    invoke-direct {v0}, LUh/n$b;-><init>()V

    return-object v0
.end method

.method private z()V
    .locals 3

    iget v0, p0, LUh/n$b;->d:I

    const/16 v1, 0x200

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LUh/n$b;->n:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LUh/n$b;->n:Ljava/util/List;

    iget v0, p0, LUh/n$b;->d:I

    or-int/2addr v0, v1

    iput v0, p0, LUh/n$b;->d:I

    :cond_0
    return-void
.end method


# virtual methods
.method public F(LUh/n;)LUh/n$b;
    .locals 2

    invoke-static {}, LUh/n;->i1()LUh/n;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p1}, LUh/n;->y1()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LUh/n;->k1()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/n$b;->L(I)LUh/n$b;

    :cond_1
    invoke-virtual {p1}, LUh/n;->B1()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, LUh/n;->n1()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/n$b;->O(I)LUh/n$b;

    :cond_2
    invoke-virtual {p1}, LUh/n;->A1()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, LUh/n;->m1()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/n$b;->N(I)LUh/n$b;

    :cond_3
    invoke-virtual {p1}, LUh/n;->E1()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, LUh/n;->q1()LUh/q;

    move-result-object v0

    invoke-virtual {p0, v0}, LUh/n$b;->I(LUh/q;)LUh/n$b;

    :cond_4
    invoke-virtual {p1}, LUh/n;->F1()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, LUh/n;->r1()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/n$b;->Q(I)LUh/n$b;

    :cond_5
    invoke-static {p1}, LUh/n;->K0(LUh/n;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p0, LUh/n$b;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {p1}, LUh/n;->K0(LUh/n;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/n$b;->j:Ljava/util/List;

    iget v0, p0, LUh/n$b;->d:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, LUh/n$b;->d:I

    goto :goto_0

    :cond_6
    invoke-direct {p0}, LUh/n$b;->B()V

    iget-object v0, p0, LUh/n$b;->j:Ljava/util/List;

    invoke-static {p1}, LUh/n;->K0(LUh/n;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_7
    :goto_0
    invoke-virtual {p1}, LUh/n;->C1()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p1}, LUh/n;->o1()LUh/q;

    move-result-object v0

    invoke-virtual {p0, v0}, LUh/n$b;->H(LUh/q;)LUh/n$b;

    :cond_8
    invoke-virtual {p1}, LUh/n;->D1()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {p1}, LUh/n;->p1()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/n$b;->P(I)LUh/n$b;

    :cond_9
    invoke-static {p1}, LUh/n;->T0(LUh/n;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_b

    iget-object v0, p0, LUh/n$b;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {p1}, LUh/n;->T0(LUh/n;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/n$b;->m:Ljava/util/List;

    iget v0, p0, LUh/n$b;->d:I

    and-int/lit16 v0, v0, -0x101

    iput v0, p0, LUh/n$b;->d:I

    goto :goto_1

    :cond_a
    invoke-direct {p0}, LUh/n$b;->A()V

    iget-object v0, p0, LUh/n$b;->m:Ljava/util/List;

    invoke-static {p1}, LUh/n;->T0(LUh/n;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_b
    :goto_1
    invoke-static {p1}, LUh/n;->V0(LUh/n;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_d

    iget-object v0, p0, LUh/n$b;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {p1}, LUh/n;->V0(LUh/n;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/n$b;->n:Ljava/util/List;

    iget v0, p0, LUh/n$b;->d:I

    and-int/lit16 v0, v0, -0x201

    iput v0, p0, LUh/n$b;->d:I

    goto :goto_2

    :cond_c
    invoke-direct {p0}, LUh/n$b;->z()V

    iget-object v0, p0, LUh/n$b;->n:Ljava/util/List;

    invoke-static {p1}, LUh/n;->V0(LUh/n;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_d
    :goto_2
    invoke-virtual {p1}, LUh/n;->H1()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-virtual {p1}, LUh/n;->t1()LUh/u;

    move-result-object v0

    invoke-virtual {p0, v0}, LUh/n$b;->K(LUh/u;)LUh/n$b;

    :cond_e
    invoke-virtual {p1}, LUh/n;->z1()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-virtual {p1}, LUh/n;->l1()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/n$b;->M(I)LUh/n$b;

    :cond_f
    invoke-virtual {p1}, LUh/n;->G1()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {p1}, LUh/n;->s1()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/n$b;->R(I)LUh/n$b;

    :cond_10
    invoke-static {p1}, LUh/n;->a1(LUh/n;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_12

    iget-object v0, p0, LUh/n$b;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-static {p1}, LUh/n;->a1(LUh/n;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/n$b;->r:Ljava/util/List;

    iget v0, p0, LUh/n$b;->d:I

    and-int/lit16 v0, v0, -0x2001

    iput v0, p0, LUh/n$b;->d:I

    goto :goto_3

    :cond_11
    invoke-direct {p0}, LUh/n$b;->D()V

    iget-object v0, p0, LUh/n$b;->r:Ljava/util/List;

    invoke-static {p1}, LUh/n;->a1(LUh/n;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_12
    :goto_3
    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;->q(Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;)V

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->e()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object v0

    invoke-static {p1}, LUh/n;->d1(LUh/n;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/d;->e(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->i(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;

    return-object p0
.end method

.method public G(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/n$b;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, LUh/n;->w:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-interface {v1, p1, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/p;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LUh/n;
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, LUh/n$b;->F(LUh/n;)LUh/n$b;

    :cond_0
    return-object p0

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_1
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->a()Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    move-result-object p2

    check-cast p2, LUh/n;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p1

    move-object v0, p2

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, LUh/n$b;->F(LUh/n;)LUh/n$b;

    :cond_1
    throw p1
.end method

.method public H(LUh/q;)LUh/n$b;
    .locals 3

    iget v0, p0, LUh/n$b;->d:I

    const/16 v1, 0x40

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LUh/n$b;->k:LUh/q;

    invoke-static {}, LUh/q;->h1()LUh/q;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, LUh/n$b;->k:LUh/q;

    invoke-static {v0}, LUh/q;->I1(LUh/q;)LUh/q$c;

    move-result-object v0

    invoke-virtual {v0, p1}, LUh/q$c;->E(LUh/q;)LUh/q$c;

    move-result-object p1

    invoke-virtual {p1}, LUh/q$c;->u()LUh/q;

    move-result-object p1

    iput-object p1, p0, LUh/n$b;->k:LUh/q;

    goto :goto_0

    :cond_0
    iput-object p1, p0, LUh/n$b;->k:LUh/q;

    :goto_0
    iget p1, p0, LUh/n$b;->d:I

    or-int/2addr p1, v1

    iput p1, p0, LUh/n$b;->d:I

    return-object p0
.end method

.method public I(LUh/q;)LUh/n$b;
    .locals 3

    iget v0, p0, LUh/n$b;->d:I

    const/16 v1, 0x8

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LUh/n$b;->h:LUh/q;

    invoke-static {}, LUh/q;->h1()LUh/q;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, LUh/n$b;->h:LUh/q;

    invoke-static {v0}, LUh/q;->I1(LUh/q;)LUh/q$c;

    move-result-object v0

    invoke-virtual {v0, p1}, LUh/q$c;->E(LUh/q;)LUh/q$c;

    move-result-object p1

    invoke-virtual {p1}, LUh/q$c;->u()LUh/q;

    move-result-object p1

    iput-object p1, p0, LUh/n$b;->h:LUh/q;

    goto :goto_0

    :cond_0
    iput-object p1, p0, LUh/n$b;->h:LUh/q;

    :goto_0
    iget p1, p0, LUh/n$b;->d:I

    or-int/2addr p1, v1

    iput p1, p0, LUh/n$b;->d:I

    return-object p0
.end method

.method public K(LUh/u;)LUh/n$b;
    .locals 3

    iget v0, p0, LUh/n$b;->d:I

    const/16 v1, 0x400

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LUh/n$b;->o:LUh/u;

    invoke-static {}, LUh/u;->P0()LUh/u;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, LUh/n$b;->o:LUh/u;

    invoke-static {v0}, LUh/u;->i1(LUh/u;)LUh/u$b;

    move-result-object v0

    invoke-virtual {v0, p1}, LUh/u$b;->A(LUh/u;)LUh/u$b;

    move-result-object p1

    invoke-virtual {p1}, LUh/u$b;->u()LUh/u;

    move-result-object p1

    iput-object p1, p0, LUh/n$b;->o:LUh/u;

    goto :goto_0

    :cond_0
    iput-object p1, p0, LUh/n$b;->o:LUh/u;

    :goto_0
    iget p1, p0, LUh/n$b;->d:I

    or-int/2addr p1, v1

    iput p1, p0, LUh/n$b;->d:I

    return-object p0
.end method

.method public L(I)LUh/n$b;
    .locals 1

    iget v0, p0, LUh/n$b;->d:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, LUh/n$b;->d:I

    iput p1, p0, LUh/n$b;->e:I

    return-object p0
.end method

.method public M(I)LUh/n$b;
    .locals 1

    iget v0, p0, LUh/n$b;->d:I

    or-int/lit16 v0, v0, 0x800

    iput v0, p0, LUh/n$b;->d:I

    iput p1, p0, LUh/n$b;->p:I

    return-object p0
.end method

.method public N(I)LUh/n$b;
    .locals 1

    iget v0, p0, LUh/n$b;->d:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, LUh/n$b;->d:I

    iput p1, p0, LUh/n$b;->g:I

    return-object p0
.end method

.method public O(I)LUh/n$b;
    .locals 1

    iget v0, p0, LUh/n$b;->d:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, LUh/n$b;->d:I

    iput p1, p0, LUh/n$b;->f:I

    return-object p0
.end method

.method public P(I)LUh/n$b;
    .locals 1

    iget v0, p0, LUh/n$b;->d:I

    or-int/lit16 v0, v0, 0x80

    iput v0, p0, LUh/n$b;->d:I

    iput p1, p0, LUh/n$b;->l:I

    return-object p0
.end method

.method public Q(I)LUh/n$b;
    .locals 1

    iget v0, p0, LUh/n$b;->d:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, LUh/n$b;->d:I

    iput p1, p0, LUh/n$b;->i:I

    return-object p0
.end method

.method public R(I)LUh/n$b;
    .locals 1

    iget v0, p0, LUh/n$b;->d:I

    or-int/lit16 v0, v0, 0x1000

    iput v0, p0, LUh/n$b;->d:I

    iput p1, p0, LUh/n$b;->q:I

    return-object p0
.end method

.method public bridge synthetic a()Lkotlin/reflect/jvm/internal/impl/protobuf/n;
    .locals 1

    invoke-virtual {p0}, LUh/n$b;->t()LUh/n;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b0(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/n$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, LUh/n$b;->G(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/n$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LUh/n$b;->w()LUh/n$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic f(Lkotlin/reflect/jvm/internal/impl/protobuf/h;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;
    .locals 0

    check-cast p1, LUh/n;

    invoke-virtual {p0, p1}, LUh/n$b;->F(LUh/n;)LUh/n$b;

    move-result-object p1

    return-object p1
.end method

.method public t()LUh/n;
    .locals 2

    invoke-virtual {p0}, LUh/n$b;->u()LUh/n;

    move-result-object v0

    invoke-virtual {v0}, LUh/n;->m()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/a$a;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/n;)Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0
.end method

.method public u()LUh/n;
    .locals 5

    new-instance v0, LUh/n;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LUh/n;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;LUh/a;)V

    iget v1, p0, LUh/n$b;->d:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget v2, p0, LUh/n$b;->e:I

    invoke-static {v0, v2}, LUh/n;->f0(LUh/n;I)I

    and-int/lit8 v2, v1, 0x2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    or-int/lit8 v3, v3, 0x2

    :cond_1
    iget v2, p0, LUh/n$b;->f:I

    invoke-static {v0, v2}, LUh/n;->q0(LUh/n;I)I

    and-int/lit8 v2, v1, 0x4

    const/4 v4, 0x4

    if-ne v2, v4, :cond_2

    or-int/lit8 v3, v3, 0x4

    :cond_2
    iget v2, p0, LUh/n$b;->g:I

    invoke-static {v0, v2}, LUh/n;->C0(LUh/n;I)I

    and-int/lit8 v2, v1, 0x8

    const/16 v4, 0x8

    if-ne v2, v4, :cond_3

    or-int/lit8 v3, v3, 0x8

    :cond_3
    iget-object v2, p0, LUh/n$b;->h:LUh/q;

    invoke-static {v0, v2}, LUh/n;->E0(LUh/n;LUh/q;)LUh/q;

    and-int/lit8 v2, v1, 0x10

    const/16 v4, 0x10

    if-ne v2, v4, :cond_4

    or-int/lit8 v3, v3, 0x10

    :cond_4
    iget v2, p0, LUh/n$b;->i:I

    invoke-static {v0, v2}, LUh/n;->G0(LUh/n;I)I

    iget v2, p0, LUh/n$b;->d:I

    const/16 v4, 0x20

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_5

    iget-object v2, p0, LUh/n$b;->j:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, LUh/n$b;->j:Ljava/util/List;

    iget v2, p0, LUh/n$b;->d:I

    and-int/lit8 v2, v2, -0x21

    iput v2, p0, LUh/n$b;->d:I

    :cond_5
    iget-object v2, p0, LUh/n$b;->j:Ljava/util/List;

    invoke-static {v0, v2}, LUh/n;->M0(LUh/n;Ljava/util/List;)Ljava/util/List;

    and-int/lit8 v2, v1, 0x40

    const/16 v4, 0x40

    if-ne v2, v4, :cond_6

    or-int/lit8 v3, v3, 0x20

    :cond_6
    iget-object v2, p0, LUh/n$b;->k:LUh/q;

    invoke-static {v0, v2}, LUh/n;->N0(LUh/n;LUh/q;)LUh/q;

    and-int/lit16 v2, v1, 0x80

    const/16 v4, 0x80

    if-ne v2, v4, :cond_7

    or-int/lit8 v3, v3, 0x40

    :cond_7
    iget v2, p0, LUh/n$b;->l:I

    invoke-static {v0, v2}, LUh/n;->P0(LUh/n;I)I

    iget v2, p0, LUh/n$b;->d:I

    const/16 v4, 0x100

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_8

    iget-object v2, p0, LUh/n$b;->m:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, LUh/n$b;->m:Ljava/util/List;

    iget v2, p0, LUh/n$b;->d:I

    and-int/lit16 v2, v2, -0x101

    iput v2, p0, LUh/n$b;->d:I

    :cond_8
    iget-object v2, p0, LUh/n$b;->m:Ljava/util/List;

    invoke-static {v0, v2}, LUh/n;->U0(LUh/n;Ljava/util/List;)Ljava/util/List;

    iget v2, p0, LUh/n$b;->d:I

    const/16 v4, 0x200

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_9

    iget-object v2, p0, LUh/n$b;->n:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, LUh/n$b;->n:Ljava/util/List;

    iget v2, p0, LUh/n$b;->d:I

    and-int/lit16 v2, v2, -0x201

    iput v2, p0, LUh/n$b;->d:I

    :cond_9
    iget-object v2, p0, LUh/n$b;->n:Ljava/util/List;

    invoke-static {v0, v2}, LUh/n;->W0(LUh/n;Ljava/util/List;)Ljava/util/List;

    and-int/lit16 v2, v1, 0x400

    const/16 v4, 0x400

    if-ne v2, v4, :cond_a

    or-int/lit16 v3, v3, 0x80

    :cond_a
    iget-object v2, p0, LUh/n$b;->o:LUh/u;

    invoke-static {v0, v2}, LUh/n;->X0(LUh/n;LUh/u;)LUh/u;

    and-int/lit16 v2, v1, 0x800

    const/16 v4, 0x800

    if-ne v2, v4, :cond_b

    or-int/lit16 v3, v3, 0x100

    :cond_b
    iget v2, p0, LUh/n$b;->p:I

    invoke-static {v0, v2}, LUh/n;->Y0(LUh/n;I)I

    const/16 v2, 0x1000

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_c

    or-int/lit16 v3, v3, 0x200

    :cond_c
    iget v1, p0, LUh/n$b;->q:I

    invoke-static {v0, v1}, LUh/n;->Z0(LUh/n;I)I

    iget v1, p0, LUh/n$b;->d:I

    const/16 v2, 0x2000

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_d

    iget-object v1, p0, LUh/n$b;->r:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, LUh/n$b;->r:Ljava/util/List;

    iget v1, p0, LUh/n$b;->d:I

    and-int/lit16 v1, v1, -0x2001

    iput v1, p0, LUh/n$b;->d:I

    :cond_d
    iget-object v1, p0, LUh/n$b;->r:Ljava/util/List;

    invoke-static {v0, v1}, LUh/n;->b1(LUh/n;Ljava/util/List;)Ljava/util/List;

    invoke-static {v0, v3}, LUh/n;->c1(LUh/n;I)I

    return-object v0
.end method

.method public w()LUh/n$b;
    .locals 2

    invoke-static {}, LUh/n$b;->x()LUh/n$b;

    move-result-object v0

    invoke-virtual {p0}, LUh/n$b;->u()LUh/n;

    move-result-object v1

    invoke-virtual {v0, v1}, LUh/n$b;->F(LUh/n;)LUh/n$b;

    move-result-object v0

    return-object v0
.end method
