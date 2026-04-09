.class final synthetic Lhb/c$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltb/V$a;
.implements Lkotlin/jvm/internal/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhb/c;-><init>(Ljava/lang/String;Ljava/lang/String;ZLGb/f;Llb/c;Ljb/a;Ljb/i;Leb/g$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# instance fields
.field final synthetic a:Lhb/c;


# direct methods
.method constructor <init>(Lhb/c;)V
    .locals 0

    iput-object p1, p0, Lhb/c$l;->a:Lhb/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ltb/N$c;)V
    .locals 1

    const-string/jumbo v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lhb/c$l;->a:Lhb/c;

    invoke-static {v0, p1}, Lhb/c;->A(Lhb/c;Ltb/N$c;)V

    return-void
.end method

.method public final c()LYg/i;
    .locals 8

    new-instance v7, Lkotlin/jvm/internal/p;

    iget-object v2, p0, Lhb/c$l;->a:Lhb/c;

    const-string/jumbo v5, "onWebRtcStateChanged(Lcom/ui/unifi/core/base/net/webrtc/WebRtcConnection$State;)V"

    const/4 v6, 0x0

    const/4 v1, 0x1

    const-class v3, Lhb/c;

    const-string/jumbo v4, "onWebRtcStateChanged"

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/p;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-object v7
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Ltb/V$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    instance-of v0, p1, Lkotlin/jvm/internal/m;

    if-eqz v0, :cond_0

    invoke-interface {p0}, Lkotlin/jvm/internal/m;->c()LYg/i;

    move-result-object v0

    check-cast p1, Lkotlin/jvm/internal/m;

    invoke-interface {p1}, Lkotlin/jvm/internal/m;->c()LYg/i;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 1

    invoke-interface {p0}, Lkotlin/jvm/internal/m;->c()LYg/i;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
