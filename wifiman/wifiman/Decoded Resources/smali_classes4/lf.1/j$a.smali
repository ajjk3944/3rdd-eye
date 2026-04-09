.class final Llf/j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llf/j;->b(Landroidx/compose/ui/e;Llf/l;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Llf/l;


# direct methods
.method constructor <init>(Llf/l;)V
    .locals 0

    iput-object p1, p0, Llf/j$a;->a:Llf/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/j;LT/l;I)V
    .locals 10

    const-string v0, "$this$ModalScaffold"

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

    const-string v0, "com.ui.wifiman.ui.speedtest.server.SpeedtestInternetServerPickerUi.<anonymous> (SpeedtestInternetServerPickerUi.kt:30)"

    const v1, -0x1e67d74f

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p1, p0, Llf/j$a;->a:Llf/l;

    invoke-virtual {p1}, Llf/l;->n0()LLi/N;

    move-result-object p1

    const/4 p3, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, p2, p3, v1}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object p1

    invoke-interface {p1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Llf/k;

    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 p3, 0x0

    invoke-static {p1, p3, v1, v0}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    new-instance p1, Llf/j$a$a;

    iget-object p3, p0, Llf/j$a;->a:Llf/l;

    invoke-direct {p1, p3}, Llf/j$a$a;-><init>(Llf/l;)V

    const/16 p3, 0x36

    const v0, 0x53cdf887

    invoke-static {v0, v1, p1, p2, p3}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v6

    const/16 v8, 0x6c30

    const/4 v9, 0x4

    const/4 v4, 0x0

    const-string v5, "content type"

    move-object v7, p2

    invoke-static/range {v2 .. v9}, Lq/j;->a(Ljava/lang/Object;Landroidx/compose/ui/e;Lr/H;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
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

    invoke-virtual {p0, p1, p2, p3}, Llf/j$a;->a(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
