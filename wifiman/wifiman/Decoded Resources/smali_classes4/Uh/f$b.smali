.class public final LUh/f$b;
.super Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/protobuf/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUh/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private b:I

.field private c:LUh/f$c;

.field private d:Ljava/util/List;

.field private e:LUh/h;

.field private f:LUh/f$d;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;-><init>()V

    sget-object v0, LUh/f$c;->RETURNS_CONSTANT:LUh/f$c;

    iput-object v0, p0, LUh/f$b;->c:LUh/f$c;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/f$b;->d:Ljava/util/List;

    invoke-static {}, LUh/h;->K0()LUh/h;

    move-result-object v0

    iput-object v0, p0, LUh/f$b;->e:LUh/h;

    sget-object v0, LUh/f$d;->AT_MOST_ONCE:LUh/f$d;

    iput-object v0, p0, LUh/f$b;->f:LUh/f$d;

    invoke-direct {p0}, LUh/f$b;->u()V

    return-void
.end method

.method static synthetic k()LUh/f$b;
    .locals 1

    invoke-static {}, LUh/f$b;->r()LUh/f$b;

    move-result-object v0

    return-object v0
.end method

.method private static r()LUh/f$b;
    .locals 1

    new-instance v0, LUh/f$b;

    invoke-direct {v0}, LUh/f$b;-><init>()V

    return-object v0
.end method

.method private t()V
    .locals 3

    iget v0, p0, LUh/f$b;->b:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LUh/f$b;->d:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LUh/f$b;->d:Ljava/util/List;

    iget v0, p0, LUh/f$b;->b:I

    or-int/2addr v0, v1

    iput v0, p0, LUh/f$b;->b:I

    :cond_0
    return-void
.end method

.method private u()V
    .locals 0

    return-void
.end method


# virtual methods
.method public A(LUh/f$c;)LUh/f$b;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, LUh/f$b;->b:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, LUh/f$b;->b:I

    iput-object p1, p0, LUh/f$b;->c:LUh/f$c;

    return-object p0
.end method

.method public B(LUh/f$d;)LUh/f$b;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, LUh/f$b;->b:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, LUh/f$b;->b:I

    iput-object p1, p0, LUh/f$b;->f:LUh/f$d;

    return-object p0
.end method

