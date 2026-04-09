.class final Lcom/ui/wifiman/model/speedtest/internet/c$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/speedtest/internet/c;-><init>(Ltd/d;LYb/b;Lpc/a;LZc/f;Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/speedtest/internet/c$i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/c$i;

    invoke-direct {v0}, Lcom/ui/wifiman/model/speedtest/internet/c$i;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/speedtest/internet/c$i;->a:Lcom/ui/wifiman/model/speedtest/internet/c$i;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LWc/b;

    check-cast p2, LWc/b;

    check-cast p3, LWc/b;

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/model/speedtest/internet/c$i;->b(LWc/b;LWc/b;LWc/b;)LWc/b;

    move-result-object p1

    return-object p1
.end method

.method public final b(LWc/b;LWc/b;LWc/b;)LWc/b;
    .locals 5

    const-string v0, "apiServers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ispServer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "manualServer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p2}, LWc/b;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;

    if-eqz v1, :cond_0

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-virtual {p1}, LWc/b;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_1
    invoke-virtual {p3}, LWc/b;->b()Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3}, LWc/b;->b()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;->d()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_4
    move-object v4, v2

    :goto_0
    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_2

    :cond_5
    :goto_1
    invoke-virtual {p3}, LWc/b;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    const/4 v3, 0x0

    invoke-interface {v0, v3, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    :cond_6
    :goto_2
    instance-of v1, p1, LWc/b$b;

    if-nez v1, :cond_12

    instance-of v1, p2, LWc/b$b;

    if-nez v1, :cond_12

    instance-of v1, p3, LWc/b$b;

    if-eqz v1, :cond_7

    goto :goto_9

    :cond_7
    instance-of v1, p1, LWc/b$a$b;

    if-nez v1, :cond_11

    instance-of v1, p2, LWc/b$a$b;

    if-nez v1, :cond_11

    instance-of v1, p3, LWc/b$a$b;

    if-eqz v1, :cond_8

    goto :goto_7

    :cond_8
    new-instance v0, LWc/b$a$a;

    instance-of v1, p1, LWc/b$a$a;

    if-eqz v1, :cond_9

    check-cast p1, LWc/b$a$a;

    goto :goto_3

    :cond_9
    move-object p1, v2

    :goto_3
    if-eqz p1, :cond_a

    invoke-virtual {p1}, LWc/b$a$a;->c()Ljava/lang/Throwable;

    move-result-object p1

    if-nez p1, :cond_10

    :cond_a
    instance-of p1, p2, LWc/b$a$a;

    if-eqz p1, :cond_b

    check-cast p2, LWc/b$a$a;

    goto :goto_4

    :cond_b
    move-object p2, v2

    :goto_4
    if-eqz p2, :cond_c

    invoke-virtual {p2}, LWc/b$a$a;->c()Ljava/lang/Throwable;

    move-result-object p1

    goto :goto_6

    :cond_c
    instance-of p1, p3, LWc/b$a$a;

    if-eqz p1, :cond_d

    check-cast p3, LWc/b$a$a;

    goto :goto_5

    :cond_d
    move-object p3, v2

    :goto_5
    if-eqz p3, :cond_e

    invoke-virtual {p3}, LWc/b$a$a;->c()Ljava/lang/Throwable;

    move-result-object v2

    :cond_e
    if-nez v2, :cond_f

    new-instance p1, Ljava/lang/Exception;

    const-string p2, "Failed to load speedtest servers"

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    goto :goto_6

    :cond_f
    move-object p1, v2

    :cond_10
    :goto_6
    invoke-direct {v0, p1}, LWc/b$a$a;-><init>(Ljava/lang/Throwable;)V

    goto :goto_a

    :cond_11
    :goto_7
    new-instance p1, LWc/b$a$b;

    invoke-direct {p1, v0}, LWc/b$a$b;-><init>(Ljava/lang/Object;)V

    :goto_8
    move-object v0, p1

    goto :goto_a

    :cond_12
    :goto_9
    new-instance p1, LWc/b$b;

    invoke-direct {p1, v0}, LWc/b$b;-><init>(Ljava/lang/Object;)V

    goto :goto_8

    :goto_a
    return-object v0
.end method
