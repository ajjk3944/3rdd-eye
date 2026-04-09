.class final Lcom/ui/wifiman/ui/component/network/q$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/component/network/q;->b()Lmh/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/ui/component/network/q$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/ui/component/network/q$e;

    invoke-direct {v0}, Lcom/ui/wifiman/ui/component/network/q$e;-><init>()V

    sput-object v0, Lcom/ui/wifiman/ui/component/network/q$e;->a:Lcom/ui/wifiman/ui/component/network/q$e;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/f;Lcom/ui/wifiman/ui/component/network/q$c;LT/l;I)F
    .locals 3

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x118c292

    invoke-interface {p3, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.component.network.NetworkTopology.<get-itemWidthSplit>.<anonymous> (NetworkTopology.kt:105)"

    invoke-static {v0, p4, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p1}, Lz/f;->b()F

    move-result p1

    invoke-static {}, Lcom/ui/wifiman/ui/component/network/B;->z()LT/H0;

    move-result-object p4

    invoke-interface {p3, p4}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, LY0/h;

    invoke-virtual {p4}, LY0/h;->s()F

    move-result p4

    const/4 v0, 0x2

    int-to-float v0, v0

    mul-float/2addr p4, v0

    invoke-static {p4}, LY0/h;->j(F)F

    move-result p4

    sub-float/2addr p1, p4

    invoke-static {p1}, LY0/h;->j(F)F

    move-result p1

    sget-object p4, Lcom/ui/wifiman/ui/component/network/q;->a:Lcom/ui/wifiman/ui/component/network/q;

    invoke-virtual {p4, p2}, Lcom/ui/wifiman/ui/component/network/q;->e(Lcom/ui/wifiman/ui/component/network/q$c;)I

    move-result p2

    int-to-float p2, p2

    div-float/2addr p1, p2

    invoke-static {p1}, LY0/h;->j(F)F

    move-result p1

    const/4 p2, 0x0

    int-to-float p2, p2

    invoke-static {p2}, LY0/h;->j(F)F

    move-result p2

    invoke-static {p1, p2}, LY0/h;->h(FF)I

    move-result p2

    if-gez p2, :cond_1

    const/16 p1, 0x64

    int-to-float p1, p1

    invoke-static {p1}, LY0/h;->j(F)F

    move-result p1

    :cond_1
    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    invoke-interface {p3}, LT/l;->J()V

    return p1
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/f;

    check-cast p2, Lcom/ui/wifiman/ui/component/network/q$c;

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/ui/wifiman/ui/component/network/q$e;->a(Lz/f;Lcom/ui/wifiman/ui/component/network/q$c;LT/l;I)F

    move-result p1

    invoke-static {p1}, LY0/h;->d(F)LY0/h;

    move-result-object p1

    return-object p1
.end method
