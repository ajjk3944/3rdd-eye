.class final LH8/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH8/b;->o0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LH8/b;


# direct methods
.method constructor <init>(LH8/b;)V
    .locals 0

    iput-object p1, p0, LH8/b$a;->a:LH8/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/teleport/n;)Lgg/f;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LH8/b$a;->a:LH8/b;

    invoke-static {v0}, LH8/b;->r0(LH8/b;)LFd/D;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/n;->a()LKd/a;

    move-result-object p1

    invoke-virtual {p1}, LKd/a;->c()LKd/a$a;

    move-result-object p1

    invoke-virtual {p1}, LKd/a$a;->b()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, LFd/D;->g(Ljava/lang/String;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/teleport/n;

    invoke-virtual {p0, p1}, LH8/b$a;->a(Lcom/ui/wifiman/model/teleport/n;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
