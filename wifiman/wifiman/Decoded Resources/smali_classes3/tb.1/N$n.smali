.class public final Ltb/N$n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/webrtc/SdpObserver;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltb/N;-><init>(Ljava/util/List;Ljava/lang/String;Lpb/l;Llb/c;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ltb/N;


# direct methods
.method constructor <init>(Ltb/N;)V
    .locals 0

    iput-object p1, p0, Ltb/N$n;->a:Ltb/N;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreateFailure(Ljava/lang/String;)V
    .locals 2

    const-string/jumbo v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, LYg/r;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "An operation is not implemented: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v1, "not implemented"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, LYg/r;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public onCreateSuccess(Lorg/webrtc/SessionDescription;)V
    .locals 1

    const-string/jumbo v0, "sdp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ltb/N$n;->a:Ltb/N;

    invoke-static {v0, p1}, Ltb/N;->D(Ltb/N;Lorg/webrtc/SessionDescription;)V

    return-void
.end method

.method public onSetFailure(Ljava/lang/String;)V
    .locals 2

    const-string/jumbo v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, LYg/r;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "An operation is not implemented: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v1, "not implemented"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, LYg/r;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public onSetSuccess()V
    .locals 2

    iget-object v0, p0, Ltb/N$n;->a:Ltb/N;

    sget-object v1, Ltb/N$c;->SET_LOCAL_SDP_SUCCESS:Ltb/N$c;

    invoke-static {v0, v1}, Ltb/N;->s(Ltb/N;Ltb/N$c;)V

    iget-object v0, p0, Ltb/N$n;->a:Ltb/N;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Ltb/N;->E(Ltb/N;Z)V

    iget-object v0, p0, Ltb/N$n;->a:Ltb/N;

    invoke-static {v0}, Ltb/N;->t(Ltb/N;)V

    return-void
.end method
