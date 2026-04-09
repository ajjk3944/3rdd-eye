.class public final Landroidx/compose/ui/platform/P;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/platform/q1;


# instance fields
.field private final a:Landroid/view/View;

.field private b:Landroid/view/ActionMode;

.field private final c:LG0/c;

.field private d:Landroidx/compose/ui/platform/s1;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/platform/P;->a:Landroid/view/View;

    new-instance p1, LG0/c;

    new-instance v1, Landroidx/compose/ui/platform/P$a;

    invoke-direct {v1, p0}, Landroidx/compose/ui/platform/P$a;-><init>(Landroidx/compose/ui/platform/P;)V

    const/16 v7, 0x3e

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v8}, LG0/c;-><init>(Lmh/a;Ll0/i;Lmh/a;Lmh/a;Lmh/a;Lmh/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Landroidx/compose/ui/platform/P;->c:LG0/c;

    sget-object p1, Landroidx/compose/ui/platform/s1;->Hidden:Landroidx/compose/ui/platform/s1;

    iput-object p1, p0, Landroidx/compose/ui/platform/P;->d:Landroidx/compose/ui/platform/s1;

    return-void
.end method

.method public static final synthetic d(Landroidx/compose/ui/platform/P;Landroid/view/ActionMode;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/P;->b:Landroid/view/ActionMode;

    return-void
.end method


# virtual methods
.method public a()Landroidx/compose/ui/platform/s1;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/P;->d:Landroidx/compose/ui/platform/s1;

    return-object v0
.end method

.method public b(Ll0/i;Lmh/a;Lmh/a;Lmh/a;Lmh/a;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/P;->c:LG0/c;

    invoke-virtual {v0, p1}, LG0/c;->l(Ll0/i;)V

    iget-object p1, p0, Landroidx/compose/ui/platform/P;->c:LG0/c;

    invoke-virtual {p1, p2}, LG0/c;->h(Lmh/a;)V

    iget-object p1, p0, Landroidx/compose/ui/platform/P;->c:LG0/c;

    invoke-virtual {p1, p4}, LG0/c;->i(Lmh/a;)V

    iget-object p1, p0, Landroidx/compose/ui/platform/P;->c:LG0/c;

    invoke-virtual {p1, p3}, LG0/c;->j(Lmh/a;)V

    iget-object p1, p0, Landroidx/compose/ui/platform/P;->c:LG0/c;

    invoke-virtual {p1, p5}, LG0/c;->k(Lmh/a;)V

    iget-object p1, p0, Landroidx/compose/ui/platform/P;->b:Landroid/view/ActionMode;

    if-nez p1, :cond_0

    sget-object p1, Landroidx/compose/ui/platform/s1;->Shown:Landroidx/compose/ui/platform/s1;

    iput-object p1, p0, Landroidx/compose/ui/platform/P;->d:Landroidx/compose/ui/platform/s1;

    sget-object p1, Landroidx/compose/ui/platform/r1;->a:Landroidx/compose/ui/platform/r1;

    iget-object p2, p0, Landroidx/compose/ui/platform/P;->a:Landroid/view/View;

    new-instance p3, LG0/a;

    iget-object p4, p0, Landroidx/compose/ui/platform/P;->c:LG0/c;

    invoke-direct {p3, p4}, LG0/a;-><init>(LG0/c;)V

    const/4 p4, 0x1

    invoke-virtual {p1, p2, p3, p4}, Landroidx/compose/ui/platform/r1;->b(Landroid/view/View;Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/platform/P;->b:Landroid/view/ActionMode;

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/view/ActionMode;->invalidate()V

    :cond_1
    :goto_0
    return-void
.end method

.method public c()V
    .locals 1

    sget-object v0, Landroidx/compose/ui/platform/s1;->Hidden:Landroidx/compose/ui/platform/s1;

    iput-object v0, p0, Landroidx/compose/ui/platform/P;->d:Landroidx/compose/ui/platform/s1;

    iget-object v0, p0, Landroidx/compose/ui/platform/P;->b:Landroid/view/ActionMode;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/ActionMode;->finish()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/compose/ui/platform/P;->b:Landroid/view/ActionMode;

    return-void
.end method
