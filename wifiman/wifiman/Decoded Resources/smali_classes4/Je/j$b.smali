.class final LJe/j$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJe/j;->b(LJe/c;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LJe/c;


# direct methods
.method constructor <init>(LJe/c;)V
    .locals 0

    iput-object p1, p0, LJe/j$b;->a:LJe/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/N;LT/l;I)V
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

    goto :goto_2

    :cond_3
    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, -0x1

    const-string v1, "com.ui.wifiman.ui.device.DeviceDetail.<anonymous> (DeviceDetailUi.kt:61)"

    const v2, 0x7ddff9d5

    invoke-static {v2, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    iget-object p3, p0, LJe/j$b;->a:LJe/c;

    invoke-virtual {p3}, LJe/c;->o0()LLi/N;

    move-result-object p3

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p3, v1, p2, v0, v2}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object p3

    invoke-interface {p3}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p3

    move-object v3, p3

    check-cast v3, LJe/a;

    sget-object p3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v0, 0x0

    invoke-static {p3, v0, v2, v1}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p3

    invoke-static {p3, p1}, Landroidx/compose/foundation/layout/o;->h(Landroidx/compose/ui/e;Lz/N;)Landroidx/compose/ui/e;

    move-result-object v4

    new-instance p1, LJe/j$b$a;

    iget-object p3, p0, LJe/j$b;->a:LJe/c;

    invoke-direct {p1, p3}, LJe/j$b$a;-><init>(LJe/c;)V

    const/16 p3, 0x36

    const v0, 0x6a19c12b

    invoke-static {v0, v2, p1, p2, p3}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    const/16 v9, 0x6c00

    const/4 v10, 0x4

    const/4 v5, 0x0

    const-string v6, "DeviceDetail"

    move-object v8, p2

    invoke-static/range {v3 .. v10}, Lq/j;->a(Ljava/lang/Object;Landroidx/compose/ui/e;Lr/H;Ljava/lang/String;Lmh/q;LT/l;II)V

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

    invoke-virtual {p0, p1, p2, p3}, LJe/j$b;->a(Lz/N;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
