.class final Laf/d0$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laf/d0;->w(Landroidx/compose/ui/e;Laf/P;Lmh/l;Lmh/l;Lmh/a;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Laf/P;

.field final synthetic b:Lmh/l;


# direct methods
.method constructor <init>(Laf/P;Lmh/l;)V
    .locals 0

    iput-object p1, p0, Laf/d0$e;->a:Laf/P;

    iput-object p2, p0, Laf/d0$e;->b:Lmh/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq/e;LT/l;I)V
    .locals 6

    const-string v0, "$this$AnimatedVisibility"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.speed.component.SpeedTabSpeedFactorCardUi.<anonymous>.<anonymous> (SpeedTabSpeedFactorCardUi.kt:109)"

    const v1, -0x122c3b23

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object p1, p0, Laf/d0$e;->a:Laf/P;

    invoke-virtual {p1}, Laf/P;->b()Laf/O;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Laf/d0$e;->a:Laf/P;

    iget-object v2, p0, Laf/d0$e;->b:Lmh/l;

    sget-object p3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static {p3, v3, v0, v1}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-virtual {p1}, Laf/P;->b()Laf/O;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v3, p2

    invoke-static/range {v0 .. v5}, Laf/d0;->C(Landroidx/compose/ui/e;Laf/O;Lmh/l;LT/l;II)V

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

    invoke-virtual {p0, p1, p2, p3}, Laf/d0$e;->a(Lq/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
