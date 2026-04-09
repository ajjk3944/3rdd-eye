.class public final LF/e0$c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/y;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/e0$c;->a(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final synthetic a:Lw/y;

.field private final b:LT/z1;

.field private final c:LT/z1;


# direct methods
.method constructor <init>(Lw/y;LF/f0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF/e0$c$b;->a:Lw/y;

    new-instance p1, LF/e0$c$b$b;

    invoke-direct {p1, p2}, LF/e0$c$b$b;-><init>(LF/f0;)V

    invoke-static {p1}, LT/o1;->e(Lmh/a;)LT/z1;

    move-result-object p1

    iput-object p1, p0, LF/e0$c$b;->b:LT/z1;

    new-instance p1, LF/e0$c$b$a;

    invoke-direct {p1, p2}, LF/e0$c$b$a;-><init>(LF/f0;)V

    invoke-static {p1}, LT/o1;->e(Lmh/a;)LT/z1;

    move-result-object p1

    iput-object p1, p0, LF/e0$c$b;->c:LT/z1;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, LF/e0$c$b;->a:Lw/y;

    invoke-interface {v0}, Lw/y;->a()Z

    move-result v0

    return v0
.end method

.method public c(Ls/L;Lmh/p;Ldh/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LF/e0$c$b;->a:Lw/y;

    invoke-interface {v0, p1, p2, p3}, Lw/y;->c(Ls/L;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, LF/e0$c$b;->c:LT/z1;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, LF/e0$c$b;->b:LT/z1;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public f(F)F
    .locals 1

    iget-object v0, p0, LF/e0$c$b;->a:Lw/y;

    invoke-interface {v0, p1}, Lw/y;->f(F)F

    move-result p1

    return p1
.end method
