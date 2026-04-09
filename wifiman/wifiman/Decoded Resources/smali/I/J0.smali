.class public final LI/J0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI/I0;


# instance fields
.field private final a:Landroid/view/View;

.field private final b:LYg/m;

.field private final c:LF1/K;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI/J0;->a:Landroid/view/View;

    sget-object v0, LYg/q;->NONE:LYg/q;

    new-instance v1, LI/J0$a;

    invoke-direct {v1, p0}, LI/J0$a;-><init>(LI/J0;)V

    invoke-static {v0, v1}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LI/J0;->b:LYg/m;

    new-instance v0, LF1/K;

    invoke-direct {v0, p1}, LF1/K;-><init>(Landroid/view/View;)V

    iput-object v0, p0, LI/J0;->c:LF1/K;

    return-void
.end method

.method public static final synthetic f(LI/J0;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, LI/J0;->a:Landroid/view/View;

    return-object p0
.end method

.method private final g()Landroid/view/inputmethod/InputMethodManager;
    .locals 1

    iget-object v0, p0, LI/J0;->b:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    return-object v0
.end method


# virtual methods
.method public a(IIII)V
    .locals 6

    invoke-direct {p0}, LI/J0;->g()Landroid/view/inputmethod/InputMethodManager;

    move-result-object v0

    iget-object v1, p0, LI/J0;->a:Landroid/view/View;

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, Landroid/view/inputmethod/InputMethodManager;->updateSelection(Landroid/view/View;IIII)V

    return-void
.end method

.method public b()V
    .locals 2

    invoke-direct {p0}, LI/J0;->g()Landroid/view/inputmethod/InputMethodManager;

    move-result-object v0

    iget-object v1, p0, LI/J0;->a:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    return-void
.end method

.method public c(Landroid/view/inputmethod/CursorAnchorInfo;)V
    .locals 2

    invoke-direct {p0}, LI/J0;->g()Landroid/view/inputmethod/InputMethodManager;

    move-result-object v0

    iget-object v1, p0, LI/J0;->a:Landroid/view/View;

    invoke-virtual {v0, v1, p1}, Landroid/view/inputmethod/InputMethodManager;->updateCursorAnchorInfo(Landroid/view/View;Landroid/view/inputmethod/CursorAnchorInfo;)V

    return-void
.end method

.method public d(ILandroid/view/inputmethod/ExtractedText;)V
    .locals 2

    invoke-direct {p0}, LI/J0;->g()Landroid/view/inputmethod/InputMethodManager;

    move-result-object v0

    iget-object v1, p0, LI/J0;->a:Landroid/view/View;

    invoke-virtual {v0, v1, p1, p2}, Landroid/view/inputmethod/InputMethodManager;->updateExtractedText(Landroid/view/View;ILandroid/view/inputmethod/ExtractedText;)V

    return-void
.end method

.method public e()V
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    sget-object v0, LI/l;->a:LI/l;

    invoke-direct {p0}, LI/J0;->g()Landroid/view/inputmethod/InputMethodManager;

    move-result-object v1

    iget-object v2, p0, LI/J0;->a:Landroid/view/View;

    invoke-virtual {v0, v1, v2}, LI/l;->a(Landroid/view/inputmethod/InputMethodManager;Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public isActive()Z
    .locals 2

    invoke-direct {p0}, LI/J0;->g()Landroid/view/inputmethod/InputMethodManager;

    move-result-object v0

    iget-object v1, p0, LI/J0;->a:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/inputmethod/InputMethodManager;->isActive(Landroid/view/View;)Z

    move-result v0

    return v0
.end method
