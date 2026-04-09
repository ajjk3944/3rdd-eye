.class final Lrf/a$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrf/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lrf/a$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lrf/a$e;

    invoke-direct {v0}, Lrf/a$e;-><init>()V

    sput-object v0, Lrf/a$e;->a:Lrf/a$e;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 10

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

    const-string v1, "com.ui.wifiman.ui.teleport.component.ComposableSingletons$TeleportTunnelNetworkTopologyKt.lambda-5.<anonymous> (TeleportTunnelNetworkTopology.kt:322)"

    const v2, 0x153dc8e1

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object p2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p2, v2, v0, v1}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lrf/j;->l(LT/l;I)Lrf/f;

    move-result-object v4

    new-instance v7, Lcom/ui/wifiman/ui/teleport/y$b;

    const p2, 0x3f19999a    # 0.6f

    invoke-direct {v7, p2}, Lcom/ui/wifiman/ui/teleport/y$b;-><init>(F)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lrf/f;->e(Lrf/f;Lrf/e;Lrf/e;Lcom/ui/wifiman/ui/teleport/y;ILjava/lang/Object;)Lrf/f;

    move-result-object v4

    const/4 v8, 0x6

    const/4 v9, 0x4

    const-wide/16 v5, 0x0

    move-object v7, p1

    invoke-static/range {v3 .. v9}, Lrf/j;->h(Landroidx/compose/ui/e;Lrf/f;JLT/l;II)V

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

    invoke-virtual {p0, p1, p2}, Lrf/a$e;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
