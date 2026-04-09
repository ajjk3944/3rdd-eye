.class public LD2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/data/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD2/c$a;,
        LD2/c$b;
    }
.end annotation


# instance fields
.field private final a:Landroid/net/Uri;

.field private final b:LD2/e;

.field private c:Ljava/io/InputStream;


# direct methods
.method constructor <init>(Landroid/net/Uri;LD2/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD2/c;->a:Landroid/net/Uri;

    iput-object p2, p0, LD2/c;->b:LD2/e;

    return-void
.end method

.method private static c(Landroid/content/Context;Landroid/net/Uri;LD2/d;)LD2/c;
    .locals 3

    invoke-static {p0}, Lcom/bumptech/glide/b;->c(Landroid/content/Context;)Lcom/bumptech/glide/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/b;->e()LF2/b;

    move-result-object v0

    new-instance v1, LD2/e;

    invoke-static {p0}, Lcom/bumptech/glide/b;->c(Landroid/content/Context;)Lcom/bumptech/glide/b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bumptech/glide/b;->j()Lcom/bumptech/glide/Registry;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bumptech/glide/Registry;->g()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    invoke-direct {v1, v2, p2, v0, p0}, LD2/e;-><init>(Ljava/util/List;LD2/d;LF2/b;Landroid/content/ContentResolver;)V

    new-instance p0, LD2/c;

    invoke-direct {p0, p1, v1}, LD2/c;-><init>(Landroid/net/Uri;LD2/e;)V

    return-object p0
.end method

.method public static f(Landroid/content/Context;Landroid/net/Uri;)LD2/c;
    .locals 2

    new-instance v0, LD2/c$a;

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-direct {v0, v1}, LD2/c$a;-><init>(Landroid/content/ContentResolver;)V

    invoke-static {p0, p1, v0}, LD2/c;->c(Landroid/content/Context;Landroid/net/Uri;LD2/d;)LD2/c;

    move-result-object p0

    return-object p0
.end method

.method public static g(Landroid/content/Context;Landroid/net/Uri;)LD2/c;
    .locals 2

    new-instance v0, LD2/c$b;

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-direct {v0, v1}, LD2/c$b;-><init>(Landroid/content/ContentResolver;)V

    invoke-static {p0, p1, v0}, LD2/c;->c(Landroid/content/Context;Landroid/net/Uri;LD2/d;)LD2/c;

    move-result-object p0

    return-object p0
.end method

.method private h()Ljava/io/InputStream;
    .locals 4

    iget-object v0, p0, LD2/c;->b:LD2/e;

    iget-object v1, p0, LD2/c;->a:Landroid/net/Uri;

    invoke-virtual {v0, v1}, LD2/e;->d(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v0

    const/4 v1, -0x1

    if-eqz v0, :cond_0

    iget-object v2, p0, LD2/c;->b:LD2/e;

    iget-object v3, p0, LD2/c;->a:Landroid/net/Uri;

    invoke-virtual {v2, v3}, LD2/e;->a(Landroid/net/Uri;)I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    if-eq v2, v1, :cond_1

    new-instance v1, Lcom/bumptech/glide/load/data/g;

    invoke-direct {v1, v0, v2}, Lcom/bumptech/glide/load/data/g;-><init>(Ljava/io/InputStream;I)V

    move-object v0, v1

    :cond_1
    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/Class;
    .locals 1

    const-class v0, Ljava/io/InputStream;

    return-object v0
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, LD2/c;->c:Ljava/io/InputStream;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public cancel()V
    .locals 0

    return-void
.end method

.method public d()LC2/a;
    .locals 1

    sget-object v0, LC2/a;->LOCAL:LC2/a;

    return-object v0
.end method

.method public e(Lcom/bumptech/glide/g;Lcom/bumptech/glide/load/data/d$a;)V
    .locals 2

    :try_start_0
    invoke-direct {p0}, LD2/c;->h()Ljava/io/InputStream;

    move-result-object p1

    iput-object p1, p0, LD2/c;->c:Ljava/io/InputStream;

    invoke-interface {p2, p1}, Lcom/bumptech/glide/load/data/d$a;->f(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const/4 v0, 0x3

    const-string v1, "MediaStoreThumbFetcher"

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Failed to find thumbnail file"

    invoke-static {v1, v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    invoke-interface {p2, p1}, Lcom/bumptech/glide/load/data/d$a;->c(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method
