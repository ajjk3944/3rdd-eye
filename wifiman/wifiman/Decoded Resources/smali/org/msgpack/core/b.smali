.class public Lorg/msgpack/core/b;
.super Lorg/msgpack/core/e;
.source "SourceFile"


# direct methods
.method protected constructor <init>(Lorg/msgpack/core/buffer/b;Lorg/msgpack/core/d$b;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lorg/msgpack/core/e;-><init>(Lorg/msgpack/core/buffer/e;Lorg/msgpack/core/d$b;)V

    return-void
.end method

.method protected constructor <init>(Lorg/msgpack/core/d$b;)V
    .locals 1

    .line 1
    new-instance v0, Lorg/msgpack/core/buffer/b;

    invoke-direct {v0}, Lorg/msgpack/core/buffer/b;-><init>()V

    invoke-direct {p0, v0, p1}, Lorg/msgpack/core/b;-><init>(Lorg/msgpack/core/buffer/b;Lorg/msgpack/core/d$b;)V

    return-void
.end method

.method private q0()Lorg/msgpack/core/buffer/b;
    .locals 1

    iget-object v0, p0, Lorg/msgpack/core/e;->d:Lorg/msgpack/core/buffer/e;

    check-cast v0, Lorg/msgpack/core/buffer/b;

    return-object v0
.end method


# virtual methods
.method public r0()[B
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lorg/msgpack/core/e;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-direct {p0}, Lorg/msgpack/core/b;->q0()Lorg/msgpack/core/buffer/b;

    move-result-object v0

    invoke-virtual {v0}, Lorg/msgpack/core/buffer/b;->g()[B

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method
