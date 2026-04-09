.class public final Ls/O;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls/S;


# static fields
.field public static final a:Ls/O;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls/O;

    invoke-direct {v0}, Ls/O;-><init>()V

    sput-object v0, Ls/O;->a:Ls/O;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(JLmh/p;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1, p2}, LY0/y;->b(J)LY0/y;

    move-result-object p1

    invoke-interface {p3, p1, p4}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public b(JILmh/l;)J
    .locals 0

    invoke-static {p1, p2}, Ll0/g;->d(J)Ll0/g;

    move-result-object p1

    invoke-interface {p4, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll0/g;

    invoke-virtual {p1}, Ll0/g;->v()J

    move-result-wide p1

    return-wide p1
.end method

.method public c()Landroidx/compose/ui/e;
    .locals 1

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    return-object v0
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
