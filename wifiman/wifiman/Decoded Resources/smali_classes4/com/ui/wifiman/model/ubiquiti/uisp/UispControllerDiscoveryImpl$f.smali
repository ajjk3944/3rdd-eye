.class public final Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl;-><init>(LZc/f;Lfd/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$f;->a:Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 5

    :try_start_0
    new-instance v0, Lokhttp3/Request$Builder;

    invoke-direct {v0}, Lokhttp3/Request$Builder;-><init>()V

    new-instance v1, Lokhttp3/HttpUrl$Builder;

    invoke-direct {v1}, Lokhttp3/HttpUrl$Builder;-><init>()V

    const-string v2, "http"

    invoke-virtual {v1, v2}, Lokhttp3/HttpUrl$Builder;->r(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    move-result-object v1

    const-string v2, "uisp.lan"

    invoke-virtual {v1, v2}, Lokhttp3/HttpUrl$Builder;->h(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    move-result-object v1

    const/16 v2, 0x2719

    invoke-virtual {v1, v2}, Lokhttp3/HttpUrl$Builder;->n(I)Lokhttp3/HttpUrl$Builder;

    move-result-object v1

    const-string v2, "me"

    invoke-virtual {v1, v2}, Lokhttp3/HttpUrl$Builder;->b(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lokhttp3/HttpUrl$Builder;->d()Lokhttp3/HttpUrl;

    move-result-object v1

    invoke-virtual {v0, v1}, Lokhttp3/Request$Builder;->i(Lokhttp3/HttpUrl;)Lokhttp3/Request$Builder;

    move-result-object v0

    const-string v1, "Origin"

    const-string v2, "http://wifiman.com"

    invoke-virtual {v0, v1, v2}, Lokhttp3/Request$Builder;->a(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Request$Builder;->b()Lokhttp3/Request;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$f;->a:Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl;

    invoke-static {v1}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl;->c(Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl;)Lfd/b;

    move-result-object v1

    invoke-interface {v1}, Lfd/b;->a()Lokhttp3/OkHttpClient;

    move-result-object v1

    invoke-virtual {v1}, Lokhttp3/OkHttpClient;->E()Lokhttp3/OkHttpClient$Builder;

    move-result-object v1

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0xbb8

    invoke-virtual {v1, v3, v4, v2}, Lokhttp3/OkHttpClient$Builder;->d(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lokhttp3/OkHttpClient$Builder;->c()Lokhttp3/OkHttpClient;

    move-result-object v1

    invoke-virtual {v1, v0}, Lokhttp3/OkHttpClient;->b(Lokhttp3/Request;)Lokhttp3/Call;

    move-result-object v0

    invoke-interface {v0}, Lokhttp3/Call;->g()Lokhttp3/Response;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Response;->P()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Lokhttp3/Response;->a()Lokhttp3/ResponseBody;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->C()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/google/gson/e;

    invoke-direct {v1}, Lcom/google/gson/e;-><init>()V

    const-class v2, LYd/c;

    invoke-virtual {v1, v0, v2}, Lcom/google/gson/e;->i(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYd/c;

    invoke-virtual {v1}, LYd/c;->a()Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v3, ")"

    if-eqz v2, :cond_2

    :try_start_1
    invoke-virtual {v1}, LYd/c;->c()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, LYd/c;->b()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/uisp/a$a;

    invoke-virtual {v1}, LYd/c;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, LYd/c;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, LYd/c;->b()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v3, v1}, Lcom/ui/wifiman/model/ubiquiti/uisp/a$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$Error$ResponseValidation;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "response doesn\'t contain mac ("

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$Error$ResponseValidation;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    new-instance v1, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$Error$ResponseValidation;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "response doesn\'t contain UISP controller token ("

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$Error$ResponseValidation;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    new-instance v1, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$Error$ResponseValidation;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "response doesn\'t contain UISP controller URL ("

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$Error$ResponseValidation;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    new-instance v1, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$Error$RequestFailed;

    invoke-virtual {v0}, Lokhttp3/Response;->p()I

    move-result v0

    invoke-direct {v1, v0}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$Error$RequestFailed;-><init>(I)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method
