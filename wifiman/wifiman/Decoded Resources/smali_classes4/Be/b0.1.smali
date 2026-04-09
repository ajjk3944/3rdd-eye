.class public final LBe/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lmh/l;

.field private final b:LT/q0;

.field private final c:LT/q0;

.field private final d:LT/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ZZLR0/Q;Lmh/l;)V
    .locals 1

    const-string v0, "query"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onQueryChanged"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, LBe/b0;->a:Lmh/l;

    if-nez p1, :cond_1

    invoke-virtual {p3}, LR0/Q;->i()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-lez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 p4, 0x0

    const/4 v0, 0x2

    invoke-static {p1, p4, v0, p4}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LBe/b0;->b:LT/q0;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1, p4, v0, p4}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LBe/b0;->c:LT/q0;

    invoke-static {p3, p4, v0, p4}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LBe/b0;->d:LT/q0;

    return-void
.end method


# virtual methods
.method public final a()LT/q0;
    .locals 1

    iget-object v0, p0, LBe/b0;->c:LT/q0;

    return-object v0
.end method

.method public final b()LT/q0;
    .locals 1

    iget-object v0, p0, LBe/b0;->d:LT/q0;

    return-object v0
.end method

.method public final c()LT/q0;
    .locals 1

    iget-object v0, p0, LBe/b0;->b:LT/q0;

    return-object v0
.end method

.method public final d()V
    .locals 9

    iget-object v0, p0, LBe/b0;->b:LT/q0;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, LT/q0;->setValue(Ljava/lang/Object;)V

    new-instance v0, LR0/Q;

    const/4 v7, 0x6

    const/4 v8, 0x0

    const-string v3, ""

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, LR0/Q;-><init>(Ljava/lang/String;JLL0/S;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, v0}, LBe/b0;->f(LR0/Q;)V

    return-void
.end method

.method public final e()V
    .locals 2

    iget-object v0, p0, LBe/b0;->b:LT/q0;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final f(LR0/Q;)V
    .locals 1

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LBe/b0;->d:LT/q0;

    invoke-interface {v0}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LBe/b0;->d:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    iget-object v0, p0, LBe/b0;->a:Lmh/l;

    invoke-virtual {p1}, LR0/Q;->i()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
