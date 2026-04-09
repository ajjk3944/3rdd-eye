.class final LT/X;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LT/K0;

.field private final b:I

.field private c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LT/K0;ILjava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT/X;->a:LT/K0;

    iput p2, p0, LT/X;->b:I

    iput-object p3, p0, LT/X;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LT/X;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, LT/X;->b:I

    return v0
.end method

.method public final c()LT/K0;
    .locals 1

    iget-object v0, p0, LT/X;->a:LT/K0;

    return-object v0
.end method

.method public final d()Z
    .locals 2

    iget-object v0, p0, LT/X;->a:LT/K0;

    iget-object v1, p0, LT/X;->c:Ljava/lang/Object;

    invoke-virtual {v0, v1}, LT/K0;->u(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final e(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, LT/X;->c:Ljava/lang/Object;

    return-void
.end method
