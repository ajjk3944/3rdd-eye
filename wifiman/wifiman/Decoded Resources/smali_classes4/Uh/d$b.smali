.class public final LUh/d$b;
.super Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/protobuf/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUh/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private d:I

.field private e:I

.field private f:Ljava/util/List;

.field private g:Ljava/util/List;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;-><init>()V

    const/4 v0, 0x6

    iput v0, p0, LUh/d$b;->e:I

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/d$b;->f:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/d$b;->g:Ljava/util/List;

    invoke-direct {p0}, LUh/d$b;->B()V

    return-void
.end method

.method private A()V
    .locals 3

    iget v0, p0, LUh/d$b;->d:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LUh/d$b;->g:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LUh/d$b;->g:Ljava/util/List;

    iget v0, p0, LUh/d$b;->d:I

    or-int/2addr v0, v1

    iput v0, p0, LUh/d$b;->d:I

    :cond_0
    return-void
.end method

.method private B()V
    .locals 0

    return-void
.end method

.method static synthetic r()LUh/d$b;
    .locals 1

    invoke-static {}, LUh/d$b;->x()LUh/d$b;

    move-result-object v0

    return-object v0
.end method

.method private static x()LUh/d$b;
    .locals 1

    new-instance v0, LUh/d$b;

    invoke-direct {v0}, LUh/d$b;-><init>()V

    return-object v0
.end method

.method private z()V
    .locals 3

    iget v0, p0, LUh/d$b;->d:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LUh/d$b;->f:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LUh/d$b;->f:Ljava/util/List;

    iget v0, p0, LUh/d$b;->d:I

    or-int/2addr v0, v1

    iput v0, p0, LUh/d$b;->d:I

    :cond_0
    return-void
.end method


# virtual methods
.method public D(LUh/d;)LUh/d$b;
    .locals 2

    invoke-static {}, LUh/d;->N0()LUh/d;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p1}, LUh/d;->Y0()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LUh/d;->T0()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/d$b;->F(I)LUh/d$b;

    :cond_1
    invoke-static {p1}, LUh/d;->q0(LUh/d;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, LUh/d$b;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p1}, LUh/d;->q0(LUh/d;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/d$b;->f:Ljava/util/List;

    iget v0, p0, LUh/d$b;->d:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, LUh/d$b;->d:I

    goto :goto_0

    :cond_2
    invoke-direct {p0}, LUh/d$b;->z()V

    iget-object v0, p0, LUh/d$b;->f:Ljava/util/List;

    invoke-static {p1}, LUh/d;->q0(LUh/d;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_3
    :goto_0
    invoke-static {p1}, LUh/d;->E0(LUh/d;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, LUh/d$b;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {p1}, LUh/d;->E0(LUh/d;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/d$b;->g:Ljava/util/List;

    iget v0, p0, LUh/d$b;->d:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, LUh/d$b;->d:I

    goto :goto_1

    :cond_4
    invoke-direct {p0}, LUh/d$b;->A()V

    iget-object v0, p0, LUh/d$b;->g:Ljava/util/List;

    invoke-static {p1}, LUh/d;->E0(LUh/d;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_5
    :goto_1
    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;->q(Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;)V

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->e()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object v0

    invoke-static {p1}, LUh/d;->M0(LUh/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/d;->e(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->i(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;

    return-object p0
.end method

.method public E(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/d$b;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, LUh/d;->k:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-interface {v1, p1, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/p;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LUh/d;
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, LUh/d$b;->D(LUh/d;)LUh/d$b;

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

    check-cast p2, LUh/d;
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

    invoke-virtual {p0, v0}, LUh/d$b;->D(LUh/d;)LUh/d$b;

    :cond_1
    throw p1
.end method

.method public F(I)LUh/d$b;
    .locals 1

    iget v0, p0, LUh/d$b;->d:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, LUh/d$b;->d:I

    iput p1, p0, LUh/d$b;->e:I

    return-object p0
.end method

.method public bridge synthetic a()Lkotlin/reflect/jvm/internal/impl/protobuf/n;
    .locals 1

    invoke-virtual {p0}, LUh/d$b;->t()LUh/d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b0(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/n$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, LUh/d$b;->E(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/d$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LUh/d$b;->w()LUh/d$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic f(Lkotlin/reflect/jvm/internal/impl/protobuf/h;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;
    .locals 0

    check-cast p1, LUh/d;

    invoke-virtual {p0, p1}, LUh/d$b;->D(LUh/d;)LUh/d$b;

    move-result-object p1

    return-object p1
.end method

.method public t()LUh/d;
    .locals 2

    invoke-virtual {p0}, LUh/d$b;->u()LUh/d;

    move-result-object v0

    invoke-virtual {v0}, LUh/d;->m()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/a$a;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/n;)Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0
.end method

.method public u()LUh/d;
    .locals 4

    new-instance v0, LUh/d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LUh/d;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;LUh/a;)V

    iget v1, p0, LUh/d$b;->d:I

    const/4 v2, 0x1

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iget v1, p0, LUh/d$b;->e:I

    invoke-static {v0, v1}, LUh/d;->f0(LUh/d;I)I

    iget v1, p0, LUh/d$b;->d:I

    const/4 v3, 0x2

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_1

    iget-object v1, p0, LUh/d$b;->f:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, LUh/d$b;->f:Ljava/util/List;

    iget v1, p0, LUh/d$b;->d:I

    and-int/lit8 v1, v1, -0x3

    iput v1, p0, LUh/d$b;->d:I

    :cond_1
    iget-object v1, p0, LUh/d$b;->f:Ljava/util/List;

    invoke-static {v0, v1}, LUh/d;->C0(LUh/d;Ljava/util/List;)Ljava/util/List;

    iget v1, p0, LUh/d$b;->d:I

    const/4 v3, 0x4

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_2

    iget-object v1, p0, LUh/d$b;->g:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, LUh/d$b;->g:Ljava/util/List;

    iget v1, p0, LUh/d$b;->d:I

    and-int/lit8 v1, v1, -0x5

    iput v1, p0, LUh/d$b;->d:I

    :cond_2
    iget-object v1, p0, LUh/d$b;->g:Ljava/util/List;

    invoke-static {v0, v1}, LUh/d;->G0(LUh/d;Ljava/util/List;)Ljava/util/List;

    invoke-static {v0, v2}, LUh/d;->K0(LUh/d;I)I

    return-object v0
.end method

.method public w()LUh/d$b;
    .locals 2

    invoke-static {}, LUh/d$b;->x()LUh/d$b;

    move-result-object v0

    invoke-virtual {p0}, LUh/d$b;->u()LUh/d;

    move-result-object v1

    invoke-virtual {v0, v1}, LUh/d$b;->D(LUh/d;)LUh/d$b;

    move-result-object v0

    return-object v0
.end method
