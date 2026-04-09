.class final LPj/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMj/h;


# static fields
.field private static final b:Lej/h;


# instance fields
.field private final a:LY6/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "EFBBBF"

    invoke-static {v0}, Lej/h;->g(Ljava/lang/String;)Lej/h;

    move-result-object v0

    sput-object v0, LPj/c;->b:Lej/h;

    return-void
.end method

.method constructor <init>(LY6/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPj/c;->a:LY6/h;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lokhttp3/ResponseBody;

    invoke-virtual {p0, p1}, LPj/c;->b(Lokhttp3/ResponseBody;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(Lokhttp3/ResponseBody;)Ljava/lang/Object;
    .locals 4

    invoke-virtual {p1}, Lokhttp3/ResponseBody;->y()Lej/g;

    move-result-object v0

    :try_start_0
    sget-object v1, LPj/c;->b:Lej/h;

    const-wide/16 v2, 0x0

    invoke-interface {v0, v2, v3, v1}, Lej/g;->i0(JLej/h;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lej/h;->b0()I

    move-result v1

    int-to-long v1, v1

    invoke-interface {v0, v1, v2}, Lej/g;->d(J)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-static {v0}, LY6/k;->b0(Lej/g;)LY6/k;

    move-result-object v0

    iget-object v1, p0, LPj/c;->a:LY6/h;

    invoke-virtual {v1, v0}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0}, LY6/k;->d0()LY6/k$c;

    move-result-object v0

    sget-object v2, LY6/k$c;->END_DOCUMENT:LY6/k$c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Lokhttp3/ResponseBody;->close()V

    return-object v1

    :cond_1
    :try_start_1
    new-instance v0, Lcom/squareup/moshi/JsonDataException;

    const-string v1, "JSON document was not fully consumed."

    invoke-direct {v0, v1}, Lcom/squareup/moshi/JsonDataException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    invoke-virtual {p1}, Lokhttp3/ResponseBody;->close()V

    throw v0
.end method
