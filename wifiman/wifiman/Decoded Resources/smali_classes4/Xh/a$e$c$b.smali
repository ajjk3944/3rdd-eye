.class public final LXh/a$e$c$b;
.super Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/protobuf/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LXh/a$e$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private b:I

.field private c:I

.field private d:I

.field private e:Ljava/lang/Object;

.field private f:LXh/a$e$c$c;

.field private g:Ljava/util/List;

.field private h:Ljava/util/List;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, LXh/a$e$c$b;->c:I

    const-string v0, ""

    iput-object v0, p0, LXh/a$e$c$b;->e:Ljava/lang/Object;

    sget-object v0, LXh/a$e$c$c;->NONE:LXh/a$e$c$c;

    iput-object v0, p0, LXh/a$e$c$b;->f:LXh/a$e$c$c;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LXh/a$e$c$b;->g:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LXh/a$e$c$b;->h:Ljava/util/List;

    invoke-direct {p0}, LXh/a$e$c$b;->w()V

    return-void
.end method

.method static synthetic k()LXh/a$e$c$b;
    .locals 1

    invoke-static {}, LXh/a$e$c$b;->r()LXh/a$e$c$b;

    move-result-object v0

    return-object v0
.end method

.method private static r()LXh/a$e$c$b;
    .locals 1

    new-instance v0, LXh/a$e$c$b;

    invoke-direct {v0}, LXh/a$e$c$b;-><init>()V

    return-object v0
.end method

.method private t()V
    .locals 3

    iget v0, p0, LXh/a$e$c$b;->b:I

    const/16 v1, 0x20

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LXh/a$e$c$b;->h:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LXh/a$e$c$b;->h:Ljava/util/List;

    iget v0, p0, LXh/a$e$c$b;->b:I

    or-int/2addr v0, v1

    iput v0, p0, LXh/a$e$c$b;->b:I

    :cond_0
    return-void
.end method

.method private u()V
    .locals 3

    iget v0, p0, LXh/a$e$c$b;->b:I

    const/16 v1, 0x10

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LXh/a$e$c$b;->g:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LXh/a$e$c$b;->g:Ljava/util/List;

    iget v0, p0, LXh/a$e$c$b;->b:I

    or-int/2addr v0, v1

    iput v0, p0, LXh/a$e$c$b;->b:I

    :cond_0
    return-void
.end method

.method private w()V
    .locals 0

    return-void
.end method


# virtual methods
.method public A(LXh/a$e$c$c;)LXh/a$e$c$b;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, LXh/a$e$c$b;->b:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, LXh/a$e$c$b;->b:I

    iput-object p1, p0, LXh/a$e$c$b;->f:LXh/a$e$c$c;

    return-object p0
.end method

.method public B(I)LXh/a$e$c$b;
    .locals 1

    iget v0, p0, LXh/a$e$c$b;->b:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, LXh/a$e$c$b;->b:I

    iput p1, p0, LXh/a$e$c$b;->d:I

    return-object p0
.end method

.method public D(I)LXh/a$e$c$b;
    .locals 1

    iget v0, p0, LXh/a$e$c$b;->b:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, LXh/a$e$c$b;->b:I

    iput p1, p0, LXh/a$e$c$b;->c:I

    return-object p0
.end method

