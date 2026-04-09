.class public final LE8/k$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/k;-><init>(Lgg/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LE8/k;


# direct methods
.method public constructor <init>(LE8/k;)V
    .locals 0

    iput-object p1, p0, LE8/k$e;->a:LE8/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 8

    :try_start_0
    new-instance v7, LE8/k$a;

    iget-object v1, p0, LE8/k$e;->a:LE8/k;

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, LE8/k$a;-><init>(LE8/k;IILmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v0, Lm9/c;->a:Lm9/c;

    const-string/jumbo v1, "SpeedtestChart"

    invoke-virtual {v0, v1}, Lm9/c;->h(Ljava/lang/String;)Lgg/y;

    move-result-object v0

    invoke-static {v7, v0}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v0

    invoke-interface {p1, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
