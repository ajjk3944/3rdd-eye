.class public final LP8/c$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP8/c$b;->a(Ll9/a;)Lgg/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lxa/a$d;

.field final synthetic b:LP8/c;


# direct methods
.method public constructor <init>(Lxa/a$d;LP8/c;)V
    .locals 0

    iput-object p1, p0, LP8/c$b$a;->a:Lxa/a$d;

    iput-object p2, p0, LP8/c$b$a;->b:LP8/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/o;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, LP8/c$b$a;->a:Lxa/a$d;

    if-eqz v0, :cond_0

    iget-object v1, p0, LP8/c$b$a;->b:LP8/c;

    invoke-static {v1, v0}, LP8/c;->n0(LP8/c;Lua/a;)LCe/a;

    move-result-object v0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {p1, v0}, Lgg/o;->onSuccess(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    invoke-interface {p1}, Lgg/o;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-interface {p1, v0}, Lgg/o;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
