.class public final LM8/d$u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/d;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LM8/d;


# direct methods
.method public constructor <init>(LM8/d;)V
    .locals 0

    iput-object p1, p0, LM8/d$u;->a:LM8/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/j;)V
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, LM8/d$u;->a:LM8/d;

    invoke-static {v0}, LM8/d;->w0(LM8/d;)Lcom/ui/wifiman/ui/wifi/channel/b;

    move-result-object v0

    invoke-interface {p1, v0}, Lgg/h;->h(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/h;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
