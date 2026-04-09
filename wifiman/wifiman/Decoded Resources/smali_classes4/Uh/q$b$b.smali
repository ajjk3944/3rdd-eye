.class public final LUh/q$b$b;
.super Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/protobuf/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUh/q$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private b:I

.field private c:LUh/q$b$c;

.field private d:LUh/q;

.field private e:I


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;-><init>()V

    sget-object v0, LUh/q$b$c;->INV:LUh/q$b$c;

    iput-object v0, p0, LUh/q$b$b;->c:LUh/q$b$c;

    invoke-static {}, LUh/q;->h1()LUh/q;

    move-result-object v0

    iput-object v0, p0, LUh/q$b$b;->d:LUh/q;

    invoke-direct {p0}, LUh/q$b$b;->t()V

    return-void
.end method

.method static synthetic k()LUh/q$b$b;
    .locals 1

    invoke-static {}, LUh/q$b$b;->r()LUh/q$b$b;

    move-result-object v0

    return-object v0
.end method

.method private static r()LUh/q$b$b;
    .locals 1

    new-instance v0, LUh/q$b$b;

    invoke-direct {v0}, LUh/q$b$b;-><init>()V

    return-object v0
.end method

.method private t()V
    .locals 0

    return-void
.end method


# virtual methods
.method public A(I)LUh/q$b$b;
    .locals 1

    iget v0, p0, LUh/q$b$b;->b:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, LUh/q$b$b;->b:I

    iput p1, p0, LUh/q$b$b;->e:I

    return-object p0
.end method

.method public bridge synthetic a()Lkotlin/reflect/jvm/internal/impl/protobuf/n;
    .locals 1

    invoke-virtual {p0}, LUh/q$b$b;->o()LUh/q$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b0(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/n$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, LUh/q$b$b;->w(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/q$b$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LUh/q$b$b;->q()LUh/q$b$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic f(Lkotlin/reflect/jvm/internal/impl/protobuf/h;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;
    .locals 0

    check-cast p1, LUh/q$b;

    invoke-virtual {p0, p1}, LUh/q$b$b;->u(LUh/q$b;)LUh/q$b$b;

    move-result-object p1

    return-object p1
.end method

.method public o()LUh/q$b;
    .locals 2

    invoke-virtual {p0}, LUh/q$b$b;->p()LUh/q$b;

    move-result-object v0

    invoke-virtual {v0}, LUh/q$b;->m()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/a$a;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/n;)Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0
.end method

.method public p()LUh/q$b;
    .locals 5

    new-instance v0, LUh/q$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LUh/q$b;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;LUh/a;)V

    iget v1, p0, LUh/q$b$b;->b:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget-object v2, p0, LUh/q$b$b;->c:LUh/q$b$c;

    invoke-static {v0, v2}, LUh/q$b;->C(LUh/q$b;LUh/q$b$c;)LUh/q$b$c;

    and-int/lit8 v2, v1, 0x2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    or-int/lit8 v3, v3, 0x2

    :cond_1
    iget-object v2, p0, LUh/q$b$b;->d:LUh/q;

    invoke-static {v0, v2}, LUh/q$b;->E(LUh/q$b;LUh/q;)LUh/q;

    const/4 v2, 0x4

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_2

    or-int/lit8 v3, v3, 0x4

    :cond_2
    iget v1, p0, LUh/q$b$b;->e:I

    invoke-static {v0, v1}, LUh/q$b;->F(LUh/q$b;I)I

    invoke-static {v0, v3}, LUh/q$b;->J(LUh/q$b;I)I

    return-object v0
.end method

.method public q()LUh/q$b$b;
    .locals 2

    invoke-static {}, LUh/q$b$b;->r()LUh/q$b$b;

    move-result-object v0

    invoke-virtual {p0}, LUh/q$b$b;->p()LUh/q$b;

    move-result-object v1

    invoke-virtual {v0, v1}, LUh/q$b$b;->u(LUh/q$b;)LUh/q$b$b;

    move-result-object v0

    return-object v0
.end method

.method public u(LUh/q$b;)LUh/q$b$b;
    .locals 1

    invoke-static {}, LUh/q$b;->P()LUh/q$b;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p1}, LUh/q$b;->f0()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LUh/q$b;->S()LUh/q$b$c;

    move-result-object v0

    invoke-virtual {p0, v0}, LUh/q$b$b;->z(LUh/q$b$c;)LUh/q$b$b;

    :cond_1
    invoke-virtual {p1}, LUh/q$b;->q0()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, LUh/q$b;->T()LUh/q;

    move-result-object v0

    invoke-virtual {p0, v0}, LUh/q$b$b;->x(LUh/q;)LUh/q$b$b;

    :cond_2
    invoke-virtual {p1}, LUh/q$b;->C0()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, LUh/q$b;->d0()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/q$b$b;->A(I)LUh/q$b$b;

    :cond_3
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->e()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object v0

    invoke-static {p1}, LUh/q$b;->K(LUh/q$b;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/d;->e(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->i(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;

    return-object p0
.end method

.method public w(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/q$b$b;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, LUh/q$b;->j:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-interface {v1, p1, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/p;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LUh/q$b;
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, LUh/q$b$b;->u(LUh/q$b;)LUh/q$b$b;

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

    check-cast p2, LUh/q$b;
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

    invoke-virtual {p0, v0}, LUh/q$b$b;->u(LUh/q$b;)LUh/q$b$b;

    :cond_1
    throw p1
.end method

.method public x(LUh/q;)LUh/q$b$b;
    .locals 3

    iget v0, p0, LUh/q$b$b;->b:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LUh/q$b$b;->d:LUh/q;

    invoke-static {}, LUh/q;->h1()LUh/q;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, LUh/q$b$b;->d:LUh/q;

    invoke-static {v0}, LUh/q;->I1(LUh/q;)LUh/q$c;

    move-result-object v0

    invoke-virtual {v0, p1}, LUh/q$c;->E(LUh/q;)LUh/q$c;

    move-result-object p1

    invoke-virtual {p1}, LUh/q$c;->u()LUh/q;

    move-result-object p1

    iput-object p1, p0, LUh/q$b$b;->d:LUh/q;

    goto :goto_0

    :cond_0
    iput-object p1, p0, LUh/q$b$b;->d:LUh/q;

    :goto_0
    iget p1, p0, LUh/q$b$b;->b:I

    or-int/2addr p1, v1

    iput p1, p0, LUh/q$b$b;->b:I

    return-object p0
.end method

.method public z(LUh/q$b$c;)LUh/q$b$b;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, LUh/q$b$b;->b:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, LUh/q$b$b;->b:I

    iput-object p1, p0, LUh/q$b$b;->c:LUh/q$b$c;

    return-object p0
.end method
