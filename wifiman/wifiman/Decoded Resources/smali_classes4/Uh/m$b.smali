.class public final LUh/m$b;
.super Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/protobuf/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUh/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private d:I

.field private e:LUh/p;

.field private f:LUh/o;

.field private g:LUh/l;

.field private h:Ljava/util/List;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;-><init>()V

    invoke-static {}, LUh/p;->J()LUh/p;

    move-result-object v0

    iput-object v0, p0, LUh/m$b;->e:LUh/p;

    invoke-static {}, LUh/o;->J()LUh/o;

    move-result-object v0

    iput-object v0, p0, LUh/m$b;->f:LUh/o;

    invoke-static {}, LUh/l;->U0()LUh/l;

    move-result-object v0

    iput-object v0, p0, LUh/m$b;->g:LUh/l;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/m$b;->h:Ljava/util/List;

    invoke-direct {p0}, LUh/m$b;->A()V

    return-void
.end method

.method private A()V
    .locals 0

    return-void
.end method

.method static synthetic r()LUh/m$b;
    .locals 1

    invoke-static {}, LUh/m$b;->x()LUh/m$b;

    move-result-object v0

    return-object v0
.end method

.method private static x()LUh/m$b;
    .locals 1

    new-instance v0, LUh/m$b;

    invoke-direct {v0}, LUh/m$b;-><init>()V

    return-object v0
.end method

.method private z()V
    .locals 3

    iget v0, p0, LUh/m$b;->d:I

    const/16 v1, 0x8

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, LUh/m$b;->h:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LUh/m$b;->h:Ljava/util/List;

    iget v0, p0, LUh/m$b;->d:I

    or-int/2addr v0, v1

    iput v0, p0, LUh/m$b;->d:I

    :cond_0
    return-void
.end method


