.class abstract Ln/b$e;
.super Ln/b$f;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "e"
.end annotation


# instance fields
.field a:Ln/b$c;

.field b:Ln/b$c;


# direct methods
.method constructor <init>(Ln/b$c;Ln/b$c;)V
    .locals 0

    invoke-direct {p0}, Ln/b$f;-><init>()V

    iput-object p2, p0, Ln/b$e;->a:Ln/b$c;

    iput-object p1, p0, Ln/b$e;->b:Ln/b$c;

    return-void
.end method

.method private f()Ln/b$c;
    .locals 2

    iget-object v0, p0, Ln/b$e;->b:Ln/b$c;

    iget-object v1, p0, Ln/b$e;->a:Ln/b$c;

    if-eq v0, v1, :cond_1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Ln/b$e;->d(Ln/b$c;)Ln/b$c;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public a(Ln/b$c;)V
    .locals 1

    iget-object v0, p0, Ln/b$e;->a:Ln/b$c;

    if-ne v0, p1, :cond_0

    iget-object v0, p0, Ln/b$e;->b:Ln/b$c;

    if-ne p1, v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Ln/b$e;->b:Ln/b$c;

    iput-object v0, p0, Ln/b$e;->a:Ln/b$c;

    :cond_0
    iget-object v0, p0, Ln/b$e;->a:Ln/b$c;

    if-ne v0, p1, :cond_1

    invoke-virtual {p0, v0}, Ln/b$e;->c(Ln/b$c;)Ln/b$c;

    move-result-object v0

    iput-object v0, p0, Ln/b$e;->a:Ln/b$c;

    :cond_1
    iget-object v0, p0, Ln/b$e;->b:Ln/b$c;

    if-ne v0, p1, :cond_2

    invoke-direct {p0}, Ln/b$e;->f()Ln/b$c;

    move-result-object p1

    iput-object p1, p0, Ln/b$e;->b:Ln/b$c;

    :cond_2
    return-void
.end method

.method abstract c(Ln/b$c;)Ln/b$c;
.end method

.method abstract d(Ln/b$c;)Ln/b$c;
.end method

.method public e()Ljava/util/Map$Entry;
    .locals 2

    iget-object v0, p0, Ln/b$e;->b:Ln/b$c;

    invoke-direct {p0}, Ln/b$e;->f()Ln/b$c;

    move-result-object v1

    iput-object v1, p0, Ln/b$e;->b:Ln/b$c;

    return-object v0
.end method

.method public hasNext()Z
    .locals 1

    iget-object v0, p0, Ln/b$e;->b:Ln/b$c;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ln/b$e;->e()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method
