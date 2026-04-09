.class public final LDc/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LDc/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LDc/p$a;,
        LDc/p$b;,
        LDc/p$c;,
        LDc/p$d;
    }
.end annotation


# static fields
.field public static final j:LDc/p$a;

.field static final synthetic k:[Lth/l;


# instance fields
.field private final b:LZc/f;

.field private final c:Lorg/kodein/di/DI;

.field private final d:LFg/a;

.field private final e:Lgg/i;

.field private final f:Lgg/i;

.field private final g:Lgg/b;

.field private final h:Lgg/i;

.field private final i:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lkotlin/jvm/internal/D;

    const-class v1, LDc/p;

    const-string v2, "engine"

    const-string v3, "<v#0>"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/D;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->g(Lkotlin/jvm/internal/C;)Lth/m;

    move-result-object v0

    new-instance v3, Lkotlin/jvm/internal/D;

    const-string v5, "<v#1>"

    invoke-direct {v3, v1, v2, v5, v4}, Lkotlin/jvm/internal/D;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->g(Lkotlin/jvm/internal/C;)Lth/m;

    move-result-object v3

    new-instance v5, Lkotlin/jvm/internal/D;

    const-string v6, "<v#2>"

    invoke-direct {v5, v1, v2, v6, v4}, Lkotlin/jvm/internal/D;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v5}, Lkotlin/jvm/internal/O;->g(Lkotlin/jvm/internal/C;)Lth/m;

    move-result-object v5

    new-instance v6, Lkotlin/jvm/internal/D;

    const-string v7, "<v#3>"

    invoke-direct {v6, v1, v2, v7, v4}, Lkotlin/jvm/internal/D;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v6}, Lkotlin/jvm/internal/O;->g(Lkotlin/jvm/internal/C;)Lth/m;

    move-result-object v6

    new-instance v7, Lkotlin/jvm/internal/D;

    const-string v8, "<v#4>"

    invoke-direct {v7, v1, v2, v8, v4}, Lkotlin/jvm/internal/D;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v7}, Lkotlin/jvm/internal/O;->g(Lkotlin/jvm/internal/C;)Lth/m;

    move-result-object v1

    const/4 v2, 0x5

    new-array v2, v2, [Lth/l;

    aput-object v0, v2, v4

    const/4 v0, 0x1

    aput-object v3, v2, v0

    const/4 v0, 0x2

    aput-object v5, v2, v0

    const/4 v0, 0x3

    aput-object v6, v2, v0

    const/4 v0, 0x4

    aput-object v1, v2, v0

    sput-object v2, LDc/p;->k:[Lth/l;

    new-instance v0, LDc/p$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LDc/p$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LDc/p;->j:LDc/p$a;

    return-void
.end method

.method public constructor <init>(LZc/f;Lorg/kodein/di/DI;)V
    .locals 3

    const-string v0, "networkConnectionManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kodein"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDc/p;->b:LZc/f;

    iput-object p2, p0, LDc/p;->c:Lorg/kodein/di/DI;

    sget-object p1, LYg/J;->a:LYg/J;

    invoke-static {p1}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p1

    const-string p2, "createDefault(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LDc/p;->d:LFg/a;

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p1, p2, v0, v1}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    sget-object p2, LDc/p$i;->a:LDc/p$i;

    invoke-virtual {p1, p2}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    new-instance p2, LDc/p$j;

    invoke-direct {p2, p0}, LDc/p$j;-><init>(LDc/p;)V

    invoke-virtual {p1, p2}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    sget-object p2, LDc/p$k;->a:LDc/p$k;

    invoke-virtual {p1, p2}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v1}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LDc/p;->e:Lgg/i;

    new-instance v0, LDc/p$h;

    invoke-direct {v0, p0}, LDc/p$h;-><init>(LDc/p;)V

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v1}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LDc/p;->f:Lgg/i;

    sget-object v0, LDc/p$f;->a:LDc/p$f;

    invoke-virtual {p1, v0}, Lgg/i;->L1(Lkg/n;)Lgg/b;

    move-result-object v0

    sget-object v2, LDc/p$g;->a:LDc/p$g;

    invoke-virtual {v0, v2}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object v0

    new-instance v2, LDc/o;

    invoke-direct {v2}, LDc/o;-><init>()V

    invoke-virtual {v0, v2}, Lgg/b;->y(Lkg/a;)Lgg/b;

    move-result-object v0

    invoke-virtual {v0}, Lgg/b;->c0()Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->h1()Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->E0()Lgg/b;

    move-result-object v0

    const-string v2, "ignoreElements(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LDc/p;->g:Lgg/b;

    sget-object v0, LDc/p$L;->a:LDc/p$L;

    invoke-virtual {p1, v0}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    sget-object v2, LDc/p$M;->a:LDc/p$M;

    invoke-virtual {v0, v2}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0, v1}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v0

    invoke-static {v0, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LDc/p;->h:Lgg/i;

    sget-object v0, LDc/p$K;->a:LDc/p$K;

    invoke-virtual {p1, v0}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v1}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LDc/p;->i:Lgg/i;

    return-void
