.class public final LN/H;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN/H$a;
    }
.end annotation


# static fields
.field public static final c:LN/H$a;


# instance fields
.field private final a:LN/b;

.field private b:LY0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LN/H$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LN/H$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LN/H;->c:LN/H$a;

    return-void
.end method

.method public constructor <init>(LN/I;Lmh/l;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LN/G;->e()Lr/r0;

    move-result-object v4

    new-instance v6, LN/b;

    new-instance v2, LN/H$b;

    invoke-direct {v2, p0}, LN/H$b;-><init>(LN/H;)V

    new-instance v3, LN/H$c;

    invoke-direct {v3, p0}, LN/H$c;-><init>(LN/H;)V

    move-object v0, v6

    move-object v1, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, LN/b;-><init>(Ljava/lang/Object;Lmh/l;Lmh/a;Lr/i;Lmh/l;)V

    iput-object v6, p0, LN/H;->a:LN/b;

    return-void
.end method

.method public static final synthetic a(LN/H;)LY0/d;
    .locals 0

    invoke-direct {p0}, LN/H;->f()LY0/d;

    move-result-object p0

    return-object p0
.end method

.method private final f()LY0/d;
    .locals 2

    iget-object v0, p0, LN/H;->b:LY0/d;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "The density on DrawerState ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ") was not set. Did you use DrawerState with the Drawer composable?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final b(Ldh/e;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, LN/H;->a:LN/b;

    sget-object v1, LN/I;->Closed:LN/I;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v3, p1

    invoke-static/range {v0 .. v5}, Landroidx/compose/material/a;->g(LN/b;Ljava/lang/Object;FLdh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final c()LN/b;
    .locals 1

    iget-object v0, p0, LN/H;->a:LN/b;

    return-object v0
.end method

.method public final d()LN/I;
    .locals 1

    iget-object v0, p0, LN/H;->a:LN/b;

    invoke-virtual {v0}, LN/b;->s()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LN/I;

    return-object v0
.end method

.method public final e()Z
    .locals 2

    invoke-virtual {p0}, LN/H;->d()LN/I;

    move-result-object v0

    sget-object v1, LN/I;->Open:LN/I;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final g()F
    .locals 1

    iget-object v0, p0, LN/H;->a:LN/b;

    invoke-virtual {v0}, LN/b;->A()F

    move-result v0

    return v0
.end method

.method public final h(LY0/d;)V
    .locals 0

    iput-object p1, p0, LN/H;->b:LY0/d;

    return-void
.end method
