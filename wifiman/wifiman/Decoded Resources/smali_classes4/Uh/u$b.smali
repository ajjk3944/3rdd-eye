.class public final LUh/u$b;
.super Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/protobuf/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUh/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private d:I

.field private e:I

.field private f:I

.field private g:LUh/q;

.field private h:I

.field private i:LUh/q;

.field private j:I


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;-><init>()V

    invoke-static {}, LUh/q;->h1()LUh/q;

    move-result-object v0

    iput-object v0, p0, LUh/u$b;->g:LUh/q;

    invoke-static {}, LUh/q;->h1()LUh/q;

    move-result-object v0

    iput-object v0, p0, LUh/u$b;->i:LUh/q;

    invoke-direct {p0}, LUh/u$b;->z()V

    return-void
.end method

.method static synthetic r()LUh/u$b;
    .locals 1

    invoke-static {}, LUh/u$b;->x()LUh/u$b;

    move-result-object v0

    return-object v0
.end method

.method private static x()LUh/u$b;
    .locals 1

    new-instance v0, LUh/u$b;

    invoke-direct {v0}, LUh/u$b;-><init>()V

    return-object v0
.end method

.method private z()V
    .locals 0

    return-void
.end method


# virtual methods
.method public A(LUh/u;)LUh/u$b;
    .locals 1

    invoke-static {}, LUh/u;->P0()LUh/u;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p1}, LUh/u;->a1()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LUh/u;->U0()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/u$b;->F(I)LUh/u$b;

    :cond_1
    invoke-virtual {p1}, LUh/u;->b1()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, LUh/u;->V0()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/u$b;->G(I)LUh/u$b;

    :cond_2
    invoke-virtual {p1}, LUh/u;->c1()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, LUh/u;->W0()LUh/q;

    move-result-object v0

    invoke-virtual {p0, v0}, LUh/u$b;->D(LUh/q;)LUh/u$b;

    :cond_3
    invoke-virtual {p1}, LUh/u;->d1()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, LUh/u;->X0()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/u$b;->H(I)LUh/u$b;

    :cond_4
    invoke-virtual {p1}, LUh/u;->e1()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, LUh/u;->Y0()LUh/q;

    move-result-object v0

    invoke-virtual {p0, v0}, LUh/u$b;->E(LUh/q;)LUh/u$b;

    :cond_5
    invoke-virtual {p1}, LUh/u;->f1()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p1}, LUh/u;->Z0()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/u$b;->I(I)LUh/u$b;

    :cond_6
    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;->q(Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;)V

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->e()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object v0

    invoke-static {p1}, LUh/u;->N0(LUh/u;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/d;->e(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->i(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;

    return-object p0
.end method

.method public B(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/u$b;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, LUh/u;->n:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-interface {v1, p1, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/p;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LUh/u;
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, LUh/u$b;->A(LUh/u;)LUh/u$b;

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

    check-cast p2, LUh/u;
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

    invoke-virtual {p0, v0}, LUh/u$b;->A(LUh/u;)LUh/u$b;

    :cond_1
    throw p1
.end method

.method public D(LUh/q;)LUh/u$b;
    .locals 3

    iget v0, p0, LUh/u$b;->d:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LUh/u$b;->g:LUh/q;

    invoke-static {}, LUh/q;->h1()LUh/q;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, LUh/u$b;->g:LUh/q;

    invoke-static {v0}, LUh/q;->I1(LUh/q;)LUh/q$c;

    move-result-object v0

    invoke-virtual {v0, p1}, LUh/q$c;->E(LUh/q;)LUh/q$c;

    move-result-object p1

    invoke-virtual {p1}, LUh/q$c;->u()LUh/q;

    move-result-object p1

    iput-object p1, p0, LUh/u$b;->g:LUh/q;

    goto :goto_0

    :cond_0
    iput-object p1, p0, LUh/u$b;->g:LUh/q;

    :goto_0
    iget p1, p0, LUh/u$b;->d:I

    or-int/2addr p1, v1

    iput p1, p0, LUh/u$b;->d:I

    return-object p0
.end method

.method public E(LUh/q;)LUh/u$b;
    .locals 3

    iget v0, p0, LUh/u$b;->d:I

    const/16 v1, 0x10

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LUh/u$b;->i:LUh/q;

    invoke-static {}, LUh/q;->h1()LUh/q;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, LUh/u$b;->i:LUh/q;

    invoke-static {v0}, LUh/q;->I1(LUh/q;)LUh/q$c;

    move-result-object v0

    invoke-virtual {v0, p1}, LUh/q$c;->E(LUh/q;)LUh/q$c;

    move-result-object p1

    invoke-virtual {p1}, LUh/q$c;->u()LUh/q;

    move-result-object p1

    iput-object p1, p0, LUh/u$b;->i:LUh/q;

    goto :goto_0

    :cond_0
    iput-object p1, p0, LUh/u$b;->i:LUh/q;

    :goto_0
    iget p1, p0, LUh/u$b;->d:I

    or-int/2addr p1, v1

    iput p1, p0, LUh/u$b;->d:I

    return-object p0
.end method

.method public F(I)LUh/u$b;
    .locals 1

    iget v0, p0, LUh/u$b;->d:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, LUh/u$b;->d:I

    iput p1, p0, LUh/u$b;->e:I

    return-object p0
.end method

.method public G(I)LUh/u$b;
    .locals 1

    iget v0, p0, LUh/u$b;->d:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, LUh/u$b;->d:I

    iput p1, p0, LUh/u$b;->f:I

    return-object p0
.end method

.method public H(I)LUh/u$b;
    .locals 1

    iget v0, p0, LUh/u$b;->d:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, LUh/u$b;->d:I

    iput p1, p0, LUh/u$b;->h:I

    return-object p0
.end method

.method public I(I)LUh/u$b;
    .locals 1

    iget v0, p0, LUh/u$b;->d:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, LUh/u$b;->d:I

    iput p1, p0, LUh/u$b;->j:I

    return-object p0
.end method

.method public bridge synthetic a()Lkotlin/reflect/jvm/internal/impl/protobuf/n;
    .locals 1

    invoke-virtual {p0}, LUh/u$b;->t()LUh/u;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b0(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/n$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, LUh/u$b;->B(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/u$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LUh/u$b;->w()LUh/u$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic f(Lkotlin/reflect/jvm/internal/impl/protobuf/h;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;
    .locals 0

    check-cast p1, LUh/u;

    invoke-virtual {p0, p1}, LUh/u$b;->A(LUh/u;)LUh/u$b;

    move-result-object p1

    return-object p1
.end method

.method public t()LUh/u;
    .locals 2

    invoke-virtual {p0}, LUh/u$b;->u()LUh/u;

    move-result-object v0

    invoke-virtual {v0}, LUh/u;->m()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/a$a;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/n;)Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0
.end method

.method public u()LUh/u;
    .locals 5

    new-instance v0, LUh/u;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LUh/u;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;LUh/a;)V

    iget v1, p0, LUh/u$b;->d:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget v2, p0, LUh/u$b;->e:I

    invoke-static {v0, v2}, LUh/u;->f0(LUh/u;I)I

    and-int/lit8 v2, v1, 0x2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    or-int/lit8 v3, v3, 0x2

    :cond_1
    iget v2, p0, LUh/u$b;->f:I

    invoke-static {v0, v2}, LUh/u;->q0(LUh/u;I)I

    and-int/lit8 v2, v1, 0x4

    const/4 v4, 0x4

    if-ne v2, v4, :cond_2

    or-int/lit8 v3, v3, 0x4

    :cond_2
    iget-object v2, p0, LUh/u$b;->g:LUh/q;

    invoke-static {v0, v2}, LUh/u;->C0(LUh/u;LUh/q;)LUh/q;

    and-int/lit8 v2, v1, 0x8

    const/16 v4, 0x8

    if-ne v2, v4, :cond_3

    or-int/lit8 v3, v3, 0x8

    :cond_3
    iget v2, p0, LUh/u$b;->h:I

    invoke-static {v0, v2}, LUh/u;->E0(LUh/u;I)I

    and-int/lit8 v2, v1, 0x10

    const/16 v4, 0x10

    if-ne v2, v4, :cond_4

    or-int/lit8 v3, v3, 0x10

    :cond_4
    iget-object v2, p0, LUh/u$b;->i:LUh/q;

    invoke-static {v0, v2}, LUh/u;->G0(LUh/u;LUh/q;)LUh/q;

    const/16 v2, 0x20

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_5

    or-int/lit8 v3, v3, 0x20

    :cond_5
    iget v1, p0, LUh/u$b;->j:I

    invoke-static {v0, v1}, LUh/u;->K0(LUh/u;I)I

    invoke-static {v0, v3}, LUh/u;->M0(LUh/u;I)I

    return-object v0
.end method

.method public w()LUh/u$b;
    .locals 2

    invoke-static {}, LUh/u$b;->x()LUh/u$b;

    move-result-object v0

    invoke-virtual {p0}, LUh/u$b;->u()LUh/u;

    move-result-object v1

    invoke-virtual {v0, v1}, LUh/u$b;->A(LUh/u;)LUh/u$b;

    move-result-object v0

    return-object v0
.end method
