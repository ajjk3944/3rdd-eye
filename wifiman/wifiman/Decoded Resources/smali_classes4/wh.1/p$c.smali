.class public final Lwh/p$c;
.super Lwh/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwh/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:LBh/Y;

.field private final b:LUh/n;

.field private final c:LXh/a$d;

.field private final d:LWh/c;

.field private final e:LWh/g;

.field private final f:Ljava/lang/String;


# direct methods
.method public constructor <init>(LBh/Y;LUh/n;LXh/a$d;LWh/c;LWh/g;)V
    .locals 7

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proto"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signature"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeTable"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lwh/p;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lwh/p$c;->a:LBh/Y;

    iput-object p2, p0, Lwh/p$c;->b:LUh/n;

    iput-object p3, p0, Lwh/p$c;->c:LXh/a$d;

    iput-object p4, p0, Lwh/p$c;->d:LWh/c;

    iput-object p5, p0, Lwh/p$c;->e:LWh/g;

    invoke-virtual {p3}, LXh/a$d;->M0()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3}, LXh/a$d;->q0()LXh/a$c;

    move-result-object p2

    invoke-virtual {p2}, LXh/a$c;->S()I

    move-result p2

    invoke-interface {p4, p2}, LWh/c;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, LXh/a$d;->q0()LXh/a$c;

    move-result-object p2

    invoke-virtual {p2}, LXh/a$c;->P()I

    move-result p2

    invoke-interface {p4, p2}, LWh/c;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object v0, LYh/i;->a:LYh/i;

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p2

    move-object v2, p4

    move-object v3, p5

    invoke-static/range {v0 .. v6}, LYh/i;->d(LYh/i;LUh/n;LWh/c;LWh/g;ZILjava/lang/Object;)LYh/d$a;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, LYh/d$a;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, LYh/d$a;->c()Ljava/lang/String;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, LJh/H;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lwh/p$c;->c()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "()"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lwh/p$c;->f:Ljava/lang/String;

    return-void

    :cond_1
    new-instance p2, Lwh/Y0;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "No field signature for property: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lwh/Y0;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private final c()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lwh/p$c;->a:LBh/Y;

    invoke-interface {v0}, LBh/r0;->b()LBh/m;

    move-result-object v0

    const-string v1, "getContainingDeclaration(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lwh/p$c;->a:LBh/Y;

    invoke-interface {v1}, LBh/C;->getVisibility()LBh/u;

    move-result-object v1

    sget-object v2, LBh/t;->d:LBh/u;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/16 v2, 0x24

    if-eqz v1, :cond_2

    instance-of v1, v0, Lni/m;

    if-eqz v1, :cond_2

    check-cast v0, Lni/m;

    invoke-virtual {v0}, Lni/m;->e1()LUh/c;

    move-result-object v0

    sget-object v1, LXh/a;->i:Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;

    const-string v3, "classModuleName"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1}, LWh/e;->a(Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lwh/p$c;->d:LWh/c;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-interface {v1, v0}, LWh/c;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    const-string v0, "main"

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {v0}, LZh/g;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_2
    iget-object v1, p0, Lwh/p$c;->a:LBh/Y;

    invoke-interface {v1}, LBh/C;->getVisibility()LBh/u;

    move-result-object v1

    sget-object v3, LBh/t;->a:LBh/u;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    instance-of v0, v0, LBh/M;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lwh/p$c;->a:LBh/Y;

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lni/N;

    invoke-virtual {v0}, Lni/N;->Z()Lni/s;

    move-result-object v0

    instance-of v1, v0, LSh/r;

    if-eqz v1, :cond_3

    check-cast v0, LSh/r;

    invoke-virtual {v0}, LSh/r;->f()Lgi/d;

    move-result-object v1

    if-eqz v1, :cond_3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, LSh/r;->h()LZh/f;

    move-result-object v0

    invoke-virtual {v0}, LZh/f;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_3
    const-string v0, ""

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lwh/p$c;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final b()LBh/Y;
    .locals 1

    iget-object v0, p0, Lwh/p$c;->a:LBh/Y;

    return-object v0
.end method

.method public final d()LWh/c;
    .locals 1

    iget-object v0, p0, Lwh/p$c;->d:LWh/c;

    return-object v0
.end method

.method public final e()LUh/n;
    .locals 1

    iget-object v0, p0, Lwh/p$c;->b:LUh/n;

    return-object v0
.end method

.method public final f()LXh/a$d;
    .locals 1

    iget-object v0, p0, Lwh/p$c;->c:LXh/a$d;

    return-object v0
.end method

.method public final g()LWh/g;
    .locals 1

    iget-object v0, p0, Lwh/p$c;->e:LWh/g;

    return-object v0
.end method
