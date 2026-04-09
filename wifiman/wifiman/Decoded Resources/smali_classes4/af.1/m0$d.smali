.class final Laf/m0$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laf/m0;->s(Landroidx/compose/ui/e;ZLjava/lang/Boolean;Ls9/d;Lmh/a;Lmh/a;Lmh/l;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/l;

.field final synthetic b:Ljava/lang/Boolean;


# direct methods
.method constructor <init>(Lmh/l;Ljava/lang/Boolean;)V
    .locals 0

    iput-object p1, p0, Laf/m0$d;->a:Lmh/l;

    iput-object p2, p0, Laf/m0$d;->b:Ljava/lang/Boolean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq/e;LT/l;I)V
    .locals 3

    const-string v0, "$this$AnimatedVisibility"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.speed.component.SpeedTestButtonsContainer.<anonymous>.<anonymous>.<anonymous> (SpeedTabSpeedtestCardUi.kt:176)"

    const v1, 0x741fb7a6

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    new-instance p3, Laf/m0$d$a;

    iget-object v0, p0, Laf/m0$d;->a:Lmh/l;

    iget-object v1, p0, Laf/m0$d;->b:Ljava/lang/Boolean;

    invoke-direct {p3, v0, v1}, Laf/m0$d$a;-><init>(Lmh/l;Ljava/lang/Boolean;)V

    const v0, -0x1647365f

    const/4 v1, 0x1

    const/16 v2, 0x36

    invoke-static {v0, v1, p3, p2, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object p3

    const/4 v0, 0x0

    invoke-static {p1, p3, p2, v2, v0}, LBe/G;->b(Landroidx/compose/ui/e;Lmh/p;LT/l;II)V

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

    invoke-virtual {p0, p1, p2, p3}, Laf/m0$d;->a(Lq/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
