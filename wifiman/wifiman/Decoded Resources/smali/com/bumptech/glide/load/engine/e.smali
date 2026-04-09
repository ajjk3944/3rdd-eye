.class Lcom/bumptech/glide/load/engine/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LG2/a$b;


# instance fields
.field private final a:LC2/d;

.field private final b:Ljava/lang/Object;

.field private final c:LC2/g;


# direct methods
.method constructor <init>(LC2/d;Ljava/lang/Object;LC2/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/bumptech/glide/load/engine/e;->a:LC2/d;

    iput-object p2, p0, Lcom/bumptech/glide/load/engine/e;->b:Ljava/lang/Object;

    iput-object p3, p0, Lcom/bumptech/glide/load/engine/e;->c:LC2/g;

    return-void
.end method


# virtual methods
.method public a(Ljava/io/File;)Z
    .locals 3

    iget-object v0, p0, Lcom/bumptech/glide/load/engine/e;->a:LC2/d;

    iget-object v1, p0, Lcom/bumptech/glide/load/engine/e;->b:Ljava/lang/Object;

    iget-object v2, p0, Lcom/bumptech/glide/load/engine/e;->c:LC2/g;

    invoke-interface {v0, v1, p1, v2}, LC2/d;->a(Ljava/lang/Object;Ljava/io/File;LC2/g;)Z

    move-result p1

    return p1
.end method
