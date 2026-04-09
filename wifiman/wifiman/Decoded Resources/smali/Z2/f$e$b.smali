.class final LZ2/f$e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZ2/f$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/webkit/WebView;


# direct methods
.method constructor <init>(Landroid/webkit/WebView;)V
    .locals 0

    iput-object p1, p0, LZ2/f$e$b;->a:Landroid/webkit/WebView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZ2/d;

    invoke-virtual {p0, p1, p2}, LZ2/f$e$b;->b(LZ2/d;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(LZ2/d;Ldh/e;)Ljava/lang/Object;
    .locals 1

    instance-of p2, p1, LZ2/d$b;

    if-eqz p2, :cond_0

    iget-object p2, p0, LZ2/f$e$b;->a:Landroid/webkit/WebView;

    check-cast p1, LZ2/d$b;

    invoke-virtual {p1}, LZ2/d$b;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, LZ2/d$b;->a()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;Ljava/util/Map;)V

    goto :goto_0

    :cond_0
    instance-of p1, p1, LZ2/d$a;

    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
