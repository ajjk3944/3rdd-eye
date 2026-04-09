.class LMj/p$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMj/p;->K0(LMj/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LMj/f;

.field final synthetic b:LMj/p;


# direct methods
.method constructor <init>(LMj/p;LMj/f;)V
    .locals 0

    iput-object p1, p0, LMj/p$a;->b:LMj/p;

    iput-object p2, p0, LMj/p$a;->a:LMj/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private c(Ljava/lang/Throwable;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, LMj/p$a;->a:LMj/f;

    iget-object v1, p0, LMj/p$a;->b:LMj/p;

    invoke-interface {v0, v1, p1}, LMj/f;->b(LMj/d;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, LMj/B;->t(Ljava/lang/Throwable;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method


# virtual methods
.method public a(Lokhttp3/Call;Lokhttp3/Response;)V
    .locals 1

    :try_start_0
    iget-object p1, p0, LMj/p$a;->b:LMj/p;

    invoke-virtual {p1, p2}, LMj/p;->e(Lokhttp3/Response;)LMj/w;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object p2, p0, LMj/p$a;->a:LMj/f;

    iget-object v0, p0, LMj/p$a;->b:LMj/p;

    invoke-interface {p2, v0, p1}, LMj/f;->a(LMj/d;LMj/w;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, LMj/B;->t(Ljava/lang/Throwable;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void

    :catchall_1
    move-exception p1

    invoke-static {p1}, LMj/B;->t(Ljava/lang/Throwable;)V

    invoke-direct {p0, p1}, LMj/p$a;->c(Ljava/lang/Throwable;)V

    return-void
.end method

.method public b(Lokhttp3/Call;Ljava/io/IOException;)V
    .locals 0

    invoke-direct {p0, p2}, LMj/p$a;->c(Ljava/lang/Throwable;)V

    return-void
.end method
