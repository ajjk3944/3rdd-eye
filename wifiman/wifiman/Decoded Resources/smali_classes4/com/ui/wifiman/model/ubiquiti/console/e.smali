.class public final Lcom/ui/wifiman/model/ubiquiti/console/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/ubiquiti/console/e$a;,
        Lcom/ui/wifiman/model/ubiquiti/console/e$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lh9/a;

.field private final c:Lcom/ui/common/semver/SemVer;

.field private final d:Ljava/lang/String;

.field private final e:LW7/c;

.field private final f:Ljava/lang/String;

.field private final g:Ljava/lang/Boolean;

.field private final h:Ljava/lang/String;

.field private final i:Ljava/lang/String;

.field private final j:Lxa/a$d;

.field private final k:Ljava/lang/Boolean;

.field private final l:Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;


# direct methods
.method private constructor <init>(Ljava/lang/String;Lh9/a;Lcom/ui/common/semver/SemVer;Ljava/lang/String;LW7/c;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lxa/a$d;Ljava/lang/Boolean;Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;Lcom/ui/wifiman/model/ubiquiti/console/e$a$c;Lcom/ui/wifiman/model/ubiquiti/console/e$a$a;)V
    .locals 0

    const-string p13, "id"

    invoke-static {p1, p13}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->a:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->b:Lh9/a;

    .line 5
    iput-object p3, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->c:Lcom/ui/common/semver/SemVer;

    .line 6
    iput-object p4, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->d:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->e:LW7/c;

    .line 8
    iput-object p6, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->f:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->g:Ljava/lang/Boolean;

    .line 10
    iput-object p8, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->h:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->i:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->j:Lxa/a$d;

    .line 13
    iput-object p11, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->k:Ljava/lang/Boolean;

    .line 14
    iput-object p12, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->l:Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lh9/a;Lcom/ui/common/semver/SemVer;Ljava/lang/String;LW7/c;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lxa/a$d;Ljava/lang/Boolean;Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;Lcom/ui/wifiman/model/ubiquiti/console/e$a$c;Lcom/ui/wifiman/model/ubiquiti/console/e$a$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 19

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x2

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v5, v2

    goto :goto_0

    :cond_0
    move-object/from16 v5, p2

    :goto_0
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_1

    move-object v6, v2

    goto :goto_1

    :cond_1
    move-object/from16 v6, p3

    :goto_1
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_2

    move-object v7, v2

    goto :goto_2

    :cond_2
    move-object/from16 v7, p4

    :goto_2
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_3

    move-object v8, v2

    goto :goto_3

    :cond_3
    move-object/from16 v8, p5

    :goto_3
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_4

    move-object v9, v2

    goto :goto_4

    :cond_4
    move-object/from16 v9, p6

    :goto_4
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_5

    move-object v10, v2

    goto :goto_5

    :cond_5
    move-object/from16 v10, p7

    :goto_5
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_6

    move-object v11, v2

    goto :goto_6

    :cond_6
    move-object/from16 v11, p8

    :goto_6
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_7

    move-object v12, v2

    goto :goto_7

    :cond_7
    move-object/from16 v12, p9

    :goto_7
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_8

    move-object v13, v2

    goto :goto_8

    :cond_8
    move-object/from16 v13, p10

    :goto_8
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_9

    move-object v14, v2

    goto :goto_9

    :cond_9
    move-object/from16 v14, p11

    :goto_9
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_a

    move-object v15, v2

    goto :goto_a

    :cond_a
    move-object/from16 v15, p12

    :goto_a
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_b

    move-object/from16 v16, v2

    goto :goto_b

    :cond_b
    move-object/from16 v16, p13

    :goto_b
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_c

    move-object/from16 v17, v2

    goto :goto_c

    :cond_c
    move-object/from16 v17, p14

    :goto_c
    const/16 v18, 0x0

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    .line 15
    invoke-direct/range {v3 .. v18}, Lcom/ui/wifiman/model/ubiquiti/console/e;-><init>(Ljava/lang/String;Lh9/a;Lcom/ui/common/semver/SemVer;Ljava/lang/String;LW7/c;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lxa/a$d;Ljava/lang/Boolean;Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;Lcom/ui/wifiman/model/ubiquiti/console/e$a$c;Lcom/ui/wifiman/model/ubiquiti/console/e$a$a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lh9/a;Lcom/ui/common/semver/SemVer;Ljava/lang/String;LW7/c;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lxa/a$d;Ljava/lang/Boolean;Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;Lcom/ui/wifiman/model/ubiquiti/console/e$a$c;Lcom/ui/wifiman/model/ubiquiti/console/e$a$a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p14}, Lcom/ui/wifiman/model/ubiquiti/console/e;-><init>(Ljava/lang/String;Lh9/a;Lcom/ui/common/semver/SemVer;Ljava/lang/String;LW7/c;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lxa/a$d;Ljava/lang/Boolean;Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;Lcom/ui/wifiman/model/ubiquiti/console/e$a$c;Lcom/ui/wifiman/model/ubiquiti/console/e$a$a;)V

    return-void
