.class final Lcom/google/android/gms/measurement/internal/p5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final a:Ljava/net/URL;

.field private final b:[B

.field private final c:Lcom/google/android/gms/measurement/internal/l5;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/util/Map;

.field private final synthetic f:Lcom/google/android/gms/measurement/internal/n5;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/n5;Ljava/lang/String;Ljava/net/URL;[BLjava/util/Map;Lcom/google/android/gms/measurement/internal/l5;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/p5;->f:Lcom/google/android/gms/measurement/internal/n5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, Ls3/p;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p3}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p6}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/p5;->a:Ljava/net/URL;

    iput-object p4, p0, Lcom/google/android/gms/measurement/internal/p5;->b:[B

    iput-object p6, p0, Lcom/google/android/gms/measurement/internal/p5;->c:Lcom/google/android/gms/measurement/internal/l5;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/p5;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/measurement/internal/p5;->e:Ljava/util/Map;

    return-void
.end method

.method private final a(ILjava/lang/Exception;[BLjava/util/Map;)V
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/p5;->f:Lcom/google/android/gms/measurement/internal/n5;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    new-instance v7, Lcom/google/android/gms/measurement/internal/o5;

    move-object v1, v7

    move-object v2, p0

    move v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/measurement/internal/o5;-><init>(Lcom/google/android/gms/measurement/internal/p5;ILjava/lang/Exception;[BLjava/util/Map;)V

    invoke-virtual {v0, v7}, Lcom/google/android/gms/measurement/internal/s3;->z(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic b(Lcom/google/android/gms/measurement/internal/p5;ILjava/lang/Exception;[BLjava/util/Map;)V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/p5;->c:Lcom/google/android/gms/measurement/internal/l5;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/p5;->d:Ljava/lang/String;

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/measurement/internal/l5;->a(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    const-string v0, "Error closing HTTP compressed POST connection output stream. appId"

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/p5;->f:Lcom/google/android/gms/measurement/internal/n5;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/a4;->h()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    :try_start_0
    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/p5;->a:Ljava/net/URL;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/E0;->a()Lcom/google/android/gms/internal/measurement/E0;

    move-result-object v4

    const-string v5, "client-measurement"

    invoke-virtual {v4, v3, v5}, Lcom/google/android/gms/internal/measurement/E0;->b(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URLConnection;

    move-result-object v3

    instance-of v4, v3, Ljava/net/HttpURLConnection;

    if-eqz v4, :cond_2

    check-cast v3, Ljava/net/HttpURLConnection;

    invoke-virtual {v3, v2}, Ljava/net/URLConnection;->setDefaultUseCaches(Z)V

    const v4, 0xea60

    invoke-virtual {v3, v4}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    const v4, 0xee48

    invoke-virtual {v3, v4}, Ljava/net/URLConnection;->setReadTimeout(I)V

    invoke-virtual {v3, v2}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Ljava/net/URLConnection;->setDoInput(Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    :try_start_1
    iget-object v5, p0, Lcom/google/android/gms/measurement/internal/p5;->e:Ljava/util/Map;

    if-eqz v5, :cond_0

    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v3, v7, v6}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v4

    move-object v5, v1

    :goto_1
    move-object v6, v5

    goto/16 :goto_4

    :catch_0
    move-exception v4

    move-object v5, v1

    :goto_2
    move-object v6, v5

    goto/16 :goto_6

    :cond_0
    iget-object v5, p0, Lcom/google/android/gms/measurement/internal/p5;->b:[B
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v5, :cond_1

    :try_start_2
    new-instance v6, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v6}, Ljava/io/ByteArrayOutputStream;-><init>()V

    new-instance v7, Ljava/util/zip/GZIPOutputStream;

    invoke-direct {v7, v6}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V

    invoke-virtual {v7, v5}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v7}, Ljava/io/OutputStream;->close()V

    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->close()V

    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v5
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iget-object v6, p0, Lcom/google/android/gms/measurement/internal/p5;->f:Lcom/google/android/gms/measurement/internal/n5;

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/L2;->G()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v6

    const-string v7, "Uploading data. size"

    array-length v8, v5

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Lcom/google/android/gms/measurement/internal/N2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v3, v4}, Ljava/net/URLConnection;->setDoOutput(Z)V

    const-string v4, "Content-Encoding"

    const-string v6, "gzip"

    invoke-virtual {v3, v4, v6}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    array-length v4, v5

    invoke-virtual {v3, v4}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    invoke-virtual {v3}, Ljava/net/URLConnection;->connect()V

    invoke-virtual {v3}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v4
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-virtual {v4, v5}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v5

    move-object v6, v1

    move-object v9, v5

    move-object v5, v4

    move-object v4, v9

    goto :goto_4

    :catch_1
    move-exception v5

    move-object v6, v1

    move-object v9, v5

    move-object v5, v4

    move-object v4, v9

    goto/16 :goto_6

    :catch_2
    move-exception v4

    :try_start_5
    iget-object v5, p0, Lcom/google/android/gms/measurement/internal/p5;->f:Lcom/google/android/gms/measurement/internal/n5;

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/L2;->C()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v5

    const-string v6, "Failed to gzip post request content"

    invoke-virtual {v5, v6, v4}, Lcom/google/android/gms/measurement/internal/N2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    throw v4

    :cond_1
    :goto_3
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v2

    invoke-virtual {v3}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v4
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    iget-object v5, p0, Lcom/google/android/gms/measurement/internal/p5;->f:Lcom/google/android/gms/measurement/internal/n5;

    invoke-static {v5, v3}, Lcom/google/android/gms/measurement/internal/n5;->q(Lcom/google/android/gms/measurement/internal/n5;Ljava/net/HttpURLConnection;)[B

    move-result-object v0
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    invoke-direct {p0, v2, v1, v0, v4}, Lcom/google/android/gms/measurement/internal/p5;->a(ILjava/lang/Exception;[BLjava/util/Map;)V

    return-void

    :catchall_2
    move-exception v5

    move-object v6, v4

    move-object v4, v5

    move-object v5, v1

    goto :goto_4

    :catch_3
    move-exception v5

    move-object v6, v4

    move-object v4, v5

    move-object v5, v1

    goto :goto_6

    :catchall_3
    move-exception v4

    move-object v3, v1

    move-object v5, v3

    goto/16 :goto_1

    :catch_4
    move-exception v4

    move-object v3, v1

    move-object v5, v3

    goto/16 :goto_2

    :cond_2
    :try_start_7
    new-instance v3, Ljava/io/IOException;

    const-string v4, "Failed to obtain HTTP connection"

    invoke-direct {v3, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_4
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :goto_4
    if-eqz v5, :cond_3

    :try_start_8
    invoke-virtual {v5}, Ljava/io/OutputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_5

    goto :goto_5

    :catch_5
    move-exception v5

    iget-object v7, p0, Lcom/google/android/gms/measurement/internal/p5;->f:Lcom/google/android/gms/measurement/internal/n5;

    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/L2;->C()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v7

    iget-object v8, p0, Lcom/google/android/gms/measurement/internal/p5;->d:Ljava/lang/String;

    invoke-static {v8}, Lcom/google/android/gms/measurement/internal/L2;->r(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v7, v0, v8, v5}, Lcom/google/android/gms/measurement/internal/N2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_3
    :goto_5
    if-eqz v3, :cond_4

    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_4
    invoke-direct {p0, v2, v1, v1, v6}, Lcom/google/android/gms/measurement/internal/p5;->a(ILjava/lang/Exception;[BLjava/util/Map;)V

    throw v4

    :goto_6
    if-eqz v5, :cond_5

    :try_start_9
    invoke-virtual {v5}, Ljava/io/OutputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_6

    goto :goto_7

    :catch_6
    move-exception v5

    iget-object v7, p0, Lcom/google/android/gms/measurement/internal/p5;->f:Lcom/google/android/gms/measurement/internal/n5;

    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/L2;->C()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v7

    iget-object v8, p0, Lcom/google/android/gms/measurement/internal/p5;->d:Ljava/lang/String;

    invoke-static {v8}, Lcom/google/android/gms/measurement/internal/L2;->r(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v7, v0, v8, v5}, Lcom/google/android/gms/measurement/internal/N2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_5
    :goto_7
    if-eqz v3, :cond_6

    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_6
    invoke-direct {p0, v2, v4, v1, v6}, Lcom/google/android/gms/measurement/internal/p5;->a(ILjava/lang/Exception;[BLjava/util/Map;)V

    return-void
.end method
