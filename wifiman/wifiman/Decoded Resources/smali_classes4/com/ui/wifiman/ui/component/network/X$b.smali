.class final Lcom/ui/wifiman/ui/component/network/X$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/component/network/X;->k(Landroidx/compose/ui/e;Ljava/lang/String;Lcom/ui/wifiman/ui/component/network/K$a;Lmh/l;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/l;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(Lmh/l;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/component/network/X$b;->a:Lmh/l;

    iput-object p2, p0, Lcom/ui/wifiman/ui/component/network/X$b;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lmh/l;Ljava/lang/String;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/ui/component/network/X$b;->c(Lmh/l;Ljava/lang/String;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lmh/l;Ljava/lang/String;)LYg/J;
    .locals 0

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(LT/l;I)V
    .locals 9

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

    const-string v2, "com.ui.wifiman.ui.component.network.TopologyNodeConnectivityInfoRow.<anonymous>.<anonymous> (WifimanNetworkTopology.kt:411)"

    const v3, 0x433d9295

    invoke-static {v3, p2, v0, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object p2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    int-to-float v0, v1

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p2, v0, v2, v1, v3}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p2

    const/16 v0, 0x14

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-static {p2, v0}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v2

    const p2, 0x2377062f

    invoke-interface {p1, p2}, LT/l;->U(I)V

    iget-object p2, p0, Lcom/ui/wifiman/ui/component/network/X$b;->a:Lmh/l;

    invoke-interface {p1, p2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p2

    iget-object v0, p0, Lcom/ui/wifiman/ui/component/network/X$b;->b:Ljava/lang/String;

    invoke-interface {p1, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p2, v0

    iget-object v0, p0, Lcom/ui/wifiman/ui/component/network/X$b;->a:Lmh/l;

    iget-object v1, p0, Lcom/ui/wifiman/ui/component/network/X$b;->b:Ljava/lang/String;

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez p2, :cond_3

    sget-object p2, LT/l;->a:LT/l$a;

    invoke-virtual {p2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p2

    if-ne v3, p2, :cond_4

    :cond_3
    new-instance v3, Lcom/ui/wifiman/ui/component/network/Y;

    invoke-direct {v3, v0, v1}, Lcom/ui/wifiman/ui/component/network/Y;-><init>(Lmh/l;Ljava/lang/String;)V

    invoke-interface {p1, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    move-object v1, v3

    check-cast v1, Lmh/a;

    invoke-interface {p1}, LT/l;->J()V

    sget-object p2, Lcom/ui/wifiman/ui/component/network/b;->a:Lcom/ui/wifiman/ui/component/network/b;

    invoke-virtual {p2}, Lcom/ui/wifiman/ui/component/network/b;->b()Lmh/p;

    move-result-object v5

    const/16 v7, 0x6030

    const/16 v8, 0xc

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v6, p1

    invoke-static/range {v1 .. v8}, LN/Z;->a(Lmh/a;Landroidx/compose/ui/e;ZLy/m;Lmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/ui/component/network/X$b;->b(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
