.class final LF/e0$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/e0;->d(Landroidx/compose/ui/e;LF/f0;Ly/m;Z)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LF/f0;

.field final synthetic b:Z

.field final synthetic c:Ly/m;


# direct methods
.method constructor <init>(LF/f0;ZLy/m;)V
    .locals 0

    iput-object p1, p0, LF/e0$c;->a:LF/f0;

    iput-boolean p2, p0, LF/e0$c;->b:Z

    iput-object p3, p0, LF/e0$c;->c:Ly/m;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;
    .locals 12

    const p1, 0x3001dc2a

    invoke-interface {p2, p1}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:68)"

    invoke-static {p1, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/k0;->m()LT/H0;

    move-result-object p1

    invoke-interface {p2, p1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p1

    sget-object p3, LY0/t;->Rtl:LY0/t;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p1, p3, :cond_1

    move p1, v0

    goto :goto_0

    :cond_1
    move p1, v1

    :goto_0
    iget-object p3, p0, LF/e0$c;->a:LF/f0;

    invoke-virtual {p3}, LF/f0;->f()Lw/q;

    move-result-object p3

    sget-object v2, Lw/q;->Vertical:Lw/q;

    if-eq p3, v2, :cond_3

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    move v7, v1

    goto :goto_2

    :cond_3
    :goto_1
    move v7, v0

    :goto_2
    iget-object p1, p0, LF/e0$c;->a:LF/f0;

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p1

    iget-object p3, p0, LF/e0$c;->a:LF/f0;

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez p1, :cond_4

    sget-object p1, LT/l;->a:LT/l$a;

    invoke-virtual {p1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p1

    if-ne v2, p1, :cond_5

    :cond_4
    new-instance v2, LF/e0$c$a;

    invoke-direct {v2, p3}, LF/e0$c$a;-><init>(LF/f0;)V

    invoke-interface {p2, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    check-cast v2, Lmh/l;

    invoke-static {v2, p2, v1}, Lw/z;->b(Lmh/l;LT/l;I)Lw/y;

    move-result-object p1

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p3

    iget-object v2, p0, LF/e0$c;->a:LF/f0;

    invoke-interface {p2, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr p3, v2

    iget-object v2, p0, LF/e0$c;->a:LF/f0;

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez p3, :cond_6

    sget-object p3, LT/l;->a:LT/l$a;

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v3, p3, :cond_7

    :cond_6
    new-instance v3, LF/e0$c$b;

    invoke-direct {v3, p1, v2}, LF/e0$c$b;-><init>(Lw/y;LF/f0;)V

    invoke-interface {p2, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    move-object v4, v3

    check-cast v4, LF/e0$c$b;

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    iget-object p1, p0, LF/e0$c;->a:LF/f0;

    invoke-virtual {p1}, LF/f0;->f()Lw/q;

    move-result-object v5

    iget-boolean p1, p0, LF/e0$c;->b:Z

    if-eqz p1, :cond_9

    iget-object p1, p0, LF/e0$c;->a:LF/f0;

    invoke-virtual {p1}, LF/f0;->c()F

    move-result p1

    const/4 p3, 0x0

    cmpg-float p1, p1, p3

    if-nez p1, :cond_8

    goto :goto_3

    :cond_8
    move v6, v0

    goto :goto_4

    :cond_9
    :goto_3
    move v6, v1

    :goto_4
    iget-object v9, p0, LF/e0$c;->c:Ly/m;

    const/16 v10, 0x10

    const/4 v11, 0x0

    const/4 v8, 0x0

    invoke-static/range {v3 .. v11}, Landroidx/compose/foundation/gestures/d;->i(Landroidx/compose/ui/e;Lw/y;Lw/q;ZZLw/n;Ly/m;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p1

    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_a

    invoke-static {}, LT/o;->P()V

    :cond_a
    invoke-interface {p2}, LT/l;->J()V

    return-object p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LF/e0$c;->a(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;

    move-result-object p1

    return-object p1
.end method
