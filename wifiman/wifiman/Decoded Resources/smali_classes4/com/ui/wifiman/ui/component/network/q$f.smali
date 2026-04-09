.class final Lcom/ui/wifiman/ui/component/network/q$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/component/network/q;->c()Lmh/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/ui/component/network/q$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/ui/component/network/q$f;

    invoke-direct {v0}, Lcom/ui/wifiman/ui/component/network/q$f;-><init>()V

    sput-object v0, Lcom/ui/wifiman/ui/component/network/q$f;->a:Lcom/ui/wifiman/ui/component/network/q$f;

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

    const v0, 0x3d345c7a

    invoke-interface {p3, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.component.network.NetworkTopology.<get-itemWidthSplitIfSpace>.<anonymous> (NetworkTopology.kt:118)"

    invoke-static {v0, p4, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object v0, Lcom/ui/wifiman/ui/component/network/q;->a:Lcom/ui/wifiman/ui/component/network/q;

    and-int/lit8 v1, p4, 0xe

    or-int/lit16 v1, v1, 0x180

    and-int/lit8 v2, p4, 0x70

    or-int/2addr v1, v2

    invoke-virtual {v0, p1, p2, p3, v1}, Lcom/ui/wifiman/ui/component/network/q;->f(Lz/f;Lcom/ui/wifiman/ui/component/network/q$c;LT/l;I)Z

    move-result v1

    if-nez v1, :cond_1

    const v1, -0x2702b09b

    invoke-interface {p3, v1}, LT/l;->U(I)V

    invoke-virtual {v0}, Lcom/ui/wifiman/ui/component/network/q;->b()Lmh/r;

    move-result-object v0

    and-int/lit8 p4, p4, 0x7e

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-interface {v0, p1, p2, p3, p4}, Lmh/r;->y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LY0/h;

    invoke-virtual {p1}, LY0/h;->s()F

    move-result p1

    invoke-interface {p3}, LT/l;->J()V

    goto :goto_0

    :cond_1
    const v1, -0x2701cc39

    invoke-interface {p3, v1}, LT/l;->U(I)V

    invoke-virtual {v0}, Lcom/ui/wifiman/ui/component/network/q;->a()Lmh/r;

    move-result-object v0

    and-int/lit8 p4, p4, 0x7e

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-interface {v0, p1, p2, p3, p4}, Lmh/r;->y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LY0/h;

    invoke-virtual {p1}, LY0/h;->s()F

    move-result p1

    invoke-interface {p3}, LT/l;->J()V

    :goto_0
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

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/ui/wifiman/ui/component/network/q$f;->a(Lz/f;Lcom/ui/wifiman/ui/component/network/q$c;LT/l;I)F

    move-result p1

    invoke-static {p1}, LY0/h;->d(F)LY0/h;

    move-result-object p1

    return-object p1
.end method
