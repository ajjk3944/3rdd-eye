.class final Lhb/c$k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhb/c$k;->a(Lgg/s;)Lgg/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lhb/c;


# direct methods
.method constructor <init>(Lhb/c;)V
    .locals 0

    iput-object p1, p0, Lhb/c$k$a;->a:Lhb/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)Lgg/v;
    .locals 1

    const-string/jumbo v0, "throwable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lorg/eclipse/paho/client/mqttv3/MqttException;

    if-eqz v0, :cond_0

    iget-object p1, p0, Lhb/c$k$a;->a:Lhb/c;

    invoke-static {p1}, Lhb/c;->s(Lhb/c;)Ljb/a;

    move-result-object p1

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Ljb/a;->b(Z)Lgg/z;

    move-result-object p1

    invoke-virtual {p1}, Lgg/z;->Y()Lgg/s;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lgg/s;->L(Ljava/lang/Throwable;)Lgg/s;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lhb/c$k$a;->a(Ljava/lang/Throwable;)Lgg/v;

    move-result-object p1

    return-object p1
.end method
