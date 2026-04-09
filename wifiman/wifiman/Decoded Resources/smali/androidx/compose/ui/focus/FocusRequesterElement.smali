.class final Landroidx/compose/ui/focus/FocusRequesterElement;
.super LE0/V;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LE0/V;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0082\u0008\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Landroidx/compose/ui/focus/FocusRequesterElement;",
        "LE0/V;",
        "Landroidx/compose/ui/focus/r;",
        "Landroidx/compose/ui/focus/o;",
        "focusRequester",
        "<init>",
        "(Landroidx/compose/ui/focus/o;)V",
        "d",
        "()Landroidx/compose/ui/focus/r;",
        "node",
        "LYg/J;",
        "e",
        "(Landroidx/compose/ui/focus/r;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Landroidx/compose/ui/focus/o;",
        "getFocusRequester",
        "()Landroidx/compose/ui/focus/o;",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Landroidx/compose/ui/focus/o;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/focus/o;)V
    .locals 0

    invoke-direct {p0}, LE0/V;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/focus/FocusRequesterElement;->a:Landroidx/compose/ui/focus/o;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Landroidx/compose/ui/e$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusRequesterElement;->d()Landroidx/compose/ui/focus/r;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c(Landroidx/compose/ui/e$c;)V
    .locals 0

    check-cast p1, Landroidx/compose/ui/focus/r;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/focus/FocusRequesterElement;->e(Landroidx/compose/ui/focus/r;)V

    return-void
.end method

.method public d()Landroidx/compose/ui/focus/r;
    .locals 2

    new-instance v0, Landroidx/compose/ui/focus/r;

    iget-object v1, p0, Landroidx/compose/ui/focus/FocusRequesterElement;->a:Landroidx/compose/ui/focus/o;

    invoke-direct {v0, v1}, Landroidx/compose/ui/focus/r;-><init>(Landroidx/compose/ui/focus/o;)V

    return-object v0
.end method

.method public e(Landroidx/compose/ui/focus/r;)V
    .locals 1

    invoke-virtual {p1}, Landroidx/compose/ui/focus/r;->D2()Landroidx/compose/ui/focus/o;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/focus/o;->e()LV/b;

    move-result-object v0

    invoke-virtual {v0, p1}, LV/b;->x(Ljava/lang/Object;)Z

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusRequesterElement;->a:Landroidx/compose/ui/focus/o;

    invoke-virtual {p1, v0}, Landroidx/compose/ui/focus/r;->E2(Landroidx/compose/ui/focus/o;)V

    invoke-virtual {p1}, Landroidx/compose/ui/focus/r;->D2()Landroidx/compose/ui/focus/o;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/focus/o;->e()LV/b;

    move-result-object v0

    invoke-virtual {v0, p1}, LV/b;->b(Ljava/lang/Object;)Z

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/ui/focus/FocusRequesterElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/ui/focus/FocusRequesterElement;

    iget-object v1, p0, Landroidx/compose/ui/focus/FocusRequesterElement;->a:Landroidx/compose/ui/focus/o;

    iget-object p1, p1, Landroidx/compose/ui/focus/FocusRequesterElement;->a:Landroidx/compose/ui/focus/o;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusRequesterElement;->a:Landroidx/compose/ui/focus/o;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FocusRequesterElement(focusRequester="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/focus/FocusRequesterElement;->a:Landroidx/compose/ui/focus/o;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
