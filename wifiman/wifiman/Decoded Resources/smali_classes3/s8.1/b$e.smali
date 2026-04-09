.class public final Ls8/b$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls8/b;->o0(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ls8/b;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ls8/b;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ls8/b$e;->a:Ls8/b;

    iput-object p2, p0, Ls8/b$e;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Ls8/b$e;->a:Ls8/b;

    invoke-static {v0}, Ls8/b;->q0(Ls8/b;)LFg/c;

    move-result-object v0

    new-instance v1, Ls8/b$a$b;

    iget-object v2, p0, Ls8/b$e;->b:Ljava/lang/String;

    invoke-direct {v1, v2}, Ls8/b$a$b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LFg/c;->h(Ljava/lang/Object;)V

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
