.class Lcom/google/gson/internal/bind/l$i;
.super Lcom/google/gson/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/gson/internal/bind/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/gson/p;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic b(Lw5/a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/gson/internal/bind/l$i;->e(Lw5/a;)Lt5/g;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Lw5/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lt5/g;

    invoke-virtual {p0, p1, p2}, Lcom/google/gson/internal/bind/l$i;->f(Lw5/c;Lt5/g;)V

    return-void
.end method

.method public e(Lw5/a;)Lt5/g;
    .locals 2

    invoke-virtual {p1}, Lw5/a;->v0()Lw5/b;

    move-result-object v0

    sget-object v1, Lw5/b;->NULL:Lw5/b;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lw5/a;->r0()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Lt5/g;

    invoke-virtual {p1}, Lw5/a;->t0()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lt5/g;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public f(Lw5/c;Lt5/g;)V
    .locals 0

    invoke-virtual {p1, p2}, Lw5/c;->w0(Ljava/lang/Number;)Lw5/c;

    return-void
.end method
