.class public final Ltb/N$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/webrtc/SdpObserver;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltb/N;->N(Ltb/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ltb/N;

.field final synthetic b:Ltb/f;


# direct methods
.method constructor <init>(Ltb/N;Ltb/f;)V
    .locals 0

    iput-object p1, p0, Ltb/N$k;->a:Ltb/N;

    iput-object p2, p0, Ltb/N$k;->b:Ltb/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreateFailure(Ljava/lang/String;)V
    .locals 3

    sget-object v0, LSj/a;->a:LSj/a$b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Signalling answer create failure "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v1}, LSj/a$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public onCreateSuccess(Lorg/webrtc/SessionDescription;)V
    .locals 3

    const-string/jumbo v0, "localDescription"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LSj/a;->a:LSj/a$b;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string/jumbo v2, "Signalling answer created"

    invoke-virtual {v0, v2, v1}, LSj/a$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Ltb/N$k;->a:Ltb/N;

    invoke-static {v0, p1}, Ltb/N;->C(Ltb/N;Lorg/webrtc/SessionDescription;)V

    iget-object v0, p0, Ltb/N$k;->a:Ltb/N;

    iget-object v1, p0, Ltb/N$k;->b:Ltb/f;

    invoke-static {v0, p1, v1}, Ltb/N;->B(Ltb/N;Lorg/webrtc/SessionDescription;Ltb/f;)V

    return-void
.end method

.method public onSetFailure(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onSetSuccess()V
    .locals 0

    return-void
.end method
