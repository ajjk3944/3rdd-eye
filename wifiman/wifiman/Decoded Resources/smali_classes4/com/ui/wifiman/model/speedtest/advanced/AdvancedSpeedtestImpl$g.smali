.class final Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;->j(Lcom/ui/wifiman/model/speedtest/advanced/b;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$g;->a:Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;)LDj/a;
    .locals 8

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/speedtest/advanced/b;

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/speedtest/advanced/b;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$g;->a:Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/advanced/b;->e()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v3

    instance-of v3, v3, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a;

    const-string v4, "map(...)"

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v3, :cond_0

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/advanced/b;->e()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v3

    instance-of v3, v3, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a;

    if-nez v3, :cond_0

    invoke-static {v2}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;->e(Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;)Lzd/a;

    move-result-object v3

    invoke-static {v3, v6, v5, v6}, Lzd/a$a;->a(Lzd/a;Lzd/a$b;ILjava/lang/Object;)Lgg/i;

    move-result-object v3

    new-instance v7, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$g$a;

    invoke-direct {v7, p1}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$g$a;-><init>(Lcom/ui/wifiman/model/speedtest/advanced/b;)V

    invoke-virtual {v3, v7}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v3

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/advanced/b;->m()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v3

    instance-of v3, v3, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a;

    if-eqz v3, :cond_1

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/advanced/b;->m()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v3

    instance-of v3, v3, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a;

    if-nez v3, :cond_1

    invoke-static {v2}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;->e(Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;)Lzd/a;

    move-result-object v3

    invoke-static {v3, v6, v5, v6}, Lzd/a$a;->a(Lzd/a;Lzd/a$b;ILjava/lang/Object;)Lgg/i;

    move-result-object v3

    new-instance v7, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$g$b;

    invoke-direct {v7, p1}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$g$b;-><init>(Lcom/ui/wifiman/model/speedtest/advanced/b;)V

    invoke-virtual {v3, v7}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v3

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/advanced/b;->q()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v3

    instance-of v3, v3, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a;

    if-eqz v3, :cond_2

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/advanced/b;->q()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    instance-of v0, v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a;

    if-nez v0, :cond_2

    invoke-static {v2}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;->e(Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;)Lzd/a;

    move-result-object v0

    invoke-static {v0, v6, v5, v6}, Lzd/a$a;->a(Lzd/a;Lzd/a$b;ILjava/lang/Object;)Lgg/i;

    move-result-object v0

    new-instance v2, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$g$c;

    invoke-direct {v2, p1}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$g$c;-><init>(Lcom/ui/wifiman/model/speedtest/advanced/b;)V

    invoke-virtual {v0, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    const-string v0, "just(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v1}, Lgg/i;->z(Ljava/lang/Iterable;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$g;->a(LYg/s;)LDj/a;

    move-result-object p1

    return-object p1
.end method
