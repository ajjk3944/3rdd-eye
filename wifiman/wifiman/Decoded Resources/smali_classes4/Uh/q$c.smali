.class public final LUh/q$c;
.super Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/protobuf/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUh/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private d:I

.field private e:Ljava/util/List;

.field private f:Z

.field private g:I

.field private h:LUh/q;

.field private i:I

.field private j:I

.field private k:I

.field private l:I

.field private m:I

.field private n:LUh/q;

.field private o:I

.field private p:LUh/q;

.field private q:I

.field private r:I


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/q$c;->e:Ljava/util/List;

    invoke-static {}, LUh/q;->h1()LUh/q;

    move-result-object v0

    iput-object v0, p0, LUh/q$c;->h:LUh/q;

    invoke-static {}, LUh/q;->h1()LUh/q;

    move-result-object v0

    iput-object v0, p0, LUh/q$c;->n:LUh/q;

    invoke-static {}, LUh/q;->h1()LUh/q;

    move-result-object v0

    iput-object v0, p0, LUh/q$c;->p:LUh/q;

    invoke-direct {p0}, LUh/q$c;->A()V

    return-void
.end method

.method private A()V
    .locals 0

    return-void
.end method

.method static synthetic r()LUh/q$c;
    .locals 1

    invoke-static {}, LUh/q$c;->x()LUh/q$c;

    move-result-object v0

    return-object v0
.end method

.method private static x()LUh/q$c;
    .locals 1

    new-instance v0, LUh/q$c;

    invoke-direct {v0}, LUh/q$c;-><init>()V

    return-object v0
.end method

.method private z()V
    .locals 3

    iget v0, p0, LUh/q$c;->d:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LUh/q$c;->e:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LUh/q$c;->e:Ljava/util/List;

    iget v0, p0, LUh/q$c;->d:I

    or-int/2addr v0, v1

    iput v0, p0, LUh/q$c;->d:I

    :cond_0
    return-void
.end method


# virtual methods
.method public B(LUh/q;)LUh/q$c;
    .locals 3

    iget v0, p0, LUh/q$c;->d:I

    const/16 v1, 0x800

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LUh/q$c;->p:LUh/q;

    invoke-static {}, LUh/q;->h1()LUh/q;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, LUh/q$c;->p:LUh/q;

    invoke-static {v0}, LUh/q;->I1(LUh/q;)LUh/q$c;

    move-result-object v0

    invoke-virtual {v0, p1}, LUh/q$c;->E(LUh/q;)LUh/q$c;

    move-result-object p1

    invoke-virtual {p1}, LUh/q$c;->u()LUh/q;

    move-result-object p1

    iput-object p1, p0, LUh/q$c;->p:LUh/q;

    goto :goto_0

    :cond_0
    iput-object p1, p0, LUh/q$c;->p:LUh/q;

    :goto_0
    iget p1, p0, LUh/q$c;->d:I

    or-int/2addr p1, v1

    iput p1, p0, LUh/q$c;->d:I

    return-object p0
.end method

.method public D(LUh/q;)LUh/q$c;
    .locals 3

    iget v0, p0, LUh/q$c;->d:I

    const/16 v1, 0x8

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LUh/q$c;->h:LUh/q;

    invoke-static {}, LUh/q;->h1()LUh/q;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, LUh/q$c;->h:LUh/q;

    invoke-static {v0}, LUh/q;->I1(LUh/q;)LUh/q$c;

    move-result-object v0

    invoke-virtual {v0, p1}, LUh/q$c;->E(LUh/q;)LUh/q$c;

    move-result-object p1

    invoke-virtual {p1}, LUh/q$c;->u()LUh/q;

    move-result-object p1

    iput-object p1, p0, LUh/q$c;->h:LUh/q;

    goto :goto_0

    :cond_0
    iput-object p1, p0, LUh/q$c;->h:LUh/q;

    :goto_0
    iget p1, p0, LUh/q$c;->d:I

    or-int/2addr p1, v1

    iput p1, p0, LUh/q$c;->d:I

    return-object p0
.end method

