.class public final Ln8/j$i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln8/j$i;->a(Ll9/a;)Lgg/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LCc/a;


# direct methods
.method public constructor <init>(LCc/a;)V
    .locals 0

    iput-object p1, p0, Ln8/j$i$a;->a:LCc/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/o;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Ln8/j$i$a;->a:LCc/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LCc/a;->f()Lxa/a$d;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, LLd/d;->a(Lxa/a$d;)Le8/a;

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
