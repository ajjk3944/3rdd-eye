.class final LZ2/f$f;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZ2/f;->a(LZ2/h;Landroid/widget/FrameLayout$LayoutParams;Landroidx/compose/ui/e;ZLZ2/g;Lmh/l;Lmh/l;LZ2/b;LZ2/a;Lmh/l;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/l;

.field final synthetic b:Lmh/l;

.field final synthetic c:Landroid/widget/FrameLayout$LayoutParams;

.field final synthetic d:LZ2/h;

.field final synthetic e:LZ2/a;

.field final synthetic f:LZ2/b;


# direct methods
.method constructor <init>(Lmh/l;Lmh/l;Landroid/widget/FrameLayout$LayoutParams;LZ2/h;LZ2/a;LZ2/b;)V
    .locals 0

    iput-object p1, p0, LZ2/f$f;->a:Lmh/l;

    iput-object p2, p0, LZ2/f$f;->b:Lmh/l;

    iput-object p3, p0, LZ2/f$f;->c:Landroid/widget/FrameLayout$LayoutParams;

    iput-object p4, p0, LZ2/f$f;->d:LZ2/h;

    iput-object p5, p0, LZ2/f$f;->e:LZ2/a;

    iput-object p6, p0, LZ2/f$f;->f:LZ2/b;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Landroid/webkit/WebView;
    .locals 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LZ2/f$f;->a:Lmh/l;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, Landroid/webkit/WebView;

    invoke-direct {v0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    :cond_1
    iget-object p1, p0, LZ2/f$f;->b:Lmh/l;

    iget-object v1, p0, LZ2/f$f;->c:Landroid/widget/FrameLayout$LayoutParams;

    iget-object v2, p0, LZ2/f$f;->d:LZ2/h;

    iget-object v3, p0, LZ2/f$f;->e:LZ2/a;

    iget-object v4, p0, LZ2/f$f;->f:LZ2/b;

    invoke-interface {p1, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v2}, LZ2/h;->f()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->restoreState(Landroid/os/Bundle;)Landroid/webkit/WebBackForwardList;

    :cond_2
    invoke-virtual {v0, v3}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    invoke-virtual {v0, v4}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    iget-object p1, p0, LZ2/f$f;->d:LZ2/h;

    invoke-virtual {p1, v0}, LZ2/h;->n(Landroid/webkit/WebView;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/content/Context;

    invoke-virtual {p0, p1}, LZ2/f$f;->a(Landroid/content/Context;)Landroid/webkit/WebView;

    move-result-object p1

    return-object p1
.end method
