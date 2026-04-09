.class final LC/b;
.super LC/C;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LC/b$c;
    }
.end annotation


# static fields
.field public static final L:LC/b$c;

.field private static final M:Lc0/k;


# instance fields
.field private K:LT/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LC/b$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LC/b$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LC/b;->L:LC/b$c;

    sget-object v0, LC/b$a;->a:LC/b$a;

    sget-object v1, LC/b$b;->a:LC/b$b;

    invoke-static {v0, v1}, Lc0/a;->a(Lmh/p;Lmh/l;)Lc0/k;

    move-result-object v0

    sput-object v0, LC/b;->M:Lc0/k;

    return-void
.end method

.method public constructor <init>(IFLmh/a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LC/C;-><init>(IF)V

    const/4 p1, 0x0

    const/4 p2, 0x2

    invoke-static {p3, p1, p2, p1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LC/b;->K:LT/q0;

    return-void
.end method

.method public static final synthetic l0()Lc0/k;
    .locals 1

    sget-object v0, LC/b;->M:Lc0/k;

    return-object v0
.end method


# virtual methods
.method public F()I
    .locals 1

    iget-object v0, p0, LC/b;->K:LT/q0;

    invoke-interface {v0}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmh/a;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method

.method public final m0()LT/q0;
    .locals 1

    iget-object v0, p0, LC/b;->K:LT/q0;

    return-object v0
.end method
