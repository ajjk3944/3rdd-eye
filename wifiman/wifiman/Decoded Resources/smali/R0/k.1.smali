.class public final LR0/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:LR0/Q;

.field private b:LR0/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v6, LR0/Q;

    invoke-static {}, LL0/e;->i()LL0/d;

    move-result-object v1

    sget-object v0, LL0/S;->b:LL0/S$a;

    invoke-virtual {v0}, LL0/S$a;->a()J

    move-result-wide v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LR0/Q;-><init>(LL0/d;JLL0/S;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v6, p0, LR0/k;->a:LR0/Q;

    new-instance v0, LR0/l;

    iget-object v1, p0, LR0/k;->a:LR0/Q;

    invoke-virtual {v1}, LR0/Q;->f()LL0/d;

    move-result-object v1

    iget-object v2, p0, LR0/k;->a:LR0/Q;

    invoke-virtual {v2}, LR0/Q;->h()J

    move-result-wide v2

    invoke-direct {v0, v1, v2, v3, v4}, LR0/l;-><init>(LL0/d;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, LR0/k;->b:LR0/l;

    return-void
.end method

.method public static final synthetic a(LR0/k;LR0/i;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, LR0/k;->e(LR0/i;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final c(Ljava/util/List;LR0/i;)Ljava/lang/String;
    .locals 11

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Error while applying EditCommand batch to buffer (length="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LR0/k;->b:LR0/l;

    invoke-virtual {v1}, LR0/l;->h()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", composition="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LR0/k;->b:LR0/l;

    invoke-virtual {v1}, LR0/l;->d()LL0/S;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", selection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LR0/k;->b:LR0/l;

    invoke-virtual {v1}, LR0/l;->i()J

    move-result-wide v1

    invoke-static {v1, v2}, LL0/S;->q(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "):"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "append(value)"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xa

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v0, "append(\'\\n\')"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v7, LR0/k$a;

    invoke-direct {v7, p2, p0}, LR0/k$a;-><init>(LR0/i;LR0/k;)V

    const/16 v8, 0x3c

    const/4 v9, 0x0

    const-string v2, "\n"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, v10

    invoke-static/range {v0 .. v9}, LZg/v;->x0(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/Appendable;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "StringBuilder().apply(builderAction).toString()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final e(LR0/i;)Ljava/lang/String;
    .locals 4

    instance-of v0, p1, LR0/a;

    const/16 v1, 0x29

    const-string v2, ", newCursorPosition="

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "CommitTextCommand(text.length="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast p1, LR0/a;

    invoke-virtual {p1}, LR0/a;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LR0/a;->b()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_0

    :cond_0
    instance-of v0, p1, LR0/O;

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SetComposingTextCommand(text.length="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast p1, LR0/O;

    invoke-virtual {p1}, LR0/O;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LR0/O;->b()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    instance-of v0, p1, LR0/N;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_2
    instance-of v0, p1, LR0/g;

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_3
    instance-of v0, p1, LR0/h;

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_4
    instance-of v0, p1, LR0/P;

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_5
    instance-of v0, p1, LR0/n;

    if-eqz v0, :cond_6

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_6
    instance-of v0, p1, LR0/f;

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown EditCommand: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object p1

    invoke-interface {p1}, Lth/d;->v()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_8

    const-string p1, "{anonymous EditCommand}"

    :cond_8
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method


# virtual methods
.method public final b(Ljava/util/List;)LR0/Q;
    .locals 7

    const/4 v0, 0x0

    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    const/4 v2, 0x0

    move-object v3, v0

    :goto_0
    if-ge v2, v1, :cond_0

    :try_start_1
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LR0/i;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :try_start_2
    iget-object v3, p0, LR0/k;->b:LR0/l;

    invoke-interface {v4, v3}, LR0/i;->a(LR0/l;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    add-int/lit8 v2, v2, 0x1

    move-object v3, v4

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v3, v4

    goto :goto_3

    :catch_1
    move-exception v0

    goto :goto_3

    :cond_0
    iget-object p1, p0, LR0/k;->b:LR0/l;

    invoke-virtual {p1}, LR0/l;->s()LL0/d;

    move-result-object v2

    iget-object p1, p0, LR0/k;->b:LR0/l;

    invoke-virtual {p1}, LR0/l;->i()J

    move-result-wide v3

    invoke-static {v3, v4}, LL0/S;->b(J)LL0/S;

    move-result-object p1

    invoke-virtual {p1}, LL0/S;->r()J

    iget-object v1, p0, LR0/k;->a:LR0/Q;

    invoke-virtual {v1}, LR0/Q;->h()J

    move-result-wide v5

    invoke-static {v5, v6}, LL0/S;->m(J)Z

    move-result v1

    if-nez v1, :cond_1

    move-object v0, p1

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, LL0/S;->r()J

    move-result-wide v0

    :goto_1
    move-wide v3, v0

    goto :goto_2

    :cond_2
    invoke-static {v3, v4}, LL0/S;->k(J)I

    move-result p1

    invoke-static {v3, v4}, LL0/S;->l(J)I

    move-result v0

    invoke-static {p1, v0}, LL0/T;->b(II)J

    move-result-wide v0

    goto :goto_1

    :goto_2
    iget-object p1, p0, LR0/k;->b:LR0/l;

    invoke-virtual {p1}, LR0/l;->d()LL0/S;

    move-result-object v5

    new-instance p1, LR0/Q;

    const/4 v6, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, LR0/Q;-><init>(LL0/d;JLL0/S;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, LR0/k;->a:LR0/Q;

    return-object p1

    :catch_2
    move-exception v1

    move-object v3, v0

    move-object v0, v1

    :goto_3
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {p0, p1, v3}, LR0/k;->c(Ljava/util/List;LR0/i;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final d(LR0/Q;LR0/Z;)V
    .locals 9

    invoke-virtual {p1}, LR0/Q;->g()LL0/S;

    move-result-object v0

    iget-object v1, p0, LR0/k;->b:LR0/l;

    invoke-virtual {v1}, LR0/l;->d()LL0/S;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, LR0/k;->a:LR0/Q;

    invoke-virtual {v1}, LR0/Q;->f()LL0/d;

    move-result-object v1

    invoke-virtual {p1}, LR0/Q;->f()LL0/d;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_0

    new-instance v1, LR0/l;

    invoke-virtual {p1}, LR0/Q;->f()LL0/d;

    move-result-object v4

    invoke-virtual {p1}, LR0/Q;->h()J

    move-result-wide v5

    const/4 v7, 0x0

    invoke-direct {v1, v4, v5, v6, v7}, LR0/l;-><init>(LL0/d;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, p0, LR0/k;->b:LR0/l;

    goto :goto_0

    :cond_0
    iget-object v1, p0, LR0/k;->a:LR0/Q;

    invoke-virtual {v1}, LR0/Q;->h()J

    move-result-wide v4

    invoke-virtual {p1}, LR0/Q;->h()J

    move-result-wide v6

    invoke-static {v4, v5, v6, v7}, LL0/S;->g(JJ)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, LR0/k;->b:LR0/l;

    invoke-virtual {p1}, LR0/Q;->h()J

    move-result-wide v4

    invoke-static {v4, v5}, LL0/S;->l(J)I

    move-result v4

    invoke-virtual {p1}, LR0/Q;->h()J

    move-result-wide v5

    invoke-static {v5, v6}, LL0/S;->k(J)I

    move-result v5

    invoke-virtual {v1, v4, v5}, LR0/l;->p(II)V

    move v8, v3

    move v3, v2

    move v2, v8

    goto :goto_0

    :cond_1
    move v2, v3

    :goto_0
    invoke-virtual {p1}, LR0/Q;->g()LL0/S;

    move-result-object v1

    if-nez v1, :cond_2

    iget-object v1, p0, LR0/k;->b:LR0/l;

    invoke-virtual {v1}, LR0/l;->a()V

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, LR0/Q;->g()LL0/S;

    move-result-object v1

    invoke-virtual {v1}, LL0/S;->r()J

    move-result-wide v4

    invoke-static {v4, v5}, LL0/S;->h(J)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, LR0/k;->b:LR0/l;

    invoke-virtual {p1}, LR0/Q;->g()LL0/S;

    move-result-object v4

    invoke-virtual {v4}, LL0/S;->r()J

    move-result-wide v4

    invoke-static {v4, v5}, LL0/S;->l(J)I

    move-result v4

    invoke-virtual {p1}, LR0/Q;->g()LL0/S;

    move-result-object v5

    invoke-virtual {v5}, LL0/S;->r()J

    move-result-wide v5

    invoke-static {v5, v6}, LL0/S;->k(J)I

    move-result v5

    invoke-virtual {v1, v4, v5}, LR0/l;->n(II)V

    :cond_3
    :goto_1
    if-nez v2, :cond_4

    if-nez v3, :cond_5

    if-nez v0, :cond_5

    :cond_4
    iget-object v0, p0, LR0/k;->b:LR0/l;

    invoke-virtual {v0}, LR0/l;->a()V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LR0/Q;->d(LR0/Q;LL0/d;JLL0/S;ILjava/lang/Object;)LR0/Q;

    move-result-object p1

    :cond_5
    iget-object v0, p0, LR0/k;->a:LR0/Q;

    iput-object p1, p0, LR0/k;->a:LR0/Q;

    if-eqz p2, :cond_6

    invoke-virtual {p2, v0, p1}, LR0/Z;->d(LR0/Q;LR0/Q;)Z

    :cond_6
    return-void
.end method

.method public final f()LR0/Q;
    .locals 1

    iget-object v0, p0, LR0/k;->a:LR0/Q;

    return-object v0
.end method
