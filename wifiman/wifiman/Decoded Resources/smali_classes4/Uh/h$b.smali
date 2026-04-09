.class public final LUh/h$b;
.super Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/protobuf/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUh/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private b:I

.field private c:I

.field private d:I

.field private e:LUh/h$c;

.field private f:LUh/q;

.field private g:I

.field private h:Ljava/util/List;

.field private i:Ljava/util/List;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;-><init>()V

    sget-object v0, LUh/h$c;->TRUE:LUh/h$c;

    iput-object v0, p0, LUh/h$b;->e:LUh/h$c;

    invoke-static {}, LUh/q;->h1()LUh/q;

    move-result-object v0

    iput-object v0, p0, LUh/h$b;->f:LUh/q;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/h$b;->h:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/h$b;->i:Ljava/util/List;

    invoke-direct {p0}, LUh/h$b;->w()V

    return-void
.end method

.method static synthetic k()LUh/h$b;
    .locals 1

    invoke-static {}, LUh/h$b;->r()LUh/h$b;

    move-result-object v0

    return-object v0
.end method

.method private static r()LUh/h$b;
    .locals 1

    new-instance v0, LUh/h$b;

    invoke-direct {v0}, LUh/h$b;-><init>()V

    return-object v0
.end method

.method private t()V
    .locals 3

    iget v0, p0, LUh/h$b;->b:I

    const/16 v1, 0x20

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LUh/h$b;->h:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LUh/h$b;->h:Ljava/util/List;

    iget v0, p0, LUh/h$b;->b:I

    or-int/2addr v0, v1

    iput v0, p0, LUh/h$b;->b:I

    :cond_0
    return-void
.end method

.method private u()V
    .locals 3

    iget v0, p0, LUh/h$b;->b:I

    const/16 v1, 0x40

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LUh/h$b;->i:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LUh/h$b;->i:Ljava/util/List;

    iget v0, p0, LUh/h$b;->b:I

    or-int/2addr v0, v1

    iput v0, p0, LUh/h$b;->b:I

    :cond_0
    return-void
.end method

.method private w()V
    .locals 0

    return-void
.end method


# virtual methods
.method public A(LUh/q;)LUh/h$b;
    .locals 3

    iget v0, p0, LUh/h$b;->b:I

    const/16 v1, 0x8

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LUh/h$b;->f:LUh/q;

    invoke-static {}, LUh/q;->h1()LUh/q;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, LUh/h$b;->f:LUh/q;

    invoke-static {v0}, LUh/q;->I1(LUh/q;)LUh/q$c;

    move-result-object v0

    invoke-virtual {v0, p1}, LUh/q$c;->E(LUh/q;)LUh/q$c;

    move-result-object p1

    invoke-virtual {p1}, LUh/q$c;->u()LUh/q;

    move-result-object p1

    iput-object p1, p0, LUh/h$b;->f:LUh/q;

    goto :goto_0

    :cond_0
    iput-object p1, p0, LUh/h$b;->f:LUh/q;

    :goto_0
    iget p1, p0, LUh/h$b;->b:I

    or-int/2addr p1, v1

    iput p1, p0, LUh/h$b;->b:I

    return-object p0
.end method

.method public B(LUh/h$c;)LUh/h$b;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, LUh/h$b;->b:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, LUh/h$b;->b:I

    iput-object p1, p0, LUh/h$b;->e:LUh/h$c;

    return-object p0
.end method

.method public D(I)LUh/h$b;
    .locals 1

    iget v0, p0, LUh/h$b;->b:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, LUh/h$b;->b:I

    iput p1, p0, LUh/h$b;->c:I

    return-object p0
.end method

.method public E(I)LUh/h$b;
    .locals 1

    iget v0, p0, LUh/h$b;->b:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, LUh/h$b;->b:I

    iput p1, p0, LUh/h$b;->g:I

    return-object p0
.end method

.method public F(I)LUh/h$b;
    .locals 1

    iget v0, p0, LUh/h$b;->b:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, LUh/h$b;->b:I

    iput p1, p0, LUh/h$b;->d:I

    return-object p0
.end method

