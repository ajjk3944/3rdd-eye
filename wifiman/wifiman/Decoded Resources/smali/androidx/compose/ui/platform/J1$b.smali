.class public final Landroidx/compose/ui/platform/J1$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/J1;->b(Landroid/view/View;Ldh/i;Landroidx/lifecycle/k;)LT/N0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/platform/J1$b$a;
    }
.end annotation


# instance fields
.field final synthetic a:LIi/N;

.field final synthetic b:LT/y0;

.field final synthetic c:LT/N0;

.field final synthetic d:Lkotlin/jvm/internal/N;

.field final synthetic e:Landroid/view/View;


# direct methods
.method constructor <init>(LIi/N;LT/y0;LT/N0;Lkotlin/jvm/internal/N;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/J1$b;->a:LIi/N;

    iput-object p2, p0, Landroidx/compose/ui/platform/J1$b;->b:LT/y0;

    iput-object p3, p0, Landroidx/compose/ui/platform/J1$b;->c:LT/N0;

    iput-object p4, p0, Landroidx/compose/ui/platform/J1$b;->d:Lkotlin/jvm/internal/N;

    iput-object p5, p0, Landroidx/compose/ui/platform/J1$b;->e:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public j(Landroidx/lifecycle/o;Landroidx/lifecycle/k$a;)V
    .locals 10

    sget-object v0, Landroidx/compose/ui/platform/J1$b$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_4

    const/4 p1, 0x2

    if-eq p2, p1, :cond_2

    const/4 p1, 0x3

    if-eq p2, p1, :cond_1

    const/4 p1, 0x4

    if-eq p2, p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/compose/ui/platform/J1$b;->c:LT/N0;

    invoke-virtual {p1}, LT/N0;->Y()V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Landroidx/compose/ui/platform/J1$b;->c:LT/N0;

    invoke-virtual {p1}, LT/N0;->l0()V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Landroidx/compose/ui/platform/J1$b;->b:LT/y0;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, LT/y0;->c()V

    :cond_3
    iget-object p1, p0, Landroidx/compose/ui/platform/J1$b;->c:LT/N0;

    invoke-virtual {p1}, LT/N0;->y0()V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Landroidx/compose/ui/platform/J1$b;->a:LIi/N;

    sget-object v2, LIi/P;->UNDISPATCHED:LIi/P;

    new-instance p2, Landroidx/compose/ui/platform/J1$b$b;

    iget-object v4, p0, Landroidx/compose/ui/platform/J1$b;->d:Lkotlin/jvm/internal/N;

    iget-object v5, p0, Landroidx/compose/ui/platform/J1$b;->c:LT/N0;

    iget-object v8, p0, Landroidx/compose/ui/platform/J1$b;->e:Landroid/view/View;

    const/4 v9, 0x0

    move-object v3, p2

    move-object v6, p1

    move-object v7, p0

    invoke-direct/range {v3 .. v9}, Landroidx/compose/ui/platform/J1$b$b;-><init>(Lkotlin/jvm/internal/N;LT/N0;Landroidx/lifecycle/o;Landroidx/compose/ui/platform/J1$b;Landroid/view/View;Ldh/e;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    :goto_0
    return-void
.end method