.method public bridge synthetic a()Lkotlin/reflect/jvm/internal/impl/protobuf/n;
    .locals 1

    invoke-virtual {p0}, LUh/f$b;->o()LUh/f;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b0(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/n$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, LUh/f$b;->z(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/f$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LUh/f$b;->q()LUh/f$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic f(Lkotlin/reflect/jvm/internal/impl/protobuf/h;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;
    .locals 0

    check-cast p1, LUh/f;

    invoke-virtual {p0, p1}, LUh/f$b;->x(LUh/f;)LUh/f$b;

    move-result-object p1

    return-object p1
.end method

.method public o()LUh/f;
    .locals 2

    invoke-virtual {p0}, LUh/f$b;->p()LUh/f;

    move-result-object v0

    invoke-virtual {v0}, LUh/f;->m()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/a$a;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/n;)Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0
.end method

.method public p()LUh/f;
    .locals 5

    new-instance v0, LUh/f;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LUh/f;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;LUh/a;)V

    iget v1, p0, LUh/f$b;->b:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget-object v2, p0, LUh/f$b;->c:LUh/f$c;

    invoke-static {v0, v2}, LUh/f;->C(LUh/f;LUh/f$c;)LUh/f$c;

    iget v2, p0, LUh/f$b;->b:I

    const/4 v4, 0x2

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_1

    iget-object v2, p0, LUh/f$b;->d:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, LUh/f$b;->d:Ljava/util/List;

    iget v2, p0, LUh/f$b;->b:I

    and-int/lit8 v2, v2, -0x3

    iput v2, p0, LUh/f$b;->b:I

    :cond_1
    iget-object v2, p0, LUh/f$b;->d:Ljava/util/List;

    invoke-static {v0, v2}, LUh/f;->F(LUh/f;Ljava/util/List;)Ljava/util/List;

    and-int/lit8 v2, v1, 0x4

    const/4 v4, 0x4

    if-ne v2, v4, :cond_2

    or-int/lit8 v3, v3, 0x2

    :cond_2
    iget-object v2, p0, LUh/f$b;->e:LUh/h;

    invoke-static {v0, v2}, LUh/f;->J(LUh/f;LUh/h;)LUh/h;

    const/16 v2, 0x8

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_3

    or-int/lit8 v3, v3, 0x4

    :cond_3
    iget-object v1, p0, LUh/f$b;->f:LUh/f$d;

    invoke-static {v0, v1}, LUh/f;->K(LUh/f;LUh/f$d;)LUh/f$d;

    invoke-static {v0, v3}, LUh/f;->P(LUh/f;I)I

    return-object v0
.end method

.method public q()LUh/f$b;
    .locals 2

    invoke-static {}, LUh/f$b;->r()LUh/f$b;

    move-result-object v0

    invoke-virtual {p0}, LUh/f$b;->p()LUh/f;

    move-result-object v1

    invoke-virtual {v0, v1}, LUh/f$b;->x(LUh/f;)LUh/f$b;

    move-result-object v0

    return-object v0
.end method

.method public w(LUh/h;)LUh/f$b;
    .locals 3

    iget v0, p0, LUh/f$b;->b:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LUh/f$b;->e:LUh/h;

    invoke-static {}, LUh/h;->K0()LUh/h;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, LUh/f$b;->e:LUh/h;

    invoke-static {v0}, LUh/h;->d1(LUh/h;)LUh/h$b;

    move-result-object v0

    invoke-virtual {v0, p1}, LUh/h$b;->x(LUh/h;)LUh/h$b;

    move-result-object p1

    invoke-virtual {p1}, LUh/h$b;->p()LUh/h;

    move-result-object p1

    iput-object p1, p0, LUh/f$b;->e:LUh/h;

    goto :goto_0

    :cond_0
    iput-object p1, p0, LUh/f$b;->e:LUh/h;

    :goto_0
    iget p1, p0, LUh/f$b;->b:I

    or-int/2addr p1, v1

    iput p1, p0, LUh/f$b;->b:I

    return-object p0
.end method

.method public x(LUh/f;)LUh/f$b;
    .locals 2

    invoke-static {}, LUh/f;->d0()LUh/f;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p1}, LUh/f;->K0()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LUh/f;->C0()LUh/f$c;

    move-result-object v0

    invoke-virtual {p0, v0}, LUh/f$b;->A(LUh/f$c;)LUh/f$b;

    :cond_1
    invoke-static {p1}, LUh/f;->E(LUh/f;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, LUh/f$b;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p1}, LUh/f;->E(LUh/f;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/f$b;->d:Ljava/util/List;

    iget v0, p0, LUh/f$b;->b:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, LUh/f$b;->b:I

    goto :goto_0

    :cond_2
    invoke-direct {p0}, LUh/f$b;->t()V

    iget-object v0, p0, LUh/f$b;->d:Ljava/util/List;

    invoke-static {p1}, LUh/f;->E(LUh/f;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_3
    :goto_0
    invoke-virtual {p1}, LUh/f;->G0()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, LUh/f;->T()LUh/h;

    move-result-object v0

    invoke-virtual {p0, v0}, LUh/f$b;->w(LUh/h;)LUh/f$b;

    :cond_4
    invoke-virtual {p1}, LUh/f;->M0()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, LUh/f;->E0()LUh/f$d;

    move-result-object v0

    invoke-virtual {p0, v0}, LUh/f$b;->B(LUh/f$d;)LUh/f$b;

    :cond_5
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->e()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object v0

    invoke-static {p1}, LUh/f;->S(LUh/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/d;->e(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->i(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;

    return-object p0
.end method

.method public z(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/f$b;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, LUh/f;->k:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-interface {v1, p1, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/p;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LUh/f;
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, LUh/f$b;->x(LUh/f;)LUh/f$b;

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

    check-cast p2, LUh/f;
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

    invoke-virtual {p0, v0}, LUh/f$b;->x(LUh/f;)LUh/f$b;

    :cond_1
    throw p1
.end method
