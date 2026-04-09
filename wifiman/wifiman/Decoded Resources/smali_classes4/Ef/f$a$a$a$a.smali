.class final synthetic LEf/f$a$a$a$a;
.super Lkotlin/jvm/internal/p;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LEf/f$a$a$a;->a(LA9/i;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-string v5, "onSortTypeClicked(Lcom/ui/wifiman/ui/wifi/network/prefs/WifiNetworkDisplayPrefs$SortType;)V"

    const/4 v6, 0x0

    const/4 v1, 0x1

    const-class v3, LEf/d;

    const-string v4, "onSortTypeClicked"

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/p;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(LEf/c;)V
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/f;->receiver:Ljava/lang/Object;

    check-cast v0, LEf/d;

    invoke-virtual {v0, p1}, LEf/d;->o0(LEf/c;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEf/c;

    invoke-virtual {p0, p1}, LEf/f$a$a$a$a;->a(LEf/c;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
