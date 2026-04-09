.class public abstract Lg1/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg1/g$d;,
        Lg1/g$c;,
        Lg1/g$e;,
        Lg1/g$a;,
        Lg1/g$b;
    }
.end annotation


# static fields
.field public static final k:Ljava/lang/Integer;


# instance fields
.field private a:Lg1/c;

.field private b:Z

.field protected c:Ljava/util/HashMap;

.field protected d:Ljava/util/HashMap;

.field e:Ljava/util/HashMap;

.field public final f:Lg1/a;

.field private g:I

.field h:Ljava/util/ArrayList;

.field i:Ljava/util/ArrayList;

.field j:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sput-object v0, Lg1/g;->k:Ljava/lang/Integer;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lg1/g;->b:Z

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lg1/g;->c:Ljava/util/HashMap;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lg1/g;->d:Ljava/util/HashMap;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lg1/g;->e:Ljava/util/HashMap;

    new-instance v1, Lg1/a;

    invoke-direct {v1, p0}, Lg1/a;-><init>(Lg1/g;)V

    iput-object v1, p0, Lg1/g;->f:Lg1/a;

    const/4 v2, 0x0

    iput v2, p0, Lg1/g;->g:I

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lg1/g;->h:Ljava/util/ArrayList;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lg1/g;->i:Ljava/util/ArrayList;

    iput-boolean v0, p0, Lg1/g;->j:Z

    sget-object v0, Lg1/g;->k:Ljava/lang/Integer;

    invoke-virtual {v1, v0}, Lg1/a;->b(Ljava/lang/Object;)V

    iget-object v2, p0, Lg1/g;->c:Ljava/util/HashMap;

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private g()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "__HELPER_KEY_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lg1/g;->g:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lg1/g;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "__"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public A()Lh1/j;
    .locals 2

    const/4 v0, 0x0

    sget-object v1, Lg1/g$d;->VERTICAL_CHAIN:Lg1/g$d;

    invoke-virtual {p0, v0, v1}, Lg1/g;->n(Ljava/lang/Object;Lg1/g$d;)Lg1/e;

    move-result-object v0

    check-cast v0, Lh1/j;

    return-object v0
.end method

.method public B(Ljava/lang/Object;)Lh1/h;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lg1/g;->l(Ljava/lang/Object;I)Lh1/h;

    move-result-object p1

    return-object p1
.end method

.method public C(Lg1/d;)Lg1/g;
    .locals 0

    invoke-virtual {p0, p1}, Lg1/g;->z(Lg1/d;)Lg1/g;

    move-result-object p1

    return-object p1
.end method

