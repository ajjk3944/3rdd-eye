.class final Lcom/ui/wifiman/model/speedtest/internet/c$m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/speedtest/internet/c;-><init>(Ltd/d;LYb/b;Lpc/a;LZc/f;Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/speedtest/internet/c$m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/c$m;

    invoke-direct {v0}, Lcom/ui/wifiman/model/speedtest/internet/c$m;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/speedtest/internet/c$m;->a:Lcom/ui/wifiman/model/speedtest/internet/c$m;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Boolean;Ll9/a;)Ll9/a;
    .locals 1

    const-string v0, "vpnConnected"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p2, Ll9/a;

    const/4 p1, 0x0

    invoke-direct {p2, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    :goto_0
    return-object p2
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    check-cast p2, Ll9/a;

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/model/speedtest/internet/c$m;->a(Ljava/lang/Boolean;Ll9/a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
