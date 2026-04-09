.class public final Lcom/ui/wifiman/model/ubiquiti/firmware/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/ubiquiti/firmware/b$a;,
        Lcom/ui/wifiman/model/ubiquiti/firmware/b$b;
    }
.end annotation


# static fields
.field public static final f:Lcom/ui/wifiman/model/ubiquiti/firmware/b$a;


# instance fields
.field private final a:Lfd/b;

.field private final b:Ljava/lang/String;

.field private final c:LY6/r;

.field private final d:Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi;

.field private final e:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/firmware/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/ubiquiti/firmware/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wifiman/model/ubiquiti/firmware/b;->f:Lcom/ui/wifiman/model/ubiquiti/firmware/b$a;

    return-void
.end method

.method public constructor <init>(Lfd/b;Ljava/lang/String;)V
    .locals 2

    const-string v0, "okHttpClientHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/b;->a:Lfd/b;

    iput-object p2, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/b;->b:Ljava/lang/String;

    new-instance p1, LY6/r$a;

    invoke-direct {p1}, LY6/r$a;-><init>()V

    invoke-virtual {p1}, LY6/r$a;->c()LY6/r;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/b;->c:LY6/r;

    new-instance p2, LMj/x$b;

    invoke-direct {p2}, LMj/x$b;-><init>()V

    invoke-static {p1}, LPj/a;->g(LY6/r;)LPj/a;

    move-result-object p1

    invoke-virtual {p2, p1}, LMj/x$b;->b(LMj/h$a;)LMj/x$b;

    move-result-object p1

    const-string p2, "https://fw-update.ui.com/"

    invoke-virtual {p1, p2}, LMj/x$b;->c(Ljava/lang/String;)LMj/x$b;

    move-result-object p1

    invoke-static {}, LNj/g;->e()LNj/g;

    move-result-object p2

    invoke-virtual {p1, p2}, LMj/x$b;->a(LMj/e$a;)LMj/x$b;

    move-result-object p1

    invoke-virtual {p1}, LMj/x$b;->e()LMj/x;

    move-result-object p1

    const-class p2, Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi;

    invoke-virtual {p1, p2}, LMj/x;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "create(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi;

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/b;->d:Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi;

    sget-object p1, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$a;->RELEASE:Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$a;->getId()Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lcom/ui/wifiman/model/ubiquiti/firmware/a$a;->PROD:Lcom/ui/wifiman/model/ubiquiti/firmware/a$a;

    invoke-static {p1, p2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    sget-object p2, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$a;->BETA:Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$a;

    invoke-virtual {p2}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$a;->getId()Ljava/lang/String;

    move-result-object p2

    sget-object v0, Lcom/ui/wifiman/model/ubiquiti/firmware/a$a;->BETA:Lcom/ui/wifiman/model/ubiquiti/firmware/a$a;

    invoke-static {p2, v0}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p2

    sget-object v0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$a;->INTERNAL:Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$a;->getId()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/ubiquiti/firmware/a$a;->INTERNAL:Lcom/ui/wifiman/model/ubiquiti/firmware/a$a;

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v0

    filled-new-array {p1, p2, v0}, [LYg/s;

    move-result-object p1

    invoke-static {p1}, LZg/U;->j([LYg/s;)Ljava/util/HashMap;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/b;->e:Ljava/util/HashMap;

    return-void
.end method

.method public static synthetic d(Ljava/io/FileOutputStream;Lokhttp3/ResponseBody;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/firmware/b;->k(Ljava/io/FileOutputStream;Lokhttp3/ResponseBody;)V

    return-void
.end method

.method public static synthetic e(Lcom/ui/wifiman/model/ubiquiti/firmware/b;Lcom/ui/wifiman/model/ubiquiti/firmware/a;Ljava/io/File;Lgg/j;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/ui/wifiman/model/ubiquiti/firmware/b;->j(Lcom/ui/wifiman/model/ubiquiti/firmware/b;Lcom/ui/wifiman/model/ubiquiti/firmware/a;Ljava/io/File;Lgg/j;)V

    return-void
.end method

.method public static final synthetic f(Lcom/ui/wifiman/model/ubiquiti/firmware/b;Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;)Lcom/ui/wifiman/model/ubiquiti/firmware/a;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/firmware/b;->i(Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;)Lcom/ui/wifiman/model/ubiquiti/firmware/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Lcom/ui/wifiman/model/ubiquiti/firmware/b;Ljava/lang/Throwable;)Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient$Error;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/firmware/b;->m(Ljava/lang/Throwable;)Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient$Error;

    move-result-object p0

    return-object p0
.end method

.method private final h(Lcom/ui/wifiman/model/ubiquiti/firmware/a$a;)Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$a;
    .locals 1

    sget-object v0, Lcom/ui/wifiman/model/ubiquiti/firmware/b$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    sget-object p1, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$a;->INTERNAL:Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$a;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$a;->BETA:Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$a;

    goto :goto_0

    :cond_2
    sget-object p1, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$a;->RELEASE:Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$a;

    :goto_0
    return-object p1
.end method

.method private final i(Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;)Lcom/ui/wifiman/model/ubiquiti/firmware/a;
    .locals 13

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_9

    invoke-static {v0}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->d()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->d()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    const-wide/16 v4, 0x1

    cmp-long v0, v2, v4

    if-gez v0, :cond_1

    goto/16 :goto_2

    :cond_1
    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->g()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-static {v0}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto/16 :goto_1

    :cond_2
    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->f()Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;->a()Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Link;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Link;->a()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_3
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_7

    invoke-static {v0}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto/16 :goto_1

    :cond_4
    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/b;->e:Ljava/util/HashMap;

    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/ui/wifiman/model/ubiquiti/firmware/a$a;

    if-nez v4, :cond_5

    goto :goto_1

    :cond_5
    new-instance v0, Lcom/ui/common/semver/SemVer;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->i()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->j()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->k()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->l()Ljava/lang/String;

    move-result-object v9

    const/16 v11, 0x10

    const/4 v12, 0x0

    const/4 v10, 0x0

    move-object v5, v0

    invoke-direct/range {v5 .. v12}, Lcom/ui/common/semver/SemVer;-><init>(IIILjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->g()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->d()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->f()Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;->a()Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Link;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Link;->a()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->b()Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_6

    return-object v1

    :cond_6
    new-instance p1, Lcom/ui/wifiman/model/ubiquiti/firmware/a;

    move-object v2, p1

    move-object v5, v0

    invoke-direct/range {v2 .. v10}, Lcom/ui/wifiman/model/ubiquiti/firmware/a;-><init>(Ljava/lang/String;Lcom/ui/wifiman/model/ubiquiti/firmware/a$a;Lcom/ui/common/semver/SemVer;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    return-object p1

    :cond_7
    :goto_1
    return-object v1

    :cond_8
    :goto_2
    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->d()Ljava/lang/Long;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "FW "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " has invalid filesize: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x6

    invoke-static {p1, v1, v1, v0, v1}, LZ7/b;->j(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_9
    :goto_3
    return-object v1
.end method

.method private static final j(Lcom/ui/wifiman/model/ubiquiti/firmware/b;Lcom/ui/wifiman/model/ubiquiti/firmware/a;Ljava/io/File;Lgg/j;)V
    .locals 8

    const-string v0, "emitter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/b;->a:Lfd/b;

    invoke-interface {v0}, Lfd/b;->a()Lokhttp3/OkHttpClient;

    move-result-object v0

    new-instance v1, Lokhttp3/Request$Builder;

    invoke-direct {v1}, Lokhttp3/Request$Builder;-><init>()V

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lokhttp3/Request$Builder;->h(Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object v1

    iget-object p0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/b;->b:Ljava/lang/String;

    if-eqz p0, :cond_1

    const-string v2, "Authorization"

    const-string v3, "Bearer token:%s"

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const/4 v4, 0x1

    invoke-static {p0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    invoke-static {v3, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v3, "format(...)"

    invoke-static {p0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2, p0}, Lokhttp3/Request$Builder;->c(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, p0

    goto :goto_0

    :catch_0
    move-exception p0

    goto/16 :goto_4

    :cond_1
    :goto_0
    invoke-virtual {v1}, Lokhttp3/Request$Builder;->b()Lokhttp3/Request;

    move-result-object p0

    invoke-virtual {v0, p0}, Lokhttp3/OkHttpClient;->b(Lokhttp3/Request;)Lokhttp3/Call;

    move-result-object p0

    invoke-interface {p0}, Lokhttp3/Call;->g()Lokhttp3/Response;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p0}, Lokhttp3/Response;->a()Lokhttp3/ResponseBody;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-nez v0, :cond_2

    new-instance p0, Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient$Error$IO;

    const-string p1, "FW file Response doesn\'t contain a file"

    invoke-direct {p0, p1, v2, v1, v2}, Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient$Error$IO;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void

    :cond_2
    const-string v3, "Content-Length"

    invoke-static {p0, v3, v2, v1, v2}, Lokhttp3/Response;->C(Lokhttp3/Response;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-static {p0}, Lkotlin/text/t;->s(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->c()J

    move-result-wide p0

    :goto_1
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    new-instance p2, LWd/d;

    invoke-direct {p2, v1, v0}, LWd/d;-><init>(Ljava/io/FileOutputStream;Lokhttp3/ResponseBody;)V

    invoke-interface {p3, p2}, Lgg/j;->d(Lkg/e;)V

    new-instance p2, Ljava/io/BufferedInputStream;

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->a()Ljava/io/InputStream;

    move-result-object v0

    invoke-direct {p2, v0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    const/16 v0, 0x1fa0

    :try_start_1
    new-array v0, v0, [B

    const-wide/16 v3, 0x0

    :goto_2
    invoke-virtual {p2, v0}, Ljava/io/InputStream;->read([B)I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_4

    int-to-long v6, v5

    add-long/2addr v3, v6

    const/4 v6, 0x0

    invoke-virtual {v1, v0, v6, v5}, Ljava/io/FileOutputStream;->write([BII)V

    long-to-float v5, v3

    long-to-float v6, p0

    div-float/2addr v5, v6

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-interface {p3, v5}, Lgg/h;->h(Ljava/lang/Object;)V

    goto :goto_2

    :catchall_0
    move-exception p0

    goto :goto_3

    :cond_4
    sget-object p0, LYg/J;->a:LYg/J;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {p2, v2}, Ljh/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    const/high16 p0, 0x3f800000    # 1.0f

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    invoke-interface {p3, p0}, Lgg/h;->h(Ljava/lang/Object;)V

    invoke-interface {p3}, Lgg/h;->a()V

    return-void

    :goto_3
    :try_start_2
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p1

    invoke-static {p2, p0}, Ljh/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p1

    :goto_4
    new-instance p1, Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient$Error$IO;

    const-string p2, "Failed to download FW file"

    invoke-direct {p1, p2, p0}, Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient$Error$IO;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {p3, p1}, Lgg/j;->c(Ljava/lang/Throwable;)Z

    return-void
.end method

.method private static final k(Ljava/io/FileOutputStream;Lokhttp3/ResponseBody;)V
    .locals 2

    const/4 v0, 0x6

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0}, Ljava/io/FileOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p0, "Failed to close FW download output file stream"

    invoke-static {p0, v1, v1, v0, v1}, LZ7/b;->j(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    :goto_0
    :try_start_1
    invoke-virtual {p1}, Lokhttp3/ResponseBody;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    const-string p0, "Failed to close FW download response body"

    invoke-static {p0, v1, v1, v0, v1}, LZ7/b;->j(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    :goto_1
    return-void
.end method

.method private final l(Lretrofit2/HttpException;)Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient$Error$ApiError;
    .locals 10

    const-string v0, "UI FW API - failed to parse error"

    new-instance v1, LY6/r$a;

    invoke-direct {v1}, LY6/r$a;-><init>()V

    invoke-virtual {v1}, LY6/r$a;->c()LY6/r;

    move-result-object v1

    const-class v2, Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$Error;

    invoke-virtual {v1, v2}, LY6/r;->c(Ljava/lang/Class;)LY6/h;

    move-result-object v1

    const-string v2, "adapter(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lretrofit2/HttpException;->d()LMj/w;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_5

    const/4 v4, 0x4

    :try_start_0
    invoke-virtual {v2}, LMj/w;->d()Lokhttp3/ResponseBody;

    move-result-object v5
    :try_end_0
    .catch Lcom/squareup/moshi/JsonDataException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v5, :cond_0

    :try_start_1
    invoke-virtual {v5}, Lokhttp3/ResponseBody;->C()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, LY6/h;->c(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$Error;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {v5, v3}, Ljh/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Lcom/squareup/moshi/JsonDataException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_3

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    goto :goto_2

    :catchall_0
    move-exception v1

    :try_start_3
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v6

    :try_start_4
    invoke-static {v5, v1}, Ljh/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v6
    :try_end_4
    .catch Lcom/squareup/moshi/JsonDataException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :goto_0
    invoke-static {v0, v1, v3, v4, v3}, LZ7/b;->j(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_0
    :goto_1
    move-object v1, v3

    goto :goto_3

    :goto_2
    invoke-static {v0, v1, v3, v4, v3}, LZ7/b;->j(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_1

    :goto_3
    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient$Error$ApiError;

    invoke-virtual {v2}, LMj/w;->b()I

    move-result v5

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$Error;->c()Ljava/lang/Integer;

    move-result-object v2

    move-object v6, v2

    goto :goto_4

    :cond_1
    move-object v6, v3

    :goto_4
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$Error;->a()Ljava/lang/String;

    move-result-object v3

    :cond_2
    move-object v7, v3

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$Error;->b()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_6

    :cond_3
    :goto_5
    move-object v8, v1

    goto :goto_7

    :cond_4
    :goto_6
    const-string v1, "No error message provided"

    goto :goto_5

    :goto_7
    move-object v4, v0

    move-object v9, p1

    invoke-direct/range {v4 .. v9}, Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient$Error$ApiError;-><init>(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v3, v0

    :cond_5
    return-object v3
.end method

.method private final m(Ljava/lang/Throwable;)Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient$Error;
    .locals 2

    instance-of v0, p1, Lretrofit2/HttpException;

    if-eqz v0, :cond_0

    check-cast p1, Lretrofit2/HttpException;

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/firmware/b;->l(Lretrofit2/HttpException;)Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient$Error$ApiError;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ljava/io/IOException;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient$Error$IO;

    const-string v1, "IO Error"

    invoke-direct {v0, v1, p1}, Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient$Error$IO;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object p1, v0

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method


# virtual methods
.method public a(Lcom/ui/wifiman/model/ubiquiti/firmware/a$a;Ljava/lang/String;)Lgg/z;
    .locals 4

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/b;->d:Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/b;->b:Ljava/lang/String;

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Bearer token:%s"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "format(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_1

    new-instance v3, Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$a$a;

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/firmware/b;->h(Lcom/ui/wifiman/model/ubiquiti/firmware/a$a;)Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$a;

    move-result-object p1

    invoke-direct {v3, p1}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$a$a;-><init>(Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$a;)V

    invoke-virtual {v3}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$a;->b()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    if-eqz p2, :cond_2

    new-instance p1, Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$a$b;

    invoke-direct {p1, p2}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$a$b;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$a;->b()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    sget-object p1, LYg/J;->a:LYg/J;

    invoke-interface {v0, v1, v2}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi;->b(Ljava/lang/String;Ljava/util/List;)Lgg/z;

    move-result-object p1

    new-instance p2, Lcom/ui/wifiman/model/ubiquiti/firmware/b$d;

    invoke-direct {p2, p0}, Lcom/ui/wifiman/model/ubiquiti/firmware/b$d;-><init>(Lcom/ui/wifiman/model/ubiquiti/firmware/b;)V

    invoke-virtual {p1, p2}, Lgg/z;->F(Lkg/n;)Lgg/z;

    move-result-object p1

    new-instance p2, Lcom/ui/wifiman/model/ubiquiti/firmware/b$e;

    invoke-direct {p2, p0}, Lcom/ui/wifiman/model/ubiquiti/firmware/b$e;-><init>(Lcom/ui/wifiman/model/ubiquiti/firmware/b;)V

    invoke-virtual {p1, p2}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/z;->E(Lgg/y;)Lgg/z;

    move-result-object p1

    const-string p2, "observeOn(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)Lgg/z;
    .locals 2

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ubicAuth"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/b;->d:Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi;

    new-instance v1, Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$TokenRequest;

    invoke-direct {v1, p1, p2}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$TokenRequest;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi;->a(Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$TokenRequest;)Lgg/z;

    move-result-object p1

    new-instance p2, Lcom/ui/wifiman/model/ubiquiti/firmware/b$f;

    invoke-direct {p2, p0}, Lcom/ui/wifiman/model/ubiquiti/firmware/b$f;-><init>(Lcom/ui/wifiman/model/ubiquiti/firmware/b;)V

    invoke-virtual {p1, p2}, Lgg/z;->F(Lkg/n;)Lgg/z;

    move-result-object p1

    sget-object p2, Lcom/ui/wifiman/model/ubiquiti/firmware/b$g;->a:Lcom/ui/wifiman/model/ubiquiti/firmware/b$g;

    invoke-virtual {p1, p2}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/z;->E(Lgg/y;)Lgg/z;

    move-result-object p1

    const-string p2, "observeOn(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public c(Lcom/ui/wifiman/model/ubiquiti/firmware/a;Ljava/io/File;)Lgg/i;
    .locals 1

    const-string v0, "fw"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "destination"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LWd/e;

    invoke-direct {v0, p0, p1, p2}, LWd/e;-><init>(Lcom/ui/wifiman/model/ubiquiti/firmware/b;Lcom/ui/wifiman/model/ubiquiti/firmware/a;Ljava/io/File;)V

    sget-object p1, Lgg/a;->LATEST:Lgg/a;

    invoke-static {v0, p1}, Lgg/i;->N(Lgg/k;Lgg/a;)Lgg/i;

    move-result-object p1

    new-instance p2, Lcom/ui/wifiman/model/ubiquiti/firmware/b$c;

    invoke-direct {p2, p0}, Lcom/ui/wifiman/model/ubiquiti/firmware/b$c;-><init>(Lcom/ui/wifiman/model/ubiquiti/firmware/b;)V

    invoke-virtual {p1, p2}, Lgg/i;->f1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object p1

    const-string p2, "observeOn(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
