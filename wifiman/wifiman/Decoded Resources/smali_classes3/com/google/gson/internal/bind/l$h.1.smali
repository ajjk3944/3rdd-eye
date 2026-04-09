.class Lcom/google/gson/internal/bind/l$h;
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

    invoke-virtual {p0, p1}, Lcom/google/gson/internal/bind/l$h;->e(Lw5/a;)Ljava/math/BigInteger;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Lw5/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/math/BigInteger;

    invoke-virtual {p0, p1, p2}, Lcom/google/gson/internal/bind/l$h;->f(Lw5/c;Ljava/math/BigInteger;)V

    return-void
.end method

.method public e(Lw5/a;)Ljava/math/BigInteger;
    .locals 5

    invoke-virtual {p1}, Lw5/a;->v0()Lw5/b;

    move-result-object v0

    sget-object v1, Lw5/b;->NULL:Lw5/b;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lw5/a;->r0()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lw5/a;->t0()Ljava/lang/String;

    move-result-object v0

    :try_start_0
    invoke-static {v0}, Lt5/i;->c(Ljava/lang/String;)Ljava/math/BigInteger;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v1

    new-instance v2, Lcom/google/gson/JsonSyntaxException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "Failed parsing \'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' as BigInteger; at path "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lw5/a;->P()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1, v1}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
.end method

.method public f(Lw5/c;Ljava/math/BigInteger;)V
    .locals 0

    invoke-virtual {p1, p2}, Lw5/c;->w0(Ljava/lang/Number;)Lw5/c;

    return-void
.end method
