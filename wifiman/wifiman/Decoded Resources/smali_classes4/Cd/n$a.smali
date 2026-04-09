.class public final LCd/n$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LCd/n;
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
    invoke-direct {p0}, LCd/n$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LCd/j$c;)LCd/n;
    .locals 11

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LCd/n;

    new-instance v3, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;

    invoke-direct {v3}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;-><init>()V

    new-instance v4, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;

    invoke-direct {v4}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;-><init>()V

    new-instance v5, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;

    invoke-direct {v5}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;-><init>()V

    new-instance v6, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;

    invoke-direct {v6}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;-><init>()V

    new-instance v7, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;

    invoke-direct {v7}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;-><init>()V

    new-instance v8, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;

    invoke-direct {v8}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;-><init>()V

    new-instance v9, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;

    invoke-direct {v9}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;-><init>()V

    new-instance v10, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;

    invoke-direct {v10}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;-><init>()V

    move-object v1, v0

    move-object v2, p1

    invoke-direct/range {v1 .. v10}, LCd/n;-><init>(LCd/j$c;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;)V

    return-object v0
.end method
