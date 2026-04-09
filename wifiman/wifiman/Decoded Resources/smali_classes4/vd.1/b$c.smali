.class public final Lvd/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvd/b;->g(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/speedtest/Speedtest$d;

.field final synthetic b:Lvd/b;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/speedtest/Speedtest$d;Lvd/b;)V
    .locals 0

    iput-object p1, p0, Lvd/b$c;->a:Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    iput-object p2, p0, Lvd/b$c;->b:Lvd/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lvd/b$c;->a:Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$d;->b()Lcom/ui/wifiman/model/speedtest/Speedtest$Error;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lvd/b$c;->a:Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    instance-of v1, v0, Lcom/ui/wifiman/model/speedtest/internet/f;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lvd/b$c;->b:Lvd/b;

    check-cast v0, Lcom/ui/wifiman/model/speedtest/internet/f;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/internet/f;->l()Lcom/ui/wifiman/model/speedtest/internet/f$b;

    move-result-object v0

    invoke-virtual {v1, v0}, Lvd/b;->d(Lcom/ui/wifiman/model/speedtest/internet/f$b;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_0
    instance-of v1, v0, Lqd/d;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lvd/b$c;->b:Lvd/b;

    check-cast v0, Lqd/d;

    invoke-virtual {v0}, Lqd/d;->l()Lqd/d$b;

    move-result-object v0

    invoke-virtual {v1, v0}, Lvd/b;->e(Lqd/d$b;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    instance-of v1, v0, LCd/n;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lvd/b$c;->b:Lvd/b;

    check-cast v0, LCd/n;

    invoke-virtual {v0}, LCd/n;->l()LCd/n$b;

    move-result-object v0

    invoke-virtual {v1, v0}, Lvd/b;->b(LCd/n$b;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    instance-of v1, v0, Lcom/ui/wifiman/model/speedtest/advanced/b;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lvd/b$c;->b:Lvd/b;

    check-cast v0, Lcom/ui/wifiman/model/speedtest/advanced/b;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/advanced/b;->r()Lcom/ui/wifiman/model/speedtest/advanced/b$b;

    move-result-object v0

    invoke-virtual {v1, v0}, Lvd/b;->c(Lcom/ui/wifiman/model/speedtest/advanced/b$b;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    new-instance v1, Lvd/b$a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Speedtest failed in step "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lvd/b$c;->a:Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$d;->b()Lcom/ui/wifiman/model/speedtest/Speedtest$Error;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lvd/b$a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x2

    const/4 v2, 0x0

    invoke-static {v1, v2, v0, v2}, LZ7/b;->f(Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_1

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "unknown speedtest state type"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_1
    invoke-interface {p1}, Lgg/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :goto_2
    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_3
    return-void
.end method
