.class public Lorg/msgpack/core/buffer/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/msgpack/core/buffer/d;


# instance fields
.field private a:Lorg/msgpack/core/buffer/MessageBuffer;

.field private b:Z


# direct methods
.method public constructor <init>(Lorg/msgpack/core/buffer/MessageBuffer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lorg/msgpack/core/buffer/a;->a:Lorg/msgpack/core/buffer/MessageBuffer;

    if-nez p1, :cond_0

    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Lorg/msgpack/core/buffer/a;->b:Z

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Lorg/msgpack/core/buffer/a;->b:Z

    :goto_0
    return-void
.end method

.method public constructor <init>([B)V
    .locals 2

    .line 5
    array-length v0, p1

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1, v0}, Lorg/msgpack/core/buffer/a;-><init>([BII)V

    return-void
.end method

.method public constructor <init>([BII)V
    .locals 1

    .line 6
    const-string/jumbo v0, "input array is null"

    invoke-static {p1, v0}, Lorg/msgpack/core/g;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    invoke-static {p1, p2, p3}, Lorg/msgpack/core/buffer/MessageBuffer;->wrap([BII)Lorg/msgpack/core/buffer/MessageBuffer;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/msgpack/core/buffer/a;-><init>(Lorg/msgpack/core/buffer/MessageBuffer;)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/msgpack/core/buffer/a;->a:Lorg/msgpack/core/buffer/MessageBuffer;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/msgpack/core/buffer/a;->b:Z

    return-void
.end method

.method public next()Lorg/msgpack/core/buffer/MessageBuffer;
    .locals 1

    iget-boolean v0, p0, Lorg/msgpack/core/buffer/a;->b:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/msgpack/core/buffer/a;->b:Z

    iget-object v0, p0, Lorg/msgpack/core/buffer/a;->a:Lorg/msgpack/core/buffer/MessageBuffer;

    return-object v0
.end method
