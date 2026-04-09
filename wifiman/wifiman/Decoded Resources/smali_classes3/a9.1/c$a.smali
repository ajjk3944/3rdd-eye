.class public final La9/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La9/c;->f()Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:La9/c;


# direct methods
.method public constructor <init>(La9/c;)V
    .locals 0

    iput-object p1, p0, La9/c$a;->a:La9/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, La9/c$a;->a:La9/c;

    invoke-static {v0}, La9/c;->a(La9/c;)La9/a;

    move-result-object v0

    invoke-virtual {v0}, La9/a;->d()Ljava/util/concurrent/LinkedBlockingQueue;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingQueue;->take()Ljava/lang/Object;

    move-result-object v0

    const-string/jumbo v1, "buffer.completeFrameQueue.take()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/ui/btle/v2/f;

    invoke-virtual {v0}, Lcom/ui/btle/v2/f;->f()[B

    move-result-object v0

    invoke-static {v0}, Lcom/ui/btle/v2/f;->a([B)Lcom/ui/btle/v2/f;

    move-result-object v0

    invoke-interface {p1, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
