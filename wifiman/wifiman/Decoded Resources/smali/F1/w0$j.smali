.class LF1/w0$j;
.super LF1/w0$i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF1/w0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "j"
.end annotation


# static fields
.field static final q:LF1/w0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, LF1/L0;->a()Landroid/view/WindowInsets;

    move-result-object v0

    invoke-static {v0}, LF1/w0;->w(Landroid/view/WindowInsets;)LF1/w0;

    move-result-object v0

    sput-object v0, LF1/w0$j;->q:LF1/w0;

    return-void
.end method

.method constructor <init>(LF1/w0;LF1/w0$j;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, LF1/w0$i;-><init>(LF1/w0;LF1/w0$i;)V

    return-void
.end method

.method constructor <init>(LF1/w0;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LF1/w0$i;-><init>(LF1/w0;Landroid/view/WindowInsets;)V

    return-void
.end method


# virtual methods
.method final d(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public g(I)Lw1/f;
    .locals 1

    iget-object v0, p0, LF1/w0$f;->c:Landroid/view/WindowInsets;

    invoke-static {p1}, LF1/w0$m;->a(I)I

    move-result p1

    invoke-static {v0, p1}, LF1/K0;->a(Landroid/view/WindowInsets;I)Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {p1}, Lw1/f;->d(Landroid/graphics/Insets;)Lw1/f;

    move-result-object p1

    return-object p1
.end method

.method public h(I)Lw1/f;
    .locals 1

    iget-object v0, p0, LF1/w0$f;->c:Landroid/view/WindowInsets;

    invoke-static {p1}, LF1/w0$m;->a(I)I

    move-result p1

    invoke-static {v0, p1}, LF1/M0;->a(Landroid/view/WindowInsets;I)Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {p1}, Lw1/f;->d(Landroid/graphics/Insets;)Lw1/f;

    move-result-object p1

    return-object p1
.end method

.method public q(I)Z
    .locals 1

    iget-object v0, p0, LF1/w0$f;->c:Landroid/view/WindowInsets;

    invoke-static {p1}, LF1/w0$m;->a(I)I

    move-result p1

    invoke-static {v0, p1}, LF1/N0;->a(Landroid/view/WindowInsets;I)Z

    move-result p1

    return p1
.end method
