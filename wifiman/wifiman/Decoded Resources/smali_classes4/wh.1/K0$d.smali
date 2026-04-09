.class public abstract Lwh/K0$d;
.super Lwh/K0$a;
.source "SourceFile"

# interfaces
.implements Lth/h$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwh/K0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "d"
.end annotation


# static fields
.field static final synthetic i:[Lth/l;


# instance fields
.field private final g:Lwh/a1$a;

.field private final h:LYg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, Lwh/K0$d;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v1

    const-string v2, "descriptor"

    const-string v3, "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;"

    invoke-direct {v0, v1, v2, v3}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lth/l;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, Lwh/K0$d;->i:[Lth/l;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lwh/K0$a;-><init>()V

    new-instance v0, Lwh/N0;

    invoke-direct {v0, p0}, Lwh/N0;-><init>(Lwh/K0$d;)V

    invoke-static {v0}, Lwh/a1;->c(Lmh/a;)Lwh/a1$a;

    move-result-object v0

    iput-object v0, p0, Lwh/K0$d;->g:Lwh/a1$a;

    sget-object v0, LYg/q;->PUBLICATION:LYg/q;

    new-instance v1, Lwh/O0;

    invoke-direct {v1, p0}, Lwh/O0;-><init>(Lwh/K0$d;)V

    invoke-static {v0, v1}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object v0

    iput-object v0, p0, Lwh/K0$d;->h:LYg/m;

    return-void
.end method

.method static synthetic f0(Lwh/K0$d;)LBh/a0;
    .locals 0

    invoke-static {p0}, Lwh/K0$d;->i0(Lwh/K0$d;)LBh/a0;

    move-result-object p0

    return-object p0
.end method

.method static synthetic g0(Lwh/K0$d;)Lxh/h;
    .locals 0

    invoke-static {p0}, Lwh/K0$d;->h0(Lwh/K0$d;)Lxh/h;

    move-result-object p0

    return-object p0
.end method

.method private static final h0(Lwh/K0$d;)Lxh/h;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lwh/P0;->a(Lwh/K0$a;Z)Lxh/h;

    move-result-object p0

    return-object p0
.end method

.method private static final i0(Lwh/K0$d;)LBh/a0;
    .locals 2

    invoke-virtual {p0}, Lwh/K0$a;->e0()Lwh/K0;

    move-result-object v0

    invoke-virtual {v0}, Lwh/K0;->k0()LBh/Y;

    move-result-object v0

    invoke-interface {v0}, LBh/Y;->g()LBh/a0;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lwh/K0$a;->e0()Lwh/K0;

    move-result-object p0

    invoke-virtual {p0}, Lwh/K0;->k0()LBh/Y;

    move-result-object p0

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v1

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v0

    invoke-static {p0, v1, v0}, Lbi/h;->e(LBh/Y;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)LDh/M;

    move-result-object v0

    const-string p0, "createDefaultSetter(...)"

    invoke-static {v0, p0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method


# virtual methods
.method public V()Lxh/h;
    .locals 1

    iget-object v0, p0, Lwh/K0$d;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxh/h;

    return-object v0
.end method

.method public bridge synthetic Y()LBh/b;
    .locals 1

    invoke-virtual {p0}, Lwh/K0$d;->j0()LBh/a0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d0()LBh/X;
    .locals 1

    invoke-virtual {p0}, Lwh/K0$d;->j0()LBh/a0;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lwh/K0$d;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lwh/K0$a;->e0()Lwh/K0;

    move-result-object v0

    check-cast p1, Lwh/K0$d;

    invoke-virtual {p1}, Lwh/K0$a;->e0()Lwh/K0;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public getName()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "<set-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lwh/K0$a;->e0()Lwh/K0;

    move-result-object v1

    invoke-virtual {v1}, Lwh/K0;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, Lwh/K0$a;->e0()Lwh/K0;

    move-result-object v0

    invoke-virtual {v0}, Lwh/K0;->hashCode()I

    move-result v0

    return v0
.end method

.method public j0()LBh/a0;
    .locals 3

    iget-object v0, p0, Lwh/K0$d;->g:Lwh/a1$a;

    sget-object v1, Lwh/K0$d;->i:[Lth/l;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lwh/a1$b;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LBh/a0;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setter of "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lwh/K0$a;->e0()Lwh/K0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
