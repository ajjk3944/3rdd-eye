.class public final Lz8/c$o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz8/c;->r0(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz8/c;

.field final synthetic b:I


# direct methods
.method public constructor <init>(Lz8/c;I)V
    .locals 0

    iput-object p1, p0, Lz8/c$o;->a:Lz8/c;

    iput p2, p0, Lz8/c$o;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 4

    :try_start_0
    invoke-static {}, LS8/c;->getEntries()Lfh/a;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LS8/c;

    iget-object v3, p0, Lz8/c$o;->a:Lz8/c;

    invoke-static {v3, v2}, Lz8/c;->C0(Lz8/c;LS8/c;)I

    move-result v2

    iget v3, p0, Lz8/c$o;->b:I

    if-ne v2, v3, :cond_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_0
    new-instance v0, Ll9/a;

    invoke-direct {v0, v1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-interface {p1, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
