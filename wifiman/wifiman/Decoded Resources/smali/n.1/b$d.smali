.class public Ln/b$d;
.super Ln/b$f;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field private a:Ln/b$c;

.field private b:Z

.field final synthetic c:Ln/b;


# direct methods
.method constructor <init>(Ln/b;)V
    .locals 0

    iput-object p1, p0, Ln/b$d;->c:Ln/b;

    invoke-direct {p0}, Ln/b$f;-><init>()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Ln/b$d;->b:Z

    return-void
.end method


# virtual methods
.method a(Ln/b$c;)V
    .locals 1

    iget-object v0, p0, Ln/b$d;->a:Ln/b$c;

    if-ne p1, v0, :cond_1

    iget-object p1, v0, Ln/b$c;->d:Ln/b$c;

    iput-object p1, p0, Ln/b$d;->a:Ln/b$c;

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Ln/b$d;->b:Z

    :cond_1
    return-void
.end method

.method public c()Ljava/util/Map$Entry;
    .locals 1

    iget-boolean v0, p0, Ln/b$d;->b:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Ln/b$d;->b:Z

    iget-object v0, p0, Ln/b$d;->c:Ln/b;

    iget-object v0, v0, Ln/b;->a:Ln/b$c;

    iput-object v0, p0, Ln/b$d;->a:Ln/b$c;

    goto :goto_1

    :cond_0
    iget-object v0, p0, Ln/b$d;->a:Ln/b$c;

    if-eqz v0, :cond_1

    iget-object v0, v0, Ln/b$c;->c:Ln/b$c;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Ln/b$d;->a:Ln/b$c;

    :goto_1
    iget-object v0, p0, Ln/b$d;->a:Ln/b$c;

    return-object v0
.end method

.method public hasNext()Z
    .locals 3

    iget-boolean v0, p0, Ln/b$d;->b:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Ln/b$d;->c:Ln/b;

    iget-object v0, v0, Ln/b;->a:Ln/b$c;

    if-eqz v0, :cond_0

    move v1, v2

    :cond_0
    return v1

    :cond_1
    iget-object v0, p0, Ln/b$d;->a:Ln/b$c;

    if-eqz v0, :cond_2

    iget-object v0, v0, Ln/b$c;->c:Ln/b$c;

    if-eqz v0, :cond_2

    move v1, v2

    :cond_2
    return v1
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ln/b$d;->c()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method
