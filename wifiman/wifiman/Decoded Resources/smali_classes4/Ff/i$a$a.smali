.class final LFf/i$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFf/i$a;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LFf/e;

.field final synthetic b:LT/o0;


# direct methods
.method constructor <init>(LFf/e;LT/o0;)V
    .locals 0

    iput-object p1, p0, LFf/i$a$a;->a:LFf/e;

    iput-object p2, p0, LFf/i$a$a;->b:LT/o0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LFf/e;LT/o0;LS8/c;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, LFf/i$a$a;->c(LFf/e;LT/o0;LS8/c;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LFf/e;LT/o0;LS8/c;)LYg/J;
    .locals 2

    invoke-virtual {p0, p2}, LFf/e;->F0(LS8/c;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {p1, v0, v1}, LFf/i;->j(LT/o0;J)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(Lz/j;LT/l;I)V
    .locals 8

    const-string v0, "$this$UiCardCollapsible"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 v0, 0x10

    if-ne p1, v0, :cond_1

    invoke-interface {p2}, LT/l;->v()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, LT/l;->C()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.wifi.scan.WifiScanUiContent.<anonymous>.<anonymous> (WifiScanUiContent.kt:88)"

    const v1, 0x27f3942a

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    sget-object p3, Lla/a;->a:Lla/a;

    sget v0, Lla/a;->b:I

    invoke-virtual {p3, p2, v0}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v1

    invoke-virtual {v1}, Lra/a;->a()Lra/b;

    move-result-object v1

    invoke-virtual {v1}, Lra/b;->a()Lra/b$a$a;

    move-result-object v1

    invoke-virtual {v1}, Lra/b$a$a;->c()F

    move-result v1

    invoke-virtual {p3, p2, v0}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object p3

    invoke-virtual {p3}, Lra/a;->a()Lra/b;

    move-result-object p3

    invoke-virtual {p3}, Lra/b;->b()Lra/b$a$b;

    move-result-object p3

    invoke-virtual {p3}, Lra/b$a$b;->d()F

    move-result p3

    invoke-static {p1, v1, p3}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v2

    iget-object p1, p0, LFf/i$a$a;->a:LFf/e;

    invoke-virtual {p1}, LFf/e;->u0()LLi/N;

    move-result-object p1

    const/4 p3, 0x0

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, p2, p3, v0}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object p1

    invoke-interface {p1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, LAf/B;

    const p1, -0x57868fc2

    invoke-interface {p2, p1}, LT/l;->U(I)V

    iget-object p1, p0, LFf/i$a$a;->a:LFf/e;

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p1

    iget-object p3, p0, LFf/i$a$a;->a:LFf/e;

    iget-object v0, p0, LFf/i$a$a;->b:LT/o0;

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez p1, :cond_3

    sget-object p1, LT/l;->a:LT/l$a;

    invoke-virtual {p1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p1

    if-ne v1, p1, :cond_4

    :cond_3
    new-instance v1, LFf/h;

    invoke-direct {v1, p3, v0}, LFf/h;-><init>(LFf/e;LT/o0;)V

    invoke-interface {p2, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    move-object v4, v1

    check-cast v4, Lmh/l;

    invoke-interface {p2}, LT/l;->J()V

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v5, p2

    invoke-static/range {v2 .. v7}, LAf/E;->c(Landroidx/compose/ui/e;LAf/B;Lmh/l;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    :goto_1
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/j;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LFf/i$a$a;->b(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
