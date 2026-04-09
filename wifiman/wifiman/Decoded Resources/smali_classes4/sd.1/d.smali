.class public final synthetic Lsd/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/q;


# instance fields
.field public final synthetic a:Lcom/ui/wifiman/model/speedtest/advanced/b;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/wifiman/model/speedtest/advanced/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsd/d;->a:Lcom/ui/wifiman/model/speedtest/advanced/b;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lsd/d;->a:Lcom/ui/wifiman/model/speedtest/advanced/b;

    invoke-static {v0}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;->c(Lcom/ui/wifiman/model/speedtest/advanced/b;)LYg/s;

    move-result-object v0

    return-object v0
.end method
