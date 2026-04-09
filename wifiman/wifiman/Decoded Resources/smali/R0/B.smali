.class abstract LR0/B;
.super LR0/A;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/view/inputmethod/InputConnection;Lmh/l;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LR0/A;-><init>(Landroid/view/inputmethod/InputConnection;Lmh/l;)V

    return-void
.end method


# virtual methods
.method protected final b(Landroid/view/inputmethod/InputConnection;)V
    .locals 0

    invoke-interface {p1}, Landroid/view/inputmethod/InputConnection;->closeConnection()V

    return-void
.end method

.method public final deleteSurroundingTextInCodePoints(II)Z
    .locals 1

    invoke-virtual {p0}, LR0/A;->c()Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Landroid/view/inputmethod/InputConnection;->deleteSurroundingTextInCodePoints(II)Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final getHandler()Landroid/os/Handler;
    .locals 1

    invoke-virtual {p0}, LR0/A;->c()Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/view/inputmethod/InputConnection;->getHandler()Landroid/os/Handler;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
