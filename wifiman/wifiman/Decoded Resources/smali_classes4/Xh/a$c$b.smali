.class public final LXh/a$c$b;
.super Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/protobuf/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LXh/a$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private b:I

.field private c:I

.field private d:I


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;-><init>()V

    invoke-direct {p0}, LXh/a$c$b;->t()V

    return-void
.end method

.method static synthetic k()LXh/a$c$b;
    .locals 1

    invoke-static {}, LXh/a$c$b;->r()LXh/a$c$b;

    move-result-object v0

    return-object v0
.end method

.method private static r()LXh/a$c$b;
    .locals 1

    new-instance v0, LXh/a$c$b;

    invoke-direct {v0}, LXh/a$c$b;-><init>()V

    return-object v0
.end method

.method private t()V
    .locals 0

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lkotlin/reflect/jvm/internal/impl/protobuf/n;
    .locals 1

    invoke-virtual {p0}, LXh/a$c$b;->o()LXh/a$c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b0(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/n$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, LXh/a$c$b;->w(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LXh/a$c$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LXh/a$c$b;->q()LXh/a$c$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic f(Lkotlin/reflect/jvm/internal/impl/protobuf/h;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;
    .locals 0

    check-cast p1, LXh/a$c;

    invoke-virtual {p0, p1}, LXh/a$c$b;->u(LXh/a$c;)LXh/a$c$b;

    move-result-object p1

    return-object p1
.end method

.method public o()LXh/a$c;
    .locals 2

    invoke-virtual {p0}, LXh/a$c$b;->p()LXh/a$c;

    move-result-object v0

    invoke-virtual {v0}, LXh/a$c;->m()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/a$a;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/n;)Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0
.end method

.method public p()LXh/a$c;
    .locals 4

    new-instance v0, LXh/a$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LXh/a$c;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;LXh/a$a;)V

    iget v1, p0, LXh/a$c$b;->b:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget v2, p0, LXh/a$c$b;->c:I

    invoke-static {v0, v2}, LXh/a$c;->C(LXh/a$c;I)I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_1

    or-int/lit8 v3, v3, 0x2

    :cond_1
    iget v1, p0, LXh/a$c$b;->d:I

    invoke-static {v0, v1}, LXh/a$c;->E(LXh/a$c;I)I

    invoke-static {v0, v3}, LXh/a$c;->F(LXh/a$c;I)I

    return-object v0
.end method

.method public q()LXh/a$c$b;
    .locals 2

    invoke-static {}, LXh/a$c$b;->r()LXh/a$c$b;

    move-result-object v0

    invoke-virtual {p0}, LXh/a$c$b;->p()LXh/a$c;

    move-result-object v1

    invoke-virtual {v0, v1}, LXh/a$c$b;->u(LXh/a$c;)LXh/a$c$b;

    move-result-object v0

    return-object v0
.end method

.method public u(LXh/a$c;)LXh/a$c$b;
    .locals 1

    invoke-static {}, LXh/a$c;->K()LXh/a$c;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p1}, LXh/a$c;->d0()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LXh/a$c;->S()I

    move-result v0

    invoke-virtual {p0, v0}, LXh/a$c$b;->z(I)LXh/a$c$b;

    :cond_1
    invoke-virtual {p1}, LXh/a$c;->T()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, LXh/a$c;->P()I

    move-result v0

    invoke-virtual {p0, v0}, LXh/a$c$b;->x(I)LXh/a$c$b;

    :cond_2
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->e()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object v0

    invoke-static {p1}, LXh/a$c;->J(LXh/a$c;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/d;->e(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->i(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;

    return-object p0
.end method

.method public w(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LXh/a$c$b;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, LXh/a$c;->i:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-interface {v1, p1, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/p;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LXh/a$c;
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, LXh/a$c$b;->u(LXh/a$c;)LXh/a$c$b;

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

    check-cast p2, LXh/a$c;
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

    invoke-virtual {p0, v0}, LXh/a$c$b;->u(LXh/a$c;)LXh/a$c$b;

    :cond_1
    throw p1
.end method

.method public x(I)LXh/a$c$b;
    .locals 1

    iget v0, p0, LXh/a$c$b;->b:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, LXh/a$c$b;->b:I

    iput p1, p0, LXh/a$c$b;->d:I

    return-object p0
.end method

.method public z(I)LXh/a$c$b;
    .locals 1

    iget v0, p0, LXh/a$c$b;->b:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, LXh/a$c$b;->b:I

    iput p1, p0, LXh/a$c$b;->c:I

    return-object p0
.end method
