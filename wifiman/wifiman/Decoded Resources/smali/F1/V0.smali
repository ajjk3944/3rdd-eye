.class public final LF1/V0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF1/V0$f;,
        LF1/V0$g;,
        LF1/V0$d;,
        LF1/V0$c;,
        LF1/V0$b;,
        LF1/V0$a;,
        LF1/V0$e;
    }
.end annotation


# instance fields
.field private final a:LF1/V0$g;


# direct methods
.method public constructor <init>(Landroid/view/Window;Landroid/view/View;)V
    .locals 2

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, LF1/K;

    invoke-direct {v0, p2}, LF1/K;-><init>(Landroid/view/View;)V

    .line 7
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x23

    if-lt p2, v1, :cond_0

    .line 8
    new-instance p2, LF1/V0$f;

    invoke-direct {p2, p1, p0, v0}, LF1/V0$f;-><init>(Landroid/view/Window;LF1/V0;LF1/K;)V

    iput-object p2, p0, LF1/V0;->a:LF1/V0$g;

    goto :goto_0

    :cond_0
    const/16 v1, 0x1e

    if-lt p2, v1, :cond_1

    .line 9
    new-instance p2, LF1/V0$d;

    invoke-direct {p2, p1, p0, v0}, LF1/V0$d;-><init>(Landroid/view/Window;LF1/V0;LF1/K;)V

    iput-object p2, p0, LF1/V0;->a:LF1/V0$g;

    goto :goto_0

    .line 10
    :cond_1
    new-instance p2, LF1/V0$c;

    invoke-direct {p2, p1, v0}, LF1/V0$c;-><init>(Landroid/view/Window;LF1/K;)V

    iput-object p2, p0, LF1/V0;->a:LF1/V0$g;

    :goto_0
    return-void
.end method

.method private constructor <init>(Landroid/view/WindowInsetsController;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x23

    if-lt v0, v1, :cond_0

    .line 3
    new-instance v0, LF1/V0$f;

    new-instance v1, LF1/K;

    invoke-direct {v1, p1}, LF1/K;-><init>(Landroid/view/WindowInsetsController;)V

    invoke-direct {v0, p1, p0, v1}, LF1/V0$f;-><init>(Landroid/view/WindowInsetsController;LF1/V0;LF1/K;)V

    iput-object v0, p0, LF1/V0;->a:LF1/V0$g;

    goto :goto_0

    .line 4
    :cond_0
    new-instance v0, LF1/V0$d;

    new-instance v1, LF1/K;

    invoke-direct {v1, p1}, LF1/K;-><init>(Landroid/view/WindowInsetsController;)V

    invoke-direct {v0, p1, p0, v1}, LF1/V0$d;-><init>(Landroid/view/WindowInsetsController;LF1/V0;LF1/K;)V

    iput-object v0, p0, LF1/V0;->a:LF1/V0$g;

    :goto_0
    return-void
.end method

.method public static d(Landroid/view/WindowInsetsController;)LF1/V0;
    .locals 1

    new-instance v0, LF1/V0;

    invoke-direct {v0, p0}, LF1/V0;-><init>(Landroid/view/WindowInsetsController;)V

    return-object v0
.end method


# virtual methods
.method public a(Z)V
    .locals 1

    iget-object v0, p0, LF1/V0;->a:LF1/V0$g;

    invoke-virtual {v0, p1}, LF1/V0$g;->a(Z)V

    return-void
.end method

.method public b(Z)V
    .locals 1

    iget-object v0, p0, LF1/V0;->a:LF1/V0$g;

    invoke-virtual {v0, p1}, LF1/V0$g;->b(Z)V

    return-void
.end method

.method public c(I)V
    .locals 1

    iget-object v0, p0, LF1/V0;->a:LF1/V0$g;

    invoke-virtual {v0, p1}, LF1/V0$g;->c(I)V

    return-void
.end method
