.class public final LSd/c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSd/c;->a(Ljava/lang/String;Ljava/util/Set;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LSd/c;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/util/Set;


# direct methods
.method public constructor <init>(LSd/c;Ljava/lang/String;Ljava/util/Set;)V
    .locals 0

    iput-object p1, p0, LSd/c$c;->a:LSd/c;

    iput-object p2, p0, LSd/c$c;->b:Ljava/lang/String;

    iput-object p3, p0, LSd/c$c;->c:Ljava/util/Set;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 6

    :try_start_0
    iget-object v0, p0, LSd/c$c;->a:LSd/c;

    invoke-static {v0}, LSd/c;->d(LSd/c;)LNb/a;

    move-result-object v0

    iget-object v1, p0, LSd/c$c;->b:Ljava/lang/String;

    iget-object v2, p0, LSd/c$c;->c:Ljava/util/Set;

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/security/cert/X509Certificate;

    iget-object v5, p0, LSd/c$c;->a:LSd/c;

    invoke-virtual {v5, v4}, LSd/c;->f(Ljava/security/cert/X509Certificate;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    new-instance v2, LNb/c;

    const/4 v4, 0x1

    invoke-direct {v2, v1, v4, v3}, LNb/c;-><init>(Ljava/lang/String;ZLjava/util/List;)V

    invoke-virtual {v0, v2}, LNb/a;->a(LNb/c;)V

    invoke-interface {p1}, Lgg/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
