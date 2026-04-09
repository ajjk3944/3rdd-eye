.class final LOj/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMj/h;


# instance fields
.field private final a:Lcom/google/gson/e;

.field private final b:Lcom/google/gson/p;


# direct methods
.method constructor <init>(Lcom/google/gson/e;Lcom/google/gson/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LOj/c;->a:Lcom/google/gson/e;

    iput-object p2, p0, LOj/c;->b:Lcom/google/gson/p;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lokhttp3/ResponseBody;

    invoke-virtual {p0, p1}, LOj/c;->b(Lokhttp3/ResponseBody;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(Lokhttp3/ResponseBody;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LOj/c;->a:Lcom/google/gson/e;

    invoke-virtual {p1}, Lokhttp3/ResponseBody;->h()Ljava/io/Reader;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/gson/e;->p(Ljava/io/Reader;)Lw5/a;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, LOj/c;->b:Lcom/google/gson/p;

    invoke-virtual {v1, v0}, Lcom/google/gson/p;->b(Lw5/a;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0}, Lw5/a;->v0()Lw5/b;

    move-result-object v0

    sget-object v2, Lw5/b;->END_DOCUMENT:Lw5/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v0, v2, :cond_0

    invoke-virtual {p1}, Lokhttp3/ResponseBody;->close()V

    return-object v1

    :cond_0
    :try_start_1
    new-instance v0, Lcom/google/gson/JsonIOException;

    const-string v1, "JSON document was not fully consumed."

    invoke-direct {v0, v1}, Lcom/google/gson/JsonIOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Lokhttp3/ResponseBody;->close()V

    throw v0
.end method
