.class public final LI/c$c$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI/k1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/c$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LI/o1;

.field final synthetic b:LI/q;

.field final synthetic c:Lmh/l;

.field final synthetic d:LI/F;

.field final synthetic e:LI/l1;

.field final synthetic f:Landroidx/compose/ui/platform/w1;


# direct methods
.method constructor <init>(LI/o1;LI/q;Lmh/l;Lu/a;LI/F;LI/l1;Landroidx/compose/ui/platform/w1;)V
    .locals 0

    iput-object p1, p0, LI/c$c$d;->a:LI/o1;

    iput-object p2, p0, LI/c$c$d;->b:LI/q;

    iput-object p3, p0, LI/c$c$d;->c:Lmh/l;

    iput-object p5, p0, LI/c$c$d;->d:LI/F;

    iput-object p6, p0, LI/c$c$d;->e:LI/l1;

    iput-object p7, p0, LI/c$c$d;->f:Landroidx/compose/ui/platform/w1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LH/h;
    .locals 1

    iget-object v0, p0, LI/c$c$d;->a:LI/o1;

    invoke-virtual {v0}, LI/o1;->l()LH/h;

    move-result-object v0

    return-object v0
.end method

.method public b(I)V
    .locals 1

    iget-object v0, p0, LI/c$c$d;->c:Lmh/l;

    if-eqz v0, :cond_0

    invoke-static {p1}, LR0/r;->j(I)LR0/r;

    move-result-object p1

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public c(Lt/c;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public d(Lmh/l;)V
    .locals 4

    iget-object v0, p0, LI/c$c$d;->a:LI/o1;

    invoke-static {v0}, LI/o1;->d(LI/o1;)LH/l;

    move-result-object v1

    invoke-static {v0}, LI/o1;->b(LI/o1;)LH/b;

    move-result-object v0

    sget-object v2, LK/c;->MergeIfPossible:LK/c;

    invoke-virtual {v1}, LH/l;->g()LI/I;

    move-result-object v3

    invoke-virtual {v3}, LI/I;->f()LI/m;

    move-result-object v3

    invoke-virtual {v3}, LI/m;->e()V

    invoke-virtual {v1}, LH/l;->g()LI/I;

    move-result-object v3

    invoke-interface {p1, v3}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-static {v1, v0, p1, v2}, LH/l;->a(LH/l;LH/b;ZLK/c;)V

    return-void
.end method

.method public e(Landroid/view/inputmethod/HandwritingGesture;)I
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    sget-object v0, LI/E0;->a:LI/E0;

    iget-object v1, p0, LI/c$c$d;->a:LI/o1;

    iget-object v2, p0, LI/c$c$d;->e:LI/l1;

    iget-object v3, p0, LI/c$c$d;->f:Landroidx/compose/ui/platform/w1;

    invoke-virtual {v0, v1, p1, v2, v3}, LI/E0;->m(LI/o1;Landroid/view/inputmethod/HandwritingGesture;LI/l1;Landroidx/compose/ui/platform/w1;)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x2

    return p1
.end method

.method public previewHandwritingGesture(Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    sget-object v0, LI/E0;->a:LI/E0;

    iget-object v1, p0, LI/c$c$d;->a:LI/o1;

    iget-object v2, p0, LI/c$c$d;->e:LI/l1;

    invoke-virtual {v0, v1, p1, v2, p2}, LI/E0;->E(LI/o1;Landroid/view/inputmethod/PreviewableHandwritingGesture;LI/l1;Landroid/os/CancellationSignal;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public requestCursorUpdates(I)V
    .locals 1

    iget-object v0, p0, LI/c$c$d;->d:LI/F;

    invoke-virtual {v0, p1}, LI/F;->d(I)V

    return-void
.end method

.method public sendKeyEvent(Landroid/view/KeyEvent;)V
    .locals 1

    iget-object v0, p0, LI/c$c$d;->b:LI/q;

    invoke-interface {v0, p1}, LI/q;->sendKeyEvent(Landroid/view/KeyEvent;)V

    return-void
.end method
