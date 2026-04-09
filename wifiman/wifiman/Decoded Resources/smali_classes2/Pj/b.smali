.class final LPj/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMj/h;


# static fields
.field private static final b:Lokhttp3/MediaType;


# instance fields
.field private final a:LY6/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "application/json; charset=UTF-8"

    invoke-static {v0}, Lokhttp3/MediaType;->e(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v0

    sput-object v0, LPj/b;->b:Lokhttp3/MediaType;

    return-void
.end method

.method constructor <init>(LY6/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPj/b;->a:LY6/h;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LPj/b;->b(Ljava/lang/Object;)Lokhttp3/RequestBody;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/Object;)Lokhttp3/RequestBody;
    .locals 3

    new-instance v0, Lej/e;

    invoke-direct {v0}, Lej/e;-><init>()V

    invoke-static {v0}, LY6/o;->S(Lej/f;)LY6/o;

    move-result-object v1

    iget-object v2, p0, LPj/b;->a:LY6/h;

    invoke-virtual {v2, v1, p1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    sget-object p1, LPj/b;->b:Lokhttp3/MediaType;

    invoke-virtual {v0}, Lej/e;->v0()Lej/h;

    move-result-object v0

    invoke-static {p1, v0}, Lokhttp3/RequestBody;->c(Lokhttp3/MediaType;Lej/h;)Lokhttp3/RequestBody;

    move-result-object p1

    return-object p1
.end method
