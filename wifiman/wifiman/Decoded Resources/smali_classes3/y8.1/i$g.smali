.class final Ly8/i$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly8/i;-><init>(Ly8/a$b;Ly8/r;Ljd/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ly8/i$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ly8/i$g;

    invoke-direct {v0}, Ly8/i$g;-><init>()V

    sput-object v0, Ly8/i$g;->a:Ly8/i$g;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldd/i;

    check-cast p2, Ll9/a;

    check-cast p3, Ll9/a;

    invoke-virtual {p0, p1, p2, p3}, Ly8/i$g;->b(Ldd/i;Ll9/a;Ll9/a;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ldd/i;Ll9/a;Ll9/a;)Ljava/util/List;
    .locals 18

    const-string/jumbo v0, "internetStats"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    move-object/from16 v2, p2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p2 .. p2}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTe/B0;

    invoke-virtual/range {p3 .. p3}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LTe/B0;

    invoke-static {}, LZg/v;->c()Ljava/util/List;

    move-result-object v3

    sget-object v4, LTe/N;->PRIMARY:LTe/N;

    if-eqz v0, :cond_0

    :goto_0
    move-object v7, v4

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    goto :goto_0

    :goto_1
    sget-object v4, LN9/b;->a:LN9/b;

    invoke-virtual {v4}, LN9/b;->B()Ls9/b;

    move-result-object v8

    new-instance v9, Ls9/d$b;

    const v4, 0x7f110134

    invoke-direct {v9, v4}, Ls9/d$b;-><init>(I)V

    new-instance v12, Ls9/d$c;

    invoke-virtual/range {p1 .. p1}, Ldd/i;->c()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v12, v4}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual/range {p1 .. p1}, Ldd/i;->d()Lb8/b;

    move-result-object v4

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    invoke-static {v4, v5}, LNe/d;->c(Lb8/b;Z)Ls9/d;

    move-result-object v4

    if-nez v4, :cond_1

    goto :goto_3

    :cond_1
    :goto_2
    move-object v13, v4

    goto :goto_4

    :cond_2
    :goto_3
    new-instance v4, Ls9/d$b;

    const v6, 0x7f1103c6

    invoke-direct {v4, v6}, Ls9/d$b;-><init>(I)V

    goto :goto_2

    :goto_4
    invoke-virtual/range {p1 .. p1}, Ldd/i;->d()Lb8/b;

    move-result-object v1

    const/4 v4, 0x0

    if-nez v1, :cond_3

    move v14, v5

    goto :goto_5

    :cond_3
    move v14, v4

    :goto_5
    new-instance v1, LTe/B0;

    const-string/jumbo v6, "internet"

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x20

    const/16 v17, 0x0

    move-object v5, v1

    invoke-direct/range {v5 .. v17}, LTe/B0;-><init>(Ljava/lang/String;LTe/N;Ls9/a;Ls9/d;ZLDe/a;Ls9/d;Ls9/d;ZLs9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz v0, :cond_4

    invoke-interface {v3, v4, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    :cond_4
    if-eqz v2, :cond_5

    invoke-interface {v3, v4, v2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    :cond_5
    invoke-static {v3}, LZg/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
