.class final Lyd/b$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyd/b;->o(Lcom/ui/wifiman/model/speedtest/internet/f;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/speedtest/internet/f;

.field final synthetic b:Lyd/b;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/speedtest/internet/f;Lyd/b;)V
    .locals 0

    iput-object p1, p0, Lyd/b$f;->a:Lcom/ui/wifiman/model/speedtest/internet/f;

    iput-object p2, p0, Lyd/b$f;->b:Lyd/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Lcom/ui/wifiman/model/speedtest/result/b$b$b;
    .locals 7

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkd/e;

    iget-object v0, p0, Lyd/b$f;->a:Lcom/ui/wifiman/model/speedtest/internet/f;

    invoke-static {v0}, Lcom/ui/wifiman/model/speedtest/internet/g;->a(Lcom/ui/wifiman/model/speedtest/internet/f;)Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;

    move-result-object v0

    if-eqz v0, :cond_c

    instance-of v1, v0, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;

    const/4 v2, 0x0

    if-eqz v1, :cond_7

    iget-object v1, p0, Lyd/b$f;->b:Lyd/b;

    check-cast v0, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;

    invoke-static {v1, v0}, Lyd/b;->c(Lyd/b;Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;)Lcom/ui/wifiman/model/speedtest/result/b$b$b$b$a;

    move-result-object v0

    iget-object v1, p0, Lyd/b$f;->a:Lcom/ui/wifiman/model/speedtest/internet/f;

    invoke-static {v1}, Lcom/ui/wifiman/model/speedtest/internet/g;->b(Lcom/ui/wifiman/model/speedtest/internet/f;)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_3

    check-cast v1, Ljava/lang/Iterable;

    iget-object v3, p0, Lyd/b$f;->b:Lyd/b;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;

    instance-of v6, v5, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;

    if-eqz v6, :cond_1

    check-cast v5, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;

    goto :goto_1

    :cond_1
    move-object v5, v2

    :goto_1
    if-eqz v5, :cond_2

    invoke-static {v3, v5}, Lyd/b;->c(Lyd/b;Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;)Lcom/ui/wifiman/model/speedtest/result/b$b$b$b$a;

    move-result-object v5

    goto :goto_2

    :cond_2
    move-object v5, v2

    :goto_2
    if-eqz v5, :cond_0

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v4

    :cond_4
    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lkd/e;->b()Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    :cond_5
    move-object v1, v2

    :goto_3
    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lkd/e;->a()Ljava/net/URL;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_6
    new-instance p1, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b;

    invoke-direct {p1, v0, v4, v1, v2}, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b;-><init>(Lcom/ui/wifiman/model/speedtest/result/b$b$b$b$a;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    :cond_7
    instance-of v1, v0, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;

    if-eqz v1, :cond_b

    check-cast v0, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;->d()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_a

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lkd/e;->b()Ljava/lang/String;

    move-result-object v3

    goto :goto_4

    :cond_8
    move-object v3, v2

    :goto_4
    if-eqz p1, :cond_9

    invoke-virtual {p1}, Lkd/e;->a()Ljava/net/URL;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_9
    new-instance p1, Lcom/ui/wifiman/model/speedtest/result/b$b$b$a;

    invoke-direct {p1, v1, v0, v3, v2}, Lcom/ui/wifiman/model/speedtest/result/b$b$b$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_5
    return-object p1

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "url must be not null here since test could never start"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "main server must already be available when reporting result"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Lyd/b$f;->a(Ll9/a;)Lcom/ui/wifiman/model/speedtest/result/b$b$b;

    move-result-object p1

    return-object p1
.end method
