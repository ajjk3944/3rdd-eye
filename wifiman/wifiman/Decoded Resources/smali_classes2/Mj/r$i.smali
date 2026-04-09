.class final LMj/r$i;
.super LMj/r;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LMj/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "i"
.end annotation


# instance fields
.field private final a:Ljava/lang/reflect/Method;

.field private final b:I

.field private final c:Lokhttp3/Headers;

.field private final d:LMj/h;


# direct methods
.method constructor <init>(Ljava/lang/reflect/Method;ILokhttp3/Headers;LMj/h;)V
    .locals 0

    invoke-direct {p0}, LMj/r;-><init>()V

    iput-object p1, p0, LMj/r$i;->a:Ljava/lang/reflect/Method;

    iput p2, p0, LMj/r$i;->b:I

    iput-object p3, p0, LMj/r$i;->c:Lokhttp3/Headers;

    iput-object p4, p0, LMj/r$i;->d:LMj/h;

    return-void
.end method


# virtual methods
.method a(LMj/u;Ljava/lang/Object;)V
    .locals 4

    if-nez p2, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, LMj/r$i;->d:LMj/h;

    invoke-interface {v0, p2}, LMj/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lokhttp3/RequestBody;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object p2, p0, LMj/r$i;->c:Lokhttp3/Headers;

    invoke-virtual {p1, p2, v0}, LMj/u;->d(Lokhttp3/Headers;Lokhttp3/RequestBody;)V

    return-void

    :catch_0
    move-exception p1

    iget-object v0, p0, LMj/r$i;->a:Ljava/lang/reflect/Method;

    iget v1, p0, LMj/r$i;->b:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unable to convert "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " to RequestBody"

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, v1, p2, p1}, LMj/B;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1
.end method
