.class public Lpi/u;
.super Lpi/b;
.source "SourceFile"


# instance fields
.field private final d:LBh/e;

.field private final e:Ljava/util/List;

.field private final f:Ljava/util/Collection;


# direct methods
.method public constructor <init>(LBh/e;Ljava/util/List;Ljava/util/Collection;Loi/n;)V
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, Lpi/u;->H(I)V

    :cond_0
    if-nez p2, :cond_1

    const/4 v0, 0x1

    invoke-static {v0}, Lpi/u;->H(I)V

    :cond_1
    if-nez p3, :cond_2

    const/4 v0, 0x2

    invoke-static {v0}, Lpi/u;->H(I)V

    :cond_2
    if-nez p4, :cond_3

    const/4 v0, 0x3

    invoke-static {v0}, Lpi/u;->H(I)V

    :cond_3
    invoke-direct {p0, p4}, Lpi/b;-><init>(Loi/n;)V

    iput-object p1, p0, Lpi/u;->d:LBh/e;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lpi/u;->e:Ljava/util/List;

    invoke-static {p3}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object p1

    iput-object p1, p0, Lpi/u;->f:Ljava/util/Collection;

    return-void
.end method

.method private static synthetic H(I)V
    .locals 10

    const/4 v0, 0x7

    const/4 v1, 0x6

    const/4 v2, 0x5

    const/4 v3, 0x4

    if-eq p0, v3, :cond_0

    if-eq p0, v2, :cond_0

    if-eq p0, v1, :cond_0

    if-eq p0, v0, :cond_0

    const-string v4, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    const-string v4, "@NotNull method %s.%s must not return null"

    :goto_0
    const/4 v5, 0x2

    if-eq p0, v3, :cond_1

    if-eq p0, v2, :cond_1

    if-eq p0, v1, :cond_1

    if-eq p0, v0, :cond_1

    const/4 v6, 0x3

    goto :goto_1

    :cond_1
    move v6, v5

    :goto_1
    new-array v6, v6, [Ljava/lang/Object;

    const-string v7, "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl"

    const/4 v8, 0x0

    packed-switch p0, :pswitch_data_0

    const-string v9, "classDescriptor"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_0
    aput-object v7, v6, v8

    goto :goto_2

    :pswitch_1
    const-string v9, "storageManager"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_2
    const-string v9, "supertypes"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_3
    const-string v9, "parameters"

    aput-object v9, v6, v8

    :goto_2
    const/4 v8, 0x1

    if-eq p0, v3, :cond_5

    if-eq p0, v2, :cond_4

    if-eq p0, v1, :cond_3

    if-eq p0, v0, :cond_2

    aput-object v7, v6, v8

    goto :goto_3

    :cond_2
    const-string v7, "getSupertypeLoopChecker"

    aput-object v7, v6, v8

    goto :goto_3

    :cond_3
    const-string v7, "computeSupertypes"

    aput-object v7, v6, v8

    goto :goto_3

    :cond_4
    const-string v7, "getDeclarationDescriptor"

    aput-object v7, v6, v8

    goto :goto_3

    :cond_5
    const-string v7, "getParameters"

    aput-object v7, v6, v8

    :goto_3
    if-eq p0, v3, :cond_6

    if-eq p0, v2, :cond_6

    if-eq p0, v1, :cond_6

    if-eq p0, v0, :cond_6

    const-string v7, "<init>"

    aput-object v7, v6, v5

    :cond_6
    invoke-static {v4, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    if-eq p0, v3, :cond_7

    if-eq p0, v2, :cond_7

    if-eq p0, v1, :cond_7

    if-eq p0, v0, :cond_7

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_4

    :cond_7
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_4
    throw p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public I()LBh/e;
    .locals 2

    iget-object v0, p0, Lpi/u;->d:LBh/e;

    if-nez v0, :cond_0

    const/4 v1, 0x5

    invoke-static {v1}, Lpi/u;->H(I)V

    :cond_0
    return-object v0
.end method

.method public bridge synthetic c()LBh/h;
    .locals 1

    invoke-virtual {p0}, Lpi/u;->I()LBh/e;

    move-result-object v0

    return-object v0
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public getParameters()Ljava/util/List;
    .locals 2

    iget-object v0, p0, Lpi/u;->e:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v1, 0x4

    invoke-static {v1}, Lpi/u;->H(I)V

    :cond_0
    return-object v0
.end method

.method protected r()Ljava/util/Collection;
    .locals 2

    iget-object v0, p0, Lpi/u;->f:Ljava/util/Collection;

    if-nez v0, :cond_0

    const/4 v1, 0x6

    invoke-static {v1}, Lpi/u;->H(I)V

    :cond_0
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpi/u;->d:LBh/e;

    invoke-static {v0}, Lbi/i;->m(LBh/m;)LZh/d;

    move-result-object v0

    invoke-virtual {v0}, LZh/d;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected v()LBh/j0;
    .locals 2

    sget-object v0, LBh/j0$a;->a:LBh/j0$a;

    if-nez v0, :cond_0

    const/4 v1, 0x7

    invoke-static {v1}, Lpi/u;->H(I)V

    :cond_0
    return-object v0
.end method
