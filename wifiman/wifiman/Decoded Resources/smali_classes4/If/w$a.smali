.class final LIf/w$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIf/w;->h(Landroidx/compose/ui/e;LIf/o;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:LIf/o;


# direct methods
.method constructor <init>(ZLIf/o;)V
    .locals 0

    iput-boolean p1, p0, LIf/w$a;->a:Z

    iput-object p2, p0, LIf/w$a;->b:LIf/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq/e;LT/l;I)V
    .locals 11

    const-string v0, "$this$AnimatedVisibility"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "com.ui.wifiman.ui.wmw.ButtonsContainer.<anonymous>.<anonymous> (WmwStatusPopupConnected.kt:248)"

    const v2, 0x3634da1f

    invoke-static {v2, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-boolean v0, p0, LIf/w$a;->a:Z

    if-eqz v0, :cond_3

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    sget v1, Lm8/c;->N5:I

    const/4 v2, 0x0

    invoke-static {v1, p2, v2}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v6

    iget-object v1, p0, LIf/w$a;->b:LIf/o;

    const v2, -0x1498befc

    invoke-interface {p2, v2}, LT/l;->U(I)V

    invoke-interface {p2, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_1

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_2

    :cond_1
    new-instance v3, LIf/w$a$a;

    invoke-direct {v3, v1}, LIf/w$a$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {p2, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast v3, Lth/g;

    invoke-interface {p2}, LT/l;->J()V

    move-object v1, v3

    check-cast v1, Lmh/a;

    const/4 v9, 0x6

    const/16 v10, 0xbc

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v8, p2

    invoke-static/range {v0 .. v10}, Lw9/r;->b(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Lw9/p;Ljava/lang/String;LL0/U;LT/l;II)V

    :cond_3
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_4

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

    invoke-virtual {p0, p1, p2, p3}, LIf/w$a;->a(Lq/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
