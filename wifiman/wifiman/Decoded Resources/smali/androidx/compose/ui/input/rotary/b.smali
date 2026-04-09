.class final Landroidx/compose/ui/input/rotary/b;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LA0/a;


# instance fields
.field private n:Lmh/l;

.field private o:Lmh/l;


# direct methods
.method public constructor <init>(Lmh/l;Lmh/l;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/input/rotary/b;->n:Lmh/l;

    iput-object p2, p0, Landroidx/compose/ui/input/rotary/b;->o:Lmh/l;

    return-void
.end method


# virtual methods
.method public final D2(Lmh/l;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/input/rotary/b;->n:Lmh/l;

    return-void
.end method

.method public final E2(Lmh/l;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/input/rotary/b;->o:Lmh/l;

    return-void
.end method

.method public J0(LA0/b;)Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/input/rotary/b;->o:Lmh/l;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public Y0(LA0/b;)Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/input/rotary/b;->n:Lmh/l;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
