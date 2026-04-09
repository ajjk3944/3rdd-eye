.class final LYe/i$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYe/i;->c(Landroidx/compose/ui/e;LYe/f;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LTe/k;

.field final synthetic b:LYe/f;


# direct methods
.method constructor <init>(LTe/k;LYe/f;)V
    .locals 0

    iput-object p1, p0, LYe/i$b;->a:LTe/k;

    iput-object p2, p0, LYe/i$b;->b:LYe/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq/e;LT/l;I)V
    .locals 9

    const-string v0, "$this$AnimatedVisibility"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.signal.floorplan.scan.FloorplanContainer.<anonymous>.<anonymous> (FloorplanMapperAvailableUi.kt:234)"

    const v1, -0x4d66c4c7

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object v3, p0, LYe/i$b;->a:LTe/k;

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, LYe/i$b;->b:LYe/f;

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const p3, 0x55ef316c

    invoke-interface {p2, p3}, LT/l;->U(I)V

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p3

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    if-nez p3, :cond_2

    sget-object p3, LT/l;->a:LT/l$a;

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v0, p3, :cond_3

    :cond_2
    new-instance v0, LYe/i$b$a;

    invoke-direct {v0, p1}, LYe/i$b$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {p2, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    check-cast v0, Lth/g;

    invoke-interface {p2}, LT/l;->J()V

    const p3, 0x55ef3c00

    invoke-interface {p2, p3}, LT/l;->U(I)V

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p3

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez p3, :cond_4

    sget-object p3, LT/l;->a:LT/l$a;

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v1, p3, :cond_5

    :cond_4
    new-instance v1, LYe/i$b$b;

    invoke-direct {v1, p1}, LYe/i$b$b;-><init>(Ljava/lang/Object;)V

    invoke-interface {p2, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    check-cast v1, Lth/g;

    invoke-interface {p2}, LT/l;->J()V

    move-object v4, v1

    check-cast v4, Lmh/a;

    move-object v5, v0

    check-cast v5, Lmh/a;

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v6, p2

    invoke-static/range {v2 .. v8}, LTe/o;->d(Landroidx/compose/ui/e;LTe/k;Lmh/a;Lmh/a;LT/l;II)V

    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LYe/i$b;->a(Lq/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
