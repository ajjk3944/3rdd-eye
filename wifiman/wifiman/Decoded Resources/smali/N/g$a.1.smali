.class final LN/g$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/g;->a(Lmh/a;Landroidx/compose/ui/e;ZLy/m;LN/f;Lm0/i1;Ls/g;LN/d;Lz/N;Lmh/q;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LN/g$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN/g$a;

    invoke-direct {v0}, LN/g$a;-><init>()V

    sput-object v0, LN/g$a;->a:LN/g$a;

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

    sget-object v0, LJ0/g;->b:LJ0/g$a;

    invoke-virtual {v0}, LJ0/g$a;->a()I

    move-result v0

    invoke-static {p1, v0}, LJ0/t;->i0(LJ0/w;I)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LJ0/w;

    invoke-virtual {p0, p1}, LN/g$a;->a(LJ0/w;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