.end method

.method public static synthetic d()V
    .locals 0

    invoke-static {}, LDc/p;->i()V

    return-void
.end method

.method public static final synthetic e(LDc/p;)Lorg/kodein/di/DI;
    .locals 0

    iget-object p0, p0, LDc/p;->c:Lorg/kodein/di/DI;

    return-object p0
.end method

.method public static final synthetic f(LDc/p;)LZc/f;
    .locals 0

    iget-object p0, p0, LDc/p;->b:LZc/f;

    return-object p0
.end method

.method public static final synthetic g(LDc/p;)LFg/a;
    .locals 0

    iget-object p0, p0, LDc/p;->d:LFg/a;

    return-object p0
.end method

.method public static final synthetic h(LDc/p;LDc/p$b$b;LEc/t$c;LDc/k;)LEc/t;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LDc/p;->j(LDc/p$b$b;LEc/t$c;LDc/k;)LEc/t;

    move-result-object p0

    return-object p0
.end method

.method private static final i()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "Discovery DISPOSED"

    invoke-static {v2, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method private final j(LDc/p$b$b;LEc/t$c;LDc/k;)LEc/t;
    .locals 5

    sget-object v0, LDc/p$d;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const-string v0, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    const/4 v1, 0x0

    packed-switch p2, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    iget-object p1, p0, LDc/p;->c:Lorg/kodein/di/DI;

    new-instance p2, LJc/a$a;

    invoke-direct {p2, p3}, LJc/a$a;-><init>(LDc/k;)V

    new-instance p3, Lorg/kodein/type/d;

    new-instance v2, LDc/p$z;

    invoke-direct {v2}, LDc/p$z;-><init>()V

    invoke-virtual {v2}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-static {v2}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, LJc/a$a;

    invoke-direct {p3, v2, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    new-instance v2, Lorg/kodein/type/d;

    new-instance v3, LDc/p$A;

    invoke-direct {v3}, LDc/p$A;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, LJc/a;

    invoke-direct {v2, v3, v0}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    new-instance v0, LDc/p$B;

    invoke-direct {v0, p2}, LDc/p$B;-><init>(Ljava/lang/Object;)V

    invoke-static {p1, p3, v2, v1, v0}, Lorg/kodein/di/d;->b(Lorg/kodein/di/c;Lorg/kodein/type/q;Lorg/kodein/type/q;Ljava/lang/Object;Lmh/a;)Lrj/x2;

    move-result-object p1

    sget-object p2, LDc/p;->k:[Lth/l;

    const/4 p3, 0x4

    aget-object p2, p2, p3

    invoke-interface {p1, v1, p2}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    invoke-static {p1}, LDc/p;->o(LYg/m;)LJc/a;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_1
    iget-object p1, p0, LDc/p;->c:Lorg/kodein/di/DI;

    new-instance p2, LQc/a$a;

    invoke-direct {p2, p3}, LQc/a$a;-><init>(LDc/k;)V

    new-instance p3, Lorg/kodein/type/d;

    new-instance v2, LDc/p$w;

    invoke-direct {v2}, LDc/p$w;-><init>()V

    invoke-virtual {v2}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-static {v2}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, LQc/a$a;

    invoke-direct {p3, v2, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    new-instance v2, Lorg/kodein/type/d;

    new-instance v3, LDc/p$x;

    invoke-direct {v3}, LDc/p$x;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, LQc/a;

    invoke-direct {v2, v3, v0}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    new-instance v0, LDc/p$y;

    invoke-direct {v0, p2}, LDc/p$y;-><init>(Ljava/lang/Object;)V

    invoke-static {p1, p3, v2, v1, v0}, Lorg/kodein/di/d;->b(Lorg/kodein/di/c;Lorg/kodein/type/q;Lorg/kodein/type/q;Ljava/lang/Object;Lmh/a;)Lrj/x2;

    move-result-object p1

    sget-object p2, LDc/p;->k:[Lth/l;

    const/4 p3, 0x3

    aget-object p2, p2, p3

    invoke-interface {p1, v1, p2}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    invoke-static {p1}, LDc/p;->n(LYg/m;)LQc/a;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_2
    iget-object p1, p0, LDc/p;->c:Lorg/kodein/di/DI;

    invoke-static {p1}, Lorg/kodein/di/d;->f(Lorg/kodein/di/c;)Lrj/m2;

    move-result-object p1

    invoke-interface {p1}, Lrj/n2;->g()Lrj/m2;

    move-result-object p1

    new-instance p2, Lorg/kodein/type/d;

    new-instance p3, LDc/p$u;

    invoke-direct {p3}, LDc/p$u;-><init>()V

    invoke-virtual {p3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object p3

    invoke-static {p3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, LRc/a;

    invoke-direct {p2, p3, v0}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p1, p2, v1}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LEc/t;

    goto/16 :goto_1

    :pswitch_3
    iget-object p1, p0, LDc/p;->c:Lorg/kodein/di/DI;

    invoke-static {p1}, Lorg/kodein/di/d;->f(Lorg/kodein/di/c;)Lrj/m2;

    move-result-object p1

    invoke-interface {p1}, Lrj/n2;->g()Lrj/m2;

    move-result-object p1

    new-instance p2, Lorg/kodein/type/d;

    new-instance p3, LDc/p$t;

    invoke-direct {p3}, LDc/p$t;-><init>()V

    invoke-virtual {p3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object p3

    invoke-static {p3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, LTc/a;

    invoke-direct {p2, p3, v0}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p1, p2, v1}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LEc/t;

    goto/16 :goto_1

    :pswitch_4
    iget-object p1, p0, LDc/p;->c:Lorg/kodein/di/DI;

    invoke-static {p1}, Lorg/kodein/di/d;->f(Lorg/kodein/di/c;)Lrj/m2;

    move-result-object p1

    invoke-interface {p1}, Lrj/n2;->g()Lrj/m2;

    move-result-object p1

    new-instance p2, Lorg/kodein/type/d;

    new-instance p3, LDc/p$s;

    invoke-direct {p3}, LDc/p$s;-><init>()V

    invoke-virtual {p3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object p3

    invoke-static {p3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, LLc/a;

    invoke-direct {p2, p3, v0}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p1, p2, v1}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LEc/t;

    goto/16 :goto_1

    :pswitch_5
    iget-object p1, p0, LDc/p;->c:Lorg/kodein/di/DI;

    invoke-static {p1}, Lorg/kodein/di/d;->f(Lorg/kodein/di/c;)Lrj/m2;

    move-result-object p1

    invoke-interface {p1}, Lrj/n2;->g()Lrj/m2;

    move-result-object p1

    new-instance p2, Lorg/kodein/type/d;

    new-instance p3, LDc/p$r;

    invoke-direct {p3}, LDc/p$r;-><init>()V

    invoke-virtual {p3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object p3

    invoke-static {p3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, LUc/e;

    invoke-direct {p2, p3, v0}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p1, p2, v1}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LEc/t;

    goto/16 :goto_1

    :pswitch_6
    iget-object p1, p0, LDc/p;->c:Lorg/kodein/di/DI;

    new-instance p2, LFc/a$a;

    invoke-direct {p2, p3}, LFc/a$a;-><init>(LDc/k;)V

    new-instance p3, Lorg/kodein/type/d;

    new-instance v2, LDc/p$o;

    invoke-direct {v2}, LDc/p$o;-><init>()V

    invoke-virtual {v2}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-static {v2}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, LFc/a$a;

    invoke-direct {p3, v2, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    new-instance v2, Lorg/kodein/type/d;

    new-instance v3, LDc/p$p;

    invoke-direct {v3}, LDc/p$p;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, LFc/a;

    invoke-direct {v2, v3, v0}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    new-instance v0, LDc/p$q;

    invoke-direct {v0, p2}, LDc/p$q;-><init>(Ljava/lang/Object;)V

    invoke-static {p1, p3, v2, v1, v0}, Lorg/kodein/di/d;->b(Lorg/kodein/di/c;Lorg/kodein/type/q;Lorg/kodein/type/q;Ljava/lang/Object;Lmh/a;)Lrj/x2;

    move-result-object p1

    sget-object p2, LDc/p;->k:[Lth/l;

    const/4 p3, 0x2

    aget-object p2, p2, p3

    invoke-interface {p1, v1, p2}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    invoke-static {p1}, LDc/p;->m(LYg/m;)LFc/a;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_7
    iget-object p1, p0, LDc/p;->c:Lorg/kodein/di/DI;

    invoke-static {p1}, Lorg/kodein/di/d;->f(Lorg/kodein/di/c;)Lrj/m2;

    move-result-object p1

    invoke-interface {p1}, Lrj/n2;->g()Lrj/m2;

    move-result-object p1

    new-instance p2, Lorg/kodein/type/d;

    new-instance p3, LDc/p$n;

    invoke-direct {p3}, LDc/p$n;-><init>()V

    invoke-virtual {p3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object p3

    invoke-static {p3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, LIc/a;

    invoke-direct {p2, p3, v0}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p1, p2, v1}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LEc/t;

    goto/16 :goto_1

    :pswitch_8
    iget-object p1, p0, LDc/p;->c:Lorg/kodein/di/DI;

    invoke-static {p1}, Lorg/kodein/di/d;->f(Lorg/kodein/di/c;)Lrj/m2;

    move-result-object p1

    invoke-interface {p1}, Lrj/n2;->g()Lrj/m2;

    move-result-object p1

    new-instance p2, Lorg/kodein/type/d;

    new-instance p3, LDc/p$m;

    invoke-direct {p3}, LDc/p$m;-><init>()V

    invoke-virtual {p3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object p3

    invoke-static {p3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, LMc/a;

    invoke-direct {p2, p3, v0}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p1, p2, v1}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LEc/t;

    goto/16 :goto_1

    :pswitch_9
    iget-object p1, p0, LDc/p;->c:Lorg/kodein/di/DI;

    invoke-static {p1}, Lorg/kodein/di/d;->f(Lorg/kodein/di/c;)Lrj/m2;

    move-result-object p1

    invoke-interface {p1}, Lrj/n2;->g()Lrj/m2;

    move-result-object p1

    new-instance p2, Lorg/kodein/type/d;

    new-instance p3, LDc/p$l;

    invoke-direct {p3}, LDc/p$l;-><init>()V

    invoke-virtual {p3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object p3

    invoke-static {p3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lcom/ui/wifiman/model/discovery/engine/snmp/a;

    invoke-direct {p2, p3, v0}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p1, p2, v1}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LEc/t;

    goto/16 :goto_1

    :pswitch_a
    iget-object p1, p0, LDc/p;->c:Lorg/kodein/di/DI;

    new-instance p2, LNc/b$a;

    invoke-direct {p2, p3}, LNc/b$a;-><init>(LDc/k;)V

    new-instance p3, Lorg/kodein/type/d;

    new-instance v2, LDc/p$H;

    invoke-direct {v2}, LDc/p$H;-><init>()V

    invoke-virtual {v2}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-static {v2}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, LNc/b$a;

    invoke-direct {p3, v2, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    new-instance v2, Lorg/kodein/type/d;

    new-instance v3, LDc/p$I;

    invoke-direct {v3}, LDc/p$I;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, LNc/b;

    invoke-direct {v2, v3, v0}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    new-instance v0, LDc/p$J;

    invoke-direct {v0, p2}, LDc/p$J;-><init>(Ljava/lang/Object;)V

    invoke-static {p1, p3, v2, v1, v0}, Lorg/kodein/di/d;->b(Lorg/kodein/di/c;Lorg/kodein/type/q;Lorg/kodein/type/q;Ljava/lang/Object;Lmh/a;)Lrj/x2;

    move-result-object p1

    sget-object p2, LDc/p;->k:[Lth/l;

    const/4 p3, 0x1

    aget-object p2, p2, p3

    invoke-interface {p1, v1, p2}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    invoke-static {p1}, LDc/p;->l(LYg/m;)LNc/b;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_b
    iget-object p1, p0, LDc/p;->c:Lorg/kodein/di/DI;

    invoke-static {p1}, Lorg/kodein/di/d;->f(Lorg/kodein/di/c;)Lrj/m2;

    move-result-object p1

    invoke-interface {p1}, Lrj/n2;->g()Lrj/m2;

    move-result-object p1

    new-instance p2, Lorg/kodein/type/d;

    new-instance p3, LDc/p$G;

    invoke-direct {p3}, LDc/p$G;-><init>()V

    invoke-virtual {p3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object p3

    invoke-static {p3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lcom/ui/wifiman/model/discovery/engine/bonjour/a;

    invoke-direct {p2, p3, v0}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p1, p2, v1}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LEc/t;

    goto/16 :goto_1

    :pswitch_c
    iget-object p1, p0, LDc/p;->c:Lorg/kodein/di/DI;

    invoke-static {p1}, Lorg/kodein/di/d;->f(Lorg/kodein/di/c;)Lrj/m2;

    move-result-object p1

    invoke-interface {p1}, Lrj/n2;->g()Lrj/m2;

    move-result-object p1

    new-instance p2, Lorg/kodein/type/d;

    new-instance p3, LDc/p$F;

    invoke-direct {p3}, LDc/p$F;-><init>()V

    invoke-virtual {p3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object p3

    invoke-static {p3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, LGc/a;

    invoke-direct {p2, p3, v0}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p1, p2, v1}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LEc/t;

    goto/16 :goto_1

    :pswitch_d
    iget-object p1, p0, LDc/p;->c:Lorg/kodein/di/DI;

    invoke-static {p1}, Lorg/kodein/di/d;->f(Lorg/kodein/di/c;)Lrj/m2;

    move-result-object p1

    invoke-interface {p1}, Lrj/n2;->g()Lrj/m2;

    move-result-object p1

    new-instance p2, Lorg/kodein/type/d;

    new-instance p3, LDc/p$E;

    invoke-direct {p3}, LDc/p$E;-><init>()V

    invoke-virtual {p3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object p3

    invoke-static {p3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, LSc/b;

    invoke-direct {p2, p3, v0}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p1, p2, v1}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LEc/t;

    goto :goto_1

    :pswitch_e
    invoke-virtual {p1}, LDc/p$b$b;->a()LWc/a;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-object p2, p0, LDc/p;->c:Lorg/kodein/di/DI;

    new-instance p3, LKc/a$a;

    invoke-virtual {p1}, LDc/p$b$b;->a()LWc/a;

    move-result-object p1

    const/16 v2, 0x32

    const-wide/16 v3, 0x320

    invoke-direct {p3, p1, v2, v3, v4}, LKc/a$a;-><init>(LWc/a;IJ)V

    new-instance p1, Lorg/kodein/type/d;

    new-instance v2, LDc/p$v;

    invoke-direct {v2}, LDc/p$v;-><init>()V

    invoke-virtual {v2}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-static {v2}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, LKc/a$a;

    invoke-direct {p1, v2, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    new-instance v2, Lorg/kodein/type/d;

    new-instance v3, LDc/p$C;

    invoke-direct {v3}, LDc/p$C;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, LKc/a;

    invoke-direct {v2, v3, v0}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    new-instance v0, LDc/p$D;

    invoke-direct {v0, p3}, LDc/p$D;-><init>(Ljava/lang/Object;)V

    invoke-static {p2, p1, v2, v1, v0}, Lorg/kodein/di/d;->b(Lorg/kodein/di/c;Lorg/kodein/type/q;Lorg/kodein/type/q;Ljava/lang/Object;Lmh/a;)Lrj/x2;

    move-result-object p1

    sget-object p2, LDc/p;->k:[Lth/l;

    const/4 p3, 0x0

    aget-object p2, p2, p3

    invoke-interface {p1, v1, p2}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    invoke-static {p1}, LDc/p;->k(LYg/m;)LKc/a;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string p1, "ICMP discovery engine failed to create since CIDR is unavailable"

    const/4 p2, 0x6

    invoke-static {p1, v1, v1, p2, v1}, LZ7/b;->j(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    :goto_0
    move-object p1, v1

    :goto_1
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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

.method private static final k(LYg/m;)LKc/a;
    .locals 0

    invoke-interface {p0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LKc/a;

    return-object p0
.end method

.method private static final l(LYg/m;)LNc/b;
    .locals 0

    invoke-interface {p0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LNc/b;

    return-object p0
.end method

.method private static final m(LYg/m;)LFc/a;
    .locals 0

    invoke-interface {p0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LFc/a;

    return-object p0
.end method

.method private static final n(LYg/m;)LQc/a;
    .locals 0

    invoke-interface {p0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LQc/a;

    return-object p0
.end method

.method private static final o(LYg/m;)LJc/a;
    .locals 0

    invoke-interface {p0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LJc/a;

    return-object p0
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, LDc/p;->h:Lgg/i;

    return-object v0
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, LDc/p;->i:Lgg/i;

    return-object v0
.end method

.method public c()Lgg/b;
    .locals 1

    iget-object v0, p0, LDc/p;->g:Lgg/b;

    return-object v0
.end method

.method public clear()Lgg/b;
    .locals 2

    new-instance v0, LDc/p$e;

    invoke-direct {v0, p0}, LDc/p$e;-><init>(LDc/p;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object v0

    const-string v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
