.class public final LI/P0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI/H0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/P0;->g(Landroid/view/inputmethod/EditorInfo;)LI/V0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LI/P0;


# direct methods
.method constructor <init>(LI/P0;)V
    .locals 0

    iput-object p1, p0, LI/P0$b;->a:LI/P0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(I)V
    .locals 1

    iget-object v0, p0, LI/P0$b;->a:LI/P0;

    invoke-static {v0}, LI/P0;->f(LI/P0;)Lmh/l;

    move-result-object v0

    invoke-static {p1}, LR0/r;->j(I)LR0/r;

    move-result-object p1

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public c(Landroid/view/KeyEvent;)V
    .locals 1

    iget-object v0, p0, LI/P0$b;->a:LI/P0;

    invoke-static {v0}, LI/P0;->b(LI/P0;)Landroid/view/inputmethod/BaseInputConnection;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/inputmethod/BaseInputConnection;->sendKeyEvent(Landroid/view/KeyEvent;)Z

    return-void
.end method

.method public d(ZZZZZZ)V
    .locals 8

    iget-object v0, p0, LI/P0$b;->a:LI/P0;

    invoke-static {v0}, LI/P0;->c(LI/P0;)LI/M0;

    move-result-object v1

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    invoke-virtual/range {v1 .. v7}, LI/M0;->b(ZZZZZZ)V

    return-void
.end method

.method public e(Ljava/util/List;)V
    .locals 1

    iget-object v0, p0, LI/P0$b;->a:LI/P0;

    invoke-static {v0}, LI/P0;->e(LI/P0;)Lmh/l;

    move-result-object v0

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public f(LI/V0;)V
    .locals 3

    iget-object v0, p0, LI/P0$b;->a:LI/P0;

    invoke-static {v0}, LI/P0;->d(LI/P0;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, LI/P0$b;->a:LI/P0;

    invoke-static {v2}, LI/P0;->d(LI/P0;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object p1, p0, LI/P0$b;->a:LI/P0;

    invoke-static {p1}, LI/P0;->d(LI/P0;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    return-void

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
