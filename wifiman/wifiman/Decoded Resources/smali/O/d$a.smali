.class final LO/d$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO/d;->a(Landroidx/compose/ui/e;LO/g;Z)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LO/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LO/d$a;

    invoke-direct {v0}, LO/d$a;-><init>()V

    sput-object v0, LO/d$a;->a:LO/d$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lo0/c;)V
    .locals 9

    sget-object v0, Lm0/u0;->a:Lm0/u0$a;

    invoke-virtual {v0}, Lm0/u0$a;->b()I

    move-result v6

    invoke-interface {p1}, Lo0/f;->k1()Lo0/d;

    move-result-object v0

    invoke-interface {v0}, Lo0/d;->c()J

    move-result-wide v7

    invoke-interface {v0}, Lo0/d;->d()Lm0/n0;

    move-result-object v1

    invoke-interface {v1}, Lm0/n0;->j()V

    :try_start_0
    invoke-interface {v0}, Lo0/d;->e()Lo0/h;

    move-result-object v1

    const v2, -0x800001

    const/4 v3, 0x0

    const v4, 0x7f7fffff    # Float.MAX_VALUE

    const v5, 0x7f7fffff    # Float.MAX_VALUE

    invoke-interface/range {v1 .. v6}, Lo0/h;->b(FFFFI)V

    invoke-interface {p1}, Lo0/c;->X1()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Lo0/d;->d()Lm0/n0;

    move-result-object p1

    invoke-interface {p1}, Lm0/n0;->r()V

    invoke-interface {v0, v7, v8}, Lo0/d;->f(J)V

    return-void

    :catchall_0
    move-exception p1

    invoke-interface {v0}, Lo0/d;->d()Lm0/n0;

    move-result-object v1

    invoke-interface {v1}, Lm0/n0;->r()V

    invoke-interface {v0, v7, v8}, Lo0/d;->f(J)V

    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo0/c;

    invoke-virtual {p0, p1}, LO/d$a;->a(Lo0/c;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
