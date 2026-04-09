.class final LU5/a$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU5/a;->a(Landroidx/compose/ui/e;Lmh/p;Z)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lmh/p;


# direct methods
.method constructor <init>(ZLmh/p;)V
    .locals 0

    iput-boolean p1, p0, LU5/a$b;->a:Z

    iput-object p2, p0, LU5/a$b;->b:Lmh/p;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;
    .locals 2

    const-string v0, "$this$composed"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, -0x347dcf5f    # -1.7064258E7f

    invoke-interface {p2, p1}, LT/l;->e(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string/jumbo v1, "com.patrykandpatrick.vico.compose.gesture.zoomable.<anonymous> (Zoomable.kt:45)"

    invoke-static {p1, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object p1, p0, LU5/a$b;->b:Lmh/p;

    const p3, -0x1d58f75c

    invoke-interface {p2, p3}, LT/l;->e(I)V

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object p3

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne p3, v0, :cond_1

    new-instance p3, LU5/a$b$a;

    const/4 v0, 0x0

    invoke-direct {p3, p1, v0}, LU5/a$b$a;-><init>(Lmh/p;Ldh/e;)V

    invoke-interface {p2, p3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1
    invoke-interface {p2}, LT/l;->P()V

    check-cast p3, Lmh/p;

    iget-boolean p1, p0, LU5/a$b;->a:Z

    if-eqz p1, :cond_2

    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    sget-object v0, LYg/J;->a:LYg/J;

    invoke-static {p1, v0, p3}, Ly0/P;->d(Landroidx/compose/ui/e;Ljava/lang/Object;Lmh/p;)Landroidx/compose/ui/e;

    move-result-object p1

    goto :goto_0

    :cond_2
    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    invoke-interface {p2}, LT/l;->P()V

    return-object p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LU5/a$b;->a(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;

    move-result-object p1

    return-object p1
.end method
