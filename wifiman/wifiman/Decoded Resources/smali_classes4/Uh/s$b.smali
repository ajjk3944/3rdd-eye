.class public final LUh/s$b;
.super Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/protobuf/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUh/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private d:I

.field private e:I

.field private f:I

.field private g:Z

.field private h:LUh/s$c;

.field private i:Ljava/util/List;

.field private j:Ljava/util/List;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;-><init>()V

    sget-object v0, LUh/s$c;->INV:LUh/s$c;

    iput-object v0, p0, LUh/s$b;->h:LUh/s$c;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/s$b;->i:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/s$b;->j:Ljava/util/List;

    invoke-direct {p0}, LUh/s$b;->B()V

    return-void
.end method

.method private A()V
    .locals 3

    iget v0, p0, LUh/s$b;->d:I

    const/16 v1, 0x10

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LUh/s$b;->i:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LUh/s$b;->i:Ljava/util/List;

    iget v0, p0, LUh/s$b;->d:I

    or-int/2addr v0, v1

    iput v0, p0, LUh/s$b;->d:I

    :cond_0
    return-void
.end method

.method private B()V
    .locals 0

    return-void
.end method

.method static synthetic r()LUh/s$b;
    .locals 1

    invoke-static {}, LUh/s$b;->x()LUh/s$b;

    move-result-object v0

    return-object v0
.end method

.method private static x()LUh/s$b;
    .locals 1

    new-instance v0, LUh/s$b;

    invoke-direct {v0}, LUh/s$b;-><init>()V

    return-object v0
.end method

.method private z()V
    .locals 3

    iget v0, p0, LUh/s$b;->d:I

    const/16 v1, 0x20

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LUh/s$b;->j:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LUh/s$b;->j:Ljava/util/List;

    iget v0, p0, LUh/s$b;->d:I

    or-int/2addr v0, v1

    iput v0, p0, LUh/s$b;->d:I

    :cond_0
    return-void
.end method


