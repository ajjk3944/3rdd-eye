.class final Lg2/g$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg2/g;->a(Lg2/i;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lf2/k;

.field final synthetic b:Lg2/i;

.field final synthetic c:Lc0/e;

.field final synthetic d:Landroidx/compose/runtime/snapshots/k;

.field final synthetic e:Lg2/i$b;


# direct methods
.method constructor <init>(Lf2/k;Lg2/i;Lc0/e;Landroidx/compose/runtime/snapshots/k;Lg2/i$b;)V
    .locals 0

    iput-object p1, p0, Lg2/g$b;->a:Lf2/k;

    iput-object p2, p0, Lg2/g$b;->b:Lg2/i;

    iput-object p3, p0, Lg2/g$b;->c:Lc0/e;

    iput-object p4, p0, Lg2/g$b;->d:Landroidx/compose/runtime/snapshots/k;

    iput-object p5, p0, Lg2/g$b;->e:Lg2/i$b;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 5

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.navigation.compose.DialogHost.<anonymous>.<anonymous> (DialogHost.kt:55)"

    const v2, 0x43541ebc

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, Lg2/g$b;->a:Lf2/k;

    iget-object v0, p0, Lg2/g$b;->a:Lf2/k;

    invoke-interface {p1, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Lg2/g$b;->b:Lg2/i;

    invoke-interface {p1, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    iget-object v1, p0, Lg2/g$b;->d:Landroidx/compose/runtime/snapshots/k;

    iget-object v2, p0, Lg2/g$b;->a:Lf2/k;

    iget-object v3, p0, Lg2/g$b;->b:Lg2/i;

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_3

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v4, v0, :cond_4

    :cond_3
    new-instance v4, Lg2/g$b$a;

    invoke-direct {v4, v1, v2, v3}, Lg2/g$b$a;-><init>(Landroidx/compose/runtime/snapshots/k;Lf2/k;Lg2/i;)V

    invoke-interface {p1, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v4, Lmh/l;

    const/4 v0, 0x0

    invoke-static {p2, v4, p1, v0}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    iget-object p2, p0, Lg2/g$b;->a:Lf2/k;

    iget-object v0, p0, Lg2/g$b;->c:Lc0/e;

    new-instance v1, Lg2/g$b$b;

    iget-object v2, p0, Lg2/g$b;->e:Lg2/i$b;

    invoke-direct {v1, v2, p2}, Lg2/g$b$b;-><init>(Lg2/i$b;Lf2/k;)V

    const/16 v2, 0x36

    const v3, -0x1da93fb4

    const/4 v4, 0x1

    invoke-static {v3, v4, v1, p1, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v1

    const/16 v2, 0x180

    invoke-static {p2, v0, v1, p1, v2}, Lg2/j;->a(Lf2/k;Lc0/e;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lg2/g$b;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
