.class final LFf/i$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFf/i;->g(Landroidx/compose/ui/e;Lmh/q;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/e;

.field final synthetic b:Lmh/q;


# direct methods
.method constructor <init>(Landroidx/compose/ui/e;Lmh/q;)V
    .locals 0

    iput-object p1, p0, LFf/i$d;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LFf/i$d;->b:Lmh/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/f;LT/l;I)V
    .locals 4

    const-string v0, "$this$BoxWithConstraints"

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

    goto :goto_3

    :cond_3
    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, -0x1

    const-string v1, "com.ui.wifiman.ui.wifi.scan.WithItemType.<anonymous> (WifiScanUiContent.kt:309)"

    const v2, 0x16f98fa1

    invoke-static {v2, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    invoke-interface {p1}, Lz/f;->b()F

    move-result p1

    const/16 p3, 0x190

    int-to-float p3, p3

    invoke-static {p3}, LY0/h;->j(F)F

    move-result p3

    invoke-static {p1, p3}, LY0/h;->h(FF)I

    move-result p1

    if-lez p1, :cond_5

    const p1, 0x42fafae1    # 125.49f

    invoke-interface {p2, p1}, LT/l;->U(I)V

    iget-object p1, p0, LFf/i$d;->a:Landroidx/compose/ui/e;

    sget-object p3, LFf/a;->a:LFf/a;

    invoke-virtual {p3}, LFf/a;->c()Lmh/p;

    move-result-object p3

    new-instance v0, LFf/i$d$a;

    iget-object v1, p0, LFf/i$d;->a:Landroidx/compose/ui/e;

    iget-object v2, p0, LFf/i$d;->b:Lmh/q;

    invoke-direct {v0, v1, v2}, LFf/i$d$a;-><init>(Landroidx/compose/ui/e;Lmh/q;)V

    const/16 v1, 0x36

    const v2, 0x61f96f3c

    const/4 v3, 0x1

    invoke-static {v2, v3, v0, p2, v1}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v0

    const/16 v1, 0x1b0

    invoke-static {p1, p3, v0, p2, v1}, Lqa/d;->d(Landroidx/compose/ui/e;Lmh/p;Lmh/r;LT/l;I)V

    invoke-interface {p2}, LT/l;->J()V

    goto :goto_2

    :cond_5
    const p1, 0x430bd744

    invoke-interface {p2, p1}, LT/l;->U(I)V

    iget-object p1, p0, LFf/i$d;->b:Lmh/q;

    sget-object p3, LFf/c$a;->a:LFf/c$a;

    const/4 v0, 0x6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, p3, p2, v0}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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

    check-cast p1, Lz/f;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LFf/i$d;->a(Lz/f;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
