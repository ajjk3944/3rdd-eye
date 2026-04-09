.class public final Lre/g$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lre/g;->a()Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lre/g;


# direct methods
.method public constructor <init>(Lre/g;)V
    .locals 0

    iput-object p1, p0, Lre/g$i;->a:Lre/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lre/g$i;->a:Lre/g;

    invoke-static {v0}, Lre/g;->m(Lre/g;)LFg/a;

    move-result-object v0

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v1

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
