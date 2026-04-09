.class public final LE8/x$J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/x;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LE8/x;


# direct methods
.method public constructor <init>(LE8/x;)V
    .locals 0

    iput-object p1, p0, LE8/x$J;->a:LE8/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 9

    :try_start_0
    iget-object v0, p0, LE8/x$J;->a:LE8/x;

    invoke-static {v0}, LE8/x;->A0(LE8/x;)Lnf/e;

    move-result-object v0

    instance-of v1, v0, Lnf/e$c;

    if-eqz v1, :cond_0

    new-instance v0, LE8/l;

    iget-object v1, p0, LE8/x$J;->a:LE8/x;

    invoke-static {v1}, LE8/x;->I0(LE8/x;)Lgg/i;

    move-result-object v1

    sget-object v2, LE8/x$o;->a:LE8/x$o;

    invoke-virtual {v1, v2}, Lgg/i;->m0(Lkg/p;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    new-instance v2, LE8/x$p;

    iget-object v3, p0, LE8/x$J;->a:LE8/x;

    invoke-direct {v2, v3}, LE8/x$p;-><init>(LE8/x;)V

    invoke-virtual {v1, v2}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object v1

    const-string/jumbo v2, "flatMapPublisher(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LE8/x$J;->a:LE8/x;

    invoke-virtual {v2}, LE8/x;->d()Lorg/kodein/di/DI;

    move-result-object v2

    invoke-direct {v0, v1, v2}, LE8/l;-><init>(Lgg/i;Lorg/kodein/di/DI;)V

    goto/16 :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_2

    :cond_0
    instance-of v1, v0, Lnf/e$d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string/jumbo v2, "toString(...)"

    if-eqz v1, :cond_1

    :try_start_1
    iget-object v1, p0, LE8/x$J;->a:LE8/x;

    invoke-static {v1}, LE8/x;->E0(LE8/x;)LCd/j;

    move-result-object v1

    new-instance v3, LCd/j$c;

    move-object v4, v0

    check-cast v4, Lnf/e$d;

    invoke-virtual {v4}, Lnf/e$d;->a()Linet/ipaddr/g;

    move-result-object v4

    invoke-direct {v3, v4}, LCd/j$c;-><init>(Linet/ipaddr/g;)V

    invoke-interface {v1, v3}, Lcom/ui/wifiman/model/speedtest/Speedtest;->a(Lcom/ui/wifiman/model/speedtest/Speedtest$b;)Lgg/i;

    move-result-object v1

    iget-object v3, p0, LE8/x$J;->a:LE8/x;

    invoke-virtual {v3}, LE8/x;->d()Lorg/kodein/di/DI;

    move-result-object v3

    check-cast v0, Lnf/e$d;

    invoke-virtual {v0}, Lnf/e$d;->a()Linet/ipaddr/g;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/a;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, LE8/m;

    invoke-direct {v2, v1, v0, v3}, LE8/m;-><init>(Lgg/i;Ljava/lang/String;Lorg/kodein/di/DI;)V

    move-object v0, v2

    goto/16 :goto_1

    :cond_1
    instance-of v1, v0, Lnf/e$a;

    if-eqz v1, :cond_2

    new-instance v1, LE8/g;

    iget-object v3, p0, LE8/x$J;->a:LE8/x;

    invoke-static {v3}, LE8/x;->B0(LE8/x;)Lqd/a;

    move-result-object v3

    new-instance v4, Lqd/a$a;

    move-object v5, v0

    check-cast v5, Lnf/e$a;

    invoke-virtual {v5}, Lnf/e$a;->a()Linet/ipaddr/g;

    move-result-object v5

    move-object v6, v0

    check-cast v6, Lnf/e$a;

    invoke-virtual {v6}, Lnf/e$a;->d()I

    move-result v6

    move-object v7, v0

    check-cast v7, Lnf/e$a;

    invoke-virtual {v7}, Lnf/e$a;->c()Ljava/lang/String;

    move-result-object v7

    move-object v8, v0

    check-cast v8, Lnf/e$a;

    invoke-virtual {v8}, Lnf/e$a;->b()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v4, v5, v6, v7, v8}, Lqd/a$a;-><init>(Linet/ipaddr/g;ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v3, v4}, Lcom/ui/wifiman/model/speedtest/Speedtest;->a(Lcom/ui/wifiman/model/speedtest/Speedtest$b;)Lgg/i;

    move-result-object v3

    check-cast v0, Lnf/e$a;

    invoke-virtual {v0}, Lnf/e$a;->a()Linet/ipaddr/g;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/a;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LE8/x$J;->a:LE8/x;

    invoke-virtual {v2}, LE8/x;->d()Lorg/kodein/di/DI;

    move-result-object v2

    invoke-direct {v1, v3, v0, v2}, LE8/g;-><init>(Lgg/i;Ljava/lang/String;Lorg/kodein/di/DI;)V

    :goto_0
    move-object v0, v1

    goto :goto_1

    :cond_2
    instance-of v1, v0, Lnf/e$b;

    if-eqz v1, :cond_3

    new-instance v1, LE8/h;

    iget-object v2, p0, LE8/x$J;->a:LE8/x;

    invoke-static {v2}, LE8/x;->C0(LE8/x;)Lcom/ui/wifiman/model/speedtest/advanced/a;

    move-result-object v2

    move-object v3, v0

    check-cast v3, Lnf/e$b;

    invoke-virtual {v3}, Lnf/e$b;->b()Linet/ipaddr/g;

    move-result-object v3

    check-cast v0, Lnf/e$b;

    invoke-virtual {v0}, Lnf/e$b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v4, Lcom/ui/wifiman/model/speedtest/advanced/a$a;

    const/4 v5, 0x0

    invoke-direct {v4, v0, v3, v5}, Lcom/ui/wifiman/model/speedtest/advanced/a$a;-><init>(Ljava/lang/String;Linet/ipaddr/g;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v4}, Lcom/ui/wifiman/model/speedtest/Speedtest;->a(Lcom/ui/wifiman/model/speedtest/Speedtest$b;)Lgg/i;

    move-result-object v0

    iget-object v2, p0, LE8/x$J;->a:LE8/x;

    invoke-virtual {v2}, LE8/x;->d()Lorg/kodein/di/DI;

    move-result-object v2

    invoke-direct {v1, v0, v2}, LE8/h;-><init>(Lgg/i;Lorg/kodein/di/DI;)V

    goto :goto_0

    :goto_1
    invoke-interface {p1, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_2
    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_3
    return-void
.end method
