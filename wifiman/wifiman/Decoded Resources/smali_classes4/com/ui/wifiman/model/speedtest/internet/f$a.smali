.class public final Lcom/ui/wifiman/model/speedtest/internet/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/speedtest/internet/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ui/wifiman/model/speedtest/internet/f$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$a;ZZ)Lcom/ui/wifiman/model/speedtest/internet/f;
    .locals 14

    const-string v0, "params"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;

    invoke-direct {v3}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;-><init>()V

    new-instance v5, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;

    invoke-direct {v5}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;-><init>()V

    new-instance v6, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;

    invoke-direct {v6}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;-><init>()V

    new-instance v4, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;

    invoke-direct {v4}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;-><init>()V

    if-eqz p2, :cond_0

    new-instance v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;

    invoke-direct {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;-><init>()V

    :goto_0
    move-object v7, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$b;

    invoke-direct {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$b;-><init>()V

    goto :goto_0

    :goto_1
    if-eqz p2, :cond_1

    new-instance v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;

    invoke-direct {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;-><init>()V

    :goto_2
    move-object v8, v0

    goto :goto_3

    :cond_1
    new-instance v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$b;

    invoke-direct {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$b;-><init>()V

    goto :goto_2

    :goto_3
    if-eqz p3, :cond_2

    new-instance v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;

    invoke-direct {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;-><init>()V

    :goto_4
    move-object v9, v0

    goto :goto_5

    :cond_2
    new-instance v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$b;

    invoke-direct {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$b;-><init>()V

    goto :goto_4

    :goto_5
    if-eqz p3, :cond_3

    new-instance v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;

    invoke-direct {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;-><init>()V

    :goto_6
    move-object v10, v0

    goto :goto_7

    :cond_3
    new-instance v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$b;

    invoke-direct {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$b;-><init>()V

    goto :goto_6

    :goto_7
    new-instance v11, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;

    invoke-direct {v11}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;-><init>()V

    new-instance v12, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;

    invoke-direct {v12}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;-><init>()V

    new-instance v13, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;

    invoke-direct {v13}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;-><init>()V

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/f;

    move-object v1, v0

    move-object v2, p1

    invoke-direct/range {v1 .. v13}, Lcom/ui/wifiman/model/speedtest/internet/f;-><init>(Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$a;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;)V

    return-object v0
.end method
