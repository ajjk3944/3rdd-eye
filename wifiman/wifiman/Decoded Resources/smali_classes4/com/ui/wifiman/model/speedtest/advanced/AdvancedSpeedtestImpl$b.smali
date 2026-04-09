.class final Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$b;
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
.field final synthetic a:Lcom/ui/wifiman/model/speedtest/advanced/b;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/speedtest/advanced/b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$b;->a:Lcom/ui/wifiman/model/speedtest/advanced/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)LDj/a;
    .locals 3

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LTd/a;

    const-string v0, "error(...)"

    if-eqz p1, :cond_0

    invoke-interface {p1}, LTd/a;->d()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$b;->a:Lcom/ui/wifiman/model/speedtest/advanced/b;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/advanced/b;->u()Lcom/ui/wifiman/model/speedtest/advanced/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/advanced/a$a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->h(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance p1, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$Error$GatewayConsoleSessionUnavailable;

    invoke-direct {p1}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$Error$GatewayConsoleSessionUnavailable;-><init>()V

    invoke-static {p1}, Lgg/i;->k0(Ljava/lang/Throwable;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    invoke-interface {p1}, LTd/a;->f()Lgg/i;

    move-result-object p1

    if-nez p1, :cond_2

    :cond_1
    new-instance p1, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$Error$GatewayConsoleSessionUnavailable;

    invoke-direct {p1}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$Error$GatewayConsoleSessionUnavailable;-><init>()V

    invoke-static {p1}, Lgg/i;->k0(Ljava/lang/Throwable;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$b;->a(Ll9/a;)LDj/a;

    move-result-object p1

    return-object p1
.end method
