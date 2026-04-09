.class final Lcom/ui/wifiman/ui/component/network/B$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/s;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/component/network/B;->k(Landroidx/compose/ui/e;Lmh/q;ZFLmh/r;Lmh/s;Lmh/s;Lmh/t;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Z


# direct methods
.method constructor <init>(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/ui/wifiman/ui/component/network/B$a;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic K(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    move-object v1, p1

    check-cast v1, LA/c;

    check-cast p2, LY0/h;

    invoke-virtual {p2}, LY0/h;->s()F

    move-result v2

    move-object v3, p3

    check-cast v3, Lcom/ui/wifiman/ui/component/network/q$a;

    move-object v4, p4

    check-cast v4, LT/l;

    check-cast p5, Ljava/lang/Number;

    invoke-virtual {p5}, Ljava/lang/Number;->intValue()I

    move-result v5

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/ui/wifiman/ui/component/network/B$a;->a(LA/c;FLcom/ui/wifiman/ui/component/network/q$a;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final a(LA/c;FLcom/ui/wifiman/ui/component/network/q$a;LT/l;I)V
    .locals 9

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connection"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p5, 0x6

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-interface {p4, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, p5

    goto :goto_1

    :cond_1
    move v0, p5

    :goto_1
    and-int/lit8 v2, p5, 0x30

    if-nez v2, :cond_3

    invoke-interface {p4, p2}, LT/l;->g(F)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v0, v2

    :cond_3
    and-int/lit16 p5, p5, 0x180

    if-nez p5, :cond_5

    invoke-interface {p4, p3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p5

    if-eqz p5, :cond_4

    const/16 p5, 0x100

    goto :goto_3

    :cond_4
    const/16 p5, 0x80

    :goto_3
    or-int/2addr v0, p5

    :cond_5
    and-int/lit16 p5, v0, 0x493

    const/16 v2, 0x492

    if-ne p5, v2, :cond_7

    invoke-interface {p4}, LT/l;->v()Z

    move-result p5

    if-nez p5, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {p4}, LT/l;->C()V

    goto :goto_5

    :cond_7
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result p5

    if-eqz p5, :cond_8

    const/4 p5, -0x1

    const-string v2, "com.ui.wifiman.ui.component.network.BaseNetworkTopology.<anonymous> (NetworkTopology.kt:173)"

    const v3, 0x5dfd884e

    invoke-static {v3, v0, p5, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_8
    sget-object p5, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    iget-boolean v2, p0, Lcom/ui/wifiman/ui/component/network/B$a;->a:Z

    if-eqz v2, :cond_9

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, p5, v3, v2, v3}, LA/c;->b(LA/c;Landroidx/compose/ui/e;Lr/H;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p5

    :cond_9
    move-object v2, p5

    const/16 p1, 0x40

    int-to-float p1, p1

    invoke-static {p1}, LY0/h;->j(F)F

    move-result p1

    int-to-float p5, v1

    div-float/2addr p1, p5

    invoke-static {p1}, LY0/h;->j(F)F

    move-result v4

    const/16 v7, 0xd

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p1

    invoke-static {p1, p2}, Landroidx/compose/foundation/layout/r;->s(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object p1

    shr-int/lit8 p2, v0, 0x3

    and-int/lit8 p2, p2, 0x70

    invoke-static {p1, p3, p4, p2}, Lcom/ui/wifiman/ui/component/network/B;->p(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/q$a;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-static {}, LT/o;->P()V

    :cond_a
    :goto_5
    return-void
.end method
