.class final Lrf/j$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/s;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrf/j;->h(Landroidx/compose/ui/e;Lrf/f;JLT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:J


# direct methods
.method constructor <init>(J)V
    .locals 0

    iput-wide p1, p0, Lrf/j$c;->a:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic K(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    move-object v1, p1

    check-cast v1, LA/c;

    check-cast p2, LY0/h;

    invoke-virtual {p2}, LY0/h;->s()F

    move-result v2

    move-object v3, p3

    check-cast v3, Lrf/e;

    move-object v4, p4

    check-cast v4, LT/l;

    check-cast p5, Ljava/lang/Number;

    invoke-virtual {p5}, Ljava/lang/Number;->intValue()I

    move-result v5

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lrf/j$c;->a(LA/c;FLrf/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final a(LA/c;FLrf/e;LT/l;I)V
    .locals 10

    const-string v0, "$this$BaseNetworkTopology"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "item"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p5, 0x30

    if-nez p1, :cond_1

    invoke-interface {p4, p2}, LT/l;->g(F)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x20

    goto :goto_0

    :cond_0
    const/16 p1, 0x10

    :goto_0
    or-int/2addr p1, p5

    goto :goto_1

    :cond_1
    move p1, p5

    :goto_1
    and-int/lit16 p5, p5, 0x180

    if-nez p5, :cond_3

    invoke-interface {p4, p3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p5

    if-eqz p5, :cond_2

    const/16 p5, 0x100

    goto :goto_2

    :cond_2
    const/16 p5, 0x80

    :goto_2
    or-int/2addr p1, p5

    :cond_3
    and-int/lit16 p5, p1, 0x491

    const/16 v0, 0x490

    if-ne p5, v0, :cond_5

    invoke-interface {p4}, LT/l;->v()Z

    move-result p5

    if-nez p5, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p4}, LT/l;->C()V

    goto :goto_4

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result p5

    if-eqz p5, :cond_6

    const/4 p5, -0x1

    const-string v0, "com.ui.wifiman.ui.teleport.component.TeleportTunnelNetworkTopology.<anonymous> (TeleportTunnelNetworkTopology.kt:111)"

    const v1, -0x5d07db88

    invoke-static {v1, p1, p5, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    sget-object p5, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {p5, p2}, Landroidx/compose/foundation/layout/r;->s(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v0

    iget-wide v5, p0, Lrf/j$c;->a:J

    shr-int/lit8 p1, p1, 0x3

    and-int/lit8 v8, p1, 0x70

    const/16 v9, 0x1c

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p3

    move-object v7, p4

    invoke-static/range {v0 .. v9}, Lrf/j;->f(Landroidx/compose/ui/e;Lrf/e;Lmh/q;Lmh/q;Lmh/q;JLT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    :goto_4
    return-void
.end method
