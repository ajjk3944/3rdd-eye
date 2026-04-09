.class public LZ2/b;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# instance fields
.field public a:LZ2/h;

.field public b:LZ2/g;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LZ2/g;
    .locals 1

    iget-object v0, p0, LZ2/b;->b:LZ2/g;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "navigator"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public b()LZ2/h;
    .locals 1

    iget-object v0, p0, LZ2/b;->a:LZ2/h;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "state"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public c(LZ2/g;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LZ2/b;->b:LZ2/g;

    return-void
.end method

.method public d(LZ2/h;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LZ2/b;->a:LZ2/h;

    return-void
.end method

.method public doUpdateVisitedHistory(Landroid/webkit/WebView;Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->doUpdateVisitedHistory(Landroid/webkit/WebView;Ljava/lang/String;Z)V

    invoke-virtual {p0}, LZ2/b;->a()LZ2/g;

    move-result-object p2

    invoke-virtual {p1}, Landroid/webkit/WebView;->canGoBack()Z

    move-result p3

    invoke-virtual {p2, p3}, LZ2/g;->d(Z)V

    invoke-virtual {p0}, LZ2/b;->a()LZ2/g;

    move-result-object p2

    invoke-virtual {p1}, Landroid/webkit/WebView;->canGoForward()Z

    move-result p1

    invoke-virtual {p2, p1}, LZ2/g;->e(Z)V

    return-void
.end method

.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    invoke-virtual {p0}, LZ2/b;->b()LZ2/h;

    move-result-object p1

    sget-object p2, LZ2/c$a;->a:LZ2/c$a;

    invoke-virtual {p1, p2}, LZ2/h;->j(LZ2/c;)V

    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    invoke-virtual {p0}, LZ2/b;->b()LZ2/h;

    move-result-object p1

    new-instance p3, LZ2/c$c;

    const/4 v0, 0x0

    invoke-direct {p3, v0}, LZ2/c$c;-><init>(F)V

    invoke-virtual {p1, p3}, LZ2/h;->j(LZ2/c;)V

    invoke-virtual {p0}, LZ2/b;->b()LZ2/h;

    move-result-object p1

    invoke-virtual {p1}, LZ2/h;->b()Landroidx/compose/runtime/snapshots/k;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/compose/runtime/snapshots/k;->clear()V

    invoke-virtual {p0}, LZ2/b;->b()LZ2/h;

    move-result-object p1

    const/4 p3, 0x0

    invoke-virtual {p1, p3}, LZ2/h;->l(Ljava/lang/String;)V

    invoke-virtual {p0}, LZ2/b;->b()LZ2/h;

    move-result-object p1

    invoke-virtual {p1, p3}, LZ2/h;->k(Landroid/graphics/Bitmap;)V

    invoke-virtual {p0}, LZ2/b;->b()LZ2/h;

    move-result-object p1

    invoke-virtual {p1, p2}, LZ2/h;->i(Ljava/lang/String;)V

    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V

    if-eqz p3, :cond_0

    invoke-virtual {p0}, LZ2/b;->b()LZ2/h;

    move-result-object p1

    invoke-virtual {p1}, LZ2/h;->b()Landroidx/compose/runtime/snapshots/k;

    move-result-object p1

    new-instance v0, LZ2/e;

    invoke-direct {v0, p2, p3}, LZ2/e;-><init>(Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V

    invoke-virtual {p1, v0}, Landroidx/compose/runtime/snapshots/k;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method
