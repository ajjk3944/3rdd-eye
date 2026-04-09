.class public final LZ8/c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZ8/c;->b([B)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LZ8/c;

.field final synthetic b:[B


# direct methods
.method public constructor <init>(LZ8/c;[B)V
    .locals 0

    iput-object p1, p0, LZ8/c$c;->a:LZ8/c;

    iput-object p2, p0, LZ8/c$c;->b:[B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 4

    :try_start_0
    iget-object v0, p0, LZ8/c$c;->a:LZ8/c;

    invoke-static {v0}, LZ8/c;->d(LZ8/c;)Ljava/nio/ByteBuffer;

    move-result-object v0

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    new-instance v1, Lxj/a;

    iget-object v2, p0, LZ8/c$c;->a:LZ8/c;

    invoke-static {v2}, LZ8/c;->e(LZ8/c;)[B

    move-result-object v2

    invoke-direct {v1, v2}, Lxj/a;-><init>([B)V

    iget-object v2, p0, LZ8/c$c;->a:LZ8/c;

    invoke-static {v2}, LZ8/c;->d(LZ8/c;)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    iget-object v3, p0, LZ8/c$c;->b:[B

    invoke-virtual {v1, v2, v3}, Lxj/a;->b([B[B)[B

    move-result-object v1

    iget-object v2, p0, LZ8/c$c;->a:LZ8/c;

    invoke-static {v2}, LZ8/c;->d(LZ8/c;)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-static {v2, v3}, LZ8/c;->f(LZ8/c;Ljava/nio/ByteBuffer;)V

    const-string/jumbo v2, "encryptedData"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/ui/btle/v2/f;->b([B)[B

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    monitor-exit v0

    invoke-static {v1}, Lcom/ui/btle/v2/f;->a([B)Lcom/ui/btle/v2/f;

    move-result-object v0

    invoke-interface {p1, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v1

    monitor-exit v0

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_0
    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method
