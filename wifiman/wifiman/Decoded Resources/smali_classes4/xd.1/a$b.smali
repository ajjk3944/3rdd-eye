.class public final Lxd/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxd/a;->f(Lcom/ui/wifiman/model/speedtest/Speedtest$d;Lxd/c;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/speedtest/Speedtest$d;

.field final synthetic b:Lxd/a;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/speedtest/Speedtest$d;Lxd/a;)V
    .locals 0

    iput-object p1, p0, Lxd/a$b;->a:Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    iput-object p2, p0, Lxd/a$b;->b:Lxd/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lxd/a$b;->a:Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$d;->f()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    instance-of v1, v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/speedtest/result/b;

    iget-object v1, p0, Lxd/a$b;->a:Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    instance-of v2, v1, Lqd/d;

    if-eqz v2, :cond_1

    iget-object v1, p0, Lxd/a$b;->b:Lxd/a;

    invoke-static {v1, v0}, Lxd/a;->c(Lxd/a;Lcom/ui/wifiman/model/speedtest/result/b;)Lgg/b;

    move-result-object v0

    goto :goto_1

    :cond_1
    instance-of v2, v1, Lcom/ui/wifiman/model/speedtest/internet/f;

    if-eqz v2, :cond_2

    iget-object v1, p0, Lxd/a$b;->b:Lxd/a;

    invoke-static {v1, v0}, Lxd/a;->d(Lxd/a;Lcom/ui/wifiman/model/speedtest/result/b;)Lgg/b;

    move-result-object v0

    goto :goto_1

    :cond_2
    instance-of v2, v1, LCd/n;

    if-eqz v2, :cond_3

    iget-object v1, p0, Lxd/a$b;->b:Lxd/a;

    invoke-static {v1, v0}, Lxd/a;->e(Lxd/a;Lcom/ui/wifiman/model/speedtest/result/b;)Lgg/b;

    move-result-object v0

    goto :goto_1

    :cond_3
    instance-of v2, v1, Lcom/ui/wifiman/model/speedtest/advanced/b;

    if-eqz v2, :cond_4

    iget-object v2, p0, Lxd/a$b;->b:Lxd/a;

    check-cast v1, Lcom/ui/wifiman/model/speedtest/advanced/b;

    invoke-static {v2, v0, v1}, Lxd/a;->b(Lxd/a;Lcom/ui/wifiman/model/speedtest/result/b;Lcom/ui/wifiman/model/speedtest/advanced/b;)Lgg/b;

    move-result-object v0

    goto :goto_1

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "unknown speedtest state type"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lgg/b;->D(Ljava/lang/Throwable;)Lgg/b;

    move-result-object v0

    const-string v1, "error(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    invoke-interface {p1, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V

    goto :goto_3

    :cond_5
    const-string v0, "speedtest must be completed(have result) to be able to report it"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_2
    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_3
    return-void
.end method
