.class final Lcom/ui/wifiman/ui/signal/G$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/signal/G$a$a;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/e;

.field final synthetic b:Lcom/ui/wifiman/ui/signal/E;


# direct methods
.method constructor <init>(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/signal/E;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/signal/G$a$a$a;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, Lcom/ui/wifiman/ui/signal/G$a$a$a;->b:Lcom/ui/wifiman/ui/signal/E;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/Y;LT/l;I)V
    .locals 11

    const-string v0, "$this$TextButton"

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

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.signal.SignalTabPlaceDetailUi.<anonymous>.<anonymous>.<anonymous> (SignalTabPlaceDetailUi.kt:42)"

    const v1, -0x267be6af

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p1, p0, Lcom/ui/wifiman/ui/signal/G$a$a$a;->a:Landroidx/compose/ui/e;

    const/4 p3, 0x6

    int-to-float p3, p3

    invoke-static {p3}, LY0/h;->j(F)F

    move-result p3

    invoke-static {p1, p3}, Landroidx/compose/foundation/layout/o;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v5, Lw9/h;->ALERT:Lw9/h;

    iget-object p1, p0, Lcom/ui/wifiman/ui/signal/G$a$a$a;->b:Lcom/ui/wifiman/ui/signal/E;

    const p3, -0x61d8e78f

    invoke-interface {p2, p3}, LT/l;->U(I)V

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p3

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez p3, :cond_3

    sget-object p3, LT/l;->a:LT/l$a;

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v1, p3, :cond_4

    :cond_3
    new-instance v1, Lcom/ui/wifiman/ui/signal/G$a$a$a$a;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/ui/signal/G$a$a$a$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {p2, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v1, Lth/g;

    invoke-interface {p2}, LT/l;->J()V

    sget p1, Lm8/c;->g:I

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v6

    check-cast v1, Lmh/a;

    const/high16 v9, 0x30000

    const/16 v10, 0x9c

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    move-object v8, p2

    invoke-static/range {v0 .. v10}, Lw9/k;->c(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Lw9/h;Ljava/lang/String;Lz/c$e;LT/l;II)V

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

    check-cast p1, Lz/Y;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/signal/G$a$a$a;->a(Lz/Y;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
