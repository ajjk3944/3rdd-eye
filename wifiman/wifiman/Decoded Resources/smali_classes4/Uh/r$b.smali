.class public final LUh/r$b;
.super Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/protobuf/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUh/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private d:I

.field private e:I

.field private f:I

.field private g:Ljava/util/List;

.field private h:LUh/q;

.field private i:I

.field private j:LUh/q;

.field private k:I

.field private l:Ljava/util/List;

.field private m:Ljava/util/List;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;-><init>()V

    const/4 v0, 0x6

    iput v0, p0, LUh/r$b;->e:I

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/r$b;->g:Ljava/util/List;

    invoke-static {}, LUh/q;->h1()LUh/q;

    move-result-object v0

    iput-object v0, p0, LUh/r$b;->h:LUh/q;

    invoke-static {}, LUh/q;->h1()LUh/q;

    move-result-object v0

    iput-object v0, p0, LUh/r$b;->j:LUh/q;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/r$b;->l:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/r$b;->m:Ljava/util/List;

    invoke-direct {p0}, LUh/r$b;->D()V

    return-void
.end method

.method private A()V
    .locals 3

    iget v0, p0, LUh/r$b;->d:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LUh/r$b;->g:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LUh/r$b;->g:Ljava/util/List;

    iget v0, p0, LUh/r$b;->d:I

    or-int/2addr v0, v1

    iput v0, p0, LUh/r$b;->d:I

    :cond_0
    return-void
.end method

.method private B()V
    .locals 3

    iget v0, p0, LUh/r$b;->d:I

    const/16 v1, 0x100

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LUh/r$b;->m:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LUh/r$b;->m:Ljava/util/List;

    iget v0, p0, LUh/r$b;->d:I

    or-int/2addr v0, v1

    iput v0, p0, LUh/r$b;->d:I

    :cond_0
    return-void
.end method

.method private D()V
    .locals 0

    return-void
.end method

.method static synthetic r()LUh/r$b;
    .locals 1

    invoke-static {}, LUh/r$b;->x()LUh/r$b;

    move-result-object v0

    return-object v0
.end method

.method private static x()LUh/r$b;
    .locals 1

    new-instance v0, LUh/r$b;

    invoke-direct {v0}, LUh/r$b;-><init>()V

    return-object v0
.end method

.method private z()V
    .locals 3

    iget v0, p0, LUh/r$b;->d:I

    const/16 v1, 0x80

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LUh/r$b;->l:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LUh/r$b;->l:Ljava/util/List;

    iget v0, p0, LUh/r$b;->d:I

    or-int/2addr v0, v1

    iput v0, p0, LUh/r$b;->d:I

    :cond_0
    return-void
.end method


# virtual methods
.method public E(LUh/q;)LUh/r$b;
    .locals 3

    iget v0, p0, LUh/r$b;->d:I

    const/16 v1, 0x20

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LUh/r$b;->j:LUh/q;

    invoke-static {}, LUh/q;->h1()LUh/q;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, LUh/r$b;->j:LUh/q;

    invoke-static {v0}, LUh/q;->I1(LUh/q;)LUh/q$c;

    move-result-object v0

    invoke-virtual {v0, p1}, LUh/q$c;->E(LUh/q;)LUh/q$c;

    move-result-object p1

    invoke-virtual {p1}, LUh/q$c;->u()LUh/q;

    move-result-object p1

    iput-object p1, p0, LUh/r$b;->j:LUh/q;

    goto :goto_0

    :cond_0
    iput-object p1, p0, LUh/r$b;->j:LUh/q;

    :goto_0
    iget p1, p0, LUh/r$b;->d:I

    or-int/2addr p1, v1

    iput p1, p0, LUh/r$b;->d:I

    return-object p0
.end method

