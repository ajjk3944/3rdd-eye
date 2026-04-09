.class final LFf/t$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFf/t;->e(Landroidx/compose/ui/e;LFf/e;Lof/a$c;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LFf/e;

.field final synthetic b:LT/z1;


# direct methods
.method constructor <init>(LFf/e;LT/z1;)V
    .locals 0

    iput-object p1, p0, LFf/t$d;->a:LFf/e;

    iput-object p2, p0, LFf/t$d;->b:LT/z1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LT/z1;)LYg/J;
    .locals 0

    invoke-static {p0}, LFf/t$d;->c(LT/z1;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LT/z1;)LYg/J;
    .locals 0

    invoke-static {p0}, LFf/t;->i(LT/z1;)LBe/b0;

    move-result-object p0

    invoke-virtual {p0}, LBe/b0;->d()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(Lz/N;LT/l;I)V
    .locals 11

    const-string v0, "scaffoldPadding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

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

    goto/16 :goto_2

    :cond_3
    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, -0x1

    const-string v1, "com.ui.wifiman.ui.wifi.scan.WifiScanUi.<anonymous> (WifiScanUi.kt:85)"

    const v2, 0x54b81689

    invoke-static {v2, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    iget-object p3, p0, LFf/t$d;->a:LFf/e;

    invoke-virtual {p3}, LFf/e;->r0()LLi/N;

    move-result-object p3

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p3, v0, p2, v1, v2}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object p3

    invoke-interface {p3}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p3

    move-object v3, p3

    check-cast v3, LFf/d;

    sget-object p3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v4, 0x0

    invoke-static {p3, v4, v2, v0}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p3

    invoke-static {p3, p1}, Landroidx/compose/foundation/layout/o;->h(Landroidx/compose/ui/e;Lz/N;)Landroidx/compose/ui/e;

    move-result-object v4

    new-instance p1, LFf/t$d$a;

    iget-object p3, p0, LFf/t$d;->a:LFf/e;

    invoke-direct {p1, p3}, LFf/t$d$a;-><init>(LFf/e;)V

    const/16 p3, 0x36

    const v0, 0x403a2ff3

    invoke-static {v0, v2, p1, p2, p3}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    const/16 v9, 0x6c00

    const/4 v10, 0x4

    const/4 v5, 0x0

    const-string v6, "WifiScanUiContent"

    move-object v8, p2

    invoke-static/range {v3 .. v10}, Lq/j;->a(Ljava/lang/Object;Landroidx/compose/ui/e;Lr/H;Ljava/lang/String;Lmh/q;LT/l;II)V

    iget-object p1, p0, LFf/t$d;->b:LT/z1;

    invoke-static {p1}, LFf/t;->i(LT/z1;)LBe/b0;

    move-result-object p1

    invoke-virtual {p1}, LBe/b0;->c()LT/q0;

    move-result-object p1

    invoke-interface {p1}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const p3, -0x74c37c0d

    invoke-interface {p2, p3}, LT/l;->U(I)V

    iget-object p3, p0, LFf/t$d;->b:LT/z1;

    invoke-interface {p2, p3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p3

    iget-object v0, p0, LFf/t$d;->b:LT/z1;

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez p3, :cond_5

    sget-object p3, LT/l;->a:LT/l$a;

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v2, p3, :cond_6

    :cond_5
    new-instance v2, LFf/w;

    invoke-direct {v2, v0}, LFf/w;-><init>(LT/z1;)V

    invoke-interface {p2, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v2, Lmh/a;

    invoke-interface {p2}, LT/l;->J()V

    invoke-static {p1, v2, p2, v1, v1}, Ld/a;->a(ZLmh/a;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    :goto_2
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/N;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LFf/t$d;->b(Lz/N;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