.method public bridge synthetic a()Lkotlin/reflect/jvm/internal/impl/protobuf/n;
    .locals 1

    invoke-virtual {p0}, LUh/h$b;->o()LUh/h;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b0(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/n$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, LUh/h$b;->z(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/h$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LUh/h$b;->q()LUh/h$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic f(Lkotlin/reflect/jvm/internal/impl/protobuf/h;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;
    .locals 0

    check-cast p1, LUh/h;

    invoke-virtual {p0, p1}, LUh/h$b;->x(LUh/h;)LUh/h$b;

    move-result-object p1

    return-object p1
.end method

.method public o()LUh/h;
    .locals 2

    invoke-virtual {p0}, LUh/h$b;->p()LUh/h;

    move-result-object v0

    invoke-virtual {v0}, LUh/h;->m()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/a$a;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/n;)Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0
.end method

.method public p()LUh/h;
    .locals 5

    new-instance v0, LUh/h;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LUh/h;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;LUh/a;)V

    iget v1, p0, LUh/h$b;->b:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget v2, p0, LUh/h$b;->c:I

    invoke-static {v0, v2}, LUh/h;->C(LUh/h;I)I

    and-int/lit8 v2, v1, 0x2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    or-int/lit8 v3, v3, 0x2

    :cond_1
    iget v2, p0, LUh/h$b;->d:I

    invoke-static {v0, v2}, LUh/h;->E(LUh/h;I)I

    and-int/lit8 v2, v1, 0x4

    const/4 v4, 0x4

    if-ne v2, v4, :cond_2

    or-int/lit8 v3, v3, 0x4

    :cond_2
    iget-object v2, p0, LUh/h$b;->e:LUh/h$c;

    invoke-static {v0, v2}, LUh/h;->F(LUh/h;LUh/h$c;)LUh/h$c;

    and-int/lit8 v2, v1, 0x8

    const/16 v4, 0x8

    if-ne v2, v4, :cond_3

    or-int/lit8 v3, v3, 0x8

    :cond_3
    iget-object v2, p0, LUh/h$b;->f:LUh/q;

    invoke-static {v0, v2}, LUh/h;->J(LUh/h;LUh/q;)LUh/q;

    const/16 v2, 0x10

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_4

    or-int/lit8 v3, v3, 0x10

    :cond_4
    iget v1, p0, LUh/h$b;->g:I

    invoke-static {v0, v1}, LUh/h;->K(LUh/h;I)I

    iget v1, p0, LUh/h$b;->b:I

    const/16 v2, 0x20

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_5

    iget-object v1, p0, LUh/h$b;->h:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, LUh/h$b;->h:Ljava/util/List;

    iget v1, p0, LUh/h$b;->b:I

    and-int/lit8 v1, v1, -0x21

    iput v1, p0, LUh/h$b;->b:I

    :cond_5
    iget-object v1, p0, LUh/h$b;->h:Ljava/util/List;

    invoke-static {v0, v1}, LUh/h;->S(LUh/h;Ljava/util/List;)Ljava/util/List;

    iget v1, p0, LUh/h$b;->b:I

    const/16 v2, 0x40

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_6

    iget-object v1, p0, LUh/h$b;->i:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, LUh/h$b;->i:Ljava/util/List;

    iget v1, p0, LUh/h$b;->b:I

    and-int/lit8 v1, v1, -0x41

    iput v1, p0, LUh/h$b;->b:I

    :cond_6
    iget-object v1, p0, LUh/h$b;->i:Ljava/util/List;

    invoke-static {v0, v1}, LUh/h;->d0(LUh/h;Ljava/util/List;)Ljava/util/List;

    invoke-static {v0, v3}, LUh/h;->f0(LUh/h;I)I

    return-object v0
.end method

.method public q()LUh/h$b;
    .locals 2

    invoke-static {}, LUh/h$b;->r()LUh/h$b;

    move-result-object v0

    invoke-virtual {p0}, LUh/h$b;->p()LUh/h;

    move-result-object v1

    invoke-virtual {v0, v1}, LUh/h$b;->x(LUh/h;)LUh/h$b;

    move-result-object v0

    return-object v0
.end method

.method public x(LUh/h;)LUh/h$b;
    .locals 2

    invoke-static {}, LUh/h;->K0()LUh/h;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p1}, LUh/h;->X0()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LUh/h;->M0()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/h$b;->D(I)LUh/h$b;

    :cond_1
    invoke-virtual {p1}, LUh/h;->a1()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, LUh/h;->V0()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/h$b;->F(I)LUh/h$b;

    :cond_2
    invoke-virtual {p1}, LUh/h;->W0()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, LUh/h;->G0()LUh/h$c;

    move-result-object v0

    invoke-virtual {p0, v0}, LUh/h$b;->B(LUh/h$c;)LUh/h$b;

    :cond_3
    invoke-virtual {p1}, LUh/h;->Y0()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, LUh/h;->N0()LUh/q;

    move-result-object v0

    invoke-virtual {p0, v0}, LUh/h$b;->A(LUh/q;)LUh/h$b;

    :cond_4
    invoke-virtual {p1}, LUh/h;->Z0()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, LUh/h;->P0()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/h$b;->E(I)LUh/h$b;

    :cond_5
    invoke-static {p1}, LUh/h;->P(LUh/h;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p0, LUh/h$b;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {p1}, LUh/h;->P(LUh/h;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/h$b;->h:Ljava/util/List;

    iget v0, p0, LUh/h$b;->b:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, LUh/h$b;->b:I

    goto :goto_0

    :cond_6
    invoke-direct {p0}, LUh/h$b;->t()V

    iget-object v0, p0, LUh/h$b;->h:Ljava/util/List;

    invoke-static {p1}, LUh/h;->P(LUh/h;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_7
    :goto_0
    invoke-static {p1}, LUh/h;->T(LUh/h;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_9

    iget-object v0, p0, LUh/h$b;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {p1}, LUh/h;->T(LUh/h;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/h$b;->i:Ljava/util/List;

    iget v0, p0, LUh/h$b;->b:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, LUh/h$b;->b:I

    goto :goto_1

    :cond_8
    invoke-direct {p0}, LUh/h$b;->u()V

    iget-object v0, p0, LUh/h$b;->i:Ljava/util/List;

    invoke-static {p1}, LUh/h;->T(LUh/h;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_9
    :goto_1
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->e()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object v0

    invoke-static {p1}, LUh/h;->q0(LUh/h;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/d;->e(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->i(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;

    return-object p0
.end method

.method public z(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/h$b;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, LUh/h;->n:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-interface {v1, p1, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/p;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LUh/h;
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, LUh/h$b;->x(LUh/h;)LUh/h$b;

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

    check-cast p2, LUh/h;
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

    invoke-virtual {p0, v0}, LUh/h$b;->x(LUh/h;)LUh/h$b;

    :cond_1
    throw p1
.end method
