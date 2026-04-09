.class final LJe/j$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJe/j$a$a;->a(Lz/Y;LT/l;I)V
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

    iput-object p1, p0, LJe/j$a$a$a;->a:LJe/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/Y;LT/l;I)V
    .locals 9

    const-string v0, "$this$UiToolbarSideContainer"

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

    const-string v0, "com.ui.wifiman.ui.device.DeviceDetail.<anonymous>.<anonymous>.<anonymous> (DeviceDetailUi.kt:51)"

    const v1, 0x13bb160a

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    new-instance v5, Ls9/d$b;

    sget p1, Lm8/c;->e:I

    invoke-direct {v5, p1}, Ls9/d$b;-><init>(I)V

    iget-object p1, p0, LJe/j$a$a$a;->a:LJe/c;

    const p3, -0x6b054957

    invoke-interface {p2, p3}, LT/l;->U(I)V

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p3

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    if-nez p3, :cond_3

    sget-object p3, LT/l;->a:LT/l$a;

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v0, p3, :cond_4

    :cond_3
    new-instance v0, LJe/j$a$a$a$a;

    invoke-direct {v0, p1}, LJe/j$a$a$a$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {p2, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v0, Lth/g;

    invoke-interface {p2}, LT/l;->J()V

    move-object v3, v0

    check-cast v3, Lmh/a;

    const/4 v7, 0x0

    const/4 v8, 0x5

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v6, p2

    invoke-static/range {v2 .. v8}, LHe/i;->c(Landroidx/compose/ui/e;Lmh/a;ZLs9/d;LT/l;II)V

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

    invoke-virtual {p0, p1, p2, p3}, LJe/j$a$a$a;->a(Lz/Y;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
