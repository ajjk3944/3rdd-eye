.class public Lij/c;
.super Lij/b;
.source "SourceFile"

# interfaces
.implements Ljava/util/Map;
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# instance fields
.field private transient k:I

.field private l:Z


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/high16 v0, 0x3f400000    # 0.75f

    .line 1
    invoke-direct {p0, p1, v0}, Lij/c;-><init>(IF)V

    return-void
.end method

.method public constructor <init>(IF)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lij/c;-><init>(IFZ)V

    return-void
.end method

.method public constructor <init>(IFZ)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p1, p2, p3}, Lij/c;-><init>(IIFZ)V

    return-void
.end method

.method public constructor <init>(IIFZ)V
    .locals 0

    .line 4
    invoke-direct {p0, p2, p3}, Lij/b;-><init>(IF)V

    const/4 p3, 0x1

    if-lt p1, p3, :cond_1

    if-gt p2, p1, :cond_0

    .line 5
    iput p1, p0, Lij/c;->k:I

    .line 6
    iput-boolean p4, p0, Lij/c;->l:Z

    return-void

    .line 7
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "LRUMap initial size must not be greather than max size"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 8
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "LRUMap max size must be greater than 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method protected X0(Lij/a$b;Ljava/lang/Object;)V
    .locals 1

    move-object v0, p1

    check-cast v0, Lij/b$c;

    invoke-virtual {p0, v0}, Lij/c;->e1(Lij/b$c;)V

    invoke-virtual {p1, p2}, Lij/a$b;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public b1()Lij/c;
    .locals 1

    invoke-super {p0}, Lij/a;->t()Lij/a;

    move-result-object v0

    check-cast v0, Lij/c;

    return-object v0
.end method

.method public c1(Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lij/b;->Z0(Ljava/lang/Object;)Lij/b$c;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p0, p1}, Lij/c;->e1(Lij/b$c;)V

    :cond_1
    invoke-virtual {p1}, Lij/a$b;->getValue()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lij/c;->b1()Lij/c;

    move-result-object v0

    return-object v0
.end method

