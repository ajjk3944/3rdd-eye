.class public final LUh/l$b;
.super Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/protobuf/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUh/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private d:I

.field private e:Ljava/util/List;

.field private f:Ljava/util/List;

.field private g:Ljava/util/List;

.field private h:LUh/t;

.field private i:LUh/w;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/l$b;->e:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/l$b;->f:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/l$b;->g:Ljava/util/List;

    invoke-static {}, LUh/t;->P()LUh/t;

    move-result-object v0

    iput-object v0, p0, LUh/l$b;->h:LUh/t;

    invoke-static {}, LUh/w;->J()LUh/w;

    move-result-object v0

    iput-object v0, p0, LUh/l$b;->i:LUh/w;

    invoke-direct {p0}, LUh/l$b;->D()V

    return-void
.end method

.method private A()V
    .locals 3

    iget v0, p0, LUh/l$b;->d:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LUh/l$b;->f:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LUh/l$b;->f:Ljava/util/List;

    iget v0, p0, LUh/l$b;->d:I

    or-int/2addr v0, v1

    iput v0, p0, LUh/l$b;->d:I

    :cond_0
    return-void
.end method

.method private B()V
    .locals 3

    iget v0, p0, LUh/l$b;->d:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LUh/l$b;->g:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LUh/l$b;->g:Ljava/util/List;

    iget v0, p0, LUh/l$b;->d:I

    or-int/2addr v0, v1

    iput v0, p0, LUh/l$b;->d:I

    :cond_0
    return-void
.end method

.method private D()V
    .locals 0

    return-void
.end method

.method static synthetic r()LUh/l$b;
    .locals 1

    invoke-static {}, LUh/l$b;->x()LUh/l$b;

    move-result-object v0

    return-object v0
.end method

.method private static x()LUh/l$b;
    .locals 1

    new-instance v0, LUh/l$b;

    invoke-direct {v0}, LUh/l$b;-><init>()V

    return-object v0
.end method

.method private z()V
    .locals 3

    iget v0, p0, LUh/l$b;->d:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LUh/l$b;->e:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LUh/l$b;->e:Ljava/util/List;

    iget v0, p0, LUh/l$b;->d:I

    or-int/2addr v0, v1

    iput v0, p0, LUh/l$b;->d:I

    :cond_0
    return-void
.end method


