.class public abstract Landroidx/compose/foundation/a;
.super LE0/m;
.source "SourceFile"

# interfaces
.implements LE0/s0;
.implements Lw0/e;
.implements Lk0/b;
.implements LE0/v0;
.implements LE0/A0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/a$a;
    }
.end annotation


# static fields
.field public static final H:Landroidx/compose/foundation/a$a;

.field public static final I:I


# instance fields
.field private A:Ly/o$b;

.field private B:Ly/g;

.field private final C:Ljava/util/Map;

.field private D:J

.field private E:Ly/m;

.field private F:Z

.field private final G:Ljava/lang/Object;

.field private p:Ly/m;

.field private q:Ls/I;

.field private r:Ljava/lang/String;

.field private s:LJ0/g;

.field private t:Z

.field private u:Lmh/a;

.field private final v:Z

.field private final w:Ls/x;

.field private final x:Ls/z;

.field private y:Ly0/S;

.field private z:LE0/j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/foundation/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/foundation/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/compose/foundation/a;->H:Landroidx/compose/foundation/a$a;

    const/16 v0, 0x8

    sput v0, Landroidx/compose/foundation/a;->I:I

    return-void
.end method

.method private constructor <init>(Ly/m;Ls/I;ZLjava/lang/String;LJ0/g;Lmh/a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, LE0/m;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/compose/foundation/a;->p:Ly/m;

    .line 4
    iput-object p2, p0, Landroidx/compose/foundation/a;->q:Ls/I;

    .line 5
    iput-object p4, p0, Landroidx/compose/foundation/a;->r:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Landroidx/compose/foundation/a;->s:LJ0/g;

    .line 7
    iput-boolean p3, p0, Landroidx/compose/foundation/a;->t:Z

    .line 8
    iput-object p6, p0, Landroidx/compose/foundation/a;->u:Lmh/a;

    .line 9
    new-instance p1, Ls/x;

    invoke-direct {p1}, Ls/x;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/a;->w:Ls/x;

    .line 10
    new-instance p1, Ls/z;

    iget-object p2, p0, Landroidx/compose/foundation/a;->p:Ly/m;

    invoke-direct {p1, p2}, Ls/z;-><init>(Ly/m;)V

    iput-object p1, p0, Landroidx/compose/foundation/a;->x:Ls/z;

    .line 11
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/a;->C:Ljava/util/Map;

    .line 12
    sget-object p1, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p1}, Ll0/g$a;->c()J

    move-result-wide p1

    iput-wide p1, p0, Landroidx/compose/foundation/a;->D:J

    .line 13
    iget-object p1, p0, Landroidx/compose/foundation/a;->p:Ly/m;

    iput-object p1, p0, Landroidx/compose/foundation/a;->E:Ly/m;

    .line 14
    invoke-direct {p0}, Landroidx/compose/foundation/a;->a3()Z

    move-result p1

    iput-boolean p1, p0, Landroidx/compose/foundation/a;->F:Z

    .line 15
    sget-object p1, Landroidx/compose/foundation/a;->H:Landroidx/compose/foundation/a$a;

    iput-object p1, p0, Landroidx/compose/foundation/a;->G:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ly/m;Ls/I;ZLjava/lang/String;LJ0/g;Lmh/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Landroidx/compose/foundation/a;-><init>(Ly/m;Ls/I;ZLjava/lang/String;LJ0/g;Lmh/a;)V

    return-void
.end method

.method public static final synthetic J2(Landroidx/compose/foundation/a;)Z
    .locals 0

    invoke-direct {p0}, Landroidx/compose/foundation/a;->R2()Z

    move-result p0

    return p0
.end method

