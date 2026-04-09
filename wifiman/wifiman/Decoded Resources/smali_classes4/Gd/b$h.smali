.class final LGd/b$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LGd/b;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LGd/b;


# direct methods
.method constructor <init>(LGd/b;)V
    .locals 0

    iput-object p1, p0, LGd/b$h;->a:LGd/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/y;)Lcom/ui/wifiman/quicksettings/a$a;
    .locals 4

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/y;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/teleport/TeleportConnection$a;

    invoke-virtual {p1}, LYg/y;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LFd/s$a;

    invoke-virtual {p1}, LYg/y;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LId/h$a;

    instance-of v2, v1, LFd/s$a$a$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, LFd/s$a$a$a;

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_1

    invoke-virtual {v2}, LFd/s$a$a$a;->a()Z

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_1

    new-instance p1, Lcom/ui/wifiman/quicksettings/a$a$d;

    sget v0, Ljc/d;->k:I

    invoke-direct {p1, v0}, Lcom/ui/wifiman/quicksettings/a$a$d;-><init>(I)V

    goto :goto_2

    :cond_1
    instance-of v2, p1, LId/h$a$c;

    if-nez v2, :cond_3

    instance-of v2, v1, LFd/s$a$c;

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object p1, p0, LGd/b$h;->a:LGd/b;

    invoke-static {p1, v0}, LGd/b;->g(LGd/b;Lcom/ui/wifiman/model/teleport/TeleportConnection$a;)Lcom/ui/wifiman/quicksettings/a$a;

    move-result-object p1

    goto :goto_2

    :cond_3
    :goto_1
    iget-object v0, p0, LGd/b$h;->a:LGd/b;

    invoke-static {v0, v1, p1}, LGd/b;->f(LGd/b;LFd/s$a;LId/h$a;)I

    move-result p1

    new-instance v0, Lcom/ui/wifiman/quicksettings/a$a$d;

    invoke-direct {v0, p1}, Lcom/ui/wifiman/quicksettings/a$a$d;-><init>(I)V

    move-object p1, v0

    :goto_2
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/y;

    invoke-virtual {p0, p1}, LGd/b$h;->a(LYg/y;)Lcom/ui/wifiman/quicksettings/a$a;

    move-result-object p1

    return-object p1
.end method
