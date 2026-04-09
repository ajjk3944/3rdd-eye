.class public final LUh/p$b;
.super Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/protobuf/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUh/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private b:I

.field private c:Lkotlin/reflect/jvm/internal/impl/protobuf/l;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;-><init>()V

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/protobuf/k;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/l;

    iput-object v0, p0, LUh/p$b;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/l;

    invoke-direct {p0}, LUh/p$b;->u()V

    return-void
.end method

.method static synthetic k()LUh/p$b;
    .locals 1

    invoke-static {}, LUh/p$b;->r()LUh/p$b;

    move-result-object v0

    return-object v0
.end method

.method private static r()LUh/p$b;
    .locals 1

    new-instance v0, LUh/p$b;

    invoke-direct {v0}, LUh/p$b;-><init>()V

    return-object v0
.end method

.method private t()V
    .locals 3

    iget v0, p0, LUh/p$b;->b:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/protobuf/k;

    iget-object v2, p0, LUh/p$b;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/l;

    invoke-direct {v0, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/k;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/l;)V

    iput-object v0, p0, LUh/p$b;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/l;

    iget v0, p0, LUh/p$b;->b:I

    or-int/2addr v0, v1

    iput v0, p0, LUh/p$b;->b:I

    :cond_0
    return-void
.end method

.method private u()V
    .locals 0

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lkotlin/reflect/jvm/internal/impl/protobuf/n;
    .locals 1

    invoke-virtual {p0}, LUh/p$b;->o()LUh/p;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b0(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/n$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, LUh/p$b;->x(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/p$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LUh/p$b;->q()LUh/p$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic f(Lkotlin/reflect/jvm/internal/impl/protobuf/h;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;
    .locals 0

    check-cast p1, LUh/p;

    invoke-virtual {p0, p1}, LUh/p$b;->w(LUh/p;)LUh/p$b;

    move-result-object p1

    return-object p1
.end method

.method public o()LUh/p;
    .locals 2

    invoke-virtual {p0}, LUh/p$b;->p()LUh/p;

    move-result-object v0

    invoke-virtual {v0}, LUh/p;->m()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/a$a;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/n;)Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0
.end method

.method public p()LUh/p;
    .locals 3

    new-instance v0, LUh/p;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LUh/p;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;LUh/a;)V

    iget v1, p0, LUh/p$b;->b:I

    const/4 v2, 0x1

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_0

    iget-object v1, p0, LUh/p$b;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/l;

    invoke-interface {v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/l;->h()Lkotlin/reflect/jvm/internal/impl/protobuf/l;

    move-result-object v1

    iput-object v1, p0, LUh/p$b;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/l;

    iget v1, p0, LUh/p$b;->b:I

    and-int/lit8 v1, v1, -0x2

    iput v1, p0, LUh/p$b;->b:I

    :cond_0
    iget-object v1, p0, LUh/p$b;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/l;

    invoke-static {v0, v1}, LUh/p;->E(LUh/p;Lkotlin/reflect/jvm/internal/impl/protobuf/l;)Lkotlin/reflect/jvm/internal/impl/protobuf/l;

    return-object v0
.end method

.method public q()LUh/p$b;
    .locals 2

    invoke-static {}, LUh/p$b;->r()LUh/p$b;

    move-result-object v0

    invoke-virtual {p0}, LUh/p$b;->p()LUh/p;

    move-result-object v1

    invoke-virtual {v0, v1}, LUh/p$b;->w(LUh/p;)LUh/p$b;

    move-result-object v0

    return-object v0
.end method

.method public w(LUh/p;)LUh/p$b;
    .locals 2

    invoke-static {}, LUh/p;->J()LUh/p;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-static {p1}, LUh/p;->C(LUh/p;)Lkotlin/reflect/jvm/internal/impl/protobuf/l;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, LUh/p$b;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/l;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, LUh/p;->C(LUh/p;)Lkotlin/reflect/jvm/internal/impl/protobuf/l;

    move-result-object v0

    iput-object v0, p0, LUh/p$b;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/l;

    iget v0, p0, LUh/p$b;->b:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, LUh/p$b;->b:I

    goto :goto_0

    :cond_1
    invoke-direct {p0}, LUh/p$b;->t()V

    iget-object v0, p0, LUh/p$b;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/l;

    invoke-static {p1}, LUh/p;->C(LUh/p;)Lkotlin/reflect/jvm/internal/impl/protobuf/l;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_2
    :goto_0
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->e()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object v0

    invoke-static {p1}, LUh/p;->F(LUh/p;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/d;->e(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->i(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;

    return-object p0
.end method

.method public x(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/p$b;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, LUh/p;->g:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-interface {v1, p1, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/p;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LUh/p;
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, LUh/p$b;->w(LUh/p;)LUh/p$b;

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

    check-cast p2, LUh/p;
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

    invoke-virtual {p0, v0}, LUh/p$b;->w(LUh/p;)LUh/p$b;

    :cond_1
    throw p1
.end method
