.class public final Lld/c$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lld/c$e;->a(Lld/a;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lld/c;

.field final synthetic b:Lld/a;


# direct methods
.method public constructor <init>(Lld/c;Lld/a;)V
    .locals 0

    iput-object p1, p0, Lld/c$e$a;->a:Lld/c;

    iput-object p2, p0, Lld/c$e$a;->b:Lld/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lld/c$e$a;->a:Lld/c;

    invoke-static {v0}, Lld/c;->d(Lld/c;)LQ7/a;

    move-result-object v0

    iget-object v1, p0, Lld/c$e$a;->b:Lld/a;

    invoke-virtual {v1}, Lld/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, LQ7/a;->a(Ljava/lang/String;)V

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
