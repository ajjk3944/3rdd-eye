.class final Lx8/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx8/a;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lx8/a;


# direct methods
.method constructor <init>(Lx8/a;)V
    .locals 0

    iput-object p1, p0, Lx8/a$c;->a:Lx8/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LWc/b;

    check-cast p2, Ljava/lang/Boolean;

    check-cast p3, Ljava/lang/Boolean;

    check-cast p4, Ljava/lang/Boolean;

    check-cast p5, Ljava/lang/Boolean;

    check-cast p6, Ljava/lang/Boolean;

    check-cast p7, Ljava/util/List;

    invoke-virtual/range {p0 .. p7}, Lx8/a$c;->b(LWc/b;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)Lcom/ui/wifiman/ui/signal/l;

    move-result-object p1

    return-object p1
.end method

.method public final b(LWc/b;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)Lcom/ui/wifiman/ui/signal/l;
    .locals 7

    const-string/jumbo v0, "arCoreInitState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "hasCamera"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "hasCameraPermission"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "hasLocationPermission"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "locationEnabled"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "wifiConnected"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "records"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_0

    sget-object p2, Lcom/ui/wifiman/ui/signal/l$b$b$c;->a:Lcom/ui/wifiman/ui/signal/l$b$b$c;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    instance-of p2, p1, LWc/b$a$b;

    if-eqz p2, :cond_1

    move-object v1, p1

    check-cast v1, LWc/b$a$b;

    invoke-virtual {v1}, LWc/b$a$b;->b()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Le7/b;->NOT_INSTALLED:Le7/b;

    if-ne v1, v2, :cond_1

    sget-object v1, Lcom/ui/wifiman/ui/signal/l$b$b$a;->a:Lcom/ui/wifiman/ui/signal/l$b$b$a;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    if-eqz p2, :cond_3

    move-object v1, p1

    check-cast v1, LWc/b$a$b;

    invoke-virtual {v1}, LWc/b$a$b;->b()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Le7/b;->UNSUPPORTED:Le7/b;

    if-eq v2, v3, :cond_2

    invoke-virtual {v1}, LWc/b$a$b;->b()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Le7/b;->ERROR:Le7/b;

    if-ne v1, v2, :cond_3

    :cond_2
    sget-object v1, Lcom/ui/wifiman/ui/signal/l$b$b$c;->a:Lcom/ui/wifiman/ui/signal/l$b$b$c;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-nez p3, :cond_4

    sget-object p3, Lcom/ui/wifiman/ui/signal/l$b$b$b;->a:Lcom/ui/wifiman/ui/signal/l$b$b$b;

    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-nez p3, :cond_5

    sget-object p3, Lcom/ui/wifiman/ui/signal/l$b$b$d$c;->a:Lcom/ui/wifiman/ui/signal/l$b$b$d$c;

    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    invoke-virtual {p5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-nez p3, :cond_6

    sget-object p3, Lcom/ui/wifiman/ui/signal/l$b$b$d$b;->a:Lcom/ui/wifiman/ui/signal/l$b$b$d$b;

    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_6
    invoke-virtual {p6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-nez p3, :cond_7

    sget-object p3, Lcom/ui/wifiman/ui/signal/l$b$b$d$a;->a:Lcom/ui/wifiman/ui/signal/l$b$b$d$a;

    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_7
    move-object p3, p7

    check-cast p3, Ljava/util/Collection;

    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_e

    sget-object p1, Lcom/ui/wifiman/ui/signal/l$b$b$c;->a:Lcom/ui/wifiman/ui/signal/l$b$b$c;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    const/4 p2, 0x1

    xor-int/lit8 v5, p1, 0x1

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    const/4 p4, 0x0

    if-eqz p3, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    move-object p5, p3

    check-cast p5, Lcom/ui/wifiman/ui/signal/l$b$b;

    instance-of p5, p5, Lcom/ui/wifiman/ui/signal/l$b$b$d;

    if-eqz p5, :cond_8

    goto :goto_0

    :cond_9
    move-object p3, p4

    :goto_0
    if-nez p3, :cond_a

    :goto_1
    move v6, p2

    goto :goto_2

    :cond_a
    const/4 p2, 0x0

    goto :goto_1

    :goto_2
    iget-object p1, p0, Lx8/a$c;->a:Lx8/a;

    invoke-static {p1, p7}, Lx8/a;->B0(Lx8/a;Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_b
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_d

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ui/wifiman/ui/signal/l$b$b;

    instance-of p3, p2, Lcom/ui/wifiman/ui/signal/l$b$b$d;

    if-eqz p3, :cond_c

    check-cast p2, Lcom/ui/wifiman/ui/signal/l$b$b$d;

    goto :goto_4

    :cond_c
    move-object p2, p4

    :goto_4
    if-eqz p2, :cond_b

    invoke-interface {v3, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_d
    new-instance p1, Lcom/ui/wifiman/ui/signal/l$a;

    const/4 v4, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lcom/ui/wifiman/ui/signal/l$a;-><init>(Ljava/util/List;Ljava/util/List;ZZZ)V

    goto :goto_5

    :cond_e
    instance-of p1, p1, LWc/b$b;

    if-eqz p1, :cond_f

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v2

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v3

    new-instance p1, Lcom/ui/wifiman/ui/signal/l$a;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v4, 0x1

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lcom/ui/wifiman/ui/signal/l$a;-><init>(Ljava/util/List;Ljava/util/List;ZZZ)V

    goto :goto_5

    :cond_f
    if-nez p2, :cond_10

    sget-object p1, Lcom/ui/wifiman/ui/signal/l$b$b$e;->a:Lcom/ui/wifiman/ui/signal/l$b$b$e;

    goto :goto_5

    :cond_10
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_11

    invoke-static {v0}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/ui/signal/l;

    goto :goto_5

    :cond_11
    sget-object p1, Lcom/ui/wifiman/ui/signal/l$b$a;->a:Lcom/ui/wifiman/ui/signal/l$b$a;

    :goto_5
    return-object p1
.end method
