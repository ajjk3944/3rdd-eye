.class final Ltb/N$i;
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

    iput-object p1, p0, Ltb/N$i;->a:Ltb/N;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 3

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LSj/a;->a:LSj/a$b;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string/jumbo v2, "sendWebRtcOffer failed"

    invoke-virtual {v0, p1, v2, v1}, LSj/a$b;->p(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Ltb/N$i;->a:Ltb/N;

    invoke-static {v0}, Ltb/N;->y(Ltb/N;)Lgg/t;

    move-result-object v0

    if-nez v0, :cond_0

    const-string/jumbo v0, "stateEmitter"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-interface {v0, p1}, Lgg/t;->c(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Ltb/N$i;->a(Ljava/lang/Throwable;)V

    return-void
.end method
