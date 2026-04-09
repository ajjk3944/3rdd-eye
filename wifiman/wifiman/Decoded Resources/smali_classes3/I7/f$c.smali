.class final LI7/f$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/f;->c(Lmh/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/l;


# direct methods
.method constructor <init>(Lmh/l;)V
    .locals 0

    iput-object p1, p0, LI7/f$c;->a:Lmh/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    instance-of v0, p1, Lcom/ubnt/teleport/TeleportTunnel$Error;

    const-string/jumbo v1, "it"

    if-eqz v0, :cond_0

    sget-object v0, LI7/f$c$a;->a:LI7/f$c$a;

    invoke-static {v0, p1}, LN7/a;->c(Lmh/a;Ljava/lang/Throwable;)V

    iget-object v0, p0, LI7/f$c;->a:Lmh/l;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LI7/f$c;->a(Ljava/lang/Throwable;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
