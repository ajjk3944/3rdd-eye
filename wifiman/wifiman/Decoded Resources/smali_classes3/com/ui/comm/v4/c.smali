.class public final Lcom/ui/comm/v4/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/comm/v4/UiCommV4MessageHeaderJsonSerializer;


# instance fields
.field private final a:LY6/r;

.field private final b:LY6/h;


# direct methods
.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LY6/r$a;

    invoke-direct {v0}, LY6/r$a;-><init>()V

    const-string/jumbo v1, "type"

    const-class v2, Lcom/ui/comm/v4/UiCommV4Specs$Header;

    invoke-static {v2, v1}, LZ6/a;->b(Ljava/lang/Class;Ljava/lang/String;)LZ6/a;

    move-result-object v1

    sget-object v3, Lg9/c;->REQUEST:Lg9/c;

    invoke-virtual {v3}, Lg9/c;->getId()Ljava/lang/String;

    move-result-object v3

    const-class v4, Lcom/ui/comm/v4/UiCommV4Specs$Header$Request;

    invoke-virtual {v1, v4, v3}, LZ6/a;->c(Ljava/lang/Class;Ljava/lang/String;)LZ6/a;

    move-result-object v1

    sget-object v3, Lg9/c;->RESPONSE:Lg9/c;

    invoke-virtual {v3}, Lg9/c;->getId()Ljava/lang/String;

    move-result-object v3

    const-class v4, Lcom/ui/comm/v4/UiCommV4Specs$Header$Response;

    invoke-virtual {v1, v4, v3}, LZ6/a;->c(Ljava/lang/Class;Ljava/lang/String;)LZ6/a;

    move-result-object v1

    sget-object v3, Lg9/c;->HTTP_REQUEST:Lg9/c;

    invoke-virtual {v3}, Lg9/c;->getId()Ljava/lang/String;

    move-result-object v3

    const-class v4, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpRequest;

    invoke-virtual {v1, v4, v3}, LZ6/a;->c(Ljava/lang/Class;Ljava/lang/String;)LZ6/a;

    move-result-object v1

    sget-object v3, Lg9/c;->HTTP_RESPONSE:Lg9/c;

    invoke-virtual {v3}, Lg9/c;->getId()Ljava/lang/String;

    move-result-object v3

    const-class v4, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;

    invoke-virtual {v1, v4, v3}, LZ6/a;->c(Ljava/lang/Class;Ljava/lang/String;)LZ6/a;

    move-result-object v1

    sget-object v3, Lg9/c;->LOG:Lg9/c;

    invoke-virtual {v3}, Lg9/c;->getId()Ljava/lang/String;

    move-result-object v3

    const-class v4, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log;

    invoke-virtual {v1, v4, v3}, LZ6/a;->c(Ljava/lang/Class;Ljava/lang/String;)LZ6/a;

    move-result-object v1

    sget-object v3, Lg9/c;->EVENT:Lg9/c;

    invoke-virtual {v3}, Lg9/c;->getId()Ljava/lang/String;

    move-result-object v3

    const-class v4, Lcom/ui/comm/v4/UiCommV4Specs$Header$Event;

    invoke-virtual {v1, v4, v3}, LZ6/a;->c(Ljava/lang/Class;Ljava/lang/String;)LZ6/a;

    move-result-object v1

    sget-object v3, Lg9/c;->ERROR:Lg9/c;

    invoke-virtual {v3}, Lg9/c;->getId()Ljava/lang/String;

    move-result-object v3

    const-class v4, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;

    invoke-virtual {v1, v4, v3}, LZ6/a;->c(Ljava/lang/Class;Ljava/lang/String;)LZ6/a;

    move-result-object v1

    sget-object v3, Lg9/c;->CMD:Lg9/c;

    invoke-virtual {v3}, Lg9/c;->getId()Ljava/lang/String;

    move-result-object v3

    const-class v4, Lcom/ui/comm/v4/UiCommV4Specs$Header$Cmd;

    invoke-virtual {v1, v4, v3}, LZ6/a;->c(Ljava/lang/Class;Ljava/lang/String;)LZ6/a;

    move-result-object v1

    sget-object v3, Lg9/c;->CMD_RESPONSE:Lg9/c;

    invoke-virtual {v3}, Lg9/c;->getId()Ljava/lang/String;

    move-result-object v3

    const-class v4, Lcom/ui/comm/v4/UiCommV4Specs$Header$CmdResponse;

    invoke-virtual {v1, v4, v3}, LZ6/a;->c(Ljava/lang/Class;Ljava/lang/String;)LZ6/a;

    move-result-object v1

    invoke-virtual {v0, v1}, LY6/r$a;->a(LY6/h$d;)LY6/r$a;

    move-result-object v0

    invoke-virtual {v0}, LY6/r$a;->c()LY6/r;

    move-result-object v0

    iput-object v0, p0, Lcom/ui/comm/v4/c;->a:LY6/r;

    const-string/jumbo v1, "moshi"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->l(Ljava/lang/Class;)Lth/p;

    move-result-object v1

    invoke-static {v0, v1}, LY6/w;->a(LY6/r;Lth/p;)LY6/h;

    move-result-object v0

    iput-object v0, p0, Lcom/ui/comm/v4/c;->b:LY6/h;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/ui/comm/v4/UiCommV4Specs$Header;
    .locals 3

    const-string/jumbo v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/ui/comm/v4/c;->b:LY6/h;

    invoke-virtual {v0, p1}, LY6/h;->c(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/comm/v4/UiCommV4Specs$Header;

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    new-instance p1, Lcom/ui/comm/v4/UiCommV4MessageHeaderJsonSerializer$Error$JsonParsingFailed;

    const-string/jumbo v0, "no JSON found in message"

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p1, v0, v2, v1, v2}, Lcom/ui/comm/v4/UiCommV4MessageHeaderJsonSerializer$Error$JsonParsingFailed;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1
    :try_end_0
    .catch Lcom/squareup/moshi/JsonDataException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :goto_0
    new-instance v0, Lcom/ui/comm/v4/UiCommV4MessageHeaderJsonSerializer$Error$JsonParsingFailed;

    const-string/jumbo v1, "there is an error reading the JSON, or it is malformed"

    invoke-direct {v0, v1, p1}, Lcom/ui/comm/v4/UiCommV4MessageHeaderJsonSerializer$Error$JsonParsingFailed;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :goto_1
    new-instance v0, Lcom/ui/comm/v4/UiCommV4MessageHeaderJsonSerializer$Error$JsonParsingFailed;

    const-string/jumbo v1, "the JSON is well-formed, but doesn\u2019t match the expected format"

    invoke-direct {v0, v1, p1}, Lcom/ui/comm/v4/UiCommV4MessageHeaderJsonSerializer$Error$JsonParsingFailed;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public b(Lcom/ui/comm/v4/UiCommV4Specs$Header;)Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/comm/v4/c;->b:LY6/h;

    invoke-virtual {v0, p1}, LY6/h;->i(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string/jumbo v0, "messageAdapter.toJson(message)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
