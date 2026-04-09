.class final synthetic Lcom/ui/wifiman/ui/wifi/channel/f$a$a$b;
.super Lkotlin/jvm/internal/p;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/wifi/channel/f$a$a;->a(Lz/j;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-string v5, "onFilterSelected(Lcom/ui/wifiman/ui/wifi/channel/component/WifiChannelApFilter;)V"

    const/4 v6, 0x0

    const/4 v1, 0x1

    const-class v3, Lcom/ui/wifiman/ui/wifi/channel/c;

    const-string v4, "onFilterSelected"

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/p;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(Lzf/a;)V
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/f;->receiver:Ljava/lang/Object;

    check-cast v0, Lcom/ui/wifiman/ui/wifi/channel/c;

    invoke-virtual {v0, p1}, Lcom/ui/wifiman/ui/wifi/channel/c;->s0(Lzf/a;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lzf/a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/ui/wifi/channel/f$a$a$b;->a(Lzf/a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
