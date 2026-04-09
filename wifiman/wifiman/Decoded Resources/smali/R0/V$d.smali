.class public final LR0/V$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR0/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR0/V;->o(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LR0/V;


# direct methods
.method constructor <init>(LR0/V;)V
    .locals 0

    iput-object p1, p0, LR0/V$d;->a:LR0/V;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LR0/M;)V
    .locals 3

    iget-object v0, p0, LR0/V$d;->a:LR0/V;

    invoke-static {v0}, LR0/V;->l(LR0/V;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, LR0/V$d;->a:LR0/V;

    invoke-static {v2}, LR0/V;->l(LR0/V;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object p1, p0, LR0/V$d;->a:LR0/V;

    invoke-static {p1}, LR0/V;->l(LR0/V;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    return-void

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public b(I)V
    .locals 1

    iget-object v0, p0, LR0/V$d;->a:LR0/V;

    invoke-static {v0}, LR0/V;->n(LR0/V;)Lmh/l;

    move-result-object v0

    invoke-static {p1}, LR0/r;->j(I)LR0/r;

    move-result-object p1

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public c(Landroid/view/KeyEvent;)V
    .locals 1

    iget-object v0, p0, LR0/V$d;->a:LR0/V;

    invoke-static {v0}, LR0/V;->j(LR0/V;)Landroid/view/inputmethod/BaseInputConnection;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/inputmethod/BaseInputConnection;->sendKeyEvent(Landroid/view/KeyEvent;)Z

    return-void
.end method

.method public d(ZZZZZZ)V
    .locals 8

    iget-object v0, p0, LR0/V$d;->a:LR0/V;

    invoke-static {v0}, LR0/V;->k(LR0/V;)LR0/e;

    move-result-object v1

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    invoke-virtual/range {v1 .. v7}, LR0/e;->b(ZZZZZZ)V

    return-void
.end method

.method public e(Ljava/util/List;)V
    .locals 1

    iget-object v0, p0, LR0/V$d;->a:LR0/V;

    invoke-static {v0}, LR0/V;->m(LR0/V;)Lmh/l;

    move-result-object v0

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
