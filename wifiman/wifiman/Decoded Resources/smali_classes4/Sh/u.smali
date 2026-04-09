.class final LSh/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LSh/t;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LSh/u$a;
    }
.end annotation


# static fields
.field public static final a:LSh/u;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LSh/u;

    invoke-direct {v0}, LSh/u;-><init>()V

    sput-object v0, LSh/u;->a:LSh/u;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p1, LSh/s;

    invoke-virtual {p0, p1}, LSh/u;->l(LSh/s;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LSh/u;->h(Ljava/lang/String;)LSh/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LSh/u;->i(Ljava/lang/String;)LSh/s$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LSh/s;

    invoke-virtual {p0, p1}, LSh/u;->g(LSh/s;)LSh/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LSh/u;->k()LSh/s;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic f(Lkotlin/reflect/jvm/internal/impl/builtins/l;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LSh/u;->j(Lkotlin/reflect/jvm/internal/impl/builtins/l;)LSh/s;

    move-result-object p1

    return-object p1
.end method

.method public g(LSh/s;)LSh/s;
    .locals 2

    const-string v0, "possiblyPrimitiveType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LSh/s$d;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LSh/s$d;

    invoke-virtual {v0}, LSh/s$d;->i()Lgi/e;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, LSh/s$d;->i()Lgi/e;

    move-result-object p1

    invoke-virtual {p1}, Lgi/e;->getWrapperFqName()LZh/c;

    move-result-object p1

    invoke-static {p1}, Lgi/d;->c(LZh/c;)Lgi/d;

    move-result-object p1

    invoke-virtual {p1}, Lgi/d;->f()Ljava/lang/String;

    move-result-object p1

    const-string v0, "getInternalName(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LSh/u;->i(Ljava/lang/String;)LSh/s$c;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public h(Ljava/lang/String;)LSh/s;
    .locals 8

    const-string v0, "representation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {}, Lgi/e;->values()[Lgi/e;

    move-result-object v2

    array-length v3, v2

    move v4, v0

    :goto_0
    const/4 v5, 0x0

    if-ge v4, v3, :cond_1

    aget-object v6, v2, v4

    invoke-virtual {v6}, Lgi/e;->getDesc()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, v0}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-ne v7, v1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    move-object v6, v5

    :goto_1
    if-eqz v6, :cond_2

    new-instance p1, LSh/s$d;

    invoke-direct {p1, v6}, LSh/s$d;-><init>(Lgi/e;)V

    return-object p1

    :cond_2
    const/16 v2, 0x56

    if-eq v1, v2, :cond_5

    const/16 v2, 0x5b

    const-string v3, "substring(...)"

    const/4 v4, 0x1

    if-eq v1, v2, :cond_4

    const/16 v2, 0x4c

    if-ne v1, v2, :cond_3

    const/16 v1, 0x3b

    const/4 v2, 0x2

    invoke-static {p1, v1, v0, v2, v5}, Lkotlin/text/t;->a0(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v0

    :cond_3
    new-instance v0, LSh/s$c;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v1, v4

    invoke-virtual {p1, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1}, LSh/s$c;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    new-instance v0, LSh/s$a;

    invoke-virtual {p1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LSh/u;->h(Ljava/lang/String;)LSh/s;

    move-result-object p1

    invoke-direct {v0, p1}, LSh/s$a;-><init>(LSh/s;)V

    goto :goto_2

    :cond_5
    new-instance v0, LSh/s$d;

    invoke-direct {v0, v5}, LSh/s$d;-><init>(Lgi/e;)V

    :goto_2
    return-object v0
.end method

.method public i(Ljava/lang/String;)LSh/s$c;
    .locals 1

    const-string v0, "internalName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LSh/s$c;

    invoke-direct {v0, p1}, LSh/s$c;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public j(Lkotlin/reflect/jvm/internal/impl/builtins/l;)LSh/s;
    .locals 1

    const-string v0, "primitiveType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LSh/u$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, LSh/s;->a:LSh/s$b;

    invoke-virtual {p1}, LSh/s$b;->d()LSh/s$d;

    move-result-object p1

    goto :goto_0

    :pswitch_1
    sget-object p1, LSh/s;->a:LSh/s$b;

    invoke-virtual {p1}, LSh/s$b;->g()LSh/s$d;

    move-result-object p1

    goto :goto_0

    :pswitch_2
    sget-object p1, LSh/s;->a:LSh/s$b;

    invoke-virtual {p1}, LSh/s$b;->e()LSh/s$d;

    move-result-object p1

    goto :goto_0

    :pswitch_3
    sget-object p1, LSh/s;->a:LSh/s$b;

    invoke-virtual {p1}, LSh/s$b;->f()LSh/s$d;

    move-result-object p1

    goto :goto_0

    :pswitch_4
    sget-object p1, LSh/s;->a:LSh/s$b;

    invoke-virtual {p1}, LSh/s$b;->h()LSh/s$d;

    move-result-object p1

    goto :goto_0

    :pswitch_5
    sget-object p1, LSh/s;->a:LSh/s$b;

    invoke-virtual {p1}, LSh/s$b;->b()LSh/s$d;

    move-result-object p1

    goto :goto_0

    :pswitch_6
    sget-object p1, LSh/s;->a:LSh/s$b;

    invoke-virtual {p1}, LSh/s$b;->c()LSh/s$d;

    move-result-object p1

    goto :goto_0

    :pswitch_7
    sget-object p1, LSh/s;->a:LSh/s$b;

    invoke-virtual {p1}, LSh/s$b;->a()LSh/s$d;

    move-result-object p1

    :goto_0
    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public k()LSh/s;
    .locals 1

    const-string v0, "java/lang/Class"

    invoke-virtual {p0, v0}, LSh/u;->i(Ljava/lang/String;)LSh/s$c;

    move-result-object v0

    return-object v0
.end method

.method public l(LSh/s;)Ljava/lang/String;
    .locals 2

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LSh/s$a;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    check-cast p1, LSh/s$a;

    invoke-virtual {p1}, LSh/s$a;->i()LSh/s;

    move-result-object p1

    invoke-virtual {p0, p1}, LSh/u;->l(LSh/s;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, LSh/s$d;

    if-eqz v0, :cond_2

    check-cast p1, LSh/s$d;

    invoke-virtual {p1}, LSh/s$d;->i()Lgi/e;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lgi/e;->getDesc()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_3

    :cond_1
    const-string p1, "V"

    goto :goto_0

    :cond_2
    instance-of v0, p1, LSh/s$c;

    if-eqz v0, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x4c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    check-cast p1, LSh/s$c;

    invoke-virtual {p1}, LSh/s$c;->i()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x3b

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_3
    :goto_0
    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
