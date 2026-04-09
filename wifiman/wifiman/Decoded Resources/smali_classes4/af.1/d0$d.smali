.class final Laf/d0$d;
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

    iput-object p1, p0, Laf/d0$d;->a:Laf/P;

    iput-object p2, p0, Laf/d0$d;->b:Lmh/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq/e;LT/l;I)V
    .locals 8

    const-string v0, "$this$AnimatedVisibility"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.speed.component.SpeedTabSpeedFactorCardUi.<anonymous>.<anonymous> (SpeedTabSpeedFactorCardUi.kt:101)"

    const v1, -0x4349821a

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 p3, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v1, p3, v0}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    iget-object p1, p0, Laf/d0$d;->a:Laf/P;

    invoke-virtual {p1}, Laf/P;->g()LCi/c;

    move-result-object v3

    iget-object v4, p0, Laf/d0$d;->b:Lmh/l;

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v5, p2

    invoke-static/range {v2 .. v7}, Laf/d0;->B(Landroidx/compose/ui/e;LCi/c;Lmh/l;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Laf/d0$d;->a(Lq/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
