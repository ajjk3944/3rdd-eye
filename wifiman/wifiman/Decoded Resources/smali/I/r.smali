.class abstract LI/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI/q;


# instance fields
.field private final a:Landroid/view/View;

.field private b:Landroid/view/inputmethod/InputMethodManager;

.field private final c:LF1/K;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI/r;->a:Landroid/view/View;

    new-instance v0, LF1/K;

    invoke-direct {v0, p1}, LF1/K;-><init>(Landroid/view/View;)V

    iput-object v0, p0, LI/r;->c:LF1/K;

    return-void
.end method

.method private final d()Landroid/view/inputmethod/InputMethodManager;
    .locals 2

    iget-object v0, p0, LI/r;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    return-object v0
.end method


# virtual methods
.method public a(IIII)V
    .locals 6

    invoke-virtual {p0}, LI/r;->g()Landroid/view/inputmethod/InputMethodManager;

    move-result-object v0

    iget-object v1, p0, LI/r;->a:Landroid/view/View;

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, Landroid/view/inputmethod/InputMethodManager;->updateSelection(Landroid/view/View;IIII)V

    return-void
.end method

.method public b()V
    .locals 2

    invoke-virtual {p0}, LI/r;->g()Landroid/view/inputmethod/InputMethodManager;

    move-result-object v0

    iget-object v1, p0, LI/r;->a:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    return-void
.end method

.method public c(Landroid/view/inputmethod/CursorAnchorInfo;)V
    .locals 2

    invoke-virtual {p0}, LI/r;->g()Landroid/view/inputmethod/InputMethodManager;

    move-result-object v0

    iget-object v1, p0, LI/r;->a:Landroid/view/View;

    invoke-virtual {v0, v1, p1}, Landroid/view/inputmethod/InputMethodManager;->updateCursorAnchorInfo(Landroid/view/View;Landroid/view/inputmethod/CursorAnchorInfo;)V

    return-void
.end method

.method public e()V
    .locals 0

    return-void
.end method

.method protected final f()Landroid/view/View;
    .locals 1

    iget-object v0, p0, LI/r;->a:Landroid/view/View;

    return-object v0
.end method

.method protected final g()Landroid/view/inputmethod/InputMethodManager;
    .locals 1

    iget-object v0, p0, LI/r;->b:Landroid/view/inputmethod/InputMethodManager;

    if-nez v0, :cond_0

    invoke-direct {p0}, LI/r;->d()Landroid/view/inputmethod/InputMethodManager;

    move-result-object v0

    iput-object v0, p0, LI/r;->b:Landroid/view/inputmethod/InputMethodManager;

    :cond_0
    return-object v0
.end method
