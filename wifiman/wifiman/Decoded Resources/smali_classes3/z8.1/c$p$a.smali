.class public final Lz8/c$p$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz8/c$p;->a(Ll9/a;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz8/c;

.field final synthetic b:Ll9/a;


# direct methods
.method public constructor <init>(Lz8/c;Ll9/a;)V
    .locals 0

    iput-object p1, p0, Lz8/c$p$a;->a:Lz8/c;

    iput-object p2, p0, Lz8/c$p$a;->b:Ll9/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lz8/c$p$a;->a:Lz8/c;

    invoke-static {v0}, Lz8/c;->B0(Lz8/c;)LFg/a;

    move-result-object v0

    iget-object v1, p0, Lz8/c$p$a;->b:Ll9/a;

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
