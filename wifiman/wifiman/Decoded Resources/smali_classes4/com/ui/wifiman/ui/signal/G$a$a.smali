.class final Lcom/ui/wifiman/ui/signal/G$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/signal/G$a;->a(Lz/j;LT/l;I)V
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

    iput-object p1, p0, Lcom/ui/wifiman/ui/signal/G$a$a;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, Lcom/ui/wifiman/ui/signal/G$a$a;->b:Lcom/ui/wifiman/ui/signal/E;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 4

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.ui.wifiman.ui.signal.SignalTabPlaceDetailUi.<anonymous>.<anonymous> (SignalTabPlaceDetailUi.kt:41)"

    const v2, 0x69b1b0c5

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object p2, LL9/H;->a:LL9/H;

    new-instance v0, Lcom/ui/wifiman/ui/signal/G$a$a$a;

    iget-object v1, p0, Lcom/ui/wifiman/ui/signal/G$a$a;->a:Landroidx/compose/ui/e;

    iget-object v2, p0, Lcom/ui/wifiman/ui/signal/G$a$a;->b:Lcom/ui/wifiman/ui/signal/E;

    invoke-direct {v0, v1, v2}, Lcom/ui/wifiman/ui/signal/G$a$a$a;-><init>(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/signal/E;)V

    const/16 v1, 0x36

    const v2, -0x267be6af

    const/4 v3, 0x1

    invoke-static {v2, v3, v0, p1, v1}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v0

    sget v1, LL9/H;->b:I

    shl-int/lit8 v1, v1, 0x3

    or-int/lit8 v1, v1, 0x6

    const/4 v2, 0x0

    invoke-virtual {p2, v0, p1, v1, v2}, LL9/H;->e(Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/ui/signal/G$a$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
