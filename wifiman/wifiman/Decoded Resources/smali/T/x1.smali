.class final LT/x1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/b;
.implements Ljava/lang/Iterable;
.implements Lnh/a;


# instance fields
.field private final a:LT/b1;

.field private final b:I

.field private final c:LT/U;

.field private final d:LT/w1;

.field private final e:Ljava/lang/Object;

.field private final f:Ljava/lang/Iterable;


# direct methods
.method public constructor <init>(LT/b1;ILT/U;LT/w1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT/x1;->a:LT/b1;

    iput p2, p0, LT/x1;->b:I

    iput-object p4, p0, LT/x1;->d:LT/w1;

    invoke-virtual {p3}, LT/U;->c()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, LT/x1;->e:Ljava/lang/Object;

    iput-object p0, p0, LT/x1;->f:Ljava/lang/Iterable;

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 5

    new-instance v0, LT/v1;

    iget-object v1, p0, LT/x1;->a:LT/b1;

    iget v2, p0, LT/x1;->b:I

    iget-object v3, p0, LT/x1;->c:LT/U;

    iget-object v4, p0, LT/x1;->d:LT/w1;

    invoke-direct {v0, v1, v2, v3, v4}, LT/v1;-><init>(LT/b1;ILT/U;LT/w1;)V

    return-object v0
.end method
