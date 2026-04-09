.class final LJe/j$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJe/j$b;->a(Lz/N;LT/l;I)V
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

    iput-object p1, p0, LJe/j$b$a;->a:LJe/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LJe/a;LT/l;I)V
    .locals 4

    const-string v0, "cnt"

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

    const-string v1, "com.ui.wifiman.ui.device.DeviceDetail.<anonymous>.<anonymous> (DeviceDetailUi.kt:69)"

    const v2, 0x6a19c12b

    invoke-static {v2, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    instance-of p3, p1, LJe/a$c;

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x6

    if-eqz p3, :cond_5

    const p1, -0x4c407b8c

    invoke-interface {p2, p1}, LT/l;->U(I)V

    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {p1, v2, v1, v0}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p1

    iget-object p3, p0, LJe/j$b$a;->a:LJe/c;

    invoke-static {p1, p3, p2, v3}, LJe/l;->b(Landroidx/compose/ui/e;LJe/c;LT/l;I)V

    invoke-interface {p2}, LT/l;->J()V

    goto :goto_2

    :cond_5
    instance-of p3, p1, LJe/a$b;

    if-eqz p3, :cond_6

    const p1, -0x4c40658b

    invoke-interface {p2, p1}, LT/l;->U(I)V

    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {p1, v2, v1, v0}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p1

    invoke-static {p1, p2, v3}, LJe/g;->b(Landroidx/compose/ui/e;LT/l;I)V

    invoke-interface {p2}, LT/l;->J()V

    goto :goto_2

    :cond_6
    instance-of p1, p1, LJe/a$a;

    if-eqz p1, :cond_8

    const p1, -0x4c4052ec

    invoke-interface {p2, p1}, LT/l;->U(I)V

    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {p1, v2, v1, v0}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p1

    iget-object p3, p0, LJe/j$b$a;->a:LJe/c;

    invoke-static {p1, p3, p2, v3}, LJe/e;->b(Landroidx/compose/ui/e;LJe/c;LT/l;I)V

    invoke-interface {p2}, LT/l;->J()V

    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    :goto_3
    return-void

    :cond_8
    const p1, -0x4c408275

    invoke-interface {p2, p1}, LT/l;->U(I)V

    invoke-interface {p2}, LT/l;->J()V

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LJe/a;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LJe/j$b$a;->a(LJe/a;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
