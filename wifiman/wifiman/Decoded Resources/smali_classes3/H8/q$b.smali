.class final LH8/q$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH8/q;->w0()Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LH8/q;


# direct methods
.method constructor <init>(LH8/q;)V
    .locals 0

    iput-object p1, p0, LH8/q$b;->a:LH8/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/ui/teleport/L;)Lgg/f;
    .locals 3

    const-string/jumbo v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wifiman/ui/teleport/L;->a()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LH8/q$b;->a:LH8/q;

    invoke-static {p1}, LH8/q;->s0(LH8/q;)Lcom/ui/wifiman/model/teleport/TeleportConnection;

    move-result-object p1

    invoke-interface {p1}, Lcom/ui/wifiman/model/teleport/TeleportConnection;->connect()Lgg/b;

    move-result-object p1

    const-wide/16 v0, 0xc8

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v0, v1, v2}, Lgg/b;->a0(JLjava/util/concurrent/TimeUnit;)Lgg/b;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/b;->X(Lgg/f;)Lgg/b;

    move-result-object p1

    sget-object v0, LH8/q$b$a;->a:LH8/q$b$a;

    invoke-virtual {p1, v0}, Lgg/b;->O(Lkg/n;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/ui/teleport/L;

    invoke-virtual {p0, p1}, LH8/q$b;->a(Lcom/ui/wifiman/ui/teleport/L;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
