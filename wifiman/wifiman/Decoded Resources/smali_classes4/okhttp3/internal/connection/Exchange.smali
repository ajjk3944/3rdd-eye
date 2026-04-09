.class public final Lokhttp3/internal/connection/Exchange;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/connection/Exchange$RequestBodySink;,
        Lokhttp3/internal/connection/Exchange$ResponseBodySource;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\t\n\u0002\u0008\u0017\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u00002\u00020\u0001:\u0002OPB\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\r\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\r\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001d\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0015\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!\u00a2\u0006\u0004\u0008#\u0010$J\u0015\u0010&\u001a\u00020%2\u0006\u0010\"\u001a\u00020!\u00a2\u0006\u0004\u0008&\u0010\'J\r\u0010)\u001a\u00020(\u00a2\u0006\u0004\u0008)\u0010*J\r\u0010+\u001a\u00020\u000e\u00a2\u0006\u0004\u0008+\u0010\u001bJ\r\u0010,\u001a\u00020\u000e\u00a2\u0006\u0004\u0008,\u0010\u001bJ\r\u0010-\u001a\u00020\u000e\u00a2\u0006\u0004\u0008-\u0010\u001bJ\r\u0010.\u001a\u00020\u000e\u00a2\u0006\u0004\u0008.\u0010\u001bJ9\u00104\u001a\u00028\u0000\"\n\u0008\u0000\u0010/*\u0004\u0018\u00010\u000c2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u00152\u0006\u00103\u001a\u00020\u00152\u0006\u0010\r\u001a\u00028\u0000\u00a2\u0006\u0004\u00084\u00105J\r\u00106\u001a\u00020\u000e\u00a2\u0006\u0004\u00086\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u00084\u00107\u001a\u0004\u00088\u00109R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008-\u0010:\u001a\u0004\u0008;\u0010<R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010=\u001a\u0004\u0008>\u0010?R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008.\u0010@R$\u0010E\u001a\u00020\u00152\u0006\u0010A\u001a\u00020\u00158\u0000@BX\u0080\u000e\u00a2\u0006\u000c\n\u0004\u0008\r\u0010B\u001a\u0004\u0008C\u0010DR$\u0010G\u001a\u00020\u00152\u0006\u0010A\u001a\u00020\u00158\u0000@BX\u0080\u000e\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010B\u001a\u0004\u0008F\u0010DR\u001a\u0010L\u001a\u00020H8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u00088\u0010I\u001a\u0004\u0008J\u0010KR\u0014\u0010N\u001a\u00020\u00158@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008M\u0010D\u00a8\u0006Q"
    }
    d2 = {
        "Lokhttp3/internal/connection/Exchange;",
        "",
        "Lokhttp3/internal/connection/RealCall;",
        "call",
        "Lokhttp3/EventListener;",
        "eventListener",
        "Lokhttp3/internal/connection/ExchangeFinder;",
        "finder",
        "Lokhttp3/internal/http/ExchangeCodec;",
        "codec",
        "<init>",
        "(Lokhttp3/internal/connection/RealCall;Lokhttp3/EventListener;Lokhttp3/internal/connection/ExchangeFinder;Lokhttp3/internal/http/ExchangeCodec;)V",
        "Ljava/io/IOException;",
        "e",
        "LYg/J;",
        "u",
        "(Ljava/io/IOException;)V",
        "Lokhttp3/Request;",
        "request",
        "w",
        "(Lokhttp3/Request;)V",
        "",
        "duplex",
        "Lej/B;",
        "c",
        "(Lokhttp3/Request;Z)Lej/B;",
        "f",
        "()V",
        "t",
        "expectContinue",
        "Lokhttp3/Response$Builder;",
        "r",
        "(Z)Lokhttp3/Response$Builder;",
        "Lokhttp3/Response;",
        "response",
        "s",
        "(Lokhttp3/Response;)V",
        "Lokhttp3/ResponseBody;",
        "q",
        "(Lokhttp3/Response;)Lokhttp3/ResponseBody;",
        "Lokhttp3/internal/ws/RealWebSocket$Streams;",
        "n",
        "()Lokhttp3/internal/ws/RealWebSocket$Streams;",
        "v",
        "o",
        "b",
        "d",
        "E",
        "",
        "bytesRead",
        "responseDone",
        "requestDone",
        "a",
        "(JZZLjava/io/IOException;)Ljava/io/IOException;",
        "p",
        "Lokhttp3/internal/connection/RealCall;",
        "g",
        "()Lokhttp3/internal/connection/RealCall;",
        "Lokhttp3/EventListener;",
        "i",
        "()Lokhttp3/EventListener;",
        "Lokhttp3/internal/connection/ExchangeFinder;",
        "j",
        "()Lokhttp3/internal/connection/ExchangeFinder;",
        "Lokhttp3/internal/http/ExchangeCodec;",
        "<set-?>",
        "Z",
        "m",
        "()Z",
        "isDuplex",
        "k",
        "hasFailure",
        "Lokhttp3/internal/connection/RealConnection;",
        "Lokhttp3/internal/connection/RealConnection;",
        "h",
        "()Lokhttp3/internal/connection/RealConnection;",
        "connection",
        "l",
        "isCoalescedConnection",
        "RequestBodySink",
        "ResponseBodySource",
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


# instance fields
.field private final a:Lokhttp3/internal/connection/RealCall;

.field private final b:Lokhttp3/EventListener;

.field private final c:Lokhttp3/internal/connection/ExchangeFinder;

.field private final d:Lokhttp3/internal/http/ExchangeCodec;

.field private e:Z

.field private f:Z

.field private final g:Lokhttp3/internal/connection/RealConnection;


# direct methods
.method public constructor <init>(Lokhttp3/internal/connection/RealCall;Lokhttp3/EventListener;Lokhttp3/internal/connection/ExchangeFinder;Lokhttp3/internal/http/ExchangeCodec;)V
    .locals 1

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "finder"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "codec"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lokhttp3/internal/connection/Exchange;->a:Lokhttp3/internal/connection/RealCall;

    iput-object p2, p0, Lokhttp3/internal/connection/Exchange;->b:Lokhttp3/EventListener;

    iput-object p3, p0, Lokhttp3/internal/connection/Exchange;->c:Lokhttp3/internal/connection/ExchangeFinder;

    iput-object p4, p0, Lokhttp3/internal/connection/Exchange;->d:Lokhttp3/internal/http/ExchangeCodec;

    invoke-interface {p4}, Lokhttp3/internal/http/ExchangeCodec;->e()Lokhttp3/internal/connection/RealConnection;

    move-result-object p1

    iput-object p1, p0, Lokhttp3/internal/connection/Exchange;->g:Lokhttp3/internal/connection/RealConnection;

    return-void
.end method

.method private final u(Ljava/io/IOException;)V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lokhttp3/internal/connection/Exchange;->f:Z

    iget-object v0, p0, Lokhttp3/internal/connection/Exchange;->c:Lokhttp3/internal/connection/ExchangeFinder;

    invoke-virtual {v0, p1}, Lokhttp3/internal/connection/ExchangeFinder;->h(Ljava/io/IOException;)V

    iget-object v0, p0, Lokhttp3/internal/connection/Exchange;->d:Lokhttp3/internal/http/ExchangeCodec;

    invoke-interface {v0}, Lokhttp3/internal/http/ExchangeCodec;->e()Lokhttp3/internal/connection/RealConnection;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/connection/Exchange;->a:Lokhttp3/internal/connection/RealCall;

    invoke-virtual {v0, v1, p1}, Lokhttp3/internal/connection/RealConnection;->I(Lokhttp3/internal/connection/RealCall;Ljava/io/IOException;)V

    return-void
.end method


# virtual methods
.method public final a(JZZLjava/io/IOException;)Ljava/io/IOException;
    .locals 2

    if-eqz p5, :cond_0

    invoke-direct {p0, p5}, Lokhttp3/internal/connection/Exchange;->u(Ljava/io/IOException;)V

    :cond_0
    if-eqz p4, :cond_2

    if-eqz p5, :cond_1

    iget-object v0, p0, Lokhttp3/internal/connection/Exchange;->b:Lokhttp3/EventListener;

    iget-object v1, p0, Lokhttp3/internal/connection/Exchange;->a:Lokhttp3/internal/connection/RealCall;

    invoke-virtual {v0, v1, p5}, Lokhttp3/EventListener;->s(Lokhttp3/Call;Ljava/io/IOException;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lokhttp3/internal/connection/Exchange;->b:Lokhttp3/EventListener;

    iget-object v1, p0, Lokhttp3/internal/connection/Exchange;->a:Lokhttp3/internal/connection/RealCall;

    invoke-virtual {v0, v1, p1, p2}, Lokhttp3/EventListener;->q(Lokhttp3/Call;J)V

    :cond_2
    :goto_0
    if-eqz p3, :cond_4

    if-eqz p5, :cond_3

    iget-object p1, p0, Lokhttp3/internal/connection/Exchange;->b:Lokhttp3/EventListener;

    iget-object p2, p0, Lokhttp3/internal/connection/Exchange;->a:Lokhttp3/internal/connection/RealCall;

    invoke-virtual {p1, p2, p5}, Lokhttp3/EventListener;->x(Lokhttp3/Call;Ljava/io/IOException;)V

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lokhttp3/internal/connection/Exchange;->b:Lokhttp3/EventListener;

    iget-object v1, p0, Lokhttp3/internal/connection/Exchange;->a:Lokhttp3/internal/connection/RealCall;

    invoke-virtual {v0, v1, p1, p2}, Lokhttp3/EventListener;->v(Lokhttp3/Call;J)V

    :cond_4
    :goto_1
    iget-object p1, p0, Lokhttp3/internal/connection/Exchange;->a:Lokhttp3/internal/connection/RealCall;

    invoke-virtual {p1, p0, p4, p3, p5}, Lokhttp3/internal/connection/RealCall;->w(Lokhttp3/internal/connection/Exchange;ZZLjava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    return-object p1
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Lokhttp3/internal/connection/Exchange;->d:Lokhttp3/internal/http/ExchangeCodec;

    invoke-interface {v0}, Lokhttp3/internal/http/ExchangeCodec;->cancel()V

    return-void
.end method

.method public final c(Lokhttp3/Request;Z)Lej/B;
    .locals 3

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-boolean p2, p0, Lokhttp3/internal/connection/Exchange;->e:Z

    invoke-virtual {p1}, Lokhttp3/Request;->a()Lokhttp3/RequestBody;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p2}, Lokhttp3/RequestBody;->a()J

    move-result-wide v0

    iget-object p2, p0, Lokhttp3/internal/connection/Exchange;->b:Lokhttp3/EventListener;

    iget-object v2, p0, Lokhttp3/internal/connection/Exchange;->a:Lokhttp3/internal/connection/RealCall;

    invoke-virtual {p2, v2}, Lokhttp3/EventListener;->r(Lokhttp3/Call;)V

    iget-object p2, p0, Lokhttp3/internal/connection/Exchange;->d:Lokhttp3/internal/http/ExchangeCodec;

    invoke-interface {p2, p1, v0, v1}, Lokhttp3/internal/http/ExchangeCodec;->h(Lokhttp3/Request;J)Lej/B;

    move-result-object p1

    new-instance p2, Lokhttp3/internal/connection/Exchange$RequestBodySink;

    invoke-direct {p2, p0, p1, v0, v1}, Lokhttp3/internal/connection/Exchange$RequestBodySink;-><init>(Lokhttp3/internal/connection/Exchange;Lej/B;J)V

    return-object p2
.end method

.method public final d()V
    .locals 3

    iget-object v0, p0, Lokhttp3/internal/connection/Exchange;->d:Lokhttp3/internal/http/ExchangeCodec;

    invoke-interface {v0}, Lokhttp3/internal/http/ExchangeCodec;->cancel()V

    iget-object v0, p0, Lokhttp3/internal/connection/Exchange;->a:Lokhttp3/internal/connection/RealCall;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v1, v2}, Lokhttp3/internal/connection/RealCall;->w(Lokhttp3/internal/connection/Exchange;ZZLjava/io/IOException;)Ljava/io/IOException;

    return-void
.end method

.method public final e()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/connection/Exchange;->d:Lokhttp3/internal/http/ExchangeCodec;

    invoke-interface {v0}, Lokhttp3/internal/http/ExchangeCodec;->a()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lokhttp3/internal/connection/Exchange;->b:Lokhttp3/EventListener;

    iget-object v2, p0, Lokhttp3/internal/connection/Exchange;->a:Lokhttp3/internal/connection/RealCall;

    invoke-virtual {v1, v2, v0}, Lokhttp3/EventListener;->s(Lokhttp3/Call;Ljava/io/IOException;)V

    invoke-direct {p0, v0}, Lokhttp3/internal/connection/Exchange;->u(Ljava/io/IOException;)V

    throw v0
.end method

.method public final f()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/connection/Exchange;->d:Lokhttp3/internal/http/ExchangeCodec;

    invoke-interface {v0}, Lokhttp3/internal/http/ExchangeCodec;->f()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lokhttp3/internal/connection/Exchange;->b:Lokhttp3/EventListener;

    iget-object v2, p0, Lokhttp3/internal/connection/Exchange;->a:Lokhttp3/internal/connection/RealCall;

    invoke-virtual {v1, v2, v0}, Lokhttp3/EventListener;->s(Lokhttp3/Call;Ljava/io/IOException;)V

    invoke-direct {p0, v0}, Lokhttp3/internal/connection/Exchange;->u(Ljava/io/IOException;)V

    throw v0
.end method

.method public final g()Lokhttp3/internal/connection/RealCall;
    .locals 1

    iget-object v0, p0, Lokhttp3/internal/connection/Exchange;->a:Lokhttp3/internal/connection/RealCall;

    return-object v0
.end method

.method public final h()Lokhttp3/internal/connection/RealConnection;
    .locals 1

    iget-object v0, p0, Lokhttp3/internal/connection/Exchange;->g:Lokhttp3/internal/connection/RealConnection;

    return-object v0
.end method

.method public final i()Lokhttp3/EventListener;
    .locals 1

    iget-object v0, p0, Lokhttp3/internal/connection/Exchange;->b:Lokhttp3/EventListener;

    return-object v0
.end method

.method public final j()Lokhttp3/internal/connection/ExchangeFinder;
    .locals 1

    iget-object v0, p0, Lokhttp3/internal/connection/Exchange;->c:Lokhttp3/internal/connection/ExchangeFinder;

    return-object v0
.end method

.method public final k()Z
    .locals 1

    iget-boolean v0, p0, Lokhttp3/internal/connection/Exchange;->f:Z

    return v0
.end method

.method public final l()Z
    .locals 2

    iget-object v0, p0, Lokhttp3/internal/connection/Exchange;->c:Lokhttp3/internal/connection/ExchangeFinder;

    invoke-virtual {v0}, Lokhttp3/internal/connection/ExchangeFinder;->d()Lokhttp3/Address;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Address;->l()Lokhttp3/HttpUrl;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/HttpUrl;->i()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/connection/Exchange;->g:Lokhttp3/internal/connection/RealConnection;

    invoke-virtual {v1}, Lokhttp3/internal/connection/RealConnection;->B()Lokhttp3/Route;

    move-result-object v1

    invoke-virtual {v1}, Lokhttp3/Route;->a()Lokhttp3/Address;

    move-result-object v1

    invoke-virtual {v1}, Lokhttp3/Address;->l()Lokhttp3/HttpUrl;

    move-result-object v1

    invoke-virtual {v1}, Lokhttp3/HttpUrl;->i()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final m()Z
    .locals 1

    iget-boolean v0, p0, Lokhttp3/internal/connection/Exchange;->e:Z

    return v0
.end method

.method public final n()Lokhttp3/internal/ws/RealWebSocket$Streams;
    .locals 1

    iget-object v0, p0, Lokhttp3/internal/connection/Exchange;->a:Lokhttp3/internal/connection/RealCall;

    invoke-virtual {v0}, Lokhttp3/internal/connection/RealCall;->E()V

    iget-object v0, p0, Lokhttp3/internal/connection/Exchange;->d:Lokhttp3/internal/http/ExchangeCodec;

    invoke-interface {v0}, Lokhttp3/internal/http/ExchangeCodec;->e()Lokhttp3/internal/connection/RealConnection;

    move-result-object v0

    invoke-virtual {v0, p0}, Lokhttp3/internal/connection/RealConnection;->y(Lokhttp3/internal/connection/Exchange;)Lokhttp3/internal/ws/RealWebSocket$Streams;

    move-result-object v0

    return-object v0
.end method

.method public final o()V
    .locals 1

    iget-object v0, p0, Lokhttp3/internal/connection/Exchange;->d:Lokhttp3/internal/http/ExchangeCodec;

    invoke-interface {v0}, Lokhttp3/internal/http/ExchangeCodec;->e()Lokhttp3/internal/connection/RealConnection;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/internal/connection/RealConnection;->A()V

    return-void
.end method

.method public final p()V
    .locals 4

    iget-object v0, p0, Lokhttp3/internal/connection/Exchange;->a:Lokhttp3/internal/connection/RealCall;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v0, p0, v3, v1, v2}, Lokhttp3/internal/connection/RealCall;->w(Lokhttp3/internal/connection/Exchange;ZZLjava/io/IOException;)Ljava/io/IOException;

    return-void
