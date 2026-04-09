.class Lmj/b;
.super Ljava/io/ByteArrayOutputStream;
.source "SourceFile"


# instance fields
.field final a:Lmj/e;

.field final b:Lmj/h;


# direct methods
.method constructor <init>(Lmj/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 2
    iput-object p1, p0, Lmj/b;->a:Lmj/e;

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lmj/b;->b:Lmj/h;

    return-void
.end method

.method constructor <init>(Lmj/h;)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lmj/b;->a:Lmj/e;

    .line 6
    iput-object p1, p0, Lmj/b;->b:Lmj/h;

    return-void
.end method


# virtual methods
.method a()Ljava/io/OutputStream;
    .locals 1

    iget-object v0, p0, Lmj/b;->a:Lmj/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lmj/e;->e()Ljava/io/OutputStream;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lmj/b;->b:Lmj/h;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lmj/h;->i()Ljava/io/OutputStream;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public flush()V
    .locals 4

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {p0}, Ljava/io/ByteArrayOutputStream;->reset()V

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v1, Lmj/c;

    const/4 v2, 0x1

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    const/4 v3, 0x2

    invoke-direct {v1, v3, v2, v0}, Lmj/c;-><init>(BZ[B)V

    invoke-virtual {v1}, Lmj/c;->d()[B

    move-result-object v0

    invoke-virtual {p0}, Lmj/b;->a()Ljava/io/OutputStream;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {p0}, Lmj/b;->a()Ljava/io/OutputStream;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
