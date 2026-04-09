.class final synthetic Ltb/u$a;
.super Lkotlin/jvm/internal/p;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltb/u;-><init>(Ltb/N;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-string/jumbo v5, "createRequester()Lcom/ui/unifi/core/base/net/webrtc/WebRtcApiRequester;"

    const/4 v6, 0x0

    const/4 v1, 0x0

    const-class v3, Ltb/u;

    const-string/jumbo v4, "createRequester"

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/p;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a()Ltb/q;
    .locals 1

    iget-object v0, p0, Lkotlin/jvm/internal/f;->receiver:Ljava/lang/Object;

    check-cast v0, Ltb/u;

    invoke-static {v0}, Ltb/u;->d(Ltb/u;)Ltb/q;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ltb/u$a;->a()Ltb/q;

    move-result-object v0

    return-object v0
.end method
