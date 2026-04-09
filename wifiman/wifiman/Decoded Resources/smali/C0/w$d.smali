.class final LC0/w$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC0/w;->c(Landroidx/compose/ui/e;)Lmh/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/e;


# direct methods
.method constructor <init>(Landroidx/compose/ui/e;)V
    .locals 0

    iput-object p1, p0, LC0/w$d;->a:Landroidx/compose/ui/e;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;LT/l;I)V
    .locals 3

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.ui.layout.materializerOfWithCompositionLocalInjection.<anonymous> (Layout.kt:228)"

    const v2, -0x352954e

    invoke-static {v2, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const/4 p3, 0x0

    invoke-static {p2, p3}, LT/j;->a(LT/l;I)I

    move-result p3

    iget-object v0, p0, LC0/w$d;->a:Landroidx/compose/ui/e;

    invoke-static {p2, v0}, Landroidx/compose/ui/c;->f(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p2

    const v0, 0x1e65194f

    invoke-interface {p1, v0}, LT/l;->e(I)V

    invoke-static {p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v0

    sget-object v1, LE0/g;->K:LE0/g$a;

    invoke-virtual {v1}, LE0/g$a;->f()Lmh/p;

    move-result-object v2

    invoke-static {v0, p2, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v1}, LE0/g$a;->b()Lmh/p;

    move-result-object p2

    invoke-interface {v0}, LT/l;->o()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {v0}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    :cond_1
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {v0, p3, p2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_2
    invoke-interface {p1}, LT/l;->P()V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/Z0;

    invoke-virtual {p1}, LT/Z0;->f()LT/l;

    move-result-object p1

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LC0/w$d;->a(LT/l;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
