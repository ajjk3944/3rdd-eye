.class final Lcom/ui/wmw/api/v1/f$e$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wmw/api/v1/f$e;->c(Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wmw/api/v1/f;

.field final synthetic b:Z

.field final synthetic c:Lkotlin/jvm/internal/M;


# direct methods
.method constructor <init>(Lcom/ui/wmw/api/v1/f;ZLkotlin/jvm/internal/M;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wmw/api/v1/f$e$c;->a:Lcom/ui/wmw/api/v1/f;

    iput-boolean p2, p0, Lcom/ui/wmw/api/v1/f$e$c;->b:Z

    iput-object p3, p0, Lcom/ui/wmw/api/v1/f$e$c;->c:Lkotlin/jvm/internal/M;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a([B)Lgg/D;
    .locals 9

    const-string v0, "requestBodyPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wmw/api/v1/f$e$c;->a:Lcom/ui/wmw/api/v1/f;

    new-instance v1, Lcom/ui/comm/v4/a$f;

    sget-object v2, LLf/b$a;->POST:LLf/b$a;

    invoke-virtual {v2}, LLf/b$a;->getId()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lcom/ui/wmw/api/v1/a$a;->FIRMWARE_UPLOAD_DATA:Lcom/ui/wmw/api/v1/a$a;

    iget-object v5, p0, Lcom/ui/wmw/api/v1/f$e$c;->a:Lcom/ui/wmw/api/v1/f;

    invoke-static {v5}, Lcom/ui/wmw/api/v1/f;->t(Lcom/ui/wmw/api/v1/f;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/ui/wmw/api/v1/a$a;->getPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object v6

    new-instance v7, Lcom/ui/comm/v4/b;

    sget-object v8, Lcom/ui/comm/v4/b$a;->BINARY:Lcom/ui/comm/v4/b$a;

    invoke-direct {v7, v8, p1}, Lcom/ui/comm/v4/b;-><init>(Lcom/ui/comm/v4/b$a;[B)V

    invoke-direct {v1, v3, v5, v6, v7}, Lcom/ui/comm/v4/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/ui/comm/v4/b;)V

    iget-boolean v3, p0, Lcom/ui/wmw/api/v1/f$e$c;->b:Z

    if-eqz v3, :cond_0

    sget-object v3, Lcom/ui/binme/BinaryMessage$b;->ENABLED:Lcom/ui/binme/BinaryMessage$b;

    invoke-virtual {v1, v3}, Lcom/ui/comm/v4/a;->e(Lcom/ui/binme/BinaryMessage$b;)V

    invoke-virtual {v1, v3}, Lcom/ui/comm/v4/a;->d(Lcom/ui/binme/BinaryMessage$b;)V

    :cond_0
    invoke-static {v0}, Lcom/ui/wmw/api/v1/f;->s(Lcom/ui/wmw/api/v1/f;)Le9/d;

    move-result-object v3

    invoke-virtual {v3, v1}, Le9/d;->e(Le9/a;)Lgg/z;

    move-result-object v3

    new-instance v5, Lcom/ui/wmw/api/v1/o;

    invoke-direct {v5, v1}, Lcom/ui/wmw/api/v1/o;-><init>(Lcom/ui/comm/v4/a$f;)V

    invoke-virtual {v3, v5}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v3

    const-wide/32 v5, 0xea60

    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v3, v5, v6, v7}, Lgg/z;->Q(JLjava/util/concurrent/TimeUnit;)Lgg/z;

    move-result-object v3

    new-instance v5, Lcom/ui/wmw/api/v1/f$e$c$b;

    invoke-direct {v5, v0}, Lcom/ui/wmw/api/v1/f$e$c$b;-><init>(Lcom/ui/wmw/api/v1/f;)V

    invoke-virtual {v3, v5}, Lgg/z;->u(Lkg/n;)Lgg/n;

    move-result-object v0

    new-instance v3, Lcom/ui/wmw/api/v1/p;

    invoke-direct {v3, v1}, Lcom/ui/wmw/api/v1/p;-><init>(Lcom/ui/comm/v4/a$f;)V

    invoke-virtual {v0, v3}, Lgg/n;->s(Lkg/n;)Lgg/n;

    move-result-object v0

    const-string v1, "onErrorResumeNext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "message body expected in response on "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-direct {v1, v2, v4, v3, v4}, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, Lgg/z;->p(Ljava/lang/Throwable;)Lgg/z;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/n;->x(Lgg/D;)Lgg/z;

    move-result-object v0

    const-string v1, "switchIfEmpty(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/ui/wmw/api/v1/f$e$c$a;

    iget-object v2, p0, Lcom/ui/wmw/api/v1/f$e$c;->c:Lkotlin/jvm/internal/M;

    invoke-direct {v1, v2, p1}, Lcom/ui/wmw/api/v1/f$e$c$a;-><init>(Lkotlin/jvm/internal/M;[B)V

    invoke-virtual {v0, v1}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [B

    invoke-virtual {p0, p1}, Lcom/ui/wmw/api/v1/f$e$c;->a([B)Lgg/D;

    move-result-object p1

    return-object p1
.end method
