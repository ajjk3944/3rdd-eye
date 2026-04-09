.class Lcom/google/gson/e$f;
.super Lcom/google/gson/internal/bind/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/gson/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "f"
.end annotation


# instance fields
.field private a:Lcom/google/gson/p;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/gson/internal/bind/j;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/gson/e$f;->a:Lcom/google/gson/p;

    return-void
.end method

.method private f()Lcom/google/gson/p;
    .locals 2

    iget-object v0, p0, Lcom/google/gson/e$f;->a:Lcom/google/gson/p;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Adapter for type with cyclic dependency has been used before dependency has been resolved"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public b(Lw5/a;)Ljava/lang/Object;
    .locals 1

    invoke-direct {p0}, Lcom/google/gson/e$f;->f()Lcom/google/gson/p;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/gson/p;->b(Lw5/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public d(Lw5/c;Ljava/lang/Object;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/gson/e$f;->f()Lcom/google/gson/p;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/gson/p;->d(Lw5/c;Ljava/lang/Object;)V

    return-void
.end method

.method public e()Lcom/google/gson/p;
    .locals 1

    invoke-direct {p0}, Lcom/google/gson/e$f;->f()Lcom/google/gson/p;

    move-result-object v0

    return-object v0
.end method

.method public g(Lcom/google/gson/p;)V
    .locals 1

    iget-object v0, p0, Lcom/google/gson/e$f;->a:Lcom/google/gson/p;

    if-nez v0, :cond_0

    iput-object p1, p0, Lcom/google/gson/e$f;->a:Lcom/google/gson/p;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "Delegate is already set"

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method
