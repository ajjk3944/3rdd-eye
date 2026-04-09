.class public final LSh/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lni/s;


# instance fields
.field private final b:Lgi/d;

.field private final c:Lgi/d;

.field private final d:Lli/y;

.field private final e:Z

.field private final f:Lni/r;

.field private final g:LSh/x;

.field private final h:Ljava/lang/String;


# direct methods
.method public constructor <init>(LSh/x;LUh/l;LWh/c;Lli/y;ZLni/r;)V
    .locals 10

    const-string v0, "kotlinClass"

    move-object v9, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "packageProto"

    move-object v4, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    move-object v5, p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "abiStability"

    move-object/from16 v8, p6

    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-interface {p1}, LSh/x;->b()LZh/b;

    move-result-object v0

    invoke-static {v0}, Lgi/d;->b(LZh/b;)Lgi/d;

    move-result-object v2

    const-string v0, "byClassId(...)"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-interface {p1}, LSh/x;->a()LTh/a;

    move-result-object v0

    invoke-virtual {v0}, LTh/a;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 13
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-lez v3, :cond_0

    invoke-static {v0}, Lgi/d;->d(Ljava/lang/String;)Lgi/d;

    move-result-object v1

    :cond_0
    move-object v3, v1

    move-object v1, p0

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move v7, p5

    move-object/from16 v8, p6

    move-object v9, p1

    .line 14
    invoke-direct/range {v1 .. v9}, LSh/r;-><init>(Lgi/d;Lgi/d;LUh/l;LWh/c;Lli/y;ZLni/r;LSh/x;)V

    return-void
.end method

.method public constructor <init>(Lgi/d;Lgi/d;LUh/l;LWh/c;Lli/y;ZLni/r;LSh/x;)V
    .locals 1

    const-string v0, "className"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "packageProto"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "abiStability"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LSh/r;->b:Lgi/d;

    .line 3
    iput-object p2, p0, LSh/r;->c:Lgi/d;

    .line 4
    iput-object p5, p0, LSh/r;->d:Lli/y;

    .line 5
    iput-boolean p6, p0, LSh/r;->e:Z

    .line 6
    iput-object p7, p0, LSh/r;->f:Lni/r;

    .line 7
    iput-object p8, p0, LSh/r;->g:LSh/x;

    .line 8
    sget-object p1, LXh/a;->m:Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;

    const-string p2, "packageModuleName"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, p1}, LWh/e;->a(Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-interface {p4, p1}, LWh/c;->getString(I)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    .line 9
    :cond_0
    const-string p1, "main"

    .line 10
    :cond_1
    iput-object p1, p0, LSh/r;->h:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()LBh/h0;
    .locals 2

    sget-object v0, LBh/h0;->a:LBh/h0;

    const-string v1, "NO_SOURCE_FILE"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Class \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LSh/r;->d()LZh/b;

    move-result-object v1

    invoke-virtual {v1}, LZh/b;->a()LZh/c;

    move-result-object v1

    invoke-virtual {v1}, LZh/c;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final d()LZh/b;
    .locals 3

    new-instance v0, LZh/b;

    invoke-virtual {p0}, LSh/r;->e()Lgi/d;

    move-result-object v1

    invoke-virtual {v1}, Lgi/d;->g()LZh/c;

    move-result-object v1

    const-string v2, "getPackageFqName(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LSh/r;->h()LZh/f;

    move-result-object v2

    invoke-direct {v0, v1, v2}, LZh/b;-><init>(LZh/c;LZh/f;)V

    return-object v0
.end method

.method public e()Lgi/d;
    .locals 1

    iget-object v0, p0, LSh/r;->b:Lgi/d;

    return-object v0
.end method

.method public f()Lgi/d;
    .locals 1

    iget-object v0, p0, LSh/r;->c:Lgi/d;

    return-object v0
.end method

.method public final g()LSh/x;
    .locals 1

    iget-object v0, p0, LSh/r;->g:LSh/x;

    return-object v0
.end method

.method public final h()LZh/f;
    .locals 4

    invoke-virtual {p0}, LSh/r;->e()Lgi/d;

    move-result-object v0

    invoke-virtual {v0}, Lgi/d;->f()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getInternalName(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/16 v3, 0x2f

    invoke-static {v0, v3, v1, v2, v1}, Lkotlin/text/t;->g1(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v0

    const-string v1, "identifier(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, LSh/r;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LSh/r;->e()Lgi/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
