.class public final LP8/c$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP8/c;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LP8/c;


# direct methods
.method public constructor <init>(LP8/c;)V
    .locals 0

    iput-object p1, p0, LP8/c$d;->a:LP8/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, LP8/c$d;->a:LP8/c;

    invoke-static {v0}, LP8/c;->p0(LP8/c;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lua/a$a;->a(Ljava/lang/String;)Lua/a$a;

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
