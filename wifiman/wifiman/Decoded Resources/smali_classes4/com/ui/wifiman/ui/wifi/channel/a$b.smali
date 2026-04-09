.class final Lcom/ui/wifiman/ui/wifi/channel/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/ui/wifi/channel/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/ui/wifi/channel/a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/ui/wifi/channel/a$b;

    invoke-direct {v0}, Lcom/ui/wifiman/ui/wifi/channel/a$b;-><init>()V

    sput-object v0, Lcom/ui/wifiman/ui/wifi/channel/a$b;->a:Lcom/ui/wifiman/ui/wifi/channel/a$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 3

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.ui.wifiman.ui.wifi.channel.ComposableSingletons$WifiChannelDetailUiKt.lambda-2.<anonymous> (WifiChannelDetailUi.kt:197)"

    const v2, 0x7d3a0c32

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    new-instance p2, Lcom/ui/wifiman/ui/wifi/channel/a$b$a;

    invoke-direct {p2}, Lcom/ui/wifiman/ui/wifi/channel/a$b$a;-><init>()V

    const/4 v0, 0x0

    invoke-static {p2, p1, v0, v0}, Lcom/ui/wifiman/ui/wifi/channel/f;->e(Lcom/ui/wifiman/ui/wifi/channel/c;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/ui/wifi/channel/a$b;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
