.class public final LUh/v$b;
.super Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/protobuf/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUh/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private b:I

.field private c:I

.field private d:I

.field private e:LUh/v$c;

.field private f:I

.field private g:I

.field private h:LUh/v$d;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;-><init>()V

    sget-object v0, LUh/v$c;->ERROR:LUh/v$c;

    iput-object v0, p0, LUh/v$b;->e:LUh/v$c;

    sget-object v0, LUh/v$d;->LANGUAGE_VERSION:LUh/v$d;

    iput-object v0, p0, LUh/v$b;->h:LUh/v$d;

    invoke-direct {p0}, LUh/v$b;->t()V

    return-void
.end method

.method static synthetic k()LUh/v$b;
    .locals 1

    invoke-static {}, LUh/v$b;->r()LUh/v$b;

    move-result-object v0

    return-object v0
.end method

.method private static r()LUh/v$b;
    .locals 1

    new-instance v0, LUh/v$b;

    invoke-direct {v0}, LUh/v$b;-><init>()V

    return-object v0
.end method

.method private t()V
    .locals 0

    return-void
.end method


# virtual methods
.method public A(I)LUh/v$b;
    .locals 1

    iget v0, p0, LUh/v$b;->b:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, LUh/v$b;->b:I

    iput p1, p0, LUh/v$b;->g:I

    return-object p0
.end method

.method public B(I)LUh/v$b;
    .locals 1

    iget v0, p0, LUh/v$b;->b:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, LUh/v$b;->b:I

    iput p1, p0, LUh/v$b;->c:I

    return-object p0
.end method

.method public D(I)LUh/v$b;
    .locals 1

    iget v0, p0, LUh/v$b;->b:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, LUh/v$b;->b:I

    iput p1, p0, LUh/v$b;->d:I

    return-object p0
.end method

.method public E(LUh/v$d;)LUh/v$b;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, LUh/v$b;->b:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, LUh/v$b;->b:I

    iput-object p1, p0, LUh/v$b;->h:LUh/v$d;

    return-object p0
.end method

.method public bridge synthetic a()Lkotlin/reflect/jvm/internal/impl/protobuf/n;
    .locals 1

    invoke-virtual {p0}, LUh/v$b;->o()LUh/v;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b0(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/n$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, LUh/v$b;->w(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/v$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LUh/v$b;->q()LUh/v$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic f(Lkotlin/reflect/jvm/internal/impl/protobuf/h;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;
    .locals 0

    check-cast p1, LUh/v;

    invoke-virtual {p0, p1}, LUh/v$b;->u(LUh/v;)LUh/v$b;

    move-result-object p1

    return-object p1
.end method

.method public o()LUh/v;
    .locals 2

    invoke-virtual {p0}, LUh/v$b;->p()LUh/v;

    move-result-object v0

    invoke-virtual {v0}, LUh/v;->m()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/a$a;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/n;)Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0
.end method

.method public p()LUh/v;
    .locals 5

    new-instance v0, LUh/v;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LUh/v;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;LUh/a;)V

    iget v1, p0, LUh/v$b;->b:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget v2, p0, LUh/v$b;->c:I

    invoke-static {v0, v2}, LUh/v;->C(LUh/v;I)I

    and-int/lit8 v2, v1, 0x2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    or-int/lit8 v3, v3, 0x2

    :cond_1
    iget v2, p0, LUh/v$b;->d:I

    invoke-static {v0, v2}, LUh/v;->E(LUh/v;I)I

    and-int/lit8 v2, v1, 0x4

    const/4 v4, 0x4

    if-ne v2, v4, :cond_2

    or-int/lit8 v3, v3, 0x4

    :cond_2
    iget-object v2, p0, LUh/v$b;->e:LUh/v$c;

    invoke-static {v0, v2}, LUh/v;->F(LUh/v;LUh/v$c;)LUh/v$c;

    and-int/lit8 v2, v1, 0x8

    const/16 v4, 0x8

    if-ne v2, v4, :cond_3

    or-int/lit8 v3, v3, 0x8

    :cond_3
    iget v2, p0, LUh/v$b;->f:I

    invoke-static {v0, v2}, LUh/v;->J(LUh/v;I)I

    and-int/lit8 v2, v1, 0x10

    const/16 v4, 0x10

    if-ne v2, v4, :cond_4

    or-int/lit8 v3, v3, 0x10

    :cond_4
    iget v2, p0, LUh/v$b;->g:I

    invoke-static {v0, v2}, LUh/v;->K(LUh/v;I)I

    const/16 v2, 0x20

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_5

    or-int/lit8 v3, v3, 0x20

    :cond_5
    iget-object v1, p0, LUh/v$b;->h:LUh/v$d;

    invoke-static {v0, v1}, LUh/v;->P(LUh/v;LUh/v$d;)LUh/v$d;

    invoke-static {v0, v3}, LUh/v;->S(LUh/v;I)I

    return-object v0
.end method

.method public q()LUh/v$b;
    .locals 2

    invoke-static {}, LUh/v$b;->r()LUh/v$b;

    move-result-object v0

    invoke-virtual {p0}, LUh/v$b;->p()LUh/v;

    move-result-object v1

    invoke-virtual {v0, v1}, LUh/v$b;->u(LUh/v;)LUh/v$b;

    move-result-object v0

    return-object v0
.end method

.method public u(LUh/v;)LUh/v$b;
    .locals 1

    invoke-static {}, LUh/v;->d0()LUh/v;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p1}, LUh/v;->P0()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LUh/v;->getVersion()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/v$b;->B(I)LUh/v$b;

    :cond_1
    invoke-virtual {p1}, LUh/v;->T0()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, LUh/v;->E0()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/v$b;->D(I)LUh/v$b;

    :cond_2
    invoke-virtual {p1}, LUh/v;->M0()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, LUh/v;->q0()LUh/v$c;

    move-result-object v0

    invoke-virtual {p0, v0}, LUh/v$b;->z(LUh/v$c;)LUh/v$b;

    :cond_3
    invoke-virtual {p1}, LUh/v;->K0()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, LUh/v;->f0()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/v$b;->x(I)LUh/v$b;

    :cond_4
    invoke-virtual {p1}, LUh/v;->N0()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, LUh/v;->C0()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/v$b;->A(I)LUh/v$b;

    :cond_5
    invoke-virtual {p1}, LUh/v;->U0()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p1}, LUh/v;->G0()LUh/v$d;

    move-result-object v0

    invoke-virtual {p0, v0}, LUh/v$b;->E(LUh/v$d;)LUh/v$b;

    :cond_6
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->e()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object v0

    invoke-static {p1}, LUh/v;->T(LUh/v;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/d;->e(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->i(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;

    return-object p0
.end method

.method public w(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/v$b;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, LUh/v;->m:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-interface {v1, p1, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/p;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LUh/v;
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, LUh/v$b;->u(LUh/v;)LUh/v$b;

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

    check-cast p2, LUh/v;
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

    invoke-virtual {p0, v0}, LUh/v$b;->u(LUh/v;)LUh/v$b;

    :cond_1
    throw p1
.end method

.method public x(I)LUh/v$b;
    .locals 1

    iget v0, p0, LUh/v$b;->b:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, LUh/v$b;->b:I

    iput p1, p0, LUh/v$b;->f:I

    return-object p0
.end method

.method public z(LUh/v$c;)LUh/v$b;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, LUh/v$b;->b:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, LUh/v$b;->b:I

    iput-object p1, p0, LUh/v$b;->e:LUh/v$c;

    return-object p0
.end method
