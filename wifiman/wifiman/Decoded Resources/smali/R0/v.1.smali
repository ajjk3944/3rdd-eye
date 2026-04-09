.class public final LR0/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR0/u;


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

    iput-object p1, p0, LR0/v;->a:Landroid/view/View;

    sget-object v0, LYg/q;->NONE:LYg/q;

    new-instance v1, LR0/v$a;

    invoke-direct {v1, p0}, LR0/v$a;-><init>(LR0/v;)V

    invoke-static {v0, v1}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LR0/v;->b:LYg/m;

    new-instance v0, LF1/K;

    invoke-direct {v0, p1}, LF1/K;-><init>(Landroid/view/View;)V

    iput-object v0, p0, LR0/v;->c:LF1/K;

    return-void
.end method

.method public static final synthetic g(LR0/v;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, LR0/v;->a:Landroid/view/View;

    return-object p0
.end method

.method private final h()Landroid/view/inputmethod/InputMethodManager;
    .locals 1

    iget-object v0, p0, LR0/v;->b:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    return-object v0
.end method


# virtual methods
.method public a(IIII)V
    .locals 6

    invoke-direct {p0}, LR0/v;->h()Landroid/view/inputmethod/InputMethodManager;

    move-result-object v0

    iget-object v1, p0, LR0/v;->a:Landroid/view/View;

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, Landroid/view/inputmethod/InputMethodManager;->updateSelection(Landroid/view/View;IIII)V

    return-void
.end method

.method public b()V
    .locals 2

    invoke-direct {p0}, LR0/v;->h()Landroid/view/inputmethod/InputMethodManager;

    move-result-object v0

    iget-object v1, p0, LR0/v;->a:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    return-void
.end method

.method public c(Landroid/view/inputmethod/CursorAnchorInfo;)V
    .locals 2

    invoke-direct {p0}, LR0/v;->h()Landroid/view/inputmethod/InputMethodManager;

    move-result-object v0

    iget-object v1, p0, LR0/v;->a:Landroid/view/View;

    invoke-virtual {v0, v1, p1}, Landroid/view/inputmethod/InputMethodManager;->updateCursorAnchorInfo(Landroid/view/View;Landroid/view/inputmethod/CursorAnchorInfo;)V

    return-void
.end method

.method public d(ILandroid/view/inputmethod/ExtractedText;)V
    .locals 2

    invoke-direct {p0}, LR0/v;->h()Landroid/view/inputmethod/InputMethodManager;

    move-result-object v0

    iget-object v1, p0, LR0/v;->a:Landroid/view/View;

    invoke-virtual {v0, v1, p1, p2}, Landroid/view/inputmethod/InputMethodManager;->updateExtractedText(Landroid/view/View;ILandroid/view/inputmethod/ExtractedText;)V

    return-void
.end method

.method public e()V
    .locals 1

    iget-object v0, p0, LR0/v;->c:LF1/K;

    invoke-virtual {v0}, LF1/K;->a()V

    return-void
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, LR0/v;->c:LF1/K;

    invoke-virtual {v0}, LF1/K;->b()V

    return-void
.end method

.method public isActive()Z
    .locals 2

    invoke-direct {p0}, LR0/v;->h()Landroid/view/inputmethod/InputMethodManager;

    move-result-object v0

    iget-object v1, p0, LR0/v;->a:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/inputmethod/InputMethodManager;->isActive(Landroid/view/View;)Z

    move-result v0

    return v0
.end method
