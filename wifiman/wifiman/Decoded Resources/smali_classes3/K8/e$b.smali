.class final LK8/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK8/e;->D0()Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LK8/e;


# direct methods
.method constructor <init>(LK8/e;)V
    .locals 0

    iput-object p1, p0, LK8/e$b;->a:LK8/e;

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

    iget-object p1, p0, LK8/e$b;->a:LK8/e;

    invoke-static {p1}, LK8/e;->w0(LK8/e;)Li8/a;

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

    new-instance v0, LK8/e$b$a;

    invoke-direct {v0, p1}, LK8/e$b$a;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

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

    invoke-virtual {p0, p1}, LK8/e$b;->a(Ljava/lang/Throwable;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
