.class Lkj/a$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkj/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final a:Ljava/lang/String;

.field final synthetic b:Lkj/a;


# direct methods
.method constructor <init>(Lkj/a;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lkj/a$d;->b:Lkj/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lkj/a$d;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Lorg/eclipse/paho/client/mqttv3/BufferedMessage;)V
    .locals 5

    iget-object v0, p0, Lkj/a$d;->b:Lkj/a;

    invoke-virtual {v0}, Lkj/a;->K()Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    iget-object v0, p0, Lkj/a$d;->b:Lkj/a;

    invoke-static {v0}, Lkj/a;->j(Lkj/a;)Lkj/b;

    move-result-object v0

    invoke-virtual {v0}, Lkj/b;->k()I

    move-result v0

    iget-object v1, p0, Lkj/a$d;->b:Lkj/a;

    invoke-static {v1}, Lkj/a;->j(Lkj/a;)Lkj/b;

    move-result-object v1

    invoke-virtual {v1}, Lkj/b;->n()I

    move-result v1

    add-int/lit8 v1, v1, -0x3

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lkj/a$d;->b:Lkj/a;

    invoke-static {v0}, Lkj/a;->b(Lkj/a;)Lorg/eclipse/paho/client/mqttv3/logging/a;

    move-result-object v0

    iget-object v1, p0, Lkj/a$d;->b:Lkj/a;

    invoke-static {v1}, Lkj/a;->f(Lkj/a;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lkj/a$d;->a:Ljava/lang/String;

    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/BufferedMessage;->getMessage()Lnj/u;

    move-result-object v3

    invoke-virtual {v3}, Lnj/u;->i()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "510"

    invoke-interface {v0, v1, v2, v4, v3}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lkj/a$d;->b:Lkj/a;

    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/BufferedMessage;->getMessage()Lnj/u;

    move-result-object v1

    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/BufferedMessage;->getToken()Lorg/eclipse/paho/client/mqttv3/MqttToken;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lkj/a;->I(Lnj/u;Lorg/eclipse/paho/client/mqttv3/MqttToken;)V

    iget-object v0, p0, Lkj/a$d;->b:Lkj/a;

    invoke-static {v0}, Lkj/a;->j(Lkj/a;)Lkj/b;

    move-result-object v0

    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/BufferedMessage;->getMessage()Lnj/u;

    move-result-object p1

    invoke-virtual {v0, p1}, Lkj/b;->R(Lnj/u;)V

    return-void

    :cond_0
    invoke-static {}, Ljava/lang/Thread;->yield()V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lkj/a$d;->b:Lkj/a;

    invoke-static {p1}, Lkj/a;->b(Lkj/a;)Lorg/eclipse/paho/client/mqttv3/logging/a;

    move-result-object p1

    iget-object v0, p0, Lkj/a$d;->b:Lkj/a;

    invoke-static {v0}, Lkj/a;->f(Lkj/a;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lkj/a$d;->a:Ljava/lang/String;

    const-string v2, "208"

    invoke-interface {p1, v0, v1, v2}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 p1, 0x7d68

    invoke-static {p1}, Lkj/i;->a(I)Lorg/eclipse/paho/client/mqttv3/MqttException;

    move-result-object p1

    throw p1
.end method
