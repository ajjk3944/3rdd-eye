.class public final Lcom/ui/wifiman/model/speedtest/advanced/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/model/speedtest/Speedtest$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/speedtest/advanced/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Linet/ipaddr/g;


# direct methods
.method private constructor <init>(Ljava/lang/String;Linet/ipaddr/g;)V
    .locals 1

    const-string v0, "consoleId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gatewayIp"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/advanced/a$a;->a:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/ui/wifiman/model/speedtest/advanced/a$a;->b:Linet/ipaddr/g;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Linet/ipaddr/g;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/ui/wifiman/model/speedtest/advanced/a$a;-><init>(Ljava/lang/String;Linet/ipaddr/g;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/a$a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Linet/ipaddr/g;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/a$a;->b:Linet/ipaddr/g;

    return-object v0
.end method
