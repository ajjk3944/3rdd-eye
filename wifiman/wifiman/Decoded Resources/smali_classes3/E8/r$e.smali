.class final LE8/r$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/r;->q0(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LE8/r;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(LE8/r;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LE8/r$e;->a:LE8/r;

    iput-object p2, p0, LE8/r$e;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LWc/b;)Lgg/f;
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x1

    const-string/jumbo v2, "serversFetch"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LE8/r$e;->a:LE8/r;

    invoke-static {v2}, LE8/r;->t0(LE8/r;)Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d;

    move-result-object v2

    invoke-virtual {p1}, LWc/b;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    const/4 v3, 0x0

    if-eqz p1, :cond_2

    check-cast p1, Ljava/lang/Iterable;

    iget-object v4, p0, LE8/r$e;->b:Ljava/lang/String;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;

    invoke-virtual {v6}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;->a()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    move-object v3, v5

    :cond_1
    check-cast v3, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;

    :cond_2
    if-nez v3, :cond_3

    sget-object p1, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$a;->a:Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$a;

    goto :goto_0

    :cond_3
    instance-of p1, v3, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;

    if-eqz p1, :cond_4

    new-instance p1, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$b;

    check-cast v3, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;

    invoke-direct {p1, v3}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$b;-><init>(Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;)V

    goto :goto_0

    :cond_4
    instance-of p1, v3, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;

    if-eqz p1, :cond_5

    new-instance p1, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$c;

    check-cast v3, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;

    invoke-direct {p1, v3}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$c;-><init>(Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;)V

    :goto_0
    invoke-interface {v2, p1}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d;->a(Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c;)Lgg/b;

    move-result-object p1

    iget-object v2, p0, LE8/r$e;->a:LE8/r;

    invoke-static {v2}, LE8/r;->v0(LE8/r;)Li8/a;

    move-result-object v2

    new-array v3, v1, [Li8/a$b;

    sget-object v4, Li8/a$b$n;->a:Li8/a$b$n;

    aput-object v4, v3, v0

    invoke-interface {v2, v3}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Lgg/f;

    aput-object p1, v3, v0

    aput-object v2, v3, v1

    invoke-static {v3}, Lgg/b;->p([Lgg/f;)Lgg/b;

    move-result-object p1

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LWc/b;

    invoke-virtual {p0, p1}, LE8/r$e;->a(LWc/b;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
