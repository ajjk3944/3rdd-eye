.class final LH8/q$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH8/q;->B0()V
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

    iput-object p1, p0, LH8/q$c;->a:LH8/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/teleport/session/TeleportSession$a;)Lgg/f;
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x1

    const-string/jumbo v2, "permissionState"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/session/TeleportSession$a;->a()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LH8/q$c;->a:LH8/q;

    invoke-static {p1}, LH8/q;->q0(LH8/q;)Lgg/b;

    move-result-object p1

    iget-object v2, p0, LH8/q$c;->a:LH8/q;

    invoke-static {v2}, LH8/q;->v0(LH8/q;)Li8/a;

    move-result-object v2

    new-array v3, v1, [Li8/a$b;

    sget-object v4, Li8/a$b$n;->a:Li8/a$b$n;

    aput-object v4, v3, v0

    invoke-interface {v2, v3}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Lgg/f;

    aput-object p1, v3, v0

    aput-object v2, v3, v1

    invoke-static {v3}, Lgg/b;->p([Lgg/f;)Lgg/b;

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

    check-cast p1, Lcom/ui/wifiman/model/teleport/session/TeleportSession$a;

    invoke-virtual {p0, p1}, LH8/q$c;->a(Lcom/ui/wifiman/model/teleport/session/TeleportSession$a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
