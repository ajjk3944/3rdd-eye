.class public final LE8/l$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/l;->o(Lcom/ui/wifiman/model/speedtest/internet/f;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/speedtest/internet/f;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/speedtest/internet/f;)V
    .locals 0

    iput-object p1, p0, LE8/l$b;->a:Lcom/ui/wifiman/model/speedtest/internet/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 9

    :try_start_0
    iget-object v0, p0, LE8/l$b;->a:Lcom/ui/wifiman/model/speedtest/internet/f;

    invoke-static {v0}, Lcom/ui/wifiman/model/speedtest/internet/g;->a(Lcom/ui/wifiman/model/speedtest/internet/f;)Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    instance-of v2, v0, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;

    if-eqz v2, :cond_1

    check-cast v0, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v2, Ls9/d$c;

    invoke-direct {v2, v0}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_0
    move-object v2, v1

    :goto_0
    new-instance v0, Lnf/f;

    invoke-direct {v0, v1, v2}, Lnf/f;-><init>(Ls9/d;Ls9/d;)V

    move-object v1, v0

    goto :goto_2

    :cond_1
    instance-of v2, v0, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;

    if-eqz v2, :cond_3

    new-instance v2, Lnf/f;

    new-instance v3, Ls9/d$a;

    move-object v4, v0

    check-cast v4, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;

    invoke-virtual {v4}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;->c()Ljava/lang/String;

    move-result-object v4

    move-object v5, v0

    check-cast v5, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;

    invoke-virtual {v5}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;->h()Ljava/lang/String;

    move-result-object v5

    move-object v6, v0

    check-cast v6, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;

    invoke-virtual {v6}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;->i()Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, LE8/l$b;->a:Lcom/ui/wifiman/model/speedtest/internet/f;

    invoke-static {v7}, Lcom/ui/wifiman/model/speedtest/internet/g;->b(Lcom/ui/wifiman/model/speedtest/internet/f;)Ljava/util/List;

    move-result-object v7

    if-eqz v7, :cond_2

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    goto :goto_1

    :cond_2
    move-object v7, v1

    :goto_1
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v5, LE8/l$c;

    iget-object v6, p0, LE8/l$b;->a:Lcom/ui/wifiman/model/speedtest/internet/f;

    invoke-direct {v5, v0, v6}, LE8/l$c;-><init>(Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;Lcom/ui/wifiman/model/speedtest/internet/f;)V

    invoke-direct {v3, v4, v5}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    invoke-direct {v2, v1, v3}, Lnf/f;-><init>(Ls9/d;Ls9/d;)V

    move-object v1, v2

    goto :goto_2

    :cond_3
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_4
    :goto_2
    new-instance v0, Ll9/a;

    invoke-direct {v0, v1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-interface {p1, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :goto_3
    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_4
    return-void
.end method
