.class public Lc5/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc5/h$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/Map;

.field private final b:Ljava/util/Map;

.field private final c:LZ4/c;


# direct methods
.method constructor <init>(Ljava/util/Map;Ljava/util/Map;LZ4/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc5/h;->a:Ljava/util/Map;

    iput-object p2, p0, Lc5/h;->b:Ljava/util/Map;

    iput-object p3, p0, Lc5/h;->c:LZ4/c;

    return-void
.end method

.method public static a()Lc5/h$a;
    .locals 1

    new-instance v0, Lc5/h$a;

    invoke-direct {v0}, Lc5/h$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/Object;Ljava/io/OutputStream;)V
    .locals 4

    new-instance v0, Lc5/f;

    iget-object v1, p0, Lc5/h;->a:Ljava/util/Map;

    iget-object v2, p0, Lc5/h;->b:Ljava/util/Map;

    iget-object v3, p0, Lc5/h;->c:LZ4/c;

    invoke-direct {v0, p2, v1, v2, v3}, Lc5/f;-><init>(Ljava/io/OutputStream;Ljava/util/Map;Ljava/util/Map;LZ4/c;)V

    invoke-virtual {v0, p1}, Lc5/f;->t(Ljava/lang/Object;)Lc5/f;

    return-void
.end method

.method public c(Ljava/lang/Object;)[B
    .locals 1

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    invoke-virtual {p0, p1, v0}, Lc5/h;->b(Ljava/lang/Object;Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    return-object p1
.end method
