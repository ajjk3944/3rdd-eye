.class public final Lokhttp3/internal/http1/HeadersReader;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/http1/HeadersReader$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0002\u0008\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\r\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0010\u00a8\u0006\u0014"
    }
    d2 = {
        "Lokhttp3/internal/http1/HeadersReader;",
        "",
        "Lej/g;",
        "source",
        "<init>",
        "(Lej/g;)V",
        "",
        "b",
        "()Ljava/lang/String;",
        "Lokhttp3/Headers;",
        "a",
        "()Lokhttp3/Headers;",
        "Lej/g;",
        "getSource",
        "()Lej/g;",
        "",
        "J",
        "headerLimit",
        "c",
        "Companion",
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


# static fields
.field public static final c:Lokhttp3/internal/http1/HeadersReader$Companion;


# instance fields
.field private final a:Lej/g;

.field private b:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lokhttp3/internal/http1/HeadersReader$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lokhttp3/internal/http1/HeadersReader$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lokhttp3/internal/http1/HeadersReader;->c:Lokhttp3/internal/http1/HeadersReader$Companion;

    return-void
.end method

.method public constructor <init>(Lej/g;)V
    .locals 2

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lokhttp3/internal/http1/HeadersReader;->a:Lej/g;

    const-wide/32 v0, 0x40000

    iput-wide v0, p0, Lokhttp3/internal/http1/HeadersReader;->b:J

    return-void
.end method


# virtual methods
.method public final a()Lokhttp3/Headers;
    .locals 3

    new-instance v0, Lokhttp3/Headers$Builder;

    invoke-direct {v0}, Lokhttp3/Headers$Builder;-><init>()V

    :goto_0
    invoke-virtual {p0}, Lokhttp3/internal/http1/HeadersReader;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lokhttp3/Headers$Builder;->f()Lokhttp3/Headers;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {v0, v1}, Lokhttp3/Headers$Builder;->c(Ljava/lang/String;)Lokhttp3/Headers$Builder;

    goto :goto_0
.end method

.method public final b()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lokhttp3/internal/http1/HeadersReader;->a:Lej/g;

    iget-wide v1, p0, Lokhttp3/internal/http1/HeadersReader;->b:J

    invoke-interface {v0, v1, v2}, Lej/g;->D(J)Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p0, Lokhttp3/internal/http1/HeadersReader;->b:J

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    int-to-long v3, v3

    sub-long/2addr v1, v3

    iput-wide v1, p0, Lokhttp3/internal/http1/HeadersReader;->b:J

    return-object v0
.end method
