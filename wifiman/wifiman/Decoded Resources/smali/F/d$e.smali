.class final LF/d$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/d;->b(LH/l;Landroidx/compose/ui/e;ZLH/b;LL0/U;LF/D;LH/d;Lmh/p;Ly/m;Lm0/l0;LH/j;ICLT/l;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LF/d$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF/d$e;

    invoke-direct {v0}, LF/d$e;-><init>()V

    sput-object v0, LF/d$e;->a:LF/d$e;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LJ0/w;)V
    .locals 3

    invoke-static {p1}, LJ0/t;->N(LJ0/w;)V

    sget-object v0, LF/d$e$a;->a:LF/d$e$a;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p1, v1, v0, v2, v1}, LJ0/t;->h(LJ0/w;Ljava/lang/String;Lmh/a;ILjava/lang/Object;)V

    sget-object v0, LF/d$e$b;->a:LF/d$e$b;

    invoke-static {p1, v1, v0, v2, v1}, LJ0/t;->j(LJ0/w;Ljava/lang/String;Lmh/a;ILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LJ0/w;

    invoke-virtual {p0, p1}, LF/d$e;->a(LJ0/w;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
