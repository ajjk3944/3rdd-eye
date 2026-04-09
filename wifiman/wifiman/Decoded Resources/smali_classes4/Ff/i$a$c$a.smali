.class final LFf/i$a$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFf/i$a$c;->a(Lz/j;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LFf/i$a$c$a$a;
    }
.end annotation


# instance fields
.field final synthetic a:LGf/k;

.field final synthetic b:LFf/e;


# direct methods
.method constructor <init>(LGf/k;LFf/e;)V
    .locals 0

    iput-object p1, p0, LFf/i$a$c$a;->a:LGf/k;

    iput-object p2, p0, LFf/i$a$c$a;->b:LFf/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LFf/e;)LYg/J;
    .locals 0

    invoke-static {p0}, LFf/i$a$c$a;->c(LFf/e;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LFf/e;)LYg/J;
    .locals 0

    invoke-virtual {p0}, LFf/e;->D0()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(Lq/b;LFf/b;LT/l;I)V
    .locals 10

    const-string v0, "$this$AnimatedContent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "state"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.wifi.scan.WifiScanUiContent.<anonymous>.<anonymous>.<anonymous> (WifiScanUiContent.kt:146)"

    const v1, -0x66e2acf3

    invoke-static {v1, p4, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p1, LFf/i$a$c$a$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    const/4 p2, 0x1

    if-eq p1, p2, :cond_3

    const/4 p2, 0x2

    if-eq p1, p2, :cond_2

    const/4 p2, 0x3

    if-ne p1, p2, :cond_1

    const p1, 0x75ba80ac

    invoke-interface {p3, p1}, LT/l;->U(I)V

    invoke-interface {p3}, LT/l;->J()V

    goto/16 :goto_1

    :cond_1
    const p1, -0x3602aacc

    invoke-interface {p3, p1}, LT/l;->U(I)V

    invoke-interface {p3}, LT/l;->J()V

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    const p1, 0x75b80605

    invoke-interface {p3, p1}, LT/l;->U(I)V

    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 p2, 0x10

    int-to-float p2, p2

    invoke-static {p2}, LY0/h;->j(F)F

    move-result p2

    invoke-static {p1, p2}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object p1

    const/4 p2, 0x6

    invoke-static {p1, p3, p2}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-interface {p3}, LT/l;->J()V

    goto :goto_1

    :cond_3
    const p1, 0x75ae533c

    invoke-interface {p3, p1}, LT/l;->U(I)V

    iget-object p1, p0, LFf/i$a$c$a;->a:LGf/k;

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    iget-object p4, p0, LFf/i$a$c$a;->b:LFf/e;

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, p2, v2}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    const v0, -0x52febb6e

    invoke-interface {p3, v0}, LT/l;->U(I)V

    invoke-interface {p3, p4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_5

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v4, v0, :cond_6

    :cond_5
    new-instance v4, LFf/k;

    invoke-direct {v4, p4}, LFf/k;-><init>(LFf/e;)V

    invoke-interface {p3, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    move-object v7, v4

    check-cast v7, Lmh/a;

    invoke-interface {p3}, LT/l;->J()V

    const/4 v8, 0x7

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v9}, Landroidx/compose/foundation/d;->d(Landroidx/compose/ui/e;ZLjava/lang/String;LJ0/g;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p4

    sget-object v0, Lla/a;->a:Lla/a;

    sget v3, Lla/a;->b:I

    invoke-virtual {v0, p3, v3}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v0

    invoke-virtual {v0}, Lra/a;->a()Lra/b;

    move-result-object v0

    invoke-virtual {v0}, Lra/b;->b()Lra/b$a$b;

    move-result-object v0

    invoke-virtual {v0}, Lra/b$a$b;->c()F

    move-result v0

    invoke-static {p4, v1, v0, p2, v2}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p2

    const/4 p4, 0x0

    invoke-static {p2, p1, p3, p4, p4}, LGf/m;->b(Landroidx/compose/ui/e;LGf/k;LT/l;II)V

    sget-object p1, LYg/J;->a:LYg/J;

    :goto_0
    invoke-interface {p3}, LT/l;->J()V

    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    return-void
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/b;

    check-cast p2, LFf/b;

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, LFf/i$a$c$a;->b(Lq/b;LFf/b;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
