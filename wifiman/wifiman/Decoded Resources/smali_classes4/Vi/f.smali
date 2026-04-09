.class public final LVi/f;
.super LZi/b;
.source "SourceFile"


# instance fields
.field private final a:Lth/d;

.field private b:Ljava/util/List;

.field private final c:LYg/m;


# direct methods
.method public constructor <init>(Lth/d;)V
    .locals 1

    const-string v0, "baseClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, LZi/b;-><init>()V

    iput-object p1, p0, LVi/f;->a:Lth/d;

    .line 2
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LVi/f;->b:Ljava/util/List;

    .line 3
    sget-object p1, LYg/q;->PUBLICATION:LYg/q;

    new-instance v0, LVi/d;

    invoke-direct {v0, p0}, LVi/d;-><init>(LVi/f;)V

    invoke-static {p1, v0}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LVi/f;->c:LYg/m;

    return-void
.end method

.method public constructor <init>(Lth/d;[Ljava/lang/annotation/Annotation;)V
    .locals 1

    const-string v0, "baseClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "classAnnotations"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0, p1}, LVi/f;-><init>(Lth/d;)V

    .line 5
    invoke-static {p2}, LZg/n;->e([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LVi/f;->b:Ljava/util/List;

    return-void
.end method

.method public static synthetic l(LVi/f;)LXi/f;
    .locals 0

    invoke-static {p0}, LVi/f;->n(LVi/f;)LXi/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(LVi/f;LXi/a;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LVi/f;->o(LVi/f;LXi/a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final n(LVi/f;)LXi/f;
    .locals 4

    sget-object v0, LXi/d$a;->a:LXi/d$a;

    const/4 v1, 0x0

    new-array v1, v1, [LXi/f;

    new-instance v2, LVi/e;

    invoke-direct {v2, p0}, LVi/e;-><init>(LVi/f;)V

    const-string v3, "kotlinx.serialization.Polymorphic"

    invoke-static {v3, v0, v1, v2}, LXi/l;->d(Ljava/lang/String;LXi/m;[LXi/f;Lmh/l;)LXi/f;

    move-result-object v0

    invoke-virtual {p0}, LVi/f;->k()Lth/d;

    move-result-object p0

    invoke-static {v0, p0}, LXi/b;->c(LXi/f;Lth/d;)LXi/f;

    move-result-object p0

    return-object p0
.end method

.method private static final o(LVi/f;LXi/a;)LYg/J;
    .locals 13

    const-string v0, "$this$buildSerialDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/jvm/internal/U;->a:Lkotlin/jvm/internal/U;

    invoke-static {v0}, LWi/a;->K(Lkotlin/jvm/internal/U;)LVi/b;

    move-result-object v0

    invoke-interface {v0}, LVi/b;->a()LXi/f;

    move-result-object v2

    const/16 v5, 0xc

    const/4 v6, 0x0

    const-string v1, "type"

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, LXi/a;->b(LXi/a;Ljava/lang/String;LXi/f;Ljava/util/List;ZILjava/lang/Object;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "kotlinx.serialization.Polymorphic<"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LVi/f;->k()Lth/d;

    move-result-object v1

    invoke-interface {v1}, Lth/d;->v()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    sget-object v8, LXi/m$a;->a:LXi/m$a;

    const/4 v0, 0x0

    new-array v9, v0, [LXi/f;

    const/16 v11, 0x8

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, LXi/l;->e(Ljava/lang/String;LXi/m;[LXi/f;Lmh/l;ILjava/lang/Object;)LXi/f;

    move-result-object v2

    const-string v1, "value"

    move-object v0, p1

    invoke-static/range {v0 .. v6}, LXi/a;->b(LXi/a;Ljava/lang/String;LXi/f;Ljava/util/List;ZILjava/lang/Object;)V

    iget-object v0, p0, LVi/f;->b:Ljava/util/List;

    invoke-virtual {p1, v0}, LXi/a;->h(Ljava/util/List;)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method


# virtual methods
.method public a()LXi/f;
    .locals 1

    iget-object v0, p0, LVi/f;->c:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LXi/f;

    return-object v0
.end method

.method public k()Lth/d;
    .locals 1

    iget-object v0, p0, LVi/f;->a:Lth/d;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "kotlinx.serialization.PolymorphicSerializer(baseClass: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LVi/f;->k()Lth/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
