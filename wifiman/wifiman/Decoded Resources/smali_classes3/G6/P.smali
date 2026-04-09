.class public LG6/P;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final a:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG6/P;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LG6/P;->a:Ljava/util/List;

    return-object v0
.end method

.method public b(Ljava/util/UUID;)Lgg/z;
    .locals 1

    new-instance v0, LG6/P$b;

    invoke-direct {v0, p0, p1}, LG6/P$b;-><init>(LG6/P;Ljava/util/UUID;)V

    invoke-static {v0}, Lgg/z;->x(Ljava/util/concurrent/Callable;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/util/UUID;)Lgg/z;
    .locals 2

    iget-object v0, p0, LG6/P;->a:Ljava/util/List;

    invoke-static {v0}, Lgg/s;->c0(Ljava/lang/Iterable;)Lgg/s;

    move-result-object v0

    new-instance v1, LG6/P$a;

    invoke-direct {v1, p0, p1}, LG6/P$a;-><init>(LG6/P;Ljava/util/UUID;)V

    invoke-virtual {v0, v1}, Lgg/s;->N(Lkg/p;)Lgg/s;

    move-result-object v0

    invoke-virtual {v0}, Lgg/s;->O()Lgg/n;

    move-result-object v0

    new-instance v1, Lcom/polidea/rxandroidble3/exceptions/BleServiceNotFoundException;

    invoke-direct {v1, p1}, Lcom/polidea/rxandroidble3/exceptions/BleServiceNotFoundException;-><init>(Ljava/util/UUID;)V

    invoke-static {v1}, Lgg/z;->p(Ljava/lang/Throwable;)Lgg/z;

    move-result-object p1

    invoke-virtual {v0, p1}, Lgg/n;->x(Lgg/D;)Lgg/z;

    move-result-object p1

    return-object p1
.end method
