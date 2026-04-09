.class final LI2/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/data/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI2/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:LI2/e$a;

.field private c:Ljava/lang/Object;


# direct methods
.method constructor <init>(Ljava/lang/String;LI2/e$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI2/e$b;->a:Ljava/lang/String;

    iput-object p2, p0, LI2/e$b;->b:LI2/e$a;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, LI2/e$b;->b:LI2/e$a;

    invoke-interface {v0}, LI2/e$a;->a()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public b()V
    .locals 2

    :try_start_0
    iget-object v0, p0, LI2/e$b;->b:LI2/e$a;

    iget-object v1, p0, LI2/e$b;->c:Ljava/lang/Object;

    invoke-interface {v0, v1}, LI2/e$a;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
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
    .locals 1

    :try_start_0
    iget-object p1, p0, LI2/e$b;->b:LI2/e$a;

    iget-object v0, p0, LI2/e$b;->a:Ljava/lang/String;

    invoke-interface {p1, v0}, LI2/e$a;->c(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, LI2/e$b;->c:Ljava/lang/Object;

    invoke-interface {p2, p1}, Lcom/bumptech/glide/load/data/d$a;->f(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-interface {p2, p1}, Lcom/bumptech/glide/load/data/d$a;->c(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method
