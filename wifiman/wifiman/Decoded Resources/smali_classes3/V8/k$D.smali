.class public final LV8/k$D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV8/k;-><init>(LG6/G;Lh9/a;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;LV8/e$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LG6/G;

.field final synthetic b:LV8/k;


# direct methods
.method public constructor <init>(LG6/G;LV8/k;)V
    .locals 0

    iput-object p1, p0, LV8/k$D;->a:LG6/G;

    iput-object p2, p0, LV8/k$D;->b:LV8/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, LV8/k$D;->a:LG6/G;

    iget-object v1, p0, LV8/k$D;->b:LV8/k;

    invoke-static {v1}, LV8/k;->o(LV8/k;)Lh9/a;

    move-result-object v1

    const-string v2, ":"

    invoke-virtual {v1, v2}, Lh9/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LG6/G;->b(Ljava/lang/String;)LG6/O;

    move-result-object v0

    invoke-interface {p1, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
