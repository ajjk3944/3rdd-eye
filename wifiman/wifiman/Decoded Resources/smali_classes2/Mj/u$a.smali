.class LMj/u$a;
.super Lokhttp3/RequestBody;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LMj/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final b:Lokhttp3/RequestBody;

.field private final c:Lokhttp3/MediaType;


# direct methods
.method constructor <init>(Lokhttp3/RequestBody;Lokhttp3/MediaType;)V
    .locals 0

    invoke-direct {p0}, Lokhttp3/RequestBody;-><init>()V

    iput-object p1, p0, LMj/u$a;->b:Lokhttp3/RequestBody;

    iput-object p2, p0, LMj/u$a;->c:Lokhttp3/MediaType;

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-object v0, p0, LMj/u$a;->b:Lokhttp3/RequestBody;

    invoke-virtual {v0}, Lokhttp3/RequestBody;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method public b()Lokhttp3/MediaType;
    .locals 1

    iget-object v0, p0, LMj/u$a;->c:Lokhttp3/MediaType;

    return-object v0
.end method

.method public h(Lej/f;)V
    .locals 1

    iget-object v0, p0, LMj/u$a;->b:Lokhttp3/RequestBody;

    invoke-virtual {v0, p1}, Lokhttp3/RequestBody;->h(Lej/f;)V

    return-void
.end method
