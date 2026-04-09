.class final LFf/t$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFf/t$c;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LFf/e;

.field final synthetic b:Lof/a$c;

.field final synthetic c:LT/z1;


# direct methods
.method constructor <init>(LFf/e;Lof/a$c;LT/z1;)V
    .locals 0

    iput-object p1, p0, LFf/t$c$a;->a:LFf/e;

    iput-object p2, p0, LFf/t$c$a;->b:Lof/a$c;

    iput-object p3, p0, LFf/t$c$a;->c:LT/z1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LFf/e;LT/L;)LT/K;
    .locals 0

    invoke-static {p0, p1}, LFf/t$c$a;->c(LFf/e;LT/L;)LT/K;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LFf/e;LT/L;)LT/K;
    .locals 1

    const-string v0, "$this$DisposableEffect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, LFf/e;->A0(Z)V

    new-instance p1, LFf/t$c$a$a;

    invoke-direct {p1, p0}, LFf/t$c$a$a;-><init>(LFf/e;)V

    return-object p1
.end method


# virtual methods
.method public final b(ZLT/l;I)V
    .locals 8

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

    const-string v1, "com.ui.wifiman.ui.wifi.scan.WifiScanUi.<anonymous>.<anonymous> (WifiScanUi.kt:64)"

    const v2, 0x24ad210f

    invoke-static {v2, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    const/4 p3, 0x0

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_7

    const p1, -0x30906f9b

    invoke-interface {p2, p1}, LT/l;->U(I)V

    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {p1, v1, v0, p3}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p1

    iget-object p3, p0, LFf/t$c$a;->c:LT/z1;

    invoke-static {p3}, LFf/t;->i(LT/z1;)LBe/b0;

    move-result-object p3

    new-instance v0, Ls9/d$b;

    sget v1, Lm8/c;->f5:I

    invoke-direct {v0, v1}, Ls9/d$b;-><init>(I)V

    const/4 v1, 0x6

    invoke-static {p1, p3, v0, p2, v1}, LHe/f;->b(Landroidx/compose/ui/e;LBe/b0;Ls9/d;LT/l;I)V

    iget-object p1, p0, LFf/t$c$a;->c:LT/z1;

    invoke-static {p1}, LFf/t;->i(LT/z1;)LBe/b0;

    move-result-object p1

    const p3, 0x2ffb8130

    invoke-interface {p2, p3}, LT/l;->U(I)V

    iget-object p3, p0, LFf/t$c$a;->a:LFf/e;

    invoke-interface {p2, p3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p3

    iget-object v0, p0, LFf/t$c$a;->a:LFf/e;

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez p3, :cond_5

    sget-object p3, LT/l;->a:LT/l$a;

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v1, p3, :cond_6

    :cond_5
    new-instance v1, LFf/v;

    invoke-direct {v1, v0}, LFf/v;-><init>(LFf/e;)V

    invoke-interface {p2, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v1, Lmh/l;

    invoke-interface {p2}, LT/l;->J()V

    const/4 p3, 0x0

    invoke-static {p1, v1, p2, p3}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-interface {p2}, LT/l;->J()V

    goto :goto_2

    :cond_7
    const p1, -0x3088bf3a

    invoke-interface {p2, p1}, LT/l;->U(I)V

    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {p1, v1, v0, p3}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    iget-object v3, p0, LFf/t$c$a;->a:LFf/e;

    iget-object v4, p0, LFf/t$c$a;->b:Lof/a$c;

    iget-object p1, p0, LFf/t$c$a;->c:LT/z1;

    invoke-static {p1}, LFf/t;->i(LT/z1;)LBe/b0;

    move-result-object v5

    const/4 v7, 0x6

    move-object v6, p2

    invoke-static/range {v2 .. v7}, LFf/t;->h(Landroidx/compose/ui/e;LFf/e;Lof/a$c;LBe/b0;LT/l;I)V

    invoke-interface {p2}, LT/l;->J()V

    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
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

    invoke-virtual {p0, p1, p2, p3}, LFf/t$c$a;->b(ZLT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
