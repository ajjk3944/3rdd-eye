.class public final Ltd/c$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltd/c;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ltd/c;


# direct methods
.method public constructor <init>(Ltd/c;)V
    .locals 0

    iput-object p1, p0, Ltd/c$d;->a:Ltd/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Ltd/c$d;->a:Ltd/c;

    invoke-virtual {v0}, Ltd/c;->e()Lgg/z;

    move-result-object v0

    new-instance v1, Ltd/c$e;

    iget-object v2, p0, Ltd/c$d;->a:Ltd/c;

    invoke-direct {v1, v2}, Ltd/c$e;-><init>(Ltd/c;)V

    invoke-virtual {v0, v1}, Lgg/z;->w(Lkg/n;)Lgg/i;

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
