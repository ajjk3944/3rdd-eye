.class public abstract LE0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LE0/d$a;

.field private static final b:Lmh/l;

.field private static final c:Lmh/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LE0/d$a;

    invoke-direct {v0}, LE0/d$a;-><init>()V

    sput-object v0, LE0/d;->a:LE0/d$a;

    sget-object v0, LE0/d$b;->a:LE0/d$b;

    sput-object v0, LE0/d;->b:Lmh/l;

    sget-object v0, LE0/d$c;->a:LE0/d$c;

    sput-object v0, LE0/d;->c:Lmh/l;

    return-void
.end method

.method public static final synthetic a()LE0/d$a;
    .locals 1

    sget-object v0, LE0/d;->a:LE0/d$a;

    return-object v0
.end method

.method public static final synthetic b()Lmh/l;
    .locals 1

    sget-object v0, LE0/d;->c:Lmh/l;

    return-object v0
.end method

.method public static final synthetic c(LE0/c;)Z
    .locals 0

    invoke-static {p0}, LE0/d;->d(LE0/c;)Z

    move-result p0

    return p0
.end method

.method private static final d(LE0/c;)Z
    .locals 1

    invoke-static {p0}, LE0/k;->m(LE0/j;)LE0/G;

    move-result-object p0

    invoke-virtual {p0}, LE0/G;->k0()LE0/a0;

    move-result-object p0

    invoke-virtual {p0}, LE0/a0;->o()Landroidx/compose/ui/e$c;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, LE0/y0;

    invoke-virtual {p0}, LE0/y0;->D2()Z

    move-result p0

    return p0
.end method