.end method

.method public static synthetic b(Lcom/ui/wifiman/model/ubiquiti/console/e;Ljava/lang/String;Lh9/a;Lcom/ui/common/semver/SemVer;Ljava/lang/String;LW7/c;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lxa/a$d;Ljava/lang/Boolean;Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;Lcom/ui/wifiman/model/ubiquiti/console/e$a$c;Lcom/ui/wifiman/model/ubiquiti/console/e$a$a;ILjava/lang/Object;)Lcom/ui/wifiman/model/ubiquiti/console/e;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p15

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/ui/wifiman/model/ubiquiti/console/e;->a:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/ui/wifiman/model/ubiquiti/console/e;->b:Lh9/a;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/ui/wifiman/model/ubiquiti/console/e;->c:Lcom/ui/common/semver/SemVer;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/ui/wifiman/model/ubiquiti/console/e;->d:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/ui/wifiman/model/ubiquiti/console/e;->e:LW7/c;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/ui/wifiman/model/ubiquiti/console/e;->f:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/ui/wifiman/model/ubiquiti/console/e;->g:Ljava/lang/Boolean;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/ui/wifiman/model/ubiquiti/console/e;->h:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/ui/wifiman/model/ubiquiti/console/e;->i:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/ui/wifiman/model/ubiquiti/console/e;->j:Lxa/a$d;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/ui/wifiman/model/ubiquiti/console/e;->k:Ljava/lang/Boolean;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/ui/wifiman/model/ubiquiti/console/e;->l:Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    const/4 v15, 0x0

    if-eqz v14, :cond_c

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v14, v15

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v1, v1, 0x2000

    if-eqz v1, :cond_d

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    move-object/from16 p2, v3

    move-object/from16 p3, v4

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v12

    move-object/from16 p12, v13

    move-object/from16 p13, v14

    move-object/from16 p14, v15

    invoke-virtual/range {p0 .. p14}, Lcom/ui/wifiman/model/ubiquiti/console/e;->a(Ljava/lang/String;Lh9/a;Lcom/ui/common/semver/SemVer;Ljava/lang/String;LW7/c;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lxa/a$d;Ljava/lang/Boolean;Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;Lcom/ui/wifiman/model/ubiquiti/console/e$a$c;Lcom/ui/wifiman/model/ubiquiti/console/e$a$a;)Lcom/ui/wifiman/model/ubiquiti/console/e;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lh9/a;Lcom/ui/common/semver/SemVer;Ljava/lang/String;LW7/c;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lxa/a$d;Ljava/lang/Boolean;Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;Lcom/ui/wifiman/model/ubiquiti/console/e$a$c;Lcom/ui/wifiman/model/ubiquiti/console/e$a$a;)Lcom/ui/wifiman/model/ubiquiti/console/e;
    .locals 17

    const-string v0, "id"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/console/e;

    const/16 v16, 0x0

    move-object v1, v0

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    invoke-direct/range {v1 .. v16}, Lcom/ui/wifiman/model/ubiquiti/console/e;-><init>(Ljava/lang/String;Lh9/a;Lcom/ui/common/semver/SemVer;Ljava/lang/String;LW7/c;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lxa/a$d;Ljava/lang/Boolean;Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;Lcom/ui/wifiman/model/ubiquiti/console/e$a$c;Lcom/ui/wifiman/model/ubiquiti/console/e$a$a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->i:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->g:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final e()Lcom/ui/common/semver/SemVer;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->c:Lcom/ui/common/semver/SemVer;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/model/ubiquiti/console/e;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/console/e;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/console/e;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->h(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->b:Lh9/a;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/console/e;->b:Lh9/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->c:Lcom/ui/common/semver/SemVer;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/console/e;->c:Lcom/ui/common/semver/SemVer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->d:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/console/e;->d:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->e:LW7/c;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/console/e;->e:LW7/c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->f:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/console/e;->f:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->g:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/console/e;->g:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->h:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/console/e;->h:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->i:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/console/e;->i:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->j:Lxa/a$d;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/console/e;->j:Lxa/a$d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->k:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/console/e;->k:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->l:Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;

    iget-object p1, p1, Lcom/ui/wifiman/model/ubiquiti/console/e;->l:Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    const/4 p1, 0x0

    invoke-static {p1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    invoke-static {p1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_f

    return v2

    :cond_f
    return v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final g()LW7/c;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->e:LW7/c;

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->f:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->j(Ljava/lang/String;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->b:Lh9/a;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lh9/a;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->c:Lcom/ui/common/semver/SemVer;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/ui/common/semver/SemVer;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->d:Ljava/lang/String;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->e:LW7/c;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, LW7/c;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->f:Ljava/lang/String;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->g:Ljava/lang/Boolean;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->h:Ljava/lang/String;

    if-nez v1, :cond_6

    move v1, v2

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->i:Ljava/lang/String;

    if-nez v1, :cond_7

    move v1, v2

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->j:Lxa/a$d;

    if-nez v1, :cond_8

    move v1, v2

    goto :goto_8

    :cond_8
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_8
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->k:Ljava/lang/Boolean;

    if-nez v1, :cond_9

    move v1, v2

    goto :goto_9

    :cond_9
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_9
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->l:Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;

    if-nez v1, :cond_a

    goto :goto_a

    :cond_a
    invoke-virtual {v1}, Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;->hashCode()I

    move-result v2

    :goto_a
    add-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x3c1

    return v0
.end method

.method public final i()Lh9/a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->b:Lh9/a;

    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->h:Ljava/lang/String;

    return-object v0
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final l()Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->l:Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;

    return-object v0
.end method

.method public final m()Lxa/a$d;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->j:Lxa/a$d;

    return-object v0
.end method

.method public final n()Z
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->l:Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;->b()Lcom/ui/common/semver/SemVer;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public final o()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->k:Ljava/lang/Boolean;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->b:Lh9/a;

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->c:Lcom/ui/common/semver/SemVer;

    iget-object v3, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->d:Ljava/lang/String;

    iget-object v4, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->e:LW7/c;

    iget-object v5, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->f:Ljava/lang/String;

    iget-object v6, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->g:Ljava/lang/Boolean;

    iget-object v7, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->h:Ljava/lang/String;

    iget-object v8, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->i:Ljava/lang/String;

    iget-object v9, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->j:Lxa/a$d;

    iget-object v10, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->k:Ljava/lang/Boolean;

    iget-object v11, p0, Lcom/ui/wifiman/model/ubiquiti/console/e;->l:Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "UnifiConsole(id="

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", mac="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", fwVersion="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", name="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", location="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", locationText="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", available="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", model="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", anonid="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", product="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isOwnedByMe="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", network="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", protect="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", access="

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
