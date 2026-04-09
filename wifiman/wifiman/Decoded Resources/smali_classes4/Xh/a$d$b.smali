.class public final LXh/a$d$b;
.super Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/protobuf/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LXh/a$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private b:I

.field private c:LXh/a$b;

.field private d:LXh/a$c;

.field private e:LXh/a$c;

.field private f:LXh/a$c;

.field private g:LXh/a$c;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;-><init>()V

    invoke-static {}, LXh/a$b;->K()LXh/a$b;

    move-result-object v0

    iput-object v0, p0, LXh/a$d$b;->c:LXh/a$b;

    invoke-static {}, LXh/a$c;->K()LXh/a$c;

    move-result-object v0

    iput-object v0, p0, LXh/a$d$b;->d:LXh/a$c;

    invoke-static {}, LXh/a$c;->K()LXh/a$c;

    move-result-object v0

    iput-object v0, p0, LXh/a$d$b;->e:LXh/a$c;

    invoke-static {}, LXh/a$c;->K()LXh/a$c;

    move-result-object v0

    iput-object v0, p0, LXh/a$d$b;->f:LXh/a$c;

    invoke-static {}, LXh/a$c;->K()LXh/a$c;

    move-result-object v0

    iput-object v0, p0, LXh/a$d$b;->g:LXh/a$c;

    invoke-direct {p0}, LXh/a$d$b;->t()V

    return-void
.end method

.method static synthetic k()LXh/a$d$b;
    .locals 1

    invoke-static {}, LXh/a$d$b;->r()LXh/a$d$b;

    move-result-object v0

    return-object v0
.end method

.method private static r()LXh/a$d$b;
    .locals 1

    new-instance v0, LXh/a$d$b;

    invoke-direct {v0}, LXh/a$d$b;-><init>()V

    return-object v0
.end method

.method private t()V
    .locals 0

    return-void
.end method


# virtual methods
.method public A(LXh/a$c;)LXh/a$d$b;
    .locals 3

    iget v0, p0, LXh/a$d$b;->b:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LXh/a$d$b;->e:LXh/a$c;

    invoke-static {}, LXh/a$c;->K()LXh/a$c;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, LXh/a$d$b;->e:LXh/a$c;

    invoke-static {v0}, LXh/a$c;->C0(LXh/a$c;)LXh/a$c$b;

    move-result-object v0

    invoke-virtual {v0, p1}, LXh/a$c$b;->u(LXh/a$c;)LXh/a$c$b;

    move-result-object p1

    invoke-virtual {p1}, LXh/a$c$b;->p()LXh/a$c;

    move-result-object p1

    iput-object p1, p0, LXh/a$d$b;->e:LXh/a$c;

    goto :goto_0

    :cond_0
    iput-object p1, p0, LXh/a$d$b;->e:LXh/a$c;

    :goto_0
    iget p1, p0, LXh/a$d$b;->b:I

    or-int/2addr p1, v1

    iput p1, p0, LXh/a$d$b;->b:I

    return-object p0
.end method

.method public B(LXh/a$c;)LXh/a$d$b;
    .locals 3

    iget v0, p0, LXh/a$d$b;->b:I

    const/16 v1, 0x8

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LXh/a$d$b;->f:LXh/a$c;

    invoke-static {}, LXh/a$c;->K()LXh/a$c;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, LXh/a$d$b;->f:LXh/a$c;

    invoke-static {v0}, LXh/a$c;->C0(LXh/a$c;)LXh/a$c$b;

    move-result-object v0

    invoke-virtual {v0, p1}, LXh/a$c$b;->u(LXh/a$c;)LXh/a$c$b;

    move-result-object p1

    invoke-virtual {p1}, LXh/a$c$b;->p()LXh/a$c;

    move-result-object p1

    iput-object p1, p0, LXh/a$d$b;->f:LXh/a$c;

    goto :goto_0

    :cond_0
    iput-object p1, p0, LXh/a$d$b;->f:LXh/a$c;

    :goto_0
    iget p1, p0, LXh/a$d$b;->b:I

    or-int/2addr p1, v1

    iput p1, p0, LXh/a$d$b;->b:I

    return-object p0
.end method

