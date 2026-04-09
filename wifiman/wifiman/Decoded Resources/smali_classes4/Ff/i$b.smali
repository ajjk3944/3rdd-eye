.class final LFf/i$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFf/i;->c(LFf/e;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LFf/e;

.field final synthetic b:LA/B;


# direct methods
.method constructor <init>(LFf/e;LA/B;)V
    .locals 0

    iput-object p1, p0, LFf/i$b;->a:LFf/e;

    iput-object p2, p0, LFf/i$b;->b:LA/B;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/N;LT/l;I)V
    .locals 11

    const-string v0, "innerPadding"

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

    const-string v1, "com.ui.wifiman.ui.wifi.scan.WifiScanUiContent.<anonymous> (WifiScanUiContent.kt:206)"

    const v2, 0x2e02e5fa

    invoke-static {v2, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    sget-object p3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p3, v0, v2, v1}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    new-instance v1, LFf/i$b$a;

    iget-object v3, p0, LFf/i$b;->a:LFf/e;

    iget-object v4, p0, LFf/i$b;->b:LA/B;

    invoke-direct {v1, p1, v3, v4}, LFf/i$b$a;-><init>(Lz/N;LFf/e;LA/B;)V

    const v3, -0x282c45d2

    const/16 v4, 0x36

    invoke-static {v3, v2, v1, p2, v4}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v1

    invoke-static {v0, v1, p2, v4}, LFf/i;->k(Landroidx/compose/ui/e;Lmh/q;LT/l;I)V

    invoke-static {p3, p1}, Landroidx/compose/foundation/layout/o;->h(Landroidx/compose/ui/e;Lz/N;)Landroidx/compose/ui/e;

    move-result-object v5

    sget-object p1, Lla/a;->a:Lla/a;

    sget p3, Lla/a;->b:I

    invoke-virtual {p1, p2, p3}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p1

    invoke-virtual {p1}, Lma/a;->e()Lma/a$e;

    move-result-object p1

    invoke-virtual {p1}, Lma/a$e;->a()J

    move-result-wide v6

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v8, p2

    invoke-static/range {v5 .. v10}, LEe/B;->b(Landroidx/compose/ui/e;JLT/l;II)V

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

    check-cast p1, Lz/N;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LFf/i$b;->a(Lz/N;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
