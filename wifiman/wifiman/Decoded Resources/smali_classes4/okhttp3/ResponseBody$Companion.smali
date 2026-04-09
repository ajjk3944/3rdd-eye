.class public final Lokhttp3/ResponseBody$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/ResponseBody;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0007\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\u0008\u001a\u00020\u0007*\u00020\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ)\u0010\r\u001a\u00020\u0007*\u00020\n2\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000eJ)\u0010\u0010\u001a\u00020\u00072\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\nH\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lokhttp3/ResponseBody$Companion;",
        "",
        "<init>",
        "()V",
        "",
        "Lokhttp3/MediaType;",
        "contentType",
        "Lokhttp3/ResponseBody;",
        "c",
        "([BLokhttp3/MediaType;)Lokhttp3/ResponseBody;",
        "Lej/g;",
        "",
        "contentLength",
        "a",
        "(Lej/g;Lokhttp3/MediaType;J)Lokhttp3/ResponseBody;",
        "content",
        "b",
        "(Lokhttp3/MediaType;JLej/g;)Lokhttp3/ResponseBody;",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lokhttp3/ResponseBody$Companion;-><init>()V

    return-void
.end method

.method public static synthetic d(Lokhttp3/ResponseBody$Companion;[BLokhttp3/MediaType;ILjava/lang/Object;)Lokhttp3/ResponseBody;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lokhttp3/ResponseBody$Companion;->c([BLokhttp3/MediaType;)Lokhttp3/ResponseBody;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lej/g;Lokhttp3/MediaType;J)Lokhttp3/ResponseBody;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lokhttp3/ResponseBody$Companion$asResponseBody$1;

    invoke-direct {v0, p2, p3, p4, p1}, Lokhttp3/ResponseBody$Companion$asResponseBody$1;-><init>(Lokhttp3/MediaType;JLej/g;)V

    return-object v0
.end method

.method public final b(Lokhttp3/MediaType;JLej/g;)Lokhttp3/ResponseBody;
    .locals 1

    const-string v0, "content"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p4, p1, p2, p3}, Lokhttp3/ResponseBody$Companion;->a(Lej/g;Lokhttp3/MediaType;J)Lokhttp3/ResponseBody;

    move-result-object p1

    return-object p1
.end method

.method public final c([BLokhttp3/MediaType;)Lokhttp3/ResponseBody;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lej/e;

    invoke-direct {v0}, Lej/e;-><init>()V

    invoke-virtual {v0, p1}, Lej/e;->I0([B)Lej/e;

    move-result-object v0

    array-length p1, p1

    int-to-long v1, p1

    invoke-virtual {p0, v0, p2, v1, v2}, Lokhttp3/ResponseBody$Companion;->a(Lej/g;Lokhttp3/MediaType;J)Lokhttp3/ResponseBody;

    move-result-object p1

    return-object p1
.end method
