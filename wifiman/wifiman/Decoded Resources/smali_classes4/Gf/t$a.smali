.class final LGf/t$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LGf/t;->q(Landroidx/compose/ui/e;Ls9/d;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ls9/d;


# direct methods
.method constructor <init>(Ls9/d;)V
    .locals 0

    iput-object p1, p0, LGf/t$a;->a:Ls9/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(FFLT/l;I)V
    .locals 3

    and-int/lit8 p2, p4, 0x6

    const/4 v0, 0x2

    if-nez p2, :cond_1

    invoke-interface {p3, p1}, LT/l;->g(F)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    move p2, v0

    :goto_0
    or-int/2addr p4, p2

    :cond_1
    and-int/lit16 p2, p4, 0x83

    const/16 v1, 0x82

    if-ne p2, v1, :cond_3

    invoke-interface {p3}, LT/l;->v()Z

    move-result p2

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {p3}, LT/l;->C()V

    goto :goto_2

    :cond_3
    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_4

    const/4 p2, -0x1

    const-string v1, "com.ui.wifiman.ui.wifi.scan.component.WifiScanNetworkItemTextSignalWithMinimalWidth.<anonymous> (WifiScanNetworkItem.kt:127)"

    const v2, 0x6992a9f4

    invoke-static {v2, p4, p2, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    sget-object p2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 p4, 0x0

    const/4 v1, 0x0

    invoke-static {p2, p1, p4, v0, v1}, Landroidx/compose/foundation/layout/r;->u(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p1

    iget-object p2, p0, LGf/t$a;->a:Ls9/d;

    const/4 p4, 0x0

    invoke-static {p1, p2, p3, p4, p4}, LGf/t;->o(Landroidx/compose/ui/e;Ls9/d;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    :goto_2
    return-void
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LY0/h;

    invoke-virtual {p1}, LY0/h;->s()F

    move-result p1

    check-cast p2, LY0/h;

    invoke-virtual {p2}, LY0/h;->s()F

    move-result p2

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, LGf/t$a;->a(FFLT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
