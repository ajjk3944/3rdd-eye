.class public final Lcom/ui/wmw/api/v1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wmw/api/v1/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wmw/api/v1/f$a;,
        Lcom/ui/wmw/api/v1/f$b;
    }
.end annotation


# static fields
.field public static final g:Lcom/ui/wmw/api/v1/f$a;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Le9/d;

.field private final c:LY6/r;

.field private final d:Lgg/s;

.field private final e:Lcom/ui/comm/v4/b;

.field private final f:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/wmw/api/v1/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/wmw/api/v1/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wmw/api/v1/f;->g:Lcom/ui/wmw/api/v1/f$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Le9/d;)V
    .locals 3

    const-string v0, "sessionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "session"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/ui/wmw/api/v1/f;->a:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/ui/wmw/api/v1/f;->b:Le9/d;

    .line 5
    new-instance p1, LY6/r$a;

    invoke-direct {p1}, LY6/r$a;-><init>()V

    invoke-virtual {p1}, LY6/r$a;->c()LY6/r;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/wmw/api/v1/f;->c:LY6/r;

    .line 6
    invoke-virtual {p2}, Le9/d;->d()Lgg/s;

    move-result-object p1

    .line 7
    new-instance p2, Lcom/ui/wmw/api/v1/f$c;

    invoke-direct {p2, p0}, Lcom/ui/wmw/api/v1/f$c;-><init>(Lcom/ui/wmw/api/v1/f;)V

    invoke-virtual {p1, p2}, Lgg/s;->W(Lkg/n;)Lgg/s;

    move-result-object p1

    .line 8
    invoke-virtual {p1}, Lgg/s;->r0()LBg/a;

    move-result-object p1

    .line 9
    invoke-virtual {p1}, LBg/a;->l1()Lgg/s;

    move-result-object p1

    const-string p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wmw/api/v1/f;->d:Lgg/s;

    .line 10
    new-instance p1, Lcom/ui/comm/v4/b;

    .line 11
    sget-object p2, Lcom/ui/comm/v4/b$a;->JSON:Lcom/ui/comm/v4/b$a;

    .line 12
    const-string v0, "{}"

    sget-object v1, Lkotlin/text/d;->b:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-string v1, "getBytes(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p1, p2, v0}, Lcom/ui/comm/v4/b;-><init>(Lcom/ui/comm/v4/b$a;[B)V

    iput-object p1, p0, Lcom/ui/wmw/api/v1/f;->e:Lcom/ui/comm/v4/b;

    .line 14
    invoke-static {}, Lcom/ui/wmw/api/v1/a$a;->getEntries()Lfh/a;

    move-result-object p1

    const/16 p2, 0xa

    .line 15
    invoke-static {p1, p2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result p2

    invoke-static {p2}, LZg/U;->d(I)I

    move-result p2

    const/16 v0, 0x10

    invoke-static {p2, v0}, Lsh/m;->d(II)I

    move-result p2

    .line 16
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0, p2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 17
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    .line 18
    move-object v1, p2

    check-cast v1, Lcom/ui/wmw/api/v1/a$a;

    .line 19
    iget-object v2, p0, Lcom/ui/wmw/api/v1/f;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/ui/wmw/api/v1/a$a;->getPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 20
    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 21
    :cond_0
    iput-object v0, p0, Lcom/ui/wmw/api/v1/f;->f:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Le9/d;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/ui/wmw/api/v1/f;-><init>(Ljava/lang/String;Le9/d;)V

    return-void
.end method

.method public static synthetic n(Lcom/ui/comm/v4/a$e;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f;->o(Lcom/ui/comm/v4/a$e;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final o(Lcom/ui/comm/v4/a$e;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lcom/ui/comm/v4/a$e;->f()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WMW API - Unknown event received "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic p(Lcom/ui/wmw/api/v1/f;Lcom/ui/comm/v4/a$e;)Lcom/ui/wmw/api/v1/b;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wmw/api/v1/f;->u(Lcom/ui/comm/v4/a$e;)Lcom/ui/wmw/api/v1/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic q(Lcom/ui/wmw/api/v1/f;)Lcom/ui/comm/v4/b;
    .locals 0

    iget-object p0, p0, Lcom/ui/wmw/api/v1/f;->e:Lcom/ui/comm/v4/b;

    return-object p0
.end method

.method public static final synthetic r(Lcom/ui/wmw/api/v1/f;)LY6/r;
    .locals 0

    iget-object p0, p0, Lcom/ui/wmw/api/v1/f;->c:LY6/r;

    return-object p0
.end method

.method public static final synthetic s(Lcom/ui/wmw/api/v1/f;)Le9/d;
    .locals 0

    iget-object p0, p0, Lcom/ui/wmw/api/v1/f;->b:Le9/d;

    return-object p0
.end method

.method public static final synthetic t(Lcom/ui/wmw/api/v1/f;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/ui/wmw/api/v1/f;->a:Ljava/lang/String;

    return-object p0
.end method

.method private final u(Lcom/ui/comm/v4/a$e;)Lcom/ui/wmw/api/v1/b;
    .locals 7

    iget-object v0, p0, Lcom/ui/wmw/api/v1/f;->f:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/ui/comm/v4/a$e;->f()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wmw/api/v1/a$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    sget-object v2, Lcom/ui/wmw/api/v1/f$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v2, v0

    const/4 v2, 0x2

    const-string v3, "Null content body when body expected"

    const-string v4, "access$getMoshi$p(...)"

    const-string v5, "Failed to parse content body"

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lcom/ui/wmw/api/v1/e;

    invoke-direct {v0, p1}, Lcom/ui/wmw/api/v1/e;-><init>(Lcom/ui/comm/v4/a$e;)V

    invoke-static {v0}, LNf/a;->d(Lmh/a;)V

    goto/16 :goto_8

    :pswitch_0
    invoke-virtual {p1}, Lcom/ui/comm/v4/a$e;->a()Lcom/ui/comm/v4/b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/comm/v4/b;->a()[B

    move-result-object p1

    :try_start_0
    invoke-static {p0}, Lcom/ui/wmw/api/v1/f;->r(Lcom/ui/wmw/api/v1/f;)LY6/r;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lcom/ui/wmw/api/v1/ApiV1WifiScanDone;

    invoke-static {v4}, Lkotlin/jvm/internal/O;->l(Ljava/lang/Class;)Lth/p;

    move-result-object v4

    invoke-static {v0, v4}, LY6/w;->a(LY6/r;Lth/p;)LY6/h;

    move-result-object v0

    invoke-virtual {v0}, LY6/h;->e()LY6/h;

    move-result-object v0

    new-instance v4, Ljava/lang/String;

    sget-object v6, Lkotlin/text/d;->b:Ljava/nio/charset/Charset;

    invoke-direct {v4, p1, v6}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-virtual {v0, v4}, LY6/h;->c(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Lcom/squareup/moshi/JsonDataException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/squareup/moshi/JsonEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_0

    check-cast p1, Lcom/ui/wmw/api/v1/ApiV1WifiScanDone;

    new-instance v1, Lcom/ui/wmw/api/v1/b$e;

    invoke-direct {v1, p1}, Lcom/ui/wmw/api/v1/b$e;-><init>(Lcom/ui/wmw/api/v1/ApiV1WifiScanDone;)V

    goto/16 :goto_8

    :cond_0
    :try_start_1
    new-instance p1, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;

    invoke-direct {p1, v3, v1, v2, v1}, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1
    :try_end_1
    .catch Lcom/squareup/moshi/JsonDataException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lcom/squareup/moshi/JsonEncodingException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :goto_0
    new-instance v0, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;

    invoke-direct {v0, v5, p1}, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :goto_1
    new-instance v0, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;

    invoke-direct {v0, v5, p1}, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :pswitch_1
    sget-object v1, Lcom/ui/wmw/api/v1/b$c;->a:Lcom/ui/wmw/api/v1/b$c;

    goto/16 :goto_8

    :pswitch_2
    invoke-virtual {p1}, Lcom/ui/comm/v4/a$e;->a()Lcom/ui/comm/v4/b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/comm/v4/b;->a()[B

    move-result-object p1

    :try_start_2
    invoke-static {p0}, Lcom/ui/wmw/api/v1/f;->r(Lcom/ui/wmw/api/v1/f;)LY6/r;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;

    invoke-static {v4}, Lkotlin/jvm/internal/O;->l(Ljava/lang/Class;)Lth/p;

    move-result-object v4

    invoke-static {v0, v4}, LY6/w;->a(LY6/r;Lth/p;)LY6/h;

    move-result-object v0

    invoke-virtual {v0}, LY6/h;->e()LY6/h;

    move-result-object v0

    new-instance v4, Ljava/lang/String;

    sget-object v6, Lkotlin/text/d;->b:Ljava/nio/charset/Charset;

    invoke-direct {v4, p1, v6}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-virtual {v0, v4}, LY6/h;->c(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catch Lcom/squareup/moshi/JsonDataException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Lcom/squareup/moshi/JsonEncodingException; {:try_start_2 .. :try_end_2} :catch_2

    if-eqz p1, :cond_1

    check-cast p1, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;

    new-instance v1, Lcom/ui/wmw/api/v1/b$a;

    invoke-direct {v1, p1}, Lcom/ui/wmw/api/v1/b$a;-><init>(Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;)V

    goto/16 :goto_8

    :cond_1
    :try_start_3
    new-instance p1, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;

    invoke-direct {p1, v3, v1, v2, v1}, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1
    :try_end_3
    .catch Lcom/squareup/moshi/JsonDataException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Lcom/squareup/moshi/JsonEncodingException; {:try_start_3 .. :try_end_3} :catch_2

    :catch_2
    move-exception p1

    goto :goto_2

    :catch_3
    move-exception p1

    goto :goto_3

    :goto_2
    new-instance v0, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;

    invoke-direct {v0, v5, p1}, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :goto_3
    new-instance v0, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;

    invoke-direct {v0, v5, p1}, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :pswitch_3
    invoke-virtual {p1}, Lcom/ui/comm/v4/a$e;->a()Lcom/ui/comm/v4/b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/comm/v4/b;->a()[B

    move-result-object p1

    :try_start_4
    invoke-static {p0}, Lcom/ui/wmw/api/v1/f;->r(Lcom/ui/wmw/api/v1/f;)LY6/r;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lcom/ui/wmw/api/v1/ApiV1Firmware;

    invoke-static {v4}, Lkotlin/jvm/internal/O;->l(Ljava/lang/Class;)Lth/p;

    move-result-object v4

    invoke-static {v0, v4}, LY6/w;->a(LY6/r;Lth/p;)LY6/h;

    move-result-object v0

    invoke-virtual {v0}, LY6/h;->e()LY6/h;

    move-result-object v0

    new-instance v4, Ljava/lang/String;

    sget-object v6, Lkotlin/text/d;->b:Ljava/nio/charset/Charset;

    invoke-direct {v4, p1, v6}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-virtual {v0, v4}, LY6/h;->c(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1
    :try_end_4
    .catch Lcom/squareup/moshi/JsonDataException; {:try_start_4 .. :try_end_4} :catch_5
    .catch Lcom/squareup/moshi/JsonEncodingException; {:try_start_4 .. :try_end_4} :catch_4

    if-eqz p1, :cond_2

    check-cast p1, Lcom/ui/wmw/api/v1/ApiV1Firmware;

    new-instance v1, Lcom/ui/wmw/api/v1/b$b;

    invoke-direct {v1, p1}, Lcom/ui/wmw/api/v1/b$b;-><init>(Lcom/ui/wmw/api/v1/ApiV1Firmware;)V

    goto :goto_8

    :cond_2
    :try_start_5
    new-instance p1, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;

    invoke-direct {p1, v3, v1, v2, v1}, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1
    :try_end_5
    .catch Lcom/squareup/moshi/JsonDataException; {:try_start_5 .. :try_end_5} :catch_5
    .catch Lcom/squareup/moshi/JsonEncodingException; {:try_start_5 .. :try_end_5} :catch_4

    :catch_4
    move-exception p1

    goto :goto_4

    :catch_5
    move-exception p1

    goto :goto_5

    :goto_4
    new-instance v0, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;

    invoke-direct {v0, v5, p1}, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :goto_5
    new-instance v0, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;

    invoke-direct {v0, v5, p1}, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :pswitch_4
    invoke-virtual {p1}, Lcom/ui/comm/v4/a$e;->a()Lcom/ui/comm/v4/b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/comm/v4/b;->a()[B

    move-result-object p1

    :try_start_6
    invoke-static {p0}, Lcom/ui/wmw/api/v1/f;->r(Lcom/ui/wmw/api/v1/f;)LY6/r;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;

    invoke-static {v4}, Lkotlin/jvm/internal/O;->l(Ljava/lang/Class;)Lth/p;

    move-result-object v4

    invoke-static {v0, v4}, LY6/w;->a(LY6/r;Lth/p;)LY6/h;

    move-result-object v0

    invoke-virtual {v0}, LY6/h;->e()LY6/h;

    move-result-object v0

    new-instance v4, Ljava/lang/String;

    sget-object v6, Lkotlin/text/d;->b:Ljava/nio/charset/Charset;

    invoke-direct {v4, p1, v6}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-virtual {v0, v4}, LY6/h;->c(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1
    :try_end_6
    .catch Lcom/squareup/moshi/JsonDataException; {:try_start_6 .. :try_end_6} :catch_7
    .catch Lcom/squareup/moshi/JsonEncodingException; {:try_start_6 .. :try_end_6} :catch_6

    if-eqz p1, :cond_3

    check-cast p1, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;

    new-instance v1, Lcom/ui/wmw/api/v1/b$d;

    invoke-direct {v1, p1}, Lcom/ui/wmw/api/v1/b$d;-><init>(Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;)V

    goto :goto_8

    :cond_3
    :try_start_7
    new-instance p1, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;

    invoke-direct {p1, v3, v1, v2, v1}, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1
    :try_end_7
    .catch Lcom/squareup/moshi/JsonDataException; {:try_start_7 .. :try_end_7} :catch_7
    .catch Lcom/squareup/moshi/JsonEncodingException; {:try_start_7 .. :try_end_7} :catch_6

    :catch_6
    move-exception p1

    goto :goto_6

    :catch_7
    move-exception p1

    goto :goto_7

    :goto_6
    new-instance v0, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;

    invoke-direct {v0, v5, p1}, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :goto_7
    new-instance v0, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;

    invoke-direct {v0, v5, p1}, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_4
    :goto_8
    return-object v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a()Lgg/z;
    .locals 7

    sget-object v0, LLf/b$a;->GET:LLf/b$a;

    sget-object v1, Lcom/ui/wmw/api/v1/a$a;->DEVICE:Lcom/ui/wmw/api/v1/a$a;

    invoke-virtual {v0}, LLf/b$a;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f;->t(Lcom/ui/wmw/api/v1/f;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/ui/wmw/api/v1/a$a;->getPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object v4

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f;->q(Lcom/ui/wmw/api/v1/f;)Lcom/ui/comm/v4/b;

    move-result-object v5

    new-instance v6, Lcom/ui/comm/v4/a$f;

    invoke-direct {v6, v2, v3, v4, v5}, Lcom/ui/comm/v4/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/ui/comm/v4/b;)V

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f;->s(Lcom/ui/wmw/api/v1/f;)Le9/d;

    move-result-object v2

    invoke-virtual {v2, v6}, Le9/d;->e(Le9/a;)Lgg/z;

    move-result-object v2

    new-instance v3, Lcom/ui/wmw/api/v1/o;

    invoke-direct {v3, v6}, Lcom/ui/wmw/api/v1/o;-><init>(Lcom/ui/comm/v4/a$f;)V

    invoke-virtual {v2, v3}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v2

    const-wide/32 v3, 0xea60

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v3, v4, v5}, Lgg/z;->Q(JLjava/util/concurrent/TimeUnit;)Lgg/z;

    move-result-object v2

    new-instance v3, Lcom/ui/wmw/api/v1/f$g;

    invoke-direct {v3, p0}, Lcom/ui/wmw/api/v1/f$g;-><init>(Lcom/ui/wmw/api/v1/f;)V

    invoke-virtual {v2, v3}, Lgg/z;->u(Lkg/n;)Lgg/n;

    move-result-object v2

    new-instance v3, Lcom/ui/wmw/api/v1/p;

    invoke-direct {v3, v6}, Lcom/ui/wmw/api/v1/p;-><init>(Lcom/ui/comm/v4/a$f;)V

    invoke-virtual {v2, v3}, Lgg/n;->s(Lkg/n;)Lgg/n;

    move-result-object v2

    const-string v3, "onErrorResumeNext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "message body expected in response on "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v4, 0x0

    invoke-direct {v3, v0, v4, v1, v4}, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v3}, Lgg/z;->p(Ljava/lang/Throwable;)Lgg/z;

    move-result-object v0

    invoke-virtual {v2, v0}, Lgg/n;->x(Lgg/D;)Lgg/z;

    move-result-object v0

    const-string v1, "switchIfEmpty(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public b()Lgg/s;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/api/v1/f;->d:Lgg/s;

    return-object v0
.end method

.method public c()Lgg/z;
    .locals 7

    sget-object v0, LLf/b$a;->GET:LLf/b$a;

    sget-object v1, Lcom/ui/wmw/api/v1/a$a;->SETTINGS:Lcom/ui/wmw/api/v1/a$a;

    invoke-virtual {v0}, LLf/b$a;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f;->t(Lcom/ui/wmw/api/v1/f;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/ui/wmw/api/v1/a$a;->getPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object v4

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f;->q(Lcom/ui/wmw/api/v1/f;)Lcom/ui/comm/v4/b;

    move-result-object v5

    new-instance v6, Lcom/ui/comm/v4/a$f;

    invoke-direct {v6, v2, v3, v4, v5}, Lcom/ui/comm/v4/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/ui/comm/v4/b;)V

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f;->s(Lcom/ui/wmw/api/v1/f;)Le9/d;

    move-result-object v2

    invoke-virtual {v2, v6}, Le9/d;->e(Le9/a;)Lgg/z;

    move-result-object v2

    new-instance v3, Lcom/ui/wmw/api/v1/o;

    invoke-direct {v3, v6}, Lcom/ui/wmw/api/v1/o;-><init>(Lcom/ui/comm/v4/a$f;)V

    invoke-virtual {v2, v3}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v2

    const-wide/32 v3, 0xea60

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v3, v4, v5}, Lgg/z;->Q(JLjava/util/concurrent/TimeUnit;)Lgg/z;

    move-result-object v2

    new-instance v3, Lcom/ui/wmw/api/v1/f$i;

    invoke-direct {v3, p0}, Lcom/ui/wmw/api/v1/f$i;-><init>(Lcom/ui/wmw/api/v1/f;)V

    invoke-virtual {v2, v3}, Lgg/z;->u(Lkg/n;)Lgg/n;

    move-result-object v2

    new-instance v3, Lcom/ui/wmw/api/v1/p;

    invoke-direct {v3, v6}, Lcom/ui/wmw/api/v1/p;-><init>(Lcom/ui/comm/v4/a$f;)V

    invoke-virtual {v2, v3}, Lgg/n;->s(Lkg/n;)Lgg/n;

    move-result-object v2

    const-string v3, "onErrorResumeNext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "message body expected in response on "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v4, 0x0

    invoke-direct {v3, v0, v4, v1, v4}, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v3}, Lgg/z;->p(Ljava/lang/Throwable;)Lgg/z;

    move-result-object v0

    invoke-virtual {v2, v0}, Lgg/n;->x(Lgg/D;)Lgg/z;

    move-result-object v0

    const-string v1, "switchIfEmpty(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public d(Ljava/lang/String;)Lgg/b;
    .locals 7

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LLf/b$a;->POST:LLf/b$a;

    sget-object v1, Lcom/ui/wmw/api/v1/a$a;->SETTINGS_NAME:Lcom/ui/wmw/api/v1/a$a;

    new-instance v2, Lcom/ui/wmw/api/v1/ApiV1SettingsRequest$Name;

    invoke-direct {v2, p1}, Lcom/ui/wmw/api/v1/ApiV1SettingsRequest$Name;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, LLf/b$a;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f;->t(Lcom/ui/wmw/api/v1/f;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/ui/wmw/api/v1/a$a;->getPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object v1

    new-instance v3, Lcom/ui/comm/v4/b;

    sget-object v4, Lcom/ui/comm/v4/b$a;->JSON:Lcom/ui/comm/v4/b$a;

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f;->r(Lcom/ui/wmw/api/v1/f;)LY6/r;

    move-result-object v5

    const-string v6, "access$getMoshi$p(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Lcom/ui/wmw/api/v1/ApiV1SettingsRequest$Name;

    invoke-static {v6}, Lkotlin/jvm/internal/O;->l(Ljava/lang/Class;)Lth/p;

    move-result-object v6

    invoke-static {v5, v6}, LY6/w;->a(LY6/r;Lth/p;)LY6/h;

    move-result-object v5

    invoke-virtual {v5, v2}, LY6/h;->i(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v5, "toJson(...)"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Lkotlin/text/d;->b:Ljava/nio/charset/Charset;

    invoke-virtual {v2, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v2

    const-string v5, "getBytes(...)"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v3, v4, v2}, Lcom/ui/comm/v4/b;-><init>(Lcom/ui/comm/v4/b$a;[B)V

    new-instance v2, Lcom/ui/comm/v4/a$f;

    invoke-direct {v2, p1, v0, v1, v3}, Lcom/ui/comm/v4/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/ui/comm/v4/b;)V

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f;->s(Lcom/ui/wmw/api/v1/f;)Le9/d;

    move-result-object p1

    invoke-virtual {p1, v2}, Le9/d;->e(Le9/a;)Lgg/z;

    move-result-object p1

    new-instance v0, Lcom/ui/wmw/api/v1/o;

    invoke-direct {v0, v2}, Lcom/ui/wmw/api/v1/o;-><init>(Lcom/ui/comm/v4/a$f;)V

    invoke-virtual {p1, v0}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    const-wide/32 v0, 0xea60

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v3}, Lgg/z;->Q(JLjava/util/concurrent/TimeUnit;)Lgg/z;

    move-result-object p1

    new-instance v0, Lcom/ui/wmw/api/v1/n;

    invoke-direct {v0, p0}, Lcom/ui/wmw/api/v1/n;-><init>(Lcom/ui/wmw/api/v1/f;)V

    invoke-virtual {p1, v0}, Lgg/z;->u(Lkg/n;)Lgg/n;

    move-result-object p1

    new-instance v0, Lcom/ui/wmw/api/v1/p;

    invoke-direct {v0, v2}, Lcom/ui/wmw/api/v1/p;-><init>(Lcom/ui/comm/v4/a$f;)V

    invoke-virtual {p1, v0}, Lgg/n;->s(Lkg/n;)Lgg/n;

    move-result-object p1

    const-string v0, "onErrorResumeNext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lgg/n;->n()Lgg/b;

    move-result-object p1

    const-string v0, "ignoreElement(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public e(Ljava/util/List;)Lgg/b;
    .locals 7

    const-string v0, "channels"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LLf/b$a;->POST:LLf/b$a;

    sget-object v1, Lcom/ui/wmw/api/v1/a$a;->WIFI_PRIORITY_CHANNELS:Lcom/ui/wmw/api/v1/a$a;

    new-instance v2, Lcom/ui/wmw/api/v1/ApiV1SettingsRequest$WifiPriorityChannel;

    invoke-direct {v2, p1}, Lcom/ui/wmw/api/v1/ApiV1SettingsRequest$WifiPriorityChannel;-><init>(Ljava/util/List;)V

    invoke-virtual {v0}, LLf/b$a;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f;->t(Lcom/ui/wmw/api/v1/f;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/ui/wmw/api/v1/a$a;->getPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object v1

    new-instance v3, Lcom/ui/comm/v4/b;

    sget-object v4, Lcom/ui/comm/v4/b$a;->JSON:Lcom/ui/comm/v4/b$a;

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f;->r(Lcom/ui/wmw/api/v1/f;)LY6/r;

    move-result-object v5

    const-string v6, "access$getMoshi$p(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Lcom/ui/wmw/api/v1/ApiV1SettingsRequest$WifiPriorityChannel;

    invoke-static {v6}, Lkotlin/jvm/internal/O;->l(Ljava/lang/Class;)Lth/p;

    move-result-object v6

    invoke-static {v5, v6}, LY6/w;->a(LY6/r;Lth/p;)LY6/h;

    move-result-object v5

    invoke-virtual {v5, v2}, LY6/h;->i(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v5, "toJson(...)"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Lkotlin/text/d;->b:Ljava/nio/charset/Charset;

    invoke-virtual {v2, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v2

    const-string v5, "getBytes(...)"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v3, v4, v2}, Lcom/ui/comm/v4/b;-><init>(Lcom/ui/comm/v4/b$a;[B)V

    new-instance v2, Lcom/ui/comm/v4/a$f;

    invoke-direct {v2, p1, v0, v1, v3}, Lcom/ui/comm/v4/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/ui/comm/v4/b;)V

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f;->s(Lcom/ui/wmw/api/v1/f;)Le9/d;

    move-result-object p1

    invoke-virtual {p1, v2}, Le9/d;->e(Le9/a;)Lgg/z;

    move-result-object p1

    new-instance v0, Lcom/ui/wmw/api/v1/o;

    invoke-direct {v0, v2}, Lcom/ui/wmw/api/v1/o;-><init>(Lcom/ui/comm/v4/a$f;)V

    invoke-virtual {p1, v0}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    const-wide/32 v0, 0xea60

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v3}, Lgg/z;->Q(JLjava/util/concurrent/TimeUnit;)Lgg/z;

    move-result-object p1

    new-instance v0, Lcom/ui/wmw/api/v1/n;

    invoke-direct {v0, p0}, Lcom/ui/wmw/api/v1/n;-><init>(Lcom/ui/wmw/api/v1/f;)V

    invoke-virtual {p1, v0}, Lgg/z;->u(Lkg/n;)Lgg/n;

    move-result-object p1

    new-instance v0, Lcom/ui/wmw/api/v1/p;

    invoke-direct {v0, v2}, Lcom/ui/wmw/api/v1/p;-><init>(Lcom/ui/comm/v4/a$f;)V

    invoke-virtual {p1, v0}, Lgg/n;->s(Lkg/n;)Lgg/n;

    move-result-object p1

    const-string v0, "onErrorResumeNext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lgg/n;->n()Lgg/b;

    move-result-object p1

    const-string v0, "ignoreElement(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public f()Lgg/z;
    .locals 7

    sget-object v0, LLf/b$a;->GET:LLf/b$a;

    sget-object v1, Lcom/ui/wmw/api/v1/a$a;->BLUETOOTH:Lcom/ui/wmw/api/v1/a$a;

    invoke-virtual {v0}, LLf/b$a;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f;->t(Lcom/ui/wmw/api/v1/f;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/ui/wmw/api/v1/a$a;->getPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object v4

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f;->q(Lcom/ui/wmw/api/v1/f;)Lcom/ui/comm/v4/b;

    move-result-object v5

    new-instance v6, Lcom/ui/comm/v4/a$f;

    invoke-direct {v6, v2, v3, v4, v5}, Lcom/ui/comm/v4/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/ui/comm/v4/b;)V

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f;->s(Lcom/ui/wmw/api/v1/f;)Le9/d;

    move-result-object v2

    invoke-virtual {v2, v6}, Le9/d;->e(Le9/a;)Lgg/z;

    move-result-object v2

    new-instance v3, Lcom/ui/wmw/api/v1/o;

    invoke-direct {v3, v6}, Lcom/ui/wmw/api/v1/o;-><init>(Lcom/ui/comm/v4/a$f;)V

    invoke-virtual {v2, v3}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v2

    const-wide/32 v3, 0xea60

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v3, v4, v5}, Lgg/z;->Q(JLjava/util/concurrent/TimeUnit;)Lgg/z;

    move-result-object v2

    new-instance v3, Lcom/ui/wmw/api/v1/f$f;

    invoke-direct {v3, p0}, Lcom/ui/wmw/api/v1/f$f;-><init>(Lcom/ui/wmw/api/v1/f;)V

    invoke-virtual {v2, v3}, Lgg/z;->u(Lkg/n;)Lgg/n;

    move-result-object v2

    new-instance v3, Lcom/ui/wmw/api/v1/p;

    invoke-direct {v3, v6}, Lcom/ui/wmw/api/v1/p;-><init>(Lcom/ui/comm/v4/a$f;)V

    invoke-virtual {v2, v3}, Lgg/n;->s(Lkg/n;)Lgg/n;

    move-result-object v2

    const-string v3, "onErrorResumeNext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "message body expected in response on "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v4, 0x0

    invoke-direct {v3, v0, v4, v1, v4}, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v3}, Lgg/z;->p(Ljava/lang/Throwable;)Lgg/z;

    move-result-object v0

    invoke-virtual {v2, v0}, Lgg/n;->x(Lgg/D;)Lgg/z;

    move-result-object v0

    const-string v1, "switchIfEmpty(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public g(JLjava/io/InputStream;Z)Lgg/i;
    .locals 10

    const-string v0, "stream"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LLf/b$a;->POST:LLf/b$a;

    sget-object v1, Lcom/ui/wmw/api/v1/a$a;->FIRMWARE_UPLOAD_START:Lcom/ui/wmw/api/v1/a$a;

    new-instance v2, Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$Start;

    invoke-direct {v2, p1, p2}, Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$Start;-><init>(J)V

    invoke-virtual {v0}, LLf/b$a;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f;->t(Lcom/ui/wmw/api/v1/f;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/ui/wmw/api/v1/a$a;->getPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object v5

    new-instance v6, Lcom/ui/comm/v4/b;

    sget-object v7, Lcom/ui/comm/v4/b$a;->JSON:Lcom/ui/comm/v4/b$a;

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f;->r(Lcom/ui/wmw/api/v1/f;)LY6/r;

    move-result-object v8

    const-string v9, "access$getMoshi$p(...)"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v9, Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$Start;

    invoke-static {v9}, Lkotlin/jvm/internal/O;->l(Ljava/lang/Class;)Lth/p;

    move-result-object v9

    invoke-static {v8, v9}, LY6/w;->a(LY6/r;Lth/p;)LY6/h;

    move-result-object v8

    invoke-virtual {v8, v2}, LY6/h;->i(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v8, "toJson(...)"

    invoke-static {v2, v8}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v8, Lkotlin/text/d;->b:Ljava/nio/charset/Charset;

    invoke-virtual {v2, v8}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v2

    const-string v8, "getBytes(...)"

    invoke-static {v2, v8}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v6, v7, v2}, Lcom/ui/comm/v4/b;-><init>(Lcom/ui/comm/v4/b$a;[B)V

    new-instance v2, Lcom/ui/comm/v4/a$f;

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/ui/comm/v4/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/ui/comm/v4/b;)V

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f;->s(Lcom/ui/wmw/api/v1/f;)Le9/d;

    move-result-object v3

    invoke-virtual {v3, v2}, Le9/d;->e(Le9/a;)Lgg/z;

    move-result-object v3

    new-instance v4, Lcom/ui/wmw/api/v1/o;

    invoke-direct {v4, v2}, Lcom/ui/wmw/api/v1/o;-><init>(Lcom/ui/comm/v4/a$f;)V

    invoke-virtual {v3, v4}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v3

    const-wide/32 v4, 0xea60

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v3, v4, v5, v6}, Lgg/z;->Q(JLjava/util/concurrent/TimeUnit;)Lgg/z;

    move-result-object v3

    new-instance v4, Lcom/ui/wmw/api/v1/f$d;

    invoke-direct {v4, p0}, Lcom/ui/wmw/api/v1/f$d;-><init>(Lcom/ui/wmw/api/v1/f;)V

    invoke-virtual {v3, v4}, Lgg/z;->u(Lkg/n;)Lgg/n;

    move-result-object v3

    new-instance v4, Lcom/ui/wmw/api/v1/p;

    invoke-direct {v4, v2}, Lcom/ui/wmw/api/v1/p;-><init>(Lcom/ui/comm/v4/a$f;)V

    invoke-virtual {v3, v4}, Lgg/n;->s(Lkg/n;)Lgg/n;

    move-result-object v2

    const-string v3, "onErrorResumeNext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "message body expected in response on "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v4, 0x2

    invoke-direct {v3, v0, v1, v4, v1}, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v3}, Lgg/z;->p(Ljava/lang/Throwable;)Lgg/z;

    move-result-object v0

    invoke-virtual {v2, v0}, Lgg/n;->x(Lgg/D;)Lgg/z;

    move-result-object v0

    const-string v1, "switchIfEmpty(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/ui/wmw/api/v1/f$e;

    move-object v2, v1

    move-wide v3, p1

    move-object v5, p3

    move-object v6, p0

    move v7, p4

    invoke-direct/range {v2 .. v7}, Lcom/ui/wmw/api/v1/f$e;-><init>(JLjava/io/InputStream;Lcom/ui/wmw/api/v1/f;Z)V

    invoke-virtual {v0, v1}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string p2, "flatMapPublisher(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public getVersion()Lgg/z;
    .locals 7

    new-instance v0, Lcom/ui/comm/v4/a$f;

    sget-object v1, LLf/b$a;->GET:LLf/b$a;

    invoke-virtual {v1}, LLf/b$a;->getId()Ljava/lang/String;

    move-result-object v2

    sget-object v3, LLf/a;->VERSION:LLf/a;

    invoke-virtual {v3}, LLf/a;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object v5

    iget-object v6, p0, Lcom/ui/wmw/api/v1/f;->e:Lcom/ui/comm/v4/b;

    invoke-direct {v0, v2, v4, v5, v6}, Lcom/ui/comm/v4/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/ui/comm/v4/b;)V

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f;->s(Lcom/ui/wmw/api/v1/f;)Le9/d;

    move-result-object v2

    invoke-virtual {v2, v0}, Le9/d;->e(Le9/a;)Lgg/z;

    move-result-object v2

    new-instance v4, Lcom/ui/wmw/api/v1/o;

    invoke-direct {v4, v0}, Lcom/ui/wmw/api/v1/o;-><init>(Lcom/ui/comm/v4/a$f;)V

    invoke-virtual {v2, v4}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v2

    const-wide/32 v4, 0xea60

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v4, v5, v6}, Lgg/z;->Q(JLjava/util/concurrent/TimeUnit;)Lgg/z;

    move-result-object v2

    new-instance v4, Lcom/ui/wmw/api/v1/f$k;

    invoke-direct {v4, p0}, Lcom/ui/wmw/api/v1/f$k;-><init>(Lcom/ui/wmw/api/v1/f;)V

    invoke-virtual {v2, v4}, Lgg/z;->u(Lkg/n;)Lgg/n;

    move-result-object v2

    new-instance v4, Lcom/ui/wmw/api/v1/p;

    invoke-direct {v4, v0}, Lcom/ui/wmw/api/v1/p;-><init>(Lcom/ui/comm/v4/a$f;)V

    invoke-virtual {v2, v4}, Lgg/n;->s(Lkg/n;)Lgg/n;

    move-result-object v0

    const-string v2, "onErrorResumeNext(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "message body expected in response on "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-direct {v2, v1, v3, v4, v3}, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v2}, Lgg/z;->p(Ljava/lang/Throwable;)Lgg/z;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/n;->x(Lgg/D;)Lgg/z;

    move-result-object v0

    const-string v1, "switchIfEmpty(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public h()Lgg/b;
    .locals 5

    sget-object v0, LLf/b$a;->POST:LLf/b$a;

    sget-object v1, Lcom/ui/wmw/api/v1/a$a;->WIFI_SCAN_STOP:Lcom/ui/wmw/api/v1/a$a;

    invoke-virtual {v0}, LLf/b$a;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f;->t(Lcom/ui/wmw/api/v1/f;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ui/wmw/api/v1/a$a;->getPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object v2

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f;->q(Lcom/ui/wmw/api/v1/f;)Lcom/ui/comm/v4/b;

    move-result-object v3

    new-instance v4, Lcom/ui/comm/v4/a$f;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/ui/comm/v4/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/ui/comm/v4/b;)V

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f;->s(Lcom/ui/wmw/api/v1/f;)Le9/d;

    move-result-object v0

    invoke-virtual {v0, v4}, Le9/d;->e(Le9/a;)Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wmw/api/v1/o;

    invoke-direct {v1, v4}, Lcom/ui/wmw/api/v1/o;-><init>(Lcom/ui/comm/v4/a$f;)V

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v0

    const-wide/32 v1, 0xea60

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lgg/z;->Q(JLjava/util/concurrent/TimeUnit;)Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wmw/api/v1/n;

    invoke-direct {v1, p0}, Lcom/ui/wmw/api/v1/n;-><init>(Lcom/ui/wmw/api/v1/f;)V

    invoke-virtual {v0, v1}, Lgg/z;->u(Lkg/n;)Lgg/n;

    move-result-object v0

    new-instance v1, Lcom/ui/wmw/api/v1/p;

    invoke-direct {v1, v4}, Lcom/ui/wmw/api/v1/p;-><init>(Lcom/ui/comm/v4/a$f;)V

    invoke-virtual {v0, v1}, Lgg/n;->s(Lkg/n;)Lgg/n;

    move-result-object v0

    const-string v1, "onErrorResumeNext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lgg/n;->n()Lgg/b;

    move-result-object v0

    const-string v1, "ignoreElement(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public i()Lgg/z;
    .locals 7

    sget-object v0, LLf/b$a;->GET:LLf/b$a;

    sget-object v1, Lcom/ui/wmw/api/v1/a$a;->FIRMWARE:Lcom/ui/wmw/api/v1/a$a;

    invoke-virtual {v0}, LLf/b$a;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f;->t(Lcom/ui/wmw/api/v1/f;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/ui/wmw/api/v1/a$a;->getPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object v4

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f;->q(Lcom/ui/wmw/api/v1/f;)Lcom/ui/comm/v4/b;

    move-result-object v5

    new-instance v6, Lcom/ui/comm/v4/a$f;

    invoke-direct {v6, v2, v3, v4, v5}, Lcom/ui/comm/v4/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/ui/comm/v4/b;)V

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f;->s(Lcom/ui/wmw/api/v1/f;)Le9/d;

    move-result-object v2

    invoke-virtual {v2, v6}, Le9/d;->e(Le9/a;)Lgg/z;

    move-result-object v2

    new-instance v3, Lcom/ui/wmw/api/v1/o;

    invoke-direct {v3, v6}, Lcom/ui/wmw/api/v1/o;-><init>(Lcom/ui/comm/v4/a$f;)V

    invoke-virtual {v2, v3}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v2

    const-wide/32 v3, 0xea60

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v3, v4, v5}, Lgg/z;->Q(JLjava/util/concurrent/TimeUnit;)Lgg/z;

    move-result-object v2

    new-instance v3, Lcom/ui/wmw/api/v1/f$h;

    invoke-direct {v3, p0}, Lcom/ui/wmw/api/v1/f$h;-><init>(Lcom/ui/wmw/api/v1/f;)V

    invoke-virtual {v2, v3}, Lgg/z;->u(Lkg/n;)Lgg/n;

    move-result-object v2

    new-instance v3, Lcom/ui/wmw/api/v1/p;

    invoke-direct {v3, v6}, Lcom/ui/wmw/api/v1/p;-><init>(Lcom/ui/comm/v4/a$f;)V

    invoke-virtual {v2, v3}, Lgg/n;->s(Lkg/n;)Lgg/n;

    move-result-object v2

    const-string v3, "onErrorResumeNext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "message body expected in response on "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v4, 0x0

    invoke-direct {v3, v0, v4, v1, v4}, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v3}, Lgg/z;->p(Ljava/lang/Throwable;)Lgg/z;

    move-result-object v0

    invoke-virtual {v2, v0}, Lgg/n;->x(Lgg/D;)Lgg/z;

    move-result-object v0

    const-string v1, "switchIfEmpty(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public j(Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;)Lgg/b;
    .locals 7

    const-string v0, "btSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LLf/b$a;->POST:LLf/b$a;

    sget-object v1, Lcom/ui/wmw/api/v1/a$a;->BLUETOOTH:Lcom/ui/wmw/api/v1/a$a;

    invoke-virtual {v0}, LLf/b$a;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f;->t(Lcom/ui/wmw/api/v1/f;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ui/wmw/api/v1/a$a;->getPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object v2

    new-instance v3, Lcom/ui/comm/v4/b;

    sget-object v4, Lcom/ui/comm/v4/b$a;->JSON:Lcom/ui/comm/v4/b$a;

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f;->r(Lcom/ui/wmw/api/v1/f;)LY6/r;

    move-result-object v5

    const-string v6, "access$getMoshi$p(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;

    invoke-static {v6}, Lkotlin/jvm/internal/O;->l(Ljava/lang/Class;)Lth/p;

    move-result-object v6

    invoke-static {v5, v6}, LY6/w;->a(LY6/r;Lth/p;)LY6/h;

    move-result-object v5

    invoke-virtual {v5, p1}, LY6/h;->i(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v5, "toJson(...)"

    invoke-static {p1, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Lkotlin/text/d;->b:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const-string v5, "getBytes(...)"

    invoke-static {p1, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v3, v4, p1}, Lcom/ui/comm/v4/b;-><init>(Lcom/ui/comm/v4/b$a;[B)V

    new-instance p1, Lcom/ui/comm/v4/a$f;

    invoke-direct {p1, v0, v1, v2, v3}, Lcom/ui/comm/v4/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/ui/comm/v4/b;)V

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f;->s(Lcom/ui/wmw/api/v1/f;)Le9/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Le9/d;->e(Le9/a;)Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wmw/api/v1/o;

    invoke-direct {v1, p1}, Lcom/ui/wmw/api/v1/o;-><init>(Lcom/ui/comm/v4/a$f;)V

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v0

    const-wide/32 v1, 0xea60

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lgg/z;->Q(JLjava/util/concurrent/TimeUnit;)Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wmw/api/v1/n;

    invoke-direct {v1, p0}, Lcom/ui/wmw/api/v1/n;-><init>(Lcom/ui/wmw/api/v1/f;)V

    invoke-virtual {v0, v1}, Lgg/z;->u(Lkg/n;)Lgg/n;

    move-result-object v0

    new-instance v1, Lcom/ui/wmw/api/v1/p;

    invoke-direct {v1, p1}, Lcom/ui/wmw/api/v1/p;-><init>(Lcom/ui/comm/v4/a$f;)V

    invoke-virtual {v0, v1}, Lgg/n;->s(Lkg/n;)Lgg/n;

    move-result-object p1

    const-string v0, "onErrorResumeNext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lgg/n;->n()Lgg/b;

    move-result-object p1

    const-string v0, "ignoreElement(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public k()Lgg/b;
    .locals 5

    sget-object v0, LLf/b$a;->POST:LLf/b$a;

    sget-object v1, Lcom/ui/wmw/api/v1/a$a;->WIFI_SCAN_START:Lcom/ui/wmw/api/v1/a$a;

    invoke-virtual {v0}, LLf/b$a;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f;->t(Lcom/ui/wmw/api/v1/f;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ui/wmw/api/v1/a$a;->getPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object v2

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f;->q(Lcom/ui/wmw/api/v1/f;)Lcom/ui/comm/v4/b;

    move-result-object v3

    new-instance v4, Lcom/ui/comm/v4/a$f;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/ui/comm/v4/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/ui/comm/v4/b;)V

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f;->s(Lcom/ui/wmw/api/v1/f;)Le9/d;

    move-result-object v0

    invoke-virtual {v0, v4}, Le9/d;->e(Le9/a;)Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wmw/api/v1/o;

    invoke-direct {v1, v4}, Lcom/ui/wmw/api/v1/o;-><init>(Lcom/ui/comm/v4/a$f;)V

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v0

    const-wide/32 v1, 0xea60

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lgg/z;->Q(JLjava/util/concurrent/TimeUnit;)Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wmw/api/v1/n;

    invoke-direct {v1, p0}, Lcom/ui/wmw/api/v1/n;-><init>(Lcom/ui/wmw/api/v1/f;)V

    invoke-virtual {v0, v1}, Lgg/z;->u(Lkg/n;)Lgg/n;

    move-result-object v0

    new-instance v1, Lcom/ui/wmw/api/v1/p;

    invoke-direct {v1, v4}, Lcom/ui/wmw/api/v1/p;-><init>(Lcom/ui/comm/v4/a$f;)V

    invoke-virtual {v0, v1}, Lgg/n;->s(Lkg/n;)Lgg/n;

    move-result-object v0

    const-string v1, "onErrorResumeNext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lgg/n;->n()Lgg/b;

    move-result-object v0

    const-string v1, "ignoreElement(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public l()Lgg/z;
    .locals 7

    sget-object v0, LLf/b$a;->GET:LLf/b$a;

    sget-object v1, Lcom/ui/wmw/api/v1/a$a;->WIFI_SCAN_RESULT:Lcom/ui/wmw/api/v1/a$a;

    invoke-virtual {v0}, LLf/b$a;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f;->t(Lcom/ui/wmw/api/v1/f;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/ui/wmw/api/v1/a$a;->getPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object v4

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f;->q(Lcom/ui/wmw/api/v1/f;)Lcom/ui/comm/v4/b;

    move-result-object v5

    new-instance v6, Lcom/ui/comm/v4/a$f;

    invoke-direct {v6, v2, v3, v4, v5}, Lcom/ui/comm/v4/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/ui/comm/v4/b;)V

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f;->s(Lcom/ui/wmw/api/v1/f;)Le9/d;

    move-result-object v2

    invoke-virtual {v2, v6}, Le9/d;->e(Le9/a;)Lgg/z;

    move-result-object v2

    new-instance v3, Lcom/ui/wmw/api/v1/o;

    invoke-direct {v3, v6}, Lcom/ui/wmw/api/v1/o;-><init>(Lcom/ui/comm/v4/a$f;)V

    invoke-virtual {v2, v3}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v2

    const-wide/32 v3, 0xea60

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v3, v4, v5}, Lgg/z;->Q(JLjava/util/concurrent/TimeUnit;)Lgg/z;

    move-result-object v2

    new-instance v3, Lcom/ui/wmw/api/v1/f$l;

    invoke-direct {v3, p0}, Lcom/ui/wmw/api/v1/f$l;-><init>(Lcom/ui/wmw/api/v1/f;)V

    invoke-virtual {v2, v3}, Lgg/z;->u(Lkg/n;)Lgg/n;

    move-result-object v2

    new-instance v3, Lcom/ui/wmw/api/v1/p;

    invoke-direct {v3, v6}, Lcom/ui/wmw/api/v1/p;-><init>(Lcom/ui/comm/v4/a$f;)V

    invoke-virtual {v2, v3}, Lgg/n;->s(Lkg/n;)Lgg/n;

    move-result-object v2

    const-string v3, "onErrorResumeNext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "message body expected in response on "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v4, 0x0

    invoke-direct {v3, v0, v4, v1, v4}, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v3}, Lgg/z;->p(Ljava/lang/Throwable;)Lgg/z;

    move-result-object v0

    invoke-virtual {v2, v0}, Lgg/n;->x(Lgg/D;)Lgg/z;

    move-result-object v0

    const-string v1, "switchIfEmpty(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public m()Lgg/z;
    .locals 7

    sget-object v0, LLf/b$a;->GET:LLf/b$a;

    sget-object v1, Lcom/ui/wmw/api/v1/a$a;->STATISTICS:Lcom/ui/wmw/api/v1/a$a;

    invoke-virtual {v0}, LLf/b$a;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f;->t(Lcom/ui/wmw/api/v1/f;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/ui/wmw/api/v1/a$a;->getPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object v4

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f;->q(Lcom/ui/wmw/api/v1/f;)Lcom/ui/comm/v4/b;

    move-result-object v5

    new-instance v6, Lcom/ui/comm/v4/a$f;

    invoke-direct {v6, v2, v3, v4, v5}, Lcom/ui/comm/v4/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/ui/comm/v4/b;)V

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f;->s(Lcom/ui/wmw/api/v1/f;)Le9/d;

    move-result-object v2

    invoke-virtual {v2, v6}, Le9/d;->e(Le9/a;)Lgg/z;

    move-result-object v2

    new-instance v3, Lcom/ui/wmw/api/v1/o;

    invoke-direct {v3, v6}, Lcom/ui/wmw/api/v1/o;-><init>(Lcom/ui/comm/v4/a$f;)V

    invoke-virtual {v2, v3}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v2

    const-wide/32 v3, 0xea60

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v3, v4, v5}, Lgg/z;->Q(JLjava/util/concurrent/TimeUnit;)Lgg/z;

    move-result-object v2

    new-instance v3, Lcom/ui/wmw/api/v1/f$j;

    invoke-direct {v3, p0}, Lcom/ui/wmw/api/v1/f$j;-><init>(Lcom/ui/wmw/api/v1/f;)V

    invoke-virtual {v2, v3}, Lgg/z;->u(Lkg/n;)Lgg/n;

    move-result-object v2

    new-instance v3, Lcom/ui/wmw/api/v1/p;

    invoke-direct {v3, v6}, Lcom/ui/wmw/api/v1/p;-><init>(Lcom/ui/comm/v4/a$f;)V

    invoke-virtual {v2, v3}, Lgg/n;->s(Lkg/n;)Lgg/n;

    move-result-object v2

    const-string v3, "onErrorResumeNext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "message body expected in response on "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v4, 0x0

    invoke-direct {v3, v0, v4, v1, v4}, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v3}, Lgg/z;->p(Ljava/lang/Throwable;)Lgg/z;

    move-result-object v0

    invoke-virtual {v2, v0}, Lgg/n;->x(Lgg/D;)Lgg/z;

    move-result-object v0

    const-string v1, "switchIfEmpty(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
