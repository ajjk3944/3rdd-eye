.class final LZe/c$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZe/c$b;->a(Lz/N;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Laf/I;

.field final synthetic b:LZe/a;


# direct methods
.method constructor <init>(Laf/I;LZe/a;)V
    .locals 0

    iput-object p1, p0, LZe/c$b$a;->a:Laf/I;

    iput-object p2, p0, LZe/c$b$a;->b:LZe/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq/e;LT/l;I)V
    .locals 4

    const-string v0, "$this$AnimatedVisibility"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.speed.SpeedTabUi.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SpeedTabUi.kt:68)"

    const v1, 0x3044d3f5

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object p1, p0, LZe/c$b$a;->a:Laf/I;

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    iget-object p3, p0, LZe/c$b$a;->b:LZe/a;

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    const v1, -0x54edae3a

    invoke-interface {p2, v1}, LT/l;->U(I)V

    invoke-interface {p2, p3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_2

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_3

    :cond_2
    new-instance v2, LZe/c$b$a$a;

    invoke-direct {v2, p3}, LZe/c$b$a$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {p2, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    check-cast v2, Lth/g;

    invoke-interface {p2}, LT/l;->J()V

    check-cast v2, Lmh/l;

    const/4 p3, 0x6

    invoke-static {v0, p1, v2, p2, p3}, Laf/N;->b(Landroidx/compose/ui/e;Laf/I;Lmh/l;LT/l;I)V

    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LZe/c$b$a;->a(Lq/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
