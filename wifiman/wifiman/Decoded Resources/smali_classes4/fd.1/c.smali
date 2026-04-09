.class public final Lfd/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfd/b;


# instance fields
.field private final a:Ldc/a;

.field private final b:Lokhttp3/OkHttpClient;


# direct methods
.method public constructor <init>(Ldc/a;)V
    .locals 3

    const-string v0, "buildConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfd/c;->a:Ldc/a;

    new-instance v0, Lokhttp3/OkHttpClient$Builder;

    invoke-direct {v0}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    new-instance v1, Lfd/a;

    const-string v2, "wifiman/android"

    invoke-virtual {p1}, Ldc/a;->d()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Lfd/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lokhttp3/OkHttpClient$Builder;->a(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->c()Lokhttp3/OkHttpClient;

    move-result-object p1

    iput-object p1, p0, Lfd/c;->b:Lokhttp3/OkHttpClient;

    return-void
.end method


# virtual methods
.method public a()Lokhttp3/OkHttpClient;
    .locals 1

    iget-object v0, p0, Lfd/c;->b:Lokhttp3/OkHttpClient;

    return-object v0
.end method
