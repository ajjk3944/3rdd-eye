.class final LZ2/f$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZ2/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LZ2/f$a;->a:Ljava/lang/String;

    iput-object p2, p0, LZ2/f$a;->b:Ljava/lang/String;

    iput-object p3, p0, LZ2/f$a;->c:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lc0/m;LZ2/h;)Ljava/util/Map;
    .locals 2

    const-string v0, "$this$mapSaver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "it"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p2}, LZ2/h;->g()Landroid/webkit/WebView;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->saveState(Landroid/os/Bundle;)Landroid/webkit/WebBackForwardList;

    :cond_0
    iget-object v0, p0, LZ2/f$a;->a:Ljava/lang/String;

    invoke-virtual {p2}, LZ2/h;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v0

    iget-object v1, p0, LZ2/f$a;->b:Ljava/lang/String;

    invoke-virtual {p2}, LZ2/h;->c()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p2

    iget-object v1, p0, LZ2/f$a;->c:Ljava/lang/String;

    invoke-static {v1, p1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    filled-new-array {v0, p2, p1}, [LYg/s;

    move-result-object p1

    invoke-static {p1}, LZg/U;->k([LYg/s;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lc0/m;

    check-cast p2, LZ2/h;

    invoke-virtual {p0, p1, p2}, LZ2/f$a;->a(Lc0/m;LZ2/h;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method