# virtual methods
.method public B(LUh/m;)LUh/m$b;
    .locals 2

    invoke-static {}, LUh/m;->U0()LUh/m;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p1}, LUh/m;->b1()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LUh/m;->Y0()LUh/p;

    move-result-object v0

    invoke-virtual {p0, v0}, LUh/m$b;->G(LUh/p;)LUh/m$b;

    :cond_1
    invoke-virtual {p1}, LUh/m;->a1()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, LUh/m;->X0()LUh/o;

    move-result-object v0

    invoke-virtual {p0, v0}, LUh/m$b;->F(LUh/o;)LUh/m$b;

    :cond_2
    invoke-virtual {p1}, LUh/m;->Z0()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, LUh/m;->W0()LUh/l;

    move-result-object v0

    invoke-virtual {p0, v0}, LUh/m$b;->E(LUh/l;)LUh/m$b;

    :cond_3
    invoke-static {p1}, LUh/m;->E0(LUh/m;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, LUh/m$b;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {p1}, LUh/m;->E0(LUh/m;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/m$b;->h:Ljava/util/List;

    iget v0, p0, LUh/m$b;->d:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, LUh/m$b;->d:I

    goto :goto_0

    :cond_4
    invoke-direct {p0}, LUh/m$b;->z()V

    iget-object v0, p0, LUh/m$b;->h:Ljava/util/List;

    invoke-static {p1}, LUh/m;->E0(LUh/m;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_5
    :goto_0
    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;->q(Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;)V

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->e()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object v0

    invoke-static {p1}, LUh/m;->M0(LUh/m;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/d;->e(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->i(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;

    return-object p0
.end method

.method public D(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/m$b;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, LUh/m;->l:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-interface {v1, p1, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/p;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LUh/m;
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, LUh/m$b;->B(LUh/m;)LUh/m$b;

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

    check-cast p2, LUh/m;
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

    invoke-virtual {p0, v0}, LUh/m$b;->B(LUh/m;)LUh/m$b;

    :cond_1
    throw p1
.end method

.method public E(LUh/l;)LUh/m$b;
    .locals 3

    iget v0, p0, LUh/m$b;->d:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LUh/m$b;->g:LUh/l;

    invoke-static {}, LUh/l;->U0()LUh/l;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, LUh/m$b;->g:LUh/l;

    invoke-static {v0}, LUh/l;->l1(LUh/l;)LUh/l$b;

    move-result-object v0

    invoke-virtual {v0, p1}, LUh/l$b;->E(LUh/l;)LUh/l$b;

    move-result-object p1

    invoke-virtual {p1}, LUh/l$b;->u()LUh/l;

    move-result-object p1

    iput-object p1, p0, LUh/m$b;->g:LUh/l;

    goto :goto_0

    :cond_0
    iput-object p1, p0, LUh/m$b;->g:LUh/l;

    :goto_0
    iget p1, p0, LUh/m$b;->d:I

    or-int/2addr p1, v1

    iput p1, p0, LUh/m$b;->d:I

    return-object p0
.end method

.method public F(LUh/o;)LUh/m$b;
    .locals 3

    iget v0, p0, LUh/m$b;->d:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LUh/m$b;->f:LUh/o;

    invoke-static {}, LUh/o;->J()LUh/o;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, LUh/m$b;->f:LUh/o;

    invoke-static {v0}, LUh/o;->d0(LUh/o;)LUh/o$b;

    move-result-object v0

    invoke-virtual {v0, p1}, LUh/o$b;->w(LUh/o;)LUh/o$b;

    move-result-object p1

    invoke-virtual {p1}, LUh/o$b;->p()LUh/o;

    move-result-object p1

    iput-object p1, p0, LUh/m$b;->f:LUh/o;

    goto :goto_0

    :cond_0
    iput-object p1, p0, LUh/m$b;->f:LUh/o;

    :goto_0
    iget p1, p0, LUh/m$b;->d:I

    or-int/2addr p1, v1

    iput p1, p0, LUh/m$b;->d:I

    return-object p0
.end method

.method public G(LUh/p;)LUh/m$b;
    .locals 3

    iget v0, p0, LUh/m$b;->d:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LUh/m$b;->e:LUh/p;

    invoke-static {}, LUh/p;->J()LUh/p;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, LUh/m$b;->e:LUh/p;

    invoke-static {v0}, LUh/p;->d0(LUh/p;)LUh/p$b;

    move-result-object v0

    invoke-virtual {v0, p1}, LUh/p$b;->w(LUh/p;)LUh/p$b;

    move-result-object p1

    invoke-virtual {p1}, LUh/p$b;->p()LUh/p;

    move-result-object p1

    iput-object p1, p0, LUh/m$b;->e:LUh/p;

    goto :goto_0

    :cond_0
    iput-object p1, p0, LUh/m$b;->e:LUh/p;

    :goto_0
    iget p1, p0, LUh/m$b;->d:I

    or-int/2addr p1, v1

    iput p1, p0, LUh/m$b;->d:I

    return-object p0
.end method

.method public bridge synthetic a()Lkotlin/reflect/jvm/internal/impl/protobuf/n;
    .locals 1

    invoke-virtual {p0}, LUh/m$b;->t()LUh/m;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b0(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/n$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, LUh/m$b;->D(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/m$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LUh/m$b;->w()LUh/m$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic f(Lkotlin/reflect/jvm/internal/impl/protobuf/h;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;
    .locals 0

    check-cast p1, LUh/m;

    invoke-virtual {p0, p1}, LUh/m$b;->B(LUh/m;)LUh/m$b;

    move-result-object p1

    return-object p1
.end method

.method public t()LUh/m;
    .locals 2

    invoke-virtual {p0}, LUh/m$b;->u()LUh/m;

    move-result-object v0

    invoke-virtual {v0}, LUh/m;->m()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/a$a;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/n;)Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0
.end method

.method public u()LUh/m;
    .locals 5

    new-instance v0, LUh/m;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LUh/m;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;LUh/a;)V

    iget v1, p0, LUh/m$b;->d:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget-object v2, p0, LUh/m$b;->e:LUh/p;

    invoke-static {v0, v2}, LUh/m;->f0(LUh/m;LUh/p;)LUh/p;

    and-int/lit8 v2, v1, 0x2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    or-int/lit8 v3, v3, 0x2

    :cond_1
    iget-object v2, p0, LUh/m$b;->f:LUh/o;

    invoke-static {v0, v2}, LUh/m;->q0(LUh/m;LUh/o;)LUh/o;

    const/4 v2, 0x4

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_2

    or-int/lit8 v3, v3, 0x4

    :cond_2
    iget-object v1, p0, LUh/m$b;->g:LUh/l;

    invoke-static {v0, v1}, LUh/m;->C0(LUh/m;LUh/l;)LUh/l;

    iget v1, p0, LUh/m$b;->d:I

    const/16 v2, 0x8

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_3

    iget-object v1, p0, LUh/m$b;->h:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, LUh/m$b;->h:Ljava/util/List;

    iget v1, p0, LUh/m$b;->d:I

    and-int/lit8 v1, v1, -0x9

    iput v1, p0, LUh/m$b;->d:I

    :cond_3
    iget-object v1, p0, LUh/m$b;->h:Ljava/util/List;

    invoke-static {v0, v1}, LUh/m;->G0(LUh/m;Ljava/util/List;)Ljava/util/List;

    invoke-static {v0, v3}, LUh/m;->K0(LUh/m;I)I

    return-object v0
.end method

.method public w()LUh/m$b;
    .locals 2

    invoke-static {}, LUh/m$b;->x()LUh/m$b;

    move-result-object v0

    invoke-virtual {p0}, LUh/m$b;->u()LUh/m;

    move-result-object v1

    invoke-virtual {v0, v1}, LUh/m$b;->B(LUh/m;)LUh/m$b;

    move-result-object v0

    return-object v0
.end method
