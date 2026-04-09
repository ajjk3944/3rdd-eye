.class final Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;->j(Lcom/ui/wifiman/model/speedtest/advanced/b;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$f;

    invoke-direct {v0}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$f;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$f;->a:Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$f;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;Lcom/ui/wifiman/model/speedtest/advanced/b;)LYg/s;
    .locals 0

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/speedtest/advanced/b;

    invoke-static {p1, p2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    check-cast p2, Lcom/ui/wifiman/model/speedtest/advanced/b;

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$f;->a(LYg/s;Lcom/ui/wifiman/model/speedtest/advanced/b;)LYg/s;

    move-result-object p1

    return-object p1
.end method
