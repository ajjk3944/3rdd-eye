.class public abstract LKg/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LKg/a$a;
    }
.end annotation


# static fields
.field public static a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    :try_start_0
    const-class v0, LKg/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const-string v1, "version.properties"

    invoke-virtual {v0, v1}, Ljava/lang/ClassLoader;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    new-instance v1, Ljava/util/Properties;

    invoke-direct {v1}, Ljava/util/Properties;-><init>()V

    invoke-virtual {v1, v0}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V

    const-string v2, "jmdns.version"

    invoke-virtual {v1, v2}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sput-object v1, LKg/a;->a:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    goto :goto_0

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    throw v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    const-string v0, "VERSION MISSING"

    sput-object v0, LKg/a;->a:Ljava/lang/String;

    :goto_0
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static f0(Ljava/net/InetAddress;Ljava/lang/String;)LKg/a;
    .locals 3

    new-instance v0, LLg/l;

    const-wide/16 v1, 0x0

    invoke-direct {v0, p0, p1, v1, v2}, LLg/l;-><init>(Ljava/net/InetAddress;Ljava/lang/String;J)V

    return-object v0
.end method


# virtual methods
.method public abstract b0(Ljava/lang/String;LKg/e;)V
.end method

.method public abstract d0(LKg/f;)V
.end method

.method public abstract m0(LKg/d;)V
.end method

.method public abstract n0(Ljava/lang/String;LKg/e;)V
.end method

.method public abstract o0(LKg/f;)V
.end method

.method public abstract p0(LKg/d;)V
.end method
