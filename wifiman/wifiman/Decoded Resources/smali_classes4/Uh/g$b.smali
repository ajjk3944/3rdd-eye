.class public final LUh/g$b;
.super Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/protobuf/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUh/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private d:I

.field private e:I


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;-><init>()V

    invoke-direct {p0}, LUh/g$b;->z()V

    return-void
.end method

.method static synthetic r()LUh/g$b;
    .locals 1

    invoke-static {}, LUh/g$b;->x()LUh/g$b;

    move-result-object v0

    return-object v0
.end method

.method private static x()LUh/g$b;
    .locals 1

    new-instance v0, LUh/g$b;

    invoke-direct {v0}, LUh/g$b;-><init>()V

    return-object v0
.end method

.method private z()V
    .locals 0

    return-void
.end method


# virtual methods
.method public A(LUh/g;)LUh/g$b;
    .locals 1

    invoke-static {}, LUh/g;->E0()LUh/g;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p1}, LUh/g;->M0()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LUh/g;->K0()I

    move-result v0

    invoke-virtual {p0, v0}, LUh/g$b;->D(I)LUh/g$b;

    :cond_1
    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;->q(Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;)V

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->e()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object v0

    invoke-static {p1}, LUh/g;->C0(LUh/g;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/d;->e(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->i(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;

    return-object p0
.end method

.method public B(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/g$b;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, LUh/g;->i:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-interface {v1, p1, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/p;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LUh/g;
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, LUh/g$b;->A(LUh/g;)LUh/g$b;

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

    check-cast p2, LUh/g;
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

    invoke-virtual {p0, v0}, LUh/g$b;->A(LUh/g;)LUh/g$b;

    :cond_1
    throw p1
.end method

.method public D(I)LUh/g$b;
    .locals 1

    iget v0, p0, LUh/g$b;->d:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, LUh/g$b;->d:I

    iput p1, p0, LUh/g$b;->e:I

    return-object p0
.end method

.method public bridge synthetic a()Lkotlin/reflect/jvm/internal/impl/protobuf/n;
    .locals 1

    invoke-virtual {p0}, LUh/g$b;->t()LUh/g;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b0(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/n$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, LUh/g$b;->B(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/g$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LUh/g$b;->w()LUh/g$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic f(Lkotlin/reflect/jvm/internal/impl/protobuf/h;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;
    .locals 0

    check-cast p1, LUh/g;

    invoke-virtual {p0, p1}, LUh/g$b;->A(LUh/g;)LUh/g$b;

    move-result-object p1

    return-object p1
.end method

.method public t()LUh/g;
    .locals 2

    invoke-virtual {p0}, LUh/g$b;->u()LUh/g;

    move-result-object v0

    invoke-virtual {v0}, LUh/g;->m()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/a$a;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/n;)Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0
.end method

.method public u()LUh/g;
    .locals 3

    new-instance v0, LUh/g;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LUh/g;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;LUh/a;)V

    iget v1, p0, LUh/g$b;->d:I

    const/4 v2, 0x1

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iget v1, p0, LUh/g$b;->e:I

    invoke-static {v0, v1}, LUh/g;->f0(LUh/g;I)I

    invoke-static {v0, v2}, LUh/g;->q0(LUh/g;I)I

    return-object v0
.end method

.method public w()LUh/g$b;
    .locals 2

    invoke-static {}, LUh/g$b;->x()LUh/g$b;

    move-result-object v0

    invoke-virtual {p0}, LUh/g$b;->u()LUh/g;

    move-result-object v1

    invoke-virtual {v0, v1}, LUh/g$b;->A(LUh/g;)LUh/g$b;

    move-result-object v0

    return-object v0
.end method
