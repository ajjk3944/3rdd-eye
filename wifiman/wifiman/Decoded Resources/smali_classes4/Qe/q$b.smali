.class final LQe/q$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQe/q;->k(Landroidx/compose/ui/e;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LQe/d;


# direct methods
.method constructor <init>(LQe/d;)V
    .locals 0

    iput-object p1, p0, LQe/q$b;->a:LQe/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LQe/d;LJ9/a;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LQe/q$b;->c(LQe/d;LJ9/a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LQe/d;LJ9/a;)LYg/J;
    .locals 1

    const-string v0, "tab"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LJ9/a;->c()I

    move-result p1

    invoke-interface {p0, p1}, LQe/d;->b(I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(Lq/e;LT/l;I)V
    .locals 8

    const-string v0, "$this$AnimatedVisibility"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.root.WiFimanRootNavigation.<anonymous>.<anonymous> (WifimanRootUi.kt:133)"

    const v1, -0x263453f5

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 p3, 0x0

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, p3, v0, v1}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    iget-object p1, p0, LQe/q$b;->a:LQe/d;

    invoke-interface {p1}, LQe/d;->d()LLi/N;

    move-result-object p1

    const/4 p3, 0x0

    invoke-static {p1, v1, p2, p3, v0}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object p1

    invoke-interface {p1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, LJ9/j;

    const p1, -0x614723bf

    invoke-interface {p2, p1}, LT/l;->U(I)V

    iget-object p1, p0, LQe/q$b;->a:LQe/d;

    invoke-interface {p2, p1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result p1

    iget-object p3, p0, LQe/q$b;->a:LQe/d;

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    if-nez p1, :cond_1

    sget-object p1, LT/l;->a:LT/l$a;

    invoke-virtual {p1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p1

    if-ne v0, p1, :cond_2

    :cond_1
    new-instance v0, LQe/u;

    invoke-direct {v0, p3}, LQe/u;-><init>(LQe/d;)V

    invoke-interface {p2, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    move-object v4, v0

    check-cast v4, Lmh/l;

    invoke-interface {p2}, LT/l;->J()V

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v5, p2

    invoke-static/range {v2 .. v7}, LBe/a0;->g(Landroidx/compose/ui/e;LJ9/j;Lmh/l;LT/l;II)V

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

    invoke-virtual {p0, p1, p2, p3}, LQe/q$b;->b(Lq/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
