.class public final LE8/x$q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/x;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LE8/x;


# direct methods
.method public constructor <init>(LE8/x;)V
    .locals 0

    iput-object p1, p0, LE8/x$q;->a:LE8/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/j;)V
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, LE8/x$q;->a:LE8/x;

    invoke-static {v0}, LE8/x;->A0(LE8/x;)Lnf/e;

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
