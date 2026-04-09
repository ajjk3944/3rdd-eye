.class final synthetic Lcom/ui/wifiman/ui/wifi/channel/f$b$a$a;
.super Lkotlin/jvm/internal/p;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/wifi/channel/f$b$a;->a(Landroidx/compose/ui/e;Lzf/g;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-string v5, "onWifiSignalClicked(Lcom/ui/common/hwaddr/HwAddress;)V"

    const/4 v6, 0x0

    const/4 v1, 0x1

    const-class v3, Lcom/ui/wifiman/ui/wifi/channel/c;

    const-string v4, "onWifiSignalClicked"

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/p;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(Lh9/a;)V
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/f;->receiver:Ljava/lang/Object;

    check-cast v0, Lcom/ui/wifiman/ui/wifi/channel/c;

    invoke-virtual {v0, p1}, Lcom/ui/wifiman/ui/wifi/channel/c;->t0(Lh9/a;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lh9/a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/ui/wifi/channel/f$b$a$a;->a(Lh9/a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