.end method

.method public final q(Lokhttp3/Response;)Lokhttp3/ResponseBody;
    .locals 4

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    const-string v0, "Content-Type"

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v0, v2, v1, v2}, Lokhttp3/Response;->C(Lokhttp3/Response;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/connection/Exchange;->d:Lokhttp3/internal/http/ExchangeCodec;

    invoke-interface {v1, p1}, Lokhttp3/internal/http/ExchangeCodec;->g(Lokhttp3/Response;)J

    move-result-wide v1

    iget-object v3, p0, Lokhttp3/internal/connection/Exchange;->d:Lokhttp3/internal/http/ExchangeCodec;

    invoke-interface {v3, p1}, Lokhttp3/internal/http/ExchangeCodec;->c(Lokhttp3/Response;)Lej/D;

    move-result-object p1

    new-instance v3, Lokhttp3/internal/connection/Exchange$ResponseBodySource;

    invoke-direct {v3, p0, p1, v1, v2}, Lokhttp3/internal/connection/Exchange$ResponseBodySource;-><init>(Lokhttp3/internal/connection/Exchange;Lej/D;J)V

    new-instance p1, Lokhttp3/internal/http/RealResponseBody;

    invoke-static {v3}, Lej/p;->d(Lej/D;)Lej/g;

    move-result-object v3

    invoke-direct {p1, v0, v1, v2, v3}, Lokhttp3/internal/http/RealResponseBody;-><init>(Ljava/lang/String;JLej/g;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    iget-object v0, p0, Lokhttp3/internal/connection/Exchange;->b:Lokhttp3/EventListener;

    iget-object v1, p0, Lokhttp3/internal/connection/Exchange;->a:Lokhttp3/internal/connection/RealCall;

    invoke-virtual {v0, v1, p1}, Lokhttp3/EventListener;->x(Lokhttp3/Call;Ljava/io/IOException;)V

    invoke-direct {p0, p1}, Lokhttp3/internal/connection/Exchange;->u(Ljava/io/IOException;)V

    throw p1
.end method

.method public final r(Z)Lokhttp3/Response$Builder;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/connection/Exchange;->d:Lokhttp3/internal/http/ExchangeCodec;

    invoke-interface {v0, p1}, Lokhttp3/internal/http/ExchangeCodec;->d(Z)Lokhttp3/Response$Builder;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1, p0}, Lokhttp3/Response$Builder;->l(Lokhttp3/internal/connection/Exchange;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    return-object p1

    :goto_1
    iget-object v0, p0, Lokhttp3/internal/connection/Exchange;->b:Lokhttp3/EventListener;

    iget-object v1, p0, Lokhttp3/internal/connection/Exchange;->a:Lokhttp3/internal/connection/RealCall;

    invoke-virtual {v0, v1, p1}, Lokhttp3/EventListener;->x(Lokhttp3/Call;Ljava/io/IOException;)V

    invoke-direct {p0, p1}, Lokhttp3/internal/connection/Exchange;->u(Ljava/io/IOException;)V

    throw p1
.end method

.method public final s(Lokhttp3/Response;)V
    .locals 2

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lokhttp3/internal/connection/Exchange;->b:Lokhttp3/EventListener;

    iget-object v1, p0, Lokhttp3/internal/connection/Exchange;->a:Lokhttp3/internal/connection/RealCall;

    invoke-virtual {v0, v1, p1}, Lokhttp3/EventListener;->y(Lokhttp3/Call;Lokhttp3/Response;)V

    return-void
.end method

.method public final t()V
    .locals 2

    iget-object v0, p0, Lokhttp3/internal/connection/Exchange;->b:Lokhttp3/EventListener;

    iget-object v1, p0, Lokhttp3/internal/connection/Exchange;->a:Lokhttp3/internal/connection/RealCall;

    invoke-virtual {v0, v1}, Lokhttp3/EventListener;->z(Lokhttp3/Call;)V

    return-void
.end method

.method public final v()V
    .locals 6

    const/4 v4, 0x1

    const/4 v5, 0x0

    const-wide/16 v1, -0x1

    const/4 v3, 0x1

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lokhttp3/internal/connection/Exchange;->a(JZZLjava/io/IOException;)Ljava/io/IOException;

    return-void
.end method

.method public final w(Lokhttp3/Request;)V
    .locals 2

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/connection/Exchange;->b:Lokhttp3/EventListener;

    iget-object v1, p0, Lokhttp3/internal/connection/Exchange;->a:Lokhttp3/internal/connection/RealCall;

    invoke-virtual {v0, v1}, Lokhttp3/EventListener;->u(Lokhttp3/Call;)V

    iget-object v0, p0, Lokhttp3/internal/connection/Exchange;->d:Lokhttp3/internal/http/ExchangeCodec;

    invoke-interface {v0, p1}, Lokhttp3/internal/http/ExchangeCodec;->b(Lokhttp3/Request;)V

    iget-object v0, p0, Lokhttp3/internal/connection/Exchange;->b:Lokhttp3/EventListener;

    iget-object v1, p0, Lokhttp3/internal/connection/Exchange;->a:Lokhttp3/internal/connection/RealCall;

    invoke-virtual {v0, v1, p1}, Lokhttp3/EventListener;->t(Lokhttp3/Call;Lokhttp3/Request;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object v0, p0, Lokhttp3/internal/connection/Exchange;->b:Lokhttp3/EventListener;

    iget-object v1, p0, Lokhttp3/internal/connection/Exchange;->a:Lokhttp3/internal/connection/RealCall;

    invoke-virtual {v0, v1, p1}, Lokhttp3/EventListener;->s(Lokhttp3/Call;Ljava/io/IOException;)V

    invoke-direct {p0, p1}, Lokhttp3/internal/connection/Exchange;->u(Ljava/io/IOException;)V

    throw p1
.end method
