.class public final synthetic Lpb/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback;


# instance fields
.field public final synthetic a:Lpb/l;

.field public final synthetic b:Lgg/t;


# direct methods
.method public synthetic constructor <init>(Lpb/l;Lgg/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpb/d;->a:Lpb/l;

    iput-object p2, p0, Lpb/d;->b:Lgg/t;

    return-void
.end method


# virtual methods
.method public final a(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback$AWSIotMqttClientStatus;Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lpb/d;->a:Lpb/l;

    iget-object v1, p0, Lpb/d;->b:Lgg/t;

    invoke-static {v0, v1, p1, p2}, Lpb/l;->i(Lpb/l;Lgg/t;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback$AWSIotMqttClientStatus;Ljava/lang/Throwable;)V

    return-void
.end method
