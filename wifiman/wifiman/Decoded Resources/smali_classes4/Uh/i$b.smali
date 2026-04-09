.class public final LUh/i$b;
.super Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/protobuf/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUh/i;
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

.field private o:Ljava/util/List;

.field private p:LUh/t;

.field private q:Ljava/util/List;

.field private r:LUh/e;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;-><init>()V

    const/4 v0, 0x6

    iput v0, p0, LUh/i$b;->e:I

    iput v0, p0, LUh/i$b;->f:I

    invoke-static {}, LUh/q;->h1()LUh/q;

    move-result-object v0

    iput-object v0, p0, LUh/i$b;->h:LUh/q;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/i$b;->j:Ljava/util/List;

    invoke-static {}, LUh/q;->h1()LUh/q;

    move-result-object v0

    iput-object v0, p0, LUh/i$b;->k:LUh/q;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/i$b;->m:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/i$b;->n:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/i$b;->o:Ljava/util/List;

    invoke-static {}, LUh/t;->P()LUh/t;

    move-result-object v0

    iput-object v0, p0, LUh/i$b;->p:LUh/t;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/i$b;->q:Ljava/util/List;

    invoke-static {}, LUh/e;->J()LUh/e;

    move-result-object v0

    iput-object v0, p0, LUh/i$b;->r:LUh/e;

    invoke-direct {p0}, LUh/i$b;->F()V

    return-void
.end method

.method private A()V
    .locals 3

    iget v0, p0, LUh/i$b;->d:I

    const/16 v1, 0x100

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LUh/i$b;->m:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LUh/i$b;->m:Ljava/util/List;

    iget v0, p0, LUh/i$b;->d:I

    or-int/2addr v0, v1

    iput v0, p0, LUh/i$b;->d:I

    :cond_0
    return-void
.end method

.method private B()V
    .locals 3

    iget v0, p0, LUh/i$b;->d:I

    const/16 v1, 0x20

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LUh/i$b;->j:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LUh/i$b;->j:Ljava/util/List;

    iget v0, p0, LUh/i$b;->d:I

    or-int/2addr v0, v1

    iput v0, p0, LUh/i$b;->d:I

    :cond_0
    return-void
.end method

.method private D()V
    .locals 3

    iget v0, p0, LUh/i$b;->d:I

    const/16 v1, 0x400

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LUh/i$b;->o:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LUh/i$b;->o:Ljava/util/List;

    iget v0, p0, LUh/i$b;->d:I

    or-int/2addr v0, v1

    iput v0, p0, LUh/i$b;->d:I

    :cond_0
    return-void
.end method

.method private E()V
    .locals 3

    iget v0, p0, LUh/i$b;->d:I

    const/16 v1, 0x1000

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LUh/i$b;->q:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LUh/i$b;->q:Ljava/util/List;

    iget v0, p0, LUh/i$b;->d:I

    or-int/2addr v0, v1

    iput v0, p0, LUh/i$b;->d:I

    :cond_0
    return-void
.end method

.method private F()V
    .locals 0

    return-void
.end method

.method static synthetic r()LUh/i$b;
    .locals 1

    invoke-static {}, LUh/i$b;->x()LUh/i$b;

    move-result-object v0

    return-object v0
.end method

.method private static x()LUh/i$b;
    .locals 1

    new-instance v0, LUh/i$b;

    invoke-direct {v0}, LUh/i$b;-><init>()V

    return-object v0
.end method

.method private z()V
    .locals 3

    iget v0, p0, LUh/i$b;->d:I

    const/16 v1, 0x200

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LUh/i$b;->n:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LUh/i$b;->n:Ljava/util/List;

    iget v0, p0, LUh/i$b;->d:I

    or-int/2addr v0, v1

    iput v0, p0, LUh/i$b;->d:I

    :cond_0
    return-void
.end method


# virtual methods
.method public G(LUh/e;)LUh/i$b;
    .locals 3

    iget v0, p0, LUh/i$b;->d:I

    const/16 v1, 0x2000

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LUh/i$b;->r:LUh/e;

    invoke-static {}, LUh/e;->J()LUh/e;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, LUh/i$b;->r:LUh/e;

    invoke-static {v0}, LUh/e;->d0(LUh/e;)LUh/e$b;

    move-result-object v0

    invoke-virtual {v0, p1}, LUh/e$b;->w(LUh/e;)LUh/e$b;

    move-result-object p1

    invoke-virtual {p1}, LUh/e$b;->p()LUh/e;

    move-result-object p1

    iput-object p1, p0, LUh/i$b;->r:LUh/e;

    goto :goto_0

    :cond_0
    iput-object p1, p0, LUh/i$b;->r:LUh/e;

    :goto_0
    iget p1, p0, LUh/i$b;->d:I

    or-int/2addr p1, v1

    iput p1, p0, LUh/i$b;->d:I

    return-object p0
