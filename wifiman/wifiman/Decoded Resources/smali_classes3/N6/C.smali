.class public LN6/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN6/B;


# instance fields
.field private final a:LP6/G;

.field private final b:LN6/f;

.field private final c:LN6/y;


# direct methods
.method constructor <init>(LP6/G;LN6/f;LN6/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN6/C;->a:LP6/G;

    iput-object p2, p0, LN6/C;->b:LN6/f;

    iput-object p3, p0, LN6/C;->c:LN6/y;

    return-void
.end method


# virtual methods
.method public varargs a(LQ6/g;[LQ6/d;)LN6/A;
    .locals 6

    iget-object v0, p0, LN6/C;->c:LN6/y;

    invoke-virtual {p1}, LQ6/g;->g()I

    move-result v1

    invoke-virtual {v0, v1}, LN6/y;->b(I)Lgg/w;

    move-result-object v0

    iget-object v1, p0, LN6/C;->c:LN6/y;

    invoke-virtual {p1}, LQ6/g;->b()I

    move-result p1

    invoke-virtual {v1, p1}, LN6/y;->a(I)Lgg/w;

    move-result-object p1

    new-instance v1, LN6/A;

    new-instance v2, LM6/q;

    iget-object v3, p0, LN6/C;->a:LP6/G;

    iget-object v4, p0, LN6/C;->b:LN6/f;

    new-instance v5, LN6/e;

    invoke-direct {v5, p2}, LN6/e;-><init>([LN6/p;)V

    invoke-direct {v2, v3, v4, v5}, LM6/q;-><init>(LP6/G;LN6/f;LN6/e;)V

    new-instance p2, LN6/C$a;

    invoke-direct {p2, p0, v0, p1}, LN6/C$a;-><init>(LN6/C;Lgg/w;Lgg/w;)V

    invoke-direct {v1, v2, p2}, LN6/A;-><init>(LM6/j;Lgg/w;)V

    return-object v1
.end method