.method public E(LUh/q;)LUh/q$c;
    .locals 2

    invoke-static {}, LUh/q;->h1()LUh/q;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-static {p1}, LUh/q;->f0(LUh/q;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, LUh/q$c;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, LUh/q;->f0(LUh/q;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/q$c;->e:Ljava/util/List;

    iget v0, p0, LUh/q$c;->d:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, LUh/q$c;->d:I

    goto :goto_0

    :cond_1
    invoke-direct {p0}, LUh/q$c;->z()V

    iget-object v0, p0, LUh/q$c;->e:Ljava/util/List;

    invoke-static {p1}, LUh/q;->f0(LUh/q;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_2
    :goto_0
    invoke-virtual {p1}, LUh/q;->A1()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, LUh/q;->n1()Z

    move-result v0

    invoke-virtual {p0, v0}, LUh/q$c;->N(Z)LUh/q$c;

    :cond_3
    invoke-virtual {p1}, LUh/q;->x1()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, LUh/q;->k1()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/q$c;->L(I)LUh/q$c;

    :cond_4
    invoke-virtual {p1}, LUh/q;->y1()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, LUh/q;->l1()LUh/q;

    move-result-object v0

    invoke-virtual {p0, v0}, LUh/q$c;->D(LUh/q;)LUh/q$c;

    :cond_5
    invoke-virtual {p1}, LUh/q;->z1()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p1}, LUh/q;->m1()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/q$c;->M(I)LUh/q$c;

    :cond_6
    invoke-virtual {p1}, LUh/q;->v1()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p1}, LUh/q;->g1()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/q$c;->I(I)LUh/q$c;

    :cond_7
    invoke-virtual {p1}, LUh/q;->E1()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p1}, LUh/q;->r1()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/q$c;->Q(I)LUh/q$c;

    :cond_8
    invoke-virtual {p1}, LUh/q;->F1()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {p1}, LUh/q;->s1()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/q$c;->R(I)LUh/q$c;

    :cond_9
    invoke-virtual {p1}, LUh/q;->D1()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {p1}, LUh/q;->q1()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/q$c;->P(I)LUh/q$c;

    :cond_a
    invoke-virtual {p1}, LUh/q;->B1()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual {p1}, LUh/q;->o1()LUh/q;

    move-result-object v0

    invoke-virtual {p0, v0}, LUh/q$c;->G(LUh/q;)LUh/q$c;

    :cond_b
    invoke-virtual {p1}, LUh/q;->C1()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-virtual {p1}, LUh/q;->p1()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/q$c;->O(I)LUh/q$c;

    :cond_c
    invoke-virtual {p1}, LUh/q;->t1()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-virtual {p1}, LUh/q;->b1()LUh/q;

    move-result-object v0

    invoke-virtual {p0, v0}, LUh/q$c;->B(LUh/q;)LUh/q$c;

    :cond_d
    invoke-virtual {p1}, LUh/q;->u1()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-virtual {p1}, LUh/q;->c1()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/q$c;->H(I)LUh/q$c;

    :cond_e
    invoke-virtual {p1}, LUh/q;->w1()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-virtual {p1}, LUh/q;->j1()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/q$c;->K(I)LUh/q$c;

    :cond_f
    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;->q(Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;)V

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->e()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object v0

    invoke-static {p1}, LUh/q;->a1(LUh/q;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/d;->e(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->i(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;

    return-object p0
.end method

.method public F(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/q$c;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, LUh/q;->v:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-interface {v1, p1, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/p;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LUh/q;
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, LUh/q$c;->E(LUh/q;)LUh/q$c;

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

    check-cast p2, LUh/q;
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

    invoke-virtual {p0, v0}, LUh/q$c;->E(LUh/q;)LUh/q$c;

    :cond_1
    throw p1
.end method

.method public G(LUh/q;)LUh/q$c;
    .locals 3

    iget v0, p0, LUh/q$c;->d:I

    const/16 v1, 0x200

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LUh/q$c;->n:LUh/q;

    invoke-static {}, LUh/q;->h1()LUh/q;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, LUh/q$c;->n:LUh/q;

    invoke-static {v0}, LUh/q;->I1(LUh/q;)LUh/q$c;

    move-result-object v0

    invoke-virtual {v0, p1}, LUh/q$c;->E(LUh/q;)LUh/q$c;

    move-result-object p1

    invoke-virtual {p1}, LUh/q$c;->u()LUh/q;

    move-result-object p1

    iput-object p1, p0, LUh/q$c;->n:LUh/q;

    goto :goto_0

    :cond_0
    iput-object p1, p0, LUh/q$c;->n:LUh/q;

    :goto_0
    iget p1, p0, LUh/q$c;->d:I

    or-int/2addr p1, v1

    iput p1, p0, LUh/q$c;->d:I

    return-object p0
.end method

.method public H(I)LUh/q$c;
    .locals 1

    iget v0, p0, LUh/q$c;->d:I

    or-int/lit16 v0, v0, 0x1000

    iput v0, p0, LUh/q$c;->d:I

    iput p1, p0, LUh/q$c;->q:I

    return-object p0
.end method

.method public I(I)LUh/q$c;
    .locals 1

    iget v0, p0, LUh/q$c;->d:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, LUh/q$c;->d:I

    iput p1, p0, LUh/q$c;->j:I

    return-object p0
.end method

.method public K(I)LUh/q$c;
    .locals 1

    iget v0, p0, LUh/q$c;->d:I

    or-int/lit16 v0, v0, 0x2000

    iput v0, p0, LUh/q$c;->d:I

    iput p1, p0, LUh/q$c;->r:I

    return-object p0
.end method

.method public L(I)LUh/q$c;
    .locals 1

    iget v0, p0, LUh/q$c;->d:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, LUh/q$c;->d:I

    iput p1, p0, LUh/q$c;->g:I

    return-object p0
.end method

.method public M(I)LUh/q$c;
    .locals 1

    iget v0, p0, LUh/q$c;->d:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, LUh/q$c;->d:I

    iput p1, p0, LUh/q$c;->i:I

    return-object p0
.end method

.method public N(Z)LUh/q$c;
    .locals 1

    iget v0, p0, LUh/q$c;->d:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, LUh/q$c;->d:I

    iput-boolean p1, p0, LUh/q$c;->f:Z

    return-object p0
.end method

.method public O(I)LUh/q$c;
    .locals 1

    iget v0, p0, LUh/q$c;->d:I

    or-int/lit16 v0, v0, 0x400

    iput v0, p0, LUh/q$c;->d:I

    iput p1, p0, LUh/q$c;->o:I

    return-object p0
.end method

.method public P(I)LUh/q$c;
    .locals 1

    iget v0, p0, LUh/q$c;->d:I

    or-int/lit16 v0, v0, 0x100

    iput v0, p0, LUh/q$c;->d:I

    iput p1, p0, LUh/q$c;->m:I

    return-object p0
.end method

.method public Q(I)LUh/q$c;
    .locals 1

    iget v0, p0, LUh/q$c;->d:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, LUh/q$c;->d:I

    iput p1, p0, LUh/q$c;->k:I

    return-object p0
.end method

.method public R(I)LUh/q$c;
    .locals 1

    iget v0, p0, LUh/q$c;->d:I

    or-int/lit16 v0, v0, 0x80

    iput v0, p0, LUh/q$c;->d:I

    iput p1, p0, LUh/q$c;->l:I

    return-object p0
.end method

.method public bridge synthetic a()Lkotlin/reflect/jvm/internal/impl/protobuf/n;
    .locals 1

    invoke-virtual {p0}, LUh/q$c;->t()LUh/q;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b0(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/n$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, LUh/q$c;->F(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/q$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LUh/q$c;->w()LUh/q$c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic f(Lkotlin/reflect/jvm/internal/impl/protobuf/h;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;
    .locals 0

    check-cast p1, LUh/q;

    invoke-virtual {p0, p1}, LUh/q$c;->E(LUh/q;)LUh/q$c;

    move-result-object p1

    return-object p1
.end method

.method public t()LUh/q;
    .locals 2

    invoke-virtual {p0}, LUh/q$c;->u()LUh/q;

    move-result-object v0

    invoke-virtual {v0}, LUh/q;->m()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/a$a;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/n;)Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0
.end method

.method public u()LUh/q;
    .locals 5

    new-instance v0, LUh/q;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LUh/q;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;LUh/a;)V

    iget v1, p0, LUh/q$c;->d:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    iget-object v2, p0, LUh/q$c;->e:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, LUh/q$c;->e:Ljava/util/List;

    iget v2, p0, LUh/q$c;->d:I

    and-int/lit8 v2, v2, -0x2

    iput v2, p0, LUh/q$c;->d:I

    :cond_0
    iget-object v2, p0, LUh/q$c;->e:Ljava/util/List;

    invoke-static {v0, v2}, LUh/q;->q0(LUh/q;Ljava/util/List;)Ljava/util/List;

    and-int/lit8 v2, v1, 0x2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    iget-boolean v2, p0, LUh/q$c;->f:Z

    invoke-static {v0, v2}, LUh/q;->C0(LUh/q;Z)Z

    and-int/lit8 v2, v1, 0x4

    const/4 v4, 0x4

    if-ne v2, v4, :cond_2

    or-int/lit8 v3, v3, 0x2

    :cond_2
    iget v2, p0, LUh/q$c;->g:I

    invoke-static {v0, v2}, LUh/q;->E0(LUh/q;I)I

    and-int/lit8 v2, v1, 0x8

    const/16 v4, 0x8

    if-ne v2, v4, :cond_3

    or-int/lit8 v3, v3, 0x4

    :cond_3
    iget-object v2, p0, LUh/q$c;->h:LUh/q;

    invoke-static {v0, v2}, LUh/q;->G0(LUh/q;LUh/q;)LUh/q;

    and-int/lit8 v2, v1, 0x10

    const/16 v4, 0x10

    if-ne v2, v4, :cond_4

    or-int/lit8 v3, v3, 0x8

    :cond_4
    iget v2, p0, LUh/q$c;->i:I

    invoke-static {v0, v2}, LUh/q;->K0(LUh/q;I)I

    and-int/lit8 v2, v1, 0x20

    const/16 v4, 0x20

    if-ne v2, v4, :cond_5

    or-int/lit8 v3, v3, 0x10

    :cond_5
    iget v2, p0, LUh/q$c;->j:I

    invoke-static {v0, v2}, LUh/q;->M0(LUh/q;I)I

    and-int/lit8 v2, v1, 0x40

    const/16 v4, 0x40

    if-ne v2, v4, :cond_6

    or-int/lit8 v3, v3, 0x20

    :cond_6
    iget v2, p0, LUh/q$c;->k:I

    invoke-static {v0, v2}, LUh/q;->N0(LUh/q;I)I

    and-int/lit16 v2, v1, 0x80

    const/16 v4, 0x80

    if-ne v2, v4, :cond_7

    or-int/lit8 v3, v3, 0x40

    :cond_7
    iget v2, p0, LUh/q$c;->l:I

    invoke-static {v0, v2}, LUh/q;->P0(LUh/q;I)I

    and-int/lit16 v2, v1, 0x100

    const/16 v4, 0x100

    if-ne v2, v4, :cond_8

    or-int/lit16 v3, v3, 0x80

    :cond_8
    iget v2, p0, LUh/q$c;->m:I

    invoke-static {v0, v2}, LUh/q;->T0(LUh/q;I)I

    and-int/lit16 v2, v1, 0x200

    const/16 v4, 0x200

    if-ne v2, v4, :cond_9

    or-int/lit16 v3, v3, 0x100

    :cond_9
    iget-object v2, p0, LUh/q$c;->n:LUh/q;

    invoke-static {v0, v2}, LUh/q;->U0(LUh/q;LUh/q;)LUh/q;

    and-int/lit16 v2, v1, 0x400

    const/16 v4, 0x400

    if-ne v2, v4, :cond_a

    or-int/lit16 v3, v3, 0x200

    :cond_a
    iget v2, p0, LUh/q$c;->o:I

    invoke-static {v0, v2}, LUh/q;->V0(LUh/q;I)I

    and-int/lit16 v2, v1, 0x800

    const/16 v4, 0x800

    if-ne v2, v4, :cond_b

    or-int/lit16 v3, v3, 0x400

    :cond_b
    iget-object v2, p0, LUh/q$c;->p:LUh/q;

    invoke-static {v0, v2}, LUh/q;->W0(LUh/q;LUh/q;)LUh/q;

    and-int/lit16 v2, v1, 0x1000

    const/16 v4, 0x1000

    if-ne v2, v4, :cond_c

    or-int/lit16 v3, v3, 0x800

    :cond_c
    iget v2, p0, LUh/q$c;->q:I

    invoke-static {v0, v2}, LUh/q;->X0(LUh/q;I)I

    const/16 v2, 0x2000

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_d

    or-int/lit16 v3, v3, 0x1000

    :cond_d
    iget v1, p0, LUh/q$c;->r:I

    invoke-static {v0, v1}, LUh/q;->Y0(LUh/q;I)I

    invoke-static {v0, v3}, LUh/q;->Z0(LUh/q;I)I

    return-object v0
.end method

.method public w()LUh/q$c;
    .locals 2

    invoke-static {}, LUh/q$c;->x()LUh/q$c;

    move-result-object v0

    invoke-virtual {p0}, LUh/q$c;->u()LUh/q;

    move-result-object v1

    invoke-virtual {v0, v1}, LUh/q$c;->E(LUh/q;)LUh/q$c;

    move-result-object v0

    return-object v0
.end method
