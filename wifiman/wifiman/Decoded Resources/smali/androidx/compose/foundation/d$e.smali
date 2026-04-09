.class public final Landroidx/compose/foundation/d$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/d;->e(Landroidx/compose/ui/e;Ly/m;Ls/G;ZLjava/lang/String;LJ0/g;Ljava/lang/String;Lmh/a;Lmh/a;Lmh/a;)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ls/G;

.field final synthetic b:Z

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:LJ0/g;

.field final synthetic e:Lmh/a;

.field final synthetic f:Ljava/lang/String;

.field final synthetic g:Lmh/a;

.field final synthetic h:Lmh/a;


# direct methods
.method public constructor <init>(Ls/G;ZLjava/lang/String;LJ0/g;Lmh/a;Ljava/lang/String;Lmh/a;Lmh/a;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/d$e;->a:Ls/G;

    iput-boolean p2, p0, Landroidx/compose/foundation/d$e;->b:Z

    iput-object p3, p0, Landroidx/compose/foundation/d$e;->c:Ljava/lang/String;

    iput-object p4, p0, Landroidx/compose/foundation/d$e;->d:LJ0/g;

    iput-object p5, p0, Landroidx/compose/foundation/d$e;->e:Lmh/a;

    iput-object p6, p0, Landroidx/compose/foundation/d$e;->f:Ljava/lang/String;

    iput-object p7, p0, Landroidx/compose/foundation/d$e;->g:Lmh/a;

    iput-object p8, p0, Landroidx/compose/foundation/d$e;->h:Lmh/a;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;
    .locals 11

    const p1, -0x5af0b3b9

    invoke-interface {p2, p1}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:375)"

    invoke-static {p1, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object p1

    sget-object p3, LT/l;->a:LT/l$a;

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne p1, p3, :cond_1

    invoke-static {}, Ly/l;->a()Ly/m;

    move-result-object p1

    invoke-interface {p2, p1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1
    move-object v1, p1

    check-cast v1, Ly/m;

    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    iget-object p3, p0, Landroidx/compose/foundation/d$e;->a:Ls/G;

    invoke-static {p1, v1, p3}, Landroidx/compose/foundation/j;->b(Landroidx/compose/ui/e;Ly/k;Ls/G;)Landroidx/compose/ui/e;

    move-result-object p1

    new-instance p3, Landroidx/compose/foundation/CombinedClickableElement;

    iget-boolean v3, p0, Landroidx/compose/foundation/d$e;->b:Z

    iget-object v4, p0, Landroidx/compose/foundation/d$e;->c:Ljava/lang/String;

    iget-object v5, p0, Landroidx/compose/foundation/d$e;->d:LJ0/g;

    iget-object v6, p0, Landroidx/compose/foundation/d$e;->e:Lmh/a;

    iget-object v7, p0, Landroidx/compose/foundation/d$e;->f:Ljava/lang/String;

    iget-object v8, p0, Landroidx/compose/foundation/d$e;->g:Lmh/a;

    iget-object v9, p0, Landroidx/compose/foundation/d$e;->h:Lmh/a;

    const/4 v10, 0x0

    const/4 v2, 0x0

    move-object v0, p3

    invoke-direct/range {v0 .. v10}, Landroidx/compose/foundation/CombinedClickableElement;-><init>(Ly/m;Ls/I;ZLjava/lang/String;LJ0/g;Lmh/a;Ljava/lang/String;Lmh/a;Lmh/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, p3}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p1

    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
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

    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/foundation/d$e;->a(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;

    move-result-object p1

    return-object p1
.end method
