.class LF1/w0$i;
.super LF1/w0$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF1/w0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "i"
.end annotation


# instance fields
.field private n:Lw1/f;

.field private o:Lw1/f;

.field private p:Lw1/f;


# direct methods
.method constructor <init>(LF1/w0;LF1/w0$i;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, LF1/w0$h;-><init>(LF1/w0;LF1/w0$h;)V

    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, LF1/w0$i;->n:Lw1/f;

    .line 7
    iput-object p1, p0, LF1/w0$i;->o:Lw1/f;

    .line 8
    iput-object p1, p0, LF1/w0$i;->p:Lw1/f;

    return-void
.end method

.method constructor <init>(LF1/w0;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LF1/w0$h;-><init>(LF1/w0;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, LF1/w0$i;->n:Lw1/f;

    .line 3
    iput-object p1, p0, LF1/w0$i;->o:Lw1/f;

    .line 4
    iput-object p1, p0, LF1/w0$i;->p:Lw1/f;

    return-void
.end method


# virtual methods
.method i()Lw1/f;
    .locals 1

    iget-object v0, p0, LF1/w0$i;->o:Lw1/f;

    if-nez v0, :cond_0

    iget-object v0, p0, LF1/w0$f;->c:Landroid/view/WindowInsets;

    invoke-static {v0}, LF1/I0;->a(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Lw1/f;->d(Landroid/graphics/Insets;)Lw1/f;

    move-result-object v0

    iput-object v0, p0, LF1/w0$i;->o:Lw1/f;

    :cond_0
    iget-object v0, p0, LF1/w0$i;->o:Lw1/f;

    return-object v0
.end method

.method k()Lw1/f;
    .locals 1

    iget-object v0, p0, LF1/w0$i;->n:Lw1/f;

    if-nez v0, :cond_0

    iget-object v0, p0, LF1/w0$f;->c:Landroid/view/WindowInsets;

    invoke-static {v0}, LF1/J0;->a(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Lw1/f;->d(Landroid/graphics/Insets;)Lw1/f;

    move-result-object v0

    iput-object v0, p0, LF1/w0$i;->n:Lw1/f;

    :cond_0
    iget-object v0, p0, LF1/w0$i;->n:Lw1/f;

    return-object v0
.end method

.method m()Lw1/f;
    .locals 1

    iget-object v0, p0, LF1/w0$i;->p:Lw1/f;

    if-nez v0, :cond_0

    iget-object v0, p0, LF1/w0$f;->c:Landroid/view/WindowInsets;

    invoke-static {v0}, LF1/G0;->a(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Lw1/f;->d(Landroid/graphics/Insets;)Lw1/f;

    move-result-object v0

    iput-object v0, p0, LF1/w0$i;->p:Lw1/f;

    :cond_0
    iget-object v0, p0, LF1/w0$i;->p:Lw1/f;

    return-object v0
.end method

.method n(IIII)LF1/w0;
    .locals 1

    iget-object v0, p0, LF1/w0$f;->c:Landroid/view/WindowInsets;

    invoke-static {v0, p1, p2, p3, p4}, LF1/H0;->a(Landroid/view/WindowInsets;IIII)Landroid/view/WindowInsets;

    move-result-object p1

    invoke-static {p1}, LF1/w0;->w(Landroid/view/WindowInsets;)LF1/w0;

    move-result-object p1

    return-object p1
.end method

.method public u(Lw1/f;)V
    .locals 0

    return-void
.end method
