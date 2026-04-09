.class final Landroidx/compose/ui/focus/r;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements Lk0/k;


# instance fields
.field private n:Landroidx/compose/ui/focus/o;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/focus/o;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/focus/r;->n:Landroidx/compose/ui/focus/o;

    return-void
.end method


# virtual methods
.method public final D2()Landroidx/compose/ui/focus/o;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/r;->n:Landroidx/compose/ui/focus/o;

    return-object v0
.end method

.method public final E2(Landroidx/compose/ui/focus/o;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/focus/r;->n:Landroidx/compose/ui/focus/o;

    return-void
.end method

.method public n2()V
    .locals 1

    invoke-super {p0}, Landroidx/compose/ui/e$c;->n2()V

    iget-object v0, p0, Landroidx/compose/ui/focus/r;->n:Landroidx/compose/ui/focus/o;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/o;->e()LV/b;

    move-result-object v0

    invoke-virtual {v0, p0}, LV/b;->b(Ljava/lang/Object;)Z

    return-void
.end method

.method public o2()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/r;->n:Landroidx/compose/ui/focus/o;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/o;->e()LV/b;

    move-result-object v0

    invoke-virtual {v0, p0}, LV/b;->x(Ljava/lang/Object;)Z

    invoke-super {p0}, Landroidx/compose/ui/e$c;->o2()V

    return-void
.end method
