.class final Laf/a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laf/a$a;->a(Lz/Y;Laf/Q;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Laf/Q;


# direct methods
.method constructor <init>(Laf/Q;)V
    .locals 0

    iput-object p1, p0, Laf/a$a$a;->a:Laf/Q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq/e;LT/l;I)V
    .locals 8

    const-string v0, "$this$AnimatedVisibility"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "com.ui.wifiman.ui.speed.component.ComposableSingletons$SpeedTabSpeedFactorCardUiKt.lambda-1.<anonymous>.<anonymous>.<anonymous> (SpeedTabSpeedFactorCardUi.kt:301)"

    const v2, -0x41615a75

    invoke-static {v2, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object v0, p0, Laf/a$a$a;->a:Laf/Q;

    invoke-virtual {v0}, Laf/Q;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Laf/a$a$a;->a:Laf/Q;

    invoke-virtual {v0}, Laf/Q;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    const v0, 0x367304bc

    invoke-interface {p2, v0}, LT/l;->U(I)V

    sget-object v0, Lla/a;->a:Lla/a;

    sget v1, Lla/a;->b:I

    invoke-virtual {v0, p2, v1}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a;->a()Lma/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$a;->i()J

    move-result-wide v0

    invoke-interface {p2}, LT/l;->J()V

    goto :goto_0

    :cond_1
    const v0, 0x36730d96

    invoke-interface {p2, v0}, LT/l;->U(I)V

    sget-object v0, Lla/a;->a:Lla/a;

    sget v1, Lla/a;->b:I

    invoke-virtual {v0, p2, v1}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a;->a()Lma/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$a;->d()Lr9/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lr9/a$a;->d()J

    move-result-wide v0

    invoke-interface {p2}, LT/l;->J()V

    :goto_0
    const/16 v6, 0x180

    const/16 v7, 0xa

    const/4 v2, 0x0

    const-string v3, "statusDotColor"

    const/4 v4, 0x0

    move-object v5, p2

    invoke-static/range {v0 .. v7}, Lq/u;->a(JLr/i;Ljava/lang/String;Lmh/l;LT/l;II)LT/z1;

    move-result-object v0

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v2, 0x8

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v4

    const/16 v6, 0xb

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm0/v0;

    invoke-virtual {v0}, Lm0/v0;->u()J

    move-result-wide v2

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, v1

    move-wide v1, v2

    move-object v3, p2

    invoke-static/range {v0 .. v5}, LBe/E;->b(Landroidx/compose/ui/e;JLT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

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

    invoke-virtual {p0, p1, p2, p3}, Laf/a$a$a;->a(Lq/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
