.class public abstract LXb/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LXb/e$a;
    }
.end annotation


# static fields
.field private static final a:LXb/e$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LXb/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LXb/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LXb/e;->a:LXb/e$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Lgg/i;
.end method

.method public abstract b(I)Lgg/i;
.end method

.method public final c(Lb8/c;)Lgg/i;
    .locals 1

    const-string/jumbo v0, "connectionType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LQb/b;->a(Lb8/c;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, LXb/e;->d(Ljava/lang/String;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public abstract d(Ljava/lang/String;)Lgg/i;
.end method

.method public final e(Lb8/c;Ljava/lang/String;I)Lgg/i;
    .locals 1

    const-string/jumbo v0, "connectionType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LQb/b;->a(Lb8/c;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2, p3}, LXb/e;->f(Ljava/lang/String;Ljava/lang/String;I)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public abstract f(Ljava/lang/String;Ljava/lang/String;I)Lgg/i;
.end method

.method public varargs g([J)Z
    .locals 3

    const-string/jumbo v0, "resultId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v0

    invoke-virtual {p0, v0}, LXb/e;->j([J)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge v0, v2, :cond_0

    return v1

    :cond_0
    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v0

    invoke-virtual {p0, v0}, LXb/e;->h([J)I

    move-result v0

    if-ge v0, v2, :cond_1

    return v1

    :cond_1
    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object p1

    invoke-virtual {p0, p1}, LXb/e;->i([J)I

    move-result p1

    if-ge p1, v2, :cond_2

    return v1

    :cond_2
    return v2
.end method

.method protected varargs abstract h([J)I
.end method

.method protected varargs abstract i([J)I
.end method

.method protected varargs abstract j([J)I
.end method

.method public abstract k(J)Lgg/i;
.end method

.method public l(LXb/d;)LXb/d;
    .locals 40

    move-object/from16 v0, p0

    const-string/jumbo v1, "result"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, LXb/d;->b()LXb/b;

    move-result-object v1

    invoke-virtual {v0, v1}, LXb/e;->n(LXb/b;)J

    move-result-wide v33

    const-wide/16 v35, 0x0

    cmp-long v1, v33, v35

    if-ltz v1, :cond_3

    invoke-virtual/range {p1 .. p1}, LXb/d;->a()LXb/a;

    move-result-object v3

    const/16 v20, 0x7ffe

    const/16 v21, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-wide/from16 v4, v33

    invoke-static/range {v3 .. v21}, LXb/a;->b(LXb/a;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/List;ILjava/lang/Object;)LXb/a;

    move-result-object v1

    invoke-virtual {v0, v1}, LXb/e;->m(LXb/a;)J

    move-result-wide v3

    cmp-long v3, v3, v35

    if-ltz v3, :cond_2

    invoke-virtual/range {p1 .. p1}, LXb/d;->c()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v3, v4}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v6, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v37

    :goto_0
    invoke-interface/range {v37 .. v37}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface/range {v37 .. v37}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v38, v3

    check-cast v38, LXb/c;

    move-object/from16 v3, v38

    const v31, 0x1fffffd

    const/16 v32, 0x0

    const-wide/16 v4, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    move-object/from16 v39, v1

    move-object v1, v6

    move-wide/from16 v6, v33

    invoke-static/range {v3 .. v32}, LXb/c;->b(LXb/c;JJLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/ArrayList;Ljava/lang/Long;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)LXb/c;

    move-result-object v3

    invoke-virtual {v0, v3}, LXb/e;->o(LXb/c;)J

    move-result-wide v4

    cmp-long v3, v4, v35

    if-ltz v3, :cond_0

    const v31, 0x1fffffc

    const/16 v32, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    move-object/from16 v3, v38

    move-wide/from16 v6, v33

    invoke-static/range {v3 .. v32}, LXb/c;->b(LXb/c;JJLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/ArrayList;Ljava/lang/Long;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)LXb/c;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v6, v1

    move-object/from16 v1, v39

    goto/16 :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :cond_1
    move-object/from16 v39, v1

    move-object v1, v6

    new-instance v11, LXb/d;

    invoke-virtual/range {p1 .. p1}, LXb/d;->b()LXb/b;

    move-result-object v2

    const/16 v9, 0xe

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    move-wide/from16 v3, v33

    invoke-static/range {v2 .. v10}, LXb/b;->b(LXb/b;JLjava/lang/String;Ljava/lang/String;JILjava/lang/Object;)LXb/b;

    move-result-object v2

    move-object/from16 v3, v39

    invoke-direct {v11, v2, v3, v1}, LXb/d;-><init>(LXb/b;LXb/a;Ljava/util/List;)V

    return-object v11

    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1
.end method

.method protected abstract m(LXb/a;)J
.end method

.method protected abstract n(LXb/b;)J
.end method

.method protected abstract o(LXb/c;)J
.end method

.method public p(LXb/d;)Z
    .locals 3

    const-string/jumbo v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LXb/d;->b()LXb/b;

    move-result-object v0

    invoke-virtual {p0, v0}, LXb/e;->r(LXb/b;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge v0, v2, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, LXb/d;->a()LXb/a;

    move-result-object v0

    invoke-virtual {p0, v0}, LXb/e;->q(LXb/a;)I

    move-result v0

    if-ge v0, v2, :cond_1

    return v1

    :cond_1
    invoke-virtual {p1}, LXb/d;->c()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LXb/c;

    invoke-virtual {p0, v0}, LXb/e;->s(LXb/c;)I

    move-result v0

    if-ge v0, v2, :cond_2

    return v1

    :cond_3
    return v2
.end method

.method protected abstract q(LXb/a;)I
.end method

.method protected abstract r(LXb/b;)I
.end method

.method protected abstract s(LXb/c;)I
.end method
