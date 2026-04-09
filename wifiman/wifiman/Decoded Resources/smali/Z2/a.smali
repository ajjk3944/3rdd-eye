.class public LZ2/a;
.super Landroid/webkit/WebChromeClient;
.source "SourceFile"


# instance fields
.field public a:LZ2/h;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LZ2/h;
    .locals 1

    iget-object v0, p0, LZ2/a;->a:LZ2/h;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "state"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public b(LZ2/h;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LZ2/a;->a:LZ2/h;

    return-void
.end method

.method public onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 2

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onProgressChanged(Landroid/webkit/WebView;I)V

    invoke-virtual {p0}, LZ2/a;->a()LZ2/h;

    move-result-object p1

    invoke-virtual {p1}, LZ2/h;->d()LZ2/c;

    move-result-object p1

    instance-of p1, p1, LZ2/c$a;

    if-eqz p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, LZ2/a;->a()LZ2/h;

    move-result-object p1

    new-instance v0, LZ2/c$c;

    int-to-float p2, p2

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr p2, v1

    invoke-direct {v0, p2}, LZ2/c$c;-><init>(F)V

    invoke-virtual {p1, v0}, LZ2/h;->j(LZ2/c;)V

    return-void
.end method

.method public onReceivedIcon(Landroid/webkit/WebView;Landroid/graphics/Bitmap;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onReceivedIcon(Landroid/webkit/WebView;Landroid/graphics/Bitmap;)V

    invoke-virtual {p0}, LZ2/a;->a()LZ2/h;

    move-result-object p1

    invoke-virtual {p1, p2}, LZ2/h;->k(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V

    invoke-virtual {p0}, LZ2/a;->a()LZ2/h;

    move-result-object p1

    invoke-virtual {p1, p2}, LZ2/h;->l(Ljava/lang/String;)V

    return-void
.end method
