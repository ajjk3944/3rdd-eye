.class final Ls/Y$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls/Y;->a(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ls/Y$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls/Y$b;

    invoke-direct {v0}, Ls/Y$b;-><init>()V

    sput-object v0, Ls/Y$b;->a:Ls/Y$b;

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
    .locals 1

    sget-object v0, LJ0/f;->d:LJ0/f$a;

    invoke-virtual {v0}, LJ0/f$a;->a()LJ0/f;

    move-result-object v0

    invoke-static {p1, v0}, LJ0/t;->h0(LJ0/w;LJ0/f;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LJ0/w;

    invoke-virtual {p0, p1}, Ls/Y$b;->a(LJ0/w;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
