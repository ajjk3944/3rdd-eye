.class final LG6/A$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LK6/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LG6/A;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation


# instance fields
.field private final a:LG6/A$c;

.field private final b:LG6/A$g;

.field private c:Ljava/lang/Boolean;

.field private d:Ljava/lang/Boolean;

.field private e:LG6/S;


# direct methods
.method private constructor <init>(LG6/A$c;LG6/A$g;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LG6/A$d;->a:LG6/A$c;

    .line 4
    iput-object p2, p0, LG6/A$d;->b:LG6/A$g;

    return-void
.end method

.method synthetic constructor <init>(LG6/A$c;LG6/A$g;LG6/A$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LG6/A$d;-><init>(LG6/A$c;LG6/A$g;)V

    return-void
.end method


# virtual methods
.method public a()LK6/c;
    .locals 9

    iget-object v0, p0, LG6/A$d;->c:Ljava/lang/Boolean;

    const-class v1, Ljava/lang/Boolean;

    invoke-static {v0, v1}, Ly2/e;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, LG6/A$d;->d:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Ly2/e;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, LG6/A$d;->e:LG6/S;

    const-class v1, LG6/S;

    invoke-static {v0, v1}, Ly2/e;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, LG6/A$e;

    iget-object v3, p0, LG6/A$d;->a:LG6/A$c;

    iget-object v4, p0, LG6/A$d;->b:LG6/A$g;

    iget-object v5, p0, LG6/A$d;->c:Ljava/lang/Boolean;

    iget-object v6, p0, LG6/A$d;->d:Ljava/lang/Boolean;

    iget-object v7, p0, LG6/A$d;->e:LG6/S;

    const/4 v8, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, LG6/A$e;-><init>(LG6/A$c;LG6/A$g;Ljava/lang/Boolean;Ljava/lang/Boolean;LG6/S;LG6/A$a;)V

    return-object v0
.end method

.method public bridge synthetic b(Z)LK6/c$a;
    .locals 0

    invoke-virtual {p0, p1}, LG6/A$d;->e(Z)LG6/A$d;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(Z)LK6/c$a;
    .locals 0

    invoke-virtual {p0, p1}, LG6/A$d;->g(Z)LG6/A$d;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(LG6/S;)LK6/c$a;
    .locals 0

    invoke-virtual {p0, p1}, LG6/A$d;->f(LG6/S;)LG6/A$d;

    move-result-object p1

    return-object p1
.end method

.method public e(Z)LG6/A$d;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, Ly2/e;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    iput-object p1, p0, LG6/A$d;->c:Ljava/lang/Boolean;

    return-object p0
.end method

.method public f(LG6/S;)LG6/A$d;
    .locals 0

    invoke-static {p1}, Ly2/e;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6/S;

    iput-object p1, p0, LG6/A$d;->e:LG6/S;

    return-object p0
.end method

.method public g(Z)LG6/A$d;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, Ly2/e;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    iput-object p1, p0, LG6/A$d;->d:Ljava/lang/Boolean;

    return-object p0
.end method