.method public bridge synthetic a()Lkotlin/reflect/jvm/internal/impl/protobuf/n;
    .locals 1

    invoke-virtual {p0}, LXh/a$e$c$b;->o()LXh/a$e$c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b0(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/n$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, LXh/a$e$c$b;->z(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LXh/a$e$c$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LXh/a$e$c$b;->q()LXh/a$e$c$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic f(Lkotlin/reflect/jvm/internal/impl/protobuf/h;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;
    .locals 0

    check-cast p1, LXh/a$e$c;

    invoke-virtual {p0, p1}, LXh/a$e$c$b;->x(LXh/a$e$c;)LXh/a$e$c$b;

    move-result-object p1

    return-object p1
.end method

.method public o()LXh/a$e$c;
    .locals 2

    invoke-virtual {p0}, LXh/a$e$c$b;->p()LXh/a$e$c;

    move-result-object v0

    invoke-virtual {v0}, LXh/a$e$c;->m()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/a$a;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/n;)Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0
.end method

.method public p()LXh/a$e$c;
    .locals 5

    new-instance v0, LXh/a$e$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LXh/a$e$c;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;LXh/a$a;)V

    iget v1, p0, LXh/a$e$c$b;->b:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget v2, p0, LXh/a$e$c$b;->c:I

    invoke-static {v0, v2}, LXh/a$e$c;->F(LXh/a$e$c;I)I

    and-int/lit8 v2, v1, 0x2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    or-int/lit8 v3, v3, 0x2

    :cond_1
    iget v2, p0, LXh/a$e$c$b;->d:I

    invoke-static {v0, v2}, LXh/a$e$c;->J(LXh/a$e$c;I)I

    and-int/lit8 v2, v1, 0x4

    const/4 v4, 0x4

    if-ne v2, v4, :cond_2

    or-int/lit8 v3, v3, 0x4

    :cond_2
    iget-object v2, p0, LXh/a$e$c$b;->e:Ljava/lang/Object;

    invoke-static {v0, v2}, LXh/a$e$c;->P(LXh/a$e$c;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v2, 0x8

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_3

    or-int/lit8 v3, v3, 0x8

    :cond_3
    iget-object v1, p0, LXh/a$e$c$b;->f:LXh/a$e$c$c;

    invoke-static {v0, v1}, LXh/a$e$c;->S(LXh/a$e$c;LXh/a$e$c$c;)LXh/a$e$c$c;

    iget v1, p0, LXh/a$e$c$b;->b:I

    const/16 v2, 0x10

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_4

    iget-object v1, p0, LXh/a$e$c$b;->g:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, LXh/a$e$c$b;->g:Ljava/util/List;

    iget v1, p0, LXh/a$e$c$b;->b:I

    and-int/lit8 v1, v1, -0x11

    iput v1, p0, LXh/a$e$c$b;->b:I

    :cond_4
    iget-object v1, p0, LXh/a$e$c$b;->g:Ljava/util/List;

    invoke-static {v0, v1}, LXh/a$e$c;->d0(LXh/a$e$c;Ljava/util/List;)Ljava/util/List;

    iget v1, p0, LXh/a$e$c$b;->b:I

    const/16 v2, 0x20

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_5

    iget-object v1, p0, LXh/a$e$c$b;->h:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, LXh/a$e$c$b;->h:Ljava/util/List;

    iget v1, p0, LXh/a$e$c$b;->b:I

    and-int/lit8 v1, v1, -0x21

    iput v1, p0, LXh/a$e$c$b;->b:I

    :cond_5
    iget-object v1, p0, LXh/a$e$c$b;->h:Ljava/util/List;

    invoke-static {v0, v1}, LXh/a$e$c;->q0(LXh/a$e$c;Ljava/util/List;)Ljava/util/List;

    invoke-static {v0, v3}, LXh/a$e$c;->C(LXh/a$e$c;I)I

    return-object v0
.end method

.method public q()LXh/a$e$c$b;
    .locals 2

    invoke-static {}, LXh/a$e$c$b;->r()LXh/a$e$c$b;

    move-result-object v0

    invoke-virtual {p0}, LXh/a$e$c$b;->p()LXh/a$e$c;

    move-result-object v1

    invoke-virtual {v0, v1}, LXh/a$e$c$b;->x(LXh/a$e$c;)LXh/a$e$c$b;

    move-result-object v0

    return-object v0
.end method

.method public x(LXh/a$e$c;)LXh/a$e$c$b;
    .locals 2

    invoke-static {}, LXh/a$e$c;->C0()LXh/a$e$c;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p1}, LXh/a$e$c;->Y0()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LXh/a$e$c;->K0()I

    move-result v0

    invoke-virtual {p0, v0}, LXh/a$e$c$b;->D(I)LXh/a$e$c$b;

    :cond_1
    invoke-virtual {p1}, LXh/a$e$c;->X0()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, LXh/a$e$c;->G0()I

    move-result v0

    invoke-virtual {p0, v0}, LXh/a$e$c$b;->B(I)LXh/a$e$c$b;

    :cond_2
    invoke-virtual {p1}, LXh/a$e$c;->Z0()Z

    move-result v0

    if-eqz v0, :cond_3

    iget v0, p0, LXh/a$e$c$b;->b:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, LXh/a$e$c$b;->b:I

    invoke-static {p1}, LXh/a$e$c;->K(LXh/a$e$c;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, LXh/a$e$c$b;->e:Ljava/lang/Object;

    :cond_3
    invoke-virtual {p1}, LXh/a$e$c;->W0()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, LXh/a$e$c;->E0()LXh/a$e$c$c;

    move-result-object v0

    invoke-virtual {p0, v0}, LXh/a$e$c$b;->A(LXh/a$e$c$c;)LXh/a$e$c$b;

    :cond_4
    invoke-static {p1}, LXh/a$e$c;->T(LXh/a$e$c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, LXh/a$e$c$b;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {p1}, LXh/a$e$c;->T(LXh/a$e$c;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LXh/a$e$c$b;->g:Ljava/util/List;

    iget v0, p0, LXh/a$e$c$b;->b:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, LXh/a$e$c$b;->b:I

    goto :goto_0

    :cond_5
    invoke-direct {p0}, LXh/a$e$c$b;->u()V

    iget-object v0, p0, LXh/a$e$c$b;->g:Ljava/util/List;

    invoke-static {p1}, LXh/a$e$c;->T(LXh/a$e$c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_6
    :goto_0
    invoke-static {p1}, LXh/a$e$c;->f0(LXh/a$e$c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, LXh/a$e$c$b;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {p1}, LXh/a$e$c;->f0(LXh/a$e$c;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LXh/a$e$c$b;->h:Ljava/util/List;

    iget v0, p0, LXh/a$e$c$b;->b:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, LXh/a$e$c$b;->b:I

    goto :goto_1

    :cond_7
    invoke-direct {p0}, LXh/a$e$c$b;->t()V

    iget-object v0, p0, LXh/a$e$c$b;->h:Ljava/util/List;

    invoke-static {p1}, LXh/a$e$c;->f0(LXh/a$e$c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_8
    :goto_1
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->e()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object v0

    invoke-static {p1}, LXh/a$e$c;->E(LXh/a$e$c;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/d;->e(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->i(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;

    return-object p0
.end method

.method public z(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LXh/a$e$c$b;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, LXh/a$e$c;->o:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-interface {v1, p1, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/p;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LXh/a$e$c;
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, LXh/a$e$c$b;->x(LXh/a$e$c;)LXh/a$e$c$b;

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

    check-cast p2, LXh/a$e$c;
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

    invoke-virtual {p0, v0}, LXh/a$e$c$b;->x(LXh/a$e$c;)LXh/a$e$c$b;

    :cond_1
    throw p1
.end method
