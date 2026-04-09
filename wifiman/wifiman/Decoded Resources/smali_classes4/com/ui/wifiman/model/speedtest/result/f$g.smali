.class public final Lcom/ui/wifiman/model/speedtest/result/f$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/speedtest/result/f;->h(Lcom/ui/wifiman/model/speedtest/result/b;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/speedtest/result/f;

.field final synthetic b:Lcom/ui/wifiman/model/speedtest/result/b;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/speedtest/result/f;Lcom/ui/wifiman/model/speedtest/result/b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/result/f$g;->a:Lcom/ui/wifiman/model/speedtest/result/f;

    iput-object p2, p0, Lcom/ui/wifiman/model/speedtest/result/f$g;->b:Lcom/ui/wifiman/model/speedtest/result/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/f$g;->a:Lcom/ui/wifiman/model/speedtest/result/f;

    invoke-static {v0}, Lcom/ui/wifiman/model/speedtest/result/f;->i(Lcom/ui/wifiman/model/speedtest/result/f;)LXb/e;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/f$g;->a:Lcom/ui/wifiman/model/speedtest/result/f;

    iget-object v2, p0, Lcom/ui/wifiman/model/speedtest/result/f$g;->b:Lcom/ui/wifiman/model/speedtest/result/b;

    invoke-virtual {v1, v2}, Lcom/ui/wifiman/model/speedtest/result/f;->k(Lcom/ui/wifiman/model/speedtest/result/b;)LXb/d;

    move-result-object v1

    invoke-virtual {v0, v1}, LXb/e;->p(LXb/d;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

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
