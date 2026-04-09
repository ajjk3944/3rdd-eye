.class final Lc7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMj/h;


# static fields
.field private static final b:Lokhttp3/MediaType;


# instance fields
.field private final a:Lb7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string/jumbo v0, "application/xml; charset=UTF-8"

    invoke-static {v0}, Lokhttp3/MediaType;->g(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v0

    sput-object v0, Lc7/b;->b:Lokhttp3/MediaType;

    return-void
.end method

.method constructor <init>(Lb7/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc7/b;->a:Lb7/a;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lc7/b;->b(Ljava/lang/Object;)Lokhttp3/RequestBody;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/Object;)Lokhttp3/RequestBody;
    .locals 2

    new-instance v0, Lej/e;

    invoke-direct {v0}, Lej/e;-><init>()V

    iget-object v1, p0, Lc7/b;->a:Lb7/a;

    invoke-virtual {v1, v0, p1}, Lb7/a;->b(Lej/f;Ljava/lang/Object;)V

    sget-object p1, Lc7/b;->b:Lokhttp3/MediaType;

    invoke-virtual {v0}, Lej/e;->v0()Lej/h;

    move-result-object v0

    invoke-static {p1, v0}, Lokhttp3/RequestBody;->c(Lokhttp3/MediaType;Lej/h;)Lokhttp3/RequestBody;

    move-result-object p1

    return-object p1
.end method
