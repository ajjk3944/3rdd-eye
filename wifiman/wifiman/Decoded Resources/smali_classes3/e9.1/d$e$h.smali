.class public final Le9/d$e$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le9/d$e;->b(Le9/c$a;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Le9/d;

.field final synthetic b:Le9/c$a;


# direct methods
.method public constructor <init>(Le9/d;Le9/c$a;)V
    .locals 0

    iput-object p1, p0, Le9/d$e$h;->a:Le9/d;

    iput-object p2, p0, Le9/d$e$h;->b:Le9/c$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 3

    :try_start_0
    new-instance v0, Le9/d$e$a;

    iget-object v1, p0, Le9/d$e$h;->a:Le9/d;

    iget-object v2, p0, Le9/d$e$h;->b:Le9/c$a;

    invoke-direct {v0, v1, v2}, Le9/d$e$a;-><init>(Le9/d;Le9/c$a;)V

    invoke-static {v0}, Lf9/a;->b(Lmh/a;)V

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
