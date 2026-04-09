.class final LQ/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ/z;


# instance fields
.field private final a:LQ/A;

.field private final b:Lr/i;

.field private final c:Lr/z;

.field private final d:Lmh/a;

.field private final e:Z

.field private f:Lx0/a;


# direct methods
.method public constructor <init>(LQ/A;Lr/i;Lr/z;Lmh/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ/i;->a:LQ/A;

    iput-object p2, p0, LQ/i;->b:Lr/i;

    iput-object p3, p0, LQ/i;->c:Lr/z;

    iput-object p4, p0, LQ/i;->d:Lmh/a;

    new-instance p1, LQ/i$a;

    invoke-direct {p1, p0}, LQ/i$a;-><init>(LQ/i;)V

    iput-object p1, p0, LQ/i;->f:Lx0/a;

    return-void
.end method


# virtual methods
.method public a()Lx0/a;
    .locals 1

    iget-object v0, p0, LQ/i;->f:Lx0/a;

    return-object v0
.end method

.method public b()Lr/z;
    .locals 1

    iget-object v0, p0, LQ/i;->c:Lr/z;

    return-object v0
.end method

.method public c()Lr/i;
    .locals 1

    iget-object v0, p0, LQ/i;->b:Lr/i;

    return-object v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, LQ/i;->e:Z

    return v0
.end method

.method public final e()Lmh/a;
    .locals 1

    iget-object v0, p0, LQ/i;->d:Lmh/a;

    return-object v0
.end method

.method public getState()LQ/A;
    .locals 1

    iget-object v0, p0, LQ/i;->a:LQ/A;

    return-object v0
.end method