.method public d1()Z
    .locals 2

    iget v0, p0, Lij/a;->b:I

    iget v1, p0, Lij/c;->k:I

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected e1(Lij/b$c;)V
    .locals 3

    iget-object v0, p1, Lij/b$c;->f:Lij/b$c;

    iget-object v1, p0, Lij/b;->j:Lij/b$c;

    if-eq v0, v1, :cond_1

    iget v2, p0, Lij/a;->e:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lij/a;->e:I

    iget-object v2, p1, Lij/b$c;->e:Lij/b$c;

    if-eqz v2, :cond_0

    iput-object v0, v2, Lij/b$c;->f:Lij/b$c;

    iget-object v0, p1, Lij/b$c;->f:Lij/b$c;

    iput-object v2, v0, Lij/b$c;->e:Lij/b$c;

    iput-object v1, p1, Lij/b$c;->f:Lij/b$c;

    iget-object v0, v1, Lij/b$c;->e:Lij/b$c;

    iput-object v0, p1, Lij/b$c;->e:Lij/b$c;

    iget-object v0, v1, Lij/b$c;->e:Lij/b$c;

    iput-object p1, v0, Lij/b$c;->f:Lij/b$c;

    iput-object p1, v1, Lij/b$c;->e:Lij/b$c;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Entry.before is null. This should not occur if your keys are immutable, and you have used synchronization properly."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    if-eq p1, v1, :cond_2

    :goto_0
    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Can\'t move header to MRU This should not occur if your keys are immutable, and you have used synchronization properly."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected f1(Lij/b$c;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method protected g1(Lij/b$c;IILjava/lang/Object;Ljava/lang/Object;)V
    .locals 10

    const-string v0, " This should not occur if your keys are immutable, and you have used synchronization properly."

    const-string v1, " maxSize="

    const-string v2, " size="

    const-string v3, " value="

    const-string v4, " key="

    const/4 v5, 0x1

    :try_start_0
    iget v6, p1, Lij/a$b;->b:I

    iget-object v7, p0, Lij/a;->c:[Lij/a$b;

    array-length v7, v7

    invoke-virtual {p0, v6, v7}, Lij/a;->G0(II)I

    move-result v6

    iget-object v7, p0, Lij/a;->c:[Lij/a$b;

    aget-object v7, v7, v6

    const/4 v8, 0x0

    :goto_0
    if-eq v7, p1, :cond_0

    if-eqz v7, :cond_0

    iget-object v8, v7, Lij/a$b;->a:Lij/a$b;

    move-object v9, v8

    move-object v8, v7

    move-object v7, v9

    goto :goto_0

    :cond_0
    if-eqz v7, :cond_1

    iget v7, p0, Lij/a;->e:I

    add-int/2addr v7, v5

    iput v7, p0, Lij/a;->e:I

    invoke-virtual {p0, p1, v6, v8}, Lij/b;->U0(Lij/a$b;ILij/a$b;)V

    invoke-virtual/range {p0 .. p5}, Lij/a;->W0(Lij/a$b;IILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, Lij/b;->h(Lij/a$b;I)V

    return-void

    :cond_1
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Entry.next=null, data[removeIndex]="

    invoke-virtual {p3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, p0, Lij/a;->c:[Lij/a$b;

    aget-object v6, v7, v6

    invoke-virtual {p3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " previous="

    invoke-virtual {p3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, p0, Lij/a;->b:I

    invoke-virtual {p3, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, p0, Lij/c;->k:I

    invoke-virtual {p3, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "NPE, entry="

    invoke-virtual {p3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " entryIsHeader="

    invoke-virtual {p3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p0, Lij/b;->j:Lij/b$c;

    if-ne p1, v6, :cond_2

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    :goto_1
    invoke-virtual {p3, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p0, Lij/a;->b:I

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p0, Lij/c;->k:I

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lij/c;->c1(Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected l(IILjava/lang/Object;Ljava/lang/Object;)V
    .locals 12

    move-object v6, p0

    move-object v4, p3

    move-object/from16 v5, p4

    invoke-virtual {p0}, Lij/c;->d1()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, v6, Lij/b;->j:Lij/b$c;

    iget-object v0, v0, Lij/b$c;->f:Lij/b$c;

    iget-boolean v1, v6, Lij/c;->l:Z

    const-string v2, " This should not occur if your keys are immutable, and you have used synchronization properly."

    const-string v3, " maxSize="

    const-string v7, " size="

    const-string v8, " value="

    const-string v9, " key="

    const-string v10, " header.before="

    if-eqz v1, :cond_3

    :goto_0
    iget-object v1, v6, Lij/b;->j:Lij/b$c;

    if-eq v0, v1, :cond_1

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, Lij/c;->f1(Lij/b$c;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_1

    :cond_0
    iget-object v0, v0, Lij/b$c;->f:Lij/b$c;

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-eqz v0, :cond_2

    :goto_2
    move-object v11, v0

    goto :goto_3

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Entry.after=null, header.after="

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v11, v6, Lij/b;->j:Lij/b$c;

    iget-object v11, v11, Lij/b$c;->f:Lij/b$c;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v10, v6, Lij/b;->j:Lij/b$c;

    iget-object v10, v10, Lij/b$c;->e:Lij/b$c;

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v6, Lij/a;->b:I

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v6, Lij/c;->k:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    invoke-virtual {p0, v0}, Lij/c;->f1(Lij/b$c;)Z

    move-result v1

    goto :goto_2

    :goto_3
    if-eqz v1, :cond_5

    if-eqz v11, :cond_4

    move-object v0, p0

    move-object v1, v11

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    invoke-virtual/range {v0 .. v5}, Lij/c;->g1(Lij/b$c;IILjava/lang/Object;Ljava/lang/Object;)V

    goto :goto_4

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "reuse=null, header.after="

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v11, v6, Lij/b;->j:Lij/b$c;

    iget-object v11, v11, Lij/b$c;->f:Lij/b$c;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v10, v6, Lij/b;->j:Lij/b$c;

    iget-object v10, v10, Lij/b$c;->e:Lij/b$c;

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v6, Lij/a;->b:I

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v6, Lij/c;->k:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    invoke-super/range {p0 .. p4}, Lij/a;->l(IILjava/lang/Object;Ljava/lang/Object;)V

    goto :goto_4

    :cond_6
    invoke-super/range {p0 .. p4}, Lij/a;->l(IILjava/lang/Object;Ljava/lang/Object;)V

    :goto_4
    return-void
.end method
