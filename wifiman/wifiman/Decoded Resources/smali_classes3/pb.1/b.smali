.class public final synthetic Lpb/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback;


# instance fields
.field public final synthetic a:Lgg/t;


# direct methods
.method public synthetic constructor <init>(Lgg/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpb/b;->a:Lgg/t;

    return-void
.end method


# virtual methods
.method public final a(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback$MessageDeliveryStatus;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lpb/b;->a:Lgg/t;

    invoke-static {v0, p1, p2}, Lpb/l;->h(Lgg/t;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback$MessageDeliveryStatus;Ljava/lang/Object;)V

    return-void
.end method
