.class final Lcom/ui/wifiman/model/speedtest/internet/c$q;
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

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/c$q;->a:Lcom/ui/wifiman/model/speedtest/internet/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c;)LDj/a;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$a;

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/c$q;->a:Lcom/ui/wifiman/model/speedtest/internet/c;

    invoke-static {p1}, Lcom/ui/wifiman/model/speedtest/internet/c;->j(Lcom/ui/wifiman/model/speedtest/internet/c;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$c;

    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/c$q;->a:Lcom/ui/wifiman/model/speedtest/internet/c;

    invoke-static {p1}, Lcom/ui/wifiman/model/speedtest/internet/c;->l(Lcom/ui/wifiman/model/speedtest/internet/c;)Lgg/i;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ui/wifiman/model/speedtest/internet/c;->o(Lcom/ui/wifiman/model/speedtest/internet/c;Lgg/i;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_1
    instance-of p1, p1, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$b;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/c$q;->a:Lcom/ui/wifiman/model/speedtest/internet/c;

    invoke-static {p1}, Lcom/ui/wifiman/model/speedtest/internet/c;->k(Lcom/ui/wifiman/model/speedtest/internet/c;)Lgg/i;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ui/wifiman/model/speedtest/internet/c;->o(Lcom/ui/wifiman/model/speedtest/internet/c;Lgg/i;)Lgg/i;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/c$q;->a(Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c;)LDj/a;

    move-result-object p1

    return-object p1
.end method
