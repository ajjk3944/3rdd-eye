.class LK6/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LK6/B;


# instance fields
.field private final a:LJ5/b;

.field private final b:Lgg/s;

.field private final c:Lgg/s;


# direct methods
.method constructor <init>(Ljava/lang/String;LP6/G;Lgg/s;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LJ5/b;->l1()LJ5/b;

    move-result-object v0

    iput-object v0, p0, LK6/A;->a:LJ5/b;

    invoke-static {p2, p3}, LK6/A;->c(LP6/G;Lgg/s;)Lgg/s;

    move-result-object p2

    new-instance p3, LK6/A$c;

    invoke-direct {p3, p0, p1}, LK6/A$c;-><init>(LK6/A;Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Lgg/s;->i0(Lkg/n;)Lgg/s;

    move-result-object p1

    new-instance p2, LK6/A$b;

    invoke-direct {p2, p0}, LK6/A$b;-><init>(LK6/A;)V

    invoke-virtual {p1, p2}, Lgg/s;->F(Lkg/f;)Lgg/s;

    move-result-object p1

    new-instance p2, LK6/A$a;

    invoke-direct {p2, p0}, LK6/A$a;-><init>(LK6/A;)V

    invoke-virtual {p1, v0, p2}, Lgg/s;->J0(Lkg/f;Lkg/f;)Lhg/c;

    move-result-object p1

    invoke-virtual {v0}, Lgg/s;->O()Lgg/n;

    move-result-object p2

    invoke-virtual {p2}, Lgg/n;->B()Lgg/s;

    move-result-object p2

    new-instance p3, LK6/A$d;

    invoke-direct {p3, p0, p1}, LK6/A$d;-><init>(LK6/A;Lhg/c;)V

    invoke-virtual {p2, p3}, Lgg/s;->H(Lkg/a;)Lgg/s;

    move-result-object p1

    invoke-virtual {p1}, Lgg/s;->w0()LBg/a;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, LBg/a;->i1(I)Lgg/s;

    move-result-object p1

    iput-object p1, p0, LK6/A;->b:Lgg/s;

    new-instance p2, LK6/A$e;

    invoke-direct {p2, p0}, LK6/A$e;-><init>(LK6/A;)V

    invoke-virtual {p1, p2}, Lgg/s;->Q(Lkg/n;)Lgg/s;

    move-result-object p1

    iput-object p1, p0, LK6/A;->c:Lgg/s;

    return-void
.end method

.method private static c(LP6/G;Lgg/s;)Lgg/s;
    .locals 1

    new-instance v0, LK6/A$g;

    invoke-direct {v0}, LK6/A$g;-><init>()V

    invoke-virtual {p1, v0}, Lgg/s;->i0(Lkg/n;)Lgg/s;

    move-result-object p1

    invoke-virtual {p0}, LP6/G;->c()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {p1, p0}, Lgg/s;->I0(Ljava/lang/Object;)Lgg/s;

    move-result-object p0

    new-instance p1, LK6/A$f;

    invoke-direct {p1}, LK6/A$f;-><init>()V

    invoke-virtual {p0, p1}, Lgg/s;->N(Lkg/p;)Lgg/s;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Lgg/s;
    .locals 1

    iget-object v0, p0, LK6/A;->b:Lgg/s;

    return-object v0
.end method

.method public b()Lgg/s;
    .locals 1

    iget-object v0, p0, LK6/A;->c:Lgg/s;

    return-object v0
.end method

.method public d(Lcom/polidea/rxandroidble3/exceptions/BleDisconnectedException;)V
    .locals 1

    iget-object v0, p0, LK6/A;->a:LJ5/b;

    invoke-virtual {v0, p1}, LJ5/b;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public e(Lcom/polidea/rxandroidble3/exceptions/BleGattException;)V
    .locals 1

    iget-object v0, p0, LK6/A;->a:LJ5/b;

    invoke-virtual {v0, p1}, LJ5/b;->accept(Ljava/lang/Object;)V

    return-void
.end method
