.class public final LD8/s$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/s;->d(LS8/c;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LD8/s;

.field final synthetic b:LS8/c;


# direct methods
.method public constructor <init>(LD8/s;LS8/c;)V
    .locals 0

    iput-object p1, p0, LD8/s$d;->a:LD8/s;

    iput-object p2, p0, LD8/s$d;->b:LS8/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, LD8/s$d;->a:LD8/s;

    invoke-static {v0}, LD8/s;->o(LD8/s;)LFg/a;

    move-result-object v0

    iget-object v1, p0, LD8/s$d;->b:LS8/c;

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
