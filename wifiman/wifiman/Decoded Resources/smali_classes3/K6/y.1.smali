.class LK6/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LK6/n;


# instance fields
.field private final a:LO6/a;

.field private final b:LM6/g;


# direct methods
.method constructor <init>(LO6/a;LM6/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK6/y;->a:LO6/a;

    iput-object p2, p0, LK6/y;->b:LM6/g;

    return-void
.end method


# virtual methods
.method public b()V
    .locals 3

    iget-object v0, p0, LK6/y;->a:LO6/a;

    iget-object v1, p0, LK6/y;->b:LM6/g;

    invoke-interface {v0, v1}, LO6/a;->a(LM6/j;)Lgg/s;

    move-result-object v0

    invoke-static {}, Lmg/a;->e()Lkg/f;

    move-result-object v1

    invoke-static {}, Lmg/a;->e()Lkg/f;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lgg/s;->J0(Lkg/f;Lkg/f;)Lhg/c;

    return-void
.end method

.method public c()V
    .locals 0

    return-void
.end method
