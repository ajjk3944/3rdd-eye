.class public final LL0/K;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LP0/b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LP0/b;

    invoke-direct {v0, p1}, LP0/b;-><init>(I)V

    iput-object v0, p0, LL0/K;->a:LP0/b;

    return-void
.end method


# virtual methods
.method public final a(LL0/L;)LL0/M;
    .locals 2

    iget-object v0, p0, LL0/K;->a:LP0/b;

    new-instance v1, LL0/g;

    invoke-direct {v1, p1}, LL0/g;-><init>(LL0/L;)V

    invoke-virtual {v0, v1}, LP0/b;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LL0/M;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p1}, LL0/M;->w()LL0/k;

    move-result-object v1

    invoke-virtual {v1}, LL0/k;->j()LL0/l;

    move-result-object v1

    invoke-virtual {v1}, LL0/l;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    :cond_1
    return-object p1
.end method

.method public final b(LL0/L;LL0/M;)LL0/M;
    .locals 2

    iget-object v0, p0, LL0/K;->a:LP0/b;

    new-instance v1, LL0/g;

    invoke-direct {v1, p1}, LL0/g;-><init>(LL0/L;)V

    invoke-virtual {v0, v1, p2}, LP0/b;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LL0/M;

    return-object p1
.end method
