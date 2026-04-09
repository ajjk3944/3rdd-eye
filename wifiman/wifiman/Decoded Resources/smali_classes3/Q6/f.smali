.class public LQ6/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LG6/O;

.field private final b:I

.field private final c:J

.field private final d:LQ6/c;

.field private final e:LQ6/e;

.field private final f:LQ6/b;


# direct methods
.method public constructor <init>(LG6/O;IJLQ6/c;LQ6/e;LQ6/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ6/f;->a:LG6/O;

    iput p2, p0, LQ6/f;->b:I

    iput-wide p3, p0, LQ6/f;->c:J

    iput-object p5, p0, LQ6/f;->d:LQ6/c;

    iput-object p6, p0, LQ6/f;->e:LQ6/e;

    iput-object p7, p0, LQ6/f;->f:LQ6/b;

    return-void
.end method


# virtual methods
.method public a()LG6/O;
    .locals 1

    iget-object v0, p0, LQ6/f;->a:LG6/O;

    return-object v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, LQ6/f;->b:I

    return v0
.end method

.method public c()LQ6/e;
    .locals 1

    iget-object v0, p0, LQ6/f;->e:LQ6/e;

    return-object v0
.end method

.method public d()LQ6/b;
    .locals 1

    iget-object v0, p0, LQ6/f;->f:LQ6/b;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "ScanResult{bleDevice="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LQ6/f;->a:LG6/O;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", rssi="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LQ6/f;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", timestampNanos="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LQ6/f;->c:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", callbackType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LQ6/f;->d:LQ6/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", scanRecord="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LQ6/f;->e:LQ6/e;

    invoke-interface {v1}, LQ6/e;->b()[B

    move-result-object v1

    invoke-static {v1}, LL6/b;->a([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isConnectable="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LQ6/f;->f:LQ6/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
