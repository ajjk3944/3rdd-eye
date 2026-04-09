.class public LN6/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN6/B;


# instance fields
.field private final a:LP6/G;

.field private final b:LN6/f;

.field private final c:LN6/y;

.field private final d:LN6/a;


# direct methods
.method constructor <init>(LP6/G;LN6/f;LN6/y;LN6/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN6/E;->a:LP6/G;

    iput-object p2, p0, LN6/E;->b:LN6/f;

    iput-object p3, p0, LN6/E;->c:LN6/y;

    iput-object p4, p0, LN6/E;->d:LN6/a;

    return-void
.end method


# virtual methods
.method public varargs a(LQ6/g;[LQ6/d;)LN6/A;
    .locals 10

    iget-object v0, p0, LN6/E;->c:LN6/y;

    invoke-virtual {p1}, LQ6/g;->b()I

    move-result v1

    invoke-virtual {v0, v1}, LN6/y;->a(I)Lgg/w;

    move-result-object v0

    new-instance v1, LN6/A;

    new-instance v9, LM6/r;

    iget-object v3, p0, LN6/E;->a:LP6/G;

    iget-object v4, p0, LN6/E;->b:LN6/f;

    iget-object v5, p0, LN6/E;->d:LN6/a;

    new-instance v7, LN6/e;

    invoke-direct {v7, p2}, LN6/e;-><init>([LN6/p;)V

    const/4 v8, 0x0

    move-object v2, v9

    move-object v6, p1

    invoke-direct/range {v2 .. v8}, LM6/r;-><init>(LP6/G;LN6/f;LN6/a;LQ6/g;LN6/e;[LQ6/d;)V

    invoke-direct {v1, v9, v0}, LN6/A;-><init>(LM6/j;Lgg/w;)V

    return-object v1
.end method
