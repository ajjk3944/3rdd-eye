.class public final synthetic Lsd/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsd/e;->a:Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lsd/e;->a:Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;

    check-cast p1, Lcom/ui/wifiman/model/speedtest/advanced/b;

    invoke-static {v0, p1}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$j;->k(Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;Lcom/ui/wifiman/model/speedtest/advanced/b;)Lgg/b;

    move-result-object p1

    return-object p1
.end method
