.class final Ldf/h$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldf/h$a;->a(Lz/j;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LCi/c;

.field final synthetic b:Ldf/c;


# direct methods
.method constructor <init>(LCi/c;Ldf/c;)V
    .locals 0

    iput-object p1, p0, Ldf/h$a$b;->a:LCi/c;

    iput-object p2, p0, Ldf/h$a$b;->b:Ldf/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq/e;LT/l;I)V
    .locals 9

    const-string v0, "$this$AnimatedVisibility"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.speed.isp.IspDetailUi.<anonymous>.<anonymous>.<anonymous> (IspDetailUi.kt:131)"

    const v1, 0x5de0a7f0

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 p3, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v1, p3, v0}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    const/16 p1, 0x10

    int-to-float p1, p1

    invoke-static {p1}, LY0/h;->j(F)F

    move-result v4

    const/16 v7, 0xd

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p1

    iget-object p3, p0, Ldf/h$a$b;->a:LCi/c;

    iget-object v0, p0, Ldf/h$a$b;->b:Ldf/c;

    const v1, -0x6deab3b4

    invoke-interface {p2, v1}, LT/l;->U(I)V

    invoke-interface {p2, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_1

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_2

    :cond_1
    new-instance v2, Ldf/h$a$b$a;

    invoke-direct {v2, v0}, Ldf/h$a$b$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {p2, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast v2, Lth/g;

    invoke-interface {p2}, LT/l;->J()V

    check-cast v2, Lmh/l;

    const/4 v0, 0x6

    invoke-static {p1, p3, v2, p2, v0}, Ldf/h;->l(Landroidx/compose/ui/e;LCi/c;Lmh/l;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Ldf/h$a$b;->a(Lq/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