.method public static final synthetic K2(Landroidx/compose/foundation/a;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/foundation/a;->T2()V

    return-void
.end method

.method public static final synthetic L2(Landroidx/compose/foundation/a;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/foundation/a;->U2()V

    return-void
.end method

.method public static final synthetic M2(Landroidx/compose/foundation/a;)Ly/m;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/a;->p:Ly/m;

    return-object p0
.end method

.method public static final synthetic N2(Landroidx/compose/foundation/a;)Ly/o$b;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/a;->A:Ly/o$b;

    return-object p0
.end method

.method public static final synthetic O2(Landroidx/compose/foundation/a;Ly/o$b;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/a;->A:Ly/o$b;

    return-void
.end method

.method private final R2()Z
    .locals 1

    invoke-static {p0}, Landroidx/compose/foundation/d;->i(LE0/A0;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Ls/k;->c(LE0/j;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private final T2()V
    .locals 8

    iget-object v0, p0, Landroidx/compose/foundation/a;->B:Ly/g;

    if-nez v0, :cond_1

    new-instance v0, Ly/g;

    invoke-direct {v0}, Ly/g;-><init>()V

    iget-object v1, p0, Landroidx/compose/foundation/a;->p:Ly/m;

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->d2()LIi/N;

    move-result-object v2

    new-instance v5, Landroidx/compose/foundation/a$c;

    const/4 v3, 0x0

    invoke-direct {v5, v1, v0, v3}, Landroidx/compose/foundation/a$c;-><init>(Ly/m;Ly/g;Ldh/e;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    :cond_0
    iput-object v0, p0, Landroidx/compose/foundation/a;->B:Ly/g;

    :cond_1
    return-void
.end method

.method private final U2()V
    .locals 9

    iget-object v0, p0, Landroidx/compose/foundation/a;->B:Ly/g;

    if-eqz v0, :cond_1

    new-instance v1, Ly/h;

    invoke-direct {v1, v0}, Ly/h;-><init>(Ly/g;)V

    iget-object v0, p0, Landroidx/compose/foundation/a;->p:Ly/m;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->d2()LIi/N;

    move-result-object v3

    new-instance v6, Landroidx/compose/foundation/a$d;

    invoke-direct {v6, v0, v1, v2}, Landroidx/compose/foundation/a$d;-><init>(Ly/m;Ly/h;Ldh/e;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    :cond_0
    iput-object v2, p0, Landroidx/compose/foundation/a;->B:Ly/g;

    :cond_1
    return-void
.end method

.method private final Y2()V
    .locals 3

    iget-object v0, p0, Landroidx/compose/foundation/a;->z:LE0/j;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/a;->q:Ls/I;

    if-eqz v0, :cond_2

    iget-object v1, p0, Landroidx/compose/foundation/a;->p:Ly/m;

    if-nez v1, :cond_1

    invoke-static {}, Ly/l;->a()Ly/m;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/foundation/a;->p:Ly/m;

    :cond_1
    iget-object v1, p0, Landroidx/compose/foundation/a;->x:Ls/z;

    iget-object v2, p0, Landroidx/compose/foundation/a;->p:Ly/m;

    invoke-virtual {v1, v2}, Ls/z;->J2(Ly/m;)V

    iget-object v1, p0, Landroidx/compose/foundation/a;->p:Ly/m;

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ls/I;->a(Ly/k;)LE0/j;

    move-result-object v0

    invoke-virtual {p0, v0}, LE0/m;->D2(LE0/j;)LE0/j;

    iput-object v0, p0, Landroidx/compose/foundation/a;->z:LE0/j;

    :cond_2
    return-void
.end method

.method private final a3()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/a;->E:Ly/m;

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/foundation/a;->q:Ls/I;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public final C0()V
    .locals 3

    iget-object v0, p0, Landroidx/compose/foundation/a;->p:Ly/m;

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/compose/foundation/a;->B:Ly/g;

    if-eqz v1, :cond_0

    new-instance v2, Ly/h;

    invoke-direct {v2, v1}, Ly/h;-><init>(Ly/g;)V

    invoke-interface {v0, v2}, Ly/m;->c(Ly/j;)Z

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/compose/foundation/a;->B:Ly/g;

    iget-object v0, p0, Landroidx/compose/foundation/a;->y:Ly0/S;

    if-eqz v0, :cond_1

    invoke-interface {v0}, LE0/s0;->C0()V

    :cond_1
    return-void
.end method

.method public final J1(Lk0/l;)V
    .locals 1

    invoke-interface {p1}, Lk0/l;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Landroidx/compose/foundation/a;->Y2()V

    :cond_0
    iget-boolean v0, p0, Landroidx/compose/foundation/a;->t:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/foundation/a;->x:Ls/z;

    invoke-virtual {v0, p1}, Ls/z;->J1(Lk0/l;)V

    :cond_1
    return-void
.end method

.method public P2(LJ0/w;)V
    .locals 0

    return-void
.end method

.method public final Q(Landroid/view/KeyEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public abstract Q2(Ly0/G;Ldh/e;)Ljava/lang/Object;
.end method

.method public final S1()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method protected final S2()V
    .locals 4

    iget-object v0, p0, Landroidx/compose/foundation/a;->p:Ly/m;

    if-eqz v0, :cond_2

    iget-object v1, p0, Landroidx/compose/foundation/a;->A:Ly/o$b;

    if-eqz v1, :cond_0

    new-instance v2, Ly/o$a;

    invoke-direct {v2, v1}, Ly/o$a;-><init>(Ly/o$b;)V

    invoke-interface {v0, v2}, Ly/m;->c(Ly/j;)Z

    :cond_0
    iget-object v1, p0, Landroidx/compose/foundation/a;->B:Ly/g;

    if-eqz v1, :cond_1

    new-instance v2, Ly/h;

    invoke-direct {v2, v1}, Ly/h;-><init>(Ly/g;)V

    invoke-interface {v0, v2}, Ly/m;->c(Ly/j;)Z

    :cond_1
    iget-object v1, p0, Landroidx/compose/foundation/a;->C:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly/o$b;

    new-instance v3, Ly/o$a;

    invoke-direct {v3, v2}, Ly/o$a;-><init>(Ly/o$b;)V

    invoke-interface {v0, v3}, Ly/m;->c(Ly/j;)Z

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/compose/foundation/a;->A:Ly/o$b;

    iput-object v0, p0, Landroidx/compose/foundation/a;->B:Ly/g;

    iget-object v0, p0, Landroidx/compose/foundation/a;->C:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method protected final V2()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/a;->t:Z

    return v0
.end method

.method public W()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/a;->G:Ljava/lang/Object;

    return-object v0
.end method

.method protected final W2()Lmh/a;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/a;->u:Lmh/a;

    return-object v0
.end method

.method protected final X2(Lw/r;JLdh/e;)Ljava/lang/Object;
    .locals 8

    iget-object v4, p0, Landroidx/compose/foundation/a;->p:Ly/m;

    if-eqz v4, :cond_0

    new-instance v7, Landroidx/compose/foundation/a$e;

    const/4 v6, 0x0

    move-object v0, v7

    move-object v1, p1

    move-wide v2, p2

    move-object v5, p0

    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/a$e;-><init>(Lw/r;JLy/m;Landroidx/compose/foundation/a;Ldh/e;)V

    invoke-static {v7, p4}, LIi/O;->g(Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method protected final Z2()LYg/J;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/a;->y:Ly0/S;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ly0/S;->Z1()V

    sget-object v0, LYg/J;->a:LYg/J;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method protected final b3(Ly/m;Ls/I;ZLjava/lang/String;LJ0/g;Lmh/a;)V
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/a;->E:Ly/m;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/foundation/a;->S2()V

    iput-object p1, p0, Landroidx/compose/foundation/a;->E:Ly/m;

    iput-object p1, p0, Landroidx/compose/foundation/a;->p:Ly/m;

    move p1, v1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Landroidx/compose/foundation/a;->q:Ls/I;

    invoke-static {v0, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iput-object p2, p0, Landroidx/compose/foundation/a;->q:Ls/I;

    move p1, v1

    :cond_1
    iget-boolean p2, p0, Landroidx/compose/foundation/a;->t:Z

    if-eq p2, p3, :cond_3

    if-eqz p3, :cond_2

    iget-object p2, p0, Landroidx/compose/foundation/a;->w:Ls/x;

    invoke-virtual {p0, p2}, LE0/m;->D2(LE0/j;)LE0/j;

    iget-object p2, p0, Landroidx/compose/foundation/a;->x:Ls/z;

    invoke-virtual {p0, p2}, LE0/m;->D2(LE0/j;)LE0/j;

    goto :goto_1

    :cond_2
    iget-object p2, p0, Landroidx/compose/foundation/a;->w:Ls/x;

    invoke-virtual {p0, p2}, LE0/m;->G2(LE0/j;)V

    iget-object p2, p0, Landroidx/compose/foundation/a;->x:Ls/z;

    invoke-virtual {p0, p2}, LE0/m;->G2(LE0/j;)V

    invoke-virtual {p0}, Landroidx/compose/foundation/a;->S2()V

    :goto_1
    invoke-static {p0}, LE0/w0;->b(LE0/v0;)V

    iput-boolean p3, p0, Landroidx/compose/foundation/a;->t:Z

    :cond_3
    iget-object p2, p0, Landroidx/compose/foundation/a;->r:Ljava/lang/String;

    invoke-static {p2, p4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    iput-object p4, p0, Landroidx/compose/foundation/a;->r:Ljava/lang/String;

    invoke-static {p0}, LE0/w0;->b(LE0/v0;)V

    :cond_4
    iget-object p2, p0, Landroidx/compose/foundation/a;->s:LJ0/g;

    invoke-static {p2, p5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_5

    iput-object p5, p0, Landroidx/compose/foundation/a;->s:LJ0/g;

    invoke-static {p0}, LE0/w0;->b(LE0/v0;)V

    :cond_5
    iput-object p6, p0, Landroidx/compose/foundation/a;->u:Lmh/a;

    iget-boolean p2, p0, Landroidx/compose/foundation/a;->F:Z

    invoke-direct {p0}, Landroidx/compose/foundation/a;->a3()Z

    move-result p3

    if-eq p2, p3, :cond_6

    invoke-direct {p0}, Landroidx/compose/foundation/a;->a3()Z

    move-result p2

    iput-boolean p2, p0, Landroidx/compose/foundation/a;->F:Z

    if-nez p2, :cond_6

    iget-object p2, p0, Landroidx/compose/foundation/a;->z:LE0/j;

    if-nez p2, :cond_6

    goto :goto_2

    :cond_6
    move v1, p1

    :goto_2
    if-eqz v1, :cond_9

    iget-object p1, p0, Landroidx/compose/foundation/a;->z:LE0/j;

    if-nez p1, :cond_7

    iget-boolean p2, p0, Landroidx/compose/foundation/a;->F:Z

    if-nez p2, :cond_9

    :cond_7
    if-eqz p1, :cond_8

    invoke-virtual {p0, p1}, LE0/m;->G2(LE0/j;)V

    :cond_8
    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/compose/foundation/a;->z:LE0/j;

    invoke-direct {p0}, Landroidx/compose/foundation/a;->Y2()V

    :cond_9
    iget-object p1, p0, Landroidx/compose/foundation/a;->x:Ls/z;

    iget-object p2, p0, Landroidx/compose/foundation/a;->p:Ly/m;

    invoke-virtual {p1, p2}, Ls/z;->J2(Ly/m;)V

    return-void
.end method

.method public final i2()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/a;->v:Z

    return v0
.end method

.method public final n2()V
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/a;->F:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, Landroidx/compose/foundation/a;->Y2()V

    :cond_0
    iget-boolean v0, p0, Landroidx/compose/foundation/a;->t:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/foundation/a;->w:Ls/x;

    invoke-virtual {p0, v0}, LE0/m;->D2(LE0/j;)LE0/j;

    iget-object v0, p0, Landroidx/compose/foundation/a;->x:Ls/z;

    invoke-virtual {p0, v0}, LE0/m;->D2(LE0/j;)LE0/j;

    :cond_1
    return-void
.end method

.method public final o2()V
    .locals 2

    invoke-virtual {p0}, Landroidx/compose/foundation/a;->S2()V

    iget-object v0, p0, Landroidx/compose/foundation/a;->E:Ly/m;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iput-object v1, p0, Landroidx/compose/foundation/a;->p:Ly/m;

    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/a;->z:LE0/j;

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, LE0/m;->G2(LE0/j;)V

    :cond_1
    iput-object v1, p0, Landroidx/compose/foundation/a;->z:LE0/j;

    return-void
.end method

.method public final q(LJ0/w;)V
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/a;->s:LJ0/g;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, LJ0/g;->n()I

    move-result v0

    invoke-static {p1, v0}, LJ0/t;->i0(LJ0/w;I)V

    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/a;->r:Ljava/lang/String;

    new-instance v1, Landroidx/compose/foundation/a$b;

    invoke-direct {v1, p0}, Landroidx/compose/foundation/a$b;-><init>(Landroidx/compose/foundation/a;)V

    invoke-static {p1, v0, v1}, LJ0/t;->z(LJ0/w;Ljava/lang/String;Lmh/a;)V

    iget-boolean v0, p0, Landroidx/compose/foundation/a;->t:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/foundation/a;->x:Ls/z;

    invoke-virtual {v0, p1}, Ls/z;->q(LJ0/w;)V

    goto :goto_0

    :cond_1
    invoke-static {p1}, LJ0/t;->l(LJ0/w;)V

    :goto_0
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/a;->P2(LJ0/w;)V

    return-void
.end method

.method public final r0(Landroid/view/KeyEvent;)Z
    .locals 10

    invoke-direct {p0}, Landroidx/compose/foundation/a;->Y2()V

    iget-boolean v0, p0, Landroidx/compose/foundation/a;->t:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    invoke-static {p1}, Ls/k;->f(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/foundation/a;->C:Ljava/util/Map;

    invoke-static {p1}, Lw0/d;->a(Landroid/view/KeyEvent;)J

    move-result-wide v4

    invoke-static {v4, v5}, Lw0/a;->m(J)Lw0/a;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    new-instance v0, Ly/o$b;

    iget-wide v4, p0, Landroidx/compose/foundation/a;->D:J

    invoke-direct {v0, v4, v5, v3}, Ly/o$b;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v1, p0, Landroidx/compose/foundation/a;->C:Ljava/util/Map;

    invoke-static {p1}, Lw0/d;->a(Landroid/view/KeyEvent;)J

    move-result-wide v4

    invoke-static {v4, v5}, Lw0/a;->m(J)Lw0/a;

    move-result-object p1

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Landroidx/compose/foundation/a;->p:Ly/m;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->d2()LIi/N;

    move-result-object v4

    new-instance v7, Landroidx/compose/foundation/a$f;

    invoke-direct {v7, p0, v0, v3}, Landroidx/compose/foundation/a$f;-><init>(Landroidx/compose/foundation/a;Ly/o$b;Ldh/e;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    :cond_0
    :goto_0
    move v1, v2

    goto :goto_1

    :cond_1
    iget-boolean v0, p0, Landroidx/compose/foundation/a;->t:Z

    if-eqz v0, :cond_3

    invoke-static {p1}, Ls/k;->b(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroidx/compose/foundation/a;->C:Ljava/util/Map;

    invoke-static {p1}, Lw0/d;->a(Landroid/view/KeyEvent;)J

    move-result-wide v4

    invoke-static {v4, v5}, Lw0/a;->m(J)Lw0/a;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly/o$b;

    if-eqz p1, :cond_2

    iget-object v0, p0, Landroidx/compose/foundation/a;->p:Ly/m;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->d2()LIi/N;

    move-result-object v4

    new-instance v7, Landroidx/compose/foundation/a$g;

    invoke-direct {v7, p0, p1, v3}, Landroidx/compose/foundation/a$g;-><init>(Landroidx/compose/foundation/a;Ly/o$b;Ldh/e;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    :cond_2
    iget-object p1, p0, Landroidx/compose/foundation/a;->u:Lmh/a;

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    goto :goto_0

    :cond_3
    :goto_1
    return v1
.end method

.method public final s0(Ly0/n;Ly0/p;J)V
    .locals 10

    invoke-static {p3, p4}, LY0/s;->b(J)J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/n;->h(J)I

    move-result v2

    int-to-float v2, v2

    invoke-static {v0, v1}, LY0/n;->i(J)I

    move-result v0

    int-to-float v0, v0

    invoke-static {v2, v0}, Ll0/h;->a(FF)J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/foundation/a;->D:J

    invoke-direct {p0}, Landroidx/compose/foundation/a;->Y2()V

    iget-boolean v0, p0, Landroidx/compose/foundation/a;->t:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    sget-object v0, Ly0/p;->Main:Ly0/p;

    if-ne p2, v0, :cond_1

    invoke-virtual {p1}, Ly0/n;->f()I

    move-result v0

    sget-object v2, Ly0/q;->a:Ly0/q$a;

    invoke-virtual {v2}, Ly0/q$a;->a()I

    move-result v3

    invoke-static {v0, v3}, Ly0/q;->i(II)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->d2()LIi/N;

    move-result-object v4

    new-instance v7, Landroidx/compose/foundation/a$h;

    invoke-direct {v7, p0, v1}, Landroidx/compose/foundation/a$h;-><init>(Landroidx/compose/foundation/a;Ldh/e;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ly0/q$a;->b()I

    move-result v2

    invoke-static {v0, v2}, Ly0/q;->i(II)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->d2()LIi/N;

    move-result-object v2

    new-instance v5, Landroidx/compose/foundation/a$i;

    invoke-direct {v5, p0, v1}, Landroidx/compose/foundation/a$i;-><init>(Landroidx/compose/foundation/a;Ldh/e;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/compose/foundation/a;->y:Ly0/S;

    if-nez v0, :cond_2

    new-instance v0, Landroidx/compose/foundation/a$j;

    invoke-direct {v0, p0, v1}, Landroidx/compose/foundation/a$j;-><init>(Landroidx/compose/foundation/a;Ldh/e;)V

    invoke-static {v0}, Ly0/P;->a(Lmh/p;)Ly0/S;

    move-result-object v0

    invoke-virtual {p0, v0}, LE0/m;->D2(LE0/j;)LE0/j;

    move-result-object v0

    check-cast v0, Ly0/S;

    iput-object v0, p0, Landroidx/compose/foundation/a;->y:Ly0/S;

    :cond_2
    iget-object v0, p0, Landroidx/compose/foundation/a;->y:Ly0/S;

    if-eqz v0, :cond_3

    invoke-interface {v0, p1, p2, p3, p4}, LE0/s0;->s0(Ly0/n;Ly0/p;J)V

    :cond_3
    return-void
.end method
