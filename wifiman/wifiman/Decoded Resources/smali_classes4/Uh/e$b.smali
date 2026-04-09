.class public final LUh/e$b;
.super Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/protobuf/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUh/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private b:I

.field private c:Ljava/util/List;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/e$b;->c:Ljava/util/List;

    invoke-direct {p0}, LUh/e$b;->u()V

    return-void
.end method

.method static synthetic k()LUh/e$b;
    .locals 1

    invoke-static {}, LUh/e$b;->r()LUh/e$b;

    move-result-object v0

    return-object v0
.end method

.method private static r()LUh/e$b;
    .locals 1

    new-instance v0, LUh/e$b;

    invoke-direct {v0}, LUh/e$b;-><init>()V

    return-object v0
.end method

.method private t()V
    .locals 3

    iget v0, p0, LUh/e$b;->b:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LUh/e$b;->c:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LUh/e$b;->c:Ljava/util/List;

    iget v0, p0, LUh/e$b;->b:I

    or-int/2addr v0, v1

    iput v0, p0, LUh/e$b;->b:I

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

    invoke-virtual {p0}, LUh/e$b;->o()LUh/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b0(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/n$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, LUh/e$b;->x(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/e$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LUh/e$b;->q()LUh/e$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic f(Lkotlin/reflect/jvm/internal/impl/protobuf/h;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;
    .locals 0

    check-cast p1, LUh/e;

    invoke-virtual {p0, p1}, LUh/e$b;->w(LUh/e;)LUh/e$b;

    move-result-object p1

    return-object p1
.end method

.method public o()LUh/e;
    .locals 2

    invoke-virtual {p0}, LUh/e$b;->p()LUh/e;

    move-result-object v0

    invoke-virtual {v0}, LUh/e;->m()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/a$a;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/n;)Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0
.end method

.method public p()LUh/e;
    .locals 3

    new-instance v0, LUh/e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LUh/e;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;LUh/a;)V

    iget v1, p0, LUh/e$b;->b:I

    const/4 v2, 0x1

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_0

    iget-object v1, p0, LUh/e$b;->c:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, LUh/e$b;->c:Ljava/util/List;

    iget v1, p0, LUh/e$b;->b:I

    and-int/lit8 v1, v1, -0x2

    iput v1, p0, LUh/e$b;->b:I

    :cond_0
    iget-object v1, p0, LUh/e$b;->c:Ljava/util/List;

    invoke-static {v0, v1}, LUh/e;->E(LUh/e;Ljava/util/List;)Ljava/util/List;

    return-object v0
.end method

.method public q()LUh/e$b;
    .locals 2

    invoke-static {}, LUh/e$b;->r()LUh/e$b;

    move-result-object v0

    invoke-virtual {p0}, LUh/e$b;->p()LUh/e;

    move-result-object v1

    invoke-virtual {v0, v1}, LUh/e$b;->w(LUh/e;)LUh/e$b;

    move-result-object v0

    return-object v0
.end method

.method public w(LUh/e;)LUh/e$b;
    .locals 2

    invoke-static {}, LUh/e;->J()LUh/e;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-static {p1}, LUh/e;->C(LUh/e;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, LUh/e$b;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, LUh/e;->C(LUh/e;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/e$b;->c:Ljava/util/List;

    iget v0, p0, LUh/e$b;->b:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, LUh/e$b;->b:I

    goto :goto_0

    :cond_1
    invoke-direct {p0}, LUh/e$b;->t()V

    iget-object v0, p0, LUh/e$b;->c:Ljava/util/List;

    invoke-static {p1}, LUh/e;->C(LUh/e;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_2
    :goto_0
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->e()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object v0

    invoke-static {p1}, LUh/e;->F(LUh/e;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/d;->e(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->i(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;

    return-object p0
.end method

.method public x(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/e$b;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, LUh/e;->g:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-interface {v1, p1, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/p;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LUh/e;
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, LUh/e$b;->w(LUh/e;)LUh/e$b;

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

    check-cast p2, LUh/e;
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

    invoke-virtual {p0, v0}, LUh/e$b;->w(LUh/e;)LUh/e$b;

    :cond_1
    throw p1
.end method
