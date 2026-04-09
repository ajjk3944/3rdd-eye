.class Lt5/d$a;
.super Lcom/google/gson/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt5/d;->b(Lcom/google/gson/e;Lcom/google/gson/reflect/a;)Lcom/google/gson/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private volatile a:Lcom/google/gson/p;

.field final synthetic b:Z

.field final synthetic c:Z

.field final synthetic d:Lcom/google/gson/e;

.field final synthetic e:Lcom/google/gson/reflect/a;

.field final synthetic f:Lt5/d;


# direct methods
.method constructor <init>(Lt5/d;ZZLcom/google/gson/e;Lcom/google/gson/reflect/a;)V
    .locals 0

    iput-object p1, p0, Lt5/d$a;->f:Lt5/d;

    iput-boolean p2, p0, Lt5/d$a;->b:Z

    iput-boolean p3, p0, Lt5/d$a;->c:Z

    iput-object p4, p0, Lt5/d$a;->d:Lcom/google/gson/e;

    iput-object p5, p0, Lt5/d$a;->e:Lcom/google/gson/reflect/a;

    invoke-direct {p0}, Lcom/google/gson/p;-><init>()V

    return-void
.end method

.method private e()Lcom/google/gson/p;
    .locals 3

    iget-object v0, p0, Lt5/d$a;->a:Lcom/google/gson/p;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lt5/d$a;->d:Lcom/google/gson/e;

    iget-object v1, p0, Lt5/d$a;->f:Lt5/d;

    iget-object v2, p0, Lt5/d$a;->e:Lcom/google/gson/reflect/a;

    invoke-virtual {v0, v1, v2}, Lcom/google/gson/e;->n(Lcom/google/gson/q;Lcom/google/gson/reflect/a;)Lcom/google/gson/p;

    move-result-object v0

    iput-object v0, p0, Lt5/d$a;->a:Lcom/google/gson/p;

    :goto_0
    return-object v0
.end method


# virtual methods
.method public b(Lw5/a;)Ljava/lang/Object;
    .locals 1

    iget-boolean v0, p0, Lt5/d$a;->b:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lw5/a;->F0()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-direct {p0}, Lt5/d$a;->e()Lcom/google/gson/p;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/gson/p;->b(Lw5/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public d(Lw5/c;Ljava/lang/Object;)V
    .locals 1

    iget-boolean v0, p0, Lt5/d$a;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lw5/c;->b0()Lw5/c;

    return-void

    :cond_0
    invoke-direct {p0}, Lt5/d$a;->e()Lcom/google/gson/p;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/gson/p;->d(Lw5/c;Ljava/lang/Object;)V

    return-void
.end method
