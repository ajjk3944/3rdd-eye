.class final LOj/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMj/h;


# static fields
.field private static final c:Lokhttp3/MediaType;


# instance fields
.field private final a:Lcom/google/gson/e;

.field private final b:Lcom/google/gson/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "application/json; charset=UTF-8"

    invoke-static {v0}, Lokhttp3/MediaType;->e(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v0

    sput-object v0, LOj/b;->c:Lokhttp3/MediaType;

    return-void
.end method

.method constructor <init>(Lcom/google/gson/e;Lcom/google/gson/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LOj/b;->a:Lcom/google/gson/e;

    iput-object p2, p0, LOj/b;->b:Lcom/google/gson/p;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LOj/b;->b(Ljava/lang/Object;)Lokhttp3/RequestBody;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/Object;)Lokhttp3/RequestBody;
    .locals 4

    new-instance v0, Lej/e;

    invoke-direct {v0}, Lej/e;-><init>()V

    new-instance v1, Ljava/io/OutputStreamWriter;

    invoke-virtual {v0}, Lej/e;->p0()Ljava/io/OutputStream;

    move-result-object v2

    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v1, v2, v3}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    iget-object v2, p0, LOj/b;->a:Lcom/google/gson/e;

    invoke-virtual {v2, v1}, Lcom/google/gson/e;->q(Ljava/io/Writer;)Lw5/c;

    move-result-object v1

    iget-object v2, p0, LOj/b;->b:Lcom/google/gson/p;

    invoke-virtual {v2, v1, p1}, Lcom/google/gson/p;->d(Lw5/c;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lw5/c;->close()V

    sget-object p1, LOj/b;->c:Lokhttp3/MediaType;

    invoke-virtual {v0}, Lej/e;->v0()Lej/h;

    move-result-object v0

    invoke-static {p1, v0}, Lokhttp3/RequestBody;->c(Lokhttp3/MediaType;Lej/h;)Lokhttp3/RequestBody;

    move-result-object p1

    return-object p1
.end method
