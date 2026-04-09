.class final LMj/p$b;
.super Lokhttp3/ResponseBody;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LMj/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private final c:Lokhttp3/ResponseBody;

.field private final d:Lej/g;

.field e:Ljava/io/IOException;


# direct methods
.method constructor <init>(Lokhttp3/ResponseBody;)V
    .locals 1

    invoke-direct {p0}, Lokhttp3/ResponseBody;-><init>()V

    iput-object p1, p0, LMj/p$b;->c:Lokhttp3/ResponseBody;

    new-instance v0, LMj/p$b$a;

    invoke-virtual {p1}, Lokhttp3/ResponseBody;->y()Lej/g;

    move-result-object p1

    invoke-direct {v0, p0, p1}, LMj/p$b$a;-><init>(LMj/p$b;Lej/D;)V

    invoke-static {v0}, Lej/p;->d(Lej/D;)Lej/g;

    move-result-object p1

    iput-object p1, p0, LMj/p$b;->d:Lej/g;

    return-void
.end method


# virtual methods
.method J()V
    .locals 1

    iget-object v0, p0, LMj/p$b;->e:Ljava/io/IOException;

    if-nez v0, :cond_0

    return-void

    :cond_0
    throw v0
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, LMj/p$b;->c:Lokhttp3/ResponseBody;

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->close()V

    return-void
.end method

.method public p()J
    .locals 2

    iget-object v0, p0, LMj/p$b;->c:Lokhttp3/ResponseBody;

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->p()J

    move-result-wide v0

    return-wide v0
.end method

.method public s()Lokhttp3/MediaType;
    .locals 1

    iget-object v0, p0, LMj/p$b;->c:Lokhttp3/ResponseBody;

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->s()Lokhttp3/MediaType;

    move-result-object v0

    return-object v0
.end method

.method public y()Lej/g;
    .locals 1

    iget-object v0, p0, LMj/p$b;->d:Lej/g;

    return-object v0
.end method
