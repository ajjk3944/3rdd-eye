.class public abstract Lq8/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LDe/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq8/d$a;,
        Lq8/d$b;
    }
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lq8/d;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ls9/d;
    .locals 2

    instance-of v0, p0, Lq8/d$a;

    if-eqz v0, :cond_0

    new-instance v0, Ls9/d$b;

    const v1, 0x7f11007c

    invoke-direct {v0, v1}, Ls9/d$b;-><init>(I)V

    goto :goto_1

    :cond_0
    instance-of v0, p0, Lq8/d$b;

    if-eqz v0, :cond_2

    new-instance v0, Ls9/d$b;

    move-object v1, p0

    check-cast v1, Lq8/d$b;

    invoke-virtual {v1}, Lq8/d$b;->f()Z

    move-result v1

    if-eqz v1, :cond_1

    const v1, 0x7f110044

    goto :goto_0

    :cond_1
    const v1, 0x7f110043

    :goto_0
    invoke-direct {v0, v1}, Ls9/d$b;-><init>(I)V

    :goto_1
    return-object v0

    :cond_2
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public b(LT/l;I)J
    .locals 3

    const v0, -0x4ff6e5a2

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ubnt.usurvey.ui.discovery.bluetooth.BluetoothDiscoveryDeviceBadge.color (BluetoothDiscoveryDeviceTag.kt:41)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    instance-of p2, p0, Lq8/d$a;

    if-eqz p2, :cond_1

    const p2, 0x213bfdb7

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

    :cond_1
    instance-of p2, p0, Lq8/d$b;

    if-eqz p2, :cond_3

    const p2, 0x213c03b7

    invoke-interface {p1, p2}, LT/l;->U(I)V

    sget-object p2, Lla/a;->a:Lla/a;

    sget v0, Lla/a;->b:I

    invoke-virtual {p2, p1, v0}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p2

    invoke-virtual {p2}, Lma/a;->a()Lma/a$a;

    move-result-object p2

    invoke-virtual {p2}, Lma/a$a;->g()Lr9/a$b;

    move-result-object p2

    invoke-virtual {p2}, Lr9/a$b;->j()J

    move-result-wide v0

    invoke-interface {p1}, LT/l;->J()V

    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    invoke-interface {p1}, LT/l;->J()V

    return-wide v0

    :cond_3
    const p2, 0x213bf64c

    invoke-interface {p1, p2}, LT/l;->U(I)V

    invoke-interface {p1}, LT/l;->J()V

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public c(LT/l;I)V
    .locals 0

    invoke-static {p0, p1, p2}, LDe/a$a;->a(LDe/a;LT/l;I)V

    return-void
.end method

.method public d()Z
    .locals 1

    invoke-static {p0}, LDe/a$a;->b(LDe/a;)Z

    move-result v0

    return v0
.end method