.method public D(LXh/a$c;)LXh/a$d$b;
    .locals 3

    iget v0, p0, LXh/a$d$b;->b:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LXh/a$d$b;->d:LXh/a$c;

    invoke-static {}, LXh/a$c;->K()LXh/a$c;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, LXh/a$d$b;->d:LXh/a$c;

    invoke-static {v0}, LXh/a$c;->C0(LXh/a$c;)LXh/a$c$b;

    move-result-object v0

    invoke-virtual {v0, p1}, LXh/a$c$b;->u(LXh/a$c;)LXh/a$c$b;

    move-result-object p1

    invoke-virtual {p1}, LXh/a$c$b;->p()LXh/a$c;

    move-result-object p1

    iput-object p1, p0, LXh/a$d$b;->d:LXh/a$c;

    goto :goto_0

    :cond_0
    iput-object p1, p0, LXh/a$d$b;->d:LXh/a$c;

    :goto_0
    iget p1, p0, LXh/a$d$b;->b:I

    or-int/2addr p1, v1

    iput p1, p0, LXh/a$d$b;->b:I

    return-object p0
.end method

.method public bridge synthetic a()Lkotlin/reflect/jvm/internal/impl/protobuf/n;
    .locals 1

    invoke-virtual {p0}, LXh/a$d$b;->o()LXh/a$d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b0(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/n$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, LXh/a$d$b;->z(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LXh/a$d$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LXh/a$d$b;->q()LXh/a$d$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic f(Lkotlin/reflect/jvm/internal/impl/protobuf/h;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;
    .locals 0

    check-cast p1, LXh/a$d;

    invoke-virtual {p0, p1}, LXh/a$d$b;->x(LXh/a$d;)LXh/a$d$b;

    move-result-object p1

    return-object p1
.end method

.method public o()LXh/a$d;
    .locals 2

    invoke-virtual {p0}, LXh/a$d$b;->p()LXh/a$d;

    move-result-object v0

    invoke-virtual {v0}, LXh/a$d;->m()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/a$a;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/n;)Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0
.end method

.method public p()LXh/a$d;
    .locals 5

    new-instance v0, LXh/a$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LXh/a$d;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;LXh/a$a;)V

    iget v1, p0, LXh/a$d$b;->b:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget-object v2, p0, LXh/a$d$b;->c:LXh/a$b;

    invoke-static {v0, v2}, LXh/a$d;->C(LXh/a$d;LXh/a$b;)LXh/a$b;

    and-int/lit8 v2, v1, 0x2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    or-int/lit8 v3, v3, 0x2

    :cond_1
    iget-object v2, p0, LXh/a$d$b;->d:LXh/a$c;

    invoke-static {v0, v2}, LXh/a$d;->E(LXh/a$d;LXh/a$c;)LXh/a$c;

    and-int/lit8 v2, v1, 0x4

    const/4 v4, 0x4

    if-ne v2, v4, :cond_2

    or-int/lit8 v3, v3, 0x4

    :cond_2
    iget-object v2, p0, LXh/a$d$b;->e:LXh/a$c;

    invoke-static {v0, v2}, LXh/a$d;->F(LXh/a$d;LXh/a$c;)LXh/a$c;

    and-int/lit8 v2, v1, 0x8

    const/16 v4, 0x8

    if-ne v2, v4, :cond_3

    or-int/lit8 v3, v3, 0x8

    :cond_3
    iget-object v2, p0, LXh/a$d$b;->f:LXh/a$c;

    invoke-static {v0, v2}, LXh/a$d;->J(LXh/a$d;LXh/a$c;)LXh/a$c;

    const/16 v2, 0x10

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_4

    or-int/lit8 v3, v3, 0x10

    :cond_4
    iget-object v1, p0, LXh/a$d$b;->g:LXh/a$c;

    invoke-static {v0, v1}, LXh/a$d;->K(LXh/a$d;LXh/a$c;)LXh/a$c;

    invoke-static {v0, v3}, LXh/a$d;->P(LXh/a$d;I)I

    return-object v0
.end method

.method public q()LXh/a$d$b;
    .locals 2

    invoke-static {}, LXh/a$d$b;->r()LXh/a$d$b;

    move-result-object v0

    invoke-virtual {p0}, LXh/a$d$b;->p()LXh/a$d;

    move-result-object v1

    invoke-virtual {v0, v1}, LXh/a$d$b;->x(LXh/a$d;)LXh/a$d$b;

    move-result-object v0

    return-object v0
.end method

.method public u(LXh/a$c;)LXh/a$d$b;
    .locals 3

    iget v0, p0, LXh/a$d$b;->b:I

    const/16 v1, 0x10

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LXh/a$d$b;->g:LXh/a$c;

    invoke-static {}, LXh/a$c;->K()LXh/a$c;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, LXh/a$d$b;->g:LXh/a$c;

    invoke-static {v0}, LXh/a$c;->C0(LXh/a$c;)LXh/a$c$b;

    move-result-object v0

    invoke-virtual {v0, p1}, LXh/a$c$b;->u(LXh/a$c;)LXh/a$c$b;

    move-result-object p1

    invoke-virtual {p1}, LXh/a$c$b;->p()LXh/a$c;

    move-result-object p1

    iput-object p1, p0, LXh/a$d$b;->g:LXh/a$c;

    goto :goto_0

    :cond_0
    iput-object p1, p0, LXh/a$d$b;->g:LXh/a$c;

    :goto_0
    iget p1, p0, LXh/a$d$b;->b:I

    or-int/2addr p1, v1

    iput p1, p0, LXh/a$d$b;->b:I

    return-object p0
.end method

.method public w(LXh/a$b;)LXh/a$d$b;
    .locals 3

    iget v0, p0, LXh/a$d$b;->b:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LXh/a$d$b;->c:LXh/a$b;

    invoke-static {}, LXh/a$b;->K()LXh/a$b;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, LXh/a$d$b;->c:LXh/a$b;

    invoke-static {v0}, LXh/a$b;->C0(LXh/a$b;)LXh/a$b$b;

    move-result-object v0

    invoke-virtual {v0, p1}, LXh/a$b$b;->u(LXh/a$b;)LXh/a$b$b;

    move-result-object p1

    invoke-virtual {p1}, LXh/a$b$b;->p()LXh/a$b;

    move-result-object p1

    iput-object p1, p0, LXh/a$d$b;->c:LXh/a$b;

    goto :goto_0

    :cond_0
    iput-object p1, p0, LXh/a$d$b;->c:LXh/a$b;

    :goto_0
    iget p1, p0, LXh/a$d$b;->b:I

    or-int/2addr p1, v1

    iput p1, p0, LXh/a$d$b;->b:I

    return-object p0
.end method

.method public x(LXh/a$d;)LXh/a$d$b;
    .locals 1

    invoke-static {}, LXh/a$d;->T()LXh/a$d;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p1}, LXh/a$d;->K0()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LXh/a$d;->f0()LXh/a$b;

    move-result-object v0

    invoke-virtual {p0, v0}, LXh/a$d$b;->w(LXh/a$b;)LXh/a$d$b;

    :cond_1
    invoke-virtual {p1}, LXh/a$d;->P0()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, LXh/a$d;->E0()LXh/a$c;

    move-result-object v0

    invoke-virtual {p0, v0}, LXh/a$d$b;->D(LXh/a$c;)LXh/a$d$b;

    :cond_2
    invoke-virtual {p1}, LXh/a$d;->M0()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, LXh/a$d;->q0()LXh/a$c;

    move-result-object v0

    invoke-virtual {p0, v0}, LXh/a$d$b;->A(LXh/a$c;)LXh/a$d$b;

    :cond_3
    invoke-virtual {p1}, LXh/a$d;->N0()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, LXh/a$d;->C0()LXh/a$c;

    move-result-object v0

    invoke-virtual {p0, v0}, LXh/a$d$b;->B(LXh/a$c;)LXh/a$d$b;

    :cond_4
    invoke-virtual {p1}, LXh/a$d;->G0()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, LXh/a$d;->d0()LXh/a$c;

    move-result-object v0

    invoke-virtual {p0, v0}, LXh/a$d$b;->u(LXh/a$c;)LXh/a$d$b;

    :cond_5
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->e()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object v0

    invoke-static {p1}, LXh/a$d;->S(LXh/a$d;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/d;->e(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->i(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;

    return-object p0
.end method

.method public z(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LXh/a$d$b;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, LXh/a$d;->l:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-interface {v1, p1, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/p;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LXh/a$d;
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, LXh/a$d$b;->x(LXh/a$d;)LXh/a$d$b;

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

    check-cast p2, LXh/a$d;
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

    invoke-virtual {p0, v0}, LXh/a$d$b;->x(LXh/a$d;)LXh/a$d$b;

    :cond_1
    throw p1
.end method