.method public a(Lj1/f;)V
    .locals 7

    invoke-virtual {p1}, Lj1/m;->f1()V

    iget-object v0, p0, Lg1/g;->f:Lg1/a;

    invoke-virtual {v0}, Lg1/a;->E()Lg1/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, p1, v1}, Lg1/d;->a(Lg1/g;Lj1/e;I)V

    iget-object v0, p0, Lg1/g;->f:Lg1/a;

    invoke-virtual {v0}, Lg1/a;->C()Lg1/d;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p0, p1, v1}, Lg1/d;->a(Lg1/g;Lj1/e;I)V

    iget-object v0, p0, Lg1/g;->d:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lg1/g;->d:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg1/e;

    invoke-virtual {v2}, Lg1/e;->u0()Lj1/j;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v3, p0, Lg1/g;->c:Ljava/util/HashMap;

    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg1/f;

    if-nez v3, :cond_1

    invoke-virtual {p0, v1}, Lg1/g;->d(Ljava/lang/Object;)Lg1/a;

    move-result-object v3

    :cond_1
    invoke-interface {v3, v2}, Lg1/f;->d(Lj1/e;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lg1/g;->c:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lg1/g;->c:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg1/f;

    iget-object v3, p0, Lg1/g;->f:Lg1/a;

    if-eq v2, v3, :cond_3

    invoke-interface {v2}, Lg1/f;->c()Lh1/e;

    move-result-object v3

    instance-of v3, v3, Lg1/e;

    if-eqz v3, :cond_3

    invoke-interface {v2}, Lg1/f;->c()Lh1/e;

    move-result-object v2

    check-cast v2, Lg1/e;

    invoke-virtual {v2}, Lg1/e;->u0()Lj1/j;

    move-result-object v2

    if-eqz v2, :cond_3

    iget-object v3, p0, Lg1/g;->c:Ljava/util/HashMap;

    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg1/f;

    if-nez v3, :cond_4

    invoke-virtual {p0, v1}, Lg1/g;->d(Ljava/lang/Object;)Lg1/a;

    move-result-object v3

    :cond_4
    invoke-interface {v3, v2}, Lg1/f;->d(Lj1/e;)V

    goto :goto_1

    :cond_5
    iget-object v0, p0, Lg1/g;->c:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lg1/g;->c:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg1/f;

    iget-object v2, p0, Lg1/g;->f:Lg1/a;

    if-eq v1, v2, :cond_7

    invoke-interface {v1}, Lg1/f;->a()Lj1/e;

    move-result-object v2

    invoke-interface {v1}, Lg1/f;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lj1/e;->q0(Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lj1/e;->M0(Lj1/e;)V

    invoke-interface {v1}, Lg1/f;->c()Lh1/e;

    move-result-object v3

    instance-of v3, v3, Lh1/h;

    if-eqz v3, :cond_6

    invoke-interface {v1}, Lg1/f;->apply()V

    :cond_6
    invoke-virtual {p1, v2}, Lj1/m;->a1(Lj1/e;)V

    goto :goto_2

    :cond_7
    invoke-interface {v1, p1}, Lg1/f;->d(Lj1/e;)V

    goto :goto_2

    :cond_8
    iget-object p1, p0, Lg1/g;->d:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lg1/g;->d:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/e;

    invoke-virtual {v0}, Lg1/e;->u0()Lj1/j;

    move-result-object v1

    if-eqz v1, :cond_a

    iget-object v1, v0, Lg1/e;->o0:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Lg1/g;->c:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg1/f;

    invoke-virtual {v0}, Lg1/e;->u0()Lj1/j;

    move-result-object v3

    invoke-interface {v2}, Lg1/f;->a()Lj1/e;

    move-result-object v2

    invoke-virtual {v3, v2}, Lj1/j;->a1(Lj1/e;)V

    goto :goto_4

    :cond_9
    invoke-virtual {v0}, Lg1/e;->apply()V

    goto :goto_3

    :cond_a
    invoke-virtual {v0}, Lg1/e;->apply()V

    goto :goto_3

    :cond_b
    iget-object p1, p0, Lg1/g;->c:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_c
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lg1/g;->c:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/f;

    iget-object v1, p0, Lg1/g;->f:Lg1/a;

    if-eq v0, v1, :cond_c

    invoke-interface {v0}, Lg1/f;->c()Lh1/e;

    move-result-object v1

    instance-of v1, v1, Lg1/e;

    if-eqz v1, :cond_c

    invoke-interface {v0}, Lg1/f;->c()Lh1/e;

    move-result-object v1

    check-cast v1, Lg1/e;

    invoke-virtual {v1}, Lg1/e;->u0()Lj1/j;

    move-result-object v2

    if-eqz v2, :cond_c

    iget-object v1, v1, Lg1/e;->o0:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Lg1/g;->c:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg1/f;

    if-eqz v4, :cond_d

    invoke-interface {v4}, Lg1/f;->a()Lj1/e;

    move-result-object v3

    invoke-virtual {v2, v3}, Lj1/j;->a1(Lj1/e;)V

    goto :goto_6

    :cond_d
    instance-of v4, v3, Lg1/f;

    if-eqz v4, :cond_e

    check-cast v3, Lg1/f;

    invoke-interface {v3}, Lg1/f;->a()Lj1/e;

    move-result-object v3

    invoke-virtual {v2, v3}, Lj1/j;->a1(Lj1/e;)V

    goto :goto_6

    :cond_e
    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "couldn\'t find reference for "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_6

    :cond_f
    invoke-interface {v0}, Lg1/f;->apply()V

    goto :goto_5

    :cond_10
    iget-object p1, p0, Lg1/g;->c:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_11
    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lg1/g;->c:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg1/f;

    invoke-interface {v1}, Lg1/f;->apply()V

    invoke-interface {v1}, Lg1/f;->a()Lj1/e;

    move-result-object v1

    if-eqz v1, :cond_11

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lj1/e;->o:Ljava/lang/String;

    goto :goto_7

    :cond_12
    return-void
.end method

.method public b(Ljava/lang/Object;Lg1/g$c;)Lh1/c;
    .locals 1

    invoke-virtual {p0, p1}, Lg1/g;->d(Ljava/lang/Object;)Lg1/a;

    move-result-object p1

    invoke-virtual {p1}, Lg1/a;->c()Lh1/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lg1/a;->c()Lh1/e;

    move-result-object v0

    instance-of v0, v0, Lh1/c;

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, Lh1/c;

    invoke-direct {v0, p0}, Lh1/c;-><init>(Lg1/g;)V

    invoke-virtual {v0, p2}, Lh1/c;->w0(Lg1/g$c;)V

    invoke-virtual {p1, v0}, Lg1/a;->X(Lh1/e;)V

    :cond_1
    invoke-virtual {p1}, Lg1/a;->c()Lh1/e;

    move-result-object p1

    check-cast p1, Lh1/c;

    return-object p1
.end method

.method public c(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lg1/g;->h:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Lg1/g;->j:Z

    return-void
.end method

.method public d(Ljava/lang/Object;)Lg1/a;
    .locals 2

    iget-object v0, p0, Lg1/g;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/f;

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lg1/g;->f(Ljava/lang/Object;)Lg1/a;

    move-result-object v0

    iget-object v1, p0, Lg1/g;->c:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, p1}, Lg1/f;->b(Ljava/lang/Object;)V

    :cond_0
    instance-of p1, v0, Lg1/a;

    if-eqz p1, :cond_1

    check-cast v0, Lg1/a;

    return-object v0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public e(Ljava/lang/Object;)I
    .locals 1

    instance-of v0, p1, Ljava/lang/Float;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    return p1

    :cond_0
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public f(Ljava/lang/Object;)Lg1/a;
    .locals 0

    new-instance p1, Lg1/a;

    invoke-direct {p1, p0}, Lg1/a;-><init>(Lg1/g;)V

    return-object p1
.end method

.method h()Lg1/c;
    .locals 1

    iget-object v0, p0, Lg1/g;->a:Lg1/c;

    return-object v0
.end method

.method public i(Ljava/lang/Object;Z)Lh1/f;
    .locals 1

    invoke-virtual {p0, p1}, Lg1/g;->d(Ljava/lang/Object;)Lg1/a;

    move-result-object p1

    invoke-virtual {p1}, Lg1/a;->c()Lh1/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lg1/a;->c()Lh1/e;

    move-result-object v0

    instance-of v0, v0, Lh1/f;

    if-nez v0, :cond_2

    :cond_0
    if-eqz p2, :cond_1

    new-instance p2, Lh1/f;

    sget-object v0, Lg1/g$d;->VERTICAL_FLOW:Lg1/g$d;

    invoke-direct {p2, p0, v0}, Lh1/f;-><init>(Lg1/g;Lg1/g$d;)V

    goto :goto_0

    :cond_1
    new-instance p2, Lh1/f;

    sget-object v0, Lg1/g$d;->HORIZONTAL_FLOW:Lg1/g$d;

    invoke-direct {p2, p0, v0}, Lh1/f;-><init>(Lg1/g;Lg1/g$d;)V

    :goto_0
    invoke-virtual {p1, p2}, Lg1/a;->X(Lh1/e;)V

    :cond_2
    invoke-virtual {p1}, Lg1/a;->c()Lh1/e;

    move-result-object p1

    check-cast p1, Lh1/f;

    return-object p1
.end method

.method public j(Ljava/lang/Object;Ljava/lang/String;)Lh1/g;
    .locals 4

    invoke-virtual {p0, p1}, Lg1/g;->d(Ljava/lang/Object;)Lg1/a;

    move-result-object p1

    invoke-virtual {p1}, Lg1/a;->c()Lh1/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lg1/a;->c()Lh1/e;

    move-result-object v0

    instance-of v0, v0, Lh1/g;

    if-nez v0, :cond_3

    :cond_0
    sget-object v0, Lg1/g$d;->GRID:Lg1/g$d;

    const/4 v1, 0x0

    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x72

    if-ne v2, v3, :cond_1

    sget-object v0, Lg1/g$d;->ROW:Lg1/g$d;

    goto :goto_0

    :cond_1
    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    move-result p2

    const/16 v1, 0x63

    if-ne p2, v1, :cond_2

    sget-object v0, Lg1/g$d;->COLUMN:Lg1/g$d;

    :cond_2
    :goto_0
    new-instance p2, Lh1/g;

    invoke-direct {p2, p0, v0}, Lh1/g;-><init>(Lg1/g;Lg1/g$d;)V

    invoke-virtual {p1, p2}, Lg1/a;->X(Lh1/e;)V

    :cond_3
    invoke-virtual {p1}, Lg1/a;->c()Lh1/e;

    move-result-object p1

    check-cast p1, Lh1/g;

    return-object p1
.end method

.method public k(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lg1/g;->e:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lg1/g;->e:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public l(Ljava/lang/Object;I)Lh1/h;
    .locals 2

    invoke-virtual {p0, p1}, Lg1/g;->d(Ljava/lang/Object;)Lg1/a;

    move-result-object v0

    invoke-virtual {v0}, Lg1/a;->c()Lh1/e;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lg1/a;->c()Lh1/e;

    move-result-object v1

    instance-of v1, v1, Lh1/h;

    if-nez v1, :cond_1

    :cond_0
    new-instance v1, Lh1/h;

    invoke-direct {v1, p0}, Lh1/h;-><init>(Lg1/g;)V

    invoke-virtual {v1, p2}, Lh1/h;->g(I)V

    invoke-virtual {v1, p1}, Lh1/h;->b(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lg1/a;->X(Lh1/e;)V

    :cond_1
    invoke-virtual {v0}, Lg1/a;->c()Lh1/e;

    move-result-object p1

    check-cast p1, Lh1/h;

    return-object p1
.end method

.method public m(Lg1/d;)Lg1/g;
    .locals 0

    invoke-virtual {p0, p1}, Lg1/g;->w(Lg1/d;)Lg1/g;

    move-result-object p1

    return-object p1
.end method

.method public n(Ljava/lang/Object;Lg1/g$d;)Lg1/e;
    .locals 1

    if-nez p1, :cond_0

    invoke-direct {p0}, Lg1/g;->g()Ljava/lang/String;

    move-result-object p1

    :cond_0
    iget-object v0, p0, Lg1/g;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/e;

    if-nez v0, :cond_1

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    new-instance v0, Lg1/e;

    invoke-direct {v0, p0, p2}, Lg1/e;-><init>(Lg1/g;Lg1/g$d;)V

    goto :goto_1

    :pswitch_1
    new-instance v0, Lh1/g;

    invoke-direct {v0, p0, p2}, Lh1/g;-><init>(Lg1/g;Lg1/g$d;)V

    goto :goto_1

    :pswitch_2
    new-instance v0, Lh1/f;

    invoke-direct {v0, p0, p2}, Lh1/f;-><init>(Lg1/g;Lg1/g$d;)V

    goto :goto_1

    :pswitch_3
    new-instance p2, Lh1/c;

    invoke-direct {p2, p0}, Lh1/c;-><init>(Lg1/g;)V

    :goto_0
    move-object v0, p2

    goto :goto_1

    :pswitch_4
    new-instance p2, Lh1/b;

    invoke-direct {p2, p0}, Lh1/b;-><init>(Lg1/g;)V

    goto :goto_0

    :pswitch_5
    new-instance p2, Lh1/a;

    invoke-direct {p2, p0}, Lh1/a;-><init>(Lg1/g;)V

    goto :goto_0

    :pswitch_6
    new-instance p2, Lh1/j;

    invoke-direct {p2, p0}, Lh1/j;-><init>(Lg1/g;)V

    goto :goto_0

    :pswitch_7
    new-instance p2, Lh1/i;

    invoke-direct {p2, p0}, Lh1/i;-><init>(Lg1/g;)V

    goto :goto_0

    :goto_1
    invoke-virtual {v0, p1}, Lg1/a;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lg1/g;->d:Ljava/util/HashMap;

    invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public o()Lh1/i;
    .locals 2

    const/4 v0, 0x0

    sget-object v1, Lg1/g$d;->HORIZONTAL_CHAIN:Lg1/g$d;

    invoke-virtual {p0, v0, v1}, Lg1/g;->n(Ljava/lang/Object;Lg1/g$d;)Lg1/e;

    move-result-object v0

    check-cast v0, Lh1/i;

    return-object v0
.end method

.method public p(Ljava/lang/Object;)Lh1/h;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lg1/g;->l(Ljava/lang/Object;I)Lh1/h;

    move-result-object p1

    return-object p1
.end method

.method public q(Lj1/e;)Z
    .locals 3

    iget-boolean v0, p0, Lg1/g;->j:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lg1/g;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lg1/g;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lg1/g;->c:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg1/f;

    invoke-interface {v1}, Lg1/f;->a()Lj1/e;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v2, p0, Lg1/g;->i:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lg1/g;->j:Z

    :cond_2
    iget-object v0, p0, Lg1/g;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public r()Z
    .locals 1

    iget-boolean v0, p0, Lg1/g;->b:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public s(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Lg1/g;->d(Ljava/lang/Object;)Lg1/a;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1, p2}, Lg1/a;->e0(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method t(Ljava/lang/Object;)Lg1/f;
    .locals 1

    iget-object v0, p0, Lg1/g;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg1/f;

    return-object p1
.end method

.method public u()V
    .locals 3

    iget-object v0, p0, Lg1/g;->c:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lg1/g;->c:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg1/f;

    invoke-interface {v1}, Lg1/f;->a()Lj1/e;

    move-result-object v1

    invoke-virtual {v1}, Lj1/e;->k0()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lg1/g;->c:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    iget-object v0, p0, Lg1/g;->c:Ljava/util/HashMap;

    sget-object v1, Lg1/g;->k:Ljava/lang/Integer;

    iget-object v2, p0, Lg1/g;->f:Lg1/a;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lg1/g;->d:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    iget-object v0, p0, Lg1/g;->e:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    iget-object v0, p0, Lg1/g;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lg1/g;->j:Z

    return-void
.end method

.method public v(Lg1/c;)V
    .locals 0

    iput-object p1, p0, Lg1/g;->a:Lg1/c;

    return-void
.end method

.method public w(Lg1/d;)Lg1/g;
    .locals 1

    iget-object v0, p0, Lg1/g;->f:Lg1/a;

    invoke-virtual {v0, p1}, Lg1/a;->Y(Lg1/d;)Lg1/a;

    return-object p0
.end method

.method public x(Z)V
    .locals 0

    xor-int/lit8 p1, p1, 0x1

    iput-boolean p1, p0, Lg1/g;->b:Z

    return-void
.end method

.method public y(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p0, p1}, Lg1/g;->d(Ljava/lang/Object;)Lg1/a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0, p2}, Lg1/a;->b0(Ljava/lang/String;)V

    iget-object v0, p0, Lg1/g;->e:Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lg1/g;->e:Ljava/util/HashMap;

    invoke-virtual {v1, p2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lg1/g;->e:Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Ljava/util/ArrayList;

    :goto_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method public z(Lg1/d;)Lg1/g;
    .locals 1

    iget-object v0, p0, Lg1/g;->f:Lg1/a;

    invoke-virtual {v0, p1}, Lg1/a;->f0(Lg1/d;)Lg1/a;

    return-object p0
.end method
