.class final Lrf/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrf/f;->c()Lmh/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lrf/f;


# direct methods
.method constructor <init>(Lrf/f;)V
    .locals 0

    iput-object p1, p0, Lrf/f$a;->a:Lrf/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)J
    .locals 3

    const v0, -0x5224691f

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.teleport.component.TeleportTunnelNetworkTopology.State.<get-connectionColor>.<anonymous> (TeleportTunnelNetworkTopology.kt:81)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object p2, p0, Lrf/f$a;->a:Lrf/f;

    invoke-virtual {p2}, Lrf/f;->g()Lcom/ui/wifiman/ui/teleport/y;

    move-result-object p2

    instance-of v0, p2, Lcom/ui/wifiman/ui/teleport/y$c;

    if-eqz v0, :cond_1

    const p2, 0x1e66915c

    invoke-interface {p1, p2}, LT/l;->U(I)V

    sget-object p2, Lla/a;->a:Lla/a;

    sget v0, Lla/a;->b:I

    invoke-virtual {p2, p1, v0}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p2

    invoke-virtual {p2}, Lma/a;->a()Lma/a$a;

    move-result-object p2

    invoke-virtual {p2}, Lma/a$a;->g()Lr9/a$b;

    move-result-object p2

    invoke-virtual {p2}, Lr9/a$b;->i()J

    move-result-wide v0

    invoke-interface {p1}, LT/l;->J()V

    goto :goto_0

    :cond_1
    instance-of v0, p2, Lcom/ui/wifiman/ui/teleport/y$b;

    if-eqz v0, :cond_2

    const p2, 0x1e669d5c

    invoke-interface {p1, p2}, LT/l;->U(I)V

    sget-object p2, Lla/a;->a:Lla/a;

    sget v0, Lla/a;->b:I

    invoke-virtual {p2, p1, v0}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p2

    invoke-virtual {p2}, Lma/a;->a()Lma/a$a;

    move-result-object p2

    invoke-virtual {p2}, Lma/a$a;->b()Lr9/a$a;

    move-result-object p2

    invoke-virtual {p2}, Lr9/a$a;->f()J

    move-result-wide v0

    invoke-interface {p1}, LT/l;->J()V

    goto :goto_0

    :cond_2
    instance-of p2, p2, Lcom/ui/wifiman/ui/teleport/y$a;

    if-eqz p2, :cond_4

    const p2, 0x1e66a95c

    invoke-interface {p1, p2}, LT/l;->U(I)V

    sget-object p2, Lla/a;->a:Lla/a;

    sget v0, Lla/a;->b:I

    invoke-virtual {p2, p1, v0}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p2

    invoke-virtual {p2}, Lma/a;->a()Lma/a$a;

    move-result-object p2

    invoke-virtual {p2}, Lma/a$a;->d()Lr9/a$a;

    move-result-object p2

    invoke-virtual {p2}, Lr9/a$a;->f()J

    move-result-wide v0

    invoke-interface {p1}, LT/l;->J()V

    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    invoke-interface {p1}, LT/l;->J()V

    return-wide v0

    :cond_4
    const p2, 0x1e6683c5

    invoke-interface {p1, p2}, LT/l;->U(I)V

    invoke-interface {p1}, LT/l;->J()V

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lrf/f$a;->a(LT/l;I)J

    move-result-wide p1

    invoke-static {p1, p2}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object p1

    return-object p1
.end method