# virtual methods
.method public D(LUh/s;)LUh/s$b;
    .locals 2

    invoke-static {}, LUh/s;->U0()LUh/s;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p1}, LUh/s;->e1()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LUh/s;->W0()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/s$b;->F(I)LUh/s$b;

    :cond_1
    invoke-virtual {p1}, LUh/s;->f1()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, LUh/s;->X0()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/s$b;->G(I)LUh/s$b;

    :cond_2
    invoke-virtual {p1}, LUh/s;->g1()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, LUh/s;->Y0()Z

    move-result v0

    invoke-virtual {p0, v0}, LUh/s$b;->H(Z)LUh/s$b;

    :cond_3
    invoke-virtual {p1}, LUh/s;->h1()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, LUh/s;->d1()LUh/s$c;

    move-result-object v0

    invoke-virtual {p0, v0}, LUh/s$b;->I(LUh/s$c;)LUh/s$b;

    :cond_4
    invoke-static {p1}, LUh/s;->G0(LUh/s;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, LUh/s$b;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {p1}, LUh/s;->G0(LUh/s;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/s$b;->i:Ljava/util/List;

    iget v0, p0, LUh/s$b;->d:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, LUh/s$b;->d:I

    goto :goto_0

    :cond_5
    invoke-direct {p0}, LUh/s$b;->A()V

    iget-object v0, p0, LUh/s$b;->i:Ljava/util/List;

    invoke-static {p1}, LUh/s;->G0(LUh/s;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_6
    :goto_0
    invoke-static {p1}, LUh/s;->M0(LUh/s;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, LUh/s$b;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {p1}, LUh/s;->M0(LUh/s;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/s$b;->j:Ljava/util/List;

    iget v0, p0, LUh/s$b;->d:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, LUh/s$b;->d:I

    goto :goto_1

    :cond_7
    invoke-direct {p0}, LUh/s$b;->z()V

    iget-object v0, p0, LUh/s$b;->j:Ljava/util/List;

    invoke-static {p1}, LUh/s;->M0(LUh/s;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_8
    :goto_1
    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;->q(Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;)V

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->e()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object v0

    invoke-static {p1}, LUh/s;->T0(LUh/s;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/d;->e(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->i(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;

    return-object p0
.end method

.method public E(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/s$b;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, LUh/s;->o:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-interface {v1, p1, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/p;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LUh/s;
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, LUh/s$b;->D(LUh/s;)LUh/s$b;

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

    check-cast p2, LUh/s;
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

    invoke-virtual {p0, v0}, LUh/s$b;->D(LUh/s;)LUh/s$b;

    :cond_1
    throw p1
.end method

.method public F(I)LUh/s$b;
    .locals 1

    iget v0, p0, LUh/s$b;->d:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, LUh/s$b;->d:I

    iput p1, p0, LUh/s$b;->e:I

    return-object p0
.end method

.method public G(I)LUh/s$b;
    .locals 1

    iget v0, p0, LUh/s$b;->d:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, LUh/s$b;->d:I

    iput p1, p0, LUh/s$b;->f:I

    return-object p0
.end method

.method public H(Z)LUh/s$b;
    .locals 1

    iget v0, p0, LUh/s$b;->d:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, LUh/s$b;->d:I

    iput-boolean p1, p0, LUh/s$b;->g:Z

    return-object p0
.end method

.method public I(LUh/s$c;)LUh/s$b;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, LUh/s$b;->d:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, LUh/s$b;->d:I

    iput-object p1, p0, LUh/s$b;->h:LUh/s$c;

    return-object p0
.end method

.method public bridge synthetic a()Lkotlin/reflect/jvm/internal/impl/protobuf/n;
    .locals 1

    invoke-virtual {p0}, LUh/s$b;->t()LUh/s;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b0(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/n$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, LUh/s$b;->E(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/s$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LUh/s$b;->w()LUh/s$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic f(Lkotlin/reflect/jvm/internal/impl/protobuf/h;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;
    .locals 0

    check-cast p1, LUh/s;

    invoke-virtual {p0, p1}, LUh/s$b;->D(LUh/s;)LUh/s$b;

    move-result-object p1

    return-object p1
.end method

.method public t()LUh/s;
    .locals 2

    invoke-virtual {p0}, LUh/s$b;->u()LUh/s;

    move-result-object v0

    invoke-virtual {v0}, LUh/s;->m()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/a$a;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/n;)Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0
.end method

.method public u()LUh/s;
    .locals 5

    new-instance v0, LUh/s;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LUh/s;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;LUh/a;)V

    iget v1, p0, LUh/s$b;->d:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget v2, p0, LUh/s$b;->e:I

    invoke-static {v0, v2}, LUh/s;->f0(LUh/s;I)I

    and-int/lit8 v2, v1, 0x2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    or-int/lit8 v3, v3, 0x2

    :cond_1
    iget v2, p0, LUh/s$b;->f:I

    invoke-static {v0, v2}, LUh/s;->q0(LUh/s;I)I

    and-int/lit8 v2, v1, 0x4

    const/4 v4, 0x4

    if-ne v2, v4, :cond_2

    or-int/lit8 v3, v3, 0x4

    :cond_2
    iget-boolean v2, p0, LUh/s$b;->g:Z

    invoke-static {v0, v2}, LUh/s;->C0(LUh/s;Z)Z

    const/16 v2, 0x8

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_3

    or-int/lit8 v3, v3, 0x8

    :cond_3
    iget-object v1, p0, LUh/s$b;->h:LUh/s$c;

    invoke-static {v0, v1}, LUh/s;->E0(LUh/s;LUh/s$c;)LUh/s$c;

    iget v1, p0, LUh/s$b;->d:I

    const/16 v2, 0x10

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_4

    iget-object v1, p0, LUh/s$b;->i:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, LUh/s$b;->i:Ljava/util/List;

    iget v1, p0, LUh/s$b;->d:I

    and-int/lit8 v1, v1, -0x11

    iput v1, p0, LUh/s$b;->d:I

    :cond_4
    iget-object v1, p0, LUh/s$b;->i:Ljava/util/List;

    invoke-static {v0, v1}, LUh/s;->K0(LUh/s;Ljava/util/List;)Ljava/util/List;

    iget v1, p0, LUh/s$b;->d:I

    const/16 v2, 0x20

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_5

    iget-object v1, p0, LUh/s$b;->j:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, LUh/s$b;->j:Ljava/util/List;

    iget v1, p0, LUh/s$b;->d:I

    and-int/lit8 v1, v1, -0x21

    iput v1, p0, LUh/s$b;->d:I

    :cond_5
    iget-object v1, p0, LUh/s$b;->j:Ljava/util/List;

    invoke-static {v0, v1}, LUh/s;->N0(LUh/s;Ljava/util/List;)Ljava/util/List;

    invoke-static {v0, v3}, LUh/s;->P0(LUh/s;I)I

    return-object v0
.end method

.method public w()LUh/s$b;
    .locals 2

    invoke-static {}, LUh/s$b;->x()LUh/s$b;

    move-result-object v0

    invoke-virtual {p0}, LUh/s$b;->u()LUh/s;

    move-result-object v1

    invoke-virtual {v0, v1}, LUh/s$b;->D(LUh/s;)LUh/s$b;

    move-result-object v0

    return-object v0
.end method
