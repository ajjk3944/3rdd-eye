.class public final Lcom/ui/wifiman/model/speedtest/result/f$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/speedtest/result/f$f;->a(Lwa/a;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/speedtest/result/f;

.field final synthetic b:Lcom/ui/wifiman/model/speedtest/result/b;

.field final synthetic c:Lwa/a;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/speedtest/result/f;Lcom/ui/wifiman/model/speedtest/result/b;Lwa/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/result/f$f$a;->a:Lcom/ui/wifiman/model/speedtest/result/f;

    iput-object p2, p0, Lcom/ui/wifiman/model/speedtest/result/f$f$a;->b:Lcom/ui/wifiman/model/speedtest/result/b;

    iput-object p3, p0, Lcom/ui/wifiman/model/speedtest/result/f$f$a;->c:Lwa/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/f$f$a;->a:Lcom/ui/wifiman/model/speedtest/result/f;

    invoke-static {v0}, Lcom/ui/wifiman/model/speedtest/result/f;->i(Lcom/ui/wifiman/model/speedtest/result/f;)LXb/e;

    move-result-object v1

    iget-object v2, p0, Lcom/ui/wifiman/model/speedtest/result/f$f$a;->a:Lcom/ui/wifiman/model/speedtest/result/f;

    iget-object v3, p0, Lcom/ui/wifiman/model/speedtest/result/f$f$a;->b:Lcom/ui/wifiman/model/speedtest/result/b;

    invoke-virtual {v2, v3}, Lcom/ui/wifiman/model/speedtest/result/f;->k(Lcom/ui/wifiman/model/speedtest/result/b;)LXb/d;

    move-result-object v2

    invoke-virtual {v1, v2}, LXb/e;->l(LXb/d;)LXb/d;

    move-result-object v1

    iget-object v2, p0, Lcom/ui/wifiman/model/speedtest/result/f$f$a;->c:Lwa/a;

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v2, p0, Lcom/ui/wifiman/model/speedtest/result/f$f$a;->c:Lwa/a;

    invoke-virtual {v0, v1, v2}, Lcom/ui/wifiman/model/speedtest/result/f;->l(LXb/d;Lwa/a;)Lcom/ui/wifiman/model/speedtest/result/b;

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
