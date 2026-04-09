.class final LI7/P$w;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/P;->q0(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LI7/P;


# direct methods
.method constructor <init>(LI7/P;)V
    .locals 0

    iput-object p1, p0, LI7/P$w;->a:LI7/P;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lhg/c;)V
    .locals 1

    iget-object p1, p0, LI7/P$w;->a:LI7/P;

    invoke-static {p1}, LI7/P;->I(LI7/P;)LFg/a;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lhg/c;

    invoke-virtual {p0, p1}, LI7/P$w;->a(Lhg/c;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
