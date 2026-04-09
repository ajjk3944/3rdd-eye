.class public LG/a;
.super LE0/m;
.source "SourceFile"

# interfaces
.implements LE0/s0;
.implements Lk0/b;


# instance fields
.field private p:Lmh/a;

.field private q:Z

.field private final r:Ly0/S;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lmh/a;)V
    .locals 1

    invoke-direct {p0}, LE0/m;-><init>()V

    iput-object p1, p0, LG/a;->p:Lmh/a;

    new-instance p1, LG/a$a;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, LG/a$a;-><init>(LG/a;Ldh/e;)V

    invoke-static {p1}, Ly0/P;->a(Lmh/p;)Ly0/S;

    move-result-object p1

    invoke-virtual {p0, p1}, LE0/m;->D2(LE0/j;)LE0/j;

    move-result-object p1

    check-cast p1, Ly0/S;

    iput-object p1, p0, LG/a;->r:Ly0/S;

    return-void
.end method

.method public static final synthetic J2(LG/a;)Z
    .locals 0

    iget-boolean p0, p0, LG/a;->q:Z

    return p0
.end method


# virtual methods
.method public C0()V
    .locals 1

    iget-object v0, p0, LG/a;->r:Ly0/S;

    invoke-interface {v0}, LE0/s0;->C0()V

    return-void
.end method

.method public J1(Lk0/l;)V
    .locals 0

    invoke-interface {p1}, Lk0/l;->isFocused()Z

    move-result p1

    iput-boolean p1, p0, LG/a;->q:Z

    return-void
.end method

.method public final K2()Lmh/a;
    .locals 1

    iget-object v0, p0, LG/a;->p:Lmh/a;

    return-object v0
.end method

.method public final L2(Lmh/a;)V
    .locals 0

    iput-object p1, p0, LG/a;->p:Lmh/a;

    return-void
.end method

.method public final Z1()V
    .locals 1

    iget-object v0, p0, LG/a;->r:Ly0/S;

    invoke-interface {v0}, Ly0/S;->Z1()V

    return-void
.end method

.method public s0(Ly0/n;Ly0/p;J)V
    .locals 1

    iget-object v0, p0, LG/a;->r:Ly0/S;

    invoke-interface {v0, p1, p2, p3, p4}, LE0/s0;->s0(Ly0/n;Ly0/p;J)V

    return-void
.end method
