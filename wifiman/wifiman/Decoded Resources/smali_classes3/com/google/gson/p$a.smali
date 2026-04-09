.class Lcom/google/gson/p$a;
.super Lcom/google/gson/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/gson/p;->a()Lcom/google/gson/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/gson/p;


# direct methods
.method constructor <init>(Lcom/google/gson/p;)V
    .locals 0

    iput-object p1, p0, Lcom/google/gson/p$a;->a:Lcom/google/gson/p;

    invoke-direct {p0}, Lcom/google/gson/p;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lw5/a;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p1}, Lw5/a;->v0()Lw5/b;

    move-result-object v0

    sget-object v1, Lw5/b;->NULL:Lw5/b;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lw5/a;->r0()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/google/gson/p$a;->a:Lcom/google/gson/p;

    invoke-virtual {v0, p1}, Lcom/google/gson/p;->b(Lw5/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public d(Lw5/c;Ljava/lang/Object;)V
    .locals 1

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lw5/c;->b0()Lw5/c;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/gson/p$a;->a:Lcom/google/gson/p;

    invoke-virtual {v0, p1, p2}, Lcom/google/gson/p;->d(Lw5/c;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
