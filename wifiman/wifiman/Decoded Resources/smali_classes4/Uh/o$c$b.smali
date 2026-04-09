.class public final LUh/o$c$b;
.super Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/protobuf/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUh/o$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private b:I

.field private c:I

.field private d:I

.field private e:LUh/o$c$c;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, LUh/o$c$b;->c:I

    sget-object v0, LUh/o$c$c;->PACKAGE:LUh/o$c$c;

    iput-object v0, p0, LUh/o$c$b;->e:LUh/o$c$c;

    invoke-direct {p0}, LUh/o$c$b;->t()V

    return-void
.end method

.method static synthetic k()LUh/o$c$b;
    .locals 1

    invoke-static {}, LUh/o$c$b;->r()LUh/o$c$b;

    move-result-object v0

    return-object v0
.end method

.method private static r()LUh/o$c$b;
    .locals 1

    new-instance v0, LUh/o$c$b;

    invoke-direct {v0}, LUh/o$c$b;-><init>()V

    return-object v0
.end method

.method private t()V
    .locals 0

    return-void
.end method


# virtual methods
.method public A(I)LUh/o$c$b;
    .locals 1

    iget v0, p0, LUh/o$c$b;->b:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, LUh/o$c$b;->b:I

    iput p1, p0, LUh/o$c$b;->d:I

    return-object p0
.end method

.method public bridge synthetic a()Lkotlin/reflect/jvm/internal/impl/protobuf/n;
    .locals 1

    invoke-virtual {p0}, LUh/o$c$b;->o()LUh/o$c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b0(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/n$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, LUh/o$c$b;->w(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/o$c$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LUh/o$c$b;->q()LUh/o$c$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic f(Lkotlin/reflect/jvm/internal/impl/protobuf/h;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;
    .locals 0

    check-cast p1, LUh/o$c;

    invoke-virtual {p0, p1}, LUh/o$c$b;->u(LUh/o$c;)LUh/o$c$b;

    move-result-object p1

    return-object p1
.end method

.method public o()LUh/o$c;
    .locals 2

    invoke-virtual {p0}, LUh/o$c$b;->p()LUh/o$c;

    move-result-object v0

    invoke-virtual {v0}, LUh/o$c;->m()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/a$a;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/n;)Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0
.end method

.method public p()LUh/o$c;
    .locals 5

    new-instance v0, LUh/o$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LUh/o$c;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;LUh/a;)V

    iget v1, p0, LUh/o$c$b;->b:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget v2, p0, LUh/o$c$b;->c:I

    invoke-static {v0, v2}, LUh/o$c;->K(LUh/o$c;I)I

    and-int/lit8 v2, v1, 0x2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    or-int/lit8 v3, v3, 0x2

    :cond_1
    iget v2, p0, LUh/o$c$b;->d:I

    invoke-static {v0, v2}, LUh/o$c;->C(LUh/o$c;I)I

    const/4 v2, 0x4

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_2

    or-int/lit8 v3, v3, 0x4

    :cond_2
    iget-object v1, p0, LUh/o$c$b;->e:LUh/o$c$c;

    invoke-static {v0, v1}, LUh/o$c;->E(LUh/o$c;LUh/o$c$c;)LUh/o$c$c;

    invoke-static {v0, v3}, LUh/o$c;->F(LUh/o$c;I)I

    return-object v0
.end method

.method public q()LUh/o$c$b;
    .locals 2

    invoke-static {}, LUh/o$c$b;->r()LUh/o$c$b;

    move-result-object v0

    invoke-virtual {p0}, LUh/o$c$b;->p()LUh/o$c;

    move-result-object v1

    invoke-virtual {v0, v1}, LUh/o$c$b;->u(LUh/o$c;)LUh/o$c$b;

    move-result-object v0

    return-object v0
.end method

.method public u(LUh/o$c;)LUh/o$c$b;
    .locals 1

    invoke-static {}, LUh/o$c;->P()LUh/o$c;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p1}, LUh/o$c;->q0()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LUh/o$c;->T()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/o$c$b;->z(I)LUh/o$c$b;

    :cond_1
    invoke-virtual {p1}, LUh/o$c;->C0()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, LUh/o$c;->d0()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/o$c$b;->A(I)LUh/o$c$b;

    :cond_2
    invoke-virtual {p1}, LUh/o$c;->f0()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, LUh/o$c;->S()LUh/o$c$c;

    move-result-object v0

    invoke-virtual {p0, v0}, LUh/o$c$b;->x(LUh/o$c$c;)LUh/o$c$b;

    :cond_3
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->e()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object v0

    invoke-static {p1}, LUh/o$c;->J(LUh/o$c;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/d;->e(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->i(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;

    return-object p0
.end method

.method public w(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/o$c$b;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, LUh/o$c;->j:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-interface {v1, p1, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/p;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LUh/o$c;
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, LUh/o$c$b;->u(LUh/o$c;)LUh/o$c$b;

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

    check-cast p2, LUh/o$c;
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

    invoke-virtual {p0, v0}, LUh/o$c$b;->u(LUh/o$c;)LUh/o$c$b;

    :cond_1
    throw p1
.end method

.method public x(LUh/o$c$c;)LUh/o$c$b;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, LUh/o$c$b;->b:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, LUh/o$c$b;->b:I

    iput-object p1, p0, LUh/o$c$b;->e:LUh/o$c$c;

    return-object p0
.end method

.method public z(I)LUh/o$c$b;
    .locals 1

    iget v0, p0, LUh/o$c$b;->b:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, LUh/o$c$b;->b:I

    iput p1, p0, LUh/o$c$b;->c:I

    return-object p0
.end method
