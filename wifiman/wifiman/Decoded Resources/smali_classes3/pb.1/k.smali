.class public final synthetic Lpb/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttNewMessageCallback;


# instance fields
.field public final synthetic a:Lpb/m;


# direct methods
.method public synthetic constructor <init>(Lpb/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpb/k;->a:Lpb/m;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;[B)V
    .locals 1

    iget-object v0, p0, Lpb/k;->a:Lpb/m;

    invoke-static {v0, p1, p2}, Lpb/l;->g(Lpb/m;Ljava/lang/String;[B)V

    return-void
.end method