# virtual methods
.method public E(LUh/l;)LUh/l$b;
    .locals 2

    invoke-static {}, LUh/l;->U0()LUh/l;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-static {p1}, LUh/l;->f0(LUh/l;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, LUh/l$b;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, LUh/l;->f0(LUh/l;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/l$b;->e:Ljava/util/List;

    iget v0, p0, LUh/l$b;->d:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, LUh/l$b;->d:I

    goto :goto_0

    :cond_1
    invoke-direct {p0}, LUh/l$b;->z()V

    iget-object v0, p0, LUh/l$b;->e:Ljava/util/List;

    invoke-static {p1}, LUh/l;->f0(LUh/l;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_2
    :goto_0
    invoke-static {p1}, LUh/l;->C0(LUh/l;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, LUh/l$b;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {p1}, LUh/l;->C0(LUh/l;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/l$b;->f:Ljava/util/List;

    iget v0, p0, LUh/l$b;->d:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, LUh/l$b;->d:I

    goto :goto_1

    :cond_3
    invoke-direct {p0}, LUh/l$b;->A()V

    iget-object v0, p0, LUh/l$b;->f:Ljava/util/List;

    invoke-static {p1}, LUh/l;->C0(LUh/l;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_4
    :goto_1
    invoke-static {p1}, LUh/l;->G0(LUh/l;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, LUh/l$b;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {p1}, LUh/l;->G0(LUh/l;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/l$b;->g:Ljava/util/List;

    iget v0, p0, LUh/l$b;->d:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, LUh/l$b;->d:I

    goto :goto_2

    :cond_5
    invoke-direct {p0}, LUh/l$b;->B()V

    iget-object v0, p0, LUh/l$b;->g:Ljava/util/List;

    invoke-static {p1}, LUh/l;->G0(LUh/l;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_6
    :goto_2
    invoke-virtual {p1}, LUh/l;->h1()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p1}, LUh/l;->f1()LUh/t;

    move-result-object v0

    invoke-virtual {p0, v0}, LUh/l$b;->G(LUh/t;)LUh/l$b;

    :cond_7
    invoke-virtual {p1}, LUh/l;->i1()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p1}, LUh/l;->g1()LUh/w;

    move-result-object v0

    invoke-virtual {p0, v0}, LUh/l$b;->H(LUh/w;)LUh/l$b;

    :cond_8
    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;->q(Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;)V

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->e()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object v0

    invoke-static {p1}, LUh/l;->T0(LUh/l;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/d;->e(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->i(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;

    return-object p0
.end method

.method public F(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/l$b;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, LUh/l;->m:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-interface {v1, p1, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/p;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LUh/l;
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, LUh/l$b;->E(LUh/l;)LUh/l$b;

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

    check-cast p2, LUh/l;
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

    invoke-virtual {p0, v0}, LUh/l$b;->E(LUh/l;)LUh/l$b;

    :cond_1
    throw p1
.end method

.method public G(LUh/t;)LUh/l$b;
    .locals 3

    iget v0, p0, LUh/l$b;->d:I

    const/16 v1, 0x8

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LUh/l$b;->h:LUh/t;

    invoke-static {}, LUh/t;->P()LUh/t;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, LUh/l$b;->h:LUh/t;

    invoke-static {v0}, LUh/t;->G0(LUh/t;)LUh/t$b;

    move-result-object v0

    invoke-virtual {v0, p1}, LUh/t$b;->w(LUh/t;)LUh/t$b;

    move-result-object p1

    invoke-virtual {p1}, LUh/t$b;->p()LUh/t;

    move-result-object p1

    iput-object p1, p0, LUh/l$b;->h:LUh/t;

    goto :goto_0

    :cond_0
    iput-object p1, p0, LUh/l$b;->h:LUh/t;

    :goto_0
    iget p1, p0, LUh/l$b;->d:I

    or-int/2addr p1, v1

    iput p1, p0, LUh/l$b;->d:I

    return-object p0
.end method

.method public H(LUh/w;)LUh/l$b;
    .locals 3

    iget v0, p0, LUh/l$b;->d:I

    const/16 v1, 0x10

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LUh/l$b;->i:LUh/w;

    invoke-static {}, LUh/w;->J()LUh/w;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, LUh/l$b;->i:LUh/w;

    invoke-static {v0}, LUh/w;->d0(LUh/w;)LUh/w$b;

    move-result-object v0

    invoke-virtual {v0, p1}, LUh/w$b;->w(LUh/w;)LUh/w$b;

    move-result-object p1

    invoke-virtual {p1}, LUh/w$b;->p()LUh/w;

    move-result-object p1

    iput-object p1, p0, LUh/l$b;->i:LUh/w;

    goto :goto_0

    :cond_0
    iput-object p1, p0, LUh/l$b;->i:LUh/w;

    :goto_0
    iget p1, p0, LUh/l$b;->d:I

    or-int/2addr p1, v1

    iput p1, p0, LUh/l$b;->d:I

    return-object p0
.end method

.method public bridge synthetic a()Lkotlin/reflect/jvm/internal/impl/protobuf/n;
    .locals 1

    invoke-virtual {p0}, LUh/l$b;->t()LUh/l;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b0(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/n$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, LUh/l$b;->F(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/l$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LUh/l$b;->w()LUh/l$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic f(Lkotlin/reflect/jvm/internal/impl/protobuf/h;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;
    .locals 0

    check-cast p1, LUh/l;

    invoke-virtual {p0, p1}, LUh/l$b;->E(LUh/l;)LUh/l$b;

    move-result-object p1

    return-object p1
.end method

.method public t()LUh/l;
    .locals 2

    invoke-virtual {p0}, LUh/l$b;->u()LUh/l;

    move-result-object v0

    invoke-virtual {v0}, LUh/l;->m()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/a$a;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/n;)Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0
.end method

.method public u()LUh/l;
    .locals 5

    new-instance v0, LUh/l;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LUh/l;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;LUh/a;)V

    iget v1, p0, LUh/l$b;->d:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    iget-object v2, p0, LUh/l$b;->e:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, LUh/l$b;->e:Ljava/util/List;

    iget v2, p0, LUh/l$b;->d:I

    and-int/lit8 v2, v2, -0x2

    iput v2, p0, LUh/l$b;->d:I

    :cond_0
    iget-object v2, p0, LUh/l$b;->e:Ljava/util/List;

    invoke-static {v0, v2}, LUh/l;->q0(LUh/l;Ljava/util/List;)Ljava/util/List;

    iget v2, p0, LUh/l$b;->d:I

    const/4 v4, 0x2

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_1

    iget-object v2, p0, LUh/l$b;->f:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, LUh/l$b;->f:Ljava/util/List;

    iget v2, p0, LUh/l$b;->d:I

    and-int/lit8 v2, v2, -0x3

    iput v2, p0, LUh/l$b;->d:I

    :cond_1
    iget-object v2, p0, LUh/l$b;->f:Ljava/util/List;

    invoke-static {v0, v2}, LUh/l;->E0(LUh/l;Ljava/util/List;)Ljava/util/List;

    iget v2, p0, LUh/l$b;->d:I

    const/4 v4, 0x4

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_2

    iget-object v2, p0, LUh/l$b;->g:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, LUh/l$b;->g:Ljava/util/List;

    iget v2, p0, LUh/l$b;->d:I

    and-int/lit8 v2, v2, -0x5

    iput v2, p0, LUh/l$b;->d:I

    :cond_2
    iget-object v2, p0, LUh/l$b;->g:Ljava/util/List;

    invoke-static {v0, v2}, LUh/l;->K0(LUh/l;Ljava/util/List;)Ljava/util/List;

    and-int/lit8 v2, v1, 0x8

    const/16 v4, 0x8

    if-ne v2, v4, :cond_3

    goto :goto_0

    :cond_3
    const/4 v3, 0x0

    :goto_0
    iget-object v2, p0, LUh/l$b;->h:LUh/t;

    invoke-static {v0, v2}, LUh/l;->M0(LUh/l;LUh/t;)LUh/t;

    const/16 v2, 0x10

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_4

    or-int/lit8 v3, v3, 0x2

    :cond_4
    iget-object v1, p0, LUh/l$b;->i:LUh/w;

    invoke-static {v0, v1}, LUh/l;->N0(LUh/l;LUh/w;)LUh/w;

    invoke-static {v0, v3}, LUh/l;->P0(LUh/l;I)I

    return-object v0
.end method

.method public w()LUh/l$b;
    .locals 2

    invoke-static {}, LUh/l$b;->x()LUh/l$b;

    move-result-object v0

    invoke-virtual {p0}, LUh/l$b;->u()LUh/l;

    move-result-object v1

    invoke-virtual {v0, v1}, LUh/l$b;->E(LUh/l;)LUh/l$b;

    move-result-object v0

    return-object v0
.end method
