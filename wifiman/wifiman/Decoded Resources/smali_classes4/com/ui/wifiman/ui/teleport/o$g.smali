.class final Lcom/ui/wifiman/ui/teleport/o$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/teleport/o;->q(Lcom/ui/wifiman/ui/teleport/d;Lof/a$c;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LHe/p;

.field final synthetic b:Lcom/ui/wifiman/ui/teleport/d;

.field final synthetic c:LIi/N;


# direct methods
.method constructor <init>(LHe/p;Lcom/ui/wifiman/ui/teleport/d;LIi/N;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/teleport/o$g;->a:LHe/p;

    iput-object p2, p0, Lcom/ui/wifiman/ui/teleport/o$g;->b:Lcom/ui/wifiman/ui/teleport/d;

    iput-object p3, p0, Lcom/ui/wifiman/ui/teleport/o$g;->c:LIi/N;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/Y;LT/l;I)V
    .locals 2

    const-string v0, "$this$WifimanToolbarDropdown"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 v0, 0x10

    if-ne p1, v0, :cond_1

    invoke-interface {p2}, LT/l;->v()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, LT/l;->C()V

    goto :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.teleport.TunnelToolbar.<anonymous> (TeleportHomeUi.kt:126)"

    const v1, 0x3cb08399

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p1, p0, Lcom/ui/wifiman/ui/teleport/o$g;->a:LHe/p;

    invoke-virtual {p1}, LHe/p;->c()Z

    move-result p1

    if-eqz p1, :cond_3

    const p1, 0x5ba43a70

    invoke-interface {p2, p1}, LT/l;->U(I)V

    new-instance p1, Lcom/ui/wifiman/ui/teleport/o$g$a;

    iget-object p3, p0, Lcom/ui/wifiman/ui/teleport/o$g;->c:LIi/N;

    iget-object v0, p0, Lcom/ui/wifiman/ui/teleport/o$g;->a:LHe/p;

    invoke-direct {p1, p3, v0}, Lcom/ui/wifiman/ui/teleport/o$g$a;-><init>(LIi/N;LHe/p;)V

    const/16 p3, 0x36

    const v0, 0x6d3eba8d

    const/4 v1, 0x1

    invoke-static {v0, v1, p1, p2, p3}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object p1

    const/16 p3, 0x30

    const/4 v0, 0x0

    invoke-static {v0, p1, p2, p3, v1}, LL9/L;->b(Landroidx/compose/ui/e;Lmh/q;LT/l;II)V

    invoke-interface {p2}, LT/l;->J()V

    goto :goto_1

    :cond_3
    const p1, 0x5bab60e4

    invoke-interface {p2, p1}, LT/l;->U(I)V

    iget-object p1, p0, Lcom/ui/wifiman/ui/teleport/o$g;->b:Lcom/ui/wifiman/ui/teleport/d;

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Lcom/ui/wifiman/ui/teleport/o;->v(Lcom/ui/wifiman/ui/teleport/d;LT/l;I)V

    invoke-interface {p2}, LT/l;->J()V

    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    :goto_2
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/Y;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/teleport/o$g;->a(Lz/Y;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
