.class final LNj/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMj/e;


# instance fields
.field private final a:Ljava/lang/reflect/Type;

.field private final b:Lgg/y;

.field private final c:Z

.field private final d:Z

.field private final e:Z

.field private final f:Z

.field private final g:Z

.field private final h:Z

.field private final i:Z


# direct methods
.method constructor <init>(Ljava/lang/reflect/Type;Lgg/y;ZZZZZZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNj/f;->a:Ljava/lang/reflect/Type;

    iput-object p2, p0, LNj/f;->b:Lgg/y;

    iput-boolean p3, p0, LNj/f;->c:Z

    iput-boolean p4, p0, LNj/f;->d:Z

    iput-boolean p5, p0, LNj/f;->e:Z

    iput-boolean p6, p0, LNj/f;->f:Z

    iput-boolean p7, p0, LNj/f;->g:Z

    iput-boolean p8, p0, LNj/f;->h:Z

    iput-boolean p9, p0, LNj/f;->i:Z

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/reflect/Type;
    .locals 1

    iget-object v0, p0, LNj/f;->a:Ljava/lang/reflect/Type;

    return-object v0
.end method

.method public b(LMj/d;)Ljava/lang/Object;
    .locals 1

    iget-boolean v0, p0, LNj/f;->c:Z

    if-eqz v0, :cond_0

    new-instance v0, LNj/b;

    invoke-direct {v0, p1}, LNj/b;-><init>(LMj/d;)V

    goto :goto_0

    :cond_0
    new-instance v0, LNj/c;

    invoke-direct {v0, p1}, LNj/c;-><init>(LMj/d;)V

    :goto_0
    iget-boolean p1, p0, LNj/f;->d:Z

    if-eqz p1, :cond_1

    new-instance p1, LNj/e;

    invoke-direct {p1, v0}, LNj/e;-><init>(Lgg/s;)V

    :goto_1
    move-object v0, p1

    goto :goto_2

    :cond_1
    iget-boolean p1, p0, LNj/f;->e:Z

    if-eqz p1, :cond_2

    new-instance p1, LNj/a;

    invoke-direct {p1, v0}, LNj/a;-><init>(Lgg/s;)V

    goto :goto_1

    :cond_2
    :goto_2
    iget-object p1, p0, LNj/f;->b:Lgg/y;

    if-eqz p1, :cond_3

    invoke-virtual {v0, p1}, Lgg/s;->M0(Lgg/y;)Lgg/s;

    move-result-object v0

    :cond_3
    iget-boolean p1, p0, LNj/f;->f:Z

    if-eqz p1, :cond_4

    sget-object p1, Lgg/a;->MISSING:Lgg/a;

    invoke-virtual {v0, p1}, Lgg/s;->d1(Lgg/a;)Lgg/i;

    move-result-object p1

    return-object p1

    :cond_4
    iget-boolean p1, p0, LNj/f;->g:Z

    if-eqz p1, :cond_5

    invoke-virtual {v0}, Lgg/s;->F0()Lgg/z;

    move-result-object p1

    return-object p1

    :cond_5
    iget-boolean p1, p0, LNj/f;->h:Z

    if-eqz p1, :cond_6

    invoke-virtual {v0}, Lgg/s;->E0()Lgg/n;

    move-result-object p1

    return-object p1

    :cond_6
    iget-boolean p1, p0, LNj/f;->i:Z

    if-eqz p1, :cond_7

    invoke-virtual {v0}, Lgg/s;->f0()Lgg/b;

    move-result-object p1

    return-object p1

    :cond_7
    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method
