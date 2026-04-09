.class public final Lre/g$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lre/g;->g(Ljava/util/Set;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lre/g;

.field final synthetic b:Ljava/util/Set;


# direct methods
.method public constructor <init>(Lre/g;Ljava/util/Set;)V
    .locals 0

    iput-object p1, p0, Lre/g$j;->a:Lre/g;

    iput-object p2, p0, Lre/g$j;->b:Ljava/util/Set;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lre/g$j;->a:Lre/g;

    invoke-static {v0}, Lre/g;->m(Lre/g;)LFg/a;

    move-result-object v0

    iget-object v1, p0, Lre/g$j;->b:Ljava/util/Set;

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
