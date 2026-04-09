.class public final LF3/C;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final e:Lokhttp3/MediaType;


# instance fields
.field public final a:LF3/D;

.field private final b:Lokhttp3/OkHttpClient;

.field private final c:LF3/F;

.field private final d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "application/json; charset=utf-8"

    invoke-static {v0}, Lokhttp3/MediaType;->g(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v0

    sput-object v0, LF3/C;->e:Lokhttp3/MediaType;

    return-void
.end method

.method public constructor <init>(LF3/D;LF3/F;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lokhttp3/OkHttpClient$Builder;

    invoke-direct {v0}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x2710

    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/OkHttpClient$Builder;->e(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/OkHttpClient$Builder;->O(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/OkHttpClient$Builder;->Q(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/OkHttpClient$Builder;->c()Lokhttp3/OkHttpClient;

    move-result-object v0

    iput-object v0, p0, LF3/C;->b:Lokhttp3/OkHttpClient;

    iput-object p1, p0, LF3/C;->a:LF3/D;

    iput-object p2, p0, LF3/C;->c:LF3/F;

    const-string p1, "https://firebaseinstallations.googleapis.com/v1"

    iput-object p1, p0, LF3/C;->d:Ljava/lang/String;

    return-void
.end method
