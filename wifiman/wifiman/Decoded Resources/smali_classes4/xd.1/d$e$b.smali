.class final Lxd/d$e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxd/d$e;->a(LIa/a;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lqd/d;


# direct methods
.method constructor <init>(Lqd/d;)V
    .locals 0

    iput-object p1, p0, Lxd/d$e$b;->a:Lqd/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LCc/j;

    check-cast p2, Ll9/a;

    check-cast p3, Ll9/a;

    invoke-virtual {p0, p1, p2, p3}, Lxd/d$e$b;->b(LCc/j;Ll9/a;Ll9/a;)LIa/k$a;

    move-result-object p1

    return-object p1
.end method

.method public final b(LCc/j;Ll9/a;Ll9/a;)LIa/k$a;
    .locals 11

    const-string v0, "systemStats"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "product"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LW7/c;

    invoke-virtual {p1}, LCc/j;->b()Ljava/lang/String;

    move-result-object v1

    iget-object p1, p0, Lxd/d$e$b;->a:Lqd/d;

    invoke-virtual {p1}, Lqd/d;->o()Lqd/a$a;

    move-result-object p1

    invoke-virtual {p1}, Lqd/a$a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3}, Ll9/a;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lxa/a$d;

    const/4 p3, 0x0

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lua/a;->getName()Ljava/lang/String;

    move-result-object p1

    move-object v3, p1

    goto :goto_0

    :cond_0
    move-object v3, p3

    :goto_0
    if-eqz p2, :cond_1

    invoke-virtual {p2}, LW7/c;->b()LW7/c$a;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LW7/c$a;->a()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    move-object v4, p1

    goto :goto_1

    :cond_1
    move-object v4, p3

    :goto_1
    if-eqz p2, :cond_2

    invoke-virtual {p2}, LW7/c;->b()LW7/c$a;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, LW7/c$a;->b()D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    move-object v5, p1

    goto :goto_2

    :cond_2
    move-object v5, p3

    :goto_2
    iget-object p1, p0, Lxd/d$e$b;->a:Lqd/d;

    invoke-virtual {p1}, Lqd/d;->e()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    int-to-long p1, p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    move-object v6, p1

    goto :goto_3

    :cond_3
    move-object v6, p3

    :goto_3
    iget-object p1, p0, Lxd/d$e$b;->a:Lqd/d;

    invoke-virtual {p1}, Lqd/d;->a()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/speedtest/Speedtest$a;

    const/16 p2, 0x8

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$a;->a()J

    move-result-wide v7

    int-to-long v9, p2

    div-long/2addr v7, v9

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    move-object v7, p1

    goto :goto_4

    :cond_4
    move-object v7, p3

    :goto_4
    iget-object p1, p0, Lxd/d$e$b;->a:Lqd/d;

    invoke-virtual {p1}, Lqd/d;->i()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/speedtest/Speedtest$a;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$a;->a()J

    move-result-wide v8

    int-to-long p1, p2

    div-long/2addr v8, p1

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    move-object v8, p1

    goto :goto_5

    :cond_5
    move-object v8, p3

    :goto_5
    new-instance p1, LIa/k$a;

    move-object v0, p1

    invoke-direct/range {v0 .. v8}, LIa/k$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V

    return-object p1
.end method
