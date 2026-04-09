.class final Lcom/ui/wifiman/ui/teleport/J$c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/teleport/J$c;->a(Lz/j;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/ui/teleport/A;

.field final synthetic b:Lcom/ui/wifiman/ui/teleport/B;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/ui/teleport/A;Lcom/ui/wifiman/ui/teleport/B;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/teleport/J$c$b;->a:Lcom/ui/wifiman/ui/teleport/A;

    iput-object p2, p0, Lcom/ui/wifiman/ui/teleport/J$c$b;->b:Lcom/ui/wifiman/ui/teleport/B;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq/e;LT/l;I)V
    .locals 3

    const-string v0, "$this$AnimatedVisibility"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.teleport.TunnelCard.<anonymous>.<anonymous>.<anonymous> (TeleportTunnelUi.kt:106)"

    const v1, 0x4c861491    # 7.029671E7f

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object p1, p0, Lcom/ui/wifiman/ui/teleport/J$c$b;->a:Lcom/ui/wifiman/ui/teleport/A;

    invoke-virtual {p1}, Lcom/ui/wifiman/ui/teleport/A;->b()Lcom/ui/wifiman/ui/teleport/A$a;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    sget-object p3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p3, v2, v0, v1}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p3

    const/16 v0, 0x10

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    const/16 v1, 0x18

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-static {p3, v1, v0}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object p3

    iget-object v0, p0, Lcom/ui/wifiman/ui/teleport/J$c$b;->b:Lcom/ui/wifiman/ui/teleport/B;

    const/4 v1, 0x0

    invoke-static {p1, p3, v0, p2, v1}, Lcom/ui/wifiman/ui/teleport/J;->s(Lcom/ui/wifiman/ui/teleport/A$a;Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/B;LT/l;I)V

    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/teleport/J$c$b;->a(Lq/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
