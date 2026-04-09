.class final Lxd/i$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxd/i;->a(Lcom/ui/wifiman/model/speedtest/Speedtest$d;Lxd/c;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/speedtest/Speedtest$d;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)V
    .locals 0

    iput-object p1, p0, Lxd/i$b;->a:Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;)Lgg/D;
    .locals 12

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll9/a;

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LWc/b;

    invoke-virtual {v0}, Ll9/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbe/c;

    if-eqz v0, :cond_12

    invoke-virtual {p1}, LWc/b;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkd/e;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lkd/e;->b()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-virtual {p1}, LWc/b;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkd/e;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lkd/e;->c()Linet/ipaddr/g;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Linet/ipaddr/a;->a0()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_1
    move-object p1, v2

    :goto_1
    iget-object v3, p0, Lxd/i$b;->a:Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    instance-of v4, v3, Lcom/ui/wifiman/model/speedtest/internet/f;

    if-eqz v4, :cond_2

    const-string v4, "INTERNET"

    :goto_2
    move-object v9, v4

    goto :goto_4

    :cond_2
    instance-of v4, v3, Lqd/d;

    if-eqz v4, :cond_3

    const-string v4, "LOCAL_CLIENT"

    goto :goto_2

    :cond_3
    instance-of v4, v3, LCd/n;

    const-string v5, "LOCAL_DEVICE"

    if-eqz v4, :cond_4

    :goto_3
    move-object v9, v5

    goto :goto_4

    :cond_4
    instance-of v4, v3, Lcom/ui/wifiman/model/speedtest/advanced/b;

    if-eqz v4, :cond_11

    goto :goto_3

    :goto_4
    instance-of v4, v3, Lcom/ui/wifiman/model/speedtest/internet/f;

    if-eqz v4, :cond_6

    check-cast v3, Lcom/ui/wifiman/model/speedtest/internet/f;

    invoke-static {v3}, Lcom/ui/wifiman/model/speedtest/internet/g;->a(Lcom/ui/wifiman/model/speedtest/internet/f;)Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;->c()Ljava/lang/String;

    move-result-object v3

    :goto_5
    move-object v10, v3

    goto :goto_7

    :cond_5
    move-object v10, v2

    goto :goto_7

    :cond_6
    instance-of v4, v3, Lqd/d;

    if-eqz v4, :cond_7

    check-cast v3, Lqd/d;

    invoke-virtual {v3}, Lqd/d;->o()Lqd/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lqd/a$a;->c()Ljava/lang/String;

    move-result-object v3

    goto :goto_5

    :cond_7
    instance-of v4, v3, Lcom/ui/wifiman/model/speedtest/advanced/b;

    if-nez v4, :cond_9

    instance-of v3, v3, LCd/n;

    if-eqz v3, :cond_8

    goto :goto_6

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_9
    :goto_6
    const-string v3, ""

    goto :goto_5

    :goto_7
    iget-object v3, p0, Lxd/i$b;->a:Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    instance-of v4, v3, Lcom/ui/wifiman/model/speedtest/internet/f;

    if-eqz v4, :cond_b

    check-cast v3, Lcom/ui/wifiman/model/speedtest/internet/f;

    invoke-static {v3}, Lcom/ui/wifiman/model/speedtest/internet/g;->a(Lcom/ui/wifiman/model/speedtest/internet/f;)Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;

    move-result-object v3

    if-eqz v3, :cond_a

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;->d()Ljava/lang/String;

    move-result-object v3

    :goto_8
    move-object v11, v3

    goto :goto_9

    :cond_a
    move-object v11, v2

    goto :goto_9

    :cond_b
    instance-of v4, v3, Lqd/d;

    if-eqz v4, :cond_c

    check-cast v3, Lqd/d;

    invoke-virtual {v3}, Lqd/d;->o()Lqd/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lqd/a$a;->a()Linet/ipaddr/g;

    move-result-object v3

    invoke-virtual {v3}, Linet/ipaddr/a;->a0()Ljava/lang/String;

    move-result-object v3

    goto :goto_8

    :cond_c
    instance-of v4, v3, Lcom/ui/wifiman/model/speedtest/advanced/b;

    if-eqz v4, :cond_d

    check-cast v3, Lcom/ui/wifiman/model/speedtest/advanced/b;

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/advanced/b;->u()Lcom/ui/wifiman/model/speedtest/advanced/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/advanced/a$a;->b()Linet/ipaddr/g;

    move-result-object v3

    invoke-virtual {v3}, Linet/ipaddr/a;->a0()Ljava/lang/String;

    move-result-object v3

    goto :goto_8

    :cond_d
    instance-of v4, v3, LCd/n;

    if-eqz v4, :cond_10

    check-cast v3, LCd/n;

    invoke-virtual {v3}, LCd/n;->o()LCd/j$c;

    move-result-object v3

    invoke-virtual {v3}, LCd/j$c;->a()Linet/ipaddr/g;

    move-result-object v3

    invoke-virtual {v3}, Linet/ipaddr/a;->a0()Ljava/lang/String;

    move-result-object v3

    goto :goto_8

    :goto_9
    iget-object v3, p0, Lxd/i$b;->a:Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/Speedtest$d;->a()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ui/wifiman/model/speedtest/Speedtest$a;

    const/16 v4, 0x8

    if-eqz v3, :cond_e

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/Speedtest$a;->a()J

    move-result-wide v5

    int-to-long v7, v4

    div-long/2addr v5, v7

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    move-object v7, v3

    goto :goto_a

    :cond_e
    move-object v7, v2

    :goto_a
    iget-object v3, p0, Lxd/i$b;->a:Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/Speedtest$d;->i()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ui/wifiman/model/speedtest/Speedtest$a;

    if-eqz v3, :cond_f

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/Speedtest$a;->a()J

    move-result-wide v2

    int-to-long v4, v4

    div-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    :cond_f
    move-object v8, v2

    new-instance v2, Lce/f$b;

    move-object v6, v2

    invoke-direct/range {v6 .. v11}, Lce/f$b;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    new-instance v3, Lce/f;

    invoke-direct {v3, v1, p1, v2}, Lce/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    invoke-interface {v0, v3}, Lbe/c;->c(Lce/f;)Lgg/z;

    move-result-object p1

    sget-object v0, Lxd/i$b$a;->a:Lxd/i$b$a;

    invoke-virtual {p1, v0}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    goto :goto_b

    :cond_10
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_11
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_12
    new-instance p1, Lxd/i$b$b;

    invoke-direct {p1}, Lxd/i$b$b;-><init>()V

    invoke-static {p1}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_b
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, Lxd/i$b;->a(LYg/s;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
