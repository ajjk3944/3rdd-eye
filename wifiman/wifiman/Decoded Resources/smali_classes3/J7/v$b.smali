.class public final LJ7/v$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ7/v;->a()Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LJ7/v;


# direct methods
.method public constructor <init>(LJ7/v;)V
    .locals 0

    iput-object p1, p0, LJ7/v$b;->a:LJ7/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 3

    :try_start_0
    new-instance v0, LJ7/F;

    iget-object v1, p0, LJ7/v$b;->a:LJ7/v;

    invoke-static {v1}, LJ7/v;->e(LJ7/v;)Lokhttp3/OkHttpClient;

    move-result-object v1

    iget-object v2, p0, LJ7/v$b;->a:LJ7/v;

    invoke-static {v2}, LJ7/v;->f(LJ7/v;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, LJ7/F;-><init>(Lokhttp3/OkHttpClient;Ljava/lang/String;)V

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
