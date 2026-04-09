.class public abstract Landroidx/datastore/preferences/protobuf/v;
.super Landroidx/datastore/preferences/protobuf/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/datastore/preferences/protobuf/v$b;,
        Landroidx/datastore/preferences/protobuf/v$c;,
        Landroidx/datastore/preferences/protobuf/v$a;,
        Landroidx/datastore/preferences/protobuf/v$d;
    }
.end annotation


# static fields
.field private static defaultInstanceMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Landroidx/datastore/preferences/protobuf/v;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field protected memoizedSerializedSize:I

.field protected unknownFields:Landroidx/datastore/preferences/protobuf/j0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Landroidx/datastore/preferences/protobuf/v;->defaultInstanceMap:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/datastore/preferences/protobuf/a;-><init>()V

    invoke-static {}, Landroidx/datastore/preferences/protobuf/j0;->e()Landroidx/datastore/preferences/protobuf/j0;

    move-result-object v0

    iput-object v0, p0, Landroidx/datastore/preferences/protobuf/v;->unknownFields:Landroidx/datastore/preferences/protobuf/j0;

    const/4 v0, -0x1

    iput v0, p0, Landroidx/datastore/preferences/protobuf/v;->memoizedSerializedSize:I

    return-void
.end method

.method protected static B(Landroidx/datastore/preferences/protobuf/M;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Landroidx/datastore/preferences/protobuf/a0;

    invoke-direct {v0, p0, p1, p2}, Landroidx/datastore/preferences/protobuf/a0;-><init>(Landroidx/datastore/preferences/protobuf/M;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0
.end method

.method protected static C(Landroidx/datastore/preferences/protobuf/v;Ljava/io/InputStream;)Landroidx/datastore/preferences/protobuf/v;
    .locals 1

    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/h;->f(Ljava/io/InputStream;)Landroidx/datastore/preferences/protobuf/h;

    move-result-object p1

    invoke-static {}, Landroidx/datastore/preferences/protobuf/n;->b()Landroidx/datastore/preferences/protobuf/n;

    move-result-object v0

    invoke-static {p0, p1, v0}, Landroidx/datastore/preferences/protobuf/v;->D(Landroidx/datastore/preferences/protobuf/v;Landroidx/datastore/preferences/protobuf/h;Landroidx/datastore/preferences/protobuf/n;)Landroidx/datastore/preferences/protobuf/v;

    move-result-object p0

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/v;->k(Landroidx/datastore/preferences/protobuf/v;)Landroidx/datastore/preferences/protobuf/v;

    move-result-object p0

    return-object p0
.end method

.method static D(Landroidx/datastore/preferences/protobuf/v;Landroidx/datastore/preferences/protobuf/h;Landroidx/datastore/preferences/protobuf/n;)Landroidx/datastore/preferences/protobuf/v;
    .locals 1

    sget-object v0, Landroidx/datastore/preferences/protobuf/v$d;->NEW_MUTABLE_INSTANCE:Landroidx/datastore/preferences/protobuf/v$d;

    invoke-virtual {p0, v0}, Landroidx/datastore/preferences/protobuf/v;->o(Landroidx/datastore/preferences/protobuf/v$d;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/datastore/preferences/protobuf/v;

    :try_start_0
    invoke-static {}, Landroidx/datastore/preferences/protobuf/Y;->a()Landroidx/datastore/preferences/protobuf/Y;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/datastore/preferences/protobuf/Y;->d(Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/c0;

    move-result-object v0

    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/i;->O(Landroidx/datastore/preferences/protobuf/h;)Landroidx/datastore/preferences/protobuf/i;

    move-result-object p1

    invoke-interface {v0, p0, p1, p2}, Landroidx/datastore/preferences/protobuf/c0;->h(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/b0;Landroidx/datastore/preferences/protobuf/n;)V

    invoke-interface {v0, p0}, Landroidx/datastore/preferences/protobuf/c0;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :goto_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    instance-of p1, p1, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;

    throw p0

    :cond_0
    throw p0

    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    instance-of p2, p2, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;

    throw p0

    :cond_1
    new-instance p2, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;->n(Landroidx/datastore/preferences/protobuf/M;)Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;

    move-result-object p0

    throw p0
.end method

.method protected static E(Ljava/lang/Class;Landroidx/datastore/preferences/protobuf/v;)V
    .locals 1

    sget-object v0, Landroidx/datastore/preferences/protobuf/v;->defaultInstanceMap:Ljava/util/Map;

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static k(Landroidx/datastore/preferences/protobuf/v;)Landroidx/datastore/preferences/protobuf/v;
    .locals 1

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/v;->v()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/a;->f()Landroidx/datastore/preferences/protobuf/UninitializedMessageException;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/UninitializedMessageException;->a()Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;->n(Landroidx/datastore/preferences/protobuf/M;)Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;

    move-result-object p0

    throw p0

    :cond_1
    :goto_0
    return-object p0
.end method

.method protected static r()Landroidx/datastore/preferences/protobuf/x$b;
    .locals 1

    invoke-static {}, Landroidx/datastore/preferences/protobuf/Z;->f()Landroidx/datastore/preferences/protobuf/Z;

    move-result-object v0

    return-object v0
.end method

.method static s(Ljava/lang/Class;)Landroidx/datastore/preferences/protobuf/v;
    .locals 3

    sget-object v0, Landroidx/datastore/preferences/protobuf/v;->defaultInstanceMap:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/datastore/preferences/protobuf/v;

    if-nez v0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v2, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v0, Landroidx/datastore/preferences/protobuf/v;->defaultInstanceMap:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/datastore/preferences/protobuf/v;

    goto :goto_0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Class initialization cannot fail."

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    :goto_0
    if-nez v0, :cond_2

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/m0;->i(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/datastore/preferences/protobuf/v;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/v;->t()Landroidx/datastore/preferences/protobuf/v;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-object v1, Landroidx/datastore/preferences/protobuf/v;->defaultInstanceMap:Ljava/util/Map;

    invoke-interface {v1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0

    :cond_2
    :goto_1
    return-object v0
.end method

.method static varargs u(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    :try_start_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    instance-of p1, p0, Ljava/lang/RuntimeException;

    if-nez p1, :cond_1

    instance-of p1, p0, Ljava/lang/Error;

    if-eqz p1, :cond_0

    check-cast p0, Ljava/lang/Error;

    throw p0

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Unexpected exception thrown by generated accessor method."

    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_1
    check-cast p0, Ljava/lang/RuntimeException;

    throw p0

    :catch_1
    move-exception p0

    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Couldn\'t use Java reflection to implement protocol message reflection."

    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method protected static final w(Landroidx/datastore/preferences/protobuf/v;Z)Z
    .locals 2

    sget-object v0, Landroidx/datastore/preferences/protobuf/v$d;->GET_MEMOIZED_IS_INITIALIZED:Landroidx/datastore/preferences/protobuf/v$d;

    invoke-virtual {p0, v0}, Landroidx/datastore/preferences/protobuf/v;->o(Landroidx/datastore/preferences/protobuf/v$d;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Byte;

    invoke-virtual {v0}, Ljava/lang/Byte;->byteValue()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    if-nez v0, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    invoke-static {}, Landroidx/datastore/preferences/protobuf/Y;->a()Landroidx/datastore/preferences/protobuf/Y;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/datastore/preferences/protobuf/Y;->d(Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/c0;

    move-result-object v0

    invoke-interface {v0, p0}, Landroidx/datastore/preferences/protobuf/c0;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz p1, :cond_3

    sget-object p1, Landroidx/datastore/preferences/protobuf/v$d;->SET_MEMOIZED_IS_INITIALIZED:Landroidx/datastore/preferences/protobuf/v$d;

    if-eqz v0, :cond_2

    move-object v1, p0

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0, p1, v1}, Landroidx/datastore/preferences/protobuf/v;->p(Landroidx/datastore/preferences/protobuf/v$d;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return v0
.end method

.method protected static z(Landroidx/datastore/preferences/protobuf/x$b;)Landroidx/datastore/preferences/protobuf/x$b;
    .locals 1

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0xa

    goto :goto_0

    :cond_0
    mul-int/lit8 v0, v0, 0x2

    :goto_0
    invoke-interface {p0, v0}, Landroidx/datastore/preferences/protobuf/x$b;->p(I)Landroidx/datastore/preferences/protobuf/x$b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final A()Landroidx/datastore/preferences/protobuf/v$a;
    .locals 1

    sget-object v0, Landroidx/datastore/preferences/protobuf/v$d;->NEW_BUILDER:Landroidx/datastore/preferences/protobuf/v$d;

    invoke-virtual {p0, v0}, Landroidx/datastore/preferences/protobuf/v;->o(Landroidx/datastore/preferences/protobuf/v$d;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/datastore/preferences/protobuf/v$a;

    return-object v0
.end method

.method public final F()Landroidx/datastore/preferences/protobuf/v$a;
    .locals 1

    sget-object v0, Landroidx/datastore/preferences/protobuf/v$d;->NEW_BUILDER:Landroidx/datastore/preferences/protobuf/v$d;

    invoke-virtual {p0, v0}, Landroidx/datastore/preferences/protobuf/v;->o(Landroidx/datastore/preferences/protobuf/v$d;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/datastore/preferences/protobuf/v$a;

    invoke-virtual {v0, p0}, Landroidx/datastore/preferences/protobuf/v$a;->u(Landroidx/datastore/preferences/protobuf/v;)Landroidx/datastore/preferences/protobuf/v$a;

    return-object v0
.end method

.method b()I
    .locals 1

    iget v0, p0, Landroidx/datastore/preferences/protobuf/v;->memoizedSerializedSize:I

    return v0
.end method

.method public bridge synthetic c()Landroidx/datastore/preferences/protobuf/M;
    .locals 1

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/v;->t()Landroidx/datastore/preferences/protobuf/v;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 2

    iget v0, p0, Landroidx/datastore/preferences/protobuf/v;->memoizedSerializedSize:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-static {}, Landroidx/datastore/preferences/protobuf/Y;->a()Landroidx/datastore/preferences/protobuf/Y;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/datastore/preferences/protobuf/Y;->d(Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/c0;

    move-result-object v0

    invoke-interface {v0, p0}, Landroidx/datastore/preferences/protobuf/c0;->f(Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Landroidx/datastore/preferences/protobuf/v;->memoizedSerializedSize:I

    :cond_0
    iget v0, p0, Landroidx/datastore/preferences/protobuf/v;->memoizedSerializedSize:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/v;->t()Landroidx/datastore/preferences/protobuf/v;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-static {}, Landroidx/datastore/preferences/protobuf/Y;->a()Landroidx/datastore/preferences/protobuf/Y;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/datastore/preferences/protobuf/Y;->d(Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/c0;

    move-result-object v0

    check-cast p1, Landroidx/datastore/preferences/protobuf/v;

    invoke-interface {v0, p0, p1}, Landroidx/datastore/preferences/protobuf/c0;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method g(I)V
    .locals 0

    iput p1, p0, Landroidx/datastore/preferences/protobuf/v;->memoizedSerializedSize:I

    return-void
.end method

.method public bridge synthetic h()Landroidx/datastore/preferences/protobuf/M$a;
    .locals 1

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/v;->A()Landroidx/datastore/preferences/protobuf/v$a;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Landroidx/datastore/preferences/protobuf/a;->memoizedHashCode:I

    if-eqz v0, :cond_0

    return v0

    :cond_0
    invoke-static {}, Landroidx/datastore/preferences/protobuf/Y;->a()Landroidx/datastore/preferences/protobuf/Y;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/datastore/preferences/protobuf/Y;->d(Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/c0;

    move-result-object v0

    invoke-interface {v0, p0}, Landroidx/datastore/preferences/protobuf/c0;->g(Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Landroidx/datastore/preferences/protobuf/a;->memoizedHashCode:I

    return v0
.end method

.method j()Ljava/lang/Object;
    .locals 1

    sget-object v0, Landroidx/datastore/preferences/protobuf/v$d;->BUILD_MESSAGE_INFO:Landroidx/datastore/preferences/protobuf/v$d;

    invoke-virtual {p0, v0}, Landroidx/datastore/preferences/protobuf/v;->o(Landroidx/datastore/preferences/protobuf/v$d;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic l()Landroidx/datastore/preferences/protobuf/M$a;
    .locals 1

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/v;->F()Landroidx/datastore/preferences/protobuf/v$a;

    move-result-object v0

    return-object v0
.end method

.method public m(Landroidx/datastore/preferences/protobuf/CodedOutputStream;)V
    .locals 1

    invoke-static {}, Landroidx/datastore/preferences/protobuf/Y;->a()Landroidx/datastore/preferences/protobuf/Y;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/datastore/preferences/protobuf/Y;->d(Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/c0;

    move-result-object v0

    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/j;->P(Landroidx/datastore/preferences/protobuf/CodedOutputStream;)Landroidx/datastore/preferences/protobuf/j;

    move-result-object p1

    invoke-interface {v0, p0, p1}, Landroidx/datastore/preferences/protobuf/c0;->i(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/p0;)V

    return-void
.end method

.method protected final n()Landroidx/datastore/preferences/protobuf/v$a;
    .locals 1

    sget-object v0, Landroidx/datastore/preferences/protobuf/v$d;->NEW_BUILDER:Landroidx/datastore/preferences/protobuf/v$d;

    invoke-virtual {p0, v0}, Landroidx/datastore/preferences/protobuf/v;->o(Landroidx/datastore/preferences/protobuf/v$d;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/datastore/preferences/protobuf/v$a;

    return-object v0
.end method

.method protected o(Landroidx/datastore/preferences/protobuf/v$d;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, v0}, Landroidx/datastore/preferences/protobuf/v;->q(Landroidx/datastore/preferences/protobuf/v$d;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected p(Landroidx/datastore/preferences/protobuf/v$d;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Landroidx/datastore/preferences/protobuf/v;->q(Landroidx/datastore/preferences/protobuf/v$d;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected abstract q(Landroidx/datastore/preferences/protobuf/v$d;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public final t()Landroidx/datastore/preferences/protobuf/v;
    .locals 1

    sget-object v0, Landroidx/datastore/preferences/protobuf/v$d;->GET_DEFAULT_INSTANCE:Landroidx/datastore/preferences/protobuf/v$d;

    invoke-virtual {p0, v0}, Landroidx/datastore/preferences/protobuf/v;->o(Landroidx/datastore/preferences/protobuf/v$d;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/datastore/preferences/protobuf/v;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Landroidx/datastore/preferences/protobuf/O;->e(Landroidx/datastore/preferences/protobuf/M;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final v()Z
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Landroidx/datastore/preferences/protobuf/v;->w(Landroidx/datastore/preferences/protobuf/v;Z)Z

    move-result v0

    return v0
.end method

.method protected x()V
    .locals 1

    invoke-static {}, Landroidx/datastore/preferences/protobuf/Y;->a()Landroidx/datastore/preferences/protobuf/Y;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/datastore/preferences/protobuf/Y;->d(Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/c0;

    move-result-object v0

    invoke-interface {v0, p0}, Landroidx/datastore/preferences/protobuf/c0;->c(Ljava/lang/Object;)V

    return-void
.end method
