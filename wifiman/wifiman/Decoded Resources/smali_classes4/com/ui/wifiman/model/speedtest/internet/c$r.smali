.class final Lcom/ui/wifiman/model/speedtest/internet/c$r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/speedtest/internet/c;-><init>(Ltd/d;LYb/b;Lpc/a;LZc/f;Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/speedtest/internet/c;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/speedtest/internet/c;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/c$r;->a:Lcom/ui/wifiman/model/speedtest/internet/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/speedtest/internet/c$b;)Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d$a;
    .locals 5

    const-string v0, "status"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/speedtest/internet/c$b$b;

    if-eqz v0, :cond_4

    check-cast p1, Lcom/ui/wifiman/model/speedtest/internet/c$b$b;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/internet/c$b$b;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/internet/c$b$b;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/internet/c$r;->a:Lcom/ui/wifiman/model/speedtest/internet/c;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LIa/e;

    invoke-static {v1, v3, v4}, Lcom/ui/wifiman/model/speedtest/internet/c;->e(Lcom/ui/wifiman/model/speedtest/internet/c;LIa/e;LW7/c;)Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v2}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/internet/c$b$b;->a()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object p1

    const/4 v2, 0x1

    invoke-static {p1, v2}, Lzi/m;->B(Lzi/j;I)Lzi/j;

    move-result-object p1

    const/4 v2, 0x3

    invoke-static {p1, v2}, Lzi/m;->V(Lzi/j;I)Lzi/j;

    move-result-object p1

    iget-object v2, p0, Lcom/ui/wifiman/model/speedtest/internet/c$r;->a:Lcom/ui/wifiman/model/speedtest/internet/c;

    invoke-interface {p1}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LIa/e;

    invoke-static {v2, v3, v4}, Lcom/ui/wifiman/model/speedtest/internet/c;->e(Lcom/ui/wifiman/model/speedtest/internet/c;LIa/e;LW7/c;)Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;->b()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_2

    new-instance p1, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d$a$b;

    invoke-direct {p1, v0, v1}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d$a$b;-><init>(Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;Ljava/util/List;)V

    goto :goto_2

    :cond_2
    sget-object p1, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d$a$c;->a:Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d$a$c;

    goto :goto_2

    :cond_3
    sget-object p1, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d$a$a;->a:Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d$a$a;

    goto :goto_2

    :cond_4
    instance-of p1, p1, Lcom/ui/wifiman/model/speedtest/internet/c$b$a;

    if-eqz p1, :cond_5

    sget-object p1, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d$a$c;->a:Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d$a$c;

    :goto_2
    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/speedtest/internet/c$b;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/c$r;->a(Lcom/ui/wifiman/model/speedtest/internet/c$b;)Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d$a;

    move-result-object p1

    return-object p1
.end method
