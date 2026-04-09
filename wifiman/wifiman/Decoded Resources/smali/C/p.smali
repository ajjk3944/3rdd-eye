.class final LC/p;
.super LB/o;
.source "SourceFile"


# instance fields
.field private final a:Lmh/r;

.field private final b:Lmh/l;

.field private final c:I

.field private final d:LB/d;


# direct methods
.method public constructor <init>(Lmh/r;Lmh/l;I)V
    .locals 2

    invoke-direct {p0}, LB/o;-><init>()V

    iput-object p1, p0, LC/p;->a:Lmh/r;

    iput-object p2, p0, LC/p;->b:Lmh/l;

    iput p3, p0, LC/p;->c:I

    new-instance v0, LB/J;

    invoke-direct {v0}, LB/J;-><init>()V

    new-instance v1, LC/l;

    invoke-direct {v1, p2, p1}, LC/l;-><init>(Lmh/l;Lmh/r;)V

    invoke-virtual {v0, p3, v1}, LB/J;->c(ILjava/lang/Object;)V

    iput-object v0, p0, LC/p;->d:LB/d;

    return-void
.end method


# virtual methods
.method public c()LB/d;
    .locals 1

    iget-object v0, p0, LC/p;->d:LB/d;

    return-object v0
.end method
