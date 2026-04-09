.class LK6/Q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LK6/n;
.implements LK6/P;
.implements Lkg/f;


# instance fields
.field private a:Ljava/lang/Integer;

.field private final b:Lgg/s;

.field private final c:Lhg/g;


# direct methods
.method constructor <init>(LK6/l0;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lhg/g;

    invoke-direct {v0}, Lhg/g;-><init>()V

    iput-object v0, p0, LK6/Q;->c:Lhg/g;

    invoke-virtual {p1}, LK6/l0;->f()Lgg/s;

    move-result-object p1

    new-instance v0, LK6/Q$a;

    invoke-direct {v0, p0}, LK6/Q$a;-><init>(LK6/Q;)V

    invoke-virtual {p1, v0}, Lgg/s;->z0(Lkg/p;)Lgg/s;

    move-result-object p1

    iput-object p1, p0, LK6/Q;->b:Lgg/s;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, LK6/Q;->a:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, LK6/Q;->a:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, LK6/Q;->d(Ljava/lang/Integer;)V

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, LK6/Q;->c:Lhg/g;

    invoke-virtual {v0}, Lhg/g;->dispose()V

    return-void
.end method

.method public c()V
    .locals 3

    iget-object v0, p0, LK6/Q;->c:Lhg/g;

    iget-object v1, p0, LK6/Q;->b:Lgg/s;

    invoke-static {}, Lmg/a;->e()Lkg/f;

    move-result-object v2

    invoke-virtual {v1, p0, v2}, Lgg/s;->J0(Lkg/f;Lkg/f;)Lhg/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lhg/g;->a(Lhg/c;)Z

    return-void
.end method

.method public d(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, LK6/Q;->a:Ljava/lang/Integer;

    return-void
.end method
