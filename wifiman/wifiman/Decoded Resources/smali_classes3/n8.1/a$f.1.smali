.class final Ln8/a$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln8/a;-><init>(Lorg/kodein/di/DI;Ln8/a$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ln8/a;


# direct methods
.method constructor <init>(Ln8/a;)V
    .locals 0

    iput-object p1, p0, Ln8/a$f;->a:Ln8/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LU7/b;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Ln8/a$f;->c(LU7/b;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LU7/b;)Ljava/lang/CharSequence;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LCc/a;

    invoke-virtual {p0, p1}, Ln8/a$f;->b(LCc/a;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final b(LCc/a;)Ljava/util/List;
    .locals 21

    const-string/jumbo v0, "device"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v2, p0

    iget-object v11, v2, Ln8/a$f;->a:Ln8/a;

    invoke-interface/range {p1 .. p1}, LCc/a;->p()Lwc/a;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lwc/a;->m()Ljava/util/Set;

    move-result-object v3

    if-eqz v3, :cond_2

    move-object v4, v3

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_2

    new-instance v5, Ls9/d$b;

    const v4, 0x7f110041

    invoke-direct {v5, v4}, Ls9/d$b;-><init>(I)V

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v4

    const/4 v6, 0x1

    if-ne v4, v6, :cond_1

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3}, LZg/v;->p0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LU7/b;

    invoke-static {v3}, Lk8/a;->a(LU7/b;)Ls9/d;

    move-result-object v3

    move-object v7, v3

    goto :goto_1

    :cond_1
    new-instance v4, Ls9/d$a;

    move-object v12, v3

    check-cast v12, Ljava/lang/Iterable;

    new-instance v18, Ln8/b;

    invoke-direct/range {v18 .. v18}, Ln8/b;-><init>()V

    const/16 v19, 0x1f

    const/16 v20, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v12 .. v20}, LZg/v;->z0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ln8/a$f$a;

    invoke-direct {v7, v3}, Ln8/a$f$a;-><init>(Ljava/util/Set;)V

    invoke-direct {v4, v6, v7}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    move-object v7, v4

    :goto_1
    const/16 v9, 0x14

    const/4 v10, 0x0

    const-string/jumbo v4, "type"

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v3, v11

    invoke-static/range {v3 .. v10}, Ln8/a;->I(Ln8/a;Ljava/lang/String;Ls9/d;Ls9/d;Ls9/d;ZILjava/lang/Object;)LKe/a$b;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-interface/range {p1 .. p1}, LCc/a;->p()Lwc/a;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lwc/a;->a()Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    new-instance v5, Ls9/d$b;

    const v1, 0x7f110040

    invoke-direct {v5, v1}, Ls9/d$b;-><init>(I)V

    new-instance v7, Ls9/d$a;

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    new-instance v6, Ln8/a$f$b;

    invoke-direct {v6, v3, v4}, Ln8/a$f$b;-><init>(J)V

    invoke-direct {v7, v1, v6}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    const/16 v9, 0x14

    const/4 v10, 0x0

    const-string/jumbo v4, "advertisingIntenval"

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v3, v11

    invoke-static/range {v3 .. v10}, Ln8/a;->I(Ln8/a;Ljava/lang/String;Ls9/d;Ls9/d;Ls9/d;ZILjava/lang/Object;)LKe/a$b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    return-object v0
.end method
