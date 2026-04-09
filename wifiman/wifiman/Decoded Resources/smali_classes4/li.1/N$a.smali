.class public final Lli/N$a;
.super Lli/N;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lli/N;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final d:LUh/c;

.field private final e:Lli/N$a;

.field private final f:LZh/b;

.field private final g:LUh/c$c;

.field private final h:Z

.field private final i:Z


# direct methods
.method public constructor <init>(LUh/c;LWh/c;LWh/g;LBh/g0;Lli/N$a;)V
    .locals 1

    const-string v0, "classProto"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeTable"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p2, p3, p4, v0}, Lli/N;-><init>(LWh/c;LWh/g;LBh/g0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lli/N$a;->d:LUh/c;

    iput-object p5, p0, Lli/N$a;->e:Lli/N$a;

    invoke-virtual {p1}, LUh/c;->O1()I

    move-result p3

    invoke-static {p2, p3}, Lli/L;->a(LWh/c;I)LZh/b;

    move-result-object p2

    iput-object p2, p0, Lli/N$a;->f:LZh/b;

    sget-object p2, LWh/b;->f:LWh/b$d;

    invoke-virtual {p1}, LUh/c;->N1()I

    move-result p3

    invoke-virtual {p2, p3}, LWh/b$d;->d(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LUh/c$c;

    if-nez p2, :cond_0

    sget-object p2, LUh/c$c;->CLASS:LUh/c$c;

    :cond_0
    iput-object p2, p0, Lli/N$a;->g:LUh/c$c;

    sget-object p2, LWh/b;->g:LWh/b$b;

    invoke-virtual {p1}, LUh/c;->N1()I

    move-result p3

    invoke-virtual {p2, p3}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object p2

    const-string p3, "get(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    iput-boolean p2, p0, Lli/N$a;->h:Z

    sget-object p2, LWh/b;->h:LWh/b$b;

    invoke-virtual {p1}, LUh/c;->N1()I

    move-result p1

    invoke-virtual {p2, p1}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lli/N$a;->i:Z

    return-void
.end method


# virtual methods
.method public a()LZh/c;
    .locals 1

    iget-object v0, p0, Lli/N$a;->f:LZh/b;

    invoke-virtual {v0}, LZh/b;->a()LZh/c;

    move-result-object v0

    return-object v0
.end method

.method public final e()LZh/b;
    .locals 1

    iget-object v0, p0, Lli/N$a;->f:LZh/b;

    return-object v0
.end method

.method public final f()LUh/c;
    .locals 1

    iget-object v0, p0, Lli/N$a;->d:LUh/c;

    return-object v0
.end method

.method public final g()LUh/c$c;
    .locals 1

    iget-object v0, p0, Lli/N$a;->g:LUh/c$c;

    return-object v0
.end method

.method public final h()Lli/N$a;
    .locals 1

    iget-object v0, p0, Lli/N$a;->e:Lli/N$a;

    return-object v0
.end method

.method public final i()Z
    .locals 1

    iget-boolean v0, p0, Lli/N$a;->h:Z

    return v0
.end method
