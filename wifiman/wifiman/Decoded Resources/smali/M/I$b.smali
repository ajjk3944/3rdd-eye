.class final LM/I$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM/I;->c(Landroidx/compose/ui/e;LM/G;)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LM/G;


# direct methods
.method constructor <init>(LM/G;)V
    .locals 0

    iput-object p1, p0, LM/I$b;->a:LM/G;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method

.method public static final synthetic a(LT/q0;)J
    .locals 2

    invoke-static {p0}, LM/I$b;->j(LT/q0;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic c(LT/q0;J)V
    .locals 0

    invoke-static {p0, p1, p2}, LM/I$b;->l(LT/q0;J)V

    return-void
.end method

.method private static final j(LT/q0;)J
    .locals 2

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LY0/r;

    invoke-virtual {p0}, LY0/r;->j()J

    move-result-wide v0

    return-wide v0
.end method

.method private static final l(LT/q0;J)V
    .locals 0

    invoke-static {p1, p2}, LY0/r;->b(J)LY0/r;

    move-result-object p1

    invoke-interface {p0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final h(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;
    .locals 5

    const v0, 0x760d4197

    invoke-interface {p2, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.foundation.text.selection.textFieldMagnifier.<anonymous> (TextFieldSelectionManager.android.kt:48)"

    invoke-static {v0, p3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object p3

    invoke-interface {p2, p3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LY0/d;

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_1

    sget-object v0, LY0/r;->b:LY0/r$a;

    invoke-virtual {v0}, LY0/r$a;->a()J

    move-result-wide v2

    invoke-static {v2, v3}, LY0/r;->b(J)LY0/r;

    move-result-object v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v3, v2, v3}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v0

    invoke-interface {p2, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1
    check-cast v0, LT/q0;

    iget-object v2, p0, LM/I$b;->a:LM/G;

    invoke-interface {p2, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    iget-object v3, p0, LM/I$b;->a:LM/G;

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_2

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v4, v2, :cond_3

    :cond_2
    new-instance v4, LM/I$b$a;

    invoke-direct {v4, v3, v0}, LM/I$b$a;-><init>(LM/G;LT/q0;)V

    invoke-interface {p2, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    check-cast v4, Lmh/a;

    invoke-interface {p2, p3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_4

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v3, v1, :cond_5

    :cond_4
    new-instance v3, LM/I$b$b;

    invoke-direct {v3, p3, v0}, LM/I$b$b;-><init>(LY0/d;LT/q0;)V

    invoke-interface {p2, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    check-cast v3, Lmh/l;

    invoke-static {p1, v4, v3}, LM/z;->d(Landroidx/compose/ui/e;Lmh/a;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object p1

    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
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

    invoke-virtual {p0, p1, p2, p3}, LM/I$b;->h(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;

    move-result-object p1

    return-object p1
.end method
