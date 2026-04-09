.class final Ltb/N$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltb/N;->L()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ltb/N;


# direct methods
.method constructor <init>(Ltb/N;)V
    .locals 0

    iput-object p1, p0, Ltb/N$h;->a:Ltb/N;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lnb/f;)V
    .locals 5

    const-string/jumbo v0, "mqttResponse"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LSj/a;->a:LSj/a$b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lnb/f;->a()Ljava/lang/Integer;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "MqttResponse: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v3}, LSj/a$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    instance-of v1, p1, Lnb/c;

    if-eqz v1, :cond_0

    iget-object v0, p0, Ltb/N$h;->a:Ltb/N;

    check-cast p1, Lnb/c;

    invoke-static {v0, p1}, Ltb/N;->z(Ltb/N;Lnb/c;)V

    goto :goto_0

    :cond_0
    instance-of v1, p1, Lnb/a;

    if-eqz v1, :cond_1

    iget-object v0, p0, Ltb/N$h;->a:Ltb/N;

    new-instance v1, Lorg/webrtc/SessionDescription;

    sget-object v2, Lorg/webrtc/SessionDescription$Type;->ANSWER:Lorg/webrtc/SessionDescription$Type;

    check-cast p1, Lnb/a;

    invoke-virtual {p1}, Lnb/a;->c()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Lorg/webrtc/SessionDescription;-><init>(Lorg/webrtc/SessionDescription$Type;Ljava/lang/String;)V

    invoke-static {v0, v1}, Ltb/N;->G(Ltb/N;Lorg/webrtc/SessionDescription;)V

    goto :goto_0

    :cond_1
    instance-of v1, p1, Lnb/i;

    if-eqz v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "Received sdp completed response! "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v1, v2, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v1}, LSj/a$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lnb/f;

    invoke-virtual {p0, p1}, Ltb/N$h;->a(Lnb/f;)V

    return-void
.end method
