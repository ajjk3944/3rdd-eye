.class final LE8/r$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/r;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LE8/r;


# direct methods
.method constructor <init>(LE8/r;)V
    .locals 0

    iput-object p1, p0, LE8/r$g;->a:LE8/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c;

    check-cast p2, LWc/b;

    check-cast p3, LT7/c;

    invoke-virtual {p0, p1, p2, p3}, LE8/r$g;->b(Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c;LWc/b;LT7/c;)LEe/g;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c;LWc/b;LT7/c;)LEe/g;
    .locals 8

    const-string/jumbo v0, "serverSelection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "serversFetch"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "distanceUnitSystem"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, LE8/r$g;->a:LE8/r;

    instance-of v1, p1, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$a;

    invoke-static {v0, v1}, LE8/r;->r0(LE8/r;Z)Lmf/a$a;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p2}, LWc/b;->b()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    if-eqz p2, :cond_0

    check-cast p2, Ljava/lang/Iterable;

    iget-object v0, p0, LE8/r$g;->a:LE8/r;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;

    invoke-static {v0, v1, p3, p1}, LE8/r;->w0(LE8/r;Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;LT7/c;Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c;)Lmf/a$a;

    move-result-object v1

    invoke-interface {v5, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p1, LEe/g;

    new-instance p2, LEe/g$a$a;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const-string/jumbo v2, "servers"

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p2

    invoke-direct/range {v1 .. v7}, LEe/g$a$a;-><init>(Ljava/lang/String;Ls9/d;LEe/g$a$a$a;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p2}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-direct {p1, p2}, LEe/g;-><init>(Ljava/util/List;)V

    return-object p1
.end method
