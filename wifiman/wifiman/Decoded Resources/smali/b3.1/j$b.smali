.class final Lb3/j$b;
.super Lb3/t$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb3/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/lang/Long;

.field private b:Ljava/lang/Integer;

.field private c:Lb3/p;

.field private d:Ljava/lang/Long;

.field private e:[B

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/Long;

.field private h:Lb3/w;

.field private i:Lb3/q;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb3/t$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lb3/t;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lb3/j$b;->a:Ljava/lang/Long;

    const-string v2, ""

    if-nez v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " eventTimeMs"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_0
    iget-object v1, v0, Lb3/j$b;->d:Ljava/lang/Long;

    if-nez v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " eventUptimeMs"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_1
    iget-object v1, v0, Lb3/j$b;->g:Ljava/lang/Long;

    if-nez v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " timezoneOffsetSeconds"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v1, Lb3/j;

    iget-object v2, v0, Lb3/j$b;->a:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    iget-object v6, v0, Lb3/j$b;->b:Ljava/lang/Integer;

    iget-object v7, v0, Lb3/j$b;->c:Lb3/p;

    iget-object v2, v0, Lb3/j$b;->d:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    iget-object v10, v0, Lb3/j$b;->e:[B

    iget-object v11, v0, Lb3/j$b;->f:Ljava/lang/String;

    iget-object v2, v0, Lb3/j$b;->g:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    iget-object v14, v0, Lb3/j$b;->h:Lb3/w;

    iget-object v15, v0, Lb3/j$b;->i:Lb3/q;

    const/16 v16, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v16}, Lb3/j;-><init>(JLjava/lang/Integer;Lb3/p;J[BLjava/lang/String;JLb3/w;Lb3/q;Lb3/j$a;)V

    return-object v1

    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Missing required properties:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public b(Lb3/p;)Lb3/t$a;
    .locals 0

    iput-object p1, p0, Lb3/j$b;->c:Lb3/p;

    return-object p0
.end method

.method public c(Ljava/lang/Integer;)Lb3/t$a;
    .locals 0

    iput-object p1, p0, Lb3/j$b;->b:Ljava/lang/Integer;

    return-object p0
.end method

.method public d(J)Lb3/t$a;
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lb3/j$b;->a:Ljava/lang/Long;

    return-object p0
.end method

.method public e(J)Lb3/t$a;
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lb3/j$b;->d:Ljava/lang/Long;

    return-object p0
.end method

.method public f(Lb3/q;)Lb3/t$a;
    .locals 0

    iput-object p1, p0, Lb3/j$b;->i:Lb3/q;

    return-object p0
.end method

.method public g(Lb3/w;)Lb3/t$a;
    .locals 0

    iput-object p1, p0, Lb3/j$b;->h:Lb3/w;

    return-object p0
.end method

.method h([B)Lb3/t$a;
    .locals 0

    iput-object p1, p0, Lb3/j$b;->e:[B

    return-object p0
.end method

.method i(Ljava/lang/String;)Lb3/t$a;
    .locals 0

    iput-object p1, p0, Lb3/j$b;->f:Ljava/lang/String;

    return-object p0
.end method

.method public j(J)Lb3/t$a;
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lb3/j$b;->g:Ljava/lang/Long;

    return-object p0
.end method
