.class public final Lug/b;
.super Lgg/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lug/b$a;
    }
.end annotation


# instance fields
.field final a:Lgg/C;


# direct methods
.method public constructor <init>(Lgg/C;)V
    .locals 0

    invoke-direct {p0}, Lgg/z;-><init>()V

    iput-object p1, p0, Lug/b;->a:Lgg/C;

    return-void
.end method


# virtual methods
.method protected N(Lgg/B;)V
    .locals 1

    new-instance v0, Lug/b$a;

    invoke-direct {v0, p1}, Lug/b$a;-><init>(Lgg/B;)V

    invoke-interface {p1, v0}, Lgg/B;->c(Lhg/c;)V

    :try_start_0
    iget-object p1, p0, Lug/b;->a:Lgg/C;

    invoke-interface {p1, v0}, Lgg/C;->a(Lgg/A;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-virtual {v0, p1}, Lug/b$a;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
