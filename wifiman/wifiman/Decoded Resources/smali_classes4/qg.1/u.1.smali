.class public final Lqg/u;
.super Lgg/i;
.source "SourceFile"


# instance fields
.field final b:Lkg/q;


# direct methods
.method public constructor <init>(Lkg/q;)V
    .locals 0

    invoke-direct {p0}, Lgg/i;-><init>()V

    iput-object p1, p0, Lqg/u;->b:Lkg/q;

    return-void
.end method


# virtual methods
.method public E1(LDj/b;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lqg/u;->b:Lkg/q;

    invoke-interface {v0}, Lkg/q;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Callable returned a null Throwable."

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
    invoke-static {v0, p1}, Lyg/d;->error(Ljava/lang/Throwable;LDj/b;)V

    return-void
.end method
