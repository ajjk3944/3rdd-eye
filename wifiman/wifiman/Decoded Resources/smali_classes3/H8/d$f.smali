.class public final LH8/d$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH8/d;->w0()Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LH8/d;


# direct methods
.method public constructor <init>(LH8/d;)V
    .locals 0

    iput-object p1, p0, LH8/d$f;->a:LH8/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, LH8/d$f;->a:LH8/d;

    invoke-virtual {v0}, LH8/d;->C0()LLi/y;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/ui/teleport/consoles/i$a$a;->a:Lcom/ui/wifiman/ui/teleport/consoles/i$a$a;

    invoke-interface {v0, v1}, LLi/y;->j(Ljava/lang/Object;)Z

    invoke-interface {p1}, Lgg/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