.method public F(LUh/r;)LUh/r$b;
    .locals 2

    invoke-static {}, LUh/r;->b1()LUh/r;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p1}, LUh/r;->p1()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LUh/r;->f1()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/r$b;->K(I)LUh/r$b;

    :cond_1
    invoke-virtual {p1}, LUh/r;->q1()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, LUh/r;->g1()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/r$b;->L(I)LUh/r$b;

    :cond_2
    invoke-static {p1}, LUh/r;->C0(LUh/r;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, LUh/r$b;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {p1}, LUh/r;->C0(LUh/r;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/r$b;->g:Ljava/util/List;

    iget v0, p0, LUh/r$b;->d:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, LUh/r$b;->d:I

    goto :goto_0

    :cond_3
    invoke-direct {p0}, LUh/r$b;->A()V

    iget-object v0, p0, LUh/r$b;->g:Ljava/util/List;

    invoke-static {p1}, LUh/r;->C0(LUh/r;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_4
    :goto_0
    invoke-virtual {p1}, LUh/r;->r1()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, LUh/r;->k1()LUh/q;

    move-result-object v0

    invoke-virtual {p0, v0}, LUh/r$b;->H(LUh/q;)LUh/r$b;

    :cond_5
    invoke-virtual {p1}, LUh/r;->s1()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p1}, LUh/r;->l1()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/r$b;->M(I)LUh/r$b;

    :cond_6
    invoke-virtual {p1}, LUh/r;->n1()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p1}, LUh/r;->d1()LUh/q;

    move-result-object v0

    invoke-virtual {p0, v0}, LUh/r$b;->E(LUh/q;)LUh/r$b;

    :cond_7
    invoke-virtual {p1}, LUh/r;->o1()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p1}, LUh/r;->e1()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/r$b;->I(I)LUh/r$b;

    :cond_8
    invoke-static {p1}, LUh/r;->P0(LUh/r;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_a

    iget-object v0, p0, LUh/r$b;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {p1}, LUh/r;->P0(LUh/r;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/r$b;->l:Ljava/util/List;

    iget v0, p0, LUh/r$b;->d:I

    and-int/lit16 v0, v0, -0x81

    iput v0, p0, LUh/r$b;->d:I

    goto :goto_1

    :cond_9
    invoke-direct {p0}, LUh/r$b;->z()V

    iget-object v0, p0, LUh/r$b;->l:Ljava/util/List;

    invoke-static {p1}, LUh/r;->P0(LUh/r;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_a
    :goto_1
    invoke-static {p1}, LUh/r;->U0(LUh/r;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_c

    iget-object v0, p0, LUh/r$b;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {p1}, LUh/r;->U0(LUh/r;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/r$b;->m:Ljava/util/List;

    iget v0, p0, LUh/r$b;->d:I

    and-int/lit16 v0, v0, -0x101

    iput v0, p0, LUh/r$b;->d:I

    goto :goto_2

    :cond_b
    invoke-direct {p0}, LUh/r$b;->B()V

    iget-object v0, p0, LUh/r$b;->m:Ljava/util/List;

    invoke-static {p1}, LUh/r;->U0(LUh/r;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_c
    :goto_2
    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;->q(Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;)V

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->e()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object v0

    invoke-static {p1}, LUh/r;->X0(LUh/r;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/d;->e(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->i(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;

    return-object p0
.end method

.method public G(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/r$b;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, LUh/r;->q:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-interface {v1, p1, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/p;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LUh/r;
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, LUh/r$b;->F(LUh/r;)LUh/r$b;

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

    check-cast p2, LUh/r;
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

    invoke-virtual {p0, v0}, LUh/r$b;->F(LUh/r;)LUh/r$b;

    :cond_1
    throw p1
.end method

.method public H(LUh/q;)LUh/r$b;
    .locals 3

    iget v0, p0, LUh/r$b;->d:I

    const/16 v1, 0x8

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LUh/r$b;->h:LUh/q;

    invoke-static {}, LUh/q;->h1()LUh/q;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, LUh/r$b;->h:LUh/q;

    invoke-static {v0}, LUh/q;->I1(LUh/q;)LUh/q$c;

    move-result-object v0

    invoke-virtual {v0, p1}, LUh/q$c;->E(LUh/q;)LUh/q$c;

    move-result-object p1

    invoke-virtual {p1}, LUh/q$c;->u()LUh/q;

    move-result-object p1

    iput-object p1, p0, LUh/r$b;->h:LUh/q;

    goto :goto_0

    :cond_0
    iput-object p1, p0, LUh/r$b;->h:LUh/q;

    :goto_0
    iget p1, p0, LUh/r$b;->d:I

    or-int/2addr p1, v1

    iput p1, p0, LUh/r$b;->d:I

    return-object p0
.end method

.method public I(I)LUh/r$b;
    .locals 1

    iget v0, p0, LUh/r$b;->d:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, LUh/r$b;->d:I

    iput p1, p0, LUh/r$b;->k:I

    return-object p0
.end method

.method public K(I)LUh/r$b;
    .locals 1

    iget v0, p0, LUh/r$b;->d:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, LUh/r$b;->d:I

    iput p1, p0, LUh/r$b;->e:I

    return-object p0
.end method

.method public L(I)LUh/r$b;
    .locals 1

    iget v0, p0, LUh/r$b;->d:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, LUh/r$b;->d:I

    iput p1, p0, LUh/r$b;->f:I

    return-object p0
.end method

.method public M(I)LUh/r$b;
    .locals 1

    iget v0, p0, LUh/r$b;->d:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, LUh/r$b;->d:I

    iput p1, p0, LUh/r$b;->i:I

    return-object p0
.end method

.method public bridge synthetic a()Lkotlin/reflect/jvm/internal/impl/protobuf/n;
    .locals 1

    invoke-virtual {p0}, LUh/r$b;->t()LUh/r;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b0(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/n$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, LUh/r$b;->G(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/r$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LUh/r$b;->w()LUh/r$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic f(Lkotlin/reflect/jvm/internal/impl/protobuf/h;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;
    .locals 0

    check-cast p1, LUh/r;

    invoke-virtual {p0, p1}, LUh/r$b;->F(LUh/r;)LUh/r$b;

    move-result-object p1

    return-object p1
.end method

.method public t()LUh/r;
    .locals 2

    invoke-virtual {p0}, LUh/r$b;->u()LUh/r;

    move-result-object v0

    invoke-virtual {v0}, LUh/r;->m()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/a$a;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/n;)Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0
.end method

.method public u()LUh/r;
    .locals 5

    new-instance v0, LUh/r;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LUh/r;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;LUh/a;)V

    iget v1, p0, LUh/r$b;->d:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget v2, p0, LUh/r$b;->e:I

    invoke-static {v0, v2}, LUh/r;->f0(LUh/r;I)I

    and-int/lit8 v2, v1, 0x2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    or-int/lit8 v3, v3, 0x2

    :cond_1
    iget v2, p0, LUh/r$b;->f:I

    invoke-static {v0, v2}, LUh/r;->q0(LUh/r;I)I

    iget v2, p0, LUh/r$b;->d:I

    const/4 v4, 0x4

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_2

    iget-object v2, p0, LUh/r$b;->g:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, LUh/r$b;->g:Ljava/util/List;

    iget v2, p0, LUh/r$b;->d:I

    and-int/lit8 v2, v2, -0x5

    iput v2, p0, LUh/r$b;->d:I

    :cond_2
    iget-object v2, p0, LUh/r$b;->g:Ljava/util/List;

    invoke-static {v0, v2}, LUh/r;->E0(LUh/r;Ljava/util/List;)Ljava/util/List;

    and-int/lit8 v2, v1, 0x8

    const/16 v4, 0x8

    if-ne v2, v4, :cond_3

    or-int/lit8 v3, v3, 0x4

    :cond_3
    iget-object v2, p0, LUh/r$b;->h:LUh/q;

    invoke-static {v0, v2}, LUh/r;->G0(LUh/r;LUh/q;)LUh/q;

    and-int/lit8 v2, v1, 0x10

    const/16 v4, 0x10

    if-ne v2, v4, :cond_4

    or-int/lit8 v3, v3, 0x8

    :cond_4
    iget v2, p0, LUh/r$b;->i:I

    invoke-static {v0, v2}, LUh/r;->K0(LUh/r;I)I

    and-int/lit8 v2, v1, 0x20

    const/16 v4, 0x20

    if-ne v2, v4, :cond_5

    or-int/lit8 v3, v3, 0x10

    :cond_5
    iget-object v2, p0, LUh/r$b;->j:LUh/q;

    invoke-static {v0, v2}, LUh/r;->M0(LUh/r;LUh/q;)LUh/q;

    const/16 v2, 0x40

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_6

    or-int/lit8 v3, v3, 0x20

    :cond_6
    iget v1, p0, LUh/r$b;->k:I

    invoke-static {v0, v1}, LUh/r;->N0(LUh/r;I)I

    iget v1, p0, LUh/r$b;->d:I

    const/16 v2, 0x80

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_7

    iget-object v1, p0, LUh/r$b;->l:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, LUh/r$b;->l:Ljava/util/List;

    iget v1, p0, LUh/r$b;->d:I

    and-int/lit16 v1, v1, -0x81

    iput v1, p0, LUh/r$b;->d:I

    :cond_7
    iget-object v1, p0, LUh/r$b;->l:Ljava/util/List;

    invoke-static {v0, v1}, LUh/r;->T0(LUh/r;Ljava/util/List;)Ljava/util/List;

    iget v1, p0, LUh/r$b;->d:I

    const/16 v2, 0x100

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_8

    iget-object v1, p0, LUh/r$b;->m:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, LUh/r$b;->m:Ljava/util/List;

    iget v1, p0, LUh/r$b;->d:I

    and-int/lit16 v1, v1, -0x101

    iput v1, p0, LUh/r$b;->d:I

    :cond_8
    iget-object v1, p0, LUh/r$b;->m:Ljava/util/List;

    invoke-static {v0, v1}, LUh/r;->V0(LUh/r;Ljava/util/List;)Ljava/util/List;

    invoke-static {v0, v3}, LUh/r;->W0(LUh/r;I)I

    return-object v0
.end method

.method public w()LUh/r$b;
    .locals 2

    invoke-static {}, LUh/r$b;->x()LUh/r$b;

    move-result-object v0

    invoke-virtual {p0}, LUh/r$b;->u()LUh/r;

    move-result-object v1

    invoke-virtual {v0, v1}, LUh/r$b;->F(LUh/r;)LUh/r$b;

    move-result-object v0

    return-object v0
.end method
