.class public final LUh/b$b$c$b;
.super Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/protobuf/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUh/b$b$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private b:I

.field private c:LUh/b$b$c$c;

.field private d:J

.field private e:F

.field private f:D

.field private g:I

.field private h:I

.field private i:I

.field private j:LUh/b;

.field private k:Ljava/util/List;

.field private l:I

.field private m:I


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;-><init>()V

    sget-object v0, LUh/b$b$c$c;->BYTE:LUh/b$b$c$c;

    iput-object v0, p0, LUh/b$b$c$b;->c:LUh/b$b$c$c;

    invoke-static {}, LUh/b;->d0()LUh/b;

    move-result-object v0

    iput-object v0, p0, LUh/b$b$c$b;->j:LUh/b;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/b$b$c$b;->k:Ljava/util/List;

    invoke-direct {p0}, LUh/b$b$c$b;->u()V

    return-void
.end method

.method static synthetic k()LUh/b$b$c$b;
    .locals 1

    invoke-static {}, LUh/b$b$c$b;->r()LUh/b$b$c$b;

    move-result-object v0

    return-object v0
.end method

.method private static r()LUh/b$b$c$b;
    .locals 1

    new-instance v0, LUh/b$b$c$b;

    invoke-direct {v0}, LUh/b$b$c$b;-><init>()V

    return-object v0
.end method

.method private t()V
    .locals 3

    iget v0, p0, LUh/b$b$c$b;->b:I

    const/16 v1, 0x100

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LUh/b$b$c$b;->k:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LUh/b$b$c$b;->k:Ljava/util/List;

    iget v0, p0, LUh/b$b$c$b;->b:I

    or-int/2addr v0, v1

    iput v0, p0, LUh/b$b$c$b;->b:I

    :cond_0
    return-void
.end method

.method private u()V
    .locals 0

    return-void
.end method


# virtual methods
.method public A(I)LUh/b$b$c$b;
    .locals 1

    iget v0, p0, LUh/b$b$c$b;->b:I

    or-int/lit16 v0, v0, 0x200

    iput v0, p0, LUh/b$b$c$b;->b:I

    iput p1, p0, LUh/b$b$c$b;->l:I

    return-object p0
.end method

.method public B(I)LUh/b$b$c$b;
    .locals 1

    iget v0, p0, LUh/b$b$c$b;->b:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, LUh/b$b$c$b;->b:I

    iput p1, p0, LUh/b$b$c$b;->h:I

    return-object p0
.end method

.method public D(D)LUh/b$b$c$b;
    .locals 1

    iget v0, p0, LUh/b$b$c$b;->b:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, LUh/b$b$c$b;->b:I

    iput-wide p1, p0, LUh/b$b$c$b;->f:D

    return-object p0
.end method

.method public E(I)LUh/b$b$c$b;
    .locals 1

    iget v0, p0, LUh/b$b$c$b;->b:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, LUh/b$b$c$b;->b:I

    iput p1, p0, LUh/b$b$c$b;->i:I

    return-object p0
.end method

.method public F(I)LUh/b$b$c$b;
    .locals 1

    iget v0, p0, LUh/b$b$c$b;->b:I

    or-int/lit16 v0, v0, 0x400

    iput v0, p0, LUh/b$b$c$b;->b:I

    iput p1, p0, LUh/b$b$c$b;->m:I

    return-object p0
.end method

.method public G(F)LUh/b$b$c$b;
    .locals 1

    iget v0, p0, LUh/b$b$c$b;->b:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, LUh/b$b$c$b;->b:I

    iput p1, p0, LUh/b$b$c$b;->e:F

    return-object p0
.end method

.method public H(J)LUh/b$b$c$b;
    .locals 1

    iget v0, p0, LUh/b$b$c$b;->b:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, LUh/b$b$c$b;->b:I

    iput-wide p1, p0, LUh/b$b$c$b;->d:J

    return-object p0
