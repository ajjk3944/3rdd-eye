.class public final Ltg/b0;
.super Ltg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/b0$a;
    }
.end annotation


# instance fields
.field final b:Lkg/b;

.field final c:Lkg/q;


# direct methods
.method public constructor <init>(Lgg/v;Lkg/q;Lkg/b;)V
    .locals 0

    invoke-direct {p0, p1}, Ltg/a;-><init>(Lgg/v;)V

    iput-object p3, p0, Ltg/b0;->b:Lkg/b;

    iput-object p2, p0, Ltg/b0;->c:Lkg/q;

    return-void
.end method


# virtual methods
.method public L0(Lgg/x;)V
    .locals 4

    :try_start_0
    iget-object v0, p0, Ltg/b0;->c:Lkg/q;

    invoke-interface {v0}, Lkg/q;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "The seed supplied is null"

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Ltg/a;->a:Lgg/v;

    new-instance v2, Ltg/b0$a;

    iget-object v3, p0, Ltg/b0;->b:Lkg/b;

    invoke-direct {v2, p1, v3, v0}, Ltg/b0$a;-><init>(Lgg/x;Lkg/b;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Lgg/v;->d(Lgg/x;)V

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {v0, p1}, Llg/c;->error(Ljava/lang/Throwable;Lgg/x;)V

    return-void
.end method
