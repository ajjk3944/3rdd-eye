.class LF1/w0$c;
.super LF1/w0$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF1/w0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# instance fields
.field final c:Landroid/view/WindowInsets$Builder;


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, LF1/w0$e;-><init>()V

    .line 2
    invoke-static {}, LC1/e;->a()Landroid/view/WindowInsets$Builder;

    move-result-object v0

    iput-object v0, p0, LF1/w0$c;->c:Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method constructor <init>(LF1/w0;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, LF1/w0$e;-><init>(LF1/w0;)V

    .line 4
    invoke-virtual {p1}, LF1/w0;->v()Landroid/view/WindowInsets;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 5
    invoke-static {p1}, LF1/C0;->a(Landroid/view/WindowInsets;)Landroid/view/WindowInsets$Builder;

    move-result-object p1

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {}, LC1/e;->a()Landroid/view/WindowInsets$Builder;

    move-result-object p1

    :goto_0
    iput-object p1, p0, LF1/w0$c;->c:Landroid/view/WindowInsets$Builder;

    return-void
.end method


# virtual methods
.method b()LF1/w0;
    .locals 2

    invoke-virtual {p0}, LF1/w0$e;->a()V

    iget-object v0, p0, LF1/w0$c;->c:Landroid/view/WindowInsets$Builder;

    invoke-static {v0}, LC1/f;->a(Landroid/view/WindowInsets$Builder;)Landroid/view/WindowInsets;

    move-result-object v0

    invoke-static {v0}, LF1/w0;->w(Landroid/view/WindowInsets;)LF1/w0;

    move-result-object v0

    iget-object v1, p0, LF1/w0$e;->b:[Lw1/f;

    invoke-virtual {v0, v1}, LF1/w0;->r([Lw1/f;)V

    return-object v0
.end method

.method d(Lw1/f;)V
    .locals 1

    iget-object v0, p0, LF1/w0$c;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lw1/f;->e()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, LF1/A0;->a(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method e(Lw1/f;)V
    .locals 1

    iget-object v0, p0, LF1/w0$c;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lw1/f;->e()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, LF1/y0;->a(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method f(Lw1/f;)V
    .locals 1

    iget-object v0, p0, LF1/w0$c;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lw1/f;->e()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, LF1/z0;->a(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method g(Lw1/f;)V
    .locals 1

    iget-object v0, p0, LF1/w0$c;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lw1/f;->e()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, LF1/x0;->a(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method h(Lw1/f;)V
    .locals 1

    iget-object v0, p0, LF1/w0$c;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lw1/f;->e()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, LF1/B0;->a(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method
