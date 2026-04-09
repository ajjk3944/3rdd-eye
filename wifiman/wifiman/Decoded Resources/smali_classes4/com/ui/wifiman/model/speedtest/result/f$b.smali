.class public final Lcom/ui/wifiman/model/speedtest/result/f$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/speedtest/result/f;->b([J)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/speedtest/result/f;

.field final synthetic b:[J


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/speedtest/result/f;[J)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/result/f$b;->a:Lcom/ui/wifiman/model/speedtest/result/f;

    iput-object p2, p0, Lcom/ui/wifiman/model/speedtest/result/f$b;->b:[J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/f$b;->a:Lcom/ui/wifiman/model/speedtest/result/f;

    invoke-static {v0}, Lcom/ui/wifiman/model/speedtest/result/f;->i(Lcom/ui/wifiman/model/speedtest/result/f;)LXb/e;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/f$b;->b:[J

    array-length v2, v1

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v1

    invoke-virtual {v0, v1}, LXb/e;->g([J)Z

    invoke-interface {p1}, Lgg/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
