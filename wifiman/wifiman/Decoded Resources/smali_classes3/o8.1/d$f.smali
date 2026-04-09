.class public final Lo8/d$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo8/d;->a(Ljava/lang/String;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo8/d;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lo8/d;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lo8/d$f;->a:Lo8/d;

    iput-object p2, p0, Lo8/d$f;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lo8/d$f;->a:Lo8/d;

    invoke-static {v0}, Lo8/d;->j(Lo8/d;)LFg/a;

    move-result-object v0

    new-instance v1, Ll9/a;

    new-instance v2, Lo8/d$b$b;

    iget-object v3, p0, Lo8/d$f;->b:Ljava/lang/String;

    invoke-direct {v2, v3}, Lo8/d$b$b;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Ll9/a;-><init>(Ljava/lang/Object;)V

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
