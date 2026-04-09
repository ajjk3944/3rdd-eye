.class final LM/a$f;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM/a;->e(Landroidx/compose/ui/e;Lmh/a;Z)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/a;

.field final synthetic b:Z


# direct methods
.method constructor <init>(Lmh/a;Z)V
    .locals 0

    iput-object p1, p0, LM/a$f;->a:Lmh/a;

    iput-boolean p2, p0, LM/a$f;->b:Z

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;
    .locals 5

    const v0, -0xbba9706

    invoke-interface {p2, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.foundation.text.selection.drawSelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:134)"

    invoke-static {v0, p3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, LM/L;->b()LT/H0;

    move-result-object p3

    invoke-interface {p2, p3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LM/K;

    invoke-virtual {p3}, LM/K;->b()J

    move-result-wide v0

    invoke-interface {p2, v0, v1}, LT/l;->j(J)Z

    move-result p3

    iget-object v2, p0, LM/a$f;->a:Lmh/a;

    invoke-interface {p2, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr p3, v2

    iget-boolean v2, p0, LM/a$f;->b:Z

    invoke-interface {p2, v2}, LT/l;->c(Z)Z

    move-result v2

    or-int/2addr p3, v2

    iget-object v2, p0, LM/a$f;->a:Lmh/a;

    iget-boolean v3, p0, LM/a$f;->b:Z

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez p3, :cond_1

    sget-object p3, LT/l;->a:LT/l$a;

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v4, p3, :cond_2

    :cond_1
    new-instance v4, LM/a$f$a;

    invoke-direct {v4, v0, v1, v2, v3}, LM/a$f$a;-><init>(JLmh/a;Z)V

    invoke-interface {p2, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast v4, Lmh/l;

    invoke-static {p1, v4}, Landroidx/compose/ui/draw/b;->c(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object p1

    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
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

    invoke-virtual {p0, p1, p2, p3}, LM/a$f;->a(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;

    move-result-object p1

    return-object p1
.end method
