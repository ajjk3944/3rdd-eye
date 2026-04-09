.class public final Lcom/ui/wmw/wifi/b$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wmw/wifi/b;->c(Ljava/util/Set;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wmw/wifi/b;

.field final synthetic b:Ljava/util/Set;


# direct methods
.method public constructor <init>(Lcom/ui/wmw/wifi/b;Ljava/util/Set;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wmw/wifi/b$g;->a:Lcom/ui/wmw/wifi/b;

    iput-object p2, p0, Lcom/ui/wmw/wifi/b$g;->b:Ljava/util/Set;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/ui/wmw/wifi/b$g;->a:Lcom/ui/wmw/wifi/b;

    invoke-static {v0}, Lcom/ui/wmw/wifi/b;->h(Lcom/ui/wmw/wifi/b;)LFg/a;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wmw/wifi/b$g;->b:Ljava/util/Set;

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
