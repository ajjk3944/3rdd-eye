.class public abstract Lij/b;
.super Lij/a;
.source "SourceFile"

# interfaces
.implements Ljava/util/Map;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lij/b$d;,
        Lij/b$c;,
        Lij/b$f;,
        Lij/b$b;,
        Lij/b$a;,
        Lij/b$e;
    }
.end annotation


# instance fields
.field transient j:Lij/b$c;


# direct methods
.method protected constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lij/a;-><init>()V

    return-void
.end method

.method protected constructor <init>(IF)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lij/a;-><init>(IF)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic C0(Ljava/lang/Object;)Lij/a$b;
    .locals 0

    invoke-virtual {p0, p1}, Lij/b;->Z0(Ljava/lang/Object;)Lij/b$c;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic E(Lij/a$b;ILjava/lang/Object;Ljava/lang/Object;)Lij/a$b;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lij/b;->Y0(Lij/a$b;ILjava/lang/Object;Ljava/lang/Object;)Lij/b$c;

    move-result-object p1

    return-object p1
.end method

.method protected K()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lij/a;->size()I

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lhj/c;->a()Lgj/b;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lij/b$a;

    invoke-direct {v0, p0}, Lij/b$a;-><init>(Lij/b;)V

    return-object v0
.end method

.method protected M0()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1, v0, v0}, Lij/b;->Y0(Lij/a$b;ILjava/lang/Object;Ljava/lang/Object;)Lij/b$c;

    move-result-object v0

    iput-object v0, p0, Lij/b;->j:Lij/b$c;

    iput-object v0, v0, Lij/b$c;->f:Lij/b$c;

    iput-object v0, v0, Lij/b$c;->e:Lij/b$c;

    return-void
.end method

.method protected P()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lij/a;->size()I

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lhj/c;->a()Lgj/b;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lij/b$b;

    invoke-direct {v0, p0}, Lij/b$b;-><init>(Lij/b;)V

    return-object v0
.end method

.method protected S()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lij/a;->size()I

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lhj/c;->a()Lgj/b;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lij/b$f;

    invoke-direct {v0, p0}, Lij/b$f;-><init>(Lij/b;)V

    return-object v0
.end method

.method public bridge synthetic T0()Lgj/a;
    .locals 1

    invoke-virtual {p0}, Lij/b;->a1()Lgj/c;

    move-result-object v0

    return-object v0
.end method

.method protected U0(Lij/a$b;ILij/a$b;)V
    .locals 3

    move-object v0, p1

    check-cast v0, Lij/b$c;

    iget-object v1, v0, Lij/b$c;->e:Lij/b$c;

    iget-object v2, v0, Lij/b$c;->f:Lij/b$c;

    iput-object v2, v1, Lij/b$c;->f:Lij/b$c;

    iget-object v2, v0, Lij/b$c;->f:Lij/b$c;

    iput-object v1, v2, Lij/b$c;->e:Lij/b$c;

    const/4 v1, 0x0

    iput-object v1, v0, Lij/b$c;->f:Lij/b$c;

    iput-object v1, v0, Lij/b$c;->e:Lij/b$c;

    invoke-super {p0, p1, p2, p3}, Lij/a;->U0(Lij/a$b;ILij/a$b;)V

    return-void
.end method

.method protected Y0(Lij/a$b;ILjava/lang/Object;Ljava/lang/Object;)Lij/b$c;
    .locals 1

    new-instance v0, Lij/b$c;

    invoke-virtual {p0, p3}, Lij/a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    invoke-direct {v0, p1, p2, p3, p4}, Lij/b$c;-><init>(Lij/a$b;ILjava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method protected Z0(Ljava/lang/Object;)Lij/b$c;
    .locals 0

    invoke-super {p0, p1}, Lij/a;->C0(Ljava/lang/Object;)Lij/a$b;

    move-result-object p1

    check-cast p1, Lij/b$c;

    return-object p1
.end method

.method public a1()Lgj/c;
    .locals 1

    iget v0, p0, Lij/a;->b:I

    if-nez v0, :cond_0

    invoke-static {}, Lhj/d;->a()Lgj/c;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lij/b$e;

    invoke-direct {v0, p0}, Lij/b$e;-><init>(Lij/b;)V

    return-object v0
.end method

.method public clear()V
    .locals 1

    invoke-super {p0}, Lij/a;->clear()V

    iget-object v0, p0, Lij/b;->j:Lij/b$c;

    iput-object v0, v0, Lij/b$c;->f:Lij/b$c;

    iput-object v0, v0, Lij/b$c;->e:Lij/b$c;

    return-void
.end method

.method public containsValue(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-nez p1, :cond_1

    iget-object p1, p0, Lij/b;->j:Lij/b$c;

    :cond_0
    iget-object p1, p1, Lij/b$c;->f:Lij/b$c;

    iget-object v1, p0, Lij/b;->j:Lij/b$c;

    if-eq p1, v1, :cond_3

    invoke-virtual {p1}, Lij/a$b;->getValue()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    return v0

    :cond_1
    iget-object v1, p0, Lij/b;->j:Lij/b$c;

    :cond_2
    iget-object v1, v1, Lij/b$c;->f:Lij/b$c;

    iget-object v2, p0, Lij/b;->j:Lij/b$c;

    if-eq v1, v2, :cond_3

    invoke-virtual {v1}, Lij/a$b;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0, p1, v2}, Lij/a;->P0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    return v0

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method protected h(Lij/a$b;I)V
    .locals 2

    check-cast p1, Lij/b$c;

    iget-object v0, p0, Lij/b;->j:Lij/b$c;

    iput-object v0, p1, Lij/b$c;->f:Lij/b$c;

    iget-object v1, v0, Lij/b$c;->e:Lij/b$c;

    iput-object v1, p1, Lij/b$c;->e:Lij/b$c;

    iget-object v1, v0, Lij/b$c;->e:Lij/b$c;

    iput-object p1, v1, Lij/b$c;->f:Lij/b$c;

    iput-object p1, v0, Lij/b$c;->e:Lij/b$c;

    iget-object v0, p0, Lij/a;->c:[Lij/a$b;

    aput-object p1, v0, p2

    return-void
.end method
