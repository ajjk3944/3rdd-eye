.class public final Lmd/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmd/c;->i(Lmd/a;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmd/a;

.field final synthetic b:Lmd/c;


# direct methods
.method public constructor <init>(Lmd/a;Lmd/c;)V
    .locals 0

    iput-object p1, p0, Lmd/c$a;->a:Lmd/a;

    iput-object p2, p0, Lmd/c$a;->b:Lmd/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lmd/c$a;->a:Lmd/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AppSettings: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v0, p0, Lmd/c$a;->b:Lmd/c;

    invoke-static {v0}, Lmd/c;->h(Lmd/c;)Lcom/ui/wifiman/model/support/a;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/support/a$a$a;

    iget-object v2, p0, Lmd/c$a;->a:Lmd/a;

    invoke-direct {v1, v2}, Lcom/ui/wifiman/model/support/a$a$a;-><init>(Lmd/a;)V

    invoke-interface {v0, v1}, Lcom/ui/wifiman/model/support/a;->b(Lcom/ui/wifiman/model/support/a$a;)V

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
