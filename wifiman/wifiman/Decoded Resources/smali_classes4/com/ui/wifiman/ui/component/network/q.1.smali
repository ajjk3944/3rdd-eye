.class public final Lcom/ui/wifiman/ui/component/network/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/ui/component/network/q$a;,
        Lcom/ui/wifiman/ui/component/network/q$b;,
        Lcom/ui/wifiman/ui/component/network/q$c;
    }
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/ui/component/network/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/ui/component/network/q;

    invoke-direct {v0}, Lcom/ui/wifiman/ui/component/network/q;-><init>()V

    sput-object v0, Lcom/ui/wifiman/ui/component/network/q;->a:Lcom/ui/wifiman/ui/component/network/q;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lmh/r;
    .locals 1

    sget-object v0, Lcom/ui/wifiman/ui/component/network/q$d;->a:Lcom/ui/wifiman/ui/component/network/q$d;

    return-object v0
.end method

.method public final b()Lmh/r;
    .locals 1

    sget-object v0, Lcom/ui/wifiman/ui/component/network/q$e;->a:Lcom/ui/wifiman/ui/component/network/q$e;

    return-object v0
.end method

.method public final c()Lmh/r;
    .locals 1

    sget-object v0, Lcom/ui/wifiman/ui/component/network/q$f;->a:Lcom/ui/wifiman/ui/component/network/q$f;

    return-object v0
.end method

.method public final d(Lz/f;LT/l;I)I
    .locals 3

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x2c0566b9

    invoke-interface {p2, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.component.network.NetworkTopology.getMaxVisibleItemCount (NetworkTopology.kt:101)"

    invoke-static {v0, p3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p1}, Lz/f;->b()F

    move-result p1

    invoke-static {}, Lcom/ui/wifiman/ui/component/network/B;->z()LT/H0;

    move-result-object p3

    invoke-interface {p2, p3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LY0/h;

    invoke-virtual {p3}, LY0/h;->s()F

    move-result p3

    const/4 v0, 0x2

    int-to-float v0, v0

    mul-float/2addr p3, v0

    invoke-static {p3}, LY0/h;->j(F)F

    move-result p3

    sub-float/2addr p1, p3

    const/16 p3, 0x64

    int-to-float p3, p3

    invoke-static {p3}, LY0/h;->j(F)F

    move-result p3

    div-float/2addr p1, p3

    float-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-float p1, v0

    float-to-int p1, p1

    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface {p2}, LT/l;->J()V

    return p1
.end method

.method public final e(Lcom/ui/wifiman/ui/component/network/q$c;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lcom/ui/wifiman/ui/component/network/q$c;->a()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public final f(Lz/f;Lcom/ui/wifiman/ui/component/network/q$c;LT/l;I)Z
    .locals 3

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x2ebe26e0

    invoke-interface {p3, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.component.network.NetworkTopology.isTopologyExpandable (NetworkTopology.kt:93)"

    invoke-static {v0, p4, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    and-int/lit8 v0, p4, 0xe

    shr-int/lit8 p4, p4, 0x3

    and-int/lit8 p4, p4, 0x70

    or-int/2addr p4, v0

    invoke-virtual {p0, p1, p3, p4}, Lcom/ui/wifiman/ui/component/network/q;->d(Lz/f;LT/l;I)I

    move-result p1

    invoke-virtual {p0, p2}, Lcom/ui/wifiman/ui/component/network/q;->e(Lcom/ui/wifiman/ui/component/network/q$c;)I

    move-result p2

    if-ge p1, p2, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    invoke-interface {p3}, LT/l;->J()V

    return p1
.end method

.method public final g(Lz/f;Lcom/ui/wifiman/ui/component/network/q$c;LT/l;I)I
    .locals 3

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x67a42d04

    invoke-interface {p3, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.component.network.NetworkTopology.visibleItemCount (NetworkTopology.kt:97)"

    invoke-static {v0, p4, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    and-int/lit8 v0, p4, 0xe

    shr-int/lit8 p4, p4, 0x3

    and-int/lit8 p4, p4, 0x70

    or-int/2addr p4, v0

    invoke-virtual {p0, p1, p3, p4}, Lcom/ui/wifiman/ui/component/network/q;->d(Lz/f;LT/l;I)I

    move-result p1

    invoke-virtual {p0, p2}, Lcom/ui/wifiman/ui/component/network/q;->e(Lcom/ui/wifiman/ui/component/network/q$c;)I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    const/4 p2, 0x0

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface {p3}, LT/l;->J()V

    return p1
.end method
