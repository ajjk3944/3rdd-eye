.class LF1/V0$d;
.super LF1/V0$g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF1/V0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation


# instance fields
.field final a:LF1/V0;

.field final b:Landroid/view/WindowInsetsController;

.field final c:LF1/K;

.field private final d:Lo/V;

.field protected e:Landroid/view/Window;


# direct methods
.method constructor <init>(Landroid/view/Window;LF1/V0;LF1/K;)V
    .locals 1

    .line 1
    invoke-static {p1}, LF1/W0;->a(Landroid/view/Window;)Landroid/view/WindowInsetsController;

    move-result-object v0

    invoke-direct {p0, v0, p2, p3}, LF1/V0$d;-><init>(Landroid/view/WindowInsetsController;LF1/V0;LF1/K;)V

    .line 2
    iput-object p1, p0, LF1/V0$d;->e:Landroid/view/Window;

    return-void
.end method

.method constructor <init>(Landroid/view/WindowInsetsController;LF1/V0;LF1/K;)V
    .locals 1

    .line 3
    invoke-direct {p0}, LF1/V0$g;-><init>()V

    .line 4
    new-instance v0, Lo/V;

    invoke-direct {v0}, Lo/V;-><init>()V

    iput-object v0, p0, LF1/V0$d;->d:Lo/V;

    .line 5
    iput-object p1, p0, LF1/V0$d;->b:Landroid/view/WindowInsetsController;

    .line 6
    iput-object p2, p0, LF1/V0$d;->a:LF1/V0;

    .line 7
    iput-object p3, p0, LF1/V0$d;->c:LF1/K;

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 2

    const/16 v0, 0x10

    if-eqz p1, :cond_1

    iget-object p1, p0, LF1/V0$d;->e:Landroid/view/Window;

    if-eqz p1, :cond_0

    invoke-virtual {p0, v0}, LF1/V0$d;->d(I)V

    :cond_0
    iget-object p1, p0, LF1/V0$d;->b:Landroid/view/WindowInsetsController;

    invoke-static {p1, v0, v0}, LF1/X0;->a(Landroid/view/WindowInsetsController;II)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, LF1/V0$d;->e:Landroid/view/Window;

    if-eqz p1, :cond_2

    invoke-virtual {p0, v0}, LF1/V0$d;->e(I)V

    :cond_2
    iget-object p1, p0, LF1/V0$d;->b:Landroid/view/WindowInsetsController;

    const/4 v1, 0x0

    invoke-static {p1, v1, v0}, LF1/X0;->a(Landroid/view/WindowInsetsController;II)V

    :goto_0
    return-void
.end method

.method public b(Z)V
    .locals 2

    const/16 v0, 0x2000

    const/16 v1, 0x8

    if-eqz p1, :cond_1

    iget-object p1, p0, LF1/V0$d;->e:Landroid/view/Window;

    if-eqz p1, :cond_0

    invoke-virtual {p0, v0}, LF1/V0$d;->d(I)V

    :cond_0
    iget-object p1, p0, LF1/V0$d;->b:Landroid/view/WindowInsetsController;

    invoke-static {p1, v1, v1}, LF1/X0;->a(Landroid/view/WindowInsetsController;II)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, LF1/V0$d;->e:Landroid/view/Window;

    if-eqz p1, :cond_2

    invoke-virtual {p0, v0}, LF1/V0$d;->e(I)V

    :cond_2
    iget-object p1, p0, LF1/V0$d;->b:Landroid/view/WindowInsetsController;

    const/4 v0, 0x0

    invoke-static {p1, v0, v1}, LF1/X0;->a(Landroid/view/WindowInsetsController;II)V

    :goto_0
    return-void
.end method

.method c(I)V
    .locals 1

    and-int/lit8 v0, p1, 0x8

    if-eqz v0, :cond_0

    iget-object v0, p0, LF1/V0$d;->c:LF1/K;

    invoke-virtual {v0}, LF1/K;->b()V

    :cond_0
    iget-object v0, p0, LF1/V0$d;->b:Landroid/view/WindowInsetsController;

    and-int/lit8 p1, p1, -0x9

    invoke-static {v0, p1}, LF1/N;->a(Landroid/view/WindowInsetsController;I)V

    return-void
.end method

.method protected d(I)V
    .locals 2

    iget-object v0, p0, LF1/V0$d;->e:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v1

    or-int/2addr p1, v1

    invoke-virtual {v0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    return-void
.end method

.method protected e(I)V
    .locals 2

    iget-object v0, p0, LF1/V0$d;->e:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v1

    not-int p1, p1

    and-int/2addr p1, v1

    invoke-virtual {v0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    return-void
.end method
