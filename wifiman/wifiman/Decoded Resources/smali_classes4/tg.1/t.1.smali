.class public final Ltg/t;
.super Lgg/s;
.source "SourceFile"


# instance fields
.field final a:Lkg/q;


# direct methods
.method public constructor <init>(Lkg/q;)V
    .locals 0

    invoke-direct {p0}, Lgg/s;-><init>()V

    iput-object p1, p0, Ltg/t;->a:Lkg/q;

    return-void
.end method


# virtual methods
.method public L0(Lgg/x;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Ltg/t;->a:Lkg/q;

    invoke-interface {v0}, Lkg/q;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Supplier returned a null Throwable."

    invoke-static {v0, v1}, Lzg/h;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    :goto_0
    invoke-static {v0, p1}, Llg/c;->error(Ljava/lang/Throwable;Lgg/x;)V

    return-void
.end method