.end method

.method public I(I)LUh/b$b$c$b;
    .locals 1

    iget v0, p0, LUh/b$b$c$b;->b:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, LUh/b$b$c$b;->b:I

    iput p1, p0, LUh/b$b$c$b;->g:I

    return-object p0
.end method

.method public K(LUh/b$b$c$c;)LUh/b$b$c$b;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, LUh/b$b$c$b;->b:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, LUh/b$b$c$b;->b:I

    iput-object p1, p0, LUh/b$b$c$b;->c:LUh/b$b$c$c;

    return-object p0
.end method

.method public bridge synthetic a()Lkotlin/reflect/jvm/internal/impl/protobuf/n;
    .locals 1

    invoke-virtual {p0}, LUh/b$b$c$b;->o()LUh/b$b$c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b0(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/n$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, LUh/b$b$c$b;->z(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/b$b$c$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LUh/b$b$c$b;->q()LUh/b$b$c$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic f(Lkotlin/reflect/jvm/internal/impl/protobuf/h;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;
    .locals 0

    check-cast p1, LUh/b$b$c;

    invoke-virtual {p0, p1}, LUh/b$b$c$b;->x(LUh/b$b$c;)LUh/b$b$c$b;

    move-result-object p1

    return-object p1
.end method

.method public o()LUh/b$b$c;
    .locals 2

    invoke-virtual {p0}, LUh/b$b$c$b;->p()LUh/b$b$c;

    move-result-object v0

    invoke-virtual {v0}, LUh/b$b$c;->m()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/a$a;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/n;)Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0
.end method

.method public p()LUh/b$b$c;
    .locals 6

    new-instance v0, LUh/b$b$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LUh/b$b$c;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;LUh/a;)V

    iget v1, p0, LUh/b$b$c$b;->b:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget-object v2, p0, LUh/b$b$c$b;->c:LUh/b$b$c$c;

    invoke-static {v0, v2}, LUh/b$b$c;->C(LUh/b$b$c;LUh/b$b$c$c;)LUh/b$b$c$c;

    and-int/lit8 v2, v1, 0x2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    or-int/lit8 v3, v3, 0x2

    :cond_1
    iget-wide v4, p0, LUh/b$b$c$b;->d:J

    invoke-static {v0, v4, v5}, LUh/b$b$c;->E(LUh/b$b$c;J)J

    and-int/lit8 v2, v1, 0x4

    const/4 v4, 0x4

    if-ne v2, v4, :cond_2

    or-int/lit8 v3, v3, 0x4

    :cond_2
    iget v2, p0, LUh/b$b$c$b;->e:F

    invoke-static {v0, v2}, LUh/b$b$c;->F(LUh/b$b$c;F)F

    and-int/lit8 v2, v1, 0x8

    const/16 v4, 0x8

    if-ne v2, v4, :cond_3

    or-int/lit8 v3, v3, 0x8

    :cond_3
    iget-wide v4, p0, LUh/b$b$c$b;->f:D

    invoke-static {v0, v4, v5}, LUh/b$b$c;->J(LUh/b$b$c;D)D

    and-int/lit8 v2, v1, 0x10

    const/16 v4, 0x10

    if-ne v2, v4, :cond_4

    or-int/lit8 v3, v3, 0x10

    :cond_4
    iget v2, p0, LUh/b$b$c$b;->g:I

    invoke-static {v0, v2}, LUh/b$b$c;->K(LUh/b$b$c;I)I

    and-int/lit8 v2, v1, 0x20

    const/16 v4, 0x20

    if-ne v2, v4, :cond_5

    or-int/lit8 v3, v3, 0x20

    :cond_5
    iget v2, p0, LUh/b$b$c$b;->h:I

    invoke-static {v0, v2}, LUh/b$b$c;->P(LUh/b$b$c;I)I

    and-int/lit8 v2, v1, 0x40

    const/16 v4, 0x40

    if-ne v2, v4, :cond_6

    or-int/lit8 v3, v3, 0x40

    :cond_6
    iget v2, p0, LUh/b$b$c$b;->i:I

    invoke-static {v0, v2}, LUh/b$b$c;->S(LUh/b$b$c;I)I

    and-int/lit16 v2, v1, 0x80

    const/16 v4, 0x80

    if-ne v2, v4, :cond_7

    or-int/lit16 v3, v3, 0x80

    :cond_7
    iget-object v2, p0, LUh/b$b$c$b;->j:LUh/b;

    invoke-static {v0, v2}, LUh/b$b$c;->T(LUh/b$b$c;LUh/b;)LUh/b;

    iget v2, p0, LUh/b$b$c$b;->b:I

    const/16 v4, 0x100

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_8

    iget-object v2, p0, LUh/b$b$c$b;->k:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, LUh/b$b$c$b;->k:Ljava/util/List;

    iget v2, p0, LUh/b$b$c$b;->b:I

    and-int/lit16 v2, v2, -0x101

    iput v2, p0, LUh/b$b$c$b;->b:I

    :cond_8
    iget-object v2, p0, LUh/b$b$c$b;->k:Ljava/util/List;

    invoke-static {v0, v2}, LUh/b$b$c;->f0(LUh/b$b$c;Ljava/util/List;)Ljava/util/List;

    and-int/lit16 v2, v1, 0x200

    const/16 v4, 0x200

    if-ne v2, v4, :cond_9

    or-int/lit16 v3, v3, 0x100

    :cond_9
    iget v2, p0, LUh/b$b$c$b;->l:I

    invoke-static {v0, v2}, LUh/b$b$c;->q0(LUh/b$b$c;I)I

    const/16 v2, 0x400

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_a

    or-int/lit16 v3, v3, 0x200

    :cond_a
    iget v1, p0, LUh/b$b$c$b;->m:I

    invoke-static {v0, v1}, LUh/b$b$c;->C0(LUh/b$b$c;I)I

    invoke-static {v0, v3}, LUh/b$b$c;->E0(LUh/b$b$c;I)I

    return-object v0
.end method

.method public q()LUh/b$b$c$b;
    .locals 2

    invoke-static {}, LUh/b$b$c$b;->r()LUh/b$b$c$b;

    move-result-object v0

    invoke-virtual {p0}, LUh/b$b$c$b;->p()LUh/b$b$c;

    move-result-object v1

    invoke-virtual {v0, v1}, LUh/b$b$c$b;->x(LUh/b$b$c;)LUh/b$b$c$b;

    move-result-object v0

    return-object v0
.end method

.method public w(LUh/b;)LUh/b$b$c$b;
    .locals 3

    iget v0, p0, LUh/b$b$c$b;->b:I

    const/16 v1, 0x80

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LUh/b$b$c$b;->j:LUh/b;

    invoke-static {}, LUh/b;->d0()LUh/b;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, LUh/b$b$c$b;->j:LUh/b;

    invoke-static {v0}, LUh/b;->G0(LUh/b;)LUh/b$c;

    move-result-object v0

    invoke-virtual {v0, p1}, LUh/b$c;->w(LUh/b;)LUh/b$c;

    move-result-object p1

    invoke-virtual {p1}, LUh/b$c;->p()LUh/b;

    move-result-object p1

    iput-object p1, p0, LUh/b$b$c$b;->j:LUh/b;

    goto :goto_0

    :cond_0
    iput-object p1, p0, LUh/b$b$c$b;->j:LUh/b;

    :goto_0
    iget p1, p0, LUh/b$b$c$b;->b:I

    or-int/2addr p1, v1

    iput p1, p0, LUh/b$b$c$b;->b:I

    return-object p0
.end method

.method public x(LUh/b$b$c;)LUh/b$b$c$b;
    .locals 2

    invoke-static {}, LUh/b$b$c;->V0()LUh/b$b$c;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p1}, LUh/b$b$c;->m1()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LUh/b$b$c;->c1()LUh/b$b$c$c;

    move-result-object v0

    invoke-virtual {p0, v0}, LUh/b$b$c$b;->K(LUh/b$b$c$c;)LUh/b$b$c$b;

    :cond_1
    invoke-virtual {p1}, LUh/b$b$c;->k1()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, LUh/b$b$c;->a1()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LUh/b$b$c$b;->H(J)LUh/b$b$c$b;

    :cond_2
    invoke-virtual {p1}, LUh/b$b$c;->j1()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, LUh/b$b$c;->Z0()F

    move-result v0

    invoke-virtual {p0, v0}, LUh/b$b$c$b;->G(F)LUh/b$b$c$b;

    :cond_3
    invoke-virtual {p1}, LUh/b$b$c;->g1()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, LUh/b$b$c;->W0()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LUh/b$b$c$b;->D(D)LUh/b$b$c$b;

    :cond_4
    invoke-virtual {p1}, LUh/b$b$c;->l1()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, LUh/b$b$c;->b1()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/b$b$c$b;->I(I)LUh/b$b$c$b;

    :cond_5
    invoke-virtual {p1}, LUh/b$b$c;->f1()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p1}, LUh/b$b$c;->U0()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/b$b$c$b;->B(I)LUh/b$b$c$b;

    :cond_6
    invoke-virtual {p1}, LUh/b$b$c;->h1()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p1}, LUh/b$b$c;->X0()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/b$b$c$b;->E(I)LUh/b$b$c$b;

    :cond_7
    invoke-virtual {p1}, LUh/b$b$c;->d1()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p1}, LUh/b$b$c;->K0()LUh/b;

    move-result-object v0

    invoke-virtual {p0, v0}, LUh/b$b$c$b;->w(LUh/b;)LUh/b$b$c$b;

    :cond_8
    invoke-static {p1}, LUh/b$b$c;->d0(LUh/b$b$c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_a

    iget-object v0, p0, LUh/b$b$c$b;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {p1}, LUh/b$b$c;->d0(LUh/b$b$c;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/b$b$c$b;->k:Ljava/util/List;

    iget v0, p0, LUh/b$b$c$b;->b:I

    and-int/lit16 v0, v0, -0x101

    iput v0, p0, LUh/b$b$c$b;->b:I

    goto :goto_0

    :cond_9
    invoke-direct {p0}, LUh/b$b$c$b;->t()V

    iget-object v0, p0, LUh/b$b$c$b;->k:Ljava/util/List;

    invoke-static {p1}, LUh/b$b$c;->d0(LUh/b$b$c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_a
    :goto_0
    invoke-virtual {p1}, LUh/b$b$c;->e1()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual {p1}, LUh/b$b$c;->M0()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/b$b$c$b;->A(I)LUh/b$b$c$b;

    :cond_b
    invoke-virtual {p1}, LUh/b$b$c;->i1()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-virtual {p1}, LUh/b$b$c;->Y0()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/b$b$c$b;->F(I)LUh/b$b$c$b;

    :cond_c
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->e()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object v0

    invoke-static {p1}, LUh/b$b$c;->G0(LUh/b$b$c;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/d;->e(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->i(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;

    return-object p0
.end method

.method public z(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/b$b$c$b;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, LUh/b$b$c;->r:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-interface {v1, p1, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/p;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LUh/b$b$c;
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, LUh/b$b$c$b;->x(LUh/b$b$c;)LUh/b$b$c$b;

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

    check-cast p2, LUh/b$b$c;
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

    invoke-virtual {p0, v0}, LUh/b$b$c$b;->x(LUh/b$b$c;)LUh/b$b$c$b;

    :cond_1
    throw p1
.end method
