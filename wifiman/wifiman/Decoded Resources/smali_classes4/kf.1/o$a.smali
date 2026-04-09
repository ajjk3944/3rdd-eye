.class final Lkf/o$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkf/o;->c(Landroidx/compose/ui/e;Lkf/b;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LT/z1;

.field final synthetic b:Lkf/b;

.field final synthetic c:Lkf/a;


# direct methods
.method constructor <init>(LT/z1;Lkf/b;Lkf/a;)V
    .locals 0

    iput-object p1, p0, Lkf/o$a;->a:LT/z1;

    iput-object p2, p0, Lkf/o$a;->b:Lkf/b;

    iput-object p3, p0, Lkf/o$a;->c:Lkf/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 8

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.ui.wifiman.ui.speedtest.results.SpeedtestResultsUi.<anonymous> (SpeedtestResultsUi.kt:40)"

    const v2, 0x4f08c0c8

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, Lkf/o$a;->a:LT/z1;

    invoke-static {p2}, Lkf/o;->g(LT/z1;)LBe/b0;

    move-result-object p2

    invoke-virtual {p2}, LBe/b0;->c()LT/q0;

    move-result-object p2

    invoke-interface {p2}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v0

    new-instance p2, Lkf/o$a$a;

    iget-object v1, p0, Lkf/o$a;->b:Lkf/b;

    iget-object v2, p0, Lkf/o$a;->a:LT/z1;

    iget-object v3, p0, Lkf/o$a;->c:Lkf/a;

    invoke-direct {p2, v1, v2, v3}, Lkf/o$a$a;-><init>(Lkf/b;LT/z1;Lkf/a;)V

    const/16 v1, 0x36

    const v2, -0x55647d7

    const/4 v3, 0x1

    invoke-static {v2, v3, p2, p1, v1}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v4

    const/16 v6, 0x6c00

    const/4 v7, 0x6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-string v3, "SpeedtestResultsUi"

    move-object v5, p1

    invoke-static/range {v0 .. v7}, Lq/j;->a(Ljava/lang/Object;Landroidx/compose/ui/e;Lr/H;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lkf/o$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
