.class public final LYb/c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYb/c;->c(LYb/b;LYb/a;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LYb/a;

.field final synthetic b:LYb/b;


# direct methods
.method public constructor <init>(LYb/a;LYb/b;)V
    .locals 0

    iput-object p1, p0, LYb/c$c;->a:LYb/a;

    iput-object p2, p0, LYb/c$c;->b:LYb/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, LYb/c$c;->a:LYb/a;

    if-eqz v0, :cond_0

    iget-object v1, p0, LYb/c$c;->b:LYb/b;

    invoke-interface {v1, v0}, LYb/b;->a(LYb/a;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-interface {p1}, Lgg/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
