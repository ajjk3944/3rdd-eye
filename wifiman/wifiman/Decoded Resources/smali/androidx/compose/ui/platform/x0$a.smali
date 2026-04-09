.class final Landroidx/compose/ui/platform/x0$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/x0;->c(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/platform/x0;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/x0;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/x0$a;->a:Landroidx/compose/ui/platform/x0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LR0/z;)V
    .locals 4

    invoke-interface {p1}, LR0/z;->a()V

    iget-object v0, p0, Landroidx/compose/ui/platform/x0$a;->a:Landroidx/compose/ui/platform/x0;

    invoke-static {v0}, Landroidx/compose/ui/platform/x0;->a(Landroidx/compose/ui/platform/x0;)LV/b;

    move-result-object v0

    invoke-virtual {v0}, LV/b;->o()I

    move-result v1

    if-lez v1, :cond_2

    invoke-virtual {v0}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x0

    :cond_0
    aget-object v3, v0, v2

    check-cast v3, Ljava/lang/ref/WeakReference;

    invoke-static {v3, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    if-lt v2, v1, :cond_0

    :cond_2
    const/4 v2, -0x1

    :goto_0
    if-ltz v2, :cond_3

    iget-object p1, p0, Landroidx/compose/ui/platform/x0$a;->a:Landroidx/compose/ui/platform/x0;

    invoke-static {p1}, Landroidx/compose/ui/platform/x0;->a(Landroidx/compose/ui/platform/x0;)LV/b;

    move-result-object p1

    invoke-virtual {p1, v2}, LV/b;->z(I)Ljava/lang/Object;

    :cond_3
    iget-object p1, p0, Landroidx/compose/ui/platform/x0$a;->a:Landroidx/compose/ui/platform/x0;

    invoke-static {p1}, Landroidx/compose/ui/platform/x0;->a(Landroidx/compose/ui/platform/x0;)LV/b;

    move-result-object p1

    invoke-virtual {p1}, LV/b;->s()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Landroidx/compose/ui/platform/x0$a;->a:Landroidx/compose/ui/platform/x0;

    invoke-static {p1}, Landroidx/compose/ui/platform/x0;->b(Landroidx/compose/ui/platform/x0;)Lmh/a;

    move-result-object p1

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    :cond_4
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LR0/z;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/x0$a;->a(LR0/z;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
