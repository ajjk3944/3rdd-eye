.class final Lkf/o$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkf/o$a;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkf/b;

.field final synthetic b:LT/z1;

.field final synthetic c:Lkf/a;


# direct methods
.method constructor <init>(Lkf/b;LT/z1;Lkf/a;)V
    .locals 0

    iput-object p1, p0, Lkf/o$a$a;->a:Lkf/b;

    iput-object p2, p0, Lkf/o$a$a;->b:LT/z1;

    iput-object p3, p0, Lkf/o$a$a;->c:Lkf/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(ZLT/l;I)V
    .locals 10

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-interface {p2, p1}, LT/l;->c(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr p3, v0

    :cond_1
    and-int/lit8 v0, p3, 0x13

    const/16 v1, 0x12

    if-ne v0, v1, :cond_3

    invoke-interface {p2}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {p2}, LT/l;->C()V

    goto/16 :goto_3

    :cond_3
    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, -0x1

    const-string v1, "com.ui.wifiman.ui.speedtest.results.SpeedtestResultsUi.<anonymous>.<anonymous> (SpeedtestResultsUi.kt:44)"

    const v2, -0x55647d7

    invoke-static {v2, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    const/4 p3, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_5

    const p1, -0x6a178086

    invoke-interface {p2, p1}, LT/l;->U(I)V

    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v2, 0x0

    invoke-static {p1, v2, v1, v0}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p1

    invoke-static {p1}, Lz/j0;->c(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p1

    iget-object v0, p0, Lkf/o$a$a;->b:LT/z1;

    invoke-static {v0}, Lkf/o;->g(LT/z1;)LBe/b0;

    move-result-object v0

    new-instance v1, Ls9/d$b;

    sget v2, Lm8/c;->x3:I

    invoke-direct {v1, v2}, Ls9/d$b;-><init>(I)V

    invoke-static {p1, v0, v1, p2, p3}, LHe/f;->b(Landroidx/compose/ui/e;LBe/b0;Ls9/d;LT/l;I)V

    invoke-interface {p2}, LT/l;->J()V

    goto :goto_2

    :cond_5
    const p1, -0x6a108474

    invoke-interface {p2, p1}, LT/l;->U(I)V

    invoke-static {}, Lxe/B;->K()LT/H0;

    move-result-object p1

    invoke-interface {p2, p1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lxe/f$b;

    iget-object v2, p0, Lkf/o$a$a;->a:Lkf/b;

    invoke-virtual {v2}, Lkf/b;->p0()LLi/N;

    move-result-object v2

    invoke-static {v2, v0, p2, p3, v1}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object p3

    invoke-interface {p3}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v2

    new-instance p3, Lkf/o$a$a$a;

    iget-object v0, p0, Lkf/o$a$a;->a:Lkf/b;

    iget-object v3, p0, Lkf/o$a$a;->c:Lkf/a;

    iget-object v4, p0, Lkf/o$a$a;->b:LT/z1;

    invoke-direct {p3, v0, p1, v3, v4}, Lkf/o$a$a$a;-><init>(Lkf/b;Lxe/f$b;Lkf/a;LT/z1;)V

    const/16 p1, 0x36

    const v0, -0x1172f3da

    invoke-static {v0, v1, p3, p2, p1}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v6

    const/16 v8, 0x6c00

    const/4 v9, 0x6

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v5, "SpeedtestResultsLocation"

    move-object v7, p2

    invoke-static/range {v2 .. v9}, Lq/j;->a(Ljava/lang/Object;Landroidx/compose/ui/e;Lr/H;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-interface {p2}, LT/l;->J()V

    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
    :goto_3
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lkf/o$a$a;->a(ZLT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
