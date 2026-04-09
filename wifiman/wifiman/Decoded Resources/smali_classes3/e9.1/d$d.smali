.class public final Le9/d$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le9/d;->e(Le9/a;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Le9/d;

.field final synthetic b:Le9/a;


# direct methods
.method public constructor <init>(Le9/d;Le9/a;)V
    .locals 0

    iput-object p1, p0, Le9/d$d;->a:Le9/d;

    iput-object p2, p0, Le9/d$d;->b:Le9/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Le9/d$d;->a:Le9/d;

    invoke-static {v0}, Le9/d;->a(Le9/d;)Le9/c;

    move-result-object v0

    iget-object v1, p0, Le9/d$d;->b:Le9/a;

    invoke-interface {v0, v1}, Le9/c;->b(Le9/a;)Le9/c$a;

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