.end method

.method public H(LUh/i;)LUh/i$b;
    .locals 2

    invoke-static {}, LUh/i;->k1()LUh/i;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p1}, LUh/i;->C1()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LUh/i;->m1()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/i$b;->N(I)LUh/i$b;

    :cond_1
    invoke-virtual {p1}, LUh/i;->E1()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, LUh/i;->o1()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/i$b;->P(I)LUh/i$b;

    :cond_2
    invoke-virtual {p1}, LUh/i;->D1()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, LUh/i;->n1()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/i$b;->O(I)LUh/i$b;

    :cond_3
    invoke-virtual {p1}, LUh/i;->H1()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, LUh/i;->r1()LUh/q;

    move-result-object v0

    invoke-virtual {p0, v0}, LUh/i$b;->L(LUh/q;)LUh/i$b;

    :cond_4
    invoke-virtual {p1}, LUh/i;->I1()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, LUh/i;->s1()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/i$b;->R(I)LUh/i$b;

    :cond_5
    invoke-static {p1}, LUh/i;->K0(LUh/i;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p0, LUh/i$b;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {p1}, LUh/i;->K0(LUh/i;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/i$b;->j:Ljava/util/List;

    iget v0, p0, LUh/i$b;->d:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, LUh/i$b;->d:I

    goto :goto_0

    :cond_6
    invoke-direct {p0}, LUh/i$b;->B()V

    iget-object v0, p0, LUh/i$b;->j:Ljava/util/List;

    invoke-static {p1}, LUh/i;->K0(LUh/i;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_7
    :goto_0
    invoke-virtual {p1}, LUh/i;->F1()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p1}, LUh/i;->p1()LUh/q;

    move-result-object v0

    invoke-virtual {p0, v0}, LUh/i$b;->K(LUh/q;)LUh/i$b;

    :cond_8
    invoke-virtual {p1}, LUh/i;->G1()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {p1}, LUh/i;->q1()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/i$b;->Q(I)LUh/i$b;

    :cond_9
    invoke-static {p1}, LUh/i;->T0(LUh/i;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_b

    iget-object v0, p0, LUh/i$b;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {p1}, LUh/i;->T0(LUh/i;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/i$b;->m:Ljava/util/List;

    iget v0, p0, LUh/i$b;->d:I

    and-int/lit16 v0, v0, -0x101

    iput v0, p0, LUh/i$b;->d:I

    goto :goto_1

    :cond_a
    invoke-direct {p0}, LUh/i$b;->A()V

    iget-object v0, p0, LUh/i$b;->m:Ljava/util/List;

    invoke-static {p1}, LUh/i;->T0(LUh/i;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_b
    :goto_1
    invoke-static {p1}, LUh/i;->V0(LUh/i;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_d

    iget-object v0, p0, LUh/i$b;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {p1}, LUh/i;->V0(LUh/i;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/i$b;->n:Ljava/util/List;

    iget v0, p0, LUh/i$b;->d:I

    and-int/lit16 v0, v0, -0x201

    iput v0, p0, LUh/i$b;->d:I

    goto :goto_2

    :cond_c
    invoke-direct {p0}, LUh/i$b;->z()V

    iget-object v0, p0, LUh/i$b;->n:Ljava/util/List;

    invoke-static {p1}, LUh/i;->V0(LUh/i;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_d
    :goto_2
    invoke-static {p1}, LUh/i;->X0(LUh/i;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_f

    iget-object v0, p0, LUh/i$b;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {p1}, LUh/i;->X0(LUh/i;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/i$b;->o:Ljava/util/List;

    iget v0, p0, LUh/i$b;->d:I

    and-int/lit16 v0, v0, -0x401

    iput v0, p0, LUh/i$b;->d:I

    goto :goto_3

    :cond_e
    invoke-direct {p0}, LUh/i$b;->D()V

    iget-object v0, p0, LUh/i$b;->o:Ljava/util/List;

    invoke-static {p1}, LUh/i;->X0(LUh/i;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_f
    :goto_3
    invoke-virtual {p1}, LUh/i;->J1()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {p1}, LUh/i;->w1()LUh/t;

    move-result-object v0

    invoke-virtual {p0, v0}, LUh/i$b;->M(LUh/t;)LUh/i$b;

    :cond_10
    invoke-static {p1}, LUh/i;->a1(LUh/i;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_12

    iget-object v0, p0, LUh/i$b;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-static {p1}, LUh/i;->a1(LUh/i;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/i$b;->q:Ljava/util/List;

    iget v0, p0, LUh/i$b;->d:I

    and-int/lit16 v0, v0, -0x1001

    iput v0, p0, LUh/i$b;->d:I

    goto :goto_4

    :cond_11
    invoke-direct {p0}, LUh/i$b;->E()V

    iget-object v0, p0, LUh/i$b;->q:Ljava/util/List;

    invoke-static {p1}, LUh/i;->a1(LUh/i;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_12
    :goto_4
    invoke-virtual {p1}, LUh/i;->B1()Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-virtual {p1}, LUh/i;->j1()LUh/e;

    move-result-object v0

    invoke-virtual {p0, v0}, LUh/i$b;->G(LUh/e;)LUh/i$b;

    :cond_13
    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;->q(Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;)V

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->e()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object v0

    invoke-static {p1}, LUh/i;->e1(LUh/i;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/d;->e(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->i(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;

    return-object p0
.end method

.method public I(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/i$b;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, LUh/i;->w:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-interface {v1, p1, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/p;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LUh/i;
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, LUh/i$b;->H(LUh/i;)LUh/i$b;

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

    check-cast p2, LUh/i;
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

    invoke-virtual {p0, v0}, LUh/i$b;->H(LUh/i;)LUh/i$b;

    :cond_1
    throw p1
.end method

.method public K(LUh/q;)LUh/i$b;
    .locals 3

    iget v0, p0, LUh/i$b;->d:I

    const/16 v1, 0x40

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LUh/i$b;->k:LUh/q;

    invoke-static {}, LUh/q;->h1()LUh/q;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, LUh/i$b;->k:LUh/q;

    invoke-static {v0}, LUh/q;->I1(LUh/q;)LUh/q$c;

    move-result-object v0

    invoke-virtual {v0, p1}, LUh/q$c;->E(LUh/q;)LUh/q$c;

    move-result-object p1

    invoke-virtual {p1}, LUh/q$c;->u()LUh/q;

    move-result-object p1

    iput-object p1, p0, LUh/i$b;->k:LUh/q;

    goto :goto_0

    :cond_0
    iput-object p1, p0, LUh/i$b;->k:LUh/q;

    :goto_0
    iget p1, p0, LUh/i$b;->d:I

    or-int/2addr p1, v1

    iput p1, p0, LUh/i$b;->d:I

    return-object p0
.end method

.method public L(LUh/q;)LUh/i$b;
    .locals 3

    iget v0, p0, LUh/i$b;->d:I

    const/16 v1, 0x8

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LUh/i$b;->h:LUh/q;

    invoke-static {}, LUh/q;->h1()LUh/q;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, LUh/i$b;->h:LUh/q;

    invoke-static {v0}, LUh/q;->I1(LUh/q;)LUh/q$c;

    move-result-object v0

    invoke-virtual {v0, p1}, LUh/q$c;->E(LUh/q;)LUh/q$c;

    move-result-object p1

    invoke-virtual {p1}, LUh/q$c;->u()LUh/q;

    move-result-object p1

    iput-object p1, p0, LUh/i$b;->h:LUh/q;

    goto :goto_0

    :cond_0
    iput-object p1, p0, LUh/i$b;->h:LUh/q;

    :goto_0
    iget p1, p0, LUh/i$b;->d:I

    or-int/2addr p1, v1

    iput p1, p0, LUh/i$b;->d:I

    return-object p0
.end method

.method public M(LUh/t;)LUh/i$b;
    .locals 3

    iget v0, p0, LUh/i$b;->d:I

    const/16 v1, 0x800

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LUh/i$b;->p:LUh/t;

    invoke-static {}, LUh/t;->P()LUh/t;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, LUh/i$b;->p:LUh/t;

    invoke-static {v0}, LUh/t;->G0(LUh/t;)LUh/t$b;

    move-result-object v0

    invoke-virtual {v0, p1}, LUh/t$b;->w(LUh/t;)LUh/t$b;

    move-result-object p1

    invoke-virtual {p1}, LUh/t$b;->p()LUh/t;

    move-result-object p1

    iput-object p1, p0, LUh/i$b;->p:LUh/t;

    goto :goto_0

    :cond_0
    iput-object p1, p0, LUh/i$b;->p:LUh/t;

    :goto_0
    iget p1, p0, LUh/i$b;->d:I

    or-int/2addr p1, v1

    iput p1, p0, LUh/i$b;->d:I

    return-object p0
.end method

.method public N(I)LUh/i$b;
    .locals 1

    iget v0, p0, LUh/i$b;->d:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, LUh/i$b;->d:I

    iput p1, p0, LUh/i$b;->e:I

    return-object p0
.end method

.method public O(I)LUh/i$b;
    .locals 1

    iget v0, p0, LUh/i$b;->d:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, LUh/i$b;->d:I

    iput p1, p0, LUh/i$b;->g:I

    return-object p0
.end method

.method public P(I)LUh/i$b;
    .locals 1

    iget v0, p0, LUh/i$b;->d:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, LUh/i$b;->d:I

    iput p1, p0, LUh/i$b;->f:I

    return-object p0
.end method

.method public Q(I)LUh/i$b;
    .locals 1

    iget v0, p0, LUh/i$b;->d:I

    or-int/lit16 v0, v0, 0x80

    iput v0, p0, LUh/i$b;->d:I

    iput p1, p0, LUh/i$b;->l:I

    return-object p0
.end method

.method public R(I)LUh/i$b;
    .locals 1

    iget v0, p0, LUh/i$b;->d:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, LUh/i$b;->d:I

    iput p1, p0, LUh/i$b;->i:I

    return-object p0
.end method

.method public bridge synthetic a()Lkotlin/reflect/jvm/internal/impl/protobuf/n;
    .locals 1

    invoke-virtual {p0}, LUh/i$b;->t()LUh/i;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b0(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/n$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, LUh/i$b;->I(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/i$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LUh/i$b;->w()LUh/i$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic f(Lkotlin/reflect/jvm/internal/impl/protobuf/h;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;
    .locals 0

    check-cast p1, LUh/i;

    invoke-virtual {p0, p1}, LUh/i$b;->H(LUh/i;)LUh/i$b;

    move-result-object p1

    return-object p1
.end method

.method public t()LUh/i;
    .locals 2

    invoke-virtual {p0}, LUh/i$b;->u()LUh/i;

    move-result-object v0

    invoke-virtual {v0}, LUh/i;->m()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/a$a;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/n;)Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0
.end method

.method public u()LUh/i;
    .locals 5

    new-instance v0, LUh/i;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LUh/i;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;LUh/a;)V

    iget v1, p0, LUh/i$b;->d:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget v2, p0, LUh/i$b;->e:I

    invoke-static {v0, v2}, LUh/i;->f0(LUh/i;I)I

    and-int/lit8 v2, v1, 0x2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    or-int/lit8 v3, v3, 0x2

    :cond_1
    iget v2, p0, LUh/i$b;->f:I

    invoke-static {v0, v2}, LUh/i;->q0(LUh/i;I)I

    and-int/lit8 v2, v1, 0x4

    const/4 v4, 0x4

    if-ne v2, v4, :cond_2

    or-int/lit8 v3, v3, 0x4

    :cond_2
    iget v2, p0, LUh/i$b;->g:I

    invoke-static {v0, v2}, LUh/i;->C0(LUh/i;I)I

    and-int/lit8 v2, v1, 0x8

    const/16 v4, 0x8

    if-ne v2, v4, :cond_3

    or-int/lit8 v3, v3, 0x8

    :cond_3
    iget-object v2, p0, LUh/i$b;->h:LUh/q;

    invoke-static {v0, v2}, LUh/i;->E0(LUh/i;LUh/q;)LUh/q;

    and-int/lit8 v2, v1, 0x10

    const/16 v4, 0x10

    if-ne v2, v4, :cond_4

    or-int/lit8 v3, v3, 0x10

    :cond_4
    iget v2, p0, LUh/i$b;->i:I

    invoke-static {v0, v2}, LUh/i;->G0(LUh/i;I)I

    iget v2, p0, LUh/i$b;->d:I

    const/16 v4, 0x20

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_5

    iget-object v2, p0, LUh/i$b;->j:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, LUh/i$b;->j:Ljava/util/List;

    iget v2, p0, LUh/i$b;->d:I

    and-int/lit8 v2, v2, -0x21

    iput v2, p0, LUh/i$b;->d:I

    :cond_5
    iget-object v2, p0, LUh/i$b;->j:Ljava/util/List;

    invoke-static {v0, v2}, LUh/i;->M0(LUh/i;Ljava/util/List;)Ljava/util/List;

    and-int/lit8 v2, v1, 0x40

    const/16 v4, 0x40

    if-ne v2, v4, :cond_6

    or-int/lit8 v3, v3, 0x20

    :cond_6
    iget-object v2, p0, LUh/i$b;->k:LUh/q;

    invoke-static {v0, v2}, LUh/i;->N0(LUh/i;LUh/q;)LUh/q;

    and-int/lit16 v2, v1, 0x80

    const/16 v4, 0x80

    if-ne v2, v4, :cond_7

    or-int/lit8 v3, v3, 0x40

    :cond_7
    iget v2, p0, LUh/i$b;->l:I

    invoke-static {v0, v2}, LUh/i;->P0(LUh/i;I)I

    iget v2, p0, LUh/i$b;->d:I

    const/16 v4, 0x100

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_8

    iget-object v2, p0, LUh/i$b;->m:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, LUh/i$b;->m:Ljava/util/List;

    iget v2, p0, LUh/i$b;->d:I

    and-int/lit16 v2, v2, -0x101

    iput v2, p0, LUh/i$b;->d:I

    :cond_8
    iget-object v2, p0, LUh/i$b;->m:Ljava/util/List;

    invoke-static {v0, v2}, LUh/i;->U0(LUh/i;Ljava/util/List;)Ljava/util/List;

    iget v2, p0, LUh/i$b;->d:I

    const/16 v4, 0x200

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_9

    iget-object v2, p0, LUh/i$b;->n:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, LUh/i$b;->n:Ljava/util/List;

    iget v2, p0, LUh/i$b;->d:I

    and-int/lit16 v2, v2, -0x201

    iput v2, p0, LUh/i$b;->d:I

    :cond_9
    iget-object v2, p0, LUh/i$b;->n:Ljava/util/List;

    invoke-static {v0, v2}, LUh/i;->W0(LUh/i;Ljava/util/List;)Ljava/util/List;

    iget v2, p0, LUh/i$b;->d:I

    const/16 v4, 0x400

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_a

    iget-object v2, p0, LUh/i$b;->o:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, LUh/i$b;->o:Ljava/util/List;

    iget v2, p0, LUh/i$b;->d:I

    and-int/lit16 v2, v2, -0x401

    iput v2, p0, LUh/i$b;->d:I

    :cond_a
    iget-object v2, p0, LUh/i$b;->o:Ljava/util/List;

    invoke-static {v0, v2}, LUh/i;->Y0(LUh/i;Ljava/util/List;)Ljava/util/List;

    and-int/lit16 v2, v1, 0x800

    const/16 v4, 0x800

    if-ne v2, v4, :cond_b

    or-int/lit16 v3, v3, 0x80

    :cond_b
    iget-object v2, p0, LUh/i$b;->p:LUh/t;

    invoke-static {v0, v2}, LUh/i;->Z0(LUh/i;LUh/t;)LUh/t;

    iget v2, p0, LUh/i$b;->d:I

    const/16 v4, 0x1000

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_c

    iget-object v2, p0, LUh/i$b;->q:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, LUh/i$b;->q:Ljava/util/List;

    iget v2, p0, LUh/i$b;->d:I

    and-int/lit16 v2, v2, -0x1001

    iput v2, p0, LUh/i$b;->d:I

    :cond_c
    iget-object v2, p0, LUh/i$b;->q:Ljava/util/List;

    invoke-static {v0, v2}, LUh/i;->b1(LUh/i;Ljava/util/List;)Ljava/util/List;

    const/16 v2, 0x2000

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_d

    or-int/lit16 v3, v3, 0x100

    :cond_d
    iget-object v1, p0, LUh/i$b;->r:LUh/e;

    invoke-static {v0, v1}, LUh/i;->c1(LUh/i;LUh/e;)LUh/e;

    invoke-static {v0, v3}, LUh/i;->d1(LUh/i;I)I

    return-object v0
.end method

.method public w()LUh/i$b;
    .locals 2

    invoke-static {}, LUh/i$b;->x()LUh/i$b;

    move-result-object v0

    invoke-virtual {p0}, LUh/i$b;->u()LUh/i;

    move-result-object v1

    invoke-virtual {v0, v1}, LUh/i$b;->H(LUh/i;)LUh/i$b;

    move-result-object v0

    return-object v0
.end method
