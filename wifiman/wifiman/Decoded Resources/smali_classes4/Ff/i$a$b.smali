.class final LFf/i$a$b;
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

    iput-object p1, p0, LFf/i$a$b;->a:LFf/e;

    iput-object p2, p0, LFf/i$a$b;->b:LT/o0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/j;LT/l;I)V
    .locals 12

    const-string v0, "$this$UiCardCollapsible"

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

    goto :goto_2

    :cond_3
    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, -0x1

    const-string v1, "com.ui.wifiman.ui.wifi.scan.WifiScanUiContent.<anonymous>.<anonymous> (WifiScanUiContent.kt:169)"

    const v2, 0x15bbf749

    invoke-static {v2, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    invoke-static {}, LBe/m0;->m()LT/H0;

    move-result-object v0

    invoke-interface {p2, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBe/n0;

    invoke-virtual {v0}, LBe/n0;->a()LT/z1;

    move-result-object v0

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/lit8 v3, v0, 0x1

    new-instance v0, LFf/i$a$b$a;

    iget-object v2, p0, LFf/i$a$b;->a:LFf/e;

    iget-object v4, p0, LFf/i$a$b;->b:LT/o0;

    invoke-direct {v0, v2, v4}, LFf/i$a$b$a;-><init>(LFf/e;LT/o0;)V

    const/16 v2, 0x36

    const v4, -0xbfa688f

    invoke-static {v4, v1, v0, p2, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v8

    and-int/lit8 p3, p3, 0xe

    const/high16 v0, 0x180000

    or-int v10, p3, v0

    const/16 v11, 0x1e

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p1

    move-object v9, p2

    invoke-static/range {v2 .. v11}, Lq/d;->d(Lz/j;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    :goto_2
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/j;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LFf/i$a$b;->a(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
