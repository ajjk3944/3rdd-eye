.class final LH8/d$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH8/d;->p0(Lcom/ui/wifiman/ui/teleport/consoles/h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LH8/d;


# direct methods
.method constructor <init>(LH8/d;)V
    .locals 0

    iput-object p1, p0, LH8/d$j;->a:LH8/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)Lgg/f;
    .locals 3

    const/4 v0, 0x1

    const-string/jumbo v1, "error"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$NoVpnProfile;

    if-eqz v1, :cond_0

    iget-object p1, p0, LH8/d$j;->a:LH8/d;

    invoke-static {p1}, LH8/d;->t0(LH8/d;)Li8/a;

    move-result-object p1

    new-instance v1, Li8/a$b$E$e;

    invoke-direct {v1, v0}, Li8/a$b$E$e;-><init>(Z)V

    new-array v0, v0, [Li8/a$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-interface {p1, v0}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;

    if-eqz v0, :cond_1

    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lgg/b;->D(Ljava/lang/Throwable;)Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LH8/d$j;->a(Ljava/lang/Throwable;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
