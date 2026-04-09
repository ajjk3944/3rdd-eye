.class public final LP8/g$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP8/g;->b(LP8/f$a;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LP8/g;

.field final synthetic b:LP8/f$a;


# direct methods
.method public constructor <init>(LP8/g;LP8/f$a;)V
    .locals 0

    iput-object p1, p0, LP8/g$i;->a:LP8/g;

    iput-object p2, p0, LP8/g$i;->b:LP8/f$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, LP8/g$i;->a:LP8/g;

    invoke-static {v0}, LP8/g;->j(LP8/g;)LFg/a;

    move-result-object v0

    iget-object v1, p0, LP8/g$i;->b:LP8/f$a;

    invoke-virtual {v0, v1}, LFg/a;->h(Ljava/lang/Object;)V

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
