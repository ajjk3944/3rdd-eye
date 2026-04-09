.class LF1/w0$d;
.super LF1/w0$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF1/w0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LF1/w0$c;-><init>()V

    return-void
.end method

.method constructor <init>(LF1/w0;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LF1/w0$c;-><init>(LF1/w0;)V

    return-void
.end method


# virtual methods
.method c(ILw1/f;)V
    .locals 1

    iget-object v0, p0, LF1/w0$c;->c:Landroid/view/WindowInsets$Builder;

    invoke-static {p1}, LF1/w0$m;->a(I)I

    move-result p1

    invoke-virtual {p2}, Lw1/f;->e()Landroid/graphics/Insets;

    move-result-object p2

    invoke-static {v0, p1, p2}, LF1/D0;->a(Landroid/view/WindowInsets$Builder;ILandroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method
